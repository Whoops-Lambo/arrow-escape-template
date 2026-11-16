package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.common.util.concurrent.ListenableFuture;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.c71;
import defpackage.js4;
import defpackage.ku4;
import defpackage.m62;
import defpackage.o24;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbrg implements zzbqs {
    public final com.google.android.gms.ads.internal.zzb a;
    public final zzeaw b;
    public final zzbze d;
    public final zzelr e;
    public final zzcuo f;
    public final zzddd g;
    public final zzdct h;
    public zzu c = null;
    public com.google.android.gms.ads.internal.overlay.zzaa i = null;
    public final o24 j = zzcgv.h;

    public static int b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if (CmcdData.STREAM_TYPE_LIVE.equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri c(Context context, zzbbo zzbboVar, Uri uri, View view, Activity activity, zzfmn zzfmnVar) {
        if (zzbboVar != null) {
            try {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Rd)).booleanValue() || zzfmnVar == null) {
                    if (zzbboVar.c(uri)) {
                        return zzbboVar.b(uri, context, view, activity);
                    }
                } else if (zzbboVar.c(uri)) {
                    return zzfmnVar.a(uri, context, view, activity);
                }
            } catch (zzbbp unused) {
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzt.zzh().d("OpenGmsgHandler.maybeAddClickSignalsToUri", e);
            }
        }
        return uri;
    }

    public static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e) {
            String strValueOf = String.valueOf(uri.toString());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error adding click uptime parameter to url: ".concat(strValueOf), e);
            return uri;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqs
    public final void a(Object obj, Map map) {
        zzcuo zzcuoVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY);
        Map map2 = new HashMap();
        zzcly zzclyVar = (zzcly) zzaVar;
        if (zzclyVar.zzC() != null) {
            map2 = zzclyVar.zzC().w0;
        }
        String strA = zzcff.a(str, zzclyVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.a;
        if (zzbVar != null && !zzbVar.zzb()) {
            zzbVar.zzc(strA);
        } else {
            ListenableFuture listenableFutureA = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ob)).booleanValue() && (zzcuoVar = this.f) != null && zzcuo.b(strA)) ? zzcuoVar.a(strA, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzheh.a(strA);
            listenableFutureA.addListener(new ku4(0, listenableFutureA, new m62(this, map, zzaVar, str2)), this.j);
        }
    }

    public final /* synthetic */ void e(String str, Bundle bundle, String str2) {
        zzeaw zzeawVar = this.b;
        if (zzeawVar == null) {
            return;
        }
        String strEncodeToString = bundle != null ? Base64.encodeToString(com.google.android.gms.ads.internal.client.zzay.zza().zzn(bundle, new JSONObject()).toString().getBytes(), 1) : null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Re)).booleanValue()) {
            zzeav zzeavVarA = zzeawVar.a();
            zzeavVarA.b("action", str);
            if (str2 != null) {
                zzeavVarA.b("gqi", str2);
            }
            if (strEncodeToString != null) {
                zzeavVarA.b("hsoe", strEncodeToString);
            }
            zzeavVarA.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjr.ba)).booleanValue() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjr.W9)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjr.V9)).booleanValue()) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(com.google.android.gms.ads.internal.client.zza r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbrg.f(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final void g(Context context, String str, String str2) {
        zzelr zzelrVar = this.e;
        zzelrVar.d(str);
        zzeaw zzeawVar = this.b;
        if (zzeawVar != null) {
            c71.y("dialog_not_shown_reason", str2);
            zzemc.P3(context, zzeawVar, zzelrVar, str, "dialog_not_shown", js4.h(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0114  */
    /* JADX WARN: Code duplicated, block: B:35:0x011b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0159  */
    /* JADX WARN: Code duplicated, block: B:50:0x0164  */
    public final void h(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2, boolean z3) {
        Uri uriBuild;
        Intent intent;
        Intent intentB;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoA;
        boolean z4 = true;
        i(true);
        zzcly zzclyVar = (zzcly) zzaVar;
        Context context = zzclyVar.getContext();
        zzbbo zzbboVarB = zzclyVar.b();
        View viewZzE = zzclyVar.zzE();
        zzfmn zzfmnVarZzT = zzclyVar.zzT();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY);
        if (TextUtils.isEmpty(str2)) {
            intentB = null;
        } else {
            Uri uriD = d(c(context, zzbboVarB, Uri.parse(str2), viewZzE, null, zzfmnVarZzT));
            boolean z5 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z6 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.L5)).booleanValue()) {
                    z4 = false;
                }
            }
            if (com.safedk.android.analytics.brandsafety.creatives.g.e.equalsIgnoreCase(uriD.getScheme())) {
                uriBuild = uriD.buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build();
            } else {
                uriBuild = HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(uriD.getScheme()) ? uriD.buildUpon().scheme(com.safedk.android.analytics.brandsafety.creatives.g.e).build() : null;
            }
            ArrayList arrayList = new ArrayList();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.addFlags(268435456);
            intent2.setData(uriD);
            intent2.setAction("android.intent.action.VIEW");
            if (uriBuild == null) {
                intent = null;
            } else {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.addFlags(268435456);
                intent3.setData(uriBuild);
                intent3.setAction("android.intent.action.VIEW");
                intent = intent3;
            }
            if (z4) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzq(context, intent2);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzq(context, intent);
            }
            ResolveInfo resolveInfoA2 = zzbrf.a(intent2, arrayList, context);
            if (resolveInfoA2 != null) {
                intentB = zzbrf.b(intent2, resolveInfoA2);
            } else if (intent != null && (resolveInfoA = zzbrf.a(intent, new ArrayList(), context)) != null) {
                intentB = zzbrf.b(intent2, resolveInfoA);
                if (zzbrf.a(intentB, new ArrayList(), context) == null) {
                    if (!arrayList.isEmpty()) {
                        intentB = intent2;
                    } else if (!z6) {
                        if (z5) {
                            intentB = zzbrf.b(intent2, (ResolveInfo) arrayList.get(0));
                        } else {
                            intentB = intent2;
                        }
                    } else if (z5) {
                        intentB = zzbrf.b(intent2, (ResolveInfo) arrayList.get(0));
                    } else {
                        intentB = intent2;
                    }
                }
            } else if (!arrayList.isEmpty()) {
                intentB = intent2;
            } else if (!z6 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            int i2 = i + 1;
                            if (!it.hasNext()) {
                                i = i2;
                            } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                intentB = zzbrf.b(intent2, resolveInfo);
                            }
                        }
                    } else if (z5) {
                        intentB = zzbrf.b(intent2, (ResolveInfo) arrayList.get(0));
                    } else {
                        intentB = intent2;
                    }
                }
            } else if (z5) {
                intentB = zzbrf.b(intent2, (ResolveInfo) arrayList.get(0));
            } else {
                intentB = intent2;
            }
        }
        if (!z || this.e == null || intentB == null || !f(zzaVar, zzclyVar.getContext(), intentB.getData().toString(), str)) {
            try {
                ((zzcnp) zzaVar).k0(new com.google.android.gms.ads.internal.overlay.zzc(intentB, this.i), z2, z3, str);
            } catch (ActivityNotFoundException e) {
                String message = e.getMessage();
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi(message);
            }
        }
    }

    public final void i(boolean z) {
        zzbze zzbzeVar = this.d;
        if (zzbzeVar != null) {
            zzbzeVar.f(z);
        }
    }

    public final void j(int i) {
        zzeaw zzeawVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.O5)).booleanValue() || (zzeawVar = this.b) == null) {
            return;
        }
        zzeav zzeavVarA = zzeawVar.a();
        zzeavVarA.b("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzeavVarA.b("cct_open_status", str);
        zzeavVarA.c();
    }

    public zzbrg(com.google.android.gms.ads.internal.zzb zzbVar, zzbze zzbzeVar, zzelr zzelrVar, zzeaw zzeawVar, zzcuo zzcuoVar, zzddd zzdddVar, zzdct zzdctVar) {
        this.a = zzbVar;
        this.d = zzbzeVar;
        this.e = zzelrVar;
        this.b = zzeawVar;
        this.f = zzcuoVar;
        this.g = zzdddVar;
        this.h = zzdctVar;
    }
}
