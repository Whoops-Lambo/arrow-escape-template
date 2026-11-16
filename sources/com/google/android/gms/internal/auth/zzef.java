package com.google.android.gms.internal.auth;

import defpackage.jc1;
import defpackage.l41;
import defpackage.nj;
import defpackage.t94;
import defpackage.ta4;
import defpackage.wb4;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzef implements Iterable, Serializable {
    public static final wb4 b = new wb4(zzfa.b);
    public int a = 0;

    public abstract byte c(int i);

    public abstract byte d(int i);

    public abstract int h();

    public abstract int i(int i, int i2);

    public abstract wb4 k();

    public abstract String n(Charset charset);

    public abstract boolean o();

    static {
        int i = t94.a;
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

    public static wb4 t(int i, int i2, byte[] bArr) {
        r(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new wb4(bArr2);
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int iH = h();
            i = i(iH, iH);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new ta4(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return nj.q(nj.s("<ByteString@", h(), hexString, " size=", " contents=\""), h() <= 50 ? l41.v(this) : l41.v(k()).concat("..."), "\">");
    }
}
