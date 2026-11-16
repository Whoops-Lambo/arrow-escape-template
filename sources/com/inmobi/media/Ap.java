package com.inmobi.media;

import defpackage.az2;
import defpackage.cp0;
import defpackage.cz;
import defpackage.dy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Ap implements cp0 {
    public final /* synthetic */ Dp a;

    public Ap(cz czVar, Dp dp) {
        this.a = dp;
    }

    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Z9 z9 = this.a.c;
        if (z9 != null) {
            z9.a("VideoSurfaceViewabilityController", "Viewability " + zBooleanValue);
        }
        Dp dp = this.a;
        if (zBooleanValue) {
            InterfaceC4417tl interfaceC4417tl = dp.h;
            if (interfaceC4417tl != null) {
                interfaceC4417tl.a();
            }
        } else {
            InterfaceC4417tl interfaceC4417tl2 = dp.h;
            if (interfaceC4417tl2 != null) {
                interfaceC4417tl2.b();
            }
        }
        return az2.a;
    }
}
