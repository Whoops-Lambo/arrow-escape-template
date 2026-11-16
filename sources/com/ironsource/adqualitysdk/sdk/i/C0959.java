package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.n30;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᴊ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C0959 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final ArrayList f2579;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String f2580;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Class f2581;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0959.class != obj.getClass()) {
            return false;
        }
        C0959 c0959 = (C0959) obj;
        if (this.f2581.equals(c0959.f2581) && this.f2580.equals(c0959.f2580)) {
            return this.f2579.equals(c0959.f2579);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2579.hashCode() + n30.c(this.f2581.hashCode() * 31, 31, this.f2580);
    }

    public final String toString() {
        return StringFog.decrypt("/MweBo5IRhzXwAQHlUVtF8o=\n", "salqbuEsAnk=\n") + StringFog.decrypt("l27lhmW+8XiWQPSfPQ==\n", "+iGH7ADdhTs=\n") + this.f2581 + StringFog.decrypt("mFu2kK30nK3QNbqwrb3T\n", "tHvb3ciA9MI=\n") + this.f2580 + '\'' + StringFog.decrypt("e0UxQts3nkc2Fi9m2m0=\n", "V2VcA6lQ3Ss=\n") + this.f2579 + '}';
    }

    public C0959(Object obj, String str, ArrayList arrayList) {
        if (obj instanceof Class) {
            this.f2581 = (Class) obj;
        } else {
            this.f2581 = obj.getClass();
        }
        this.f2580 = str;
        this.f2579 = arrayList;
    }
}
