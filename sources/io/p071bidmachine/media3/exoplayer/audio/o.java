package io.p071bidmachine.media3.exoplayer.audio;

import android.media.AudioTrack;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class o {
    public final n a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public final void a() {
        if (this.a != null) {
            b(0);
        }
    }

    public final void b(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (i == 1) {
            this.d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else if (i == 4) {
            this.d = 500000L;
        } else {
            y.b();
        }
    }

    public o(AudioTrack audioTrack) {
        this.a = new n(audioTrack);
        a();
    }
}
