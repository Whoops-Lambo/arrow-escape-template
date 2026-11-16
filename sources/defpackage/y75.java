package defpackage;

import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y75 {
    public final db a;
    public final int b;
    public final r85 c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public final void a(int i) {
        this.d = i;
        long j = 10000;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.f = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.f = j;
    }

    public y75(AudioTrack audioTrack, r85 r85Var) {
        this.a = new db(audioTrack, 1);
        this.b = audioTrack.getSampleRate();
        this.c = r85Var;
        a(0);
    }
}
