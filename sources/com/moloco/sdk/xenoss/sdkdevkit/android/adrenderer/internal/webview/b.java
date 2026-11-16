package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.compose.runtime.DisposableEffectResult;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements DisposableEffectResult {
    public final /* synthetic */ WebView a;

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        WebView webView = this.a;
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
    }

    public b(WebView webView) {
        this.a = webView;
    }
}
