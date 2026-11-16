package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhoe {
    public final Map a;
    public final Map b;

    public static zzhod a() {
        return new zzhod(0);
    }

    public final Enum b(Object obj) throws GeneralSecurityException {
        Enum r1 = (Enum) this.b.get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object c(zzhuy zzhuyVar) throws GeneralSecurityException {
        Object obj = this.a.get(zzhuyVar);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(Integer.toString(zzhuyVar.a)));
    }

    public /* synthetic */ zzhoe(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }
}
