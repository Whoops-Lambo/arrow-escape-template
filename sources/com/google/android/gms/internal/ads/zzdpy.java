package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import defpackage.d94;
import defpackage.h94;
import defpackage.i94;
import defpackage.ku4;
import defpackage.oz3;
import defpackage.vt4;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdpy implements zzdrm {
    public com.google.android.gms.ads.internal.client.zzdc C;
    public final zzdgr D;
    public final zzdsf E;
    public final com.google.android.gms.ads.internal.zzb F;
    public final zzdcx G;
    public final Context a;
    public final zzdro b;
    public final JSONObject c;
    public final zzdwi d;
    public final zzdre e;
    public final zzbbo f;
    public final zzdeu g;
    public final zzdea h;
    public final zzdmh i;
    public final zzflq j;
    public final VersionInfoParcel k;
    public final zzfmj l;
    public final zzcvl m;
    public final zzdsj n;
    public final Clock o;
    public final zzdmd p;
    public final zzftx q;
    public final zzdxy r;
    public final zzfrt s;
    public final zzemc t;
    public boolean v;
    public boolean u = false;
    public boolean w = false;
    public boolean x = false;
    public Point y = new Point();
    public Point z = new Point();
    public long A = 0;
    public long B = 0;

    public zzdpy(Context context, zzdro zzdroVar, JSONObject jSONObject, zzdwi zzdwiVar, zzdre zzdreVar, zzbbo zzbboVar, zzdeu zzdeuVar, zzdea zzdeaVar, zzdmh zzdmhVar, zzflq zzflqVar, VersionInfoParcel versionInfoParcel, zzfmj zzfmjVar, zzcvl zzcvlVar, zzdsj zzdsjVar, Clock clock, zzdmd zzdmdVar, zzftx zzftxVar, zzfrt zzfrtVar, zzemc zzemcVar, zzdxy zzdxyVar, zzdsf zzdsfVar, zzdgr zzdgrVar, com.google.android.gms.ads.internal.zzb zzbVar, zzdcx zzdcxVar) {
        this.a = context;
        this.b = zzdroVar;
        this.c = jSONObject;
        this.d = zzdwiVar;
        this.e = zzdreVar;
        this.f = zzbboVar;
        this.g = zzdeuVar;
        this.h = zzdeaVar;
        this.i = zzdmhVar;
        this.j = zzflqVar;
        this.k = versionInfoParcel;
        this.l = zzfmjVar;
        this.m = zzcvlVar;
        this.n = zzdsjVar;
        this.o = clock;
        this.p = zzdmdVar;
        this.q = zzftxVar;
        this.s = zzfrtVar;
        this.t = zzemcVar;
        this.r = zzdxyVar;
        this.E = zzdsfVar;
        this.D = zzdgrVar;
        this.F = zzbVar;
        this.G = zzdcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void zzd(String str) {
        v(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void zzg() {
        this.x = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void zzn() {
        t(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void a(View view) {
        this.y = new Point();
        this.z = new Point();
        if (view != null) {
            zzdmd zzdmdVar = this.p;
            synchronized (zzdmdVar) {
                WeakHashMap weakHashMap = zzdmdVar.b;
                if (weakHashMap.containsKey(view)) {
                    ((zzbft) weakHashMap.get(view)).l.remove(zzdmdVar);
                    weakHashMap.remove(view);
                }
            }
        }
        this.v = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final boolean b(Bundle bundle) {
        if (d("impression_reporting")) {
            return t(null, null, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.md)).booleanValue() ? u(null) : null, com.google.android.gms.ads.internal.client.zzay.zza().zzn(bundle, null), false, null);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzf("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.a;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZze);
            jSONObject.put("ad_view_signal", jSONObjectZzb);
            jSONObject.put("scroll_view_signal", jSONObjectZzc);
            jSONObject.put("lock_screen_signal", jSONObjectZzd);
            return jSONObject;
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    public final boolean d(String str) {
        JSONObject jSONObjectOptJSONObject = this.c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void e(zzbou zzbouVar) {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdsj zzdsjVar = this.n;
        zzdwi zzdwiVar = zzdsjVar.a;
        zzdsjVar.c = zzbouVar;
        oz3 oz3Var = zzdsjVar.d;
        if (oz3Var != null) {
            zzdwiVar.c("/unconfirmedClick", oz3Var);
        }
        oz3 oz3Var2 = new oz3(2, zzdsjVar, zzbouVar);
        zzdsjVar.d = oz3Var2;
        zzdwiVar.b("/unconfirmedClick", oz3Var2);
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void f(Bundle bundle) {
        if (bundle == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Click data is null. No click is reported.");
        } else if (d("click_reporting")) {
            Bundle bundle2 = bundle.getBundle("click_signal");
            v(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzay.zza().zzn(bundle, null), false, false);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void g(View view, Map map, Map map2, zzdtb zzdtbVar, zzdtb zzdtbVar2) {
        this.y = new Point();
        this.z = new Point();
        if (!this.v) {
            this.p.l0(view);
            this.v = true;
        }
        view.setOnTouchListener(zzdtbVar);
        view.setClickable(true);
        view.setOnClickListener(zzdtbVar2);
        zzcvl zzcvlVar = this.m;
        zzcvlVar.getClass();
        zzcvlVar.j = new WeakReference(this);
        boolean zZza = com.google.android.gms.ads.internal.util.zzbs.zza(this.k.clientJarVersion);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZza) {
                        view2.setOnTouchListener(zzdtbVar);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(zzdtbVar2);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZza) {
                        view3.setOnTouchListener(zzdtbVar);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void h(View view) {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            zzdsj zzdsjVar = this.n;
            view.setOnClickListener(zzdsjVar);
            view.setClickable(true);
            zzdsjVar.g = new WeakReference(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void j(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.c;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.td)).booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!this.x) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!jSONObject2.optBoolean("allow_custom_click_gesture", false)) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.a;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view2);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
        boolean z3 = z2;
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view2);
        String strM = m(view, map);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbs.zzf(strM, context, this.z, this.y);
        if (z3) {
            try {
                Point point = this.z;
                Point point2 = this.y;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (Exception e) {
                        e = e;
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzg("Error occurred while grabbing custom click gesture signals.", e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                com.google.android.gms.ads.internal.zzt.zzh().d("FirstPartyNativeAdCore.performCustomClickGesture", e3);
            }
        }
        v(view2, jSONObjectZzb, jSONObjectZze, jSONObjectZzc, jSONObjectZzd, strM, jSONObjectZzf, null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void k(Bundle bundle) {
        if (bundle == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Touch event data is null. No touch event is reported.");
        } else {
            if (!d("touch_reporting")) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzf("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.f.b.zze((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            s();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void l(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        zzew zzewVar;
        zzew zzewVar2;
        zzfrt zzfrtVar = this.s;
        zzflq zzflqVar = this.j;
        zzftx zzftxVar = this.q;
        try {
            if (this.w) {
                return;
            }
            if (zzdgVar == null) {
                zzdre zzdreVar = this.e;
                synchronized (zzdreVar) {
                    zzewVar = zzdreVar.g;
                }
                if (zzewVar != null) {
                    this.w = true;
                    synchronized (zzdreVar) {
                        zzewVar2 = zzdreVar.g;
                    }
                    zzftxVar.b(zzewVar2.zzf(), zzflqVar.x0, zzfrtVar, null);
                    w();
                    return;
                }
            }
            this.w = true;
            zzftxVar.b(zzdgVar.zzf(), zzflqVar.x0, zzfrtVar, null);
            w();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final String m(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iQ = this.e.q();
        if (iQ == 1) {
            return "1099";
        }
        if (iQ == 2) {
            return "2099";
        }
        if (iQ != 6) {
            return null;
        }
        return "3099";
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void o(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        this.C = zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void p(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        Context context = this.a;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view2);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view2);
        String strM = m(view, map);
        v(true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.O4)).booleanValue() ? view2 : view, jSONObjectZzb, jSONObjectZze, jSONObjectZzc, jSONObjectZzd, strM, com.google.android.gms.ads.internal.util.zzbs.zzf(strM, context, this.z, this.y), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.a;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view);
        boolean zZzi = com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.j);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.c);
            jSONObject.put("asset_view_signal", jSONObjectZze);
            jSONObject.put("ad_view_signal", jSONObjectZzb);
            jSONObject.put("scroll_view_signal", jSONObjectZzc);
            jSONObject.put("lock_screen_signal", jSONObjectZzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.H4)).booleanValue()) {
                jSONObject.put("view_signals", u(view));
            }
            jSONObject.put("policy_validator_enabled", zZzi);
            jSONObject.put("screen", com.google.android.gms.ads.internal.util.zzbs.zzj(context));
            zzcgy.a(this.d.a("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging", zzcgv.h);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Unable to create native ad signals logging JSON.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.a;
        t(com.google.android.gms.ads.internal.util.zzbs.zzb(context, view), com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbs.zzc(view), com.google.android.gms.ads.internal.util.zzbs.zzd(context, view), u(view), null, com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.j), view);
    }

    public final void s() {
        com.google.android.gms.ads.internal.zzb zzbVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Kf)).booleanValue() || (zzbVar = this.F) == null) {
            return;
        }
        zzbVar.zza();
    }

    public final boolean t(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z, View view) {
        zzdcx zzdcxVar;
        zzflq zzflqVar = this.j;
        Context context = this.a;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.H4)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", com.google.android.gms.ads.internal.util.zzbs.zzj(context));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Mf)).booleanValue() && (zzdcxVar = this.G) != null) {
                AtomicLong atomicLong = zzdcxVar.a;
                if (atomicLong.get() > 0) {
                    jSONObject6.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, atomicLong.get());
                }
            }
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.fa)).booleanValue();
            zzdwi zzdwiVar = this.d;
            if (zBooleanValue) {
                zzdwiVar.b("/clickRecorded", new h94(this, 1));
            } else {
                zzdwiVar.b("/logScionEvent", new h94(this, 0));
            }
            zzdwiVar.b("/nativeImpression", new oz3(this, view));
            zzdwiVar.b("/nativeImpressionFlowControl", new i94(this, this.q, zzflqVar.x0, this.s));
            zzcgy.a(zzdwiVar.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression", zzcgv.h);
            if (!this.u) {
                this.u = com.google.android.gms.ads.internal.zzt.zzo().zzg(context, this.k.afmaVersion, zzflqVar.C.toString(), this.l.g);
            }
            return true;
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Unable to create impression JSON.", e);
            return false;
        }
    }

    public final String u(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.H4)).booleanValue()) {
            return null;
        }
        try {
            return this.f.b.zzj(this.a, view, null);
        } catch (Exception unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Exception getting data.");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    public final void v(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        List list;
        boolean z3;
        String strZzg;
        zzew zzewVar;
        Clock clock = this.o;
        zzdre zzdreVar = this.e;
        JSONObject jSONObject7 = this.c;
        try {
            s();
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            zzdro zzdroVar = this.b;
            jSONObject8.put("has_custom_click_handler", ((zzboh) zzdroVar.g.get(zzdreVar.g())) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", zzdreVar.q());
            jSONObject9.put("view_aware_api_used", z);
            zzbmv zzbmvVar = this.l.j;
            jSONObject9.put("custom_mute_requested", zzbmvVar != null && zzbmvVar.g);
            synchronized (zzdreVar) {
                list = zzdreVar.f;
            }
            if (list.isEmpty()) {
                z3 = false;
            } else {
                synchronized (zzdreVar) {
                    zzewVar = zzdreVar.g;
                }
                if (zzewVar != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            jSONObject9.put("custom_mute_enabled", z3);
            if (this.n.c != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", clock.currentTimeMillis());
            if (this.x && this.c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", ((zzboh) zzdroVar.g.get(zzdreVar.g())) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZzg = this.f.b.zzg(this.a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Exception obtaining click signals", e);
                strZzg = null;
            }
            jSONObject9.put("click_signals", strZzg);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ja)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ka)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long jCurrentTimeMillis = clock.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", jCurrentTimeMillis - this.A);
            jSONObject10.put("time_from_last_touch", jCurrentTimeMillis - this.B);
            jSONObject8.put("touch_signal", jSONObject10);
            if (this.j.b()) {
                JSONObject jSONObject11 = (JSONObject) jSONObject7.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.t.O3(string, zzdreVar);
                }
            }
            zzcgy.a(this.d.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick", zzcgv.h);
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Unable to create click JSON.", e2);
        }
    }

    public final void w() {
        try {
            com.google.android.gms.ads.internal.client.zzdc zzdcVar = this.C;
            if (zzdcVar != null) {
                zzdcVar.zze();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void x() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.c);
            zzcgy.a(this.d.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression", zzcgv.h);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void zzA() {
        zzdwi zzdwiVar = this.d;
        synchronized (zzdwiVar) {
            vt4 vt4Var = zzdwiVar.n;
            if (vt4Var == null) {
                return;
            }
            d94 d94Var = new d94(1);
            vt4Var.addListener(new ku4(0, vt4Var, d94Var), zzdwiVar.e);
            zzdwiVar.n = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final boolean zzh() {
        return this.c.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void zzq() {
        View view;
        if (this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzdsj zzdsjVar = this.n;
            if (zzdsjVar.c == null || zzdsjVar.f == null) {
                return;
            }
            zzdsjVar.e = null;
            zzdsjVar.f = null;
            WeakReference weakReference = zzdsjVar.g;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                zzdsjVar.g = null;
            }
            try {
                zzdsjVar.c.zzf();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final int zzu() {
        zzbmv zzbmvVar = this.l.j;
        if (zzbmvVar == null) {
            return 0;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.td)).booleanValue()) {
            return zzbmvVar.i;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final JSONObject i(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject jSONObjectC = c(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.x && this.c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectC != null) {
                jSONObject.put("nas", jSONObjectC);
            }
            return jSONObject;
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Unable to create native click meta data JSON.", e);
            return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void n(MotionEvent motionEvent, View view) {
        this.y = com.google.android.gms.ads.internal.util.zzbs.zzh(motionEvent, view);
        long jCurrentTimeMillis = this.o.currentTimeMillis();
        this.B = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.r.a = motionEvent;
            this.A = jCurrentTimeMillis;
            this.z = this.y;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.y;
        motionEventObtain.setLocation(point.x, point.y);
        this.f.b.zzd(motionEventObtain);
        motionEventObtain.recycle();
        s();
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final boolean zzv() {
        if (zzu() != 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.td)).booleanValue()) {
                return this.l.j.j;
            }
            return true;
        }
        return true;
    }
}
