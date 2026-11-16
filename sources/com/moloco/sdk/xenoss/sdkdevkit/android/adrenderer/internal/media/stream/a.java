package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import defpackage.az2;
import defpackage.kz1;
import defpackage.lz1;
import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lz1 b;

    public /* synthetic */ a(lz1 lz1Var, int i) {
        this.a = i;
        this.b = lz1Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        az2 az2Var = az2.a;
        lz1 lz1Var = this.b;
        switch (i) {
            case 0:
                ((kz1) lz1Var).c((c) obj);
                break;
            default:
                ((kz1) lz1Var).c((d) obj);
                break;
        }
        return az2Var;
    }
}
