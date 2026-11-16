package com.google.android.gms.games;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.games.video.CaptureState;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.tasks.Task;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface VideosClient {
    public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STARTED = 2;
    public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STOPPED = 3;
    public static final int CAPTURE_OVERLAY_STATE_DISMISSED = 4;
    public static final int CAPTURE_OVERLAY_STATE_SHOWN = 1;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CaptureOverlayState {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Deprecated
    public interface OnCaptureOverlayStateListener {
        @Deprecated
        void onCaptureOverlayStateChanged(int i);
    }

    @NonNull
    @Deprecated
    Task<VideoCapabilities> getCaptureCapabilities();

    @NonNull
    @Deprecated
    Task<Intent> getCaptureOverlayIntent();

    @NonNull
    @Deprecated
    Task<CaptureState> getCaptureState();

    @NonNull
    @Deprecated
    Task<Boolean> isCaptureAvailable(int i);

    @NonNull
    @Deprecated
    Task<Boolean> isCaptureSupported();

    @NonNull
    @Deprecated
    Task<Void> registerOnCaptureOverlayStateChangedListener(@NonNull OnCaptureOverlayStateListener onCaptureOverlayStateListener);

    @NonNull
    @Deprecated
    Task<Boolean> unregisterOnCaptureOverlayStateChangedListener(@NonNull OnCaptureOverlayStateListener onCaptureOverlayStateListener);
}
