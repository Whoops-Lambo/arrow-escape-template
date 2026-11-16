package io.p071bidmachine.rendering.internal.event;

import defpackage.cz;
import defpackage.eu;
import defpackage.n5;
import defpackage.sr0;
import defpackage.tb5;
import io.p071bidmachine.media3.exoplayer.offline.b;
import io.p071bidmachine.rendering.internal.groups.a;
import io.p071bidmachine.rendering.internal.y;
import io.p071bidmachine.rendering.model.w;
import io.p071bidmachine.rendering.model.x;
import io.p071bidmachine.rendering.model.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g {
    public final String a;
    public final a b;
    public final b c;
    public final cz d;
    public final y e;
    public final Map f;

    public static final void a(g gVar, io.p071bidmachine.rendering.model.y yVar, List list, List list2) {
        ArrayList arrayList = new ArrayList(eu.f(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(gVar, (w) it.next(), yVar, list2, 0));
        }
        gVar.c(z.Sequence, arrayList, f.i);
    }

    public final void c(z zVar, List list, sr0 sr0Var) {
        tb5.t(this.d, this.e.b(), null, new com.moloco.sdk.internal.ilrd.a(list, zVar, sr0Var, this, null, 2), 2);
    }

    public final void d(List list, z zVar, io.p071bidmachine.rendering.model.y yVar, List list2, sr0 sr0Var) {
        ArrayList arrayList = new ArrayList(eu.f(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(this, yVar, (x) it.next(), list2));
        }
        c(zVar, arrayList, sr0Var);
    }

    public g(String str, a aVar, b bVar, io.p071bidmachine.rendering.internal.state.b bVar2, y yVar, Map map) {
        str.getClass();
        aVar.getClass();
        bVar2.getClass();
        yVar.getClass();
        this.a = str;
        this.b = aVar;
        this.c = bVar;
        this.d = bVar2;
        this.e = yVar;
        this.f = map;
    }

    public final void b(io.p071bidmachine.rendering.model.y yVar, Object obj, List list) {
        yVar.getClass();
        tb5.t(this.d, this.e.a(), null, new n5(this, yVar, obj, list, null, 8), 2);
    }
}
