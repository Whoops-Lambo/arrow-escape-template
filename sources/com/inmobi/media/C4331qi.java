package com.inmobi.media;

import defpackage.jc1;

/* JADX INFO: renamed from: com.inmobi.media.qi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4331qi {
    public int a = 0;
    public int b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4331qi)) {
            return false;
        }
        C4331qi c4331qi = (C4331qi) obj;
        return this.a == c4331qi.a && this.b == c4331qi.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return jc1.n("PurchaseData(noOfInAppPurchases=", this.a, ", noOfSubscriptions=", this.b, ")");
    }
}
