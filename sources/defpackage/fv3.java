package defpackage;

import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzfn;
import com.google.android.gms.internal.ads.zzfq;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fv3 {
    public final zzfn a;
    public final zzey b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public long h;

    public static long a(zzey zzeyVar) {
        int i = zzeyVar.b;
        if (zzeyVar.B() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzeyVar.H(0, 9, bArr);
        zzeyVar.E(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    public static final int c(byte[] bArr, int i) {
        return (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public void b(zzagp zzagpVar) {
        byte[] bArr = zzfq.b;
        int length = bArr.length;
        this.b.z(0, bArr);
        this.c = true;
        zzagpVar.zzl();
    }

    public fv3(int i) {
        switch (i) {
            case 1:
                this.a = new zzfn();
                this.f = -9223372036854775807L;
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.b = new zzey();
                break;
            default:
                this.a = new zzfn();
                this.f = -9223372036854775807L;
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.b = new zzey();
                break;
        }
    }
}
