package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import defpackage.az2;
import defpackage.b4;
import defpackage.ye2;
import defpackage.zr0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d extends b4 implements zr0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        az2 az2Var = az2.a;
        switch (i) {
            case 0:
                MraidActivity mraidActivity = (MraidActivity) this.receiver;
                ye2 ye2Var = MraidActivity.h;
                mraidActivity.h((x) obj);
                break;
            default:
                FullscreenWebviewActivity fullscreenWebviewActivity = (FullscreenWebviewActivity) this.receiver;
                WeakReference weakReference = FullscreenWebviewActivity.c;
                fullscreenWebviewActivity.j((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a) obj);
                break;
        }
        return az2Var;
    }
}
