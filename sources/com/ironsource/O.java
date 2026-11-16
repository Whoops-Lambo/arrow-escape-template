package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.e80;
import defpackage.s71;
import java.util.Date;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class O {

    @NotNull
    public static final a f = new a(null);

    @NotNull
    public static final String g = "0";

    @NotNull
    public static final String h = "0";

    @NotNull
    public static final String i = "0";

    @NotNull
    public static final String j = "0";

    @NotNull
    private final R9 a;

    @NotNull
    private W7 b;

    @NotNull
    private String c;

    @NotNull
    private EnumC4893o0 d;
    private double e;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o = (O) obj;
        return s71.b(c(), o.c()) && s71.b(g(), o.g()) && b() == o.b() && s71.b(i(), o.i()) && this.b == o.b && s71.b(this.c, o.c) && this.d == o.d;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    public static /* synthetic */ O a(O o, R9 r9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            r9 = o.a;
        }
        return o.a(r9);
    }

    @NotNull
    public final IronSource.a b() {
        if (this.a.i()) {
            return IronSource.a.BANNER;
        }
        return this.a.n() ? IronSource.a.REWARDED_VIDEO : IronSource.a.INTERSTITIAL;
    }

    @NotNull
    public final String c() {
        String strE = this.a.e();
        strE.getClass();
        return strE;
    }

    @NotNull
    public final R9 d() {
        return this.a;
    }

    @NotNull
    public final W7 e() {
        return this.b;
    }

    @NotNull
    public final EnumC4893o0 f() {
        return this.d;
    }

    @NotNull
    public final String g() {
        String strC = this.a.c();
        return strC == null ? "0" : strC;
    }

    @NotNull
    public final String h() {
        return this.c;
    }

    @NotNull
    public final String i() {
        String strG = this.a.g();
        strG.getClass();
        return strG;
    }

    public final double j() {
        return this.e;
    }

    public O(@NotNull R9 r9) {
        r9.getClass();
        this.a = r9;
        this.b = W7.UnknownProvider;
        this.c = "0";
        this.d = EnumC4893o0.LOAD_REQUEST;
        this.e = new Date().getTime() / 1000.0d;
    }

    public int hashCode() {
        return Objects.hash(c(), g(), b(), i(), this.b, this.c, this.d, Double.valueOf(this.e));
    }

    @NotNull
    public String toString() {
        String string = IronSourceNetworkBridge.jsonObjectInit().put("adId", c()).put("advertiserBundleId", this.c).put("adProvider", this.b.ordinal()).put("adStatus", this.d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.e).put("adUnitId", g()).put("adFormat", b().toString()).put("instanceId", i()).toString();
        string.getClass();
        return string;
    }

    @NotNull
    public final O a(@NotNull R9 r9) {
        r9.getClass();
        return new O(r9);
    }

    @NotNull
    public final R9 a() {
        return this.a;
    }

    public final void a(@NotNull W7 w7) {
        w7.getClass();
        this.b = w7;
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.c = str;
    }

    public final void a(@NotNull EnumC4893o0 enumC4893o0) {
        enumC4893o0.getClass();
        this.d = enumC4893o0;
    }

    public final void a(double d) {
        this.e = d;
    }
}
