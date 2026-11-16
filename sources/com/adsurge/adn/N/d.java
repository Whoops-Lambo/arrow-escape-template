package com.adsurge.adn.N;

import android.os.SystemClock;
import android.text.TextUtils;
import com.adsurge.adn.I0.e;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.p036k1.j;
import defpackage.h50;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static final JSONObject e = new JSONObject();
    public volatile JSONObject a;
    public volatile JSONObject b;
    public volatile boolean c;
    public volatile long d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public static final d a = new d();
    }

    public static d b() {
        return a.a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    public void a(JSONObject jSONObject, boolean z) {
        boolean z2;
        JSONObject jSONObjectA = new e(jSONObject.optString("app_config")).a();
        JSONObject jSONObjectA2 = new e(jSONObject.optString("placement_config")).a();
        boolean zOptBoolean = jSONObject.optBoolean("support_negative_feedback");
        this.a = jSONObjectA == null ? e : jSONObjectA;
        if (jSONObjectA2 == null) {
            jSONObjectA2 = e;
        }
        this.b = jSONObjectA2;
        if (zOptBoolean) {
            z2 = b.a("sknfe", 1) == 1;
        }
        this.c = z2;
        if (z) {
            this.d = jSONObject.optLong("cur_time_stamp") - SystemClock.elapsedRealtime();
        }
        if (jSONObjectA != null) {
            com.adsurge.adn.F.e.a(jSONObjectA.optInt("dsec", 0));
            com.adsurge.adn.B.b.c().b(jSONObjectA.optInt("dybs", 0));
            com.adsurge.adn.B.b.c().a(jSONObjectA.optInt("dybat", 0));
        }
        com.adsurge.adn.p069z.a.a(this.a);
        j.a();
        com.adsurge.adn.K1.b.b().f();
    }

    public boolean c() {
        return this.c;
    }

    public d() {
        JSONObject jSONObject = e;
        this.a = jSONObject;
        this.b = jSONObject;
        this.c = false;
    }

    public long a() {
        return SystemClock.elapsedRealtime() + this.d;
    }

    public String a(String str, String str2, AdSurgeAdFormat adSurgeAdFormat, String str3) {
        String strA;
        return (adSurgeAdFormat == null || (strA = a(a(str, adSurgeAdFormat), str2, (String) null)) == null) ? a(str, str2, str3) : strA;
    }

    public String a(String str, com.adsurge.adn.u1.c cVar, String str2) {
        if (cVar == null) {
            return a(str, (String) null, str2);
        }
        AdSurgeAdFormat adSurgeAdFormatX = cVar.x();
        JSONObject jSONObjectH0 = cVar.h0();
        if (jSONObjectH0 != null) {
            Object objOpt = jSONObjectH0.opt(str);
            if (objOpt instanceof String) {
                return (String) objOpt;
            }
        }
        return a(str, cVar.y(), adSurgeAdFormatX, str2);
    }

    public final String a(String str, String str2, String str3) {
        Object objA = a(str, str2);
        return objA instanceof String ? objA.toString() : str3;
    }

    public int a(String str, String str2, AdSurgeAdFormat adSurgeAdFormat, int i) {
        int iA = adSurgeAdFormat != null ? a(a(str, adSurgeAdFormat), str2, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        return iA == Integer.MIN_VALUE ? a(str, str2, i) : iA;
    }

    public int a(String str, com.adsurge.adn.u1.c cVar, int i) {
        if (cVar == null) {
            return a(str, (String) null, i);
        }
        AdSurgeAdFormat adSurgeAdFormatX = cVar.x();
        JSONObject jSONObjectH0 = cVar.h0();
        if (jSONObjectH0 != null) {
            Object objOpt = jSONObjectH0.opt(str);
            if (objOpt instanceof Integer) {
                return ((Integer) objOpt).intValue();
            }
        }
        return a(str, cVar.y(), adSurgeAdFormatX, i);
    }

    public final int a(String str, String str2, int i) {
        Object objA = a(str, str2);
        return objA instanceof Integer ? ((Integer) objA).intValue() : i;
    }

    public final String a(String str, AdSurgeAdFormat adSurgeAdFormat) {
        StringBuilder sbQ = h50.q(str, "_");
        sbQ.append(adSurgeAdFormat.type);
        return sbQ.toString();
    }

    public Object a(String str, String str2, Object obj) {
        Object objA = a(str, str2);
        return objA != null ? objA : obj;
    }

    public Object a(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        Object objOpt = (TextUtils.isEmpty(str2) || (jSONObjectOptJSONObject = this.b.optJSONObject(str2)) == null) ? null : jSONObjectOptJSONObject.opt(str);
        return objOpt == null ? this.a.opt(str) : objOpt;
    }
}
