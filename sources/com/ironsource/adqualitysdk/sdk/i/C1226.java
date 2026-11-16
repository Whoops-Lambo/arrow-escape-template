package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﮐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1226 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1192 f3727;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3728;

    public C1226(C1192 c1192, Activity activity) {
        this.f3727 = c1192;
        this.f3728 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        if (C1192.m872(this.f3727, this.f3728)) {
            AbstractC4631n.m405(new C1236(this));
            C1192 c1192 = this.f3727;
            c1192.f3591 = false;
            c1192.f3592 = true;
            if ((!c1192.f3593 || c1192.f3590) && !this.f3728.isFinishing()) {
                C1192 c1193 = this.f3727;
                Activity activity = this.f3728;
                c1193.getClass();
                String hexString = Integer.toHexString(activity.hashCode());
                if (c1193.f3593) {
                    JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                    try {
                        jSONObjectJsonObjectInit.put(AbstractC1219.f3666, true);
                    } catch (JSONException e) {
                        AbstractC0509.m488(C1192.f3588, StringFog.decrypt("Tf4/myjEtgZs5SOTeoC4LGf4HpE0gPcWZ6wnhzWK7UI=\n", "CIxN9Frk12I=\n") + e.getLocalizedMessage());
                    }
                    c1193.m504(jSONObjectJsonObjectInit, activity, hexString);
                } else {
                    c1193.f3593 = true;
                    c1193.m504(IronSourceNetworkBridge.jsonObjectInit(), activity, hexString);
                }
            }
            this.f3727.f3590 = false;
        }
    }
}
