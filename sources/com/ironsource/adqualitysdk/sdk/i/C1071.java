package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.nj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ị, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1071 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String f3093;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String f3094;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List f3095;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean f3096;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1071.class == obj.getClass()) {
            C1071 c1071 = (C1071) obj;
            if (this.f3096 != c1071.f3096 || !this.f3095.equals(c1071.f3095)) {
                return false;
            }
            String str = this.f3094;
            String str2 = c1071.f3094;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.f3093;
            String str4 = c1071.f3093;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f3095.hashCode() + ((this.f3096 ? 1 : 0) * 31)) * 31;
        String str = this.f3094;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3093;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("kwuHjrJVcYmRHJuNt0VviLYai52oQik=\n", "w3no+NsxFPs=\n"));
        sb.append(this.f3096);
        sb.append(StringFog.decrypt("t0HfVJax94boXA==\n", "m2GsPfHfluo=\n"));
        sb.append(this.f3095);
        sb.append(StringFog.decrypt("jVzotY0NakuG\n", "oXyc2uZoBHY=\n"));
        sb.append(this.f3094);
        sb.append('\'');
        sb.append(StringFog.decrypt("x/Q35ena3jfM\n", "69RSl5u1rAo=\n"));
        return nj.q(sb, this.f3093, "'}");
    }

    public C1071(boolean z, List list, String str, String str2) {
        this.f3096 = z;
        this.f3095 = Collections.unmodifiableList(new ArrayList(list));
        this.f3094 = str;
        this.f3093 = str2;
    }
}
