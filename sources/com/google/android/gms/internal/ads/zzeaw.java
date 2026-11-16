package com.google.android.gms.internal.ads;

import defpackage.o24;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeaw {
    public final zzebb a;
    public final Executor b;
    public final HashMap c;

    public final zzeav a() {
        zzeav zzeavVar = new zzeav(this);
        zzeavVar.a.putAll(this.c);
        return zzeavVar;
    }

    public final void b() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.xd)).booleanValue()) {
            zzeav zzeavVarA = a();
            zzeavVarA.b("action", "pecr");
            zzeavVarA.c();
        }
    }

    public zzeaw(zzebb zzebbVar, o24 o24Var) {
        this.a = zzebbVar;
        zzebbVar.getClass();
        this.c = new HashMap(zzebbVar.a);
        this.b = o24Var;
    }
}
