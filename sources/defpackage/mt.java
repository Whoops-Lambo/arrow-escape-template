package defpackage;

import com.google.protobuf.t;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mt extends t {
    public final ByteBuffer e;
    public final int f;

    @Override // com.google.protobuf.t, com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.e.position(getTotalBytesWritten() + this.f);
    }

    public mt(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        this.e = byteBuffer;
        this.f = byteBuffer.position();
    }
}
