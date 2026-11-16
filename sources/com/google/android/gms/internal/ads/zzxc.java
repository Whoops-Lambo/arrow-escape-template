package com.google.android.gms.internal.ads;

import defpackage.ar4;
import defpackage.pb5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzxc implements zzzo {
    public final w a;
    public long b;

    @Override // com.google.android.gms.internal.ads.zzzo
    public final void a(long j) {
        int i = 0;
        while (true) {
            w wVar = this.a;
            if (i >= wVar.d) {
                return;
            }
            ((pb5) wVar.get(i)).a(j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final boolean e(zzmi zzmiVar) {
        boolean zE;
        boolean z = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zE = false;
            while (true) {
                w wVar = this.a;
                if (i >= wVar.d) {
                    break;
                }
                long jZzc2 = ((pb5) wVar.get(i)).a.zzc();
                boolean z2 = jZzc2 != Long.MIN_VALUE && jZzc2 <= zzmiVar.a;
                if (jZzc2 == jZzc || z2) {
                    zE |= ((pb5) wVar.get(i)).a.e(zzmiVar);
                }
                i++;
            }
            z |= zE;
        } while (zE);
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final long zzb() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            w wVar = this.a;
            if (i >= wVar.d) {
                break;
            }
            pb5 pb5Var = (pb5) wVar.get(i);
            long jZzb = pb5Var.a.zzb();
            zzgzb zzgzbVar = pb5Var.b;
            if ((zzgzbVar.contains(1) || zzgzbVar.contains(2) || zzgzbVar.contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final long zzc() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            w wVar = this.a;
            if (i >= wVar.d) {
                break;
            }
            long jZzc = ((pb5) wVar.get(i)).a.zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzzo
    public final boolean zze() {
        int i = 0;
        while (true) {
            w wVar = this.a;
            if (i >= wVar.d) {
                return false;
            }
            if (((pb5) wVar.get(i)).a.zze()) {
                return true;
            }
            i++;
        }
    }

    public zzxc(List list, List list2) {
        boolean z;
        ar4 ar4Var = zzgzb.b;
        zzgyy zzgyyVar = new zzgyy();
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        zzgvz.a(z);
        for (int i = 0; i < list.size(); i++) {
            zzgyyVar.c(new pb5((zzzo) list.get(i), (List) list2.get(i)));
        }
        this.a = zzgyyVar.f();
        this.b = -9223372036854775807L;
    }
}
