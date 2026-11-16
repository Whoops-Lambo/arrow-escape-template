package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                g4.b.a((g4.c) obj2, (g4.d) obj);
                break;
            case 1:
                ((ScheduledThreadPoolExecutor) obj2).execute((i6.e) obj);
                break;
            default:
                ((m2.b) obj2).a((AppLovinAd) obj);
                break;
        }
    }
}
