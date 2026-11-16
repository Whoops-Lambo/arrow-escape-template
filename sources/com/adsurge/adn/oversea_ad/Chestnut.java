package com.adsurge.adn.oversea_ad;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Chestnut implements Runnable {
    public final /* synthetic */ Context a;

    public Chestnut(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Coconut.a(this.a);
        } catch (Throwable unused) {
        }
    }
}
