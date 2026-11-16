package com.vungle.ads.internal.ui;

import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class q extends rc1 implements zr0 {
    public final /* synthetic */ x a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x xVar) {
        super(2);
        this.a = xVar;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        str.getClass();
        this.a.a(str, iIntValue);
        return az2.a;
    }
}
