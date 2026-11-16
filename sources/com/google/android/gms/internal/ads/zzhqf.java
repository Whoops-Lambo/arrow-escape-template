package com.google.android.gms.internal.ads;

import defpackage.jc1;
import defpackage.pw4;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhqf {
    public final HashMap a;
    public final HashMap b;

    public final Object a(zzhgc zzhgcVar, Class cls) throws GeneralSecurityException {
        pw4 pw4Var = new pw4(zzhgcVar.getClass(), cls);
        HashMap map = this.a;
        if (map.containsKey(pw4Var)) {
            return ((zzhqb) map.get(pw4Var)).a(zzhgcVar);
        }
        String string = pw4Var.toString();
        throw new GeneralSecurityException(jc1.o("No PrimitiveConstructor for ", string, new StringBuilder(string.length() + 102), " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public /* synthetic */ zzhqf(zzhqc zzhqcVar) {
        this.a = new HashMap(zzhqcVar.a);
        this.b = new HashMap(zzhqcVar.b);
    }
}
