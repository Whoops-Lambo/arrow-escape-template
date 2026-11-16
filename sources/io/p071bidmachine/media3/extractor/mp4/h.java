package io.p071bidmachine.media3.extractor.mp4;

import io.p071bidmachine.media3.extractor.e0;
import io.p071bidmachine.media3.extractor.f0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public final m a;
    public final p b;
    public final e0 c;
    public final f0 d;
    public int e;

    public h(m mVar, p pVar, e0 e0Var) {
        f0 f0Var;
        this.a = mVar;
        this.b = pVar;
        this.c = e0Var;
        if ("audio/true-hd".equals(mVar.g.n)) {
            f0Var = new f0();
        } else {
            f0Var = null;
        }
        this.d = f0Var;
    }
}
