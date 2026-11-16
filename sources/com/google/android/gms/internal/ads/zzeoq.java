package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.le4;
import defpackage.nu4;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeoq implements zzend {
    public final Context a;
    public final zzdor b;
    public final Executor c;
    public final zzflp d;
    public final zzeaw e;

    @Override // com.google.android.gms.internal.ads.zzend
    public final ListenableFuture a(zzfmb zzfmbVar, zzflq zzflqVar) {
        String string;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.gf)).booleanValue()) {
            zzeav zzeavVarA = this.e.a();
            zzeavVarA.b("action", "cstm_tbs_rndr");
            zzeavVarA.c();
        }
        try {
            string = zzflqVar.v.getString("tab_url");
        } catch (Exception unused) {
            string = null;
        }
        return zzheh.h(nu4.b, new le4(this, string != null ? Uri.parse(string) : null, zzfmbVar, zzflqVar, zzfmbVar.b.b, 0), this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzend
    public final boolean b(zzfmb zzfmbVar, zzflq zzflqVar) {
        String string;
        Context context = this.a;
        if (!(context instanceof Activity) || !zzbks.a(context)) {
            return false;
        }
        try {
            string = zzflqVar.v.getString("tab_url");
        } catch (Exception unused) {
            string = null;
        }
        return !TextUtils.isEmpty(string);
    }

    public zzeoq(Context context, Executor executor, zzdor zzdorVar, zzflp zzflpVar, zzeaw zzeawVar) {
        this.a = context;
        this.b = zzdorVar;
        this.c = executor;
        this.d = zzflpVar;
        this.e = zzeawVar;
    }
}
