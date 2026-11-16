package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᘣ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0946 implements Comparable {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C1327 f2545;

    public final int hashCode() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2545.f3945;
        }
        if (jSONObject != null) {
            return m709().hashCode();
        }
        return 0;
    }

    public final String toString() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2545.f3945;
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m707() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2545.f3945;
        }
        return jSONObject.optString(StringFog.decrypt("HHL3\n", "aRuTIAlfVb4=\n"), null);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final long m708() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2545.f3945;
        }
        return jSONObject.optInt(StringFog.decrypt("TkE=\n", "Ky8nFERNSXI=\n"));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized JSONObject m709() {
        return this.f2545.f3945;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final long m710() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f2545.f3945;
        }
        return jSONObject.optLong(StringFog.decrypt("86g=\n", "h9v5hfMUX6g=\n"));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        JSONObject jSONObject;
        C0946 c0946 = (C0946) obj;
        synchronized (this) {
            jSONObject = this.f2545.f3945;
        }
        long jOptLong = jSONObject.optLong(StringFog.decrypt("86g=\n", "h9v5hfMUX6g=\n"));
        long jM710 = c0946.m710();
        if (jOptLong < jM710) {
            return -1;
        }
        if (jOptLong != jM710) {
            return 1;
        }
        long jM708 = m708();
        long jM709 = c0946.m708();
        if (jM708 < jM709) {
            return -1;
        }
        return jM708 == jM709 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0946.class != obj.getClass()) {
            return false;
        }
        return this.f2545.f3944.equals(((C0946) obj).f2545.f3944);
    }

    public C0946(C1327 c1327) {
        this.f2545 = c1327;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m711(int i, HashMap map) {
        JSONObject jSONObject = this.f2545.f3945;
        if (jSONObject != null) {
            AbstractC1125.m834(jSONObject, i, map);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m712(String str) {
        JSONObject jSONObject;
        try {
            synchronized (this) {
                jSONObject = this.f2545.f3945;
            }
            jSONObject.put(StringFog.decrypt("PS6M\n", "SEfozgcTL7g=\n"), str);
        } catch (JSONException unused) {
        }
    }
}
