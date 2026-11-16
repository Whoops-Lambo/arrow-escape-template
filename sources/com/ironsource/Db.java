package com.ironsource;

import defpackage.e80;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Db {

    @NotNull
    public static final a c = new a(null);

    @NotNull
    public static final String d = "revenue";

    @NotNull
    public static final String e = "precision";
    private final double a;

    @NotNull
    private final String b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Db)) {
            return false;
        }
        Db db = (Db) obj;
        return Double.compare(this.a, db.a) == 0 && s71.b(this.b, db.b);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        @Nullable
        public final Db a(@NotNull JSONObject jSONObject) {
            jSONObject.getClass();
            try {
                double d = jSONObject.getDouble("revenue");
                String string = jSONObject.getString("precision");
                string.getClass();
                return new Db(d, string);
            } catch (Exception e) {
                C4950r4.d().a(e);
                If.a(e);
                return null;
            }
        }

        private a() {
        }
    }

    public static /* synthetic */ Db a(Db db, double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d2 = db.a;
        }
        if ((i & 2) != 0) {
            str = db.b;
        }
        return db.a(d2, str);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.b;
    }

    public final double d() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    @NotNull
    public String toString() {
        return "LoadArmData(revenue=" + this.a + ", precision=" + this.b + ")";
    }

    public Db(double d2, @NotNull String str) {
        str.getClass();
        this.a = d2;
        this.b = str;
    }

    @NotNull
    public final Db a(double d2, @NotNull String str) {
        str.getClass();
        return new Db(d2, str);
    }

    public final double a() {
        return this.a;
    }

    @Nullable
    public static final Db a(@NotNull JSONObject jSONObject) {
        return c.a(jSONObject);
    }
}
