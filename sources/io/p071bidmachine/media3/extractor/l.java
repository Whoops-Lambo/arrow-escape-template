package io.p071bidmachine.media3.extractor;

import defpackage.d;
import io.p071bidmachine.media3.common.g;
import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.common.util.q;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class l implements e0 {
    public final byte[] a = new byte[4096];

    @Override // io.p071bidmachine.media3.extractor.e0
    public final void b(long j, int i, int i2, int i3, d0 d0Var) {
    }

    @Override // io.p071bidmachine.media3.extractor.e0
    public final void c(n nVar) {
    }

    @Override // io.p071bidmachine.media3.extractor.e0
    public final int a(g gVar, int i, boolean z) throws EOFException {
        byte[] bArr = this.a;
        int i2 = gVar.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        d.s();
        return 0;
    }

    @Override // io.p071bidmachine.media3.extractor.e0
    public final void d(q qVar, int i, int i2) {
        qVar.G(i);
    }
}
