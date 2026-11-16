package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class r {
    private s a;
    private boolean b = false;

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.b) {
            return "";
        }
        this.b = true;
        return this.a.b();
    }

    public r(s sVar) {
        this.a = sVar;
    }
}
