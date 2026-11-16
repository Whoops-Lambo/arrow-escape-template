package com.moloco.sdk.internal.services;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class i {
    public final Context a;
    public final com.moloco.sdk.acm.recorder.c b;

    public final void a(String str) {
        com.moloco.sdk.acm.e eVar = new com.moloco.sdk.acm.e("webview_not_available");
        eVar.a("reason", str);
        this.b.a(eVar);
    }

    public i(Context context, com.moloco.sdk.acm.recorder.c cVar) {
        this.a = context;
        this.b = cVar;
    }
}
