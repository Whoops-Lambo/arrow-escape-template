package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bf4;
import defpackage.hg4;
import defpackage.ma;
import defpackage.ma4;
import defpackage.o24;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzesf implements zzend {
    public final zzenf a;
    public final zzenj b;
    public final zzfqv c;
    public final zzher d;

    @Override // com.google.android.gms.internal.ads.zzend
    public final ListenableFuture a(zzfmb zzfmbVar, zzflq zzflqVar) {
        zzeng zzengVarA;
        Iterator it = zzflqVar.t.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzengVarA = null;
                break;
            }
            try {
                zzengVarA = this.a.a((String) it.next(), zzflqVar.v);
                break;
            } catch (zzfmq unused) {
            }
        }
        if (zzengVarA == null) {
            return zzheh.b(new zzepw("Unable to instantiate mediation adapter class."));
        }
        zzcha zzchaVar = new zzcha();
        ma maVar = new ma();
        maVar.b = zzengVarA;
        maVar.c = zzchaVar;
        maVar.a = false;
        zzengVarA.c.w3(maVar);
        int i = 1;
        if (zzflqVar.M) {
            Bundle bundle = zzfmbVar.a.a.d.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfqv zzfqvVar = this.c;
        Objects.requireNonNull(zzfqvVar);
        hg4 hg4Var = new hg4(new bf4(this, zzfmbVar, zzflqVar, zzengVarA), 5);
        zzfqm zzfqmVar = new zzfqm(zzfqvVar, zzfqp.ADAPTER_LOAD_AD_SYN, null, zzfqn.d, Collections.EMPTY_LIST, this.d.submit(hg4Var));
        zzfqm zzfqmVarA = zzfqmVar.f.a(zzfqmVar.d(), zzfqp.ADAPTER_LOAD_AD_ACK);
        ma4 ma4Var = new ma4(i, zzchaVar);
        o24 o24Var = zzcgv.h;
        zzfqm zzfqmVar2 = new zzfqm(zzfqmVarA.f, zzfqmVarA.a, zzfqmVarA.b, zzfqmVarA.c, zzfqmVarA.d, zzheh.h(zzfqmVarA.e, ma4Var, o24Var));
        return zzfqmVar2.f.a(zzfqmVar2.d(), zzfqp.ADAPTER_WRAP_ADAPTER).a(new bf4(this, zzfmbVar, zzflqVar, zzengVarA)).d();
    }

    @Override // com.google.android.gms.internal.ads.zzend
    public final boolean b(zzfmb zzfmbVar, zzflq zzflqVar) {
        return !zzflqVar.t.isEmpty();
    }

    public zzesf(zzfqv zzfqvVar, zzher zzherVar, zzenf zzenfVar, zzenj zzenjVar) {
        this.c = zzfqvVar;
        this.d = zzherVar;
        this.b = zzenjVar;
        this.a = zzenfVar;
    }

    public static final String c(int i, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }
}
