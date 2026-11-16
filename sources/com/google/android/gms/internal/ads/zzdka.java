package com.google.android.gms.internal.ads;

import defpackage.o64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class zzdka {
    public final HashMap a = new HashMap();

    public final synchronized void Z(Object obj, Executor executor) {
        this.a.put(obj, executor);
    }

    public final synchronized void k0(zzdjz zzdjzVar) {
        for (Map.Entry entry : this.a.entrySet()) {
            ((Executor) entry.getValue()).execute(new o64(18, zzdjzVar, entry.getKey()));
        }
    }

    public zzdka(Set set) {
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                zzdmb zzdmbVar = (zzdmb) it.next();
                synchronized (this) {
                    Z(zzdmbVar.a, zzdmbVar.b);
                }
            }
        }
    }
}
