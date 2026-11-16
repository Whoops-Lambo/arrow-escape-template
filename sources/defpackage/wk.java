package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class wk extends l90 {
    public final int f;

    public wk() {
        super(2048);
        this.f = 4098;
    }

    @Override // defpackage.l90
    public final Object b(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    @Override // defpackage.l90
    public final Object d() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f);
        byteBufferAllocate.getClass();
        return byteBufferAllocate;
    }

    @Override // defpackage.l90
    public final void o(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.getClass();
        if (byteBuffer.capacity() != this.f) {
            e32.i("Check failed.");
        } else if (byteBuffer.isDirect()) {
            e32.i("Check failed.");
        }
    }
}
