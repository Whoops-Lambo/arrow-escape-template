package com.adsurge.adn.oversea_ad;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends Thread {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ Context b;

    public m0(e0 e0Var, Context context) {
        this.a = e0Var;
        this.b = context;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.a.a.onResult(new f0(x.l.a(this.b, false, 1)));
    }
}
