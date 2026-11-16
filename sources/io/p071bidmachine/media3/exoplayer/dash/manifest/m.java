package io.p071bidmachine.media3.exoplayer.dash.manifest;

import defpackage.d31;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.dash.j;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class m {
    public final n a;
    public final d31 b;
    public final long c;
    public final List d;
    public final List e;
    public final List f;
    public final j g;

    public abstract String a();

    public abstract j b();

    public abstract j d();

    public m(n nVar, List list, s sVar, List list2, List list3, List list4) {
        List listUnmodifiableList;
        a.c(!list.isEmpty());
        this.a = nVar;
        this.b = d31.A(list);
        if (list2 == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list2);
        }
        this.d = listUnmodifiableList;
        this.e = list3;
        this.f = list4;
        this.g = sVar.a(this);
        long j = sVar.c;
        long j2 = sVar.b;
        int i = x.a;
        this.c = x.T(j, 1000000L, j2, RoundingMode.DOWN);
    }
}
