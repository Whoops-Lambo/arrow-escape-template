package com.google.android.gms.internal.ads;

import defpackage.pw4;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhqc {
    public final HashMap a;
    public final HashMap b;

    public final void a(zzhqb zzhqbVar) throws GeneralSecurityException {
        if (zzhqbVar == null) {
            defpackage.d.w("primitive constructor must be non-null");
            return;
        }
        pw4 pw4Var = new pw4(zzhqbVar.a, zzhqbVar.b);
        HashMap map = this.a;
        if (!map.containsKey(pw4Var)) {
            map.put(pw4Var, zzhqbVar);
            return;
        }
        zzhqb zzhqbVar2 = (zzhqb) map.get(pw4Var);
        if (!zzhqbVar2.equals(zzhqbVar) || !zzhqbVar.equals(zzhqbVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(pw4Var.toString()));
        }
    }

    public /* synthetic */ zzhqc(zzhqf zzhqfVar) {
        this.a = new HashMap(zzhqfVar.a);
        this.b = new HashMap(zzhqfVar.b);
    }

    private zzhqc() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public /* synthetic */ zzhqc(int i) {
        this.a = new HashMap();
        this.b = new HashMap();
    }
}
