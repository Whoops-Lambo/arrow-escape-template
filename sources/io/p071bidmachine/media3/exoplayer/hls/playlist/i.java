package io.p071bidmachine.media3.exoplayer.hls.playlist;

import io.p071bidmachine.media3.common.DrmInitData;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class i implements Comparable {
    public final String a;
    public final h b;
    public final long c;
    public final int d;
    public final long e;
    public final DrmInitData f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final boolean k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.e;
        if (j > jLongValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }

    public i(String str, h hVar, long j, int i, long j2, DrmInitData drmInitData, String str2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = hVar;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = drmInitData;
        this.g = str2;
        this.h = str3;
        this.i = j3;
        this.j = j4;
        this.k = z;
    }
}
