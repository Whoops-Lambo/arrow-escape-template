package io.p071bidmachine.media3.extractor;

import com.inmobi.media.core.config.models.AdConfig;
import io.p071bidmachine.media3.common.util.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class f0 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(e0 e0Var, d0 d0Var) {
        if (this.c > 0) {
            e0Var.b(this.d, this.e, this.f, this.g, d0Var);
            this.c = 0;
        }
    }

    public final void b(e0 e0Var, long j, int i, int i2, int i3, d0 d0Var) {
        a.h("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(e0Var, d0Var);
            }
        }
    }

    public final void c(n nVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        int i = 0;
        nVar.peekFully(bArr, 0, 10);
        nVar.resetPeekPosition();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
