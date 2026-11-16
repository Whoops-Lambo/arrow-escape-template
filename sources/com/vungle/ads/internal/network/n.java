package com.vungle.ads.internal.network;

import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class n {
    public static o a(Object obj, Response response) {
        response.getClass();
        if (response.isSuccessful()) {
            return new o(response, obj, 0);
        }
        defpackage.d.r("rawResponse must be successful response");
        return null;
    }

    public static o a(Response response) {
        response.getClass();
        if (!response.isSuccessful()) {
            return new o(response, null, 0);
        }
        defpackage.d.r("rawResponse should not be successful response");
        return null;
    }
}
