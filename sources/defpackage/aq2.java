package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class aq2 implements wp2, Comparable {
    public final long a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long jL;
        aq2 aq2Var = (aq2) obj;
        aq2Var.getClass();
        long j = aq2Var.a;
        int i = fo1.b;
        long j2 = (j - 1) | 1;
        long j3 = this.a;
        if (j2 != Long.MAX_VALUE) {
            jL = ((j3 - 1) | 1) == Long.MAX_VALUE ? wx.l(j3) : wx.p(j3, j);
        } else if (j3 == j) {
            uf0 uf0Var = xe0.b;
            jL = 0;
        } else {
            jL = xe0.l(wx.l(j));
        }
        return xe0.c(jL, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aq2) {
            return this.a == ((aq2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.a + ')';
    }

    public /* synthetic */ aq2(long j) {
        this.a = j;
    }

    public static long a(long j) {
        long jB = fo1.b();
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return xe0.l(wx.l(j));
        }
        return wx.p(jB, j);
    }
}
