package com.adsurge.adn.p032j0;

import android.os.Handler;
import android.os.Looper;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public static final Handler a = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b {
        public static final Handler a = new Handler(jc1.h("DLThread").getLooper());
    }

    public static Handler a() {
        return a.a;
    }

    public static Handler b() {
        return b.a;
    }
}
