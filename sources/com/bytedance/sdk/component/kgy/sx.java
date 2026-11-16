package com.bytedance.sdk.component.kgy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import defpackage.e32;
import defpackage.nj;
import defpackage.pv1;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class sx extends kgy {
    static final /* synthetic */ boolean ra = true;
    protected String fi;
    protected WebView gf;

    @Override // com.bytedance.sdk.component.kgy.kgy
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public void ahm(gf gfVar) {
        this.gf = gfVar.kgy;
        this.fi = gfVar.rz;
        if (gfVar.twf) {
            return;
        }
        rz();
    }

    @Override // com.bytedance.sdk.component.kgy.kgy
    public void kgy(String str, kus kusVar) {
        if (kusVar == null || TextUtils.isEmpty(kusVar.fi)) {
            super.kgy(str, kusVar);
            return;
        }
        String str2 = kusVar.fi;
        kgy(str, nj.q(pv1.r("javascript:(function(){   const iframe = document.querySelector(atob('", Base64.encodeToString(("iframe[src=\"" + str2 + "\"").getBytes(), 2), "'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(", str, ", atob('"), Base64.encodeToString(str2.getBytes(), 2), "'));   }})()"));
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void rz() {
        if (ra || this.gf != null) {
            PangleNetworkBridge.webviewAddJavascriptInterface(this.gf, this, this.fi);
        } else {
            y.o();
        }
    }

    public void uq() {
        this.gf.removeJavascriptInterface(this.fi);
    }

    @Override // com.bytedance.sdk.component.kgy.kgy
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @Override // com.bytedance.sdk.component.kgy.kgy
    public void ahm() {
        super.ahm();
        uq();
    }

    @Override // com.bytedance.sdk.component.kgy.kgy
    public String kgy() {
        return this.gf.getUrl();
    }

    @Override // com.bytedance.sdk.component.kgy.kgy
    public Context kgy(gf gfVar) {
        Context context = gfVar.ct;
        if (context != null) {
            return context;
        }
        WebView webView = gfVar.kgy;
        if (webView != null) {
            return webView.getContext();
        }
        e32.i("WebView cannot be null!");
        return null;
    }

    @Override // com.bytedance.sdk.component.kgy.kgy
    public void kgy(String str) {
        kgy(str, pv1.p(new StringBuilder("javascript:"), this.fi, "._handleMessageFromToutiao(", str, ")"));
    }

    private void kgy(String str, final String str2) {
        if (this.noq || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.kgy.sx.1
            @Override // java.lang.Runnable
            public void run() {
                if (sx.this.noq) {
                    return;
                }
                try {
                    sx.this.gf.evaluateJavascript(str2, null);
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VqjtZ", "bOsvowq5fuWSQ9NaiVXx", "Sfsj", b.v);
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.uq.post(runnable);
        } else {
            runnable.run();
        }
    }
}
