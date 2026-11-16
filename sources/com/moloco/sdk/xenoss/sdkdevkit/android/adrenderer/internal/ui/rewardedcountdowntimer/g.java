package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.IntSize;
import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ g(MutableState mutableState, int i) {
        this.a = i;
        this.b = mutableState;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return b.a(this.b, (IntSize) obj);
            default:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.j.a(this.b, ((Boolean) obj).booleanValue());
        }
    }
}
