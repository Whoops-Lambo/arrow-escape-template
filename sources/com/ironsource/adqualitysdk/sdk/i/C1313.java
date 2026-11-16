package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ｕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1313 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1287 f3921;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ int f3922;

    public C1313(C1287 c1287, int i) {
        this.f3921 = c1287;
        this.f3922 = i;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        int iOptInt;
        JSONObject jSONObject;
        C0950 c0950 = this.f3921.f3882;
        if (this.f3922 >= c0950.f2570.m725().m698()) {
            iOptInt = 0;
        } else {
            C0949 c0949 = c0950.f2570;
            if (c0949.m725() == null || ((C1082) AbstractC1081.m765()).f3120) {
                iOptInt = 100;
            } else {
                C0928 c0928M725 = c0949.m725();
                synchronized (c0928M725) {
                    jSONObject = c0928M725.f2544;
                }
                iOptInt = jSONObject.optInt(StringFog.decrypt("qhbD\n", "z2W3UOEVYUs=\n"), c0928M725.f2507);
            }
        }
        C0949 c09410 = c0950.f2570;
        c09410.f2564.removeCallbacksAndMessages(null);
        c09410.f2564.postDelayed(new C1148(c09410), iOptInt);
    }
}
