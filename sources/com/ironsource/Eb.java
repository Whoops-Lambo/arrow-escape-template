package com.ironsource;

import defpackage.e80;
import defpackage.pv1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Eb {

    @NotNull
    public static final a b = new a(null);

    @NotNull
    public static final String c = "duration";
    private final long a;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Eb) && this.a == ((Eb) obj).a;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        @Nullable
        public final Eb a(@Nullable JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            long jOptLong = jSONObject.optLong("duration");
            if (jOptLong > 0) {
                return new Eb(jOptLong);
            }
            return null;
        }

        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    public static /* synthetic */ Eb a(Eb eb, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = eb.a;
        }
        return eb.a(j);
    }

    public final long b() {
        return this.a;
    }

    public int hashCode() {
        return Long.hashCode(this.a);
    }

    @NotNull
    public String toString() {
        return pv1.m(this.a, "LoadGraceConfig(graceDurationMs=", ")");
    }

    public Eb(long j) {
        this.a = j;
    }

    @NotNull
    public final Eb a(long j) {
        return new Eb(j);
    }

    public final long a() {
        return this.a;
    }
}
