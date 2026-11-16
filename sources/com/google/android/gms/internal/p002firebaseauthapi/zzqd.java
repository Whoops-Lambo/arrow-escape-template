package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.d;
import defpackage.p65;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzqd {
    public final HashMap a;
    public final HashMap b;

    public final void a(zzpx zzpxVar) throws GeneralSecurityException {
        if (zzpxVar == null) {
            d.w("primitive constructor must be non-null");
            return;
        }
        p65 p65Var = new p65(zzpxVar.a, zzpxVar.b);
        HashMap map = this.a;
        if (!map.containsKey(p65Var)) {
            map.put(p65Var, zzpxVar);
            return;
        }
        zzpx zzpxVar2 = (zzpx) map.get(p65Var);
        if (!zzpxVar2.equals(zzpxVar) || !zzpxVar.equals(zzpxVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(String.valueOf(p65Var)));
        }
    }

    public final void b(zzqi zzqiVar) throws GeneralSecurityException {
        if (zzqiVar == null) {
            d.w("wrapper must be non-null");
            return;
        }
        Class clsZzb = zzqiVar.zzb();
        HashMap map = this.b;
        if (!map.containsKey(clsZzb)) {
            map.put(clsZzb, zzqiVar);
            return;
        }
        zzqi zzqiVar2 = (zzqi) map.get(clsZzb);
        if (!zzqiVar2.equals(zzqiVar) || !zzqiVar.equals(zzqiVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(String.valueOf(clsZzb)));
        }
    }

    public zzqd(zzqb zzqbVar) {
        this.a = new HashMap(zzqbVar.a);
        this.b = new HashMap(zzqbVar.b);
    }

    private zzqd() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public /* synthetic */ zzqd(int i) {
        this();
    }
}
