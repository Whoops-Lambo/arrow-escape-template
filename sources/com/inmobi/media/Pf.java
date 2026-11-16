package com.inmobi.media;

import defpackage.er;
import okio.ByteString;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Pf implements Of {
    public final int a;
    public final ByteString b;
    public final Jf c;

    @Override // com.inmobi.media.Of
    public final String e() {
        return null;
    }

    @Override // com.inmobi.media.Of
    public final Object a() {
        return O4.class.cast(AbstractC4184lb.a(new JSONObject(this.b.string(er.a)), O4.class, null, null));
    }

    @Override // com.inmobi.media.Of
    public final Jf b() {
        return this.c;
    }

    @Override // com.inmobi.media.Of
    public final int c() {
        return this.a;
    }

    @Override // com.inmobi.media.Of
    public final ByteString d() {
        return this.b;
    }

    public Pf(String str, int i, ByteString byteString, Jf jf) {
        str.getClass();
        byteString.getClass();
        jf.getClass();
        this.a = i;
        this.b = byteString;
        this.c = jf;
    }
}
