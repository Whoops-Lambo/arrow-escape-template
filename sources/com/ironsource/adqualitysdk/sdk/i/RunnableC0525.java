package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.υ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC0525 implements Runnable {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0511 f1271;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f1272;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f1273;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Object f1274;

    public RunnableC0525(AbstractC0511 abstractC0511, Object obj, ArrayList arrayList, JSONObject jSONObject) {
        this.f1271 = abstractC0511;
        this.f1274 = obj;
        this.f1273 = arrayList;
        this.f1272 = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1271.m503(this.f1274, this.f1273);
        AbstractC0511.m500(this.f1271, this.f1272, (WebView) this.f1273.get(0), this.f1274);
    }
}
