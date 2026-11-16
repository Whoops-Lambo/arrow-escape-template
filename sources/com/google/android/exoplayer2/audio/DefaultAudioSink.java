package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.inmobi.media.core.config.models.CrashConfig;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a80;
import defpackage.db;
import defpackage.e32;
import defpackage.eb;
import defpackage.fb;
import defpackage.g20;
import defpackage.h50;
import defpackage.pv1;
import defpackage.u70;
import defpackage.uj2;
import defpackage.v70;
import defpackage.w70;
import defpackage.x70;
import defpackage.y70;
import defpackage.z70;
import io.p071bidmachine.media3.extractor.ts.y;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class DefaultAudioSink implements AudioSink {
    private static final int AUDIO_TRACK_RETRY_DURATION_MS = 100;
    private static final int AUDIO_TRACK_SMALLER_BUFFER_RETRY_SIZE = 1000000;
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    private static final boolean DEFAULT_SKIP_SILENCE = false;
    private static final int ERROR_NATIVE_DEAD_OBJECT = -32;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_DISABLED = 3;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    public static final int OUTPUT_MODE_OFFLOAD = 1;
    public static final int OUTPUT_MODE_PASSTHROUGH = 2;
    public static final int OUTPUT_MODE_PCM = 0;
    private static final String TAG = "DefaultAudioSink";
    public static boolean failOnSpuriousAudioTimestamp;

    @GuardedBy
    private static int pendingReleaseCount;

    @Nullable
    @GuardedBy
    private static ExecutorService releaseExecutor;
    private static final Object releaseExecutorLock = new Object();
    private AudioProcessor[] activeAudioProcessors;

    @Nullable
    private x70 afterDrainParameters;
    private AudioAttributes audioAttributes;
    private final AudioCapabilities audioCapabilities;

    @Nullable
    private final ExoPlayer.AudioOffloadListener audioOffloadListener;
    private final com.google.android.exoplayer2.audio.AudioProcessorChain audioProcessorChain;
    private int audioSessionId;

    @Nullable
    private AudioTrack audioTrack;
    private final AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
    private PlaybackParameters audioTrackPlaybackParameters;
    private final fb audioTrackPositionTracker;
    private AuxEffectInfo auxEffectInfo;

    @Nullable
    private ByteBuffer avSyncHeader;
    private int bytesUntilNextAvSync;
    private final a channelMappingAudioProcessor;
    private c configuration;
    private int drainingAudioProcessorIndex;
    private final boolean enableAudioTrackPlaybackParams;
    private final boolean enableFloatOutput;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private final y70 initializationExceptionPendingExceptionHolder;

    @Nullable
    private ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;

    @Nullable
    private AudioSink.Listener listener;
    private x70 mediaPositionParameters;
    private final ArrayDeque<x70> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private final int offloadMode;
    private a80 offloadStreamEventCallbackV29;

    @Nullable
    private ByteBuffer outputBuffer;
    private ByteBuffer[] outputBuffers;

    @Nullable
    private c pendingConfiguration;

    @Nullable
    private PlayerId playerId;
    private boolean playing;
    private byte[] preV21OutputBuffer;
    private int preV21OutputBufferOffset;

    @Nullable
    private w70 preferredDevice;
    private final ConditionVariable releasingConditionVariable;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioTrack;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final AudioProcessor[] toFloatPcmAvailableAudioProcessors;
    private final AudioProcessor[] toIntPcmAvailableAudioProcessors;
    private final i trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private final y70 writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Deprecated
    public interface AudioProcessorChain extends com.google.android.exoplayer2.audio.AudioProcessorChain {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface AudioTrackBufferSizeProvider {
        public static final AudioTrackBufferSizeProvider DEFAULT = new DefaultAudioTrackBufferSizeProvider.Builder().build();

        int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, double d);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {

        @Nullable
        ExoPlayer.AudioOffloadListener audioOffloadListener;

        @Nullable
        private com.google.android.exoplayer2.audio.AudioProcessorChain audioProcessorChain;
        private boolean enableAudioTrackPlaybackParams;
        private boolean enableFloatOutput;
        private AudioCapabilities audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
        private int offloadMode = 0;
        AudioTrackBufferSizeProvider audioTrackBufferSizeProvider = AudioTrackBufferSizeProvider.DEFAULT;

        public DefaultAudioSink build() {
            if (this.audioProcessorChain == null) {
                this.audioProcessorChain = new DefaultAudioProcessorChain(new AudioProcessor[0]);
            }
            return new DefaultAudioSink(this);
        }

        public Builder setAudioTrackBufferSizeProvider(AudioTrackBufferSizeProvider audioTrackBufferSizeProvider) {
            this.audioTrackBufferSizeProvider = audioTrackBufferSizeProvider;
            return this;
        }

        public Builder setEnableAudioTrackPlaybackParams(boolean z) {
            this.enableAudioTrackPlaybackParams = z;
            return this;
        }

        public Builder setEnableFloatOutput(boolean z) {
            this.enableFloatOutput = z;
            return this;
        }

        public Builder setExperimentalAudioOffloadListener(@Nullable ExoPlayer.AudioOffloadListener audioOffloadListener) {
            this.audioOffloadListener = audioOffloadListener;
            return this;
        }

        public Builder setOffloadMode(int i) {
            this.offloadMode = i;
            return this;
        }

        public Builder setAudioCapabilities(AudioCapabilities audioCapabilities) {
            Assertions.checkNotNull(audioCapabilities);
            this.audioCapabilities = audioCapabilities;
            return this;
        }

        public Builder setAudioProcessorChain(com.google.android.exoplayer2.audio.AudioProcessorChain audioProcessorChain) {
            Assertions.checkNotNull(audioProcessorChain);
            this.audioProcessorChain = audioProcessorChain;
            return this;
        }

        public Builder setAudioProcessors(AudioProcessor[] audioProcessorArr) {
            Assertions.checkNotNull(audioProcessorArr);
            return setAudioProcessorChain(new DefaultAudioProcessorChain(audioProcessorArr));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] audioProcessors;
        private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final SonicAudioProcessor sonicAudioProcessor;

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
            this.sonicAudioProcessor.setSpeed(playbackParameters.speed);
            this.sonicAudioProcessor.setPitch(playbackParameters.pitch);
            return playbackParameters;
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean z) {
            this.silenceSkippingAudioProcessor.setEnabled(z);
            return z;
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public long getMediaDuration(long j) {
            return this.sonicAudioProcessor.getMediaDuration(j);
        }

        @Override // com.google.android.exoplayer2.audio.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }

        public DefaultAudioProcessorChain(AudioProcessor[] audioProcessorArr, SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, SonicAudioProcessor sonicAudioProcessor) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.audioProcessors = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            this.sonicAudioProcessor = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new SilenceSkippingAudioProcessor(), new SonicAudioProcessor());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    private void flushAudioProcessors() {
        int i = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.activeAudioProcessors;
            if (i >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i];
            audioProcessor.flush();
            this.outputBuffers[i] = audioProcessor.getOutput();
            i++;
        }
    }

    private static int getFramesPerEncodedSample(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return Ac3Util.parseAc3SyncframeAudioSampleCount(byteBuffer);
            case 7:
            case 8:
                return DtsUtil.parseDtsAudioSampleCount(byteBuffer);
            case 9:
                int mpegAudioFrameSampleCount = MpegAudioUtil.parseMpegAudioFrameSampleCount(Util.getBigEndianInt(byteBuffer, byteBuffer.position()));
                if (mpegAudioFrameSampleCount != -1) {
                    return mpegAudioFrameSampleCount;
                }
                e32.a();
                return 0;
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                e32.i(pv1.k(i, "Unexpected audio encoding: "));
                return 0;
            case 14:
                int iFindTrueHdSyncframeOffset = Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
                if (iFindTrueHdSyncframeOffset == -1) {
                    return 0;
                }
                return Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, iFindTrueHdSyncframeOffset) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return Ac4Util.parseAc4SyncframeAudioSampleCount(byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseAudioTrackAsync$0(AudioTrack audioTrack, ConditionVariable conditionVariable) {
        try {
            audioTrack.flush();
            audioTrack.release();
            conditionVariable.open();
            synchronized (releaseExecutorLock) {
                try {
                    int i = pendingReleaseCount - 1;
                    pendingReleaseCount = i;
                    if (i == 0) {
                        releaseExecutor.shutdown();
                        releaseExecutor = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            conditionVariable.open();
            synchronized (releaseExecutorLock) {
                try {
                    int i2 = pendingReleaseCount - 1;
                    pendingReleaseCount = i2;
                    if (i2 == 0) {
                        releaseExecutor.shutdown();
                        releaseExecutor = null;
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @RequiresApi
    private static int writeNonBlockingV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void handleDiscontinuity() {
        this.startMediaTimeUsNeedsSync = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.playing = false;
        if (isAudioTrackInitialized()) {
            fb fbVar = this.audioTrackPositionTracker;
            fbVar.l = 0L;
            fbVar.w = 0;
            fbVar.v = 0;
            fbVar.m = 0L;
            fbVar.C = 0L;
            fbVar.F = 0L;
            fbVar.k = false;
            if (fbVar.x == -9223372036854775807L) {
                ((eb) Assertions.checkNotNull(fbVar.f)).a();
                this.audioTrack.pause();
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.playing = true;
        if (isAudioTrackInitialized()) {
            ((eb) Assertions.checkNotNull(this.audioTrackPositionTracker.f)).a();
            this.audioTrack.play();
        }
    }

    private long applyMediaPositionParameters(long j) {
        while (!this.mediaPositionParametersCheckpoints.isEmpty() && j >= this.mediaPositionParametersCheckpoints.getFirst().d) {
            this.mediaPositionParameters = this.mediaPositionParametersCheckpoints.remove();
        }
        x70 x70Var = this.mediaPositionParameters;
        long j2 = j - x70Var.d;
        if (x70Var.a.equals(PlaybackParameters.DEFAULT)) {
            return this.mediaPositionParameters.c + j2;
        }
        if (this.mediaPositionParametersCheckpoints.isEmpty()) {
            return this.mediaPositionParameters.c + this.audioProcessorChain.getMediaDuration(j2);
        }
        x70 first = this.mediaPositionParametersCheckpoints.getFirst();
        return first.c - Util.getMediaDurationForPlayoutDuration(first.d - j, this.mediaPositionParameters.a.speed);
    }

    private long applySkipping(long j) {
        return ((this.audioProcessorChain.getSkippedOutputFrameCount() * 1000000) / ((long) this.configuration.e)) + j;
    }

    private AudioTrack buildAudioTrack(c cVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackA = cVar.a(this.tunneling, this.audioAttributes, this.audioSessionId);
            ExoPlayer.AudioOffloadListener audioOffloadListener = this.audioOffloadListener;
            if (audioOffloadListener == null) {
                return audioTrackA;
            }
            audioOffloadListener.onExperimentalOffloadedPlayback(isOffloadedPlayback(audioTrackA));
            return audioTrackA;
        } catch (AudioSink.InitializationException e) {
            AudioSink.Listener listener = this.listener;
            if (listener != null) {
                listener.onAudioSinkError(e);
            }
            throw e;
        }
    }

    private AudioTrack buildAudioTrackWithRetry() throws AudioSink.InitializationException {
        try {
            return buildAudioTrack((c) Assertions.checkNotNull(this.configuration));
        } catch (AudioSink.InitializationException e) {
            c cVar = this.configuration;
            if (cVar.h > 1000000) {
                c cVar2 = new c(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, 1000000, cVar.i);
                try {
                    AudioTrack audioTrackBuildAudioTrack = buildAudioTrack(cVar2);
                    this.configuration = cVar2;
                    return audioTrackBuildAudioTrack;
                } catch (AudioSink.InitializationException e2) {
                    e.addSuppressed(e2);
                    maybeDisableOffload();
                    throw e;
                }
            }
            maybeDisableOffload();
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private boolean drainToEndOfStream() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r9 = this;
            int r0 = r9.drainingAudioProcessorIndex
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.drainingAudioProcessorIndex = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.drainingAudioProcessorIndex
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.activeAudioProcessors
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.queueEndOfStream()
        L1f:
            r9.processBuffers(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.drainingAudioProcessorIndex
            int r0 = r0 + r1
            r9.drainingAudioProcessorIndex = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L3b
            r9.writeBuffer(r0, r7)
            java.nio.ByteBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.drainingAudioProcessorIndex = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.drainToEndOfStream():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi
    public static AudioFormat getAudioFormat(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    private x70 getMediaPositionParameters() {
        x70 x70Var = this.afterDrainParameters;
        if (x70Var != null) {
            return x70Var;
        }
        return !this.mediaPositionParametersCheckpoints.isEmpty() ? this.mediaPositionParametersCheckpoints.getLast() : this.mediaPositionParameters;
    }

    @RequiresApi
    @SuppressLint({"InlinedApi"})
    private int getOffloadedPlaybackSupport(AudioFormat audioFormat, android.media.AudioAttributes audioAttributes) {
        int i = Util.SDK_INT;
        if (i >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i == 30 && Util.MODEL.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getSubmittedFrames() {
        c cVar = this.configuration;
        return cVar.c == 0 ? this.submittedPcmBytes / ((long) cVar.b) : this.submittedEncodedFrames;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        c cVar = this.configuration;
        return cVar.c == 0 ? this.writtenPcmBytes / ((long) cVar.d) : this.writtenEncodedFrames;
    }

    private boolean initializeAudioTrack() throws AudioSink.InitializationException {
        PlayerId playerId;
        if (!this.releasingConditionVariable.isOpen()) {
            return false;
        }
        AudioTrack audioTrackBuildAudioTrackWithRetry = buildAudioTrackWithRetry();
        this.audioTrack = audioTrackBuildAudioTrackWithRetry;
        if (isOffloadedPlayback(audioTrackBuildAudioTrackWithRetry)) {
            registerStreamEventCallbackV29(this.audioTrack);
            if (this.offloadMode != 3) {
                AudioTrack audioTrack = this.audioTrack;
                Format format = this.configuration.a;
                audioTrack.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
            }
        }
        int i = Util.SDK_INT;
        if (i >= 31 && (playerId = this.playerId) != null) {
            v70.a(this.audioTrack, playerId);
        }
        this.audioSessionId = this.audioTrack.getAudioSessionId();
        fb fbVar = this.audioTrackPositionTracker;
        AudioTrack audioTrack2 = this.audioTrack;
        c cVar = this.configuration;
        fbVar.c(audioTrack2, cVar.c == 2, cVar.g, cVar.d, cVar.h);
        setVolumeInternal();
        int i2 = this.auxEffectInfo.effectId;
        if (i2 != 0) {
            this.audioTrack.attachAuxEffect(i2);
            this.audioTrack.setAuxEffectSendLevel(this.auxEffectInfo.sendLevel);
        }
        w70 w70Var = this.preferredDevice;
        if (w70Var != null && i >= 23) {
            u70.a(this.audioTrack, w70Var);
        }
        this.startMediaTimeUsNeedsInit = true;
        return true;
    }

    private static boolean isAudioTrackDeadObject(int i) {
        return (Util.SDK_INT >= 24 && i == -6) || i == ERROR_NATIVE_DEAD_OBJECT;
    }

    private boolean isAudioTrackInitialized() {
        return this.audioTrack != null;
    }

    private static boolean isOffloadedPlayback(AudioTrack audioTrack) {
        return Util.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void maybeDisableOffload() {
        if (this.configuration.c == 1) {
            this.offloadDisabledUntilNextConfiguration = true;
        }
    }

    private void playPendingData() {
        if (this.stoppedAudioTrack) {
            return;
        }
        this.stoppedAudioTrack = true;
        fb fbVar = this.audioTrackPositionTracker;
        long writtenFrames = getWrittenFrames();
        fbVar.z = fbVar.a();
        fbVar.x = SystemClock.elapsedRealtime() * 1000;
        fbVar.A = writtenFrames;
        this.audioTrack.stop();
        this.bytesUntilNextAvSync = 0;
    }

    private void processBuffers(long j) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.activeAudioProcessors.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.outputBuffers[i - 1];
            } else {
                byteBuffer = this.inputBuffer;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.EMPTY_BUFFER;
                }
            }
            if (i == length) {
                writeBuffer(byteBuffer, j);
            } else {
                AudioProcessor audioProcessor = this.activeAudioProcessors[i];
                if (i > this.drainingAudioProcessorIndex) {
                    audioProcessor.queueInput(byteBuffer);
                }
                ByteBuffer output = audioProcessor.getOutput();
                this.outputBuffers[i] = output;
                if (output.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    @RequiresApi
    private void registerStreamEventCallbackV29(AudioTrack audioTrack) {
        if (this.offloadStreamEventCallbackV29 == null) {
            this.offloadStreamEventCallbackV29 = new a80(this);
        }
        a80 a80Var = this.offloadStreamEventCallbackV29;
        Handler handler = a80Var.a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new z70(handler, 0), a80Var.b);
    }

    private void resetSinkStateForFlush() {
        this.submittedPcmBytes = 0L;
        this.submittedEncodedFrames = 0L;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.isWaitingForOffloadEndOfStreamHandled = false;
        this.framesPerEncodedSample = 0;
        this.mediaPositionParameters = new x70(getAudioProcessorPlaybackParameters(), getSkipSilenceEnabled(), 0L, 0L);
        this.startMediaTimeUs = 0L;
        this.afterDrainParameters = null;
        this.mediaPositionParametersCheckpoints.clear();
        this.inputBuffer = null;
        this.inputBufferAccessUnitCount = 0;
        this.outputBuffer = null;
        this.stoppedAudioTrack = false;
        this.handledEndOfStream = false;
        this.drainingAudioProcessorIndex = -1;
        this.avSyncHeader = null;
        this.bytesUntilNextAvSync = 0;
        this.trimmingAudioProcessor.g = 0L;
        flushAudioProcessors();
    }

    private void setupAudioProcessors() {
        AudioProcessor[] audioProcessorArr = this.configuration.i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.activeAudioProcessors = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.outputBuffers = new ByteBuffer[size];
        flushAudioProcessors();
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        return (this.tunneling || !"audio/raw".equals(this.configuration.a.sampleMimeType) || shouldUseFloatOutput(this.configuration.a.pcmEncoding)) ? false : true;
    }

    private boolean shouldUseFloatOutput(int i) {
        return this.enableFloatOutput && Util.isEncodingHighResolutionPcm(i);
    }

    private boolean useOffloadedPlayback(Format format, AudioAttributes audioAttributes) {
        int encoding;
        int audioTrackChannelConfig;
        int offloadedPlaybackSupport;
        if (Util.SDK_INT < 29 || this.offloadMode == 0 || (encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs)) == 0 || (audioTrackChannelConfig = Util.getAudioTrackChannelConfig(format.channelCount)) == 0 || (offloadedPlaybackSupport = getOffloadedPlaybackSupport(getAudioFormat(format.sampleRate, audioTrackChannelConfig, encoding), audioAttributes.getAudioAttributesV21().audioAttributes)) == 0) {
            return false;
        }
        if (offloadedPlaybackSupport == 1) {
            return ((format.encoderDelay != 0 || format.encoderPadding != 0) && (this.offloadMode == 1)) ? false : true;
        }
        if (offloadedPlaybackSupport == 2) {
            return true;
        }
        y.b();
        return false;
    }

    @RequiresApi
    private int writeNonBlockingWithAvSyncV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (Util.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.avSyncHeader == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.avSyncHeader = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.avSyncHeader.putInt(1431633921);
        }
        if (this.bytesUntilNextAvSync == 0) {
            this.avSyncHeader.putInt(4, i);
            this.avSyncHeader.putLong(8, j * 1000);
            this.avSyncHeader.position(0);
            this.bytesUntilNextAvSync = i;
        }
        int iRemaining = this.avSyncHeader.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.avSyncHeader, iRemaining, 1);
            if (iWrite < 0) {
                this.bytesUntilNextAvSync = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iWriteNonBlockingV21 = writeNonBlockingV21(audioTrack, byteBuffer, i);
        if (iWriteNonBlockingV21 < 0) {
            this.bytesUntilNextAvSync = 0;
            return iWriteNonBlockingV21;
        }
        this.bytesUntilNextAvSync -= iWriteNonBlockingV21;
        return iWriteNonBlockingV21;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void configure(Format format, int i, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        AudioProcessor[] audioProcessorArr;
        int i2;
        int iIntValue;
        int iIntValue2;
        int i3;
        int i4;
        int pcmFrameSize;
        int pcmFrameSize2;
        int i5;
        int[] iArr2;
        if ("audio/raw".equals(format.sampleMimeType)) {
            Assertions.checkArgument(Util.isEncodingLinearPcm(format.pcmEncoding));
            pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
            audioProcessorArr = shouldUseFloatOutput(format.pcmEncoding) ? this.toFloatPcmAvailableAudioProcessors : this.toIntPcmAvailableAudioProcessors;
            i iVar = this.trimmingAudioProcessor;
            int i6 = format.encoderDelay;
            int i7 = format.encoderPadding;
            iVar.a = i6;
            iVar.b = i7;
            if (Util.SDK_INT < 21 && format.channelCount == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i8 = 0; i8 < 6; i8++) {
                    iArr2[i8] = i8;
                }
            } else {
                iArr2 = iArr;
            }
            this.channelMappingAudioProcessor.a = iArr2;
            AudioProcessor.AudioFormat audioFormat = new AudioProcessor.AudioFormat(format.sampleRate, format.channelCount, format.pcmEncoding);
            for (AudioProcessor audioProcessor : audioProcessorArr) {
                try {
                    AudioProcessor.AudioFormat audioFormatConfigure = audioProcessor.configure(audioFormat);
                    if (audioProcessor.isActive()) {
                        audioFormat = audioFormatConfigure;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e) {
                    throw new AudioSink.ConfigurationException(e, format);
                }
            }
            iIntValue = audioFormat.encoding;
            i2 = audioFormat.sampleRate;
            iIntValue2 = Util.getAudioTrackChannelConfig(audioFormat.channelCount);
            i4 = 0;
            pcmFrameSize2 = Util.getPcmFrameSize(iIntValue, audioFormat.channelCount);
        } else {
            audioProcessorArr = new AudioProcessor[0];
            i2 = format.sampleRate;
            if (useOffloadedPlayback(format, this.audioAttributes)) {
                iIntValue = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
                iIntValue2 = Util.getAudioTrackChannelConfig(format.channelCount);
                i3 = 1;
            } else {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = this.audioCapabilities.getEncodingAndChannelConfigForPassthrough(format);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + format, format);
                }
                iIntValue = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                iIntValue2 = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                i3 = 2;
            }
            i4 = i3;
            pcmFrameSize = -1;
            pcmFrameSize2 = -1;
        }
        int i9 = i2;
        int i10 = iIntValue2;
        int i11 = iIntValue;
        if (i11 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i4 + ") for: " + format, format);
        }
        if (i10 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i4 + ") for: " + format, format);
        }
        if (i != 0) {
            i5 = i;
        } else {
            int bufferSizeInBytes = this.audioTrackBufferSizeProvider.getBufferSizeInBytes(getAudioTrackMinBufferSize(i9, i10, i11), i11, i4, pcmFrameSize2, i9, this.enableAudioTrackPlaybackParams ? 8.0d : 1.0d);
            i11 = i11;
            i5 = bufferSizeInBytes;
        }
        this.offloadDisabledUntilNextConfiguration = false;
        c cVar = new c(format, pcmFrameSize, i4, pcmFrameSize2, i9, i10, i11, i5, audioProcessorArr);
        if (isAudioTrackInitialized()) {
            this.pendingConfiguration = cVar;
        } else {
            this.configuration = cVar;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void enableTunnelingV21() {
        Assertions.checkState(Util.SDK_INT >= 21);
        Assertions.checkState(this.externalAudioSessionIdProvided);
        if (this.tunneling) {
            return;
        }
        this.tunneling = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void experimentalFlushWithoutAudioTrackRelease() {
        if (Util.SDK_INT < 25) {
            flush();
            return;
        }
        this.writeExceptionPendingExceptionHolder.a = null;
        this.initializationExceptionPendingExceptionHolder.a = null;
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (((AudioTrack) Assertions.checkNotNull(this.audioTrackPositionTracker.c)).getPlayState() == 3) {
                this.audioTrack.pause();
            }
            this.audioTrack.flush();
            fb fbVar = this.audioTrackPositionTracker;
            fbVar.l = 0L;
            fbVar.w = 0;
            fbVar.v = 0;
            fbVar.m = 0L;
            fbVar.C = 0L;
            fbVar.F = 0L;
            fbVar.k = false;
            fbVar.c = null;
            fbVar.f = null;
            AudioTrack audioTrack = this.audioTrack;
            c cVar = this.configuration;
            fbVar.c(audioTrack, cVar.c == 2, cVar.g, cVar.d, cVar.h);
            this.startMediaTimeUsNeedsInit = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0136  */
    /* JADX WARN: Code duplicated, block: B:70:0x013a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX WARN: Code duplicated, block: B:73:0x014c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0151  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0167  */
    /* JADX WARN: Code duplicated, block: B:79:0x016a  */
    /* JADX WARN: Code duplicated, block: B:81:0x017a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:0x018d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0194  */
    /* JADX WARN: Code duplicated, block: B:94:0x01cb A[Catch: Exception -> 0x01d1, TRY_LEAVE, TryCatch #0 {Exception -> 0x01d1, blocks: (B:92:0x01a1, B:94:0x01cb), top: B:134:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d6  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long getCurrentPositionUs(boolean z) {
        long j;
        long j2;
        long jA;
        long j3;
        boolean timestamp;
        long j4;
        Method method;
        long jMax;
        db dbVar;
        long j5;
        long j6;
        if (!isAudioTrackInitialized() || this.startMediaTimeUsNeedsInit) {
            return Long.MIN_VALUE;
        }
        fb fbVar = this.audioTrackPositionTracker;
        AudioTrackPositionTracker$Listener audioTrackPositionTracker$Listener = fbVar.a;
        long j7 = 0;
        long j8 = 1000000;
        if (((AudioTrack) Assertions.checkNotNull(fbVar.c)).getPlayState() == 3) {
            long[] jArr = fbVar.b;
            long jA2 = (fbVar.a() * 1000000) / ((long) fbVar.g);
            if (jA2 == 0) {
                j = 1000;
                j2 = 1000000;
            } else {
                long jNanoTime = System.nanoTime() / 1000;
                j = 1000;
                if (jNanoTime - fbVar.m >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                    int i = fbVar.v;
                    jArr[i] = jA2 - jNanoTime;
                    fbVar.v = (i + 1) % 10;
                    int i2 = fbVar.w;
                    if (i2 < 10) {
                        fbVar.w = i2 + 1;
                    }
                    fbVar.m = jNanoTime;
                    fbVar.l = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = fbVar.w;
                        if (i3 >= i4) {
                            break;
                        }
                        fbVar.l = (jArr[i3] / ((long) i4)) + fbVar.l;
                        i3++;
                        j8 = j8;
                        j7 = j7;
                    }
                }
                long j9 = j7;
                j2 = j8;
                if (!fbVar.h) {
                    eb ebVar = (eb) Assertions.checkNotNull(fbVar.f);
                    db dbVar2 = ebVar.a;
                    if (dbVar2 != null) {
                        AudioTimestamp audioTimestamp = (AudioTimestamp) dbVar2.b;
                        j3 = 500000;
                        if (jNanoTime - ebVar.e >= ebVar.d) {
                            ebVar.e = jNanoTime;
                            timestamp = ((AudioTrack) dbVar2.a).getTimestamp(audioTimestamp);
                            if (timestamp) {
                                long j10 = audioTimestamp.framePosition;
                                if (dbVar2.d > j10) {
                                    dbVar2.c++;
                                }
                                dbVar2.d = j10;
                                dbVar2.e = j10 + (dbVar2.c << 32);
                            }
                            int i5 = ebVar.b;
                            if (i5 != 0) {
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            if (i5 != 4) {
                                                y.b();
                                                return j9;
                                            }
                                        } else if (timestamp) {
                                            ebVar.a();
                                        }
                                    } else if (!timestamp) {
                                        ebVar.a();
                                    }
                                } else if (!timestamp) {
                                    ebVar.a();
                                } else if (dbVar2.e > ebVar.f) {
                                    ebVar.b(2);
                                }
                            } else if (timestamp) {
                                if (audioTimestamp.nanoTime / 1000 >= ebVar.c) {
                                    ebVar.f = dbVar2.e;
                                    ebVar.b(1);
                                }
                            } else if (jNanoTime - ebVar.c > 500000) {
                                ebVar.b(3);
                            }
                            if (timestamp) {
                                dbVar = ebVar.a;
                                if (dbVar != null) {
                                    j5 = ((AudioTimestamp) dbVar.b).nanoTime / 1000;
                                } else {
                                    j5 = -9223372036854775807L;
                                }
                                if (dbVar != null) {
                                    j6 = dbVar.e;
                                } else {
                                    j6 = -1;
                                }
                                if (Math.abs(j5 - jNanoTime) > 5000000) {
                                    fbVar.a.onSystemTimeUsMismatch(j6, j5, jNanoTime, jA2);
                                    ebVar.b(4);
                                    j4 = jNanoTime;
                                } else if (Math.abs(((j6 * j2) / ((long) fbVar.g)) - jA2) > 5000000) {
                                    fbVar.a.onPositionFramesMismatch(j6, j5, jNanoTime, jA2);
                                    j4 = jNanoTime;
                                    ebVar.b(4);
                                } else {
                                    j4 = jNanoTime;
                                    if (ebVar.b == 4) {
                                        ebVar.a();
                                    }
                                }
                            } else {
                                j4 = jNanoTime;
                            }
                            if (fbVar.q && (method = fbVar.n) != null && j4 - fbVar.r >= j3) {
                                try {
                                    long jIntValue = (((long) ((Integer) Util.castNonNull((Integer) method.invoke(Assertions.checkNotNull(fbVar.c), null))).intValue()) * 1000) - fbVar.i;
                                    fbVar.o = jIntValue;
                                    jMax = Math.max(jIntValue, j9);
                                    fbVar.o = jMax;
                                    if (jMax > 5000000) {
                                        audioTrackPositionTracker$Listener.onInvalidLatency(jMax);
                                        fbVar.o = j9;
                                    }
                                } catch (Exception unused) {
                                    fbVar.n = null;
                                }
                                fbVar.r = j4;
                            }
                        }
                        timestamp = false;
                        if (timestamp) {
                            dbVar = ebVar.a;
                            if (dbVar != null) {
                                j5 = ((AudioTimestamp) dbVar.b).nanoTime / 1000;
                            } else {
                                j5 = -9223372036854775807L;
                            }
                            if (dbVar != null) {
                                j6 = dbVar.e;
                            } else {
                                j6 = -1;
                            }
                            if (Math.abs(j5 - jNanoTime) > 5000000) {
                                fbVar.a.onSystemTimeUsMismatch(j6, j5, jNanoTime, jA2);
                                ebVar.b(4);
                                j4 = jNanoTime;
                            } else if (Math.abs(((j6 * j2) / ((long) fbVar.g)) - jA2) > 5000000) {
                                fbVar.a.onPositionFramesMismatch(j6, j5, jNanoTime, jA2);
                                j4 = jNanoTime;
                                ebVar.b(4);
                            } else {
                                j4 = jNanoTime;
                                if (ebVar.b == 4) {
                                    ebVar.a();
                                }
                            }
                        } else {
                            j4 = jNanoTime;
                        }
                        if (fbVar.q) {
                            long jIntValue2 = (((long) ((Integer) Util.castNonNull((Integer) method.invoke(Assertions.checkNotNull(fbVar.c), null))).intValue()) * 1000) - fbVar.i;
                            fbVar.o = jIntValue2;
                            jMax = Math.max(jIntValue2, j9);
                            fbVar.o = jMax;
                            if (jMax > 5000000) {
                                audioTrackPositionTracker$Listener.onInvalidLatency(jMax);
                                fbVar.o = j9;
                            }
                            fbVar.r = j4;
                        }
                    } else {
                        j3 = 500000;
                    }
                    jNanoTime = jNanoTime;
                    timestamp = false;
                    if (timestamp) {
                        dbVar = ebVar.a;
                        if (dbVar != null) {
                            j5 = ((AudioTimestamp) dbVar.b).nanoTime / 1000;
                        } else {
                            j5 = -9223372036854775807L;
                        }
                        if (dbVar != null) {
                            j6 = dbVar.e;
                        } else {
                            j6 = -1;
                        }
                        if (Math.abs(j5 - jNanoTime) > 5000000) {
                            fbVar.a.onSystemTimeUsMismatch(j6, j5, jNanoTime, jA2);
                            ebVar.b(4);
                            j4 = jNanoTime;
                        } else if (Math.abs(((j6 * j2) / ((long) fbVar.g)) - jA2) > 5000000) {
                            fbVar.a.onPositionFramesMismatch(j6, j5, jNanoTime, jA2);
                            j4 = jNanoTime;
                            ebVar.b(4);
                        } else {
                            j4 = jNanoTime;
                            if (ebVar.b == 4) {
                                ebVar.a();
                            }
                        }
                    } else {
                        j4 = jNanoTime;
                    }
                    if (fbVar.q) {
                        long jIntValue3 = (((long) ((Integer) Util.castNonNull((Integer) method.invoke(Assertions.checkNotNull(fbVar.c), null))).intValue()) * 1000) - fbVar.i;
                        fbVar.o = jIntValue3;
                        jMax = Math.max(jIntValue3, j9);
                        fbVar.o = jMax;
                        if (jMax > 5000000) {
                            audioTrackPositionTracker$Listener.onInvalidLatency(jMax);
                            fbVar.o = j9;
                        }
                        fbVar.r = j4;
                    }
                }
            }
        } else {
            j = 1000;
            j2 = 1000000;
        }
        long jNanoTime2 = System.nanoTime() / j;
        eb ebVar2 = (eb) Assertions.checkNotNull(fbVar.f);
        boolean z2 = ebVar2.b == 2;
        if (z2) {
            db dbVar3 = ebVar2.a;
            jA = Util.getMediaDurationForPlayoutDuration(jNanoTime2 - (dbVar3 != null ? ((AudioTimestamp) dbVar3.b).nanoTime / j : -9223372036854775807L), fbVar.j) + (((dbVar3 != null ? dbVar3.e : -1L) * j2) / ((long) fbVar.g));
        } else {
            jA = fbVar.w == 0 ? (fbVar.a() * j2) / ((long) fbVar.g) : fbVar.l + jNanoTime2;
            if (!z) {
                jA = Math.max(0L, jA - fbVar.o);
            }
        }
        if (fbVar.D != z2) {
            fbVar.F = fbVar.C;
            fbVar.E = fbVar.B;
        }
        long j11 = jNanoTime2 - fbVar.F;
        if (j11 < j2) {
            long mediaDurationForPlayoutDuration = Util.getMediaDurationForPlayoutDuration(j11, fbVar.j) + fbVar.E;
            long j12 = (j11 * j) / j2;
            jA = (((j - j12) * mediaDurationForPlayoutDuration) + (jA * j12)) / j;
        }
        if (!fbVar.k) {
            long j13 = fbVar.B;
            if (jA > j13) {
                fbVar.k = true;
                audioTrackPositionTracker$Listener.onPositionAdvancing(System.currentTimeMillis() - Util.usToMs(Util.getPlayoutDurationForMediaDuration(Util.usToMs(jA - j13), fbVar.j)));
            }
        }
        fbVar.C = jNanoTime2;
        fbVar.B = jA;
        fbVar.D = z2;
        return applySkipping(applyMediaPositionParameters(Math.min(jA, (getWrittenFrames() * j2) / ((long) this.configuration.e))));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int getFormatSupport(Format format) {
        if (!"audio/raw".equals(format.sampleMimeType)) {
            return ((this.offloadDisabledUntilNextConfiguration || !useOffloadedPlayback(format, this.audioAttributes)) && !this.audioCapabilities.isPassthroughPlaybackSupported(format)) ? 0 : 2;
        }
        boolean zIsEncodingLinearPcm = Util.isEncodingLinearPcm(format.pcmEncoding);
        int i = format.pcmEncoding;
        if (zIsEncodingLinearPcm) {
            return (i == 2 || (this.enableFloatOutput && i == 4)) ? 2 : 1;
        }
        h50.t(i, "Invalid PCM encoding: ", TAG);
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.enableAudioTrackPlaybackParams ? this.audioTrackPlaybackParameters : getAudioProcessorPlaybackParameters();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0196  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:112:0x01be  */
    /* JADX WARN: Code duplicated, block: B:114:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:117:0x01da  */
    /* JADX WARN: Code duplicated, block: B:119:0x01df  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:128:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x0118  */
    /* JADX WARN: Code duplicated, block: B:76:0x0120  */
    /* JADX WARN: Code duplicated, block: B:77:0x0122  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0133  */
    /* JADX WARN: Code duplicated, block: B:90:0x0146  */
    /* JADX WARN: Code duplicated, block: B:93:0x014e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0153  */
    /* JADX WARN: Code duplicated, block: B:96:0x0171  */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013f, code lost:
    
        if (r5 == 0) goto L87;
     */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handleBuffer(java.nio.ByteBuffer r19, long r20, int r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.handleBuffer(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void playToEndOfStream() throws AudioSink.WriteException {
        if (!this.handledEndOfStream && isAudioTrackInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.handledEndOfStream = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        if (this.tunneling) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int i) {
        if (this.audioSessionId != i) {
            this.audioSessionId = i;
            this.externalAudioSessionIdProvided = i != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        if (this.auxEffectInfo.equals(auxEffectInfo)) {
            return;
        }
        int i = auxEffectInfo.effectId;
        float f = auxEffectInfo.sendLevel;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            if (this.auxEffectInfo.effectId != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.audioTrack.setAuxEffectSendLevel(f);
            }
        }
        this.auxEffectInfo = auxEffectInfo;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        PlaybackParameters playbackParameters2 = new PlaybackParameters(Util.constrainValue(playbackParameters.speed, 0.1f, 8.0f), Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f));
        if (!this.enableAudioTrackPlaybackParams || Util.SDK_INT < 23) {
            setAudioProcessorPlaybackParametersAndSkipSilence(playbackParameters2, getSkipSilenceEnabled());
        } else {
            setAudioTrackPlaybackParametersV23(playbackParameters2);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlayerId(@Nullable PlayerId playerId) {
        this.playerId = playerId;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    @RequiresApi
    public void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        w70 w70Var = audioDeviceInfo == null ? null : new w70(audioDeviceInfo);
        this.preferredDevice = w70Var;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            u70.a(audioTrack, w70Var);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float f) {
        if (this.volume != f) {
            this.volume = f;
            setVolumeInternal();
        }
    }

    private DefaultAudioSink(Builder builder) {
        boolean z;
        boolean z2;
        int i;
        this.audioCapabilities = builder.audioCapabilities;
        com.google.android.exoplayer2.audio.AudioProcessorChain audioProcessorChain = builder.audioProcessorChain;
        this.audioProcessorChain = audioProcessorChain;
        int i2 = Util.SDK_INT;
        if (i2 >= 21 && builder.enableFloatOutput) {
            z = true;
        } else {
            z = false;
        }
        this.enableFloatOutput = z;
        if (i2 >= 23 && builder.enableAudioTrackPlaybackParams) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.enableAudioTrackPlaybackParams = z2;
        if (i2 >= 29) {
            i = builder.offloadMode;
        } else {
            i = 0;
        }
        this.offloadMode = i;
        this.audioTrackBufferSizeProvider = builder.audioTrackBufferSizeProvider;
        ConditionVariable conditionVariable = new ConditionVariable(Clock.DEFAULT);
        this.releasingConditionVariable = conditionVariable;
        conditionVariable.open();
        this.audioTrackPositionTracker = new fb(new d(this));
        a aVar = new a();
        this.channelMappingAudioProcessor = aVar;
        i iVar = new i();
        iVar.e = Util.EMPTY_BYTE_ARRAY;
        this.trimmingAudioProcessor = iVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new h(), aVar, iVar);
        Collections.addAll(arrayList, audioProcessorChain.getAudioProcessors());
        this.toIntPcmAvailableAudioProcessors = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.toFloatPcmAvailableAudioProcessors = new AudioProcessor[]{new f()};
        this.volume = 1.0f;
        this.audioAttributes = AudioAttributes.DEFAULT;
        this.audioSessionId = 0;
        this.auxEffectInfo = new AuxEffectInfo(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
        this.mediaPositionParameters = new x70(playbackParameters, false, 0L, 0L);
        this.audioTrackPlaybackParameters = playbackParameters;
        this.drainingAudioProcessorIndex = -1;
        this.activeAudioProcessors = new AudioProcessor[0];
        this.outputBuffers = new ByteBuffer[0];
        this.mediaPositionParametersCheckpoints = new ArrayDeque<>();
        this.initializationExceptionPendingExceptionHolder = new y70();
        this.writeExceptionPendingExceptionHolder = new y70();
        this.audioOffloadListener = builder.audioOffloadListener;
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j) {
        PlaybackParameters playbackParametersApplyPlaybackParameters;
        boolean zApplySkipSilenceEnabled;
        if (shouldApplyAudioProcessorPlaybackParameters()) {
            playbackParametersApplyPlaybackParameters = this.audioProcessorChain.applyPlaybackParameters(getAudioProcessorPlaybackParameters());
        } else {
            playbackParametersApplyPlaybackParameters = PlaybackParameters.DEFAULT;
        }
        PlaybackParameters playbackParameters = playbackParametersApplyPlaybackParameters;
        if (shouldApplyAudioProcessorPlaybackParameters()) {
            zApplySkipSilenceEnabled = this.audioProcessorChain.applySkipSilenceEnabled(getSkipSilenceEnabled());
        } else {
            zApplySkipSilenceEnabled = false;
        }
        boolean z = zApplySkipSilenceEnabled;
        this.mediaPositionParametersCheckpoints.add(new x70(playbackParameters, z, Math.max(0L, j), (getWrittenFrames() * 1000000) / ((long) this.configuration.e)));
        setupAudioProcessors();
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(z);
        }
    }

    private PlaybackParameters getAudioProcessorPlaybackParameters() {
        return getMediaPositionParameters().a;
    }

    private static int getAudioTrackMinBufferSize(int i, int i2, int i3) {
        boolean z;
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        if (minBufferSize != -2) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        return minBufferSize;
    }

    private static void releaseAudioTrackAsync(AudioTrack audioTrack, ConditionVariable conditionVariable) {
        conditionVariable.close();
        synchronized (releaseExecutorLock) {
            try {
                if (releaseExecutor == null) {
                    releaseExecutor = Util.newSingleThreadExecutor("ExoPlayer:AudioTrackReleaseThread");
                }
                pendingReleaseCount++;
                releaseExecutor.execute(new g20(13, audioTrack, conditionVariable));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void setAudioProcessorPlaybackParametersAndSkipSilence(PlaybackParameters playbackParameters, boolean z) {
        x70 mediaPositionParameters = getMediaPositionParameters();
        if (playbackParameters.equals(mediaPositionParameters.a) && z == mediaPositionParameters.b) {
            return;
        }
        x70 x70Var = new x70(playbackParameters, z, -9223372036854775807L, -9223372036854775807L);
        if (isAudioTrackInitialized()) {
            this.afterDrainParameters = x70Var;
        } else {
            this.mediaPositionParameters = x70Var;
        }
    }

    @RequiresApi
    private void setAudioTrackPlaybackParametersV23(PlaybackParameters playbackParameters) {
        if (isAudioTrackInitialized()) {
            try {
                this.audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(playbackParameters.speed).setPitch(playbackParameters.pitch).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                Log.w(TAG, "Failed to set playback params", e);
            }
            playbackParameters = new PlaybackParameters(this.audioTrack.getPlaybackParams().getSpeed(), this.audioTrack.getPlaybackParams().getPitch());
            fb fbVar = this.audioTrackPositionTracker;
            fbVar.j = playbackParameters.speed;
            eb ebVar = fbVar.f;
            if (ebVar != null) {
                ebVar.a();
            }
        }
        this.audioTrackPlaybackParameters = playbackParameters;
    }

    private void setVolumeInternal() {
        if (!isAudioTrackInitialized()) {
            return;
        }
        int i = Util.SDK_INT;
        AudioTrack audioTrack = this.audioTrack;
        if (i >= 21) {
            setVolumeInternalV21(audioTrack, this.volume);
        } else {
            setVolumeInternalV3(audioTrack, this.volume);
        }
    }

    @RequiresApi
    private static void setVolumeInternalV21(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    private static void setVolumeInternalV3(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    private void writeBuffer(ByteBuffer byteBuffer, long j) throws Exception {
        DefaultAudioSink defaultAudioSink;
        ByteBuffer byteBuffer2;
        int iWriteNonBlockingV21;
        boolean z;
        AudioSink.Listener listener;
        boolean z2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.outputBuffer;
            boolean z3 = true;
            if (byteBuffer3 != null) {
                if (byteBuffer3 == byteBuffer) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Assertions.checkArgument(z2);
            } else {
                this.outputBuffer = byteBuffer;
                if (Util.SDK_INT < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.preV21OutputBuffer;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.preV21OutputBuffer = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.preV21OutputBuffer, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.preV21OutputBufferOffset = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (Util.SDK_INT < 21) {
                fb fbVar = this.audioTrackPositionTracker;
                int iA = fbVar.e - ((int) (this.writtenPcmBytes - (fbVar.a() * ((long) fbVar.d))));
                if (iA > 0) {
                    iWriteNonBlockingV21 = this.audioTrack.write(this.preV21OutputBuffer, this.preV21OutputBufferOffset, Math.min(iRemaining2, iA));
                    if (iWriteNonBlockingV21 > 0) {
                        this.preV21OutputBufferOffset += iWriteNonBlockingV21;
                        byteBuffer.position(byteBuffer.position() + iWriteNonBlockingV21);
                    }
                } else {
                    iWriteNonBlockingV21 = 0;
                }
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
            } else if (this.tunneling) {
                if (j != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                Assertions.checkState(z);
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iWriteNonBlockingV21 = defaultAudioSink.writeNonBlockingWithAvSyncV21(this.audioTrack, byteBuffer2, iRemaining2, j);
            } else {
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iWriteNonBlockingV21 = writeNonBlockingV21(defaultAudioSink.audioTrack, byteBuffer2, iRemaining2);
            }
            defaultAudioSink.lastFeedElapsedRealtimeMs = SystemClock.elapsedRealtime();
            if (iWriteNonBlockingV21 < 0) {
                if (!isAudioTrackDeadObject(iWriteNonBlockingV21) || defaultAudioSink.writtenEncodedFrames <= 0) {
                    z3 = false;
                }
                AudioSink.WriteException writeException = new AudioSink.WriteException(iWriteNonBlockingV21, defaultAudioSink.configuration.a, z3);
                AudioSink.Listener listener2 = defaultAudioSink.listener;
                if (listener2 != null) {
                    listener2.onAudioSinkError(writeException);
                }
                if (!writeException.isRecoverable) {
                    defaultAudioSink.writeExceptionPendingExceptionHolder.a(writeException);
                    return;
                }
                throw writeException;
            }
            defaultAudioSink.writeExceptionPendingExceptionHolder.a = null;
            if (isOffloadedPlayback(defaultAudioSink.audioTrack)) {
                if (defaultAudioSink.writtenEncodedFrames > 0) {
                    defaultAudioSink.isWaitingForOffloadEndOfStreamHandled = false;
                }
                if (defaultAudioSink.playing && (listener = defaultAudioSink.listener) != null && iWriteNonBlockingV21 < iRemaining2 && !defaultAudioSink.isWaitingForOffloadEndOfStreamHandled) {
                    listener.onOffloadBufferFull();
                }
            }
            int i = defaultAudioSink.configuration.c;
            if (i == 0) {
                defaultAudioSink.writtenPcmBytes += (long) iWriteNonBlockingV21;
            }
            if (iWriteNonBlockingV21 == iRemaining2) {
                if (i != 0) {
                    if (byteBuffer2 != defaultAudioSink.inputBuffer) {
                        z3 = false;
                    }
                    Assertions.checkState(z3);
                    defaultAudioSink.writtenEncodedFrames = (((long) defaultAudioSink.framesPerEncodedSample) * ((long) defaultAudioSink.inputBufferAccessUnitCount)) + defaultAudioSink.writtenEncodedFrames;
                }
                defaultAudioSink.outputBuffer = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (((AudioTrack) Assertions.checkNotNull(this.audioTrackPositionTracker.c)).getPlayState() == 3) {
                this.audioTrack.pause();
            }
            if (isOffloadedPlayback(this.audioTrack)) {
                a80 a80Var = (a80) Assertions.checkNotNull(this.offloadStreamEventCallbackV29);
                this.audioTrack.unregisterStreamEventCallback(a80Var.b);
                a80Var.a.removeCallbacksAndMessages(null);
            }
            if (Util.SDK_INT < 21 && !this.externalAudioSessionIdProvided) {
                this.audioSessionId = 0;
            }
            c cVar = this.pendingConfiguration;
            if (cVar != null) {
                this.configuration = cVar;
                this.pendingConfiguration = null;
            }
            fb fbVar = this.audioTrackPositionTracker;
            fbVar.l = 0L;
            fbVar.w = 0;
            fbVar.v = 0;
            fbVar.m = 0L;
            fbVar.C = 0L;
            fbVar.F = 0L;
            fbVar.k = false;
            fbVar.c = null;
            fbVar.f = null;
            releaseAudioTrackAsync(this.audioTrack, this.releasingConditionVariable);
            this.audioTrack = null;
        }
        this.writeExceptionPendingExceptionHolder.a = null;
        this.initializationExceptionPendingExceptionHolder.a = null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return getMediaPositionParameters().b;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean hasPendingData() {
        if (isAudioTrackInitialized() && this.audioTrackPositionTracker.b(getWrittenFrames())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean isEnded() {
        if (isAudioTrackInitialized()) {
            if (!this.handledEndOfStream || hasPendingData()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        for (AudioProcessor audioProcessor : this.toIntPcmAvailableAudioProcessors) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.toFloatPcmAvailableAudioProcessors) {
            audioProcessor2.reset();
        }
        this.playing = false;
        this.offloadDisabledUntilNextConfiguration = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z) {
        setAudioProcessorPlaybackParametersAndSkipSilence(getAudioProcessorPlaybackParameters(), z);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean supportsFormat(Format format) {
        if (getFormatSupport(format) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    @Deprecated
    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessorArr) {
        this(new Builder().setAudioCapabilities((AudioCapabilities) uj2.e(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr));
    }

    @Deprecated
    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessorArr, boolean z) {
        this(new Builder().setAudioCapabilities((AudioCapabilities) uj2.e(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr).setEnableFloatOutput(z));
    }

    @Deprecated
    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessorChain audioProcessorChain, boolean z, boolean z2, int i) {
        this(new Builder().setAudioCapabilities((AudioCapabilities) uj2.e(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessorChain(audioProcessorChain).setEnableFloatOutput(z).setEnableAudioTrackPlaybackParams(z2).setOffloadMode(i));
    }
}
