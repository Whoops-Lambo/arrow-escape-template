package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class j {
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;
    public final m e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s71.b(this.a, jVar.a) && s71.b(this.b, jVar.b) && s71.b(this.c, jVar.c) && s71.b(this.d, jVar.d) && s71.b(this.e, jVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Creative(id=" + this.a + ", sequence=" + this.b + ", adId=" + this.c + ", apiFramework=" + this.d + ", child=" + this.e + ')';
    }

    public j(String str, Integer num, String str2, String str3, m mVar) {
        mVar.getClass();
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = mVar;
    }
}
