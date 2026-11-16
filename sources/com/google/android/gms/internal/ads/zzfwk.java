package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import defpackage.bd4;
import defpackage.dj4;
import defpackage.wg0;
import defpackage.wx2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfwk extends zzfwg {
    public final zzfwi a;
    public zzfzo c;
    public zzfyk d;
    public final String g;
    public final wx2 h;
    public final zzfxv b = new zzfxv();
    public boolean e = false;
    public boolean f = false;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfwg
    public final void a(View view) {
        if (this.f || ((View) this.c.get()) == view) {
            return;
        }
        wx2 wx2Var = this.h;
        View view2 = (View) ((zzfzo) wx2Var.b).get();
        if (view2 != null) {
            wg0 wg0Var = (wg0) wx2Var.d;
            if (wg0Var != null) {
                view2.removeOnAttachStateChangeListener(wg0Var);
                wx2Var.d = null;
            }
            if (((dj4) wx2Var.c) != null) {
                if (view2.getViewTreeObserver().isAlive()) {
                    view2.getViewTreeObserver().removeOnWindowFocusChangeListener((dj4) wx2Var.c);
                }
                wx2Var.c = null;
            }
        }
        ((zzfzo) wx2Var.b).clear();
        if (view != null) {
            wx2Var.b = new zzfzo(view);
            wg0 wg0Var2 = new wg0(wx2Var);
            wx2Var.d = wg0Var2;
            view.addOnAttachStateChangeListener(wg0Var2);
            if (view.isAttachedToWindow()) {
                wx2Var.j(view);
            }
        }
        this.c = new zzfzo(view);
        zzfyk zzfykVar = this.d;
        zzfykVar.getClass();
        zzfykVar.c = System.nanoTime();
        zzfykVar.d = 1;
        Collection<zzfwk> collectionUnmodifiableCollection = Collections.unmodifiableCollection(zzfxr.c.a);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (zzfwk zzfwkVar : collectionUnmodifiableCollection) {
            if (zzfwkVar != this && ((View) zzfwkVar.c.get()) == view) {
                zzfwkVar.c.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfwg
    public final void b() {
        if (this.f) {
            return;
        }
        wx2 wx2Var = this.h;
        View view = (View) ((zzfzo) wx2Var.b).get();
        if (view != null) {
            wg0 wg0Var = (wg0) wx2Var.d;
            if (wg0Var != null) {
                view.removeOnAttachStateChangeListener(wg0Var);
                wx2Var.d = null;
            }
            if (((dj4) wx2Var.c) != null) {
                if (view.getViewTreeObserver().isAlive()) {
                    view.getViewTreeObserver().removeOnWindowFocusChangeListener((dj4) wx2Var.c);
                }
                wx2Var.c = null;
            }
        }
        ((zzfzo) wx2Var.b).clear();
        this.c.clear();
        if (!this.f) {
            this.b.a.clear();
        }
        this.f = true;
        zzfyk zzfykVar = this.d;
        zzfykVar.getClass();
        zzfxy.a.a(zzfykVar.c(), "finishSession", zzfykVar.a);
        zzfxr zzfxrVar = zzfxr.c;
        ArrayList arrayList = zzfxrVar.a;
        ArrayList arrayList2 = zzfxrVar.b;
        boolean z = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z && arrayList2.size() <= 0) {
            zzfxz zzfxzVarA = zzfxz.a();
            zzfxzVarA.getClass();
            zzfzh zzfzhVar = zzfzh.f;
            zzfzhVar.getClass();
            Handler handler = zzfzh.h;
            if (handler != null) {
                handler.removeCallbacks(zzfzh.j);
                zzfzh.h = null;
            }
            zzfzhVar.a.clear();
            zzfzh.g.post(new bd4(zzfzhVar));
            zzfxq zzfxqVar = zzfxq.d;
            zzfxqVar.a = false;
            zzfxqVar.c = null;
            zzfxn zzfxnVar = zzfxzVarA.b;
            zzfxnVar.b.getContentResolver().unregisterContentObserver(zzfxnVar);
        }
        this.d.b();
        this.d = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwg
    public final void c(View view, zzfwq zzfwqVar) {
        if (this.f) {
            return;
        }
        this.b.a(view, zzfwqVar);
    }

    public final void d() {
        if (this.e || this.d == null) {
            return;
        }
        this.e = true;
        ArrayList arrayList = zzfxr.c.b;
        int i = 0;
        boolean z = arrayList.size() > 0;
        arrayList.add(this);
        if (!z) {
            zzfxz zzfxzVarA = zzfxz.a();
            zzfxzVarA.getClass();
            zzfxq zzfxqVar = zzfxq.d;
            zzfxqVar.c = zzfxzVarA;
            zzfxqVar.a = true;
            boolean zA = zzfxqVar.a();
            zzfxqVar.b = zA;
            zzfxqVar.c(zA);
            zzfzh.f.getClass();
            zzfzh.b();
            zzfxn zzfxnVar = zzfxzVarA.b;
            zzfxnVar.getClass();
            zzfxnVar.f.submit(new bd4(zzfxnVar, 17));
            zzfxnVar.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, zzfxnVar);
        }
        float f = zzfxz.a().a;
        zzfyk zzfykVar = this.d;
        zzfykVar.getClass();
        zzfxy.a.a(zzfykVar.c(), "setDeviceVolume", Float.valueOf(f), zzfykVar.a);
        zzfyk zzfykVar2 = this.d;
        Date date = zzfxp.e.a;
        zzfykVar2.f(date != null ? (Date) date.clone() : null);
        zzfyk zzfykVar3 = this.d;
        List listB = zzfxb.a(zzfxw.b.a).b();
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList2 = (ArrayList) listB;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                for (String str : ((zzfxa) obj).zzd()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("mechanism", "FireTVFOSDAT");
                    jSONObject.put("executionEnvironment", "NATIVE");
                    jSONObject.put("version", str);
                    jSONArray.put(jSONObject);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            zzfyt.b(jSONObject2, "supportedAttestationMechanisms", jSONArray);
            zzfxy.a.a(zzfykVar3.c(), "setSupportedAttestations", jSONObject2);
        } catch (JSONException e) {
            zzfyu.a("Error creating JSON object publishSupportedAttestationMechanisms", e);
        }
        this.d.d(this, this.a);
    }

    public zzfwk(zzfwh zzfwhVar, zzfwi zzfwiVar, String str) {
        wx2 wx2Var = new wx2(28);
        wx2Var.b = new zzfzo(null);
        this.h = wx2Var;
        this.a = zzfwiVar;
        this.g = str;
        this.c = new zzfzo(null);
        zzfwj zzfwjVar = zzfwiVar.g;
        if (zzfwjVar != zzfwj.HTML && zzfwjVar != zzfwj.JAVASCRIPT) {
            this.d = new zzfyp(str, Collections.unmodifiableMap(zzfwiVar.d));
        } else {
            WebView webView = zzfwiVar.b;
            zzfyl zzfylVar = new zzfyl(str);
            if (Build.VERSION.SDK_INT >= 26 && ((ArrayList) zzfxb.a(zzfxw.b.a).b()).size() > 0) {
                webView.setWebViewClient(new zzfzr(webView.getWebViewClient()));
            }
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            zzfylVar.b = new zzfzp(webView);
            this.d = zzfylVar;
        }
        this.d.a();
        zzfxr.c.a.add(this);
        zzfyk zzfykVar = this.d;
        zzfykVar.getClass();
        zzfxy zzfxyVar = zzfxy.a;
        WebView webViewC = zzfykVar.c();
        String str2 = zzfykVar.a;
        JSONObject jSONObject = new JSONObject();
        zzfyt.b(jSONObject, "impressionOwner", zzfwhVar.a);
        zzfyt.b(jSONObject, "mediaEventsOwner", zzfwhVar.b);
        zzfyt.b(jSONObject, "creativeType", zzfwhVar.d);
        zzfyt.b(jSONObject, "impressionType", zzfwhVar.e);
        zzfyt.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(zzfwhVar.c));
        zzfxyVar.a(webViewC, "init", jSONObject, str2);
    }
}
