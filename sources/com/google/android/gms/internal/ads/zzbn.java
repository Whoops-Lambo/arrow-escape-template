package com.google.android.gms.internal.ads;

import defpackage.ar4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbn {
    public static final zzbn b;
    public final zzgzb a;

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            zzgzb zzgzbVar = this.a;
            if (i2 >= zzgzbVar.size()) {
                return false;
            }
            zzbm zzbmVar = (zzbm) zzgzbVar.get(i2);
            for (boolean z : zzbmVar.e) {
                if (z) {
                    if (zzbmVar.b.c != i) {
                        break;
                    }
                    return true;
                }
            }
            i2++;
        }
    }

    static {
        ar4 ar4Var = zzgzb.b;
        b = new zzbn(w.e);
        String str = zzfq.a;
        Integer.toString(0, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbn.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((zzbn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public zzbn(w wVar) {
        this.a = zzgzb.B(wVar);
    }
}
