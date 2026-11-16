package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhpj {
    public static final zzhpj b = new zzhpj();
    public final AtomicReference a = new AtomicReference(new zzhqf(new zzhqc(0)));

    public final synchronized void a(zzhqb zzhqbVar) {
        AtomicReference atomicReference = this.a;
        zzhqc zzhqcVar = new zzhqc((zzhqf) atomicReference.get());
        zzhqcVar.a(zzhqbVar);
        atomicReference.set(new zzhqf(zzhqcVar));
    }

    public final synchronized void b(zzhqh zzhqhVar) {
        AtomicReference atomicReference = this.a;
        zzhqc zzhqcVar = new zzhqc((zzhqf) atomicReference.get());
        HashMap map = zzhqcVar.b;
        Class clsZza = zzhqhVar.zza();
        if (map.containsKey(clsZza)) {
            zzhqh zzhqhVar2 = (zzhqh) map.get(clsZza);
            if (!zzhqhVar2.equals(zzhqhVar) || !zzhqhVar.equals(zzhqhVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
            }
        } else {
            map.put(clsZza, zzhqhVar);
        }
        atomicReference.set(new zzhqf(zzhqcVar));
    }
}
