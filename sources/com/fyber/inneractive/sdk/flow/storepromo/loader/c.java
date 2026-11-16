package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ d b;

    public c(d dVar, String str) {
        this.b = dVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.b.a;
        String str = this.a;
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.a;
        if (aVar != null) {
            try {
                DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(aVar, null, str, "text/html", "UTF-8", null);
            } catch (Throwable th) {
                if (fVar.e != null) {
                    fVar.e.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, nj.r(th, new StringBuilder("Unable to load data: ")), "");
                }
            }
        }
    }
}
