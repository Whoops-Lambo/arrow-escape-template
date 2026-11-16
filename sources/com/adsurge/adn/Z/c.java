package com.adsurge.adn.Z;

import android.os.Handler;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public static final Handler a = new Handler(jc1.h("GDTAirbagThread").getLooper());
    }

    public static Handler a() {
        return a.a;
    }
}
