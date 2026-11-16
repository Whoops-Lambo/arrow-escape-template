package com.fyber.inneractive.sdk.util;

import com.ironsource.R6;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class r1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ t1 b;

    public r1(t1 t1Var, String str) {
        this.b = t1Var;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.getSharedPreferences("fyber.ua", 0).edit().putString(R6.d0, this.a).apply();
    }
}
