package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.dp1;
import defpackage.mv3;
import defpackage.nh4;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class s implements zzfny {
    public final ConcurrentHashMap a;
    public final zzfof b;
    public final mv3 c = new mv3();

    public final synchronized boolean a(zzfoi zzfoiVar, zzfoh zzfohVar) {
        boolean z;
        try {
            ConcurrentHashMap concurrentHashMap = this.a;
            nh4 nh4Var = (nh4) concurrentHashMap.get(zzfoiVar);
            zzfohVar.d = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (nh4Var == null) {
                zzfof zzfofVar = this.b;
                nh4 nh4Var2 = new nh4(zzfofVar.e, zzfofVar.f * 1000);
                if (concurrentHashMap.size() == zzfofVar.d) {
                    int i = zzfofVar.j;
                    int i2 = i - 1;
                    zzfoi zzfoiVar2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long j = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((nh4) entry.getValue()).d.d < j) {
                                j = ((nh4) entry.getValue()).d.d;
                                zzfoiVar2 = (zzfoi) entry.getKey();
                            }
                        }
                        if (zzfoiVar2 != null) {
                            concurrentHashMap.remove(zzfoiVar2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((nh4) entry2.getValue()).d.e < j) {
                                j = ((nh4) entry2.getValue()).d.e;
                                zzfoiVar2 = (zzfoi) entry2.getKey();
                            }
                        }
                        if (zzfoiVar2 != null) {
                            concurrentHashMap.remove(zzfoiVar2);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((nh4) entry3.getValue()).d.b < i3) {
                                i3 = ((nh4) entry3.getValue()).d.b;
                                zzfoiVar2 = (zzfoi) entry3.getKey();
                            }
                        }
                        if (zzfoiVar2 != null) {
                            concurrentHashMap.remove(zzfoiVar2);
                        }
                    }
                    mv3 mv3Var = this.c;
                    mv3Var.b++;
                    ((zzfoa) mv3Var.f).b = true;
                }
                concurrentHashMap.put(zzfoiVar, nh4Var2);
                mv3 mv3Var2 = this.c;
                mv3Var2.a++;
                ((zzfoa) mv3Var2.f).a = true;
                nh4Var = nh4Var2;
            }
            dp1 dp1Var = nh4Var.d;
            dp1Var.getClass();
            dp1Var.e = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            dp1Var.b++;
            nh4Var.a();
            LinkedList linkedList = nh4Var.a;
            if (linkedList.size() == nh4Var.b) {
                z = false;
            } else {
                linkedList.add(zzfohVar);
                z = true;
            }
            mv3 mv3Var3 = this.c;
            mv3Var3.e++;
            zzfoa zzfoaVar = (zzfoa) mv3Var3.f;
            zzfoa zzfoaVarClone = zzfoaVar.clone();
            zzfoaVar.a = false;
            zzfoaVar.b = false;
            zzfov zzfovVar = (zzfov) nh4Var.d.a;
            zzfov zzfovVarClone = zzfovVar.clone();
            zzfovVar.a = false;
            zzfovVar.b = 0;
            zzbiw.zzb.zzc zzcVarF = zzbiw.zzb.F();
            zzbiw.zzb.zza.C0297zza c0297zzaG = zzbiw.zzb.zza.G();
            c0297zzaG.l();
            ((zzbiw.zzb.zza) c0297zzaG.b).H();
            zzbiw.zzb.zzg.zza zzaVarG = zzbiw.zzb.zzg.G();
            boolean z2 = zzfoaVarClone.a;
            zzaVarG.l();
            ((zzbiw.zzb.zzg) zzaVarG.b).H(z2);
            boolean z3 = zzfoaVarClone.b;
            zzaVarG.l();
            ((zzbiw.zzb.zzg) zzaVarG.b).I(z3);
            int i4 = zzfovVarClone.b;
            zzaVarG.l();
            ((zzbiw.zzb.zzg) zzaVarG.b).E(i4);
            c0297zzaG.l();
            ((zzbiw.zzb.zza) c0297zzaG.b).E((zzbiw.zzb.zzg) zzaVarG.m());
            zzcVarF.l();
            ((zzbiw.zzb) zzcVarF.b).G((zzbiw.zzb.zza) c0297zzaG.m());
            zzfohVar.a.zza().f.d((zzbiw.zzb) zzcVarF.m());
            b();
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    public final void b() {
        Parcelable.Creator<zzfof> creator = zzfof.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.A7)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzfof zzfofVar = this.b;
            sb.append(zzfofVar.c);
            sb.append(" PoolCollection");
            StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
            mv3 mv3Var = this.c;
            sb2.append(mv3Var.c);
            sb2.append("\n\tNew pools created: ");
            sb2.append(mv3Var.a);
            sb2.append("\n\tPools removed: ");
            sb2.append(mv3Var.b);
            sb2.append("\n\tEntries added: ");
            sb2.append(mv3Var.e);
            sb2.append("\n\tNo entries retrieved: ");
            sb2.append(mv3Var.d);
            sb2.append("\n");
            sb.append(sb2.toString());
            int i = 0;
            for (Map.Entry entry : this.a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfoi) entry.getKey()).hashCode());
                sb.append("    ");
                int i2 = 0;
                while (true) {
                    nh4 nh4Var = (nh4) entry.getValue();
                    nh4Var.a();
                    if (i2 >= nh4Var.a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i2++;
                }
                nh4 nh4Var2 = (nh4) entry.getValue();
                nh4Var2.a();
                for (int size = nh4Var2.a.size(); size < zzfofVar.e; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                dp1 dp1Var = ((nh4) entry.getValue()).d;
                sb.append("Created: " + dp1Var.d + " Last accessed: " + dp1Var.e + " Accesses: " + dp1Var.b + "\nEntries retrieved: Valid: " + dp1Var.c + " Stale: " + dp1Var.f);
                sb.append("\n");
            }
            while (i < zzfofVar.d) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String string = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd(string);
        }
    }

    public s(zzfof zzfofVar) {
        this.a = new ConcurrentHashMap(zzfofVar.e);
        this.b = zzfofVar;
    }
}
