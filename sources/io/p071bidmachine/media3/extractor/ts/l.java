package io.p071bidmachine.media3.extractor.ts;

import com.google.android.gms.internal.ads.zzaia;
import com.google.android.gms.internal.ads.zzgvz;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.extractor.e0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class l {
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    public long g;
    public final Object h;

    public /* synthetic */ l(Object obj) {
        this.h = obj;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = this.e;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.e = (i2 - i) + i3;
            } else {
                this.c = ((bArr[i4] & 192) >> 6) == 0;
                this.b = false;
            }
        }
    }

    public void b(long j, int i, boolean z) {
        a.i(this.g != -9223372036854775807L);
        if (this.d == 182 && z && this.a) {
            ((e0) this.h).b(this.g, this.c ? 1 : 0, (int) (j - this.f), i, null);
        }
        if (this.d != 179) {
            this.f = j;
        }
    }

    public void c(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = this.e;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.e = (i2 - i) + i3;
            } else {
                this.c = ((bArr[i4] & 192) >> 6) == 0;
                this.b = false;
            }
        }
    }

    public void d(long j, int i, boolean z) {
        zzgvz.f(this.g != -9223372036854775807L);
        if (this.d == 182 && z && this.a) {
            ((zzaia) this.h).e(this.g, this.c ? 1 : 0, (int) (j - this.f), i, null);
        }
        if (this.d != 179) {
            this.f = j;
        }
    }
}
