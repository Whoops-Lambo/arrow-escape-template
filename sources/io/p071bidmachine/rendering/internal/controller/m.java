package io.p071bidmachine.rendering.internal.controller;

import defpackage.cz;
import io.p071bidmachine.rendering.internal.a0;
import io.p071bidmachine.rendering.internal.adform.a;
import io.p071bidmachine.rendering.internal.j;
import io.p071bidmachine.rendering.utils.g;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class m implements a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ m(Object obj, cz czVar, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = z;
        this.b = czVar;
    }

    @Override // io.p071bidmachine.util.k
    public final void t() {
        switch (this.a) {
            case 0:
                j jVar = (j) this.c;
                boolean z = this.d;
                boolean z2 = jVar.c != z;
                jVar.c = z;
                if (z) {
                    jVar.j();
                } else {
                    jVar.k();
                }
                if (z2) {
                    jVar.g(z);
                }
                break;
            default:
                a aVar = (a) ((g) this.c);
                aVar.D(this.d);
                aVar.u = true;
                break;
        }
    }
}
