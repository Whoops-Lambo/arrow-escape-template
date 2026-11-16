package com.bytedance.sdk.component.ra;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.media3.extractor.ts.TsExtractor;
import com.bytedance.sdk.component.utils.sx;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class yo {
    private final WeakReference<Context> kgy;
    private boolean ahm = true;
    private final boolean rz = true;
    private final boolean uq = true;
    private final boolean ct = false;
    private final boolean noq = true;
    private boolean yo = true;

    public static void ahm(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGPbNOUQ9lanw==", "SesgmhW5Q8aWS8RenhiwPHLgOZARumjEhVnkXIoU", TsExtractor.TS_STREAM_TYPE_DTS_UHD);
            sx.rz(th.toString(), new Object[0]);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void kgy(WebView webView) {
        if (webView == null || this.kgy.get() == null) {
            return;
        }
        ahm(webView);
        WebSettings settings = webView.getSettings();
        if (settings == null) {
            return;
        }
        kgy(settings);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGPbNOUQ9lanw==", "Wv49mRo=", 97);
            sx.rz("SSWebSettings", e.getMessage());
        }
        try {
            if (this.ahm) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGPbNOUQ9lanw==", "Wv49mRo=", 107);
            sx.rz("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.yo) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGPbNOUQ9lanw==", "Wv49mRo=", Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
            sx.rz("SSWebSettings", th2.getMessage());
        }
    }

    private yo(Context context) {
        this.kgy = new WeakReference<>(context);
    }

    public yo ahm(boolean z) {
        this.ahm = z;
        return this;
    }

    public yo kgy(boolean z) {
        this.yo = z;
        return this;
    }

    public static yo kgy(Context context) {
        return new yo(context);
    }

    private void kgy(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGPbNOUQ9lanw==", "WuIhmhSRbMOJS+dRjQiXIU/mIoAXiXrCkm3STpgEsi0=", 150);
            sx.rz(th.toString(), new Object[0]);
        }
    }
}
