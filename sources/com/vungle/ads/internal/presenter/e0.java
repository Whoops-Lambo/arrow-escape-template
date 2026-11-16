package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.webkit.WebView;
import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import defpackage.az2;
import defpackage.j52;
import defpackage.k52;
import defpackage.rc1;
import defpackage.sr0;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends rc1 implements sr0 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context) {
        super(0);
        this.a = context;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        Object j52Var;
        ReentrantLock reentrantLock = f0.a;
        try {
            LiftoffMonetizeNetworkBridge.webviewLoadData(new WebView(this.a), "<html><head></head><body></body></html>", "text/html", "UTF-8");
            boolean z = com.vungle.ads.internal.util.u.a;
            j52Var = Integer.valueOf(com.vungle.ads.internal.util.t.a("WebViewManager", "Prewarmed webview loaded blank html"));
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Throwable thB = k52.b(j52Var);
        if (thB != null) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("WebViewManager", "Prewarm webview failed", thB);
            f0.c.set(false);
        }
        return az2.a;
    }
}
