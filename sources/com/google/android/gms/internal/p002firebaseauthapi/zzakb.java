package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.ak1;
import defpackage.c71;
import defpackage.h72;
import defpackage.ir3;
import defpackage.jc1;
import defpackage.kr3;
import defpackage.lr3;
import defpackage.mr3;
import defpackage.nj;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzakb implements Serializable, Iterable<Byte> {
    public static final lr3 b = new lr3(zzalw.a);
    public static final h72 c = new h72(17);
    public int a = 0;

    public abstract byte c(int i);

    public abstract int d();

    public abstract kr3 i(int i, int i2);

    public abstract void n(int i, byte[] bArr);

    public abstract void o(zzaky zzakyVar);

    public abstract boolean r(zzakb zzakbVar);

    public abstract int y(int i, int i2);

    public abstract mr3 z();

    public static int h(int i, int i2, int i3) {
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

    public static /* synthetic */ boolean t(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
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

    public static lr3 x(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return b;
        }
        h(i, i + i2, bArr.length);
        c.getClass();
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new lr3(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzakb)) {
            return false;
        }
        zzakb zzakbVar = (zzakb) obj;
        int iD = d();
        if (iD != zzakbVar.d()) {
            return false;
        }
        if (iD == 0) {
            return true;
        }
        int i = this.a;
        int i2 = zzakbVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return r(zzakbVar);
        }
        return false;
    }

    public final int hashCode() {
        int iY = this.a;
        if (iY == 0) {
            int iD = d();
            iY = y(iD, iD);
            if (iY == 0) {
                iY = 1;
            }
            this.a = iY;
        }
        return iY;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new ir3(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return nj.q(nj.s("<ByteString@", d(), hexString, " size=", " contents=\""), d() <= 50 ? c71.x(A()) : c71.x(i(0, 47).A()).concat("..."), "\">");
    }

    public static lr3 k(int i, int i2, byte[] bArr) {
        try {
            return x(i, i2, bArr);
        } catch (zzamd e) {
            ak1.l("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            return null;
        }
    }

    public final byte[] A() {
        int iD = d();
        if (iD == 0) {
            return zzalw.a;
        }
        byte[] bArr = new byte[iD];
        n(iD, bArr);
        return bArr;
    }
}
