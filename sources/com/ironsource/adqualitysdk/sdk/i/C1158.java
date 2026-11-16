package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.丨, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1158 extends AbstractC0716 {
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0716
    /* JADX INFO: renamed from: ﾒ */
    public final Number mo586(Number number, Number number2) {
        if ((number instanceof Double) || (number2 instanceof Double)) {
            return Double.valueOf(number2.doubleValue() * number.doubleValue());
        }
        if ((number instanceof Long) || (number2 instanceof Long)) {
            return Long.valueOf(number2.longValue() * number.longValue());
        }
        return Integer.valueOf(number2.intValue() * number.intValue());
    }

    public C1158(AbstractC1090 abstractC1090, AbstractC1090 abstractC1091) {
        super(abstractC1090, abstractC1091);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1208
    /* JADX INFO: renamed from: ﾒ */
    public final String mo634() {
        return StringFog.decrypt("Lg==\n", "BAdDOKkDpSg=\n");
    }
}
