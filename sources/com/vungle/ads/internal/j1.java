package com.vungle.ads.internal;

import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class j1 extends rc1 implements zr0 {
    public final /* synthetic */ n1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(n1 n1Var) {
        super(2);
        this.a = n1Var;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        if (iIntValue > 0 && iIntValue2 > 0) {
            this.a.z = iIntValue / iIntValue2;
        }
        return az2.a;
    }
}
