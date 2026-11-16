package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.c0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class u implements Runnable {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ Exception b;

    public u(c0 c0Var, Exception exc) {
        this.a = c0Var;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var = this.a;
        if (c0Var != null) {
            c0Var.a(this.b, InneractiveErrorCode.INVALID_INPUT, new com.fyber.inneractive.sdk.response.e[0]);
        }
    }
}
