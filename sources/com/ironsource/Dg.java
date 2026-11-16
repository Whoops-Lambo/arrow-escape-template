package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.h50;
import defpackage.jc1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Dg {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dg)) {
            return false;
        }
        Dg dg = (Dg) obj;
        return this.a == dg.a && this.b == dg.b && this.c == dg.c;
    }

    public static /* synthetic */ Dg a(Dg dg, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dg.a;
        }
        if ((i & 2) != 0) {
            z2 = dg.b;
        }
        if ((i & 4) != 0) {
            z3 = dg.c;
        }
        return dg.a(z, z2, z3);
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.a;
    }

    public final boolean f() {
        return this.b;
    }

    public int hashCode() {
        return Boolean.hashCode(this.c) + jc1.f(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    @NotNull
    public String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        StringBuilder sb = new StringBuilder("ViewVisibilityParams(isVisible=");
        sb.append(z);
        sb.append(", isWindowVisible=");
        sb.append(z2);
        sb.append(", isShown=");
        return h50.n(sb, z3, ")");
    }

    public Dg(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @NotNull
    public final JSONObject g() throws JSONException {
        JSONObject jSONObjectPut = IronSourceNetworkBridge.jsonObjectInit().put(C4811j8.k, this.a).put(C4811j8.l, this.b).put(C4811j8.m, this.c);
        jSONObjectPut.getClass();
        return jSONObjectPut;
    }

    @NotNull
    public final Dg a(boolean z, boolean z2, boolean z3) {
        return new Dg(z, z2, z3);
    }

    public final boolean a() {
        return this.a;
    }
}
