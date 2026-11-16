package com.google.android.gms.internal.measurement;

import androidx.collection.SimpleArrayMap;
import defpackage.fs1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class j extends zzwl {
    public static final zzwl e;
    public static final zzwl f;

    static {
        zzwl zzwlVarB = new j(null, new SimpleArrayMap(0)).b();
        e = zzwlVarB;
        j jVar = new j(zzwlVarB, new SimpleArrayMap(0));
        boolean z = !jVar.c;
        Boolean bool = Boolean.TRUE;
        fs1.n("Can't mutate after handing to trace", z);
        zzwj zzwjVar = zzwl.d;
        fs1.n("Key already present", !jVar.c(zzwjVar));
        jVar.b.put(zzwjVar, bool);
        f = jVar.b();
    }
}
