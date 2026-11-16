package com.google.android.gms.internal.ads;

import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.ak1;
import defpackage.dy4;
import defpackage.ek2;
import defpackage.fy4;
import defpackage.jc1;
import defpackage.jy4;
import defpackage.nj;
import defpackage.nz4;
import defpackage.pv1;
import defpackage.rl3;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzifx implements Iterable<Byte>, Serializable {
    public static final jy4 b = new jy4(zzihp.a);
    public int a = 0;

    public static zzifx B(Iterator it, int i) {
        if (i <= 0) {
            Locale locale = Locale.ROOT;
            defpackage.d.r(jc1.k(i, "length (", ") must be >= 1"));
            return null;
        }
        if (i == 1) {
            return (zzifx) it.next();
        }
        int i2 = i >>> 1;
        zzifx zzifxVarB = B(it, i2);
        zzifx zzifxVarB2 = B(it, i - i2);
        if (Integer.MAX_VALUE - zzifxVarB.n() < zzifxVarB2.n()) {
            int iN = zzifxVarB.n();
            int iN2 = zzifxVarB2.n();
            defpackage.d.r(pv1.j(iN, iN2, "ByteString would be too long: ", UserDetailsUtils.UserDetailsLiterals.PLUS, new StringBuilder(String.valueOf(iN).length() + 31 + String.valueOf(iN2).length())));
            return null;
        }
        if (zzifxVarB2.n() == 0) {
            return zzifxVarB;
        }
        if (zzifxVarB.n() == 0) {
            return zzifxVarB2;
        }
        int iN3 = zzifxVarB2.n() + zzifxVarB.n();
        jy4 jy4Var = b;
        if (iN3 < 128) {
            int iN4 = zzifxVarB.n();
            int iN5 = zzifxVarB2.n();
            int i3 = iN4 + iN5;
            byte[] bArr = new byte[i3];
            h(0, iN4, zzifxVarB.n());
            h(0, iN4, i3);
            if (iN4 > 0) {
                zzifxVarB.t(bArr, 0, 0, iN4);
            }
            h(0, iN5, zzifxVarB2.n());
            h(iN4, i3, i3);
            if (iN5 > 0) {
                zzifxVarB2.t(bArr, 0, iN4, iN5);
            }
            if (i3 == 0) {
                return jy4Var;
            }
            try {
                return new jy4(bArr);
            } catch (zzihu e) {
                ak1.l("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                return null;
            }
        }
        if (zzifxVarB instanceof b0) {
            b0 b0Var = (b0) zzifxVarB;
            zzifx zzifxVar = b0Var.d;
            zzifx zzifxVar2 = b0Var.e;
            if (zzifxVarB2.n() + zzifxVar2.n() < 128) {
                int iN6 = zzifxVar2.n();
                int iN7 = zzifxVarB2.n();
                int i4 = iN6 + iN7;
                byte[] bArr2 = new byte[i4];
                h(0, iN6, zzifxVar2.n());
                h(0, iN6, i4);
                if (iN6 > 0) {
                    zzifxVar2.t(bArr2, 0, 0, iN6);
                }
                h(0, iN7, zzifxVarB2.n());
                h(iN6, i4, i4);
                if (iN7 > 0) {
                    zzifxVarB2.t(bArr2, 0, iN6, iN7);
                }
                if (i4 != 0) {
                    try {
                        jy4Var = new jy4(bArr2);
                    } catch (zzihu e2) {
                        ak1.l("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
                        return null;
                    }
                }
                return new b0(zzifxVar, jy4Var);
            }
            if (zzifxVar.E() > zzifxVar2.E() && b0Var.g > zzifxVarB2.E()) {
                return new b0(zzifxVar, new b0(zzifxVar2, zzifxVarB2));
            }
        }
        if (iN3 >= b0.K(Math.max(zzifxVarB.E(), zzifxVarB2.E()) + 1)) {
            return new b0(zzifxVarB, zzifxVarB2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        ek2.v(zzifxVarB, arrayDeque);
        ek2.v(zzifxVarB2, arrayDeque);
        zzifx b0Var2 = (zzifx) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            b0Var2 = new b0((zzifx) arrayDeque.pop(), b0Var2);
        }
        return b0Var2;
    }

    public abstract boolean A(zzifx zzifxVar);

    public abstract int C(int i, int i2, int i3);

    public abstract zzigb D();

    public abstract int E();

    public abstract boolean F();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzifx)) {
            return false;
        }
        zzifx zzifxVar = (zzifx) obj;
        int iN = n();
        if (iN != zzifxVar.n()) {
            return false;
        }
        if (iN == 0) {
            return true;
        }
        int i = this.a;
        int i2 = zzifxVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return A(zzifxVar);
        }
        return false;
    }

    public abstract byte k(int i);

    public abstract int n();

    public abstract zzifx o(int i, int i2);

    public abstract zzifx r(int i, int i2);

    public abstract void t(byte[] bArr, int i, int i2, int i3);

    public abstract ByteBuffer x();

    public abstract void y(zzigh zzighVar);

    public abstract String z();

    static {
        int i = dy4.a;
    }

    public static jy4 I(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return b;
        }
        h(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new jy4(bArr2);
    }

    public static zzifx J(ArrayList arrayList) {
        int size;
        if (arrayList == null) {
            int size2 = arrayList.size();
            size = 0;
            int i = 0;
            while (i < size2) {
                arrayList.get(i);
                i++;
                size++;
            }
        } else {
            size = arrayList.size();
        }
        return size == 0 ? b : B(arrayList.iterator(), size);
    }

    public static int h(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            io.p071bidmachine.media3.extractor.ts.y.p(rl3.k(new StringBuilder(String.valueOf(i).length() + 21), "Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            io.p071bidmachine.media3.extractor.ts.y.p(pv1.j(i, i2, "Beginning index larger than ending index: ", ", ", new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length())));
            return 0;
        }
        io.p071bidmachine.media3.extractor.ts.y.p(pv1.j(i2, i3, "End index: ", " >= ", new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length())));
        return 0;
    }

    public static /* synthetic */ boolean i(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i + i3;
        h(i, i4, bArr.length);
        h(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public zzifs iterator() {
        return new fy4(this);
    }

    public final int hashCode() {
        int iC = this.a;
        if (iC == 0) {
            int iN = n();
            iC = C(iN, 0, iN);
            if (iC == 0) {
                iC = 1;
            }
            this.a = iC;
        }
        return iC;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iN = n();
        if (n() <= 50) {
            String[] strArr = nz4.a;
            strConcat = nz4.a(d());
        } else {
            zzifx zzifxVarR = r(0, 47);
            String[] strArr2 = nz4.a;
            strConcat = nz4.a(zzifxVarR.d()).concat("...");
        }
        return nj.q(nj.s("<ByteString@", iN, hexString, " size=", " contents=\""), strConcat, "\">");
    }

    public static jy4 H(int i, int i2, byte[] bArr) {
        try {
            return I(i, i2, bArr);
        } catch (zzihu e) {
            ak1.l("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            return null;
        }
    }

    public final byte[] d() {
        int iN = n();
        if (iN == 0) {
            return zzihp.a;
        }
        byte[] bArr = new byte[iN];
        t(bArr, 0, 0, iN);
        return bArr;
    }
}
