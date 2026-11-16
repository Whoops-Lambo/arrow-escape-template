package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ea4;
import defpackage.eu4;
import defpackage.i34;
import defpackage.o24;
import defpackage.uy3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfdy {
    public final Context a;
    public final Set b;
    public final Executor c;
    public final zzfrt d;

    public final eu4 a(Bundle bundle, Object obj) {
        zzfrj zzfrjVarB = zzfrj.b(this.a, 8);
        zzfrjVarB.zza();
        Set<zzfdv> set = this.b;
        ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        uy3 uy3Var = zzbjr.Dd;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).split(","));
        }
        Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.V2)).booleanValue() && bundle != null) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong("client-signals-start", jCurrentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", jCurrentTimeMillis);
            }
        }
        for (zzfdv zzfdvVar : set) {
            if (!arrayList2.contains(String.valueOf(zzfdvVar.zzb()))) {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                ListenableFuture listenableFutureZza = zzfdvVar.zza();
                Bundle bundle3 = bundle2;
                bundle2 = bundle3;
                listenableFutureZza.addListener(new i34(this, jElapsedRealtime, zzfdvVar, bundle3), zzcgv.h);
                arrayList.add(listenableFutureZza);
            }
        }
        eu4 eu4VarA = zzheh.k(arrayList).a(this.c, new ea4(arrayList, obj, bundle, bundle2, 2));
        if (zzfrw.a()) {
            zzfrs.c(eu4VarA, this.d, zzfrjVarB, false);
        }
        return eu4VarA;
    }

    public zzfdy(Context context, o24 o24Var, Set set, zzfrt zzfrtVar) {
        this.a = context;
        this.c = o24Var;
        this.b = set;
        this.d = zzfrtVar;
    }
}
