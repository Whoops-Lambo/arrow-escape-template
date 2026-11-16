package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import defpackage.as0;
import defpackage.az2;
import defpackage.dt1;
import defpackage.dy;
import defpackage.ul2;
import defpackage.wz2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class d0 extends ul2 implements as0 {
    public final /* synthetic */ int r;
    public /* synthetic */ boolean s;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, dy dyVar, int i2) {
        super(i, dyVar);
        this.r = i2;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        az2 az2Var = az2.a;
        int i2 = 3;
        Boolean bool = (Boolean) obj;
        switch (i) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                d0 d0Var = new d0(i2, (dy) obj3, 0);
                d0Var.s = zBooleanValue;
                d0Var.t = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj2;
                return d0Var.invokeSuspend(az2Var);
            case 1:
                boolean zBooleanValue2 = bool.booleanValue();
                d0 d0Var2 = new d0(i2, (dy) obj3, 1);
                d0Var2.s = zBooleanValue2;
                d0Var2.t = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj2;
                return d0Var2.invokeSuspend(az2Var);
            case 2:
                boolean zBooleanValue3 = bool.booleanValue();
                d0 d0Var3 = new d0(i2, (dy) obj3, 2);
                d0Var3.s = zBooleanValue3;
                d0Var3.t = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.f0) obj2;
                return d0Var3.invokeSuspend(az2Var);
            default:
                boolean zBooleanValue4 = bool.booleanValue();
                d0 d0Var4 = new d0(i2, (dy) obj3, i2);
                d0Var4.s = zBooleanValue4;
                d0Var4.t = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s) obj2;
                return d0Var4.invokeSuspend(az2Var);
        }
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                wz2.a0(obj);
                boolean z = this.s;
                return new dt1(Boolean.valueOf(z), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) this.t);
            case 1:
                wz2.a0(obj);
                boolean z2 = this.s;
                return new dt1(Boolean.valueOf(z2), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.t);
            case 2:
                wz2.a0(obj);
                boolean z3 = this.s;
                return new dt1(Boolean.valueOf(z3), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.f0) this.t);
            default:
                wz2.a0(obj);
                boolean z4 = this.s;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s sVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s) this.t;
                if (z4) {
                    return sVar;
                }
                return null;
        }
    }
}
