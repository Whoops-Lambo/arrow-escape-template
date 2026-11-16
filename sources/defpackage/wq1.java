package defpackage;

import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Internal;
import com.google.protobuf.k2;
import com.google.protobuf.l;
import com.google.protobuf.u1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class wq1 extends l {
    public final ByteBuffer a;

    @Override // com.google.protobuf.l
    public final boolean a(l lVar, int i, int i2) {
        return substring(0, i2).equals(lVar.substring(i, i2 + i));
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() != byteString.size()) {
            return false;
        }
        if (byteBuffer.remaining() == 0) {
            return true;
        }
        if (obj instanceof wq1) {
            return byteBuffer.equals(((wq1) obj).a);
        }
        return obj instanceof u1 ? obj.equals(this) : byteBuffer.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.a.get(i4);
        }
        return i;
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        return k2.a.e(this.a, i, i2, i3 + i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.a.slice());
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return this.a.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(this.a.asReadOnlyBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        try {
            return this.a.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            d.l(e2.getMessage());
            return (byte) 0;
        }
    }

    public final ByteBuffer c(int i, int i2) {
        ByteBuffer byteBuffer = this.a;
        if (i < byteBuffer.position() || i2 > byteBuffer.limit() || i > i2) {
            wb0.g("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.position(i - byteBuffer.position());
        byteBufferSlice.limit(i2 - byteBuffer.position());
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a.slice());
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer byteBufferSlice = this.a.slice();
        byteBufferSlice.position(i);
        byteBufferSlice.get(bArr, i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        c43 c43Var = k2.a;
        ByteBuffer byteBuffer = this.a;
        return c43Var.e(byteBuffer, 0, byteBuffer.position(), byteBuffer.remaining()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.a, true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new vq1(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.a.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iPosition;
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.hasArray()) {
            byteArray = byteBuffer.array();
            iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iPosition = 0;
        }
        return new String(byteArray, iPosition, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) throws IOException {
        byteOutput.writeLazy(this.a.slice());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:7:0x0025, B:9:0x002b, B:12:0x0044, B:14:0x004d, B:16:0x0055, B:20:0x0061, B:21:0x0065, B:26:0x0083, B:28:0x0086, B:33:0x009d, B:35:0x00a3, B:30:0x008f, B:32:0x0095, B:24:0x007a), top: B:41:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:7:0x0025, B:9:0x002b, B:12:0x0044, B:14:0x004d, B:16:0x0055, B:20:0x0061, B:21:0x0065, B:26:0x0083, B:28:0x0086, B:33:0x009d, B:35:0x00a3, B:30:0x008f, B:32:0x0095, B:24:0x007a), top: B:41:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008f A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:7:0x0025, B:9:0x002b, B:12:0x0044, B:14:0x004d, B:16:0x0055, B:20:0x0061, B:21:0x0065, B:26:0x0083, B:28:0x0086, B:33:0x009d, B:35:0x00a3, B:30:0x008f, B:32:0x0095, B:24:0x007a), top: B:41:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:7:0x0025, B:9:0x002b, B:12:0x0044, B:14:0x004d, B:16:0x0055, B:20:0x0061, B:21:0x0065, B:26:0x0083, B:28:0x0086, B:33:0x009d, B:35:0x00a3, B:30:0x008f, B:32:0x0095, B:24:0x007a), top: B:41:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[Catch: all -> 0x0041, LOOP:0: B:33:0x009d->B:35:0x00a3, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:7:0x0025, B:9:0x002b, B:12:0x0044, B:14:0x004d, B:16:0x0055, B:20:0x0061, B:21:0x0065, B:26:0x0083, B:28:0x0086, B:33:0x009d, B:35:0x00a3, B:30:0x008f, B:32:0x0095, B:24:0x007a), top: B:41:0x0025 }] */
    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int iMax;
        ThreadLocal threadLocal;
        SoftReference softReference;
        int length;
        WritableByteChannel writableByteChannel;
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.hasArray()) {
            outputStream.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset() + i, i2);
            return;
        }
        ByteBuffer byteBufferC = c(i, i2 + i);
        ThreadLocal threadLocal2 = yk.a;
        int iPosition = byteBufferC.position();
        try {
            if (byteBufferC.hasArray()) {
                outputStream.write(byteBufferC.array(), byteBufferC.arrayOffset() + byteBufferC.position(), byteBufferC.remaining());
            } else {
                long j = yk.c;
                byte[] bArr = null;
                if (j < 0 || !yk.b.isInstance(outputStream)) {
                    iMax = Math.max(byteBufferC.remaining(), 1024);
                    threadLocal = yk.a;
                    softReference = (SoftReference) threadLocal.get();
                    if (softReference == null) {
                        bArr = (byte[]) softReference.get();
                    }
                    if (bArr != null || ((length = bArr.length) < iMax && length < iMax * 0.5f)) {
                        bArr = new byte[iMax];
                        if (iMax <= 16384) {
                            threadLocal.set(new SoftReference(bArr));
                        }
                    }
                    while (byteBufferC.hasRemaining()) {
                        int iMin = Math.min(byteBufferC.remaining(), bArr.length);
                        byteBufferC.get(bArr, 0, iMin);
                        outputStream.write(bArr, 0, iMin);
                    }
                } else {
                    try {
                        writableByteChannel = (WritableByteChannel) p03.c.k(j, outputStream);
                    } catch (ClassCastException unused) {
                        writableByteChannel = null;
                    }
                    if (writableByteChannel != null) {
                        writableByteChannel.write(byteBufferC);
                    } else {
                        iMax = Math.max(byteBufferC.remaining(), 1024);
                        threadLocal = yk.a;
                        softReference = (SoftReference) threadLocal.get();
                        if (softReference == null) {
                            bArr = (byte[]) softReference.get();
                        }
                        if (bArr != null) {
                            bArr = new byte[iMax];
                            if (iMax <= 16384) {
                                threadLocal.set(new SoftReference(bArr));
                            }
                        } else {
                            bArr = new byte[iMax];
                            if (iMax <= 16384) {
                                threadLocal.set(new SoftReference(bArr));
                            }
                        }
                        while (byteBufferC.hasRemaining()) {
                            int iMin2 = Math.min(byteBufferC.remaining(), bArr.length);
                            byteBufferC.get(bArr, 0, iMin2);
                            outputStream.write(bArr, 0, iMin2);
                        }
                    }
                }
            }
        } finally {
            byteBufferC.position(iPosition);
        }
    }

    public wq1(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        this.a = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        try {
            return new wq1(c(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            d.l(e2.getMessage());
            return null;
        }
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }
}
