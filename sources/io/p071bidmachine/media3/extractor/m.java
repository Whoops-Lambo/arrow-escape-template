package io.p071bidmachine.media3.extractor;

import defpackage.d31;
import defpackage.y32;
import defpackage.z21;
import io.p071bidmachine.media3.common.q;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public interface m {
    int a(n nVar, q qVar);

    boolean b(n nVar);

    void c(o oVar);

    void release();

    void seek(long j, long j2);

    default List getSniffFailureDetails() {
        z21 z21Var = d31.b;
        return y32.e;
    }
}
