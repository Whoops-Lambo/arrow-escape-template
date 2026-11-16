package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.p65;
import defpackage.pv1;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzpg {
    public static final zzpg b = new zzpg();
    public final AtomicReference a = new AtomicReference(new zzqb(new zzqd(0)));

    public final synchronized void b(zzpx zzpxVar) {
        zzqd zzqdVar = new zzqd((zzqb) this.a.get());
        zzqdVar.a(zzpxVar);
        this.a.set(new zzqb(zzqdVar));
    }

    public final synchronized void c(zzqi zzqiVar) {
        zzqd zzqdVar = new zzqd((zzqb) this.a.get());
        zzqdVar.b(zzqiVar);
        this.a.set(new zzqb(zzqdVar));
    }

    public final Object a(zzbt zzbtVar, Class cls) throws GeneralSecurityException {
        zzqb zzqbVar = (zzqb) this.a.get();
        zzqbVar.getClass();
        p65 p65Var = new p65(zzbtVar.getClass(), cls);
        HashMap map = zzqbVar.a;
        if (map.containsKey(p65Var)) {
            return ((zzpx) map.get(p65Var)).a(zzbtVar);
        }
        throw new GeneralSecurityException(pv1.n("No PrimitiveConstructor for ", String.valueOf(p65Var), " available, see https://developers.google.com/tink/faq/registration_errors"));
    }
}
