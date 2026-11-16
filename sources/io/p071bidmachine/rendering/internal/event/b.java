package io.p071bidmachine.rendering.internal.event;

import defpackage.az2;
import defpackage.wr0;
import io.p071bidmachine.rendering.model.y;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements wr0 {
    public final y a;
    public final List b;
    public final List c;
    public final /* synthetic */ g d;

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        List list = (List) obj;
        if (list == null) {
            list = this.b;
        }
        g.a(this.d, this.a, list, this.c);
        return az2.a;
    }

    public b(g gVar, y yVar, List list, List list2) {
        yVar.getClass();
        list.getClass();
        this.d = gVar;
        this.a = yVar;
        this.b = list;
        this.c = list2;
    }
}
