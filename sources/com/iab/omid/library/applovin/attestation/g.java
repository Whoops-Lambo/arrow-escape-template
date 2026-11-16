package com.iab.omid.library.applovin.attestation;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewFeature;

/* JADX INFO: loaded from: classes9.dex */
public class g {
    public static boolean a(@NonNull WebView webView) {
        try {
            if (!WebViewFeature.a("WEB_MESSAGE_LISTENER") || !c.a(com.iab.omid.library.applovin.internal.g.b().a()).b()) {
                return false;
            }
            f.a(webView);
            return true;
        } catch (Exception e) {
            com.iab.omid.library.applovin.utils.d.a("Error during initialization of AttestationMessageListener", e);
            return false;
        } catch (NoClassDefFoundError unused) {
            com.iab.omid.library.applovin.utils.d.a("androidx.webkit not available, skipping attestation listener initialization");
            return false;
        }
    }
}
