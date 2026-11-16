package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class L0 implements InterfaceC0438 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ M0 f178;

    public L0(M0 m0) {
        this.f178 = m0;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0438
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void mo347(WebView webView, String str, String str2) {
        WeakReference weakReference;
        String strSubstring = str2.substring(0, str2.indexOf(63));
        String strSubstring2 = str2.substring(str2.indexOf(63) + 1);
        if (strSubstring.equals(StringFog.decrypt("sNUqb9Ok\n", "w6FIDLLBj3I=\n"))) {
            this.f178.m351(webView);
            return;
        }
        if (strSubstring.equals(StringFog.decrypt("X/WfS831\n", "LIH9KKyXUbw=\n"))) {
            JSONObject jSONObjectM349 = M0.m349(this.f178, strSubstring2);
            M0 m0 = this.f178;
            m0.mo352(jSONObjectM349, webView, m0.mo353(webView));
            return;
        }
        if (strSubstring.equals(StringFog.decrypt("dD3hMAQz\n", "B0mDU2VSDaY=\n"))) {
            JSONObject jSONObjectM3410 = M0.m349(this.f178, strSubstring2);
            M0 m1 = this.f178;
            Y0 y0 = m1.f184;
            m1.mo373(jSONObjectM3410, webView, (y0 == null || (weakReference = y0.f299.f200) == null) ? null : (Q0) weakReference.get(), this.f178.mo353(webView));
            return;
        }
        if (strSubstring.equals(StringFog.decrypt("FRpYXCOF\n", "Zm46P0LmCPw=\n"))) {
            JSONObject jSONObjectM3411 = M0.m349(this.f178, strSubstring2);
            jSONObjectM3411.remove(AbstractC1219.f3710);
            M0 m2 = this.f178;
            m2.mo368(jSONObjectM3411, webView, m2.mo353(webView));
            return;
        }
        if (strSubstring.equals(StringFog.decrypt("icMNkj1I\n", "+rdv8Vws6A0=\n"))) {
            JSONObject jSONObjectM3412 = M0.m349(this.f178, strSubstring2);
            try {
                AbstractC1290.m903(jSONObjectM3412.optString(StringFog.decrypt("20DF\n", "ryGi6q2Zpsw=\n")), jSONObjectM3412.optString(StringFog.decrypt("wO6iKzs=\n", "pZzPWFybNO8=\n")), jSONObjectM3412.optString(StringFog.decrypt("Eqxbb1ur\n", "d944AD/OUNM=\n")), jSONObjectM3412.optString(StringFog.decrypt("vY+Q8cQ=\n", "2P3jha9eOq0=\n")));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0438
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void mo348(WebView webView, String str, boolean z) {
        AbstractC4631n.m405(new I0(this, webView, str, z));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0438
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void mo345(WebView webView) {
        this.f178.m351(webView);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0438
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void mo346(WebView webView, String str) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            jSONObjectJsonObjectInit.put(AbstractC1219.f3706, str);
            jSONObjectJsonObjectInit.put(AbstractC1219.f3705, AbstractC1219.f3704);
            JSONObject jSONObjectJsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
            jSONObjectJsonObjectInit2.put(AbstractC1219.f3707, jSONObjectJsonObjectInit);
            M0 m0 = this.f178;
            m0.mo377(jSONObjectJsonObjectInit2, webView, this, m0.mo353(webView));
        } catch (Exception e) {
            AbstractC1290.m905(StringFog.decrypt("ND1qJz+vRzEHEGkfMqZVAg==\n", "Y1gIcVbKMHA=\n"), StringFog.decrypt("75K9KLsRy+nPgbsup1aI7MmD7yK/VMbvioq8KKc=\n", "quDPR8kxqJs=\n"), (Throwable) e, false);
        }
    }
}
