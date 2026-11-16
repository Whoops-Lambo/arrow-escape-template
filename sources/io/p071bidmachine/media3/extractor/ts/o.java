package io.p071bidmachine.media3.extractor.ts;

import android.util.SparseArray;
import io.p071bidmachine.media3.common.util.p;
import io.p071bidmachine.media3.extractor.e0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class o {
    public final e0 a;
    public final boolean b;
    public final boolean c;
    public final p f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public long l;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public n m = new n();
    public n n = new n();
    public boolean k = false;
    public boolean o = false;

    public o(e0 e0Var, boolean z, boolean z2) {
        this.a = e0Var;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new p(bArr, 0, 0);
        n nVar = this.n;
        nVar.b = false;
        nVar.a = false;
    }
}
