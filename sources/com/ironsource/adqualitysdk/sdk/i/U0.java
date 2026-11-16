package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class U0 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ V0 f212;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ WebView f213;

    public U0(V0 v0, WebView webView) {
        this.f212 = v0;
        this.f213 = webView;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        String strReplace;
        JSONObject jSONObject;
        V0 v0 = this.f212;
        v0.getClass();
        String str = V0.f215.f207;
        try {
            String strDecrypt = StringFog.decrypt("SZDS/8L5MJ9Nndrj1/IyhleWxg==\n", "EsubsYi8c8s=\n");
            C0592 c0592 = ((C1082) AbstractC1081.m765()).f3128;
            synchronized (c0592) {
                jSONObject = c0592.f2544;
            }
            String strReplace2 = str.replace(strDecrypt, jSONObject.optString(StringFog.decrypt("+shy\n", "kKEcOL4Zvwg=\n"), c0592.f1461)).replace(StringFog.decrypt("eL6J4MIoyvR8r5ny0g==\n", "I+XKr49lhbo=\n"), V0.f215.f206);
            strReplace = (v0.f217 ? strReplace2.replace(StringFog.decrypt("m5axDTlXIn2KnqkI\n", "wM30VW0FYyI=\n"), V0.f215.f205) : strReplace2.replace(StringFog.decrypt("9n2v06Dzeu7ndbfW\n", "rSbqi/ShO7E=\n"), "")).replace(StringFog.decrypt("a0QoD9t0WiJkUDkf32lCPA==\n", "MB9rQJU6H2E=\n"), v0.f218);
        } catch (Throwable th) {
            AbstractC0509.m488(V0.f216, StringFog.decrypt("KZZg5zDTRVVMg3f8CIB4VCWKeO0hhxYb\n", "bOQSiELzLDs=\n") + th.getLocalizedMessage());
            strReplace = str;
        }
        AbstractC4631n.m401(new T0(this, AbstractC0575.m522(strReplace.getBytes())));
    }
}
