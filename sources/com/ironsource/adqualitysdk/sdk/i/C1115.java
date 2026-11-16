package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ⁿ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1115 {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public S0 f3230;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final ArrayList f3231 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Context f3232;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC0535 f3233;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final C0615 f3234;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C1121 f3235;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0852 f3236;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m822() {
        return this.f3233.mo459();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized ArrayList m824() {
        if (this.f3231 != null) {
            return new ArrayList(this.f3231);
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m826() {
        if (this.f3233.mo459()) {
            ArrayList arrayListM824 = m824();
            int size = arrayListM824.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListM824.get(i);
                i++;
                C1199 c1199 = (C1199) obj;
                this.f3236.m632().f2387.m646(c1199.f3630.f2177.f2049, c1199);
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m821() {
        ArrayList arrayList = this.f3231;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1199 c1199 = (C1199) obj;
            C1152 c1152 = c1199.f3621;
            c1152.getClass();
            AbstractC4631n.m401(new C1175(c1152));
            C1152 c1153 = c1199.f3621;
            c1153.getClass();
            AbstractC4631n.m401(new C1153(c1153));
            C1152 c1154 = c1199.f3621;
            c1154.getClass();
            AbstractC4631n.m401(new C1163(c1154));
            if (c1199.f3625 != null) {
                AbstractC1227 abstractC1227M885 = AbstractC1227.m885();
                C0608 c0608 = c1199.f3625;
                synchronized (abstractC1227M885) {
                    abstractC1227M885.f3730.remove(c0608);
                }
                c1199.f3625 = null;
            }
            C0841 c0841 = c1199.f3624;
            if (c0841 != null) {
                c0841.m627();
                c1199.f3624 = null;
            }
            c1199.f3626 = null;
        }
        AbstractC4631n.m401(new C1122(this));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m823() {
        LinkedHashMap linkedHashMap;
        String strM517 = this.f3233.m517();
        String str = null;
        if (TextUtils.isEmpty(strM517) || StringFog.decrypt("g24TI2XHbg==\n", "xiBSYSmCKrc=\n").equals(strM517) || StringFog.decrypt("lphnYvc4RSs=\n", "0tE0I7V0AG8=\n").equals(strM517)) {
            return null;
        }
        C0852 c0852 = this.f3236;
        String strM518 = this.f3233.m517();
        if (c0852.f2256 == null) {
            JSONObject jSONObjectOptJSONObject = c0852.f2263.optJSONObject(C0852.f2252);
            if (jSONObjectOptJSONObject != null) {
                linkedHashMap = new LinkedHashMap();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, jSONObjectOptJSONObject.optString(next, null));
                }
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                ArrayList arrayList = new ArrayList(linkedHashMap.keySet());
                Collections.sort(arrayList, new C0854());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str2 = (String) obj;
                    if (AbstractC0793.m609(strM518, str2) >= 0) {
                        str = (String) linkedHashMap.get(str2);
                    }
                }
                c0852.f2256 = str;
            }
        }
        return c0852.f2256;
    }

    public C1115(Context context, C0852 c0852, C1121 c1121, C0615 c0615, AbstractC0535 abstractC0535) {
        this.f3236 = c0852;
        this.f3235 = c1121;
        this.f3234 = c0615;
        this.f3233 = abstractC0535;
        this.f3232 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0820 m825(C0774 c0774) {
        if (c0774 != null) {
            return new C0820(c0774, m825((C0774) this.f3236.m631().get(c0774.f2047)));
        }
        return null;
    }
}
