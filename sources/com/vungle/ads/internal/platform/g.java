package com.vungle.ads.internal.platform;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.util.Consumer;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.j52;
import defpackage.k52;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class g {
    /* JADX WARN: Code duplicated, block: B:22:0x0059 A[PHI: r2
  0x0059: PHI (r2v2 int) = (r2v1 int), (r2v0 int) binds: [B:26:0x0063, B:21:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    public static void a(WebView webView, f0 f0Var) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Integer numC;
        Boolean boolB;
        Boolean boolA;
        webView.getClass();
        WebSettings settings = webView.getSettings();
        settings.getClass();
        int i = 0;
        settings.setBuiltInZoomControls(false);
        int i2 = 1;
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        if (f0Var != null && (boolA = f0Var.a()) != null) {
            zBooleanValue = boolA.booleanValue();
        } else {
            zBooleanValue = false;
        }
        settings.setAllowFileAccessFromFileURLs(zBooleanValue);
        if (f0Var != null && (boolB = f0Var.b()) != null) {
            zBooleanValue2 = boolB.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        settings.setAllowUniversalAccessFromFileURLs(zBooleanValue2);
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
        if (f0Var != null) {
            numC = f0Var.c();
        } else {
            numC = null;
        }
        if (numC != null && numC.intValue() == 1) {
            i = i2;
        } else if (numC != null) {
            i2 = 2;
            if (numC.intValue() == 2) {
                i = i2;
            }
        }
        webView.setLayerType(i, null);
    }

    public static void a(Context context, Consumer consumer) {
        Object j52Var;
        context.getClass();
        consumer.getClass();
        try {
            j52Var = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        if (!(j52Var instanceof j52)) {
            consumer.accept((String) j52Var);
        }
        Throwable thB = k52.b(j52Var);
        if (thB != null) {
            boolean z = u.a;
            t.a("WebViewUtil", "Failed to get user agent", thB);
            consumer.accept(null);
        }
    }
}
