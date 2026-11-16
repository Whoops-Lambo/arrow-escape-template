package com.bytedance.sdk.component.utils;

import android.annotation.TargetApi;
import android.webkit.WebView;
import com.safedk.android.internal.partials.PangleNetworkBridge;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kus {
    private static final kgy kgy = new ahm();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @TargetApi(19)
    public static class ahm extends kgy {
        private ahm() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.kus.kgy
        public void kgy(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    return;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "d+EskTauZfKUQ9tOyDqpPHDvObwOrGU=", "V+EskTauZQ==", 37);
                    boolean z = th instanceof IllegalStateException;
                }
            }
            try {
                PangleNetworkBridge.webviewLoadUrl(webView, str);
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "d+EskTauZfKUQ9tOyDqpPHDvObwOrGU=", "V+EskTauZQ==", 50);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public void kgy(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                PangleNetworkBridge.webviewLoadUrl(webView, str);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "d+EskTauZfKUQ9tOyDOhO17HIIUP", "V+EskTauZQ==", 18);
            }
        }

        private kgy() {
        }
    }

    public static void kgy(WebView webView, String str) {
        kgy.kgy(webView, str);
    }
}
