package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.丫, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1159 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1152 f3363;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1342 f3364;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0619 f3365;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3366;

    public C1159(C1152 c1152, JSONObject jSONObject, C0619 c0619, C1342 c1342) {
        this.f3363 = c1152;
        this.f3366 = jSONObject;
        this.f3365 = c0619;
        this.f3364 = c1342;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        String strM846 = C1152.m846(this.f3363, this.f3366);
        C4632n0 c4632n0 = (C4632n0) this.f3363.f3340.get(strM846);
        if (c4632n0 == null) {
            c4632n0 = new C4632n0(this.f3366, this.f3365);
            this.f3363.f3340.put(strM846, c4632n0);
        } else {
            JSONObject jSONObject = this.f3366;
            C0619 c0619 = this.f3365;
            c4632n0.f413 = new C4630m0(jSONObject);
            c4632n0.f419 = c0619;
        }
        c4632n0.f3332 = this.f3364;
    }
}
