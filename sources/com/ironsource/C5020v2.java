package com.ironsource;

import defpackage.jc1;
import defpackage.nj;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.v2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5020v2 {

    @NotNull
    private final String a;

    @Nullable
    private final JSONObject b;

    @Nullable
    private final C5074y2 c;
    private final int d;

    @NotNull
    private final String e;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5020v2)) {
            return false;
        }
        C5020v2 c5020v2 = (C5020v2) obj;
        return s71.b(this.a, c5020v2.a) && s71.b(this.b, c5020v2.b) && s71.b(this.c, c5020v2.c) && this.d == c5020v2.d && s71.b(this.e, c5020v2.e);
    }

    public static /* synthetic */ C5020v2 a(C5020v2 c5020v2, String str, JSONObject jSONObject, C5074y2 c5074y2, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c5020v2.a;
        }
        if ((i2 & 2) != 0) {
            jSONObject = c5020v2.b;
        }
        if ((i2 & 4) != 0) {
            c5074y2 = c5020v2.c;
        }
        if ((i2 & 8) != 0) {
            i = c5020v2.d;
        }
        if ((i2 & 16) != 0) {
            str2 = c5020v2.e;
        }
        String str3 = str2;
        C5074y2 c5074y3 = c5074y2;
        return c5020v2.a(str, jSONObject, c5074y3, i, str3);
    }

    @Nullable
    public final JSONObject b() {
        return this.b;
    }

    @Nullable
    public final C5074y2 c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    @NotNull
    public final String e() {
        return this.e;
    }

    @NotNull
    public final String f() {
        return this.e;
    }

    @NotNull
    public final String g() {
        return this.a;
    }

    @Nullable
    public final JSONObject h() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        JSONObject jSONObject = this.b;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C5074y2 c5074y2 = this.c;
        return this.e.hashCode() + jc1.d(this.d, (iHashCode2 + (c5074y2 != null ? c5074y2.hashCode() : 0)) * 31, 31);
    }

    public final int i() {
        return this.d;
    }

    @Nullable
    public final C5074y2 j() {
        return this.c;
    }

    @NotNull
    public String toString() {
        String str = this.a;
        JSONObject jSONObject = this.b;
        C5074y2 c5074y2 = this.c;
        int i = this.d;
        String str2 = this.e;
        StringBuilder sb = new StringBuilder("AuctionResponseData(auctionId=");
        sb.append(str);
        sb.append(", auctionResponseGenericParam=");
        sb.append(jSONObject);
        sb.append(", genericNotifications=");
        sb.append(c5074y2);
        sb.append(", auctionTrial=");
        sb.append(i);
        sb.append(", auctionFallback=");
        return nj.q(sb, str2, ")");
    }

    public C5020v2(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable C5074y2 c5074y2, int i, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = jSONObject;
        this.c = c5074y2;
        this.d = i;
        this.e = str2;
    }

    @NotNull
    public final C5020v2 a(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable C5074y2 c5074y2, int i, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return new C5020v2(str, jSONObject, c5074y2, i, str2);
    }

    @NotNull
    public final String a() {
        return this.a;
    }
}
