package com.google.android.gms.internal.ads;

import defpackage.ub4;
import defpackage.vb4;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzebz {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    public final synchronized void a(int i, long j, long j2) {
        int iIntValue;
        ArrayDeque arrayDeque;
        Long l;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.X8)).booleanValue()) {
                if (i == 2) {
                    ub4 ub4Var = new ub4();
                    ub4Var.a = j;
                    byte b = (byte) (ub4Var.c | 1);
                    ub4Var.b = 1;
                    ub4Var.c = (byte) (b | 2);
                    vb4 vb4VarA = ub4Var.a();
                    ConcurrentHashMap concurrentHashMap = this.a;
                    ArrayDeque arrayDeque2 = (ArrayDeque) concurrentHashMap.get(vb4VarA);
                    if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                        arrayDeque2.removeFirst();
                        if (arrayDeque2.isEmpty()) {
                            concurrentHashMap.remove(vb4VarA);
                        }
                    }
                    i = 2;
                }
                ub4 ub4Var2 = new ub4();
                ub4Var2.a = j;
                byte b2 = (byte) (ub4Var2.c | 1);
                ub4Var2.b = i;
                ub4Var2.c = (byte) (b2 | 2);
                vb4 vb4VarA2 = ub4Var2.a();
                int i2 = vb4VarA2.b;
                if (i2 == 0) {
                    iIntValue = 0;
                } else if (i2 == 1) {
                    iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.e9)).intValue();
                } else if (i2 == 2) {
                    iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.f9)).intValue();
                } else if (i2 != 3) {
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.g9)).intValue();
                }
                if (iIntValue > 0) {
                    ConcurrentHashMap concurrentHashMap2 = this.a;
                    ArrayDeque arrayDeque3 = (ArrayDeque) concurrentHashMap2.get(vb4VarA2);
                    if (arrayDeque3 == null) {
                        arrayDeque3 = new ArrayDeque();
                        concurrentHashMap2.put(vb4VarA2, arrayDeque3);
                    }
                    arrayDeque3.addLast(Long.valueOf(j2));
                    while (arrayDeque3.size() > iIntValue) {
                        arrayDeque3.removeFirst();
                    }
                    b();
                    int iIntValue2 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.h9)).intValue();
                    if (iIntValue2 <= 0) {
                        concurrentHashMap2.clear();
                        return;
                    }
                    while (true) {
                        Iterator it = concurrentHashMap2.values().iterator();
                        int size = 0;
                        while (it.hasNext()) {
                            size += ((ArrayDeque) it.next()).size();
                        }
                        if (size <= iIntValue2) {
                            break;
                        }
                        if (!concurrentHashMap2.isEmpty()) {
                            Long l2 = Long.MAX_VALUE;
                            Map.Entry entry = null;
                            for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                                ArrayDeque arrayDeque4 = (ArrayDeque) entry2.getValue();
                                if (!arrayDeque4.isEmpty() && (l = (Long) arrayDeque4.peekFirst()) != null && l.longValue() < l2.longValue()) {
                                    entry = entry2;
                                    l2 = l;
                                }
                            }
                            if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                arrayDeque.removeFirst();
                                if (arrayDeque.isEmpty()) {
                                    concurrentHashMap2.remove(entry.getKey());
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    public final void b() {
        long jLongValue;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzecc zzeccVar = (zzecc) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int iB = zzeccVar.b();
            if (iB != 0) {
                if (iB != 1) {
                    if (iB != 2) {
                        if (iB != 3) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.d9)).longValue();
                        }
                    } else {
                        jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.c9)).longValue();
                    }
                } else {
                    jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.b9)).longValue();
                }
            } else {
                jLongValue = 0;
            }
            if (jLongValue == 0) {
                it.remove();
                jLongValue = 0;
            }
            if (jLongValue > 0) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext() && jCurrentTimeMillis - ((Long) it2.next()).longValue() > jLongValue) {
                    it2.remove();
                }
                if (arrayDeque.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
