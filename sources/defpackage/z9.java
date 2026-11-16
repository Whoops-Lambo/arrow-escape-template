package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.gms.internal.ads.zzags;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzey;
import io.p071bidmachine.media3.common.g0;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.extractor.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class z9 {
    public final /* synthetic */ int a = 0;
    public final int b;
    public int c;
    public int d;
    public long e;
    public final boolean f;
    public int g;
    public int h;
    public final Object i;
    public final Object j;

    public z9(zzey zzeyVar, zzey zzeyVar2, boolean z) throws zzat {
        this.j = zzeyVar;
        this.i = zzeyVar2;
        this.f = z;
        zzeyVar2.E(12);
        this.b = zzeyVar2.h();
        zzeyVar.E(12);
        this.h = zzeyVar.h();
        zzags.a("first_chunk must be 1", zzeyVar.b() == 1);
        this.c = -1;
    }

    public boolean a() {
        int i = this.a;
        Object obj = this.i;
        boolean z = this.f;
        int i2 = this.b;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                ParsableByteArray parsableByteArray = (ParsableByteArray) obj2;
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 == i2) {
                    return false;
                }
                ParsableByteArray parsableByteArray2 = (ParsableByteArray) obj;
                this.e = z ? parsableByteArray2.readUnsignedLongToLong() : parsableByteArray2.readUnsignedInt();
                if (this.c == this.g) {
                    this.d = parsableByteArray.readUnsignedIntToInt();
                    parsableByteArray.skipBytes(4);
                    int i4 = this.h - 1;
                    this.h = i4;
                    this.g = i4 > 0 ? parsableByteArray.readUnsignedIntToInt() - 1 : -1;
                }
                return true;
            default:
                q qVar = (q) obj2;
                int i5 = this.c + 1;
                this.c = i5;
                if (i5 == i2) {
                    return false;
                }
                q qVar2 = (q) obj;
                this.e = z ? qVar2.y() : qVar2.v();
                if (this.c == this.g) {
                    this.d = qVar.x();
                    qVar.G(4);
                    int i6 = this.h - 1;
                    this.h = i6;
                    this.g = i6 > 0 ? qVar.x() - 1 : -1;
                }
                return true;
        }
    }

    public boolean b() {
        int i = this.c + 1;
        this.c = i;
        if (i == this.b) {
            return false;
        }
        zzey zzeyVar = (zzey) this.i;
        this.e = this.f ? zzeyVar.j() : zzeyVar.P();
        if (this.c == this.g) {
            zzey zzeyVar2 = (zzey) this.j;
            this.d = zzeyVar2.h();
            zzeyVar2.G(4);
            int i2 = this.h - 1;
            this.h = i2;
            this.g = i2 > 0 ? (-1) + zzeyVar2.h() : -1;
        }
        return true;
    }

    public z9(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
        this.j = parsableByteArray;
        this.i = parsableByteArray2;
        this.f = z;
        parsableByteArray2.setPosition(12);
        this.b = parsableByteArray2.readUnsignedIntToInt();
        parsableByteArray.setPosition(12);
        this.h = parsableByteArray.readUnsignedIntToInt();
        ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
        this.c = -1;
    }

    public z9(q qVar, q qVar2, boolean z) throws g0 {
        this.j = qVar;
        this.i = qVar2;
        this.f = z;
        qVar2.F(12);
        this.b = qVar2.x();
        qVar.F(12);
        this.h = qVar.x();
        b.c(qVar.g() == 1, "first_chunk must be 1");
        this.c = -1;
    }
}
