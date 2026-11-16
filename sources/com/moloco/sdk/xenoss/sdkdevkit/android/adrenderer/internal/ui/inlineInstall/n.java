package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ n(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        h hVar = this.b;
        j jVar = (j) obj;
        switch (i) {
            case 0:
                return h.a(hVar, jVar);
            default:
                return h.b(hVar, jVar);
        }
    }
}
