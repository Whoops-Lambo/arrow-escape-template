package com.google.android.gms.internal.measurement;

import defpackage.fs1;
import defpackage.u25;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zztt {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final Executor b;
    public final zzru c;
    public final u25 d;
    public final Map e;

    public zztt(Executor executor, zzru zzruVar, zzvc zzvcVar, HashMap map) {
        executor.getClass();
        this.b = executor;
        zzruVar.getClass();
        this.c = zzruVar;
        zzvcVar.getClass();
        map.getClass();
        this.e = map;
        fs1.g(!map.isEmpty());
        this.d = u25.c;
    }
}
