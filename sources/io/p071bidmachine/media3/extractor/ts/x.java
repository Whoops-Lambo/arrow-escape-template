package io.p071bidmachine.media3.extractor.ts;

import com.inmobi.media.core.config.models.AdConfig;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.common.util.v;
import io.p071bidmachine.media3.extractor.n;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class x {
    public final /* synthetic */ int a;
    public final v b;
    public final q c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public x(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new v(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new q();
                break;
            default:
                this.b = new v(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new q();
                break;
        }
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public static long c(q qVar) {
        int i = qVar.b;
        if (qVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        qVar.e(bArr, 0, 9);
        qVar.F(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(n nVar) {
        int i = this.a;
        q qVar = this.c;
        switch (i) {
            case 0:
                byte[] bArr = io.p071bidmachine.media3.common.util.x.c;
                qVar.getClass();
                qVar.D(bArr, bArr.length);
                this.d = true;
                nVar.resetPeekPosition();
                break;
            default:
                byte[] bArr2 = io.p071bidmachine.media3.common.util.x.c;
                qVar.getClass();
                qVar.D(bArr2, bArr2.length);
                this.d = true;
                nVar.resetPeekPosition();
                break;
        }
    }
}
