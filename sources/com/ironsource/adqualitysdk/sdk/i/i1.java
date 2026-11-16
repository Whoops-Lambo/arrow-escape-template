package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Build;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static final String f370 = StringFog.decrypt("YTht0wOnzo1CNGP2\n", "Nl0PhWrCudg=\n");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean f369 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean f368 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean f367 = true;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static boolean f366 = false;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static boolean f365 = false;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static h1 f364 = new h1();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static h1 f363 = new h1();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static WebViewClient m383(WebView webView) {
        JSONObject jSONObject;
        if (Build.VERSION.SDK_INT >= 26) {
            Z0 z0M385 = m385();
            synchronized (z0M385) {
                jSONObject = z0M385.f2544;
            }
            boolean z = true;
            if (jSONObject.optBoolean(StringFog.decrypt("2FhVNg==\n", "vy8jVdyk+nM=\n"), true)) {
                Context context = webView.getContext();
                if (f368) {
                    try {
                        f368 = false;
                        WebView webView2 = new WebView(context);
                        P0 p0 = new P0(null, new C4608c1());
                        webView2.setWebViewClient(p0);
                        if (p0 != webView2.getWebViewClient()) {
                            z = false;
                        }
                        f366 = z;
                    } catch (Throwable th) {
                        AbstractC1290.m905(f370, StringFog.decrypt("PAixlzIA+NwcGaiRLke73R9asJktRbvjHBiVkSVX2NgQH62M\n", "eXrD+EAgm7Q=\n"), th, false);
                    }
                }
                if (f366) {
                    return webView.getWebViewClient();
                }
            }
        }
        m389(webView.getContext());
        InterfaceC0867 interfaceC0867M387 = m387(webView, new f1(), f364);
        if (interfaceC0867M387 != null) {
            return (WebViewClient) ((C0860) interfaceC0867M387).m633();
        }
        io.p071bidmachine.media3.extractor.ts.y.j(StringFog.decrypt("H9090PaDJUx81CHS9s1VXT7kIdnlrm5ROdw8nPSEZ1Q4\n", "XLJIvJLtAjg=\n"));
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static InterfaceC0867 m387(WebView webView, InterfaceC0864 interfaceC0864, h1 h1Var) {
        Object objM633;
        try {
            if (!h1Var.f329 && !h1Var.f328) {
                return null;
            }
            C1127 c1127 = m385().f2543;
            JSONObject jSONObject = c1127.f3271;
            String str = c1127.f3277;
            List listM831 = c1127.f3279;
            String str2 = AbstractC1125.f3265;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray != null) {
                listM831 = AbstractC1125.m831(jSONArrayOptJSONArray);
            }
            C1127 c1128 = m385().f2543;
            InterfaceC0867 interfaceC0867M388 = m388(webView, interfaceC0864, listM831, c1128.f3271.optInt(c1128.f3276, 7));
            if (h1Var.f328 && interfaceC0867M388 != null && (objM633 = ((C0860) interfaceC0867M388).m633()) != null && !objM633.getClass().equals(((C0860) interfaceC0867M388).f2285.getType())) {
                C1127 c1129 = m385().f2543;
                JSONObject jSONObject2 = c1129.f3271;
                String str3 = c1129.f3275;
                List listM832 = c1129.f3278;
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(str3);
                if (jSONArrayOptJSONArray2 != null) {
                    listM832 = AbstractC1125.m831(jSONArrayOptJSONArray2);
                }
                C1127 c11210 = m385().f2543;
                return m388(objM633, interfaceC0864, listM832, c11210.f3271.optInt(c11210.f3274, 2));
            }
            return interfaceC0867M388;
        } catch (Throwable th) {
            AbstractC1290.m905(f370, StringFog.decrypt("O4z/xyIaDDUKiuTGNxoIPBeb49xwXAI1Epo=\n", "fv6NqFA6a1A=\n"), th, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static WebChromeClient m384(WebView webView) {
        JSONObject jSONObject;
        if (Build.VERSION.SDK_INT >= 26) {
            Z0 z0M385 = m385();
            synchronized (z0M385) {
                jSONObject = z0M385.f2544;
            }
            if (jSONObject.optBoolean(StringFog.decrypt("tOd4hw==\n", "05Ab5IY2SDs=\n"), true)) {
                Context context = webView.getContext();
                if (f367) {
                    f367 = false;
                    WebView webView2 = new WebView(context);
                    H0 h0 = new H0(new C4611d1());
                    webView2.setWebChromeClient(h0);
                    f365 = h0 == webView2.getWebChromeClient();
                }
                if (f365) {
                    return webView.getWebChromeClient();
                }
            }
        }
        m389(webView.getContext());
        InterfaceC0867 interfaceC0867M387 = m387(webView, new g1(), f363);
        if (interfaceC0867M387 != null) {
            return (WebChromeClient) ((C0860) interfaceC0867M387).m633();
        }
        io.p071bidmachine.media3.extractor.ts.y.j(StringFog.decrypt("NFx9lyfPCT1XVWGVJ4F5LBVwYIkszEsKG1ptlTeBSCASX2w=\n", "dzMI+0OhLkk=\n"));
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m389(Context context) {
        if (f369) {
            f369 = false;
            try {
                WebView webView = new WebView(context);
                P0 p0 = new P0(null, new C4602a1());
                webView.setWebViewClient(p0);
                H0 h0 = new H0(new C4605b1());
                webView.setWebChromeClient(h0);
                f364 = m386(webView, p0, new f1());
                f363 = m386(webView, h0, new g1());
            } catch (Throwable th) {
                AbstractC1290.m905(f370, StringFog.decrypt("s0KmPP+Cb5KTU78648UsnJlC9DrjzGmI1lO4OujMeIk=\n", "9jDUU42iDPo=\n"), th, false);
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static h1 m386(WebView webView, InterfaceC0648 interfaceC0648, InterfaceC0864 interfaceC0864) {
        h1 h1Var = new h1();
        C1127 c1127 = m385().f2543;
        JSONObject jSONObject = c1127.f3271;
        String str = c1127.f3277;
        List listM831 = c1127.f3279;
        String str2 = AbstractC1125.f3265;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            listM831 = AbstractC1125.m831(jSONArrayOptJSONArray);
        }
        C1127 c1128 = m385().f2543;
        InterfaceC0867 interfaceC0867M388 = m388(webView, interfaceC0864, listM831, c1128.f3271.optInt(c1128.f3276, 7));
        if (interfaceC0867M388 != null) {
            Object objM633 = ((C0860) interfaceC0867M388).m633();
            if (objM633 == interfaceC0648) {
                h1Var.f329 = true;
                return h1Var;
            }
            C1127 c1129 = m385().f2543;
            JSONObject jSONObject2 = c1129.f3271;
            String str3 = c1129.f3275;
            List listM832 = c1129.f3278;
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(str3);
            if (jSONArrayOptJSONArray2 != null) {
                listM832 = AbstractC1125.m831(jSONArrayOptJSONArray2);
            }
            C1127 c11210 = m385().f2543;
            InterfaceC0867 interfaceC0867M389 = m388(objM633, interfaceC0864, listM832, c11210.f3271.optInt(c11210.f3274, 2));
            if (interfaceC0867M389 != null && ((C0860) interfaceC0867M389).m633() == interfaceC0648) {
                h1Var.f328 = true;
            }
        }
        return h1Var;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static InterfaceC0867 m388(Object obj, InterfaceC0864 interfaceC0864, List list, int i) {
        C0679 c0679 = C0891.m648().f2390;
        C4614e1 c4614e1 = new C4614e1(list);
        c0679.getClass();
        C0758 c0758 = new C0758();
        C0783 c0783 = c0758.f2006;
        c0783.f2062 = -1;
        c0758.f2005 = interfaceC0864;
        c0758.f2004 = c4614e1;
        c0783.f2067 = list;
        c0783.f2066 = i;
        c0783.f2069 = interfaceC0864.getClass();
        c0758.f2006.f2068 = C4614e1.class;
        return c0679.m575(obj, c0758);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized Z0 m385() {
        return ((C1082) AbstractC1081.m765()).f3130;
    }
}
