package com.inmobi.media;

import okhttp3.Dispatcher;
import okhttp3.Interceptor;

/* JADX INFO: renamed from: com.inmobi.media.ea, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3988ea {
    public static C4044ga a(Interceptor[] interceptorArr, Dispatcher dispatcher, Interceptor[] interceptorArr2, Bm bm, int i) {
        if ((i & 1) != 0) {
            interceptorArr = new Interceptor[0];
        }
        if ((i & 2) != 0) {
            dispatcher = AbstractC4211ma.b;
        }
        if ((i & 4) != 0) {
            interceptorArr2 = new Interceptor[0];
        }
        if ((i & 8) != 0) {
            bm = new Bm(60L, 60L, 60L);
        }
        interceptorArr.getClass();
        dispatcher.getClass();
        interceptorArr2.getClass();
        bm.getClass();
        return new C4044ga(interceptorArr, interceptorArr2, dispatcher, bm);
    }
}
