package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.爫, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1172 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1152 f3468;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0375 f3469;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3470;

    public C1172(C1152 c1152, JSONObject jSONObject, C0375 c0375) {
        this.f3468 = c1152;
        this.f3470 = jSONObject;
        this.f3469 = c0375;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        String strM846 = C1152.m846(this.f3468, this.f3470);
        m1 m1Var = (m1) this.f3468.f3341.get(strM846);
        if (m1Var == null) {
            m1Var = new m1(this.f3470);
            this.f3468.f3341.put(strM846, m1Var);
        } else {
            m1Var.m400(this.f3470);
        }
        m1Var.f3332 = this.f3469;
    }
}
