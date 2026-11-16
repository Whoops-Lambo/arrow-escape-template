package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;
import defpackage.az2;
import defpackage.cz;
import defpackage.dy;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjc extends ul2 implements zr0 {
    final /* synthetic */ zzjd zza;
    final /* synthetic */ Context zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjc(zzjd zzjdVar, Context context, dy dyVar) {
        super(2, dyVar);
        this.zza = zzjdVar;
        this.zzb = context;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new zzjc(this.zza, this.zzb, dyVar);
    }

    @Override // defpackage.zr0
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjc) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        WebView webView = this.zza.zza;
        if (webView == null) {
            webView = new WebView(this.zzb);
        }
        this.zza.zza = webView;
        return webView;
    }
}
