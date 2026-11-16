package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static boolean a(p pVar) {
        WebView webView;
        p pVar2 = (p) f.a.get();
        if (pVar2 != null && pVar2 != pVar) {
            return false;
        }
        f.a = new WeakReference(null);
        ViewParent parent = (pVar2 == null || (webView = pVar2.c) == null) ? null : webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(pVar2.c);
        }
        f.c = null;
        f.f = null;
        f.g = null;
        f.k = null;
        Activity activity = (Activity) f.b.get();
        if (activity != null) {
            activity.finish();
        }
        f.b = new WeakReference(null);
        return true;
    }
}
