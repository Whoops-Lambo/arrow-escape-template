package com.ironsource;

import defpackage.h50;
import defpackage.pv1;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.j9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4812j9 {
    private final long a;

    @NotNull
    private final a b;
    private final long c;

    /* JADX INFO: renamed from: com.ironsource.j9$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        private final long a;
        private final long b;
        private final long c;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public static /* synthetic */ a a(a aVar, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = aVar.a;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = aVar.b;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = aVar.c;
            }
            return aVar.a(j4, j5, j3);
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }

        public final long d() {
            return this.a;
        }

        public final long e() {
            return this.b;
        }

        public final long f() {
            return this.c;
        }

        public int hashCode() {
            return Long.hashCode(this.c) + pv1.d(Long.hashCode(this.a) * 31, 31, this.b);
        }

        @NotNull
        public String toString() {
            long j = this.a;
            long j2 = this.b;
            long j3 = this.c;
            StringBuilder sbO = h50.o(j, "Memory(javaHeapKb=", ", nativeHeapKb=");
            sbO.append(j2);
            sbO.append(", sharedOtherKb=");
            sbO.append(j3);
            sbO.append(")");
            return sbO.toString();
        }

        public a(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        @NotNull
        public final a a(long j, long j2, long j3) {
            return new a(j, j2, j3);
        }

        public final long a() {
            return this.a;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4812j9)) {
            return false;
        }
        C4812j9 c4812j9 = (C4812j9) obj;
        return this.a == c4812j9.a && s71.b(this.b, c4812j9.b) && this.c == c4812j9.c;
    }

    public static /* synthetic */ C4812j9 a(C4812j9 c4812j9, long j, a aVar, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c4812j9.a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            aVar = c4812j9.b;
        }
        a aVar2 = aVar;
        if ((i & 4) != 0) {
            j2 = c4812j9.c;
        }
        return c4812j9.a(j3, aVar2, j2);
    }

    @NotNull
    public final a b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.c;
    }

    @NotNull
    public final a e() {
        return this.b;
    }

    public final long f() {
        return this.a;
    }

    public int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "InitParsingMetrics(parsingDurationMs=" + this.a + ", memory=" + this.b + ", initResponseJsonSizeKb=" + this.c + ")";
    }

    public C4812j9(long j, @NotNull a aVar, long j2) {
        aVar.getClass();
        this.a = j;
        this.b = aVar;
        this.c = j2;
    }

    @NotNull
    public final C4812j9 a(long j, @NotNull a aVar, long j2) {
        aVar.getClass();
        return new C4812j9(j, aVar, j2);
    }

    public final long a() {
        return this.a;
    }
}
