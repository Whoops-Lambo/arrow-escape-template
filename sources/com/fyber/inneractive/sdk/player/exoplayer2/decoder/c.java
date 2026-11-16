package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import defpackage.e32;
import defpackage.jc1;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public int a;
    public ByteBuffer c;
    public long d;
    public final b b = new b();
    public final int e = 0;

    public final ByteBuffer a(int i) {
        int i2 = this.e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        e32.i(jc1.n("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i, ")"));
        return null;
    }

    public final boolean b(int i) {
        return (this.a & i) == i;
    }

    public final void a() {
        this.a = 0;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }
}
