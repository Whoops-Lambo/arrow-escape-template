package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class h implements s {
    private final s a;

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    public final s d() {
        return this.a;
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.a.toString() + ")";
    }

    public h(s sVar) {
        if (sVar != null) {
            this.a = sVar;
        } else {
            defpackage.d.r("delegate == null");
            throw null;
        }
    }
}
