package com.google.android.gms.internal.ads;

import defpackage.e32;
import defpackage.tj2;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class zziee {
    public final zzieg d() {
        if (this instanceof zzieg) {
            return (zzieg) this;
        }
        e32.i("Not a JSON Object: ".concat(toString()));
        return null;
    }

    public final zziei e() {
        if (this instanceof zziei) {
            return (zziei) this;
        }
        e32.i("Not a JSON Primitive: ".concat(toString()));
        return null;
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            zzifc zzifcVar = new zzifc(new tj2(sb));
            zzifcVar.h = zziej.a;
            zziey.a.getClass();
            zziey.a(zzifcVar, this);
            return sb.toString();
        } catch (IOException e) {
            defpackage.d.p(e);
            return null;
        }
    }

    @Deprecated
    public zziee() {
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }
}
