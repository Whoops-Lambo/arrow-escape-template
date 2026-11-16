package com.moloco.sdk.internal.services.bidtoken;

import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a == ((f) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return h50.m(new StringBuilder("BidTokenConfig(dbtEnabled="), this.a, ')');
    }

    public f(boolean z) {
        this.a = z;
    }
}
