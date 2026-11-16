package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᵄ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C0999 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List f2841;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean f2842;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean f2843;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0999.class != obj.getClass()) {
            return false;
        }
        C0999 c0999 = (C0999) obj;
        if (this.f2843 == c0999.f2843 && this.f2842 == c0999.f2842) {
            return this.f2841.equals(c0999.f2841);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2841.hashCode() + ((((this.f2843 ? 1 : 0) * 31) + (this.f2842 ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("kxJhLO9D//KiCWc3xXTu5LQReiPCVdn4rglrPJY=\n", "wX0OWKsmi5c=\n"));
        sb.append(this.f2843);
        sb.append(StringFog.decrypt("ojQCgq4VlTPvYASD1g==\n", "jhRr8et44F8=\n"));
        sb.append(this.f2842);
        sb.append(StringFog.decrypt("xEIyyhj94sSbXw==\n", "6GJBo3+Tg6g=\n"));
        return pv1.q(sb, this.f2841, '}');
    }

    public C0999(boolean z, boolean z2, ArrayList arrayList) {
        this.f2843 = z;
        this.f2842 = z2;
        this.f2841 = Collections.unmodifiableList(new ArrayList(arrayList));
    }
}
