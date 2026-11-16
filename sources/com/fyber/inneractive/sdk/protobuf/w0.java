package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class w0 implements Comparable {
    public final e1 a;
    public final int b;
    public final j4 c;
    public final boolean d;
    public final boolean e;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((w0) obj).b;
    }

    public w0(e1 e1Var, int i, j4 j4Var, boolean z, boolean z2) {
        this.a = e1Var;
        this.b = i;
        this.c = j4Var;
        this.d = z;
        this.e = z2;
    }
}
