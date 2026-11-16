package com.mbridge.msdk.config.component.model;

import com.mbridge.msdk.config.component.base.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ModelCpt b;
    public final /* synthetic */ ModelCpt.a c;
    public final /* synthetic */ b d;

    public /* synthetic */ a(ModelCpt modelCpt, ModelCpt.a aVar, b bVar, int i) {
        this.a = i;
        this.b = modelCpt;
        this.c = aVar;
        this.d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b bVar = this.d;
        ModelCpt.a aVar = this.c;
        ModelCpt modelCpt = this.b;
        switch (i) {
            case 0:
                modelCpt.a(aVar, bVar);
                break;
            default:
                modelCpt.b(aVar, bVar);
                break;
        }
    }
}
