package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class j extends WebChromeClient {
    WindVaneWebView a;
    private c b;

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/windvane/j;->onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z");
        boolean zSafedk_j_onJsPrompt_1f91133c40dbc764658d43cc9c9d09cd = safedk_j_onJsPrompt_1f91133c40dbc764658d43cc9c9d09cd(webView, str, str2, str3, jsPromptResult);
        BrandSafetyUtils.onJsPrompt(com.safedk.android.utils.h.o, webView, str, str2, zSafedk_j_onJsPrompt_1f91133c40dbc764658d43cc9c9d09cd);
        return zSafedk_j_onJsPrompt_1f91133c40dbc764658d43cc9c9d09cd;
    }

    public void a(c cVar) {
        this.b = cVar;
    }

    public boolean safedk_j_onJsPrompt_1f91133c40dbc764658d43cc9c9d09cd(WebView p0, String p1, String p2, String p3, JsPromptResult p4) {
        q0.b("H5_ENTRY", p2 + "");
        b signalCommunication = this.a.getSignalCommunication();
        if (signalCommunication == null || p3 == null || !signalCommunication.b(p3)) {
            return false;
        }
        signalCommunication.a(p2);
        p4.confirm("");
        return true;
    }

    public j(WindVaneWebView windVaneWebView) {
        this.a = windVaneWebView;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        b signalCommunication = this.a.getSignalCommunication();
        if (signalCommunication != null) {
            String strMessage = consoleMessage.message();
            if (TextUtils.isEmpty(strMessage) || !strMessage.startsWith("mv://")) {
                return false;
            }
            q0.a("H5_ENTRY", "onConsoleMessage: message.length() = " + strMessage.length() + " " + strMessage);
            if (strMessage.contains("wv_hybrid:") && signalCommunication.b("wv_hybrid:")) {
                String strSubstring = strMessage.substring(0, strMessage.lastIndexOf(" ") + 1);
                q0.a("H5_ENTRY", "message = ".concat(strSubstring));
                signalCommunication.a(strSubstring);
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        c cVar = this.b;
        if (cVar != null) {
            cVar.onProgressChanged(webView, i);
        }
    }
}
