package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.az2;
import defpackage.dt1;
import defpackage.k32;
import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k32 b;
    public final /* synthetic */ k32 c;

    public /* synthetic */ w(k32 k32Var, k32 k32Var2, int i) {
        this.a = i;
        this.b = k32Var;
        this.c = k32Var2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        az2 az2Var = az2.a;
        k32 k32Var = this.c;
        k32 k32Var2 = this.b;
        dt1 dt1Var = (dt1) obj;
        switch (i) {
            case 0:
                dt1Var.getClass();
                boolean zBooleanValue = ((Boolean) dt1Var.a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) dt1Var.b).booleanValue();
                if (zBooleanValue) {
                    k32Var2.a++;
                }
                if (zBooleanValue2) {
                    k32Var.a++;
                }
                break;
            default:
                dt1Var.getClass();
                boolean zBooleanValue3 = ((Boolean) dt1Var.a).booleanValue();
                boolean zBooleanValue4 = ((Boolean) dt1Var.b).booleanValue();
                if (zBooleanValue3) {
                    k32Var2.a++;
                }
                if (zBooleanValue4) {
                    k32Var.a++;
                }
                break;
        }
        return az2Var;
    }
}
