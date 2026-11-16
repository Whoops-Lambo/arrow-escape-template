package com.adsurge.adn.E1;

import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class g extends WebChromeClient {
    public com.adsurge.adn.F1.g a;
    public l b;

    public void a(l lVar) {
        this.b = lVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        com.adsurge.adn.F1.g gVar = this.a;
        if (gVar == null) {
            com.adsurge.adn.w1.b.b(100292, (com.adsurge.adn.Y0.c) null, (Integer) 1, new com.adsurge.adn.Y0.d().a(NotificationCompat.CATEGORY_MESSAGE, str2));
            return true;
        }
        com.adsurge.adn.F1.f fVarA = gVar.a(str2);
        if (fVarA.d()) {
            jsPromptResult.confirm((String) fVarA.b());
            return true;
        }
        if (fVarA.a() == 1000) {
            jsPromptResult.confirm("message:" + fVarA.c() + ",code:" + fVarA.a());
            String.format("failed message: %s --> (%d,%s)", str2, Integer.valueOf(fVarA.a()), fVarA.c());
            return true;
        }
        jsPromptResult.confirm("message:" + fVarA.c() + ",code:" + fVarA.a());
        String.format("failed message: %s --> (%d,%s)", str2, Integer.valueOf(fVarA.a()), fVarA.c());
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        l lVar = this.b;
        if (lVar == null || fileChooserParams == null) {
            return false;
        }
        return lVar.a(valueCallback, fileChooserParams.createIntent());
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        callback.invoke(str, true, false);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        l lVar = this.b;
        if (lVar != null) {
            lVar.a(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        l lVar = this.b;
        if (lVar != null) {
            lVar.b(str);
        }
    }

    public void a(com.adsurge.adn.F1.g gVar) {
        this.a = gVar;
    }
}
