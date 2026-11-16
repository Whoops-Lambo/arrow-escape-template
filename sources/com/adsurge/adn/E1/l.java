package com.adsurge.adn.E1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface l {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a extends l {
        void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

        void a(String str);

        void i();

        void n();

        default void onDestroy() {
        }
    }

    void a(int i);

    void a(int i, String str, String str2);

    void a(String str, Bitmap bitmap);

    boolean a(ValueCallback valueCallback, Intent intent);

    void b(String str);

    void c(String str);

    void d(String str);
}
