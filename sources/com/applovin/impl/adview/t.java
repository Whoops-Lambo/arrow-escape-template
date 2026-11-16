package com.applovin.impl.adview;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ t(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                fVar.e();
                break;
            default:
                fVar.f();
                break;
        }
    }
}
