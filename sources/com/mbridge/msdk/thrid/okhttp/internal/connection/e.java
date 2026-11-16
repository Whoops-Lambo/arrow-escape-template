package com.mbridge.msdk.thrid.okhttp.internal.connection;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class e extends RuntimeException {
    private IOException a;
    private IOException b;

    public void a(IOException iOException) {
        com.mbridge.msdk.thrid.okhttp.internal.c.a((Throwable) this.a, (Throwable) iOException);
        this.b = iOException;
    }

    public IOException d() {
        return this.a;
    }

    public IOException f() {
        return this.b;
    }

    public e(IOException iOException) {
        super(iOException);
        this.a = iOException;
        this.b = iOException;
    }
}
