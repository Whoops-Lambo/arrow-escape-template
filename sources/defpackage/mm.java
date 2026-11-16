package defpackage;

import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Internal;
import com.google.protobuf.k2;
import com.google.protobuf.l;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class mm extends l {
    public final byte[] a;

    public int d() {
        return 0;
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        return this.a[i];
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ByteString) && size() == ((ByteString) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof mm)) {
                return obj.equals(this);
            }
            mm mmVar = (mm) obj;
            int iPeekCachedHashCode = peekCachedHashCode();
            int iPeekCachedHashCode2 = mmVar.peekCachedHashCode();
            if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                return a(mmVar, 0, size());
            }
        }
        return false;
    }

    @Override // com.google.protobuf.l, com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
        return this.a[i];
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.a, d(), size());
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.a.length;
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(this.a, d(), size(), charset);
    }

    public mm(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // com.google.protobuf.l
    public final boolean a(l lVar, int i, int i2) {
        if (i2 <= lVar.size()) {
            int i3 = i + i2;
            if (i3 <= lVar.size()) {
                if (lVar instanceof mm) {
                    mm mmVar = (mm) lVar;
                    byte[] bArr = mmVar.a;
                    int iD = d() + i2;
                    int iD2 = d();
                    int iD3 = mmVar.d() + i;
                    while (iD2 < iD) {
                        if (this.a[iD2] != bArr[iD3]) {
                            return false;
                        }
                        iD2++;
                        iD3++;
                    }
                    return true;
                }
                return lVar.substring(i, i3).equals(substring(0, i2));
            }
            m93.g(lVar.size(), jc1.t("Ran off end of other: ", i, ", ", i2, ", "));
            return false;
        }
        y.c(i2, size());
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.a, d(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a, d(), size());
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int iD = d();
        return k2.a.c(iD, size() + iD, this.a);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.a, d(), size(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        return Internal.partialHash(i, this.a, d() + i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        int iD = d() + i2;
        return k2.a.d(i, iD, i3 + iD, this.a);
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        int iCheckRange = ByteString.checkRange(i, i2, size());
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        return new jm(this.a, d() + i, iCheckRange);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) throws IOException {
        byteOutput.writeLazy(this.a, d(), size());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.a, d() + i, i2);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }
}
