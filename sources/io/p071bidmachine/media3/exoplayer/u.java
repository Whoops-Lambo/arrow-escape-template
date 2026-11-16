package io.p071bidmachine.media3.exoplayer;

import android.media.MediaFormat;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.exoplayer.video.p;
import io.p071bidmachine.media3.exoplayer.video.spherical.a;
import io.p071bidmachine.media3.exoplayer.video.spherical.j;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class u implements p, a, w0 {
    public p a;
    public a b;
    public p c;
    public a d;

    @Override // io.p071bidmachine.media3.exoplayer.w0
    public final void handleMessage(int i, Object obj) {
        if (i == 7) {
            this.a = (p) obj;
            return;
        }
        if (i == 8) {
            this.b = (a) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        j jVar = (j) obj;
        if (jVar == null) {
            this.c = null;
            this.d = null;
        } else {
            this.c = jVar.getVideoFrameMetadataListener();
            this.d = jVar.getCameraMotionListener();
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.video.p
    public final void a(long j, long j2, n nVar, MediaFormat mediaFormat) {
        p pVar = this.c;
        if (pVar != null) {
            pVar.a(j, j2, nVar, mediaFormat);
        }
        p pVar2 = this.a;
        if (pVar2 != null) {
            pVar2.a(j, j2, nVar, mediaFormat);
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.video.spherical.a
    public final void onCameraMotion(long j, float[] fArr) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.onCameraMotion(j, fArr);
        }
        a aVar2 = this.b;
        if (aVar2 != null) {
            aVar2.onCameraMotion(j, fArr);
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.video.spherical.a
    public final void onCameraMotionReset() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.onCameraMotionReset();
        }
        a aVar2 = this.b;
        if (aVar2 != null) {
            aVar2.onCameraMotionReset();
        }
    }
}
