package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.丶, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1160 implements InterfaceC1209 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1127 f3367;

    public C1160(C1127 c1127) {
        this.f3367 = c1127;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1209
    /* JADX INFO: renamed from: ﾒ */
    public final void mo613(String str) {
        C1127 c1127 = this.f3367;
        c1127.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            c1127.f3271 = IronSourceNetworkBridge.jsonObjectInit(str);
        } catch (JSONException unused) {
        }
    }
}
