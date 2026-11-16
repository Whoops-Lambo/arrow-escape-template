package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.pv1;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzoe {
    public static final Logger c = Logger.getLogger(zzoe.class.getName());
    public static final zzoe d = new zzoe();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final synchronized void b(zzbw zzbwVar, zzjd.zza zzaVar, boolean z) {
        if (!zzaVar.zza()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        d(zzbwVar, z);
    }

    public final synchronized void c(zzbw zzbwVar, boolean z) {
        b(zzbwVar, zzjd.zza.a, z);
    }

    public final synchronized zzbw e(String str) {
        if (!this.a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (zzbw) this.a.get(str);
    }

    public final synchronized void d(zzbw zzbwVar, boolean z) {
        try {
            String strZzb = zzbwVar.zzb();
            if (z && this.b.containsKey(strZzb) && !((Boolean) this.b.get(strZzb)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strZzb);
            }
            zzbw zzbwVar2 = (zzbw) this.a.get(strZzb);
            if (zzbwVar2 != null && !zzbwVar2.getClass().equals(zzbwVar.getClass())) {
                c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + strZzb);
                throw new GeneralSecurityException("typeUrl (" + strZzb + ") is already registered with " + zzbwVar2.getClass().getName() + ", cannot be re-registered with " + zzbwVar.getClass().getName());
            }
            this.a.putIfAbsent(strZzb, zzbwVar);
            this.b.put(strZzb, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzbw a(Class cls, String str) throws GeneralSecurityException {
        zzbw zzbwVarE = e(str);
        if (zzbwVarE.zza().equals(cls)) {
            return zzbwVarE;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzbwVarE.getClass());
        String strValueOf2 = String.valueOf(zzbwVarE.zza());
        StringBuilder sbR = pv1.r("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbR.append(strValueOf2);
        throw new GeneralSecurityException(sbR.toString());
    }
}
