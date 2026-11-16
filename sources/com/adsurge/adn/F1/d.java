package com.adsurge.adn.F1;

import com.ironsource.C4664b4;
import defpackage.jc1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class d {
    public final String a;
    public final String b;
    public final String c;
    public final JSONObject d;
    public final String e;
    public final long f;

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.e;
    }

    public JSONObject d() {
        return this.d;
    }

    public String e() {
        return this.a;
    }

    public long f() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GDTJsRequest [service=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", callbackId=");
        sb.append(this.c);
        sb.append(", paraObj=");
        sb.append(this.d);
        sb.append(", multiActionPara:");
        sb.append(this.e);
        sb.append(",timeStamp:");
        return jc1.m(this.f, C4664b4.j.e, sb);
    }

    public d(String str, String str2, String str3, JSONObject jSONObject, String str4, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = jSONObject;
        this.e = str4;
        this.f = j;
    }

    public d(String str, String str2, String str3, JSONObject jSONObject, long j) {
        this(str, str2, str3, jSONObject, null, j);
    }

    public d(String str, String str2, String str3, JSONObject jSONObject) {
        this(str, str2, str3, jSONObject, null, System.currentTimeMillis());
    }
}
