package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class g implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (!this.a.equals(gVar.a)) {
            return this.a.compareTo(gVar.a);
        }
        long j = this.b - gVar.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public g(String str, long j, long j2, long j3, File file) {
        boolean z;
        this.a = str;
        this.b = j;
        this.c = j2;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        this.e = file;
        this.f = j3;
    }
}
