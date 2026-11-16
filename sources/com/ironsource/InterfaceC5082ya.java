package com.ironsource;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebView;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ya, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC5082ya {

    /* JADX INFO: renamed from: com.ironsource.ya$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements InterfaceC5082ya {

        @Nullable
        private WebView a;
        private boolean b;

        @SuppressLint({"NewApi"})
        private final void b(String str) {
            WebView webView = this.a;
            if (webView != null) {
                IronSourceNetworkBridge.webViewEvaluateJavaScript(webView, str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.a;
            if (webView != null) {
                IronSourceNetworkBridge.webviewLoadUrl(webView, "javascript:" + str);
            }
        }

        public a(int i) {
            boolean z;
            if (i >= 19) {
                z = true;
            } else {
                z = false;
            }
            this.b = z;
        }

        @Override // com.ironsource.InterfaceC5082ya
        public void a(@NotNull String str) {
            str.getClass();
            try {
                if (this.b) {
                    b(str);
                } else {
                    c(str);
                }
            } catch (Throwable th) {
                C4950r4.d().a(th);
                this.b = false;
                c(str);
            }
        }

        public a() {
            this(0, 1, null);
        }

        public /* synthetic */ a(int i, int i2, e80 e80Var) {
            this((i2 & 1) != 0 ? Build.VERSION.SDK_INT : i);
        }

        @Override // com.ironsource.InterfaceC5082ya
        public boolean a() {
            return this.a != null;
        }

        @Override // com.ironsource.InterfaceC5082ya
        public void a(@NotNull WebView webView) {
            webView.getClass();
            this.a = webView;
        }
    }

    void a(@NotNull WebView webView);

    void a(@NotNull String str);

    boolean a();
}
