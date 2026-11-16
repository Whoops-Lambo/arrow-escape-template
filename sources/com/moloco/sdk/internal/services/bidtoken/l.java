package com.moloco.sdk.internal.services.bidtoken;

import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class l {
    public final String a;
    public final String b;
    public final f c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.a) && this.b.equals(lVar.b) && this.c.equals(lVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c.a) + n30.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "BidTokenResponseComponents(bidToken=" + this.a + ", publicKey=" + this.b + ", bidTokenConfig=" + this.c + ')';
    }

    public l(String str, String str2, f fVar) {
        this.a = str;
        this.b = str2;
        this.c = fVar;
    }
}
