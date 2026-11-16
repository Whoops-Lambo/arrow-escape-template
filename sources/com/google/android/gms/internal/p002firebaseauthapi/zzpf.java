package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.b65;
import defpackage.pv1;
import defpackage.x45;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzpf {
    public static final zzpf b = (zzpf) zzqs.a(new zzqr() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpi
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqr
        public final Object zza() {
            zzpf zzpfVar = new zzpf();
            zzpfVar.d(new x45(zzon.class, new zzoj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzph
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoj
                public final zzct b(zzbt zzbtVar, zzdd zzddVar) throws GeneralSecurityException {
                    zzct zzctVar = ((zzon) zzbtVar).a;
                    zzon.c(zzctVar, zzddVar);
                    return zzctVar;
                }
            }));
            zzpfVar.f(new b65(zzor.class, new zzps() { // from class: com.google.android.gms.internal.firebase-auth-api.zzpk
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzps
                public final zzcx a(zzcs zzcsVar) {
                    return ((zzor) zzcsVar).a;
                }
            }));
            return zzpfVar;
        }
    });
    public final AtomicReference a = new AtomicReference(new zzqo(new zzqn()));

    public final synchronized void c(zzod zzodVar) {
        zzqn zzqnVar = new zzqn((zzqo) this.a.get());
        String str = zzodVar.a;
        HashMap map = zzqnVar.b;
        if (map.containsKey(str)) {
            zzod zzodVar2 = (zzod) map.get(str);
            if (!zzodVar2.equals(zzodVar) || !zzodVar.equals(zzodVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(str));
            }
        } else {
            map.put(str, zzodVar);
        }
        this.a.set(new zzqo(zzqnVar));
    }

    public final synchronized void d(zzoh zzohVar) {
        zzqn zzqnVar = new zzqn((zzqo) this.a.get());
        HashMap map = zzqnVar.a;
        Class cls = zzohVar.a;
        if (map.containsKey(cls)) {
            zzoh zzohVar2 = (zzoh) map.get(cls);
            if (!zzohVar2.equals(zzohVar) || !zzohVar.equals(zzohVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(cls)));
            }
        } else {
            map.put(cls, zzohVar);
        }
        this.a.set(new zzqo(zzqnVar));
    }

    public final synchronized void e(zzpm zzpmVar) {
        zzqn zzqnVar = new zzqn((zzqo) this.a.get());
        String str = zzpmVar.a;
        HashMap map = zzqnVar.d;
        if (map.containsKey(str)) {
            zzpm zzpmVar2 = (zzpm) map.get(str);
            if (!zzpmVar2.equals(zzpmVar) || !zzpmVar.equals(zzpmVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(str));
            }
        } else {
            map.put(str, zzpmVar);
        }
        this.a.set(new zzqo(zzqnVar));
    }

    public final synchronized void f(zzpq zzpqVar) {
        zzqn zzqnVar = new zzqn((zzqo) this.a.get());
        HashMap map = zzqnVar.c;
        Class cls = zzpqVar.a;
        if (map.containsKey(cls)) {
            zzpq zzpqVar2 = (zzpq) map.get(cls);
            if (!zzpqVar2.equals(zzpqVar) || !zzpqVar.equals(zzpqVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(cls)));
            }
        } else {
            map.put(cls, zzpqVar);
        }
        this.a.set(new zzqo(zzqnVar));
    }

    public final zzcs a(zzcx zzcxVar) throws GeneralSecurityException {
        zzqo zzqoVar = (zzqo) this.a.get();
        zzqoVar.getClass();
        String str = zzcxVar.b;
        HashMap map = zzqoVar.d;
        if (map.containsKey(str)) {
            return ((zzpm) map.get(str)).a(zzcxVar);
        }
        throw new GeneralSecurityException(pv1.n("No Parameters Parser for requested key type ", str, " available"));
    }

    public final zzcx b(zzcs zzcsVar) throws GeneralSecurityException {
        HashMap map = ((zzqo) this.a.get()).c;
        if (map.containsKey(zzcsVar.getClass())) {
            return ((zzpq) map.get(zzcsVar.getClass())).a(zzcsVar);
        }
        throw new GeneralSecurityException(pv1.n("No Key Format serializer for ", String.valueOf(zzcsVar.getClass()), " available"));
    }
}
