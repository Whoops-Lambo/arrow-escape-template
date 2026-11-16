package com.ironsource;

import defpackage.e80;
import defpackage.pv1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Z4 {

    @NotNull
    private final String a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a extends Z4 {
        private final long b;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public a(long j) {
            super("scheduler_expired", null);
            this.b = j;
        }

        public static /* synthetic */ a a(a aVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = aVar.b;
            }
            return aVar.a(j);
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.b;
        }

        public int hashCode() {
            return Long.hashCode(this.b);
        }

        @NotNull
        public String toString() {
            return pv1.m(this.b, "SchedulerExpired(durationMs=", ")");
        }

        @NotNull
        public final a a(long j) {
            return new a(j);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b extends Z4 {

        @NotNull
        public static final b b = new b();

        private b() {
            super("show_flow", null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c extends Z4 {

        @NotNull
        public static final c b = new c();

        private c() {
            super("show_recovery", null);
        }
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    private Z4(String str) {
        this.a = str;
    }

    public /* synthetic */ Z4(String str, e80 e80Var) {
        this(str);
    }
}
