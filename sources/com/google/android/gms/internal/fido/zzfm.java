package com.google.android.gms.internal.fido;

import defpackage.gl0;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfm implements Closeable {
    public int a = 0;

    static {
        new gl0(5);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        if (i > 0) {
            this.a = i - 1;
        } else {
            defpackage.d.p("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
