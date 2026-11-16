package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.vq0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzecj {
    public final zzbru a;

    public final void a(long j) {
        vq0 vq0Var = new vq0("creation");
        vq0Var.a = Long.valueOf(j);
        vq0Var.c = "nativeObjectNotCreated";
        b(vq0Var);
    }

    public zzecj(zzbru zzbruVar) {
        this.a = zzbruVar;
    }

    public final void b(vq0 vq0Var) {
        String strQ = vq0Var.q();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strQ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh(strConcat);
        this.a.zza(strQ);
    }
}
