package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.pv1;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class C5 {
    static final String e = "euid";
    static final String f = "esat";
    static final String g = "esfr";
    static final int h = 1;
    private int a;
    private long b;
    private int c;
    private final JSONObject d;

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5 c5 = (C5) obj;
        return this.a == c5.a && this.b == c5.b && this.c == c5.c && Aa.a(this.d, c5.d);
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.d.put(str, obj);
        } catch (JSONException e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    public JSONObject b() {
        return this.d;
    }

    public int c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    public int hashCode() {
        return ((this.d.toString().hashCode() + pv1.d(Integer.hashCode(this.a) * 31, 31, this.b)) * 31) + this.c;
    }

    @NotNull
    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + "," + a().substring(1) + "}").replace(",", "\n");
    }

    public C5(int i, long j, JSONObject jSONObject) {
        this.c = 1;
        this.a = i;
        this.b = j;
        jSONObject = jSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObject;
        this.d = jSONObject;
        if (!jSONObject.has(e)) {
            a(e, UUID.randomUUID().toString());
        }
        if (jSONObject.has(f)) {
            this.c = jSONObject.optInt(f, 1);
        } else {
            a(f, Integer.valueOf(this.c));
        }
    }

    public void a(int i) {
        this.a = i;
    }

    public String a() {
        return this.d.toString();
    }

    public void a(String str) {
        a(g, str);
        int i = this.c + 1;
        this.c = i;
        a(f, Integer.valueOf(i));
    }

    public C5(int i, JSONObject jSONObject) {
        this(i, new InterfaceC4986t4.a().a(), jSONObject);
    }

    public C5(int i, long j, String str) throws JSONException {
        this(i, j, IronSourceNetworkBridge.jsonObjectInit(str));
    }

    public C5(D5 d5, long j, JSONObject jSONObject) {
        this(d5.c(), j, jSONObject);
    }

    public C5(D5 d5, JSONObject jSONObject) {
        this(d5.c(), jSONObject);
    }
}
