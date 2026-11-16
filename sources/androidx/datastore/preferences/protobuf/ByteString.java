package androidx.datastore.preferences.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.d;
import defpackage.jc1;
import defpackage.m93;
import defpackage.nj;
import defpackage.pv1;
import defpackage.wb0;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@CheckReturnValue
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final ByteString b = new LiteralByteString(Internal.b);
    public static final ByteArrayCopier c;
    public int a = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    class AnonymousClass1 extends AbstractByteIterator {
        public int a = 0;
        public final int b;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a < this.b;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            int i = this.a;
            if (i < this.b) {
                this.a = i + 1;
                return ByteString.this.t(i);
            }
            d.v();
            return (byte) 0;
        }

        public AnonymousClass1() {
            this.b = ByteString.this.size();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 implements Comparator<ByteString> {
        @Override // java.util.Comparator
        public final int compare(ByteString byteString, ByteString byteString2) {
            ByteString byteString3 = byteString;
            ByteString byteString4 = byteString2;
            ByteIterator it = byteString3.iterator();
            ByteIterator it2 = byteString4.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(it.nextByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED).compareTo(Integer.valueOf(it2.nextByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(byteString3.size()).compareTo(Integer.valueOf(byteString4.size()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class AbstractByteIterator implements ByteIterator {
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ArraysByteArrayCopier implements ByteArrayCopier {
        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class BoundedByteString extends LiteralByteString {
        public final int e;
        public final int f;

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        public final int I() {
            return this.e;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final byte h(int i) {
            ByteString.i(i, this.f);
            return this.d[this.e + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final void o(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.d, this.e + i, bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public final int size() {
            return this.f;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString.LeafByteString, androidx.datastore.preferences.protobuf.ByteString
        public final byte t(int i) {
            return this.d[this.e + i];
        }

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.k(i, i + i2, bArr.length);
            this.e = i;
            this.f = i2;
        }

        public Object writeReplace() {
            return new LiteralByteString(D());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ByteArrayCopier {
        byte[] copyFrom(byte[] bArr, int i, int i2);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class LeafByteString extends ByteString {
        public abstract boolean H(ByteString byteString, int i, int i2);

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int r() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new AnonymousClass1();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void G(ByteOutput byteOutput) {
            F(byteOutput);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte t(int i) {
            return h(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LiteralByteString extends LeafByteString {
        public final byte[] d;

        public int I() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int i = this.a;
            int i2 = literalByteString.a;
            if (i == 0 || i2 == 0 || i == i2) {
                return H(literalByteString, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String E(Charset charset) {
            return new String(this.d, I(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte h(int i) {
            return this.d[i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void o(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.d, i, bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.d.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte t(int i) {
            return this.d[i];
        }

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.d = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int A(int i, int i2, int i3) {
            int I = I() + i2;
            Charset charset = Internal.a;
            for (int i4 = I; i4 < I + i3; i4++) {
                i = (i * 31) + this.d[i4];
            }
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int B(int i, int i2, int i3) {
            int I = I() + i2;
            return Utf8.a.f(i, I, i3 + I, this.d);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString C(int i, int i2) {
            int iK = ByteString.k(i, i2, size());
            if (iK == 0) {
                return ByteString.b;
            }
            return new BoundedByteString(this.d, I() + i, iK);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void F(ByteOutput byteOutput) {
            byteOutput.R(this.d, I(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public final boolean H(ByteString byteString, int i, int i2) {
            if (i2 <= byteString.size()) {
                int i3 = i + i2;
                if (i3 <= byteString.size()) {
                    if (byteString instanceof LiteralByteString) {
                        LiteralByteString literalByteString = (LiteralByteString) byteString;
                        byte[] bArr = literalByteString.d;
                        int I = I() + i2;
                        int I2 = I();
                        int I3 = literalByteString.I() + i;
                        while (I2 < I) {
                            if (this.d[I2] != bArr[I3]) {
                                return false;
                            }
                            I2++;
                            I3++;
                        }
                        return true;
                    }
                    return byteString.C(i, i3).equals(C(0, i2));
                }
                m93.g(byteString.size(), jc1.t("Ran off end of other: ", i, ", ", i2, ", "));
                return false;
            }
            y.c(i2, size());
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer d() {
            return ByteBuffer.wrap(this.d, I(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean x() {
            int I = I();
            return Utf8.a.e(I, size() + I, this.d);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final CodedInputStream z() {
            return CodedInputStream.g(this.d, I(), size(), true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class NioByteString extends LeafByteString {
        public final ByteBuffer d;

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int A(int i, int i2, int i3) {
            for (int i4 = i2; i4 < i2 + i3; i4++) {
                i = (i * 31) + this.d.get(i4);
            }
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int B(int i, int i2, int i3) {
            return Utf8.a.g(this.d, i, i2, i3 + i2);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public final boolean H(ByteString byteString, int i, int i2) {
            return C(0, i2).equals(byteString.C(i, i2 + i));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString)) {
                return false;
            }
            ByteString byteString = (ByteString) obj;
            ByteBuffer byteBuffer = this.d;
            if (byteBuffer.remaining() != byteString.size()) {
                return false;
            }
            if (byteBuffer.remaining() == 0) {
                return true;
            }
            if (obj instanceof NioByteString) {
                return byteBuffer.equals(((NioByteString) obj).d);
            }
            return obj instanceof RopeByteString ? obj.equals(this) : byteBuffer.equals(byteString.d());
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ByteString$NioByteString$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        /* JADX INFO: loaded from: classes7.dex */
        class AnonymousClass1 extends InputStream {
            @Override // java.io.InputStream
            public final int available() {
                throw null;
            }

            @Override // java.io.InputStream
            public final void mark(int i) {
                throw null;
            }

            @Override // java.io.InputStream
            public final boolean markSupported() {
                return true;
            }

            @Override // java.io.InputStream
            public final int read() {
                throw null;
            }

            @Override // java.io.InputStream
            public final void reset() {
                throw null;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) {
                throw null;
            }
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
        }

        private Object writeReplace() {
            ByteBuffer byteBufferSlice = this.d.slice();
            int iRemaining = byteBufferSlice.remaining();
            ByteString.k(0, iRemaining, byteBufferSlice.remaining());
            byte[] bArr = new byte[iRemaining];
            byteBufferSlice.get(bArr);
            return new LiteralByteString(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String E(Charset charset) {
            byte[] bArrD;
            int length;
            int iPosition;
            ByteBuffer byteBuffer = this.d;
            if (byteBuffer.hasArray()) {
                bArrD = byteBuffer.array();
                iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
                length = byteBuffer.remaining();
            } else {
                bArrD = D();
                length = bArrD.length;
                iPosition = 0;
            }
            return new String(bArrD, iPosition, length, charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void F(ByteOutput byteOutput) {
            byteOutput.Q(this.d.slice());
        }

        public final ByteBuffer I(int i, int i2) {
            ByteBuffer byteBuffer = this.d;
            if (i < byteBuffer.position() || i2 > byteBuffer.limit() || i > i2) {
                wb0.g("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.position(i - byteBuffer.position());
            byteBufferSlice.limit(i2 - byteBuffer.position());
            return byteBufferSlice;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer d() {
            return this.d.asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final byte h(int i) {
            try {
                return this.d.get(i);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            } catch (IndexOutOfBoundsException e2) {
                d.l(e2.getMessage());
                return (byte) 0;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void o(byte[] bArr, int i, int i2, int i3) {
            ByteBuffer byteBufferSlice = this.d.slice();
            byteBufferSlice.position(i);
            byteBufferSlice.get(bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int size() {
            return this.d.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean x() {
            Utf8.Processor processor = Utf8.a;
            ByteBuffer byteBuffer = this.d;
            return processor.g(byteBuffer, 0, byteBuffer.position(), byteBuffer.remaining()) == 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final CodedInputStream z() {
            ByteBuffer byteBuffer = this.d;
            if (byteBuffer.hasArray()) {
                return CodedInputStream.g(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), true);
            }
            if (byteBuffer.isDirect() && UnsafeUtil.d) {
                return new CodedInputStream.UnsafeDirectNioDecoder(byteBuffer);
            }
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            return CodedInputStream.g(bArr, 0, iRemaining, true);
        }

        public NioByteString(ByteBuffer byteBuffer) {
            Charset charset = Internal.a;
            this.d = byteBuffer.slice().order(ByteOrder.nativeOrder());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString C(int i, int i2) {
            try {
                return new NioByteString(I(i, i2));
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            } catch (IndexOutOfBoundsException e2) {
                d.l(e2.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Output extends OutputStream {
        @Override // java.io.OutputStream
        public final synchronized void write(int i) {
            throw null;
        }

        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, 0);
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i, int i2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    public abstract int A(int i, int i2, int i3);

    public abstract int B(int i, int i2, int i3);

    public abstract ByteString C(int i, int i2);

    public abstract String E(Charset charset);

    public abstract void F(ByteOutput byteOutput);

    public abstract void G(ByteOutput byteOutput);

    public abstract ByteBuffer d();

    public abstract boolean equals(Object obj);

    public abstract byte h(int i);

    public abstract void o(byte[] bArr, int i, int i2, int i3);

    public abstract int r();

    public abstract int size();

    public abstract byte t(int i);

    public abstract boolean x();

    public abstract CodedInputStream z();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class CodedBuilder {
        public final CodedOutputStream a;
        public final byte[] b;

        public CodedBuilder(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            Logger logger = CodedOutputStream.b;
            this.a = new CodedOutputStream.ArrayEncoder(bArr, i);
        }
    }

    static {
        c = Android.a() ? new SystemByteArrayCopier() : new ArraysByteArrayCopier();
    }

    public static void i(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                d.l(pv1.k(i, "Index < 0: "));
            } else {
                d.l(nj.i(i, i2, "Index > length: ", ", "));
            }
        }
    }

    public static int k(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            y.p(jc1.k(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            y.p(nj.i(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        y.p(nj.i(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static ByteString n(int i, int i2, byte[] bArr) {
        k(i, i + i2, bArr.length);
        return new LiteralByteString(c.copyFrom(bArr, i, i2));
    }

    public final int hashCode() {
        int iA = this.a;
        if (iA == 0) {
            int size = size();
            iA = A(size, 0, size);
            if (iA == 0) {
                iA = 1;
            }
            this.a = iA;
        }
        return iA;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return nj.q(nj.s("<ByteString@", size(), hexString, " size=", " contents=\""), size() <= 50 ? TextFormatEscaper.a(this) : TextFormatEscaper.a(C(0, 47)).concat("..."), "\">");
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public ByteIterator iterator() {
        return new AnonymousClass1();
    }

    public final byte[] D() {
        int size = size();
        if (size == 0) {
            return Internal.b;
        }
        byte[] bArr = new byte[size];
        o(bArr, 0, 0, size);
        return bArr;
    }
}
