package com.fyber.inneractive.sdk.web;

import android.widget.Toast;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class v implements Runnable {
    public final /* synthetic */ String a;

    public v(String str) {
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(com.fyber.inneractive.sdk.util.o.a, this.a, 0).show();
    }
}
