package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.ironsource.R6;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.jc1;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zzfyk {
    public final String a;
    public long c = System.nanoTime();
    public int d = 1;
    public zzfzp b = new zzfzp(null);

    public void a() {
    }

    public void d(zzfwk zzfwkVar, zzfwi zzfwiVar) {
        e(zzfwkVar, zzfwiVar, null);
    }

    public void b() {
        this.b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView c() {
        return (WebView) this.b.get();
    }

    public final void e(zzfwk zzfwkVar, zzfwi zzfwiVar, JSONObject jSONObject) {
        String str = zzfwkVar.g;
        JSONObject jSONObject2 = new JSONObject();
        zzfyt.b(jSONObject2, "environment", "app");
        zzfyt.b(jSONObject2, "adSessionType", zzfwiVar.g);
        JSONObject jSONObject3 = new JSONObject();
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        zzfyt.b(jSONObject3, "deviceType", jc1.o(str2, "; ", new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str3).length()), str3));
        zzfyt.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfyt.b(jSONObject3, R6.F, "Android");
        zzfyt.b(jSONObject2, "deviceInfo", jSONObject3);
        zzfyt.b(jSONObject2, "deviceCategory", zzfyq.a().a);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfyt.b(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfww zzfwwVar = zzfwiVar.a;
        zzfyt.b(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, zzfwwVar.a);
        zzfyt.b(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, zzfwwVar.b);
        zzfyt.b(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfyt.b(jSONObject5, "libraryVersion", "1.6.9-google_20260729");
        zzfyt.b(jSONObject5, "appId", zzfxw.b.a.getApplicationContext().getPackageName());
        zzfyt.b(jSONObject2, "app", jSONObject5);
        String str4 = zzfwiVar.f;
        if (str4 != null) {
            zzfyt.b(jSONObject2, "contentUrl", str4);
        }
        String str5 = zzfwiVar.e;
        if (str5 != null) {
            zzfyt.b(jSONObject2, "customReferenceData", str5);
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = Collections.unmodifiableList(zzfwiVar.c).iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfxy.a.a(c(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    public final void f(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfyt.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfxy.a.a(c(), "setLastActivity", jSONObject);
    }

    public zzfyk(String str) {
        this.a = str;
    }
}
