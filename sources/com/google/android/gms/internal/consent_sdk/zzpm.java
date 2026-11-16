package com.google.android.gms.internal.consent_sdk;

import defpackage.at;
import defpackage.nj;
import defpackage.pv1;
import defpackage.r55;
import defpackage.v55;
import defpackage.w55;
import defpackage.x55;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzpm implements Iterable, Serializable {
    public static final x55 b = new x55(zzqs.b);
    public int a = 0;

    public abstract byte c(int i);

    public abstract byte d(int i);

    public abstract int h();

    public abstract int i(int i, int i2);

    public abstract w55 k();

    public abstract void n(zzpv zzpvVar);

    public abstract boolean o(zzpm zzpmVar);

    static {
        int i = r55.a;
    }

    public static void zzi(int i) {
        if (((i - 47) | 47) >= 0) {
            return;
        }
        y.p(pv1.k(i, "End index: 47 >= "));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzpm)) {
            return false;
        }
        zzpm zzpmVar = (zzpm) obj;
        int iH = h();
        if (iH != zzpmVar.h()) {
            return false;
        }
        if (iH == 0) {
            return true;
        }
        int i = this.a;
        int i2 = zzpmVar.a;
        if (i == 0 || i2 == 0 || i == i2) {
            return o(zzpmVar);
        }
        return false;
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
        return new v55(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return nj.q(nj.s("<ByteString@", h(), hexString, " size=", " contents=\""), h() <= 50 ? at.E(this) : at.E(k()).concat("..."), "\">");
    }
}
