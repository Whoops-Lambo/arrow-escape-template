package io.p071bidmachine.rendering.internal.controller;

import defpackage.cz;
import io.p071bidmachine.rendering.internal.a;
import io.p071bidmachine.rendering.internal.a0;
import io.p071bidmachine.rendering.internal.e0;
import io.p071bidmachine.rendering.utils.g;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class u implements a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(Object obj, cz czVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = czVar;
    }

    @Override // io.p071bidmachine.util.k
    public final void t() {
        switch (this.a) {
            case 0:
                ((e0) this.c).pause();
                break;
            case 1:
                ((e0) this.c).play();
                break;
            case 2:
                ((a) this.c).l();
                break;
            default:
                io.p071bidmachine.rendering.internal.adform.a aVar = (io.p071bidmachine.rendering.internal.adform.a) ((g) this.c);
                aVar.u = false;
                aVar.D(aVar.t);
                break;
        }
    }
}
