package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import defpackage.gj4;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfyd {
    public final WebView a;
    public final zzfye b;

    public final void a() {
        WebView webView = this.a;
        zzfye zzfyeVar = this.b;
        try {
            if (!WebViewFeature.a("WEB_MESSAGE_LISTENER")) {
                zzfyeVar.zze();
                return;
            }
            try {
                WebViewCompat.g(webView, zzfyeVar.zzg());
                WebViewCompat.b(webView, zzfyeVar.zzg(), new HashSet(Arrays.asList("*")), new gj4(this));
            } catch (Exception e) {
                zzfyu.a("Error adding WebView listener", e);
                zzfyeVar.zze();
            }
        } catch (NoClassDefFoundError unused) {
            zzfyeVar.zze();
        }
    }

    public zzfyd(WebView webView, zzfye zzfyeVar) {
        if (webView != null) {
            this.a = webView;
            this.b = zzfyeVar;
        } else {
            defpackage.d.r("WebView is null");
            throw null;
        }
    }
}
