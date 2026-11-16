package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhql {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;

    public final void a(zzhoq zzhoqVar) throws GeneralSecurityException {
        Class cls = zzhoqVar.a;
        HashMap map = this.a;
        boolean zContainsKey = map.containsKey(cls);
        Class cls2 = zzhoqVar.a;
        if (!zContainsKey) {
            map.put(cls2, zzhoqVar);
            return;
        }
        zzhoq zzhoqVar2 = (zzhoq) map.get(cls2);
        if (!zzhoqVar2.equals(zzhoqVar) || !zzhoqVar.equals(zzhoqVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(cls2.toString()));
        }
    }

    public final void b(zzhpu zzhpuVar) throws GeneralSecurityException {
        Class cls = zzhpuVar.a;
        HashMap map = this.c;
        boolean zContainsKey = map.containsKey(cls);
        Class cls2 = zzhpuVar.a;
        if (!zContainsKey) {
            map.put(cls2, zzhpuVar);
            return;
        }
        zzhpu zzhpuVar2 = (zzhpu) map.get(cls2);
        if (!zzhpuVar2.equals(zzhpuVar) || !zzhpuVar.equals(zzhpuVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(cls2.toString()));
        }
    }

    public zzhql(zzhqm zzhqmVar) {
        this.a = new HashMap(zzhqmVar.a);
        this.b = new HashMap(zzhqmVar.b);
        this.c = new HashMap(zzhqmVar.c);
        this.d = new HashMap(zzhqmVar.d);
    }

    public zzhql() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }
}
