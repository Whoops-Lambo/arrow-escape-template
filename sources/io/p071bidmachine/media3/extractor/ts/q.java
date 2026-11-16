package io.p071bidmachine.media3.extractor.ts;

import com.google.android.gms.internal.ads.zzaia;
import io.p071bidmachine.media3.extractor.e0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class q {
    public long a;
    public boolean b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public long k;
    public boolean l;
    public final Object m;

    public void a(int i) {
        long j = this.k;
        if (j != -9223372036854775807L) {
            long j2 = this.a;
            long j3 = this.j;
            if (j2 == j3) {
                return;
            }
            int i2 = (int) (j2 - j3);
            ((e0) this.m).b(j, this.l ? 1 : 0, i2, i, null);
        }
    }

    public void b(int i) {
        long j = this.k;
        if (j != -9223372036854775807L) {
            long j2 = this.a;
            long j3 = this.j;
            if (j2 == j3) {
                return;
            }
            int i2 = (int) (j2 - j3);
            ((zzaia) this.m).e(j, this.l ? 1 : 0, i2, i, null);
        }
    }
}
