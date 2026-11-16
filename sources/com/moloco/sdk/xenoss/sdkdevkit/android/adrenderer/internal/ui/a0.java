package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0;
import defpackage.as0;
import defpackage.ds0;
import defpackage.sr0;
import defpackage.wr0;
import defpackage.xr0;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a0 implements zr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ xr0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a0(Modifier modifier, String str, a1 a1Var, wr0 wr0Var, int i, int i2) {
        this.a = 1;
        this.b = modifier;
        this.f = str;
        this.g = a1Var;
        this.c = wr0Var;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.g;
        xr0 xr0Var = this.c;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return B.a(this.b, (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c) obj4, (wr0) xr0Var, (as0) obj3, this.d, this.e, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return C5115a.a(this.b, (String) obj4, (a1) obj3, (wr0) xr0Var, this.d, this.e, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return r.a(this.b, (String) obj4, (sr0) xr0Var, (z0) obj3, this.d, this.e, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c) obj4, (sr0) xr0Var, (ds0) obj3, this.b, this.d, this.e, (Composer) obj, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj2).intValue();
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.t.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s) obj4, (sr0) xr0Var, (sr0) obj3, this.b, this.d, this.e, (Composer) obj, iIntValue5);
        }
    }

    public /* synthetic */ a0(Modifier modifier, Object obj, xr0 xr0Var, Object obj2, int i, int i2, int i3) {
        this.a = i3;
        this.b = modifier;
        this.f = obj;
        this.c = xr0Var;
        this.g = obj2;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ a0(Object obj, sr0 sr0Var, xr0 xr0Var, Modifier modifier, int i, int i2, int i3) {
        this.a = i3;
        this.f = obj;
        this.c = sr0Var;
        this.g = xr0Var;
        this.b = modifier;
        this.d = i;
        this.e = i2;
    }
}
