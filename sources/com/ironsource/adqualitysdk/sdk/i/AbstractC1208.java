package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﭡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1208 extends AbstractC1090 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC1090 f3644;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC1090 f3645;

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1090
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        AbstractC1208 abstractC1208 = (AbstractC1208) obj;
        AbstractC1090 abstractC1090 = this.f3645;
        if (abstractC1090 == null ? abstractC1208.f3645 != null : !abstractC1090.equals(abstractC1208.f3645)) {
            return false;
        }
        AbstractC1090 abstractC1091 = this.f3644;
        if (abstractC1091 != null) {
            return abstractC1091.equals(abstractC1208.f3644);
        }
        return abstractC1208.f3644 == null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public abstract String mo634();

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1090
    public final int hashCode() {
        AbstractC1090 abstractC1090 = this.f3645;
        int iHashCode = (abstractC1090 != null ? abstractC1090.hashCode() : 0) * 31;
        AbstractC1090 abstractC1091 = this.f3644;
        return iHashCode + (abstractC1091 != null ? abstractC1091.hashCode() : 0);
    }

    public final String toString() {
        return this.f3645 + " " + mo634() + " " + this.f3644;
    }

    public AbstractC1208(AbstractC1090 abstractC1090, AbstractC1090 abstractC1091) {
        this.f3645 = abstractC1090;
        this.f3644 = abstractC1091;
    }
}
