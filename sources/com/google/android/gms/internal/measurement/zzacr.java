package com.google.android.gms.internal.measurement;

import defpackage.ak1;
import defpackage.em3;
import defpackage.hm3;
import defpackage.jm3;
import defpackage.lm3;
import defpackage.nd4;
import defpackage.nj;
import defpackage.pv1;
import defpackage.rl3;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzacr implements Iterable, Serializable {
    public static final lm3 b = new lm3(zzaed.a);
    public int a = 0;

    public abstract byte c(int i);

    public abstract int d();

    public abstract jm3 h(int i, int i2);

    public abstract void i(int i, byte[] bArr);

    public abstract void k(zzada zzadaVar);

    public abstract boolean n(zzacr zzacrVar);

    public abstract int o(int i, int i2);

    static {
        int i = em3.a;
    }

    public static lm3 t(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return b;
        }
        y(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new lm3(bArr2);
    }

    public static int y(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            y.p(rl3.k(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            y.p(pv1.j(i, i2, "Beginning index larger than ending index: ", ", ", new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length())));
            return 0;
        }
        y.p(pv1.j(i2, i3, "End index: ", " >= ", new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length())));
        return 0;
    }

    public static /* synthetic */ boolean z(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i + i3;
        y(i, i4, bArr.length);
        y(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacr)) {
            return false;
        }
        zzacr zzacrVar = (zzacr) obj;
        int iD = d();
        if (iD != zzacrVar.d()) {
            return false;
        }
        if (iD == 0) {
            return true;
        }
        int i = this.a;
        int i2 = zzacrVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return n(zzacrVar);
        }
        return false;
    }

    public final int hashCode() {
        int iO = this.a;
        if (iO == 0) {
            int iD = d();
            iO = o(iD, iD);
            if (iO == 0) {
                iO = 1;
            }
            this.a = iO;
        }
        return iO;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new hm3(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return nj.q(nj.s("<ByteString@", d(), hexString, " size=", " contents=\""), d() <= 50 ? nd4.s(x()) : nd4.s(h(0, 47).x()).concat("..."), "\">");
    }

    public static lm3 r(int i, int i2, byte[] bArr) {
        try {
            return t(i, i2, bArr);
        } catch (zzaeh e) {
            ak1.l("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            return null;
        }
    }

    public final byte[] x() {
        int iD = d();
        if (iD == 0) {
            return zzaed.a;
        }
        byte[] bArr = new byte[iD];
        i(iD, bArr);
        return bArr;
    }
}
