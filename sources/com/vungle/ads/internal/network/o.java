package com.vungle.ads.internal.network;

import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class o {
    public final Response a;
    public final Object b;

    public final Object a() {
        return this.b;
    }

    public final int b() {
        return this.a.code();
    }

    public final boolean c() {
        return this.a.isSuccessful();
    }

    public final String d() {
        return this.a.message();
    }

    public final Response e() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString();
    }

    public o(Response response, Object obj) {
        this.a = response;
        this.b = obj;
    }

    public /* synthetic */ o(Response response, Object obj, int i) {
        this(response, obj);
    }
}
