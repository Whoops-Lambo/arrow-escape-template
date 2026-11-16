package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.γ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0516 extends AbstractC1090 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object f1159;

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1090
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        AbstractC0516 abstractC0516 = (AbstractC0516) obj;
        Object obj2 = this.f1159;
        if (obj2 != null) {
            return obj2.equals(abstractC0516.f1159);
        }
        return abstractC0516.f1159 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1090
    public final int hashCode() {
        Object obj = this.f1159;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "" + this.f1159;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1090
    /* JADX INFO: renamed from: ﾒ */
    public final C1033 mo364(C0890 c0890, C1199 c1199) {
        return new C1033(this.f1159);
    }

    public AbstractC0516(Object obj) {
        this.f1159 = obj;
    }
}
