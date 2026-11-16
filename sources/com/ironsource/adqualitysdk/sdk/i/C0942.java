package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᘅ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0942 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0937 f2538;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2539;

    public C0942(C0937 c0937, JSONObject jSONObject) {
        this.f2538 = c0937;
        this.f2539 = jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C1057 c1057 = this.f2538.f2526;
        JSONObject jSONObject = this.f2539;
        c1057.f3076.f2557.m428(jSONObject);
        C0949 c0949 = c1057.f3076;
        C1059 c1059 = new C1059(c1057);
        synchronized (c0949.f2566) {
        }
        c0949.m730(jSONObject);
        c0949.f2566.getClass();
        C1327 c1327 = new C1327(jSONObject);
        C0946 c0946 = new C0946(c1327);
        C0928 c0928M725 = c0949.m725();
        c0946.m711(c0928M725.m697(), c0928M725.m699());
        c0949.f2566.m899(c1327, c1059);
        c0949.m723(c0946.m709());
    }
}
