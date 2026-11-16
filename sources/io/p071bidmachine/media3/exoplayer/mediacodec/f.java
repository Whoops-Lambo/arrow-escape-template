package io.p071bidmachine.media3.exoplayer.mediacodec;

import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.decoder.e;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends e {
    public long j;
    public int k;
    public int l;

    public final boolean j(e eVar) {
        ByteBuffer byteBuffer;
        a.c(!eVar.d(1073741824));
        a.c(!eVar.d(268435456));
        a.c(!eVar.d(4));
        if (k()) {
            if (this.k >= this.l) {
                return false;
            }
            ByteBuffer byteBuffer2 = eVar.e;
            if (byteBuffer2 != null && (byteBuffer = this.e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.k;
        this.k = i + 1;
        if (i == 0) {
            this.g = eVar.g;
            if (eVar.d(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = eVar.e;
        if (byteBuffer3 != null) {
            h(byteBuffer3.remaining());
            this.e.put(byteBuffer3);
        }
        this.j = eVar.g;
        return true;
    }

    public final boolean k() {
        return this.k > 0;
    }

    @Override // io.p071bidmachine.media3.decoder.e
    public final void f() {
        super.f();
        this.k = 0;
    }
}
