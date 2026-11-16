package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.e74;
import defpackage.ku4;
import defpackage.nu4;
import defpackage.o92;
import defpackage.ra4;
import defpackage.vt4;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdwi {
    public final com.google.android.gms.ads.internal.zza b;
    public final Context c;
    public final zzeaw d;
    public final Executor e;
    public final zzbbo f;
    public final VersionInfoParcel g;
    public final zzelr i;
    public final zzftx j;
    public final zzemc k;
    public final zzfmn l;
    public final zzdct m;
    public vt4 n;
    public final zzdvw a = new zzdvw();
    public final zzbrl h = new zzbrl();

    public final synchronized ListenableFuture a(String str, JSONObject jSONObject) {
        vt4 vt4Var = this.n;
        if (vt4Var == null) {
            return nu4.b;
        }
        return zzheh.h(vt4Var, new e74(2, this, str, jSONObject), this.e);
    }

    public final synchronized void b(String str, zzbqs zzbqsVar) {
        vt4 vt4Var = this.n;
        if (vt4Var == null) {
            return;
        }
        ra4 ra4Var = new ra4(this, str, zzbqsVar, 0);
        vt4Var.addListener(new ku4(0, vt4Var, ra4Var), this.e);
    }

    public final synchronized void c(String str, zzbqs zzbqsVar) {
        vt4 vt4Var = this.n;
        if (vt4Var == null) {
            return;
        }
        ra4 ra4Var = new ra4(this, str, zzbqsVar, 1);
        vt4Var.addListener(new ku4(0, vt4Var, ra4Var), this.e);
    }

    public final synchronized void d(Map map) {
        vt4 vt4Var = this.n;
        if (vt4Var == null) {
            return;
        }
        o92 o92Var = new o92();
        o92Var.a = map;
        Objects.requireNonNull(this);
        vt4Var.addListener(new ku4(0, vt4Var, o92Var), this.e);
    }

    public zzdwi(zzdwg zzdwgVar) {
        this.c = zzdwgVar.b;
        this.e = zzdwgVar.e;
        this.f = zzdwgVar.f;
        this.g = zzdwgVar.g;
        this.b = zzdwgVar.a;
        this.i = zzdwgVar.d;
        this.j = zzdwgVar.h;
        this.d = zzdwgVar.c;
        this.k = zzdwgVar.i;
        this.l = zzdwgVar.j;
        this.m = zzdwgVar.k;
    }
}
