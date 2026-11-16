package com.inmobi.media;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import defpackage.dt1;
import defpackage.qh1;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Cq {
    public static boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, String str) {
        webView.getClass();
        str.getClass();
        boolean zDidCrash = false;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        dt1 dt1Var = new dt1("source", str);
        if (renderProcessGoneDetail != null) {
            zDidCrash = renderProcessGoneDetail.didCrash();
        }
        LinkedHashMap linkedHashMapZ = qh1.Z(dt1Var, new dt1("isCrashed", Boolean.valueOf(zDidCrash)));
        C4111im c4111im = C4111im.a;
        C4111im.b("WebViewRenderProcessGoneEvent", linkedHashMapZ, EnumC4223mm.SDK);
        webView.destroy();
        return true;
    }
}
