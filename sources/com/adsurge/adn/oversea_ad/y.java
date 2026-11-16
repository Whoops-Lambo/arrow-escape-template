package com.adsurge.adn.oversea_ad;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class y implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ HashMap b;

    public y(Context context, HashMap map) {
        this.a = context;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z.a(this.a, this.b);
    }
}
