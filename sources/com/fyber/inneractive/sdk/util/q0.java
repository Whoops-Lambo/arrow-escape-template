package com.fyber.inneractive.sdk.util;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q0 {
    public static void a(WebView webView, String str) {
        webView.evaluateJavascript(str, null);
    }

    public static void a(com.fyber.inneractive.sdk.web.m mVar, String str, ValueCallback valueCallback) {
        mVar.evaluateJavascript(str, valueCallback);
    }
}
