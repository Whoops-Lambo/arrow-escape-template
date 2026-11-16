package com.google.android.gms.internal.ads;

import defpackage.nj;
import defpackage.q63;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhok {
    public static final Logger c = Logger.getLogger(zzhok.class.getName());
    public static final zzhok d = new zzhok();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final synchronized void a(zzhgd zzhgdVar, boolean z) {
        c(zzhgdVar, 1, z);
    }

    public final synchronized void c(zzhgd zzhgdVar, int i, boolean z) {
        if (!zzhnn.a(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(zzhgdVar, z);
    }

    public final synchronized zzhgd d(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.a;
        if (!concurrentHashMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (zzhgd) concurrentHashMap.get(str);
    }

    public final synchronized void e(zzhgd zzhgdVar, boolean z) {
        try {
            String strZzb = zzhgdVar.zzb();
            if (z) {
                ConcurrentHashMap concurrentHashMap = this.b;
                if (concurrentHashMap.containsKey(strZzb) && !((Boolean) concurrentHashMap.get(strZzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzb));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.a;
            zzhgd zzhgdVar2 = (zzhgd) concurrentHashMap2.get(strZzb);
            if (zzhgdVar2 != null && !zzhgdVar2.getClass().equals(zzhgdVar.getClass())) {
                c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzb));
                throw new GeneralSecurityException("typeUrl (" + strZzb + ") is already registered with " + zzhgdVar2.getClass().getName() + ", cannot be re-registered with " + zzhgdVar.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(strZzb, zzhgdVar);
            this.b.put(strZzb, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzhgd b(Class cls, String str) throws GeneralSecurityException {
        zzhgd zzhgdVarD = d(str);
        if (zzhgdVarD.zzc().equals(cls)) {
            return zzhgdVarD;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzhgdVarD.getClass());
        String string = zzhgdVarD.zzc().toString();
        StringBuilder sb = new StringBuilder(q63.a(name.length() + 53, 23, strValueOf) + string.length());
        q63.y(sb, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(nj.q(sb, ", which only supports: ", string));
    }
}
