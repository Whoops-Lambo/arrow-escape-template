package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C5117a;
import defpackage.sr0;
import defpackage.wr0;
import defpackage.xr0;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g0 implements zr0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ xr0 f;

    public /* synthetic */ g0(Modifier modifier, String str, wr0 wr0Var, int i, int i2) {
        this.b = modifier;
        this.e = str;
        this.f = wr0Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        xr0 xr0Var = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return C5115a.a(this.b, (String) obj3, (wr0) xr0Var, this.c, this.d, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return C5117a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i) obj3, (sr0) xr0Var, this.b, this.c, this.d, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ g0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i iVar, sr0 sr0Var, Modifier modifier, int i, int i2) {
        this.e = iVar;
        this.f = sr0Var;
        this.b = modifier;
        this.c = i;
        this.d = i2;
    }
}
