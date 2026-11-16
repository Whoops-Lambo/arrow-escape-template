package io.p071bidmachine.rendering.ad.view;

import io.p071bidmachine.util.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;
    public final /* synthetic */ e c;

    public /* synthetic */ b(i iVar, e eVar, int i) {
        this.a = i;
        this.b = iVar;
        this.c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        e eVar = this.c;
        i iVar = this.b;
        switch (i) {
            case 0:
                eVar.getClass();
                j jVar = iVar.m;
                if (jVar != null) {
                    jVar.g(iVar, eVar);
                }
                break;
            default:
                eVar.getClass();
                j jVar2 = iVar.m;
                if (jVar2 != null) {
                    jVar2.v(iVar, eVar);
                }
                break;
        }
    }
}
