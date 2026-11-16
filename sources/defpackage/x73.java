package defpackage;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzey;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.extractor.n;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class x73 {
    public final int a;
    public final long b;

    public boolean a() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public static x73 c(n nVar, q qVar) {
        nVar.peekFully(qVar.a, 0, 8);
        qVar.F(0);
        int iG = qVar.g();
        return new x73(qVar.k(), iG, false);
    }

    public static x73 d(zzagp zzagpVar, zzey zzeyVar) {
        zzagpVar.f(0, 8, zzeyVar.a);
        zzeyVar.E(0);
        int iB = zzeyVar.b();
        return new x73(zzeyVar.a(), iB, false);
    }

    public x73(int i, long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        a.c(z);
        this.a = i;
        this.b = j;
    }

    public static x73 b(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) {
        extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
        parsableByteArray.setPosition(0);
        int i = parsableByteArray.readInt();
        return new x73(parsableByteArray.readLittleEndianUnsignedInt(), i, false);
    }

    public /* synthetic */ x73(long j, int i, boolean z) {
        this.a = i;
        this.b = j;
    }
}
