package com.fyber.inneractive.sdk.mraid;

import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class z extends y {
    public final int a;
    public final int b;
    public final int d = 0;
    public final int c = 0;

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        StringBuilder sb = new StringBuilder("currentPosition: { x: ");
        sb.append(this.c);
        sb.append(", y: ");
        sb.append(this.d);
        sb.append(", width: ");
        sb.append(this.a);
        sb.append(", height: ");
        return nj.l(this.b, " }", sb);
    }

    public z(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
