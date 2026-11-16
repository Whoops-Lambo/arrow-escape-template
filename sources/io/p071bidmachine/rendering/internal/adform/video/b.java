package io.p071bidmachine.rendering.internal.adform.video;

import io.p071bidmachine.rendering.internal.a0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ b(d dVar, Integer num, int i) {
        this.a = i;
        this.b = dVar;
        this.c = num;
    }

    @Override // io.p071bidmachine.util.k
    public final void t() {
        int i = this.a;
        Integer num = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                io.p071bidmachine.rendering.internal.adform.video.player.b bVar = dVar.y;
                if (bVar != null) {
                    bVar.c(num);
                }
                break;
            default:
                io.p071bidmachine.rendering.internal.adform.video.player.b bVar2 = dVar.y;
                if (bVar2 != null) {
                    bVar2.b(num);
                }
                break;
        }
    }
}
