package defpackage;

import com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class qn {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public DefaultContentMetadata e;

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            pn pnVar = (pn) arrayList.get(i);
            long j3 = pnVar.a;
            long j4 = pnVar.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qn.class == obj.getClass()) {
            qn qnVar = (qn) obj;
            if (this.a == qnVar.a && this.b.equals(qnVar.b) && this.c.equals(qnVar.c) && this.e.equals(qnVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final long a(long j, long j2) {
        Assertions.checkArgument(j >= 0);
        Assertions.checkArgument(j2 >= 0);
        gg2 gg2VarB = b(j, j2);
        if (gg2VarB.isHoleSpan()) {
            return -Math.min(gg2VarB.isOpenEnded() ? Long.MAX_VALUE : gg2VarB.length, j2);
        }
        long j3 = j + j2;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        long jMax = gg2VarB.position + gg2VarB.length;
        if (jMax < j4) {
            for (gg2 gg2Var : this.c.tailSet(gg2VarB, false)) {
                long j5 = gg2Var.position;
                if (j5 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j5 + gg2Var.length);
                if (jMax >= j4) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public final gg2 b(long j, long j2) {
        long jMin = j2;
        gg2 gg2Var = new gg2(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        gg2 gg2Var2 = (gg2) treeSet.floor(gg2Var);
        if (gg2Var2 != null && gg2Var2.position + gg2Var2.length > j) {
            return gg2Var2;
        }
        gg2 gg2Var3 = (gg2) treeSet.ceiling(gg2Var);
        if (gg2Var3 != null) {
            long j3 = gg2Var3.position - j;
            jMin = jMin == -1 ? j3 : Math.min(j3, jMin);
        }
        return new gg2(this.b, j, jMin, -9223372036854775807L, null);
    }

    public final int hashCode() {
        return this.e.hashCode() + n30.c(this.a * 31, 31, this.b);
    }

    public qn(int i, String str, DefaultContentMetadata defaultContentMetadata) {
        this.a = i;
        this.b = str;
        this.e = defaultContentMetadata;
    }
}
