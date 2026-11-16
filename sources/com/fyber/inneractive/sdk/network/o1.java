package com.fyber.inneractive.sdk.network;

import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class o1 extends l {
    public final Response g;

    public o1(l lVar, Response response) {
        this.g = response;
        this.d = lVar.d;
        this.c = lVar.c;
        this.e = lVar.e;
        this.a = lVar.a;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        super.a();
        Response response = this.g;
        if (response != null) {
            response.close();
        }
    }
}
