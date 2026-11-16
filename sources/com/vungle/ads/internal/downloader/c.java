package com.vungle.ads.internal.downloader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public final int a;
    public final Throwable b;
    public final int c;

    public final Throwable a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("DownloadError(serverCode=");
        sbA.append(this.a);
        sbA.append(", reason=");
        sbA.append(this.c);
        sbA.append(", cause=");
        sbA.append(this.b);
        sbA.append(')');
        return sbA.toString();
    }

    public c(int i, Throwable th, int i2) {
        th.getClass();
        this.a = i;
        this.b = th;
        this.c = i2;
    }
}
