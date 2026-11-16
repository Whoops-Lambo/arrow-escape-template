package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoCompositorSettings;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.facebook.appevents.p;
import defpackage.b8;
import defpackage.d31;
import defpackage.ev1;
import defpackage.ol2;
import defpackage.ue0;
import defpackage.uu;
import defpackage.y32;
import defpackage.z21;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RestrictTo
@UnstableApi
public final class PlaybackVideoGraphWrapper implements VideoGraph.Listener {
    private static final Executor NO_OP_EXECUTOR = new b8(2);
    private static final int PRIMARY_SEQUENCE_INDEX = 0;
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 2;
    private static final String TAG = "PlaybackVidGraphWrapper";
    private final Clock clock;
    private d31 compositionEffects;
    private VideoCompositorSettings compositorSettings;
    private final Context context;

    @Nullable
    private Pair<Surface, Size> currentSurfaceAndSize;
    private final VideoSink defaultVideoSink;
    private final boolean enablePlaylistMode;
    private long finalFramePresentationTimeUs;
    private HandlerWrapper handler;
    private boolean hasSignaledEndOfVideoGraphOutputStream;
    private final SparseArray<InputVideoSink> inputVideoSinks;
    private boolean isInputSdrToneMapped;
    private long lastOutputFramePresentationTimeUs;
    private final CopyOnWriteArraySet<Listener> listeners;
    private int outputStreamFirstFrameReleaseInstruction;
    private long outputStreamStartPositionUs;
    private int pendingFlushCount;
    private TimedValueQueue<StreamChangeInfo> pendingStreamChanges;
    private int registeredVideoInputCount;
    private boolean requestOpenGlToneMapping;
    private int state;
    private int totalVideoInputCount;
    private final VideoSink.VideoFrameHandler videoFrameHandler;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private VideoGraph videoGraph;
    private final VideoGraph.Factory videoGraphFactory;
    private Format videoGraphOutputFormat;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        private boolean built;
        private Clock clock = Clock.DEFAULT;
        private final Context context;
        private boolean enablePlaylistMode;
        private boolean enableReplayableCache;
        private final VideoFrameReleaseControl videoFrameReleaseControl;
        private VideoGraph.Factory videoGraphFactory;

        public PlaybackVideoGraphWrapper build() {
            Assertions.checkState(!this.built);
            if (this.videoGraphFactory == null) {
                this.videoGraphFactory = new ReflectiveSingleInputVideoGraphFactory(this.enableReplayableCache);
            }
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = new PlaybackVideoGraphWrapper(this);
            this.built = true;
            return playbackVideoGraphWrapper;
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setEnablePlaylistMode(boolean z) {
            this.enablePlaylistMode = z;
            return this;
        }

        public Builder setEnableReplayableCache(boolean z) {
            this.enableReplayableCache = z;
            return this;
        }

        public Builder setVideoGraphFactory(VideoGraph.Factory factory) {
            this.videoGraphFactory = factory;
            return this;
        }

        public Builder(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
            this.context = context.getApplicationContext();
            this.videoFrameReleaseControl = videoFrameReleaseControl;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class DefaultVideoSinkListener implements VideoSink.Listener {
        private DefaultVideoSinkListener() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onError(VideoSink.VideoSinkException videoSinkException) {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onError(VideoFrameProcessingException.from(videoSinkException));
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onFirstFrameRendered() {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onFirstFrameRendered();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onFrameDropped() {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onFrameDropped();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onVideoSizeChanged(videoSize);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public final class InputVideoSink implements VideoSink, Listener {
        private long inputBufferTimestampAdjustmentUs;

        @Nullable
        private Format inputFormat;
        private final int inputIndex;
        private int inputType;
        private boolean isInitialized;
        private long lastFramePresentationTimeUs;
        private VideoSink.Listener listener;
        private Executor listenerExecutor;
        private boolean signaledEndOfStream;
        private d31 videoEffects;
        private final int videoFrameProcessorMaxPendingFrameCount;

        public InputVideoSink(Context context, int i) {
            this.inputIndex = i;
            this.videoFrameProcessorMaxPendingFrameCount = Util.getMaxPendingFramesCountForMediaCodecDecoders(context);
            z21 z21Var = d31.b;
            this.videoEffects = y32.e;
            this.lastFramePresentationTimeUs = -9223372036854775807L;
            this.listener = VideoSink.Listener.NO_OP;
            this.listenerExecutor = PlaybackVideoGraphWrapper.NO_OP_EXECUTOR;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$1(VideoSink.Listener listener, VideoFrameProcessingException videoFrameProcessingException) {
            listener.onError(new VideoSink.VideoSinkException(videoFrameProcessingException, (Format) Assertions.checkStateNotNull(this.inputFormat)));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void allowReleaseFirstFrameBeforeStarted() {
            if (PlaybackVideoGraphWrapper.this.pendingStreamChanges.size() == 0) {
                PlaybackVideoGraphWrapper.this.allowReleaseFirstFrameBeforeStarted();
                return;
            }
            TimedValueQueue timedValueQueue = new TimedValueQueue();
            boolean z = true;
            while (true) {
                int size = PlaybackVideoGraphWrapper.this.pendingStreamChanges.size();
                PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
                if (size <= 0) {
                    playbackVideoGraphWrapper.pendingStreamChanges = timedValueQueue;
                    return;
                }
                StreamChangeInfo streamChangeInfo = (StreamChangeInfo) Assertions.checkNotNull((StreamChangeInfo) playbackVideoGraphWrapper.pendingStreamChanges.pollFirst());
                if (z) {
                    int i = streamChangeInfo.firstFrameReleaseInstruction;
                    if (i == 0 || i == 1) {
                        streamChangeInfo = new StreamChangeInfo(streamChangeInfo.startPositionUs, 0, streamChangeInfo.fromTimestampUs);
                    } else {
                        PlaybackVideoGraphWrapper.this.allowReleaseFirstFrameBeforeStarted();
                    }
                    z = false;
                }
                timedValueQueue.add(streamChangeInfo.fromTimestampUs, streamChangeInfo);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void clearOutputSurfaceInfo() {
            PlaybackVideoGraphWrapper.this.clearOutputSurfaceInfo();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isInitialized() {
            return this.isInitialized;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isReady(boolean z) {
            return PlaybackVideoGraphWrapper.this.isReady(z && isInitialized());
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void join(boolean z) {
            if (PlaybackVideoGraphWrapper.this.enablePlaylistMode) {
                PlaybackVideoGraphWrapper.this.joinPlayback(z);
            }
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onError(final VideoFrameProcessingException videoFrameProcessingException) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onError$1(listener, videoFrameProcessingException);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFirstFrameRendered() {
            VideoSink.Listener listener = this.listener;
            Executor executor = this.listenerExecutor;
            Objects.requireNonNull(listener);
            executor.execute(new ev1(listener, 1));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFrameAvailableForRendering() {
            VideoSink.Listener listener = this.listener;
            Executor executor = this.listenerExecutor;
            Objects.requireNonNull(listener);
            executor.execute(new ev1(listener, 2));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFrameDropped() {
            VideoSink.Listener listener = this.listener;
            Executor executor = this.listenerExecutor;
            Objects.requireNonNull(listener);
            executor.execute(new ev1(listener, 0));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            this.listenerExecutor.execute(new d(this.listener, videoSize, 1));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            PlaybackVideoGraphWrapper.this.release();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void render(long j, long j2) throws VideoSink.VideoSinkException {
            PlaybackVideoGraphWrapper.this.render(j + this.inputBufferTimestampAdjustmentUs, j2);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setBufferTimestampAdjustmentUs(long j) {
            this.inputBufferTimestampAdjustmentUs = j;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setChangeFrameRateStrategy(int i) {
            if (this.inputIndex == 0) {
                PlaybackVideoGraphWrapper.this.setChangeFrameRateStrategy(i);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setListener(VideoSink.Listener listener, Executor executor) {
            this.listener = listener;
            this.listenerExecutor = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setOutputSurfaceInfo(Surface surface, Size size) {
            PlaybackVideoGraphWrapper.this.setOutputSurfaceInfo(surface, size);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setPlaybackSpeed(@FloatRange float f) {
            if (this.inputIndex == 0) {
                PlaybackVideoGraphWrapper.this.setPlaybackSpeed(f);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoEffects(List<Effect> list) {
            if (this.videoEffects.equals(list)) {
                return;
            }
            this.videoEffects = d31.A(list);
            Format format = this.inputFormat;
            if (format != null) {
                registerInputStream(format);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
            if (this.inputIndex == 0) {
                PlaybackVideoGraphWrapper.this.setVideoFrameMetadataListener(videoFrameMetadataListener);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void signalEndOfCurrentInputStream() {
            PlaybackVideoGraphWrapper.this.finalFramePresentationTimeUs = this.lastFramePresentationTimeUs;
            if (PlaybackVideoGraphWrapper.this.lastOutputFramePresentationTimeUs >= PlaybackVideoGraphWrapper.this.finalFramePresentationTimeUs) {
                PlaybackVideoGraphWrapper.this.signalEndOfVideoGraphOutputStream();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void signalEndOfInput() {
            if (!this.signaledEndOfStream && isInitialized()) {
                ((VideoGraph) Assertions.checkNotNull(PlaybackVideoGraphWrapper.this.videoGraph)).signalEndOfInput(this.inputIndex);
                this.signaledEndOfStream = true;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void startRendering() {
            if (PlaybackVideoGraphWrapper.this.enablePlaylistMode) {
                PlaybackVideoGraphWrapper.this.startRendering();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void stopRendering() {
            if (PlaybackVideoGraphWrapper.this.enablePlaylistMode) {
                PlaybackVideoGraphWrapper.this.stopRendering();
            }
        }

        private void registerInputStream(Format format) {
            Format formatBuild = format.buildUpon().setColorInfo(PlaybackVideoGraphWrapper.this.getAdjustedInputColorInfo(format.colorInfo)).build();
            int i = 1;
            if (this.inputType != 1) {
                i = 2;
            }
            ((VideoGraph) Assertions.checkNotNull(PlaybackVideoGraphWrapper.this.videoGraph)).registerInputStream(this.inputIndex, i, formatBuild, this.videoEffects, 0L);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void flush(boolean z) {
            if (isInitialized()) {
                ((VideoGraph) Assertions.checkNotNull(PlaybackVideoGraphWrapper.this.videoGraph)).flush();
            }
            this.lastFramePresentationTimeUs = -9223372036854775807L;
            PlaybackVideoGraphWrapper.this.flush(z);
            this.signaledEndOfStream = false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface getInputSurface() {
            Assertions.checkState(isInitialized());
            return ((VideoGraph) Assertions.checkNotNull(PlaybackVideoGraphWrapper.this.videoGraph)).getInputSurface(this.inputIndex);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean handleInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
            Assertions.checkState(isInitialized());
            boolean z = false;
            if (!PlaybackVideoGraphWrapper.this.shouldRenderToInputVideoSink()) {
                return false;
            }
            ShiftingTimestampIterator shiftingTimestampIterator = new ShiftingTimestampIterator(timestampIterator, this.inputBufferTimestampAdjustmentUs);
            if (!((VideoGraph) Assertions.checkNotNull(PlaybackVideoGraphWrapper.this.videoGraph)).queueInputBitmap(this.inputIndex, bitmap, shiftingTimestampIterator)) {
                return false;
            }
            long lastTimestampUs = shiftingTimestampIterator.getLastTimestampUs();
            if (lastTimestampUs != -9223372036854775807L) {
                z = true;
            }
            Assertions.checkState(z);
            this.lastFramePresentationTimeUs = lastTimestampUs;
            return true;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean handleInputFrame(long j, VideoSink.VideoFrameHandler videoFrameHandler) {
            Assertions.checkState(isInitialized());
            if (!PlaybackVideoGraphWrapper.this.shouldRenderToInputVideoSink() || ((VideoGraph) Assertions.checkNotNull(PlaybackVideoGraphWrapper.this.videoGraph)).getPendingInputFrameCount(this.inputIndex) >= this.videoFrameProcessorMaxPendingFrameCount || !((VideoGraph) Assertions.checkNotNull(PlaybackVideoGraphWrapper.this.videoGraph)).registerInputFrame(this.inputIndex)) {
                return false;
            }
            long j2 = j + this.inputBufferTimestampAdjustmentUs;
            this.lastFramePresentationTimeUs = j2;
            videoFrameHandler.render(j2 * 1000);
            return true;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean initialize(Format format) throws VideoSink.VideoSinkException {
            Assertions.checkState(!isInitialized());
            boolean zRegisterInput = PlaybackVideoGraphWrapper.this.registerInput(format, this.inputIndex);
            this.isInitialized = zRegisterInput;
            return zRegisterInput;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isEnded() {
            if (isInitialized() && PlaybackVideoGraphWrapper.this.isEnded()) {
                return true;
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onInputStreamChanged(int i, Format format, long j, int i2, List<Effect> list) {
            long j2;
            Assertions.checkState(isInitialized());
            this.videoEffects = d31.A(list);
            this.inputType = i;
            this.inputFormat = format;
            PlaybackVideoGraphWrapper.this.finalFramePresentationTimeUs = -9223372036854775807L;
            boolean z = false;
            PlaybackVideoGraphWrapper.this.hasSignaledEndOfVideoGraphOutputStream = false;
            registerInputStream(format);
            if (this.lastFramePresentationTimeUs == -9223372036854775807L) {
                z = true;
            }
            if (!PlaybackVideoGraphWrapper.this.enablePlaylistMode && (this.inputIndex != 0 || !z)) {
                return;
            }
            if (z) {
                j2 = -4611686018427387904L;
            } else {
                j2 = this.lastFramePresentationTimeUs + 1;
            }
            long j3 = j2;
            PlaybackVideoGraphWrapper.this.pendingStreamChanges.add(j3, new StreamChangeInfo(this.inputBufferTimestampAdjustmentUs + j, i2, j3));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void redraw() {
            if (isInitialized()) {
                boolean z = this.signaledEndOfStream;
                long j = PlaybackVideoGraphWrapper.this.lastOutputFramePresentationTimeUs;
                PlaybackVideoGraphWrapper.this.flush(false);
                ((VideoGraph) Assertions.checkNotNull(PlaybackVideoGraphWrapper.this.videoGraph)).redraw();
                PlaybackVideoGraphWrapper.this.lastOutputFramePresentationTimeUs = j;
                if (z) {
                    signalEndOfCurrentInputStream();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Listener {
        default void onError(VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void onFirstFrameRendered() {
        }

        default void onFrameAvailableForRendering() {
        }

        default void onFrameDropped() {
        }

        default void onVideoSizeChanged(VideoSize videoSize) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ReflectiveDefaultVideoFrameProcessorFactory implements VideoFrameProcessor.Factory {
        private static final ol2 DEFAULT_VIDEO_FRAME_PROCESSOR_FACTORY_BUILDER_CLASS = uu.F(new f());
        private final boolean enableReplayableCache;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Class lambda$static$0() {
            try {
                return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            } catch (Exception e) {
                p.g(e);
                return null;
            }
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Factory
        public VideoFrameProcessor create(Context context, DebugViewProvider debugViewProvider, ColorInfo colorInfo, boolean z, Executor executor, VideoFrameProcessor.Listener listener) throws VideoFrameProcessingException {
            try {
                Class cls = (Class) DEFAULT_VIDEO_FRAME_PROCESSOR_FACTORY_BUILDER_CLASS.get();
                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                cls.getMethod("setEnableReplayableCache", Boolean.TYPE).invoke(objNewInstance, Boolean.valueOf(this.enableReplayableCache));
                return ((VideoFrameProcessor.Factory) Assertions.checkNotNull(cls.getMethod("build", null).invoke(objNewInstance, null))).create(context, debugViewProvider, colorInfo, z, executor, listener);
            } catch (Exception e) {
                throw new VideoFrameProcessingException(e);
            }
        }

        public ReflectiveDefaultVideoFrameProcessorFactory(boolean z) {
            this.enableReplayableCache = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ReflectiveSingleInputVideoGraphFactory implements VideoGraph.Factory {
        private final VideoFrameProcessor.Factory videoFrameProcessorFactory;

        @Override // androidx.media3.common.VideoGraph.Factory
        public boolean supportsMultipleInputs() {
            return false;
        }

        @Override // androidx.media3.common.VideoGraph.Factory
        public VideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, long j, boolean z) {
            try {
                return ((VideoGraph.Factory) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class).newInstance(this.videoFrameProcessorFactory)).create(context, colorInfo, debugViewProvider, listener, executor, j, z);
            } catch (Exception e) {
                p.g(e);
                return null;
            }
        }

        public ReflectiveSingleInputVideoGraphFactory(boolean z) {
            this.videoFrameProcessorFactory = new ReflectiveDefaultVideoFrameProcessorFactory(z);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ShiftingTimestampIterator implements TimestampIterator {
        private final long shift;
        private final TimestampIterator timestampIterator;

        @Override // androidx.media3.common.util.TimestampIterator
        public TimestampIterator copyOf() {
            return new ShiftingTimestampIterator(this.timestampIterator.copyOf(), this.shift);
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public long getLastTimestampUs() {
            long lastTimestampUs = this.timestampIterator.getLastTimestampUs();
            if (lastTimestampUs == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return lastTimestampUs + this.shift;
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public boolean hasNext() {
            return this.timestampIterator.hasNext();
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public long next() {
            return this.timestampIterator.next() + this.shift;
        }

        public ShiftingTimestampIterator(TimestampIterator timestampIterator, long j) {
            this.timestampIterator = timestampIterator;
            this.shift = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Runnable runnable) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean registerInput(Format format, int i) throws VideoSink.VideoSinkException {
        PlaybackVideoGraphWrapper playbackVideoGraphWrapper;
        final int i2 = 0;
        final int i3 = 1;
        if (i == 0) {
            Assertions.checkState(this.state == 0);
            ColorInfo adjustedInputColorInfo = getAdjustedInputColorInfo(format.colorInfo);
            try {
                if (this.requestOpenGlToneMapping) {
                    adjustedInputColorInfo = ColorInfo.SDR_BT709_LIMITED;
                } else if (adjustedInputColorInfo.colorTransfer == 7 && Build.VERSION.SDK_INT < 34 && GlUtil.isBt2020PqExtensionSupported()) {
                    adjustedInputColorInfo = adjustedInputColorInfo.buildUpon().setColorTransfer(6).build();
                } else if (!GlUtil.isColorTransferSupported(adjustedInputColorInfo.colorTransfer) && Build.VERSION.SDK_INT >= 29) {
                    Log.w(TAG, Util.formatInvariant("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", Integer.valueOf(adjustedInputColorInfo.colorTransfer)));
                    adjustedInputColorInfo = ColorInfo.SDR_BT709_LIMITED;
                }
                ColorInfo colorInfo = adjustedInputColorInfo;
                final HandlerWrapper handlerWrapperCreateHandler = this.clock.createHandler((Looper) Assertions.checkStateNotNull(Looper.myLooper()), null);
                this.handler = handlerWrapperCreateHandler;
                try {
                    VideoGraph.Factory factory = this.videoGraphFactory;
                    Context context = this.context;
                    DebugViewProvider debugViewProvider = DebugViewProvider.NONE;
                    Objects.requireNonNull(handlerWrapperCreateHandler);
                    playbackVideoGraphWrapper = this;
                    VideoGraph videoGraphCreate = factory.create(context, colorInfo, debugViewProvider, playbackVideoGraphWrapper, new Executor() { // from class: dv1
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            int i4 = i2;
                            handlerWrapperCreateHandler.post(runnable);
                        }
                    }, 0L, false);
                    playbackVideoGraphWrapper.videoGraph = videoGraphCreate;
                    videoGraphCreate.setCompositionEffects(playbackVideoGraphWrapper.compositionEffects);
                    playbackVideoGraphWrapper.videoGraph.setCompositorSettings(playbackVideoGraphWrapper.compositorSettings);
                    playbackVideoGraphWrapper.videoGraph.initialize();
                    Pair<Surface, Size> pair = playbackVideoGraphWrapper.currentSurfaceAndSize;
                    if (pair != null) {
                        Surface surface = (Surface) pair.first;
                        Size size = (Size) pair.second;
                        playbackVideoGraphWrapper.maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
                    }
                    playbackVideoGraphWrapper.defaultVideoSink.initialize(format);
                    VideoSink videoSink = playbackVideoGraphWrapper.defaultVideoSink;
                    DefaultVideoSinkListener defaultVideoSinkListener = new DefaultVideoSinkListener();
                    final HandlerWrapper handlerWrapper = playbackVideoGraphWrapper.handler;
                    Objects.requireNonNull(handlerWrapper);
                    videoSink.setListener(defaultVideoSinkListener, new Executor() { // from class: dv1
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            int i4 = i3;
                            handlerWrapper.post(runnable);
                        }
                    });
                    playbackVideoGraphWrapper.state = 1;
                } catch (VideoFrameProcessingException e) {
                    throw new VideoSink.VideoSinkException(e, format);
                }
            } catch (GlUtil.GlException e2) {
                throw new VideoSink.VideoSinkException(e2, format);
            }
        } else {
            playbackVideoGraphWrapper = this;
            if (!playbackVideoGraphWrapper.isInitialized()) {
                return false;
            }
        }
        try {
            ((VideoGraph) Assertions.checkNotNull(playbackVideoGraphWrapper.videoGraph)).registerInput(i);
            playbackVideoGraphWrapper.registeredVideoInputCount++;
            return true;
        } catch (VideoFrameProcessingException e3) {
            throw new VideoSink.VideoSinkException(e3, format);
        }
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onEnded(long j) {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class StreamChangeInfo {
        public final int firstFrameReleaseInstruction;
        public final long fromTimestampUs;
        public final long startPositionUs;

        public StreamChangeInfo(long j, int i, long j2) {
            this.startPositionUs = j;
            this.firstFrameReleaseInstruction = i;
            this.fromTimestampUs = j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void allowReleaseFirstFrameBeforeStarted() {
        this.defaultVideoSink.allowReleaseFirstFrameBeforeStarted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ColorInfo getAdjustedInputColorInfo(@Nullable ColorInfo colorInfo) {
        return (colorInfo == null || !colorInfo.isDataSpaceValid() || this.isInputSdrToneMapped) ? ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEnded() {
        return this.pendingFlushCount == 0 && this.hasSignaledEndOfVideoGraphOutputStream && this.defaultVideoSink.isEnded();
    }

    private boolean isInitialized() {
        return this.state == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReady(boolean z) {
        return this.defaultVideoSink.isReady(z && this.pendingFlushCount == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void joinPlayback(boolean z) {
        this.defaultVideoSink.join(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$flush$1() {
        this.pendingFlushCount--;
    }

    private void maybeSetOutputSurfaceInfo(@Nullable Surface surface, int i, int i2) {
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph == null) {
            return;
        }
        if (surface != null) {
            videoGraph.setOutputSurfaceInfo(new SurfaceInfo(surface, i, i2));
            this.defaultVideoSink.setOutputSurfaceInfo(surface, new Size(i, i2));
        } else {
            videoGraph.setOutputSurfaceInfo(null);
            this.defaultVideoSink.clearOutputSurfaceInfo();
        }
    }

    private void onOutputStreamChanged() {
        VideoSink videoSink = this.defaultVideoSink;
        Format format = this.videoGraphOutputFormat;
        long j = this.outputStreamStartPositionUs;
        int i = this.outputStreamFirstFrameReleaseInstruction;
        z21 z21Var = d31.b;
        videoSink.onInputStreamChanged(1, format, j, i, y32.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(long j, long j2) throws VideoSink.VideoSinkException {
        this.defaultVideoSink.render(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeFrameRateStrategy(int i) {
        this.defaultVideoSink.setChangeFrameRateStrategy(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        this.defaultVideoSink.setPlaybackSpeed(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
        this.defaultVideoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldRenderToInputVideoSink() {
        int i = this.totalVideoInputCount;
        return i != -1 && i == this.registeredVideoInputCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void signalEndOfVideoGraphOutputStream() {
        this.defaultVideoSink.signalEndOfCurrentInputStream();
        this.hasSignaledEndOfVideoGraphOutputStream = true;
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    public void clearOutputSurfaceInfo() {
        Size size = Size.UNKNOWN;
        maybeSetOutputSurfaceInfo(null, size.getWidth(), size.getHeight());
        this.currentSurfaceAndSize = null;
    }

    public VideoSink getSink(int i) {
        if (Util.contains(this.inputVideoSinks, i)) {
            return this.inputVideoSinks.get(i);
        }
        InputVideoSink inputVideoSink = new InputVideoSink(this.context, i);
        if (i == 0) {
            addListener(inputVideoSink);
        }
        this.inputVideoSinks.put(i, inputVideoSink);
        return inputVideoSink;
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onError(VideoFrameProcessingException videoFrameProcessingException) {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(videoFrameProcessingException);
        }
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputFrameAvailableForRendering(long j, boolean z) {
        if (this.pendingFlushCount > 0) {
            return;
        }
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onFrameAvailableForRendering();
        }
        if (z) {
            VideoFrameMetadataListener videoFrameMetadataListener = this.videoFrameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, -9223372036854775807L, this.videoGraphOutputFormat, null);
                return;
            }
            return;
        }
        this.lastOutputFramePresentationTimeUs = j;
        StreamChangeInfo streamChangeInfoPollFloor = this.pendingStreamChanges.pollFloor(j);
        if (streamChangeInfoPollFloor != null) {
            this.outputStreamStartPositionUs = streamChangeInfoPollFloor.startPositionUs;
            this.outputStreamFirstFrameReleaseInstruction = streamChangeInfoPollFloor.firstFrameReleaseInstruction;
            onOutputStreamChanged();
        }
        this.defaultVideoSink.handleInputFrame(j, this.videoFrameHandler);
        long j2 = this.finalFramePresentationTimeUs;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        signalEndOfVideoGraphOutputStream();
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputFrameRateChanged(float f) {
        this.videoGraphOutputFormat = this.videoGraphOutputFormat.buildUpon().setFrameRate(f).build();
        onOutputStreamChanged();
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputSizeChanged(int i, int i2) {
        this.videoGraphOutputFormat = this.videoGraphOutputFormat.buildUpon().setWidth(i).setHeight(i2).build();
        onOutputStreamChanged();
    }

    public void release() {
        if (this.state == 2) {
            return;
        }
        HandlerWrapper handlerWrapper = this.handler;
        if (handlerWrapper != null) {
            handlerWrapper.removeCallbacksAndMessages(null);
        }
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.release();
        }
        this.currentSurfaceAndSize = null;
        this.state = 2;
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void setCompositorSettings(VideoCompositorSettings videoCompositorSettings) {
        this.compositorSettings = videoCompositorSettings;
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.setCompositorSettings(videoCompositorSettings);
        }
    }

    public void setIsInputSdrToneMapped(boolean z) {
        this.isInputSdrToneMapped = z;
    }

    public void setOutputSurfaceInfo(Surface surface, Size size) {
        Pair<Surface, Size> pair = this.currentSurfaceAndSize;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) this.currentSurfaceAndSize.second).equals(size)) {
            return;
        }
        this.currentSurfaceAndSize = Pair.create(surface, size);
        maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
    }

    public void setRequestOpenGlToneMapping(boolean z) {
        this.requestOpenGlToneMapping = z;
    }

    public void setTotalVideoInputCount(int i) {
        this.totalVideoInputCount = i;
    }

    public void startRendering() {
        this.defaultVideoSink.startRendering();
    }

    public void stopRendering() {
        this.defaultVideoSink.stopRendering();
    }

    private PlaybackVideoGraphWrapper(Builder builder) {
        this.context = builder.context;
        this.pendingStreamChanges = new TimedValueQueue<>();
        this.videoGraphFactory = (VideoGraph.Factory) Assertions.checkStateNotNull(builder.videoGraphFactory);
        this.inputVideoSinks = new SparseArray<>();
        z21 z21Var = d31.b;
        this.compositionEffects = y32.e;
        this.compositorSettings = VideoCompositorSettings.DEFAULT;
        this.enablePlaylistMode = builder.enablePlaylistMode;
        Clock clock = builder.clock;
        this.clock = clock;
        this.defaultVideoSink = new DefaultVideoSink(builder.videoFrameReleaseControl, clock);
        this.videoFrameHandler = new VideoSink.VideoFrameHandler() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.1
            @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
            public void render(long j) {
                ((VideoGraph) Assertions.checkStateNotNull(PlaybackVideoGraphWrapper.this.videoGraph)).renderOutputFrame(j);
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
            public void skip() {
                ((VideoGraph) Assertions.checkStateNotNull(PlaybackVideoGraphWrapper.this.videoGraph)).renderOutputFrame(-2L);
            }
        };
        this.listeners = new CopyOnWriteArraySet<>();
        this.videoGraphOutputFormat = new Format.Builder().build();
        this.outputStreamStartPositionUs = -9223372036854775807L;
        this.lastOutputFramePresentationTimeUs = -9223372036854775807L;
        this.finalFramePresentationTimeUs = -9223372036854775807L;
        this.totalVideoInputCount = -1;
        this.state = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush(boolean z) {
        TimedValueQueue<StreamChangeInfo> timedValueQueue;
        if (!isInitialized()) {
            return;
        }
        this.pendingFlushCount++;
        this.defaultVideoSink.flush(z);
        while (true) {
            int size = this.pendingStreamChanges.size();
            timedValueQueue = this.pendingStreamChanges;
            if (size <= 1) {
                break;
            } else {
                timedValueQueue.pollFirst();
            }
        }
        if (timedValueQueue.size() == 1) {
            StreamChangeInfo streamChangeInfo = (StreamChangeInfo) Assertions.checkNotNull(this.pendingStreamChanges.pollFirst());
            this.outputStreamStartPositionUs = streamChangeInfo.startPositionUs;
            this.outputStreamFirstFrameReleaseInstruction = streamChangeInfo.firstFrameReleaseInstruction;
            onOutputStreamChanged();
        }
        this.lastOutputFramePresentationTimeUs = -9223372036854775807L;
        this.finalFramePresentationTimeUs = -9223372036854775807L;
        this.hasSignaledEndOfVideoGraphOutputStream = false;
        ((HandlerWrapper) Assertions.checkStateNotNull(this.handler)).post(new ue0(this, 20));
    }

    public void setCompositionEffects(List<Effect> list) {
        this.compositionEffects = d31.A(list);
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.setCompositionEffects(list);
        }
    }
}
