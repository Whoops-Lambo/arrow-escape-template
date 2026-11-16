package com.inmobi.media;

import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Tb {
    public final int a;
    public final Integer b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tb)) {
            return false;
        }
        Tb tb = (Tb) obj;
        return this.a == tb.a && s71.b(this.b, tb.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OpenRequestResultData(result=" + this.a + ", errorCode=" + this.b + ")";
    }

    public Tb(int i) {
        this.a = i;
        this.b = null;
    }

    public Tb(int i, Integer num) {
        this.a = i;
        this.b = num;
    }
}
