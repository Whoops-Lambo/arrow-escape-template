package io.p071bidmachine.rendering.internal.adform.video;

import io.p071bidmachine.rendering.internal.a0;
import io.p071bidmachine.rendering.internal.adform.video.player.b;
import io.p071bidmachine.rendering.utils.d;
import io.p071bidmachine.util.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ a(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // io.p071bidmachine.util.k
    public final void t() {
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                b bVar = dVar.y;
                if (bVar != null) {
                    try {
                        bVar.e.set(false);
                        bVar.y();
                        bVar.l = bVar.d();
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
            case 1:
                b bVar2 = dVar.y;
                if (bVar2 != null) {
                    try {
                        bVar2.i = true;
                        Long lValueOf = bVar2.f.get() ? Long.valueOf(bVar2.k) : null;
                        bVar2.e.set(true);
                        bVar2.g(false, lValueOf);
                    } catch (Exception e) {
                        bVar2.k(new e(e));
                        return;
                    }
                }
                break;
            case 2:
                d.a(new a(dVar, 3));
                break;
            case 3:
                b bVar3 = dVar.y;
                if (bVar3 != null) {
                    bVar3.o();
                }
                dVar.y = null;
                break;
            case 4:
                b bVar4 = dVar.y;
                if (bVar4 != null) {
                    bVar4.l();
                }
                break;
            default:
                b bVar5 = dVar.y;
                if (bVar5 != null) {
                    bVar5.n();
                }
                break;
        }
    }
}
