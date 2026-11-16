package com.google.android.gms.internal.ads;

import defpackage.ga4;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhpn {
    public static final zzhpn b = (zzhpn) zzhqp.a(ga4.r);
    public final AtomicReference a = new AtomicReference(new zzhqm(new zzhql()));

    public final synchronized void a(zzhoq zzhoqVar) {
        AtomicReference atomicReference = this.a;
        zzhql zzhqlVar = new zzhql((zzhqm) atomicReference.get());
        zzhqlVar.a(zzhoqVar);
        atomicReference.set(new zzhqm(zzhqlVar));
    }

    public final synchronized void b(zzhon zzhonVar) {
        AtomicReference atomicReference = this.a;
        zzhql zzhqlVar = new zzhql((zzhqm) atomicReference.get());
        HashMap map = zzhqlVar.b;
        String str = zzhonVar.a;
        if (map.containsKey(str)) {
            zzhon zzhonVar2 = (zzhon) map.get(str);
            if (!zzhonVar2.equals(zzhonVar) || !zzhonVar.equals(zzhonVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(str));
            }
        } else {
            map.put(str, zzhonVar);
        }
        atomicReference.set(new zzhqm(zzhqlVar));
    }

    public final synchronized void c(zzhpu zzhpuVar) {
        AtomicReference atomicReference = this.a;
        zzhql zzhqlVar = new zzhql((zzhqm) atomicReference.get());
        zzhqlVar.b(zzhpuVar);
        atomicReference.set(new zzhqm(zzhqlVar));
    }

    public final synchronized void d(zzhpr zzhprVar) {
        AtomicReference atomicReference = this.a;
        zzhql zzhqlVar = new zzhql((zzhqm) atomicReference.get());
        HashMap map = zzhqlVar.d;
        String str = zzhprVar.a;
        if (map.containsKey(str)) {
            zzhpr zzhprVar2 = (zzhpr) map.get(str);
            if (!zzhprVar2.equals(zzhprVar) || !zzhprVar.equals(zzhprVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(str));
            }
        } else {
            map.put(str, zzhprVar);
        }
        atomicReference.set(new zzhqm(zzhqlVar));
    }
}
