package com.google.android.gms.internal.ads;

import defpackage.c34;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzavj extends zzioq implements Closeable {
    @Override // com.google.android.gms.internal.ads.zzioq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    static {
        zziox.b(zzavj.class);
    }

    @Override // com.google.android.gms.internal.ads.zzioq
    public final String toString() {
        String string = this.b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    public zzavj(c34 c34Var, zzavi zzaviVar) {
        long jZzb = c34Var.zzb();
        this.b = c34Var;
        this.d = c34Var.zzc();
        c34Var.j(c34Var.zzc() + jZzb);
        this.e = c34Var.zzc();
        this.a = zzaviVar;
    }
}
