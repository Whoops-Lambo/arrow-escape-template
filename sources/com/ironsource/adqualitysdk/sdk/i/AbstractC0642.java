package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ـ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC0642 extends AbstractC1090 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC1090 f1675;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC1090 f1676;

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1090
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        AbstractC0642 abstractC0642 = (AbstractC0642) obj;
        AbstractC1090 abstractC1090 = this.f1676;
        if (abstractC1090 == null ? abstractC0642.f1676 != null : !abstractC1090.equals(abstractC0642.f1676)) {
            return false;
        }
        AbstractC1090 abstractC1091 = this.f1675;
        if (abstractC1091 != null) {
            return abstractC1091.equals(abstractC0642.f1675);
        }
        return abstractC0642.f1675 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1090
    public int hashCode() {
        AbstractC1090 abstractC1090 = this.f1676;
        int iHashCode = (abstractC1090 != null ? abstractC1090.hashCode() : 0) * 31;
        AbstractC1090 abstractC1091 = this.f1675;
        return iHashCode + (abstractC1091 != null ? abstractC1091.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1676.toString());
        sb.append(StringFog.decrypt("nA==\n", "x+JclG1MIsg=\n"));
        sb.append(this.f1675.toString());
        return AbstractC1156.m868("HQ==\n", "QJKkN/LdWJM=\n", sb);
    }

    public AbstractC0642(AbstractC1090 abstractC1090, AbstractC1090 abstractC1091) {
        this.f1676 = abstractC1090;
        this.f1675 = abstractC1091;
    }
}
