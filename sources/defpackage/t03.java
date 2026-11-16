package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class t03 extends UploadDataProvider {
    public final ByteBuffer a;

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.limit();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.a.position(0);
        uploadDataSink.onRewindSucceeded();
    }

    public t03(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int iRemaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.a;
            if (iRemaining >= byteBuffer2.remaining()) {
                byteBuffer.put(byteBuffer2);
            } else {
                int iLimit = byteBuffer2.limit();
                byteBuffer2.limit(byteBuffer.remaining() + byteBuffer2.position());
                byteBuffer.put(byteBuffer2);
                byteBuffer2.limit(iLimit);
            }
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        e32.i("Cronet passed a buffer with no bytes remaining");
    }
}
