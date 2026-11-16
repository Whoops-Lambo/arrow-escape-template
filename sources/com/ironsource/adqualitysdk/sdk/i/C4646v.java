package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C4646v {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static C4646v f472;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public HashMap f474;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap f475 = new HashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Handler f473 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized boolean m445(Activity activity) {
        return EnumC4644u.f468 == m446(activity);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized Map m447() {
        JSONObject jSONObjectOptJSONObject;
        try {
            if (this.f474 == null) {
                this.f474 = new HashMap();
                C1127 c1127 = ((C1082) AbstractC1081.m765()).f2543;
                if (c1127 != null) {
                    jSONObjectOptJSONObject = c1127.f3271.optJSONObject(C1127.f3268);
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = c1127.f3270;
                    }
                } else {
                    jSONObjectOptJSONObject = null;
                }
                if (jSONObjectOptJSONObject != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        linkedHashMap.put(next, EnumC4644u.m441(jSONObjectOptJSONObject.optString(next)));
                    }
                    this.f474 = linkedHashMap;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f474;
    }

    static {
        StringFog.decrypt("dFZqg9yC4ANlWmuJ26jRDnBc\n", "ADkf4LTGhXc=\n");
        StringFog.decrypt("c+CN\n", "EpThZ/JU83M=\n");
        StringFog.decrypt("56k=\n", "lcVcn0ZWE8c=\n");
        StringFog.decrypt("GigE\n", "dEdq6ndn1K0=\n");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static synchronized C4646v m442() {
        try {
            if (f472 == null) {
                f472 = new C4646v();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f472;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized HashMap m444() {
        return new HashMap(this.f475);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m443(Activity activity) {
        return EnumC4644u.f467 == m446(activity);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized EnumC4644u m446(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (m444().containsKey(name)) {
                return (EnumC4644u) m444().get(name);
            }
            if (m447().containsKey(name)) {
                return (EnumC4644u) m447().get(name);
            }
        }
        return EnumC4644u.m441(AbstractC1081.m765().mo779());
    }
}
