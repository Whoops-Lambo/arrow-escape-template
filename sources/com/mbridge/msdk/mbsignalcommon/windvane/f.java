package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import defpackage.n30;
import defpackage.pv1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class f {
    private static f a = new f();

    public void a(Object obj, String str, String str2) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            String strN = TextUtils.isEmpty(str2) ? pv1.n("javascript:window.WindVane.fireEvent('", str, "', '');") : n30.n("javascript:window.WindVane.fireEvent('", str, "','", i.a(str2), "');");
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                MintegralNetworkBridge.webviewLoadUrl(aVar.b, strN);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void b(Object obj, String str) {
        String strN;
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                strN = pv1.n("javascript:window.WindVane.onSuccess(", aVar.g, ",'');");
            } else {
                strN = n30.n("javascript:window.WindVane.onSuccess(", aVar.g, ",'", i.a(str), "');");
            }
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                MintegralNetworkBridge.webviewLoadUrl(aVar.b, strN);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private f() {
    }

    public static f a() {
        return a;
    }

    public void a(WebView webView, String str, String str2) {
        String strN;
        if (TextUtils.isEmpty(str2)) {
            strN = pv1.n("javascript:window.WindVane.fireEvent('", str, "', '');");
        } else {
            strN = n30.n("javascript:window.WindVane.fireEvent('", str, "','", i.a(str2), "');");
        }
        if (webView != null) {
            if ((webView instanceof WindVaneWebView) && ((WindVaneWebView) webView).isDestoryed()) {
                return;
            }
            try {
                MintegralNetworkBridge.webviewLoadUrl(webView, strN);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(Object obj, String str) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (!TextUtils.isEmpty(str)) {
                str = i.a(str);
            }
            String strN = n30.n("javascript:window.WindVane.onFailure(", aVar.g, ",'", str, "');");
            WindVaneWebView windVaneWebView = aVar.b;
            if (windVaneWebView == null || windVaneWebView.isDestoryed()) {
                return;
            }
            try {
                MintegralNetworkBridge.webviewLoadUrl(aVar.b, strN);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.j, "");
        } catch (Throwable unused2) {
            a().a(webView, com.mbridge.msdk.mbsignalcommon.base.e.j, "");
        }
    }
}
