package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.e80;
import defpackage.n30;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Ig {

    @NotNull
    public static final a c = new a(null);

    @Nullable
    private final Double a;

    @Nullable
    private final Double b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        @NotNull
        public final b a() {
            return new b();
        }

        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        @NotNull
        public final Ig b() {
            return a().a();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {

        @Nullable
        private Double a;

        @Nullable
        private Double b;

        @Nullable
        public final Double c() {
            return this.a;
        }

        @NotNull
        public final b a(double d) {
            this.b = Double.valueOf(d);
            return this;
        }

        @NotNull
        public final b b(double d) {
            this.a = Double.valueOf(d);
            return this;
        }

        public final void a(@Nullable Double d) {
            this.b = d;
        }

        @Nullable
        public final Double b() {
            return this.b;
        }

        @NotNull
        public final Ig a() {
            return new Ig(this, null);
        }

        public final void b(@Nullable Double d) {
            this.a = d;
        }
    }

    @NotNull
    public static final b a() {
        return c.a();
    }

    @NotNull
    public static final Ig b() {
        return c.b();
    }

    @Nullable
    public final Double c() {
        return this.b;
    }

    @Nullable
    public final Double d() {
        return this.a;
    }

    private Ig(b bVar) {
        this.a = bVar.c();
        this.b = bVar.b();
    }

    @NotNull
    public String toString() {
        return n30.y("WaterfallConfiguration", e());
    }

    @NotNull
    public final String e() {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("ceiling", this.b);
            jSONObjectJsonObjectInit.put("floor", this.a);
        } catch (JSONException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.getMessage());
        }
        String string = jSONObjectJsonObjectInit.toString();
        string.getClass();
        return string;
    }

    public /* synthetic */ Ig(b bVar, e80 e80Var) {
        this(bVar);
    }
}
