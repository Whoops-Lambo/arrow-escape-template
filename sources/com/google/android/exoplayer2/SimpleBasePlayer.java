package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Size;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.util.concurrent.ListenableFuture;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.e32;
import defpackage.ek1;
import defpackage.fa0;
import defpackage.ol2;
import defpackage.sf2;
import defpackage.sj0;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class SimpleBasePlayer extends BasePlayer {
    private final HandlerWrapper applicationHandler;
    private final Looper applicationLooper;
    private final ListenerSet<Player.Listener> listeners;
    private final HashSet<ListenableFuture> pendingOperations;
    private State state;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class State {
        public final Player.Commands availableCommands;
        public final boolean playWhenReady;
        public final int playWhenReadyChangeReason;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static final class Builder {
            private Player.Commands availableCommands;
            private boolean playWhenReady;
            private int playWhenReadyChangeReason;

            public State build() {
                return new State(this);
            }

            public Builder setAvailableCommands(Player.Commands commands) {
                this.availableCommands = commands;
                return this;
            }

            public Builder setPlayWhenReady(boolean z, int i) {
                this.playWhenReady = z;
                this.playWhenReadyChangeReason = i;
                return this;
            }

            private Builder(State state) {
                this.availableCommands = state.availableCommands;
                this.playWhenReady = state.playWhenReady;
                this.playWhenReadyChangeReason = state.playWhenReadyChangeReason;
            }

            public Builder() {
                this.availableCommands = Player.Commands.EMPTY;
                this.playWhenReady = false;
                this.playWhenReadyChangeReason = 1;
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.playWhenReady == state.playWhenReady && this.playWhenReadyChangeReason == state.playWhenReadyChangeReason && this.availableCommands.equals(state.availableCommands);
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public int hashCode() {
            return ((((this.availableCommands.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + (this.playWhenReady ? 1 : 0)) * 31) + this.playWhenReadyChangeReason;
        }

        private State(Builder builder) {
            this.availableCommands = builder.availableCommands;
            this.playWhenReady = builder.playWhenReady;
            this.playWhenReadyChangeReason = builder.playWhenReadyChangeReason;
        }
    }

    public State getPlaceholderState(State state) {
        return state;
    }

    public abstract State getState();

    private static boolean isPlaying(State state) {
        boolean z = state.playWhenReady;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Player.Listener listener, FlagSet flagSet) {
        listener.onEvents(this, new Player.Events(flagSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$2(State state, Player.Listener listener) {
        listener.onPlayerStateChanged(state.playWhenReady, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$3(State state, Player.Listener listener) {
        listener.onPlayWhenReadyChanged(state.playWhenReady, state.playWhenReadyChangeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$5(State state, Player.Listener listener) {
        listener.onAvailableCommandsChanged(state.availableCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateStateForPendingOperation$6(ListenableFuture listenableFuture) {
        Util.castNonNull(this.state);
        this.pendingOperations.remove(listenableFuture);
        if (this.pendingOperations.isEmpty()) {
            updateStateAndInformListeners(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(Runnable runnable) {
        if (this.applicationHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.applicationHandler.post(runnable);
        }
    }

    private void updateStateAndInformListeners(final State state) {
        State state2 = this.state;
        this.state = state;
        final int i = 0;
        final int i2 = 1;
        boolean z = state2.playWhenReady != state.playWhenReady;
        if (z) {
            this.listeners.queueEvent(-1, new ListenerSet.Event() { // from class: rf2
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    int i3 = i;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (i3) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$2(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$3(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$4(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$5(state3, listener);
                            break;
                    }
                }
            });
        }
        if (z || state2.playWhenReadyChangeReason != state.playWhenReadyChangeReason) {
            this.listeners.queueEvent(5, new ListenerSet.Event() { // from class: rf2
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    int i3 = i2;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (i3) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$2(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$3(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$4(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$5(state3, listener);
                            break;
                    }
                }
            });
        }
        if (isPlaying(state2) != isPlaying(state)) {
            final int i3 = 2;
            this.listeners.queueEvent(7, new ListenerSet.Event() { // from class: rf2
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    int i4 = i3;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (i4) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$2(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$3(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$4(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$5(state3, listener);
                            break;
                    }
                }
            });
        }
        if (!state2.availableCommands.equals(state.availableCommands)) {
            final int i4 = 3;
            this.listeners.queueEvent(13, new ListenerSet.Event() { // from class: rf2
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    int i5 = i4;
                    SimpleBasePlayer.State state3 = state;
                    Player.Listener listener = (Player.Listener) obj;
                    switch (i5) {
                        case 0:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$2(state3, listener);
                            break;
                        case 1:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$3(state3, listener);
                            break;
                        case 2:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$4(state3, listener);
                            break;
                        default:
                            SimpleBasePlayer.lambda$updateStateAndInformListeners$5(state3, listener);
                            break;
                    }
                }
            });
        }
        this.listeners.flushEvents();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addListener(Player.Listener listener) {
        this.listeners.add((Player.Listener) Assertions.checkNotNull(listener));
    }

    @Override // com.google.android.exoplayer2.Player
    public final void addMediaItems(int i, List<MediaItem> list) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void clearVideoSurface() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void clearVideoTextureView(@Nullable TextureView textureView) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void decreaseDeviceVolume() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // com.google.android.exoplayer2.Player
    public final AudioAttributes getAudioAttributes() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getBufferedPosition() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentBufferedPosition() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentPosition() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdGroupIndex() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdIndexInAdGroup() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final CueGroup getCurrentCues() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentMediaItemIndex() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentPeriodIndex() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentPosition() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final Timeline getCurrentTimeline() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final Tracks getCurrentTracks() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final DeviceInfo getDeviceInfo() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getDeviceVolume() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getDuration() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getMaxSeekToPreviousPosition() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final MediaMetadata getMediaMetadata() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final PlaybackParameters getPlaybackParameters() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPlaybackState() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPlaybackSuppressionReason() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public final PlaybackException getPlayerError() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final MediaMetadata getPlaylistMetadata() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getRepeatMode() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getSeekBackIncrement() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getSeekForwardIncrement() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getShuffleModeEnabled() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final Size getSurfaceSize() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getTotalBufferedDuration() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final TrackSelectionParameters getTrackSelectionParameters() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final VideoSize getVideoSize() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final float getVolume() {
        throw new IllegalStateException();
    }

    public ListenableFuture handleSetPlayWhenReady(boolean z) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void increaseDeviceVolume() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isDeviceMuted() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isLoading() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isPlayingAd() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void moveMediaItems(int i, int i2, int i3) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void prepare() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void release() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void removeMediaItems(int i, int i2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void seekTo(int i, long j) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setDeviceMuted(boolean z) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setDeviceVolume(int i) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItems(List<MediaItem> list, boolean z) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlaybackParameters(PlaybackParameters playbackParameters) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setRepeatMode(int i) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setShuffleModeEnabled(boolean z) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setVideoSurface(@Nullable Surface surface) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setVideoTextureView(@Nullable TextureView textureView) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setVolume(float f) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void stop() {
        throw new IllegalStateException();
    }

    public SimpleBasePlayer(Looper looper, Clock clock) {
        this.applicationLooper = looper;
        this.applicationHandler = clock.createHandler(looper, null);
        this.pendingOperations = new HashSet<>();
        this.listeners = new ListenerSet<>(looper, clock, new sj0(this, 28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ State lambda$setPlayWhenReady$1(State state, boolean z) {
        return state.buildUpon().setPlayWhenReady(z, 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateStateAndInformListeners$4(State state, Player.Listener listener) {
        listener.onIsPlayingChanged(isPlaying(state));
    }

    private void updateStateForPendingOperation(ListenableFuture listenableFuture, ol2 ol2Var) {
        if (listenableFuture.isDone() && this.pendingOperations.isEmpty()) {
            updateStateAndInformListeners(getState());
            return;
        }
        this.pendingOperations.add(listenableFuture);
        updateStateAndInformListeners(getPlaceholderState((State) ol2Var.get()));
        listenableFuture.addListener(new ek1(27, this, listenableFuture), new fa0(this, 2));
    }

    private void verifyApplicationThreadAndInitState() {
        if (Thread.currentThread() == this.applicationLooper.getThread()) {
            if (this.state == null) {
                this.state = getState();
                return;
            }
            return;
        }
        e32.i(Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.applicationLooper.getThread().getName()));
    }

    @Override // com.google.android.exoplayer2.Player
    public final Player.Commands getAvailableCommands() {
        verifyApplicationThreadAndInitState();
        return this.state.availableCommands;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getPlayWhenReady() {
        verifyApplicationThreadAndInitState();
        return this.state.playWhenReady;
    }

    public final void invalidateState() {
        verifyApplicationThreadAndInitState();
        if (!this.pendingOperations.isEmpty()) {
            return;
        }
        updateStateAndInformListeners(getState());
    }

    @Override // com.google.android.exoplayer2.Player
    public final void removeListener(Player.Listener listener) {
        Assertions.checkNotNull(listener);
        this.listeners.remove(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlayWhenReady(boolean z) {
        verifyApplicationThreadAndInitState();
        State state = this.state;
        if (!state.availableCommands.contains(1)) {
            return;
        }
        updateStateForPendingOperation(handleSetPlayWhenReady(z), new sf2(4, state, z));
    }

    @Override // com.google.android.exoplayer2.Player
    public final void clearVideoSurface(@Nullable Surface surface) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setMediaItems(List<MediaItem> list, int i, long j) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void stop(boolean z) {
        throw new IllegalStateException();
    }

    public SimpleBasePlayer(Looper looper) {
        this(looper, Clock.DEFAULT);
    }
}
