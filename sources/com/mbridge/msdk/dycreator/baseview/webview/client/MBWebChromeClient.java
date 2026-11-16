package com.mbridge.msdk.dycreator.baseview.webview.client;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.dycreator.baseview.webview.communicator.WebCommunicator;
import com.mbridge.msdk.dycreator.baseview.webview.listener.WebViewEventListener;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class MBWebChromeClient extends WebChromeClient {
    private final String a = "MBWebChromeClient";
    private WebViewEventListener b;
    private WebCommunicator c;

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/dycreator/baseview/webview/client/MBWebChromeClient;->onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z");
        boolean zSafedk_MBWebChromeClient_onJsPrompt_81bf777101f915ce7e7b59bba7f25299 = safedk_MBWebChromeClient_onJsPrompt_81bf777101f915ce7e7b59bba7f25299(webView, str, str2, str3, jsPromptResult);
        BrandSafetyUtils.onJsPrompt(h.o, webView, str, str2, zSafedk_MBWebChromeClient_onJsPrompt_81bf777101f915ce7e7b59bba7f25299);
        return zSafedk_MBWebChromeClient_onJsPrompt_81bf777101f915ce7e7b59bba7f25299;
    }

    private boolean a(String str) {
        WebCommunicator webCommunicator;
        try {
            if (!str.startsWith("mv:")) {
                if (str.startsWith("mraid:")) {
                }
                return false;
            }
            if (str.contains("wv_hybrid:")) {
                str = str.substring(0, str.lastIndexOf(" ") + 1);
            }
            q0.a("MBWebChromeClient", "onConsoleMessage: message.length() = " + str.length() + " " + str);
            if (!TextUtils.isEmpty(str) && (webCommunicator = this.c) != null) {
                webCommunicator.onCommunication(str);
            }
            return true;
        } catch (Throwable th) {
            q0.b("MBWebChromeClient", th.getMessage());
        }
    }

    public void setCommunicator(WebCommunicator webCommunicator) {
        this.c = webCommunicator;
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        this.b = webViewEventListener;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (!TextUtils.isEmpty(consoleMessage.message()) && a(consoleMessage.message())) {
            return true;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        WebViewEventListener webViewEventListener = this.b;
        if (webViewEventListener != null) {
            webViewEventListener.onProgressChanged(webView, i);
        }
    }

    public boolean safedk_MBWebChromeClient_onJsPrompt_81bf777101f915ce7e7b59bba7f25299(WebView p0, String p1, String p2, String p3, JsPromptResult p4) {
        if (!TextUtils.isEmpty(p2) && a(p2)) {
            p4.confirm("");
            return true;
        }
        return false;
    }
}
