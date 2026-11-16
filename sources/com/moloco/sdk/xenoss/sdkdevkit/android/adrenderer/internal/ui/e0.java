package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a1;
import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e0 implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ e0(a1 a1Var, String str, int i) {
        this.a = i;
        this.b = a1Var;
        this.c = str;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return C5115a.c(this.b, this.c, (String) obj);
            case 1:
                return C5115a.a(this.b, this.c, (String) obj);
            default:
                return C5115a.b(this.b, this.c, (String) obj);
        }
    }
}
