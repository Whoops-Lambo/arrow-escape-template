package com.ironsource.adqualitysdk.sdk.i;

import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᐞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0783 {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public C1130 f2057;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public int f2066;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public List f2067;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public Class f2068;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public Class f2069;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public Class f2070;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public int f2065 = -1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public int f2064 = -1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public int f2063 = -1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public int f2062 = -1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public int f2061 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public int f2060 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public int f2059 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public boolean f2058 = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0783.class == obj.getClass()) {
            C0783 c0783 = (C0783) obj;
            if (this.f2066 != c0783.f2066 || this.f2065 != c0783.f2065 || this.f2064 != c0783.f2064 || this.f2063 != c0783.f2063 || this.f2062 != c0783.f2062 || this.f2061 != c0783.f2061 || this.f2060 != c0783.f2060 || this.f2059 != c0783.f2059 || this.f2058 != c0783.f2058) {
                return false;
            }
            Class cls = this.f2070;
            Class cls2 = c0783.f2070;
            if (cls == null ? cls2 != null : !cls.equals(cls2)) {
                return false;
            }
            Class cls3 = this.f2069;
            Class cls4 = c0783.f2069;
            if (cls3 == null ? cls4 != null : !cls3.equals(cls4)) {
                return false;
            }
            Class cls5 = this.f2068;
            Class cls6 = c0783.f2068;
            if (cls5 == null ? cls6 != null : !cls5.equals(cls6)) {
                return false;
            }
            List list = this.f2067;
            List list2 = c0783.f2067;
            if (list == null ? list2 != null : !list.equals(list2)) {
                return false;
            }
            C1130 c1130 = this.f2057;
            C1130 c1131 = c0783.f2057;
            if (c1130 != null) {
                return c1130 == c1131;
            }
            if (c1131 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Class cls = this.f2070;
        int iHashCode = (cls != null ? cls.hashCode() : 0) * 31;
        Class cls2 = this.f2069;
        int iHashCode2 = (iHashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
        Class cls3 = this.f2068;
        int iHashCode3 = (iHashCode2 + (cls3 != null ? cls3.hashCode() : 0)) * 31;
        List list = this.f2067;
        int iHashCode4 = (((((((((((((((((((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f2066) * 31) + this.f2065) * 31) + this.f2064) * 31) + this.f2063) * 31) + this.f2062) * 31) + this.f2061) * 31) + this.f2060) * 31) + this.f2059) * 31) + (this.f2058 ? 1 : 0)) * 31;
        C1130 c1130 = this.f2057;
        return iHashCode4 + (c1130 != null ? c1130.hashCode() : 0);
    }
}
