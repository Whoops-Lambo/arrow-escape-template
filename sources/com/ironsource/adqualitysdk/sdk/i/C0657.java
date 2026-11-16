package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ډ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0657 implements InterfaceC1265 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0510 f1693;

    public C0657(C0510 c0510) {
        this.f1693 = c0510;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1265
    /* JADX INFO: renamed from: ﾒ */
    public final void mo418() {
        String strM678;
        C1150 c1150 = this.f1693.f1142.f3951;
        long jM695 = ((C1082) AbstractC1081.m765()).f3129.m695();
        synchronized (c1150) {
            if (c1150.f3337 <= 0 && jM695 > 0) {
                c1150.f3337 = jM695;
            }
        }
        AbstractC1081 abstractC1081M765 = AbstractC1081.m765();
        C0905 c0905 = this.f1693.f1142.f3952;
        C1127 c1127 = ((C1082) abstractC1081M765).f2543;
        c1127.getClass();
        String strDecrypt = StringFog.decrypt("kaAB/zqUAUWO\n", "5dJgnF/2YCY=\n");
        String strDecrypt2 = StringFog.decrypt("3SXX\n", "6gvnfb5Jg1c=\n");
        C1160 c1160 = new C1160(c1127);
        c0905.getClass();
        C0859 c0859 = new C0859(strDecrypt, strDecrypt2);
        if (((C1082) AbstractC1081.m765()).f3128.m529()) {
            String strM530 = ((C1082) AbstractC1081.m765()).f3128.m530(strDecrypt);
            if (TextUtils.isEmpty(strM530)) {
                strM678 = null;
            } else {
                c0859 = new C0858(strDecrypt, strDecrypt2, strM530);
                strM678 = c0905.m678(c0859, c1160);
            }
        } else {
            strM678 = c0905.m678(c0859, c1160);
        }
        if (TextUtils.isEmpty(strM678)) {
            return;
        }
        try {
            c1127.f3271 = IronSourceNetworkBridge.jsonObjectInit(strM678);
        } catch (JSONException unused) {
        }
    }
}
