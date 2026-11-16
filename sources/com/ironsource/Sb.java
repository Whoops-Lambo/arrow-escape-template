package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.e80;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Sb {

    @NotNull
    public static final a d = new a(null);

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @Nullable
    private final JSONObject c;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sb)) {
            return false;
        }
        Sb sb = (Sb) obj;
        return s71.b(this.a, sb.a) && s71.b(this.b, sb.b) && s71.b(this.c, sb.c);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        @NotNull
        public final Sb a(@NotNull String str) throws JSONException {
            str.getClass();
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
            String string = jSONObjectJsonObjectInit.getString("adId");
            String string2 = jSONObjectJsonObjectInit.getString(com.ironsource.sdk.controller.f.b.g);
            JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("params");
            string.getClass();
            string2.getClass();
            return new Sb(string, string2, jSONObjectOptJSONObject);
        }

        private a() {
        }
    }

    public static /* synthetic */ Sb a(Sb sb, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sb.a;
        }
        if ((i & 2) != 0) {
            str2 = sb.b;
        }
        if ((i & 4) != 0) {
            jSONObject = sb.c;
        }
        return sb.a(str, str2, jSONObject);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @Nullable
    public final JSONObject c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    @NotNull
    public final String e() {
        return this.b;
    }

    @Nullable
    public final JSONObject f() {
        return this.c;
    }

    public int hashCode() {
        int iC = n30.c(this.a.hashCode() * 31, 31, this.b);
        JSONObject jSONObject = this.c;
        return iC + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.a;
        String str2 = this.b;
        JSONObject jSONObject = this.c;
        StringBuilder sbR = pv1.r("MessageToNative(adId=", str, ", command=", str2, ", params=");
        sbR.append(jSONObject);
        sbR.append(")");
        return sbR.toString();
    }

    public Sb(@NotNull String str, @NotNull String str2, @Nullable JSONObject jSONObject) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = jSONObject;
    }

    @NotNull
    public final Sb a(@NotNull String str, @NotNull String str2, @Nullable JSONObject jSONObject) {
        str.getClass();
        str2.getClass();
        return new Sb(str, str2, jSONObject);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public static final Sb a(@NotNull String str) throws JSONException {
        return d.a(str);
    }
}
