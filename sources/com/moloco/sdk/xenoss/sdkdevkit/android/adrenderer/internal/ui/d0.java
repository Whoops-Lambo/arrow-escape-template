package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.runtime.Composer;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C5117a;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d0 implements zr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ d0(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i2 = this.b;
        switch (i) {
            case 0:
                return C5115a.a(i2, composer, iIntValue);
            case 1:
                return r.a(i2, composer, iIntValue);
            case 2:
                return u.a(i2, composer, iIntValue);
            case 3:
                return z.a(i2, composer, iIntValue);
            case 4:
                return C5117a.a(i2, composer, iIntValue);
            case 5:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.r.a(i2, composer, iIntValue);
            default:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.v.a(i2, composer, iIntValue);
        }
    }
}
