package com.google.android.gms.internal.play_billing;

import defpackage.ak1;
import defpackage.be4;
import defpackage.ed4;
import defpackage.ef4;
import defpackage.jc1;
import defpackage.l93;
import defpackage.nj;
import defpackage.tf4;
import defpackage.ze4;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzev implements Iterable, Serializable {
    public static final ef4 b = new ef4(zzga.b);
    public int a = 0;

    public abstract byte c(int i);

    public abstract byte d(int i);

    public abstract int h(int i, int i2);

    public abstract int i();

    public abstract ze4 k(int i, int i2);

    public abstract void n(tf4 tf4Var);

    public abstract boolean o(zzev zzevVar);

    static {
        int i = ed4.a;
    }

    public static int r(int i, int i2, int i3) {
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

    public static ef4 t(int i, int i2, byte[] bArr) {
        try {
            r(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new ef4(bArr2);
        } catch (zzgc e) {
            ak1.l("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ boolean x(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i + i3;
        r(i, i4, bArr.length);
        r(i2, i3 + i2, bArr2.length);
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
        if (!(obj instanceof zzev)) {
            return false;
        }
        zzev zzevVar = (zzev) obj;
        int i = i();
        if (i != zzevVar.i()) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int i2 = this.a;
        int i3 = zzevVar.a;
        if (i2 == 0 || i3 == 0 || i2 == i3) {
            return o(zzevVar);
        }
        return false;
    }

    public final int hashCode() {
        int iH = this.a;
        if (iH == 0) {
            int i = i();
            iH = h(i, i);
            if (iH == 0) {
                iH = 1;
            }
            this.a = iH;
        }
        return iH;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new be4(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return nj.q(nj.s("<ByteString@", i(), hexString, " size=", " contents=\""), i() <= 50 ? l93.s(this) : l93.s(k(0, 47)).concat("..."), "\">");
    }
}
