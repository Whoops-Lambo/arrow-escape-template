package defpackage;

import com.explorestack.protobuf.c7;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vq1 extends InputStream {
    public final /* synthetic */ int a = 1;
    public final ByteBuffer b;

    public vq1(wq1 wq1Var) {
        this.b = wq1Var.a.slice();
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.remaining();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        switch (this.a) {
            case 0:
                this.b.mark();
                break;
            default:
                this.b.mark();
                break;
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        switch (this.a) {
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        ByteBuffer byteBuffer = this.b;
        switch (i3) {
            case 0:
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(i2, byteBuffer.remaining());
                byteBuffer.get(bArr, i, iMin);
                return iMin;
            default:
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int iMin2 = Math.min(i2, byteBuffer.remaining());
                byteBuffer.get(bArr, i, iMin2);
                return iMin2;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        switch (this.a) {
            case 0:
                try {
                    this.b.reset();
                    return;
                } catch (InvalidMarkException e) {
                    throw new IOException(e);
                }
            default:
                try {
                    this.b.reset();
                    return;
                } catch (InvalidMarkException e2) {
                    throw new IOException(e2);
                }
        }
    }

    public vq1(c7 c7Var) {
        this.b = c7Var.a.slice();
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.a;
        ByteBuffer byteBuffer = this.b;
        switch (i) {
            case 0:
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                }
                return -1;
            default:
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                }
                return -1;
        }
    }
}
