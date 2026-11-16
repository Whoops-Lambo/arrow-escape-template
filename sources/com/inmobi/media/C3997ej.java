package com.inmobi.media;

import android.content.Context;
import android.os.Build;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.inmobi.media.C3997ej;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import defpackage.az2;
import defpackage.cg0;
import defpackage.cz;
import defpackage.dk2;
import defpackage.dt1;
import defpackage.qh1;
import defpackage.sr0;
import defpackage.tb5;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ej, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3997ej {
    public final Context a;
    public final long b;
    public final int c;
    public boolean d;
    public final Cc e;
    public final C4137jk f;
    public final List g;
    public final ConcurrentHashMap h;
    public final AtomicBoolean i;
    public String j;
    public final AtomicInteger k;

    public final void b() {
        Objects.toString(this.i);
        if ((this.d || this.f.a()) && !this.i.getAndSet(true)) {
            cz czVar = Sc.a;
            Rc.a(new C3914bj(this, null));
        }
    }

    public final String c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (Ki.a) {
            LinkedHashMap linkedHashMapZ = qh1.Z(new dt1("d-build-v", Build.ID), new dt1("os-v", Build.VERSION.RELEASE), new dt1("d-build-model", Build.MODEL));
            String strB = Ki.b();
            if (strB != null) {
                if (dk2.Z(strB)) {
                    strB = null;
                }
                if (strB != null) {
                    linkedHashMapZ.put("d-wv-v", strB);
                }
            }
            for (Map.Entry entry : linkedHashMapZ.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!jSONObject.has(str)) {
                    jSONObject.put(str, str2);
                }
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.h) {
            for (Map.Entry entry2 : this.h.entrySet()) {
                jSONObject2.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put(CreativeInfo.f, d());
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List list = this.g;
        list.getClass();
        synchronized (list) {
            List list2 = this.g;
            list2.getClass();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                jSONArray.put((JSONObject) it.next());
            }
        }
        return jSONArray;
    }

    public final boolean e() throws JSONException {
        if (this.g.isEmpty() || this.h.isEmpty()) {
            return true;
        }
        String strC = c();
        strC.getClass();
        return strC.equals(JsonUtils.EMPTY_JSON);
    }

    public C3997ej(Context context, double d, Ac ac, long j, int i) {
        context.getClass();
        ac.getClass();
        this.a = context;
        this.b = j;
        this.c = i;
        this.d = false;
        this.e = new Cc(ac);
        this.f = new C4137jk(d);
        this.g = Collections.synchronizedList(new ArrayList());
        this.h = new ConcurrentHashMap();
        this.i = new AtomicBoolean(false);
        this.j = "";
        this.k = new AtomicInteger(0);
    }

    public final void a(Ac ac, String str, String str2) throws JSONException {
        ac.getClass();
        str.getClass();
        str2.getClass();
        if (this.i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = Dc.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", ac.name());
        jSONObject.put("timestamp", Dc.a.format(new Date()));
        jSONObject.put("tag", str);
        jSONObject.put("data", str2);
        cz czVar = Sc.a;
        Rc.a(new C3942cj(this, ac, jSONObject, null));
    }

    public final void b(boolean z) {
        Objects.toString(this.i);
        if (this.i.get()) {
            return;
        }
        this.d = z;
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        Objects.toString(this.i);
        if (this.i.get()) {
            return;
        }
        this.h.put(str, str2);
    }

    public final void a() {
        Objects.toString(this.i);
        if ((this.d || this.f.a()) && !this.i.get()) {
            cz czVar = Sc.a;
            Rc.a(new C3886aj(this, null));
        }
    }

    public final void a(final boolean z) {
        Objects.toString(this.i);
        cz czVar = Sc.a;
        Rc.a(new sr0() { // from class: ad3
            @Override // defpackage.sr0
            public final Object invoke() {
                return C3997ej.a(this.a, z);
            }
        });
    }

    public static final az2 a(C3997ej c3997ej, boolean z) throws Throwable {
        boolean zE = c3997ej.e();
        az2 az2Var = az2.a;
        if (!zE) {
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            if (c3997ej.j.length() == 0) {
                cz czVar = Sc.a;
                c3997ej.j = Rc.a(c3997ej.a, timeInMillis);
            }
            if (c3997ej.a(c3997ej.j)) {
                tb5.y(cg0.a, new C3970dj(c3997ej, timeInMillis, z, null));
            }
        }
        return az2Var;
    }

    public final boolean a(String str) {
        return Tc.a("RemoteLogger", c(), str);
    }
}
