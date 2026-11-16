package com.ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᚆ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC0954 extends AbstractC1208 {
    /* JADX INFO: renamed from: ﾒ */
    public abstract boolean mo635(int i);

    /* JADX INFO: renamed from: ﾒ */
    public abstract boolean mo588(Object obj, Object obj2);

    /* JADX INFO: renamed from: ﾒ */
    public abstract boolean mo589(String str, String str2);

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1090
    /* JADX INFO: renamed from: ﾒ */
    public final C1033 mo364(C0890 c0890, C1199 c1199) {
        Object obj = this.f3645.m795(c0890, c1199).f3012;
        Object obj2 = this.f3644.m795(c0890, c1199).f3012;
        try {
            return new C1033(Boolean.valueOf(mo635(new BigDecimal(obj.toString()).compareTo(new BigDecimal(obj2.toString())))));
        } catch (Exception unused) {
            return ((obj instanceof String) && (obj2 instanceof String)) ? new C1033(Boolean.valueOf(mo589((String) obj, (String) obj2))) : new C1033(Boolean.valueOf(mo588(obj, obj2)));
        }
    }

    public AbstractC0954(AbstractC1090 abstractC1090, AbstractC1090 abstractC1091) {
        super(abstractC1090, abstractC1091);
    }
}
