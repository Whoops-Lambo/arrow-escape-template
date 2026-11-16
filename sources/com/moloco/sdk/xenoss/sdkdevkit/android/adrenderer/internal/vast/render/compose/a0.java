package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a0 implements zr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ a0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r rVar, Modifier modifier, int i, int i2, int i3) {
        this.a = i3;
        this.b = rVar;
        this.c = modifier;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return A.a(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return C5117a.a(this.b, this.c, this.d, this.e, (Composer) obj, iIntValue2);
        }
    }
}
