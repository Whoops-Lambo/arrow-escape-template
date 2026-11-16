package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zzblb {
    public final String a;
    public final Object b;
    public final int c;

    public static zzblb a(String str, boolean z) {
        return new zzblb(str, Boolean.valueOf(z), 1);
    }

    public static zzblb b(long j, String str) {
        return new zzblb(str, Long.valueOf(j), 2);
    }

    public final Object c() {
        zzbmi zzbmiVar = (zzbmi) zzbmk.a.get();
        Object obj = this.b;
        if (zzbmiVar == null) {
            AtomicReference atomicReference = zzbmk.b;
            if (((zzbmj) atomicReference.get()) != null) {
                ((zzbmj) atomicReference.get()).zza();
            }
            return obj;
        }
        int i = this.c - 1;
        String str = this.a;
        if (i == 0) {
            return zzbmiVar.c(str, ((Boolean) obj).booleanValue());
        }
        if (i != 1) {
            return i != 2 ? zzbmiVar.a(str, (String) obj) : zzbmiVar.b(str, ((Double) obj).doubleValue());
        }
        return zzbmiVar.d(((Long) obj).longValue(), str);
    }

    public zzblb(String str, Object obj, int i) {
        this.a = str;
        this.b = obj;
        this.c = i;
    }
}
