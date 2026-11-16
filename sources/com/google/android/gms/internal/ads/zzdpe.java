package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdpe implements zzdec, zzdlo {
    public final zzcfa a;
    public final Context b;
    public final zzcfd c;
    public final View d;
    public String e;
    public final zzbiw.zza.EnumC0295zza f;
    public final zzflq g;

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void L() {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlo
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void A(zzccq zzccqVar, String str, String str2) {
        zzcfd zzcfdVar = this.c;
        Context context = this.b;
        if (zzcfdVar.a(context) && this.g.I0) {
            try {
                zzcfdVar.e(context, zzcfdVar.d(context), this.a.c, zzccqVar.b, zzccqVar.a);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void N() {
        if (this.g.I0) {
            View view = this.d;
            if (view != null && this.e != null) {
                Context context = view.getContext();
                String str = this.e;
                zzcfd zzcfdVar = this.c;
                AtomicReference atomicReference = zzcfdVar.h;
                if (zzcfdVar.a(context) && (context instanceof Activity) && zzcfdVar.m(context, Constants.FID_CLASS, atomicReference, false)) {
                    ConcurrentHashMap concurrentHashMap = zzcfdVar.i;
                    Method declaredMethod = (Method) concurrentHashMap.get("setCurrentScreen");
                    if (declaredMethod == null) {
                        try {
                            declaredMethod = context.getClassLoader().loadClass(Constants.FID_CLASS).getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            concurrentHashMap.put("setCurrentScreen", declaredMethod);
                        } catch (Exception unused) {
                            zzcfdVar.l("setCurrentScreen", false);
                            declaredMethod = null;
                        }
                    }
                    try {
                        declaredMethod.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        zzcfdVar.l("setCurrentScreen", false);
                    }
                }
            }
            this.a.d(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void O() {
        if (this.g.I0) {
            this.a.d(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlo
    public final void zzh() {
        zzbiw.zza.EnumC0295zza enumC0295zza = zzbiw.zza.EnumC0295zza.APP_OPEN;
        zzbiw.zza.EnumC0295zza enumC0295zza2 = this.f;
        if (enumC0295zza2 != enumC0295zza && this.g.I0) {
            zzcfd zzcfdVar = this.c;
            Context context = this.b;
            String str = "";
            if (zzcfdVar.a(context)) {
                AtomicReference atomicReference = zzcfdVar.g;
                if (zzcfdVar.m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                    try {
                        String str2 = (String) zzcfdVar.i(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                        if (str2 == null) {
                            str2 = (String) zzcfdVar.i(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                        }
                        if (str2 != null) {
                            str = str2;
                        }
                    } catch (Exception unused) {
                        zzcfdVar.l("getCurrentScreenName", false);
                    }
                }
            }
            this.e = str;
            this.e = str.concat(enumC0295zza2 == zzbiw.zza.EnumC0295zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    public zzdpe(zzcfa zzcfaVar, Context context, zzcfd zzcfdVar, WebView webView, zzbiw.zza.EnumC0295zza enumC0295zza, zzflq zzflqVar) {
        this.a = zzcfaVar;
        this.b = context;
        this.c = zzcfdVar;
        this.d = webView;
        this.f = enumC0295zza;
        this.g = zzflqVar;
    }
}
