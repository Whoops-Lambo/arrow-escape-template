package io.p071bidmachine.rendering.ad.view;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ a(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        i iVar = this.b;
        switch (i) {
            case 0:
                j jVar = iVar.m;
                if (jVar != null) {
                    jVar.t(iVar);
                }
                break;
            case 1:
                j jVar2 = iVar.m;
                if (jVar2 != null) {
                    jVar2.d(iVar);
                }
                break;
            case 2:
                j jVar3 = iVar.m;
                if (jVar3 != null) {
                    jVar3.onAdExpired(iVar);
                }
                break;
            case 3:
                j jVar4 = iVar.m;
                if (jVar4 != null) {
                    jVar4.i(iVar);
                }
                break;
            case 4:
                j jVar5 = iVar.m;
                if (jVar5 != null) {
                    jVar5.onAdLoaded(iVar);
                }
                break;
            default:
                j jVar6 = iVar.m;
                if (jVar6 != null) {
                    jVar6.h(iVar);
                }
                break;
        }
    }
}
