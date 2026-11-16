package com.inmobi.media;

import defpackage.hg0;
import okio.ByteString;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6 implements Of {
    public final B6 a;
    public final ByteString b;

    @Override // com.inmobi.media.Of
    public final Object a() {
        return null;
    }

    @Override // com.inmobi.media.Of
    public final Jf b() {
        return new Jf(0L, hg0.a, 0, "");
    }

    @Override // com.inmobi.media.Of
    public final int c() {
        return this.a.a;
    }

    @Override // com.inmobi.media.Of
    public final ByteString d() {
        return this.b;
    }

    @Override // com.inmobi.media.Of
    public final String e() {
        return this.a.name();
    }

    public C6(String str, B6 b6) {
        str.getClass();
        b6.getClass();
        this.a = b6;
        this.b = ByteString.EMPTY;
    }
}
