package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzge;
import com.google.android.gms.internal.ads.zzv;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vr3 implements ba, ks3 {
    public static final long[] e = {128, 64, 32, 16, 8, 4, 2, 1};
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final Object d;

    public vr3(zzge zzgeVar, zzv zzvVar) {
        this.a = 3;
        zzey zzeyVar = zzgeVar.b;
        this.d = zzeyVar;
        zzeyVar.E(12);
        int iH = zzeyVar.h();
        if ("audio/raw".equals(zzvVar.o)) {
            int iF = zzfq.f(zzvVar.K) * zzvVar.H;
            if (iH % iF != 0) {
                zzeh.c("BoxParsers", pv1.j(iF, iH, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: ", new StringBuilder(String.valueOf(iF).length() + 66 + String.valueOf(iH).length())));
                iH = iF;
            }
        }
        this.b = iH == 0 ? -1 : iH;
        this.c = zzeyVar.h();
    }

    public static long e(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~e[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public byte a(int i, int i2) {
        return ((byte[][]) this.d)[i2][i];
    }

    public void b(int i, int i2, int i3) {
        ((byte[][]) this.d)[i2][i] = (byte) i3;
    }

    public void c(int i, int i2, boolean z) {
        ((byte[][]) this.d)[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public long d(zzagp zzagpVar, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = (byte[]) this.d;
        if (this.b == 0) {
            if (!zzagpVar.j(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                i2 = i4 + 1;
                if ((e[i4] & ((long) i3)) != 0) {
                    break;
                }
                i4 = i2;
            }
            this.c = i2;
            if (i2 == -1) {
                e32.i("No valid varint length mask found");
                return 0L;
            }
            this.b = 1;
        }
        int i5 = this.c;
        if (i5 > i) {
            this.b = 0;
            return -2L;
        }
        if (i5 != 1) {
            zzagpVar.h(bArr, 1, i5 - 1);
        }
        this.b = 0;
        return e(bArr, this.c, z2);
    }

    @Override // defpackage.ba, io.p071bidmachine.media3.extractor.mp4.a
    public int getFixedSampleSize() {
        return this.b;
    }

    @Override // defpackage.ba, io.p071bidmachine.media3.extractor.mp4.a
    public int getSampleCount() {
        return this.c;
    }

    @Override // defpackage.ba, io.p071bidmachine.media3.extractor.mp4.a
    public int readNextSampleSize() {
        int i = this.b;
        return i == -1 ? ((ParsableByteArray) this.d).readUnsignedIntToInt() : i;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                int i = this.b;
                int i2 = this.c;
                StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.d)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ks3
    public int zza() {
        return this.c;
    }

    @Override // defpackage.ks3
    public int zzb() {
        return this.b;
    }

    @Override // defpackage.ks3
    public int zzc() {
        int i = this.b;
        return i == -1 ? ((zzey) this.d).h() : i;
    }

    public vr3() {
        this.a = 0;
        this.d = new byte[8];
    }

    public vr3(int i, int i2) {
        this.a = 2;
        this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.b = i;
        this.c = i2;
    }

    public vr3(x9 x9Var, Format format) {
        this.a = 1;
        ParsableByteArray parsableByteArray = x9Var.c;
        this.d = parsableByteArray;
        parsableByteArray.setPosition(12);
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if ("audio/raw".equals(format.sampleMimeType)) {
            int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
            if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                Log.w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                unsignedIntToInt = pcmFrameSize;
            }
        }
        this.b = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
        this.c = parsableByteArray.readUnsignedIntToInt();
    }
}
