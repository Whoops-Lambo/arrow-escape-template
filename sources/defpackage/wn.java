package defpackage;

import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class wn implements Comparable {
    public long a;
    public long b;
    public int c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Util.compareLong(this.a, ((wn) obj).a);
    }

    public wn(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
