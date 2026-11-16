package com.iab.omid.library.vungle.webviewclient;

import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.iab.omid.library.vungle.attestation.c;
import com.iab.omid.library.vungle.internal.g;
import com.iab.omid.library.vungle.internal.j;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    public static void a(@NonNull WebView webView) {
        if (Build.VERSION.SDK_INT < 26 || !c.a(g.b().a()).b()) {
            return;
        }
        webView.setWebViewClient(new b(webView.getWebViewClient()));
    }

    public static boolean a(String str) {
        if (str != null && str.startsWith("omid-native")) {
            try {
                Uri uri = Uri.parse(str);
                if ("omid-native".equals(uri.getScheme())) {
                    j.b(uri);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
