package com.fyber.inneractive.sdk.mraid;

import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class x extends y {
    public final int a;
    public final int b;

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        StringBuilder sb = new StringBuilder("adSize: { width: ");
        sb.append(this.a);
        sb.append(", height: ");
        return nj.l(this.b, " }", sb);
    }

    public x(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
