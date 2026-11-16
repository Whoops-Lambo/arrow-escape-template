package com.google.android.exoplayer2;

import android.media.MediaFormat;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements VideoFrameMetadataListener, CameraMotionListener, PlayerMessage.Target {
    public VideoFrameMetadataListener a;
    public CameraMotionListener b;
    public VideoFrameMetadataListener c;
    public CameraMotionListener d;

    @Override // com.google.android.exoplayer2.PlayerMessage.Target
    public final void handleMessage(int i, Object obj) {
        if (i == 7) {
            this.a = (VideoFrameMetadataListener) obj;
            return;
        }
        if (i == 8) {
            this.b = (CameraMotionListener) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
        if (sphericalGLSurfaceView == null) {
            this.c = null;
            this.d = null;
        } else {
            this.c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
            this.d = sphericalGLSurfaceView.getCameraMotionListener();
        }
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public final void onCameraMotion(long j, float[] fArr) {
        CameraMotionListener cameraMotionListener = this.d;
        if (cameraMotionListener != null) {
            cameraMotionListener.onCameraMotion(j, fArr);
        }
        CameraMotionListener cameraMotionListener2 = this.b;
        if (cameraMotionListener2 != null) {
            cameraMotionListener2.onCameraMotion(j, fArr);
        }
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public final void onCameraMotionReset() {
        CameraMotionListener cameraMotionListener = this.d;
        if (cameraMotionListener != null) {
            cameraMotionListener.onCameraMotionReset();
        }
        CameraMotionListener cameraMotionListener2 = this.b;
        if (cameraMotionListener2 != null) {
            cameraMotionListener2.onCameraMotionReset();
        }
    }

    @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
    public final void onVideoFrameAboutToBeRendered(long j, long j2, Format format, MediaFormat mediaFormat) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.c;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j2, format, mediaFormat);
        }
        VideoFrameMetadataListener videoFrameMetadataListener2 = this.a;
        if (videoFrameMetadataListener2 != null) {
            videoFrameMetadataListener2.onVideoFrameAboutToBeRendered(j, j2, format, mediaFormat);
        }
    }
}
