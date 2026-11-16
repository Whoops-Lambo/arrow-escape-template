package io.p071bidmachine.analytics.internal.p072a;

import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.dk2;
import defpackage.e80;
import defpackage.jc1;
import defpackage.s71;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements Comparable {
    public static final a d = new a(null);
    private final int a;
    private final int b;
    private final int c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        public final f a(String str) {
            try {
                if (!dk2.Z(str)) {
                    List listN0 = dk2.n0(str, new String[]{UserDetailsUtils.UserDetailsLiterals.DOT}, 0, 6);
                    if (!listN0.isEmpty()) {
                        int size = listN0.size();
                        int i = 0;
                        int i2 = 0;
                        int i3 = 0;
                        for (int i4 = 0; i4 < size && i4 <= 6; i4++) {
                            if (i4 != 0) {
                                if (i4 != 1) {
                                    if (i4 != 2) {
                                        i3 = (i3 * 100) + Integer.parseInt((String) listN0.get(i4));
                                    } else {
                                        i3 = Integer.parseInt((String) listN0.get(2));
                                    }
                                } else {
                                    i2 = Integer.parseInt((String) listN0.get(1));
                                }
                            } else {
                                i = Integer.parseInt((String) listN0.get(0));
                            }
                        }
                        return new f(i, i2, i3);
                    }
                    return null;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        private a() {
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int iH = s71.h(this.a, fVar.a);
        if (iH != 0) {
            return iH;
        }
        int iH2 = s71.h(this.b, fVar.b);
        return iH2 != 0 ? iH2 : s71.h(this.c, fVar.c);
    }

    public int hashCode() {
        return Integer.hashCode(this.c) + jc1.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }

    public f(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
