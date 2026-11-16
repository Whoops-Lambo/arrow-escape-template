package io.p071bidmachine.internal;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class m0 {
    public final String a;
    public final String b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Boolean g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return s71.b(this.a, m0Var.a) && s71.b(this.b, m0Var.b) && s71.b(this.c, m0Var.c) && s71.b(this.d, m0Var.d) && s71.b(this.e, m0Var.e) && s71.b(this.f, m0Var.f) && s71.b(this.g, m0Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool = this.g;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "InstallInfo(installReferrerUrl=" + this.a + ", installVersion=" + this.b + ", installReferrerClickSec=" + this.c + ", installBeginSec=" + this.d + ", installReferrerClickServerSec=" + this.e + ", installBeginServerSec=" + this.f + ", isGooglePlayInstant=" + this.g + ')';
    }

    public m0(String str, String str2, Long l, Long l2, Long l3, Long l4, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = bool;
    }
}
