package com.iab.omid.library.bytedance2.utils;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class i {
    public void a(@NonNull WebView webView, @NonNull String str) {
        WebViewCompat.g(webView, str);
    }

    public void a(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull WebViewCompat.WebMessageListener webMessageListener) {
        WebViewCompat.b(webView, str, set, webMessageListener);
    }
}
