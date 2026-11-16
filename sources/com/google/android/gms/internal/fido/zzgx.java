package com.google.android.gms.internal.fido;

import defpackage.ap4;
import defpackage.bn4;
import defpackage.jc1;
import defpackage.nj;
import defpackage.pm4;
import defpackage.uj2;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgx implements Iterable<Byte>, Serializable {
    public static final ap4 b = new ap4(zzhc.a);
    public int a = 0;

    public static ap4 r(int i, byte[] bArr) {
        o(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new ap4(bArr2);
    }

    public abstract byte c(int i);

    public abstract byte d(int i);

    public abstract int h();

    public abstract void i(int i, byte[] bArr);

    public abstract int k(int i, int i2);

    public abstract ap4 n(int i, int i2);

    static {
        int i = pm4.a;
    }

    public static int o(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            y.p(jc1.k(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            y.p(nj.i(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        y.p(nj.i(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public final int hashCode() {
        int iK = this.a;
        if (iK == 0) {
            int iH = h();
            iK = k(iH, iH);
            if (iK == 0) {
                iK = 1;
            }
            this.a = iK;
        }
        return iK;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new bn4(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return nj.q(nj.s("<ByteString@", h(), hexString, " size=", " contents=\""), h() <= 50 ? uj2.p(this) : uj2.p(n(0, 47)).concat("..."), "\">");
    }

    public final byte[] t() {
        int iH = h();
        if (iH == 0) {
            return zzhc.a;
        }
        byte[] bArr = new byte[iH];
        i(iH, bArr);
        return bArr;
    }
}
