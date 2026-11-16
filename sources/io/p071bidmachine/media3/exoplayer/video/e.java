package io.p071bidmachine.media3.exoplayer.video;

import android.view.Surface;
import androidx.annotation.Nullable;
import io.p071bidmachine.media3.exoplayer.mediacodec.l;
import io.p071bidmachine.media3.exoplayer.mediacodec.m;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class e extends l {
    public final int d;
    public final boolean e;

    public e(Throwable th, @Nullable m mVar, @Nullable Surface surface) {
        boolean z;
        super(th, mVar);
        this.d = System.identityHashCode(surface);
        if (surface != null && !surface.isValid()) {
            z = false;
        } else {
            z = true;
        }
        this.e = z;
    }
}
