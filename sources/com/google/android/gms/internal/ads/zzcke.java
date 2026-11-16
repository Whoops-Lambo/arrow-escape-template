package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import defpackage.pt3;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzcke implements Releasable {
    public final Context a;
    public final String b;
    public final WeakReference c;

    public abstract boolean f(String str);

    public void j(int i) {
    }

    public void k(int i) {
    }

    public void m(int i) {
    }

    public void n(int i) {
    }

    public abstract void o();

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public final void p(String str, String str2, String str3, String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new pt3((Object) this, str, str2, (Object) str3, (Object) str4, 1));
    }

    public final /* synthetic */ void q(HashMap map) {
        zzcir zzcirVar = (zzcir) this.c.get();
        if (zzcirVar != null) {
            zzcirVar.m("onPrecacheEvent", map);
        }
    }

    public zzcke(zzcir zzcirVar) {
        Context context = zzcirVar.getContext();
        this.a = context;
        this.b = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcirVar.zzs().afmaVersion);
        this.c = new WeakReference(zzcirVar);
    }

    public boolean g(String str, String[] strArr) {
        return f(str);
    }

    public boolean h(String str, String[] strArr, zzcjw zzcjwVar) {
        return f(str);
    }
}
