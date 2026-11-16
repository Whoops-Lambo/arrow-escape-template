package defpackage;

import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzge;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.container.d;
import io.p071bidmachine.media3.extractor.mp4.a;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class ca implements ba, a, ks3 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;

    public ca(zzge zzgeVar) {
        this.a = 3;
        zzey zzeyVar = zzgeVar.b;
        this.f = zzeyVar;
        zzeyVar.E(12);
        this.c = zzeyVar.h() & 255;
        this.b = zzeyVar.h();
    }

    @Override // defpackage.ks3
    public int zzb() {
        return -1;
    }

    public void a(int i) {
        int i2 = this.d;
        int[] iArr = (int[]) this.f;
        if (i2 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                y.b();
                return;
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i3 = this.b;
            int i4 = length2 - i3;
            System.arraycopy(iArr, i3, iArr2, 0, i4);
            System.arraycopy((int[]) this.f, 0, iArr2, i4, i3);
            this.b = 0;
            this.c = this.d - 1;
            this.f = iArr2;
            this.e = length - 1;
        }
        int i5 = (this.c + 1) & this.e;
        this.c = i5;
        ((int[]) this.f)[i5] = i;
        this.d++;
    }

    public int b() {
        int i = this.d;
        if (i == 0) {
            d.v();
            return 0;
        }
        int[] iArr = (int[]) this.f;
        int i2 = this.b;
        int i3 = iArr[i2];
        this.b = (i2 + 1) & this.e;
        this.d = i - 1;
        return i3;
    }

    @Override // defpackage.ba, io.p071bidmachine.media3.extractor.mp4.a
    public int getFixedSampleSize() {
        switch (this.a) {
        }
        return -1;
    }

    @Override // defpackage.ba, io.p071bidmachine.media3.extractor.mp4.a
    public int getSampleCount() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // defpackage.ba, io.p071bidmachine.media3.extractor.mp4.a
    public int readNextSampleSize() {
        switch (this.a) {
            case 0:
                ParsableByteArray parsableByteArray = (ParsableByteArray) this.f;
                int i = this.c;
                if (i == 8) {
                    return parsableByteArray.readUnsignedByte();
                }
                if (i == 16) {
                    return parsableByteArray.readUnsignedShort();
                }
                int i2 = this.d;
                this.d = i2 + 1;
                if (i2 % 2 != 0) {
                    return this.e & 15;
                }
                int unsignedByte = parsableByteArray.readUnsignedByte();
                this.e = unsignedByte;
                return (unsignedByte & 240) >> 4;
            default:
                q qVar = (q) this.f;
                int i3 = this.c;
                if (i3 == 8) {
                    return qVar.t();
                }
                if (i3 == 16) {
                    return qVar.z();
                }
                int i4 = this.d;
                this.d = i4 + 1;
                if (i4 % 2 != 0) {
                    return this.e & 15;
                }
                int iT = qVar.t();
                this.e = iT;
                return (iT & 240) >> 4;
        }
    }

    @Override // defpackage.ks3
    public int zza() {
        return this.b;
    }

    @Override // defpackage.ks3
    public int zzc() {
        zzey zzeyVar = (zzey) this.f;
        int i = this.c;
        if (i == 8) {
            return zzeyVar.K();
        }
        if (i == 16) {
            return zzeyVar.L();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int iK = zzeyVar.K();
        this.e = iK;
        return (iK & 240) >> 4;
    }

    public ca() {
        this.a = 1;
        this.b = 0;
        this.c = -1;
        this.d = 0;
        int[] iArr = new int[16];
        this.f = iArr;
        this.e = iArr.length - 1;
    }

    public ca(x9 x9Var) {
        this.a = 0;
        ParsableByteArray parsableByteArray = x9Var.c;
        this.f = parsableByteArray;
        parsableByteArray.setPosition(12);
        this.c = parsableByteArray.readUnsignedIntToInt() & 255;
        this.b = parsableByteArray.readUnsignedIntToInt();
    }

    public ca(d dVar) {
        this.a = 2;
        q qVar = dVar.c;
        this.f = qVar;
        qVar.F(12);
        this.c = qVar.x() & 255;
        this.b = qVar.x();
    }
}
