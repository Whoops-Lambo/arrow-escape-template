package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.d;
import defpackage.dr0;
import defpackage.jc1;
import defpackage.nj;
import defpackage.pv1;
import io.p071bidmachine.media3.extractor.ts.y;
import io.p071bidmachine.protobuf.EventTypeExtended;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ExifInterface {
    public static final String[] E;
    public static final int[] F;
    public static final byte[] G;
    public static final ExifTag H;
    public static final ExifTag[][] I;
    public static final ExifTag[] J;
    public static final HashMap[] K;
    public static final HashMap[] L;
    public static final HashSet M;
    public static final HashMap N;
    public static final Charset O;
    public static final byte[] P;
    public static final byte[] Q;
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final HashMap[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public static final boolean m = Log.isLoggable("ExifInterface", 3);
    public static final List n = Arrays.asList(1, 6, 3, 8);
    public static final List o = Arrays.asList(2, 7, 4, 5);
    public static final int[] p = {8, 8, 8};
    public static final int[] q = {8};
    public static final byte[] r = {-1, -40, -1};
    public static final byte[] s = {102, 116, 121, 112};
    public static final byte[] t = {109, 105, 102, 49};
    public static final byte[] u = {104, 101, 105, 99};
    public static final byte[] v = {79, 76, 89, 77, 80, 0};
    public static final byte[] w = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] x = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] y = {101, 88, 73, 102};
    public static final byte[] z = {73, 72, 68, 82};
    public static final byte[] A = {73, 69, 78, 68};
    public static final byte[] B = {82, 73, 70, 70};
    public static final byte[] C = {87, 69, 66, 80};
    public static final byte[] D = {69, 88, 73, 70};

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ByteOrderedDataInputStream extends InputStream implements DataInput {
        public static final ByteOrder e = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder f = ByteOrder.BIG_ENDIAN;
        public final DataInputStream a;
        public ByteOrder b;
        public int c;
        public byte[] d;

        public final void b(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                DataInputStream dataInputStream = this.a;
                int iSkip = (int) dataInputStream.skip(i3);
                if (iSkip <= 0) {
                    if (this.d == null) {
                        this.d = new byte[8192];
                    }
                    iSkip = dataInputStream.read(this.d, 0, Math.min(8192, i3));
                    if (iSkip == -1) {
                        throw new EOFException(jc1.k(i, "Reached EOF while skipping ", " bytes."));
                    }
                }
                i2 += iSkip;
            }
            this.c += i2;
        }

        public ByteOrderedDataInputStream(InputStream inputStream, int i) {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this.b = byteOrder;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.a = dataInputStream;
            dataInputStream.mark(0);
            this.c = 0;
            this.b = byteOrder;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.a.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() {
            this.c++;
            return this.a.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.c++;
            return this.a.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.c++;
            int i = this.a.read();
            if (i >= 0) {
                return (byte) i;
            }
            d.s();
            return (byte) 0;
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.c += 2;
            return this.a.readChar();
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.c += bArr.length;
            this.a.readFully(bArr);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.c += 4;
            DataInputStream dataInputStream = this.a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            if ((i | i2 | i3 | i4) < 0) {
                d.s();
                return 0;
            }
            ByteOrder byteOrder = this.b;
            if (byteOrder == e) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == f) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            y.i(this.b, "Invalid byte order: ");
            return 0;
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            this.c += 8;
            DataInputStream dataInputStream = this.a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            int i5 = dataInputStream.read();
            int i6 = dataInputStream.read();
            int i7 = dataInputStream.read();
            int i8 = dataInputStream.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                d.s();
                return 0L;
            }
            ByteOrder byteOrder = this.b;
            if (byteOrder == e) {
                return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
            }
            if (byteOrder == f) {
                return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
            }
            y.i(this.b, "Invalid byte order: ");
            return 0L;
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.c += 2;
            DataInputStream dataInputStream = this.a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            if ((i | i2) < 0) {
                d.s();
                return (short) 0;
            }
            ByteOrder byteOrder = this.b;
            if (byteOrder == e) {
                return (short) ((i2 << 8) + i);
            }
            if (byteOrder == f) {
                return (short) ((i << 8) + i2);
            }
            y.i(this.b, "Invalid byte order: ");
            return (short) 0;
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.c += 2;
            return this.a.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.c++;
            return this.a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.c += 2;
            DataInputStream dataInputStream = this.a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            if ((i | i2) < 0) {
                d.s();
                return 0;
            }
            ByteOrder byteOrder = this.b;
            if (byteOrder == e) {
                return (i2 << 8) + i;
            }
            if (byteOrder == f) {
                return (i << 8) + i2;
            }
            y.i(this.b, "Invalid byte order: ");
            return 0;
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.c += i2;
            this.a.readFully(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.a.read(bArr, i, i2);
            this.c += i3;
            return i3;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ByteOrderedDataInputStream(InputStream inputStream) {
            this(inputStream, 0);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        }

        public ByteOrderedDataInputStream(byte[] bArr) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this(byteArrayInputStream, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ExifAttribute {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;

        public static ExifAttribute a(long j, ByteOrder byteOrder) {
            long[] jArr = {j};
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.F[4]]);
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.putInt((int) jArr[0]);
            return new ExifAttribute(4, 1, byteBufferWrap.array());
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
        /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
        /* JADX WARN: Type inference failed for: r13v16, types: [androidx.exifinterface.media.ExifInterface$Rational[]] */
        /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v19, types: [androidx.exifinterface.media.ExifInterface$Rational[]] */
        /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
        /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
        public final Serializable g(ByteOrder byteOrder) throws Throwable {
            ByteOrderedDataInputStream byteOrderedDataInputStream;
            InputStream inputStream;
            String str;
            byte b;
            ?? r13;
            byte[] bArr = this.d;
            InputStream inputStream2 = null;
            try {
                try {
                    byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr);
                    try {
                        byteOrderedDataInputStream.b = byteOrder;
                        int i = this.a;
                        int length = 0;
                        int i2 = this.b;
                        switch (i) {
                            case 1:
                            case 6:
                                if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                    str = new String(bArr, ExifInterface.O);
                                    try {
                                        byteOrderedDataInputStream.close();
                                        return str;
                                    } catch (IOException e) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b + 48)});
                                try {
                                    byteOrderedDataInputStream.close();
                                    return str2;
                                } catch (IOException e2) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (i2 >= ExifInterface.G.length) {
                                    int i3 = 0;
                                    while (true) {
                                        byte[] bArr2 = ExifInterface.G;
                                        if (i3 >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (bArr[i3] == bArr2[i3]) {
                                            i3++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (length < i2) {
                                    byte b2 = bArr[length];
                                    if (b2 == 0) {
                                        str = sb.toString();
                                        byteOrderedDataInputStream.close();
                                        return str;
                                    }
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                str = sb.toString();
                                byteOrderedDataInputStream.close();
                                return str;
                            case 3:
                                r13 = new int[i2];
                                while (length < i2) {
                                    r13[length] = byteOrderedDataInputStream.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    byteOrderedDataInputStream.close();
                                    return r13;
                                } catch (IOException e3) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                    return r13;
                                }
                            case 4:
                                r13 = new long[i2];
                                while (length < i2) {
                                    r13[length] = ((long) byteOrderedDataInputStream.readInt()) & 4294967295L;
                                    length++;
                                }
                                byteOrderedDataInputStream.close();
                                return r13;
                            case 5:
                                r13 = new Rational[i2];
                                while (length < i2) {
                                    r13[length] = new Rational(((long) byteOrderedDataInputStream.readInt()) & 4294967295L, ((long) byteOrderedDataInputStream.readInt()) & 4294967295L);
                                    length++;
                                }
                                byteOrderedDataInputStream.close();
                                return r13;
                            case 8:
                                r13 = new int[i2];
                                while (length < i2) {
                                    r13[length] = byteOrderedDataInputStream.readShort();
                                    length++;
                                }
                                byteOrderedDataInputStream.close();
                                return r13;
                            case 9:
                                r13 = new int[i2];
                                while (length < i2) {
                                    r13[length] = byteOrderedDataInputStream.readInt();
                                    length++;
                                }
                                byteOrderedDataInputStream.close();
                                return r13;
                            case 10:
                                r13 = new Rational[i2];
                                while (length < i2) {
                                    r13[length] = new Rational(byteOrderedDataInputStream.readInt(), byteOrderedDataInputStream.readInt());
                                    length++;
                                }
                                byteOrderedDataInputStream.close();
                                return r13;
                            case 11:
                                r13 = new double[i2];
                                while (length < i2) {
                                    r13[length] = byteOrderedDataInputStream.readFloat();
                                    length++;
                                }
                                byteOrderedDataInputStream.close();
                                return r13;
                            case 12:
                                r13 = new double[i2];
                                while (length < i2) {
                                    r13[length] = byteOrderedDataInputStream.readDouble();
                                    length++;
                                }
                                byteOrderedDataInputStream.close();
                                return r13;
                            default:
                                try {
                                    byteOrderedDataInputStream.close();
                                    return null;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                    return null;
                                }
                        }
                    } catch (IOException e5) {
                        e = e5;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (byteOrderedDataInputStream != null) {
                            try {
                                byteOrderedDataInputStream.close();
                            } catch (IOException e6) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                            }
                        }
                        return null;
                    }
                } catch (IOException e7) {
                    e = e7;
                    byteOrderedDataInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e8) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(ExifInterface.E[this.a]);
            sb.append(", data length:");
            return nj.l(this.d.length, ")", sb);
        }

        public ExifAttribute(long j, byte[] bArr, int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = j;
            this.d = bArr;
        }

        public static ExifAttribute b(Rational rational, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.F[5]]);
            byteBufferWrap.order(byteOrder);
            Rational rational2 = new Rational[]{rational}[0];
            byteBufferWrap.putInt((int) rational2.a);
            byteBufferWrap.putInt((int) rational2.b);
            return new ExifAttribute(5, 1, byteBufferWrap.array());
        }

        public static ExifAttribute c(int i, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifInterface.F[3]]);
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.putShort((short) new int[]{i}[0]);
            return new ExifAttribute(3, 1, byteBufferWrap.array());
        }

        public final double d(ByteOrder byteOrder) throws Throwable {
            Object objG = g(byteOrder);
            if (objG != null) {
                if (objG instanceof String) {
                    return Double.parseDouble((String) objG);
                }
                if (objG instanceof long[]) {
                    long[] jArr = (long[]) objG;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (objG instanceof int[]) {
                    int[] iArr = (int[]) objG;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (objG instanceof double[]) {
                    double[] dArr = (double[]) objG;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (objG instanceof Rational[]) {
                    Rational[] rationalArr = (Rational[]) objG;
                    if (rationalArr.length == 1) {
                        Rational rational = rationalArr[0];
                        return rational.a / rational.b;
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a double value");
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public final int e(ByteOrder byteOrder) throws Throwable {
            Object objG = g(byteOrder);
            if (objG != null) {
                if (objG instanceof String) {
                    return Integer.parseInt((String) objG);
                }
                if (objG instanceof long[]) {
                    long[] jArr = (long[]) objG;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                if (objG instanceof int[]) {
                    int[] iArr = (int[]) objG;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                }
                throw new NumberFormatException("Couldn't find a integer value");
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public final String f(ByteOrder byteOrder) throws Throwable {
            Object objG = g(byteOrder);
            if (objG != null) {
                if (objG instanceof String) {
                    return (String) objG;
                }
                StringBuilder sb = new StringBuilder();
                int i = 0;
                if (objG instanceof long[]) {
                    long[] jArr = (long[]) objG;
                    while (i < jArr.length) {
                        sb.append(jArr[i]);
                        i++;
                        if (i != jArr.length) {
                            sb.append(",");
                        }
                    }
                    return sb.toString();
                }
                if (objG instanceof int[]) {
                    int[] iArr = (int[]) objG;
                    while (i < iArr.length) {
                        sb.append(iArr[i]);
                        i++;
                        if (i != iArr.length) {
                            sb.append(",");
                        }
                    }
                    return sb.toString();
                }
                if (objG instanceof double[]) {
                    double[] dArr = (double[]) objG;
                    while (i < dArr.length) {
                        sb.append(dArr[i]);
                        i++;
                        if (i != dArr.length) {
                            sb.append(",");
                        }
                    }
                    return sb.toString();
                }
                if (objG instanceof Rational[]) {
                    Rational[] rationalArr = (Rational[]) objG;
                    while (i < rationalArr.length) {
                        sb.append(rationalArr[i].a);
                        sb.append('/');
                        sb.append(rationalArr[i].b);
                        i++;
                        if (i != rationalArr.length) {
                            sb.append(",");
                        }
                    }
                    return sb.toString();
                }
                return null;
            }
            return null;
        }

        public ExifAttribute(int i, int i2, byte[] bArr) {
            this(-1L, bArr, i, i2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ExifStreamType {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface IfdType {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Rational {
        public final long a;
        public final long b;

        public final String toString() {
            return this.a + "/" + this.b;
        }

        public Rational(long j, long j2) {
            if (j2 == 0) {
                this.a = 0L;
                this.b = 1L;
            } else {
                this.a = j;
                this.b = j2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SeekableByteOrderedDataInputStream extends ByteOrderedDataInputStream {
        public final void f(long j) throws IOException {
            int i = this.c;
            if (i > j) {
                this.c = 0;
                this.a.reset();
            } else {
                j -= (long) i;
            }
            b((int) j);
        }

        public SeekableByteOrderedDataInputStream(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.a.mark(Integer.MAX_VALUE);
            } else {
                d.r("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
                throw null;
            }
        }

        public SeekableByteOrderedDataInputStream(byte[] bArr) {
            super(bArr);
            this.a.mark(Integer.MAX_VALUE);
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        ExifTag[] exifTagArr = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", 255, 4), new ExifTag("ImageWidth", 256, 3, 4), new ExifTag("ImageLength", 257, 3, 4), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag("StripOffsets", 273, 3, 4), new ExifTag("Orientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag("RowsPerStrip", 278, 3, 4), new ExifTag("StripByteCounts", 279, 3, 4), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", l.g, 3), new ExifTag("TransferFunction", Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 3), new ExifTag("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new ExifTag("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new ExifTag("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", EventTypeExtended.EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE, 4), new ExifTag("JPEGInterchangeFormatLength", EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("SensorTopBorder", 4, 4), new ExifTag("SensorLeftBorder", 5, 4), new ExifTag("SensorBottomBorder", 6, 4), new ExifTag("SensorRightBorder", 7, 4), new ExifTag("ISO", 23, 3), new ExifTag("JpgFromRaw", 46, 7), new ExifTag("Xmp", 700, 1)};
        ExifTag[] exifTagArr2 = {new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("SpectralSensitivity", 34852, 2), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("OECF", 34856, 7), new ExifTag("SensitivityType", 34864, 3), new ExifTag("StandardOutputSensitivity", 34865, 4), new ExifTag("RecommendedExposureIndex", 34866, 4), new ExifTag("ISOSpeed", 34867, 4), new ExifTag("ISOSpeedLatitudeyyy", 34868, 4), new ExifTag("ISOSpeedLatitudezzz", 34869, 4), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("OffsetTime", 36880, 2), new ExifTag("OffsetTimeOriginal", 36881, 2), new ExifTag("OffsetTimeDigitized", 36882, 2), new ExifTag("ComponentsConfiguration", 37121, 7), new ExifTag("CompressedBitsPerPixel", 37122, 5), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("SubjectDistance", 37382, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), new ExifTag("FocalLength", 37386, 5), new ExifTag("SubjectArea", 37396, 3), new ExifTag("MakerNote", 37500, 7), new ExifTag("UserComment", 37510, 7), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag("PixelXDimension", 40962, 3, 4), new ExifTag("PixelYDimension", 40963, 3, 4), new ExifTag("RelatedSoundFile", 40964, 2), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FlashEnergy", 41483, 5), new ExifTag("SpatialFrequencyResponse", 41484, 7), new ExifTag("FocalPlaneXResolution", 41486, 5), new ExifTag("FocalPlaneYResolution", 41487, 5), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SubjectLocation", 41492, 3), new ExifTag("ExposureIndex", 41493, 5), new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CFAPattern", 41730, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("DigitalZoomRatio", 41988, 5), new ExifTag("FocalLengthIn35mmFilm", 41989, 3), new ExifTag("SceneCaptureType", 41990, 3), new ExifTag("GainControl", 41991, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3), new ExifTag("DeviceSettingDescription", 41995, 7), new ExifTag("SubjectDistanceRange", 41996, 3), new ExifTag("ImageUniqueID", 42016, 2), new ExifTag("CameraOwnerName", 42032, 2), new ExifTag("BodySerialNumber", 42033, 2), new ExifTag("LensSpecification", 42034, 5), new ExifTag("LensMake", 42035, 2), new ExifTag("LensModel", 42036, 2), new ExifTag("Gamma", 42240, 5), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)};
        ExifTag[] exifTagArr3 = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag("GPSLatitude", 2, 5, 10), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag("GPSLongitude", 4, 5, 10), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSatellites", 8, 2), new ExifTag("GPSStatus", 9, 2), new ExifTag("GPSMeasureMode", 10, 2), new ExifTag("GPSDOP", 11, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSSpeed", 13, 5), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSTrack", 15, 5), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSImgDirection", 17, 5), new ExifTag("GPSMapDatum", 18, 2), new ExifTag("GPSDestLatitudeRef", 19, 2), new ExifTag("GPSDestLatitude", 20, 5), new ExifTag("GPSDestLongitudeRef", 21, 2), new ExifTag("GPSDestLongitude", 22, 5), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestBearing", 24, 5), new ExifTag("GPSDestDistanceRef", 25, 2), new ExifTag("GPSDestDistance", 26, 5), new ExifTag("GPSProcessingMethod", 27, 7), new ExifTag("GPSAreaInformation", 28, 7), new ExifTag("GPSDateStamp", 29, 2), new ExifTag("GPSDifferential", 30, 3), new ExifTag("GPSHPositioningError", 31, 5)};
        ExifTag[] exifTagArr4 = {new ExifTag("InteroperabilityIndex", 1, 2)};
        ExifTag[] exifTagArr5 = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", 255, 4), new ExifTag("ThumbnailImageWidth", 256, 3, 4), new ExifTag("ThumbnailImageLength", 257, 3, 4), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag("StripOffsets", 273, 3, 4), new ExifTag("ThumbnailOrientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag("RowsPerStrip", 278, 3, 4), new ExifTag("StripByteCounts", 279, 3, 4), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", l.g, 3), new ExifTag("TransferFunction", Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 3), new ExifTag("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new ExifTag("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new ExifTag("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", EventTypeExtended.EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE, 4), new ExifTag("JPEGInterchangeFormatLength", EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)};
        H = new ExifTag("StripOffsets", 273, 3);
        I = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4, exifTagArr5, exifTagArr, new ExifTag[]{new ExifTag("ThumbnailImage", 256, 7), new ExifTag("CameraSettingsIFDPointer", 8224, 4), new ExifTag("ImageProcessingIFDPointer", 8256, 4)}, new ExifTag[]{new ExifTag("PreviewImageStart", 257, 4), new ExifTag("PreviewImageLength", 258, 4)}, new ExifTag[]{new ExifTag("AspectFrame", 4371, 3)}, new ExifTag[]{new ExifTag("ColorSpace", 55, 3)}};
        J = new ExifTag[]{new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("CameraSettingsIFDPointer", 8224, 1), new ExifTag("ImageProcessingIFDPointer", 8256, 1)};
        K = new HashMap[10];
        L = new HashMap[10];
        M = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        N = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        O = charsetForName;
        P = "Exif\u0000\u0000".getBytes(charsetForName);
        Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            ExifTag[][] exifTagArr6 = I;
            if (i >= exifTagArr6.length) {
                HashMap map = N;
                ExifTag[] exifTagArr7 = J;
                map.put(Integer.valueOf(exifTagArr7[0].a), 5);
                map.put(Integer.valueOf(exifTagArr7[1].a), 1);
                map.put(Integer.valueOf(exifTagArr7[2].a), 2);
                map.put(Integer.valueOf(exifTagArr7[3].a), 3);
                map.put(Integer.valueOf(exifTagArr7[4].a), 7);
                map.put(Integer.valueOf(exifTagArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            K[i] = new HashMap();
            L[i] = new HashMap();
            for (ExifTag exifTag : exifTagArr6[i]) {
                K[i].put(Integer.valueOf(exifTag.a), exifTag);
                L[i].put(exifTag.b, exifTag);
            }
            i++;
        }
    }

    public final void A() throws Throwable {
        y(0, 5);
        y(0, 4);
        y(5, 4);
        HashMap[] mapArr = this.e;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[1].get("PixelXDimension");
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[1].get("PixelYDimension");
        if (exifAttribute != null && exifAttribute2 != null) {
            mapArr[0].put("ImageWidth", exifAttribute);
            mapArr[0].put("ImageLength", exifAttribute2);
        }
        if (mapArr[4].isEmpty() && p(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!p(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        w(0, "ThumbnailOrientation", "Orientation");
        w(0, "ThumbnailImageLength", "ImageLength");
        w(0, "ThumbnailImageWidth", "ImageWidth");
        w(5, "ThumbnailOrientation", "Orientation");
        w(5, "ThumbnailImageLength", "ImageLength");
        w(5, "ThumbnailImageWidth", "ImageWidth");
        w(4, "Orientation", "ThumbnailOrientation");
        w(4, "ImageLength", "ThumbnailImageLength");
        w(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void s() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.e;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbS = jc1.s(i, "The size of tag group[", "]: ");
            sbS.append(mapArr[i].size());
            Log.d("ExifInterface", sbS.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                ExifAttribute exifAttribute = (ExifAttribute) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + exifAttribute.toString() + ", tagValue: '" + exifAttribute.f(this.g) + "'");
            }
            i++;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ByteOrderedDataOutputStream extends FilterOutputStream {
        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ExifTag {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public ExifTag(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        public ExifTag(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.e;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(O);
            map.put("DateTime", new ExifAttribute(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", ExifAttribute.a(0L, this.g));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", ExifAttribute.a(0L, this.g));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", ExifAttribute.a(0L, this.g));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", ExifAttribute.a(0L, this.g));
        }
    }

    public final int c() {
        ExifAttribute exifAttributeD = d("Orientation");
        if (exifAttributeD == null) {
            return 1;
        }
        try {
            return exifAttributeD.e(this.g);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final ExifAttribute d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < I.length; i++) {
            ExifAttribute exifAttribute = (ExifAttribute) this.e[i].get(str);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    public final void e(final SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            d.u("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                ExifInterfaceUtils.Api23Impl.a(mediaMetadataRetriever, new MediaDataSource() { // from class: androidx.exifinterface.media.ExifInterface.1
                    public long a;

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                    }

                    @Override // android.media.MediaDataSource
                    public final long getSize() {
                        return -1L;
                    }

                    @Override // android.media.MediaDataSource
                    public final int readAt(long j, byte[] bArr, int i2, int i3) {
                        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = seekableByteOrderedDataInputStream;
                        DataInputStream dataInputStream = seekableByteOrderedDataInputStream2.a;
                        if (i3 == 0) {
                            return 0;
                        }
                        if (j >= 0) {
                            try {
                                long j2 = this.a;
                                if (j2 != j) {
                                    if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                                        seekableByteOrderedDataInputStream2.f(j);
                                        this.a = j;
                                    }
                                }
                                if (i3 > dataInputStream.available()) {
                                    i3 = dataInputStream.available();
                                }
                                int i4 = seekableByteOrderedDataInputStream2.read(bArr, i2, i3);
                                if (i4 >= 0) {
                                    this.a += (long) i4;
                                    return i4;
                                }
                            } catch (IOException unused) {
                            }
                            this.a = -1L;
                            return -1;
                        }
                        return -1;
                    }
                });
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", ExifAttribute.c(Integer.parseInt(strExtractMetadata), this.g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", ExifAttribute.c(Integer.parseInt(strExtractMetadata2), this.g));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    mapArr[0].put("Orientation", ExifAttribute.c(i, this.g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    seekableByteOrderedDataInputStream.f(i3);
                    byte[] bArr = new byte[6];
                    if (seekableByteOrderedDataInputStream.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, P)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (seekableByteOrderedDataInputStream.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.i = i5;
                    u(0, bArr2);
                }
                if (m) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x013d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144 A[LOOP:2: B:69:0x013a->B:74:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0156  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void f(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.f(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:114:0x014a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0153 A[LOOP:2: B:112:0x0145->B:117:0x0153, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x0159 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:122:0x015c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0163  */
    /* JADX WARN: Code duplicated, block: B:128:0x016c A[LOOP:3: B:123:0x015e->B:128:0x016c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x0176  */
    /* JADX WARN: Code duplicated, block: B:135:0x0180 A[LOOP:4: B:130:0x0171->B:135:0x0180, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x0185 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x0188 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:141:0x018b  */
    /* JADX WARN: Code duplicated, block: B:157:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0169 A[EDGE_INSN: B:171:0x0169->B:127:0x0169 BREAK  A[LOOP:3: B:123:0x015e->B:128:0x016c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0183 A[EDGE_INSN: B:172:0x0183->B:136:0x0183 BREAK  A[LOOP:4: B:130:0x0171->B:135:0x0180], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0169 A[EDGE_INSN: B:173:0x0169->B:127:0x0169 BREAK  A[LOOP:3: B:123:0x015e->B:128:0x016c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ca A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:14:0x0039, B:19:0x005a, B:30:0x0076, B:33:0x007c, B:34:0x0082, B:38:0x008c, B:44:0x009b, B:47:0x00a5, B:62:0x00c6, B:64:0x00ca), top: B:150:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    /* JADX WARN: Code duplicated, block: B:96:0x0125  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    public final int g(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        ByteOrderedDataInputStream byteOrderedDataInputStream;
        ByteOrderedDataInputStream byteOrderedDataInputStream2;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        int i6;
        byte[] bArr2;
        int i7;
        byte[] bArr3;
        ByteOrderedDataInputStream byteOrderedDataInputStream3;
        short s2;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i8 = 0;
        while (true) {
            byte[] bArr5 = r;
            if (i8 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i8] != bArr5[i8]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i9 = 0; i9 < bytes.length; i9++) {
                    byte b = bArr4[i9];
                    ?? r7 = bytes[i9];
                    if (b != r7) {
                        ?? r4 = 0;
                        ByteOrderedDataInputStream byteOrderedDataInputStream4 = null;
                        ByteOrderedDataInputStream byteOrderedDataInputStream5 = null;
                        ByteOrderedDataInputStream byteOrderedDataInputStream6 = null;
                        int i10 = 1;
                        try {
                            try {
                                byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr4);
                                try {
                                    try {
                                        try {
                                            long j2 = byteOrderedDataInputStream.readInt();
                                            byte[] bArr6 = new byte[4];
                                            byteOrderedDataInputStream.read(bArr6);
                                            if (Arrays.equals(bArr6, s)) {
                                                if (j2 == 1) {
                                                    j2 = byteOrderedDataInputStream.readLong();
                                                    j = 16;
                                                    if (j2 < 16) {
                                                    }
                                                } else {
                                                    j = 8;
                                                }
                                                if (j2 > 5000) {
                                                    j2 = 5000;
                                                }
                                                long j3 = j2 - j;
                                                if (j3 >= 8) {
                                                    byte[] bArr7 = new byte[4];
                                                    long j4 = 0;
                                                    boolean z2 = false;
                                                    boolean z3 = false;
                                                    while (true) {
                                                        if (j4 >= j3 / 4) {
                                                            i = 0;
                                                            break;
                                                        }
                                                        i = 0;
                                                        try {
                                                            if (byteOrderedDataInputStream.read(bArr7) != 4) {
                                                                break;
                                                            }
                                                            if (j4 != 1) {
                                                                if (Arrays.equals(bArr7, t)) {
                                                                    z2 = true;
                                                                } else if (Arrays.equals(bArr7, u)) {
                                                                    z3 = true;
                                                                }
                                                                if (z2 && z3) {
                                                                    byteOrderedDataInputStream.close();
                                                                    return 12;
                                                                }
                                                            }
                                                            j4++;
                                                        } catch (Exception e) {
                                                            e = e;
                                                            if (m) {
                                                                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                            }
                                                            if (byteOrderedDataInputStream != null) {
                                                                break;
                                                            }
                                                            byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr4);
                                                            ByteOrder byteOrderT = t(byteOrderedDataInputStream2);
                                                            this.g = byteOrderT;
                                                            byteOrderedDataInputStream2.b = byteOrderT;
                                                            s2 = byteOrderedDataInputStream2.readShort();
                                                            if (s2 != 20306) {
                                                                i2 = 1;
                                                            } else {
                                                                i2 = 1;
                                                            }
                                                            byteOrderedDataInputStream2.close();
                                                            if (i2 != 0) {
                                                                return 7;
                                                            }
                                                            try {
                                                                byteOrderedDataInputStream3 = new ByteOrderedDataInputStream(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderT2 = t(byteOrderedDataInputStream3);
                                                                    this.g = byteOrderT2;
                                                                    byteOrderedDataInputStream3.b = byteOrderT2;
                                                                    if (byteOrderedDataInputStream3.readShort() == 85) {
                                                                        i3 = 1;
                                                                    } else {
                                                                        i3 = i;
                                                                    }
                                                                    byteOrderedDataInputStream3.close();
                                                                } catch (Exception unused) {
                                                                    byteOrderedDataInputStream4 = byteOrderedDataInputStream3;
                                                                    if (byteOrderedDataInputStream4 != null) {
                                                                        byteOrderedDataInputStream4.close();
                                                                    }
                                                                    i3 = i;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    byteOrderedDataInputStream5 = byteOrderedDataInputStream3;
                                                                    if (byteOrderedDataInputStream5 != null) {
                                                                        byteOrderedDataInputStream5.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused2) {
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                            }
                                                            if (i3 != 0) {
                                                                return 10;
                                                            }
                                                            i4 = i;
                                                            while (true) {
                                                                bArr = x;
                                                                if (i4 < bArr.length) {
                                                                    i5 = 1;
                                                                    break;
                                                                }
                                                                if (bArr4[i4] != bArr[i4]) {
                                                                    i5 = i;
                                                                    break;
                                                                }
                                                                i4++;
                                                            }
                                                            if (i5 != 0) {
                                                                return 13;
                                                            }
                                                            i6 = i;
                                                            while (true) {
                                                                bArr2 = B;
                                                                if (i6 < bArr2.length) {
                                                                    i7 = i;
                                                                    while (true) {
                                                                        bArr3 = C;
                                                                        if (i7 >= bArr3.length) {
                                                                            break;
                                                                        }
                                                                        if (bArr4[bArr2.length + i7 + 4] != bArr3[i7]) {
                                                                            break;
                                                                        }
                                                                        i7++;
                                                                    }
                                                                    if (i10 != 0) {
                                                                        return 14;
                                                                    }
                                                                    return i;
                                                                }
                                                                if (bArr4[i6] != bArr2[i6]) {
                                                                    break;
                                                                }
                                                                i6++;
                                                            }
                                                            i10 = i;
                                                            if (i10 != 0) {
                                                                return 14;
                                                            }
                                                            return i;
                                                        }
                                                    }
                                                    byteOrderedDataInputStream.close();
                                                    byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr4);
                                                    ByteOrder byteOrderT3 = t(byteOrderedDataInputStream2);
                                                    this.g = byteOrderT3;
                                                    byteOrderedDataInputStream2.b = byteOrderT3;
                                                    s2 = byteOrderedDataInputStream2.readShort();
                                                    if (s2 != 20306 || s2 == 21330) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    byteOrderedDataInputStream2.close();
                                                    if (i2 != 0) {
                                                        return 7;
                                                    }
                                                    byteOrderedDataInputStream3 = new ByteOrderedDataInputStream(bArr4);
                                                    ByteOrder byteOrderT4 = t(byteOrderedDataInputStream3);
                                                    this.g = byteOrderT4;
                                                    byteOrderedDataInputStream3.b = byteOrderT4;
                                                    if (byteOrderedDataInputStream3.readShort() == 85) {
                                                        i3 = 1;
                                                    } else {
                                                        i3 = i;
                                                    }
                                                    byteOrderedDataInputStream3.close();
                                                    if (i3 != 0) {
                                                        return 10;
                                                    }
                                                    i4 = i;
                                                    while (true) {
                                                        bArr = x;
                                                        if (i4 < bArr.length) {
                                                            i5 = 1;
                                                            break;
                                                        }
                                                        if (bArr4[i4] != bArr[i4]) {
                                                            i5 = i;
                                                            break;
                                                        }
                                                        i4++;
                                                    }
                                                    if (i5 != 0) {
                                                        return 13;
                                                    }
                                                    i6 = i;
                                                    while (true) {
                                                        bArr2 = B;
                                                        if (i6 < bArr2.length) {
                                                            i7 = i;
                                                            while (true) {
                                                                bArr3 = C;
                                                                if (i7 >= bArr3.length) {
                                                                    break;
                                                                    break;
                                                                }
                                                                if (bArr4[bArr2.length + i7 + 4] != bArr3[i7]) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i7++;
                                                            }
                                                            if (i10 != 0) {
                                                                return 14;
                                                            }
                                                            return i;
                                                        }
                                                        if (bArr4[i6] != bArr2[i6]) {
                                                            break;
                                                            break;
                                                        }
                                                        i6++;
                                                    }
                                                    i10 = i;
                                                    if (i10 != 0) {
                                                        return 14;
                                                    }
                                                    return i;
                                                }
                                                if (m) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                                if (byteOrderedDataInputStream != null) {
                                                    byteOrderedDataInputStream.close();
                                                }
                                                byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr4);
                                                ByteOrder byteOrderT5 = t(byteOrderedDataInputStream2);
                                                this.g = byteOrderT5;
                                                byteOrderedDataInputStream2.b = byteOrderT5;
                                                s2 = byteOrderedDataInputStream2.readShort();
                                                if (s2 != 20306) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = 1;
                                                }
                                                byteOrderedDataInputStream2.close();
                                                if (i2 != 0) {
                                                    return 7;
                                                }
                                                byteOrderedDataInputStream3 = new ByteOrderedDataInputStream(bArr4);
                                                ByteOrder byteOrderT6 = t(byteOrderedDataInputStream3);
                                                this.g = byteOrderT6;
                                                byteOrderedDataInputStream3.b = byteOrderT6;
                                                if (byteOrderedDataInputStream3.readShort() == 85) {
                                                    i3 = 1;
                                                } else {
                                                    i3 = i;
                                                }
                                                byteOrderedDataInputStream3.close();
                                                if (i3 != 0) {
                                                    return 10;
                                                }
                                                i4 = i;
                                                while (true) {
                                                    bArr = x;
                                                    if (i4 < bArr.length) {
                                                        i5 = 1;
                                                        break;
                                                    }
                                                    if (bArr4[i4] != bArr[i4]) {
                                                        i5 = i;
                                                        break;
                                                    }
                                                    i4++;
                                                }
                                                if (i5 != 0) {
                                                    return 13;
                                                }
                                                i6 = i;
                                                while (true) {
                                                    bArr2 = B;
                                                    if (i6 < bArr2.length) {
                                                        i7 = i;
                                                        while (true) {
                                                            bArr3 = C;
                                                            if (i7 >= bArr3.length) {
                                                                break;
                                                                break;
                                                            }
                                                            if (bArr4[bArr2.length + i7 + 4] != bArr3[i7]) {
                                                                break;
                                                                break;
                                                            }
                                                            i7++;
                                                        }
                                                        if (i10 != 0) {
                                                            return 14;
                                                        }
                                                        return i;
                                                    }
                                                    if (bArr4[i6] != bArr2[i6]) {
                                                        break;
                                                        break;
                                                    }
                                                    i6++;
                                                }
                                                i10 = i;
                                                if (i10 != 0) {
                                                    return 14;
                                                }
                                                return i;
                                            }
                                            byteOrderedDataInputStream.close();
                                            i = 0;
                                        } catch (Exception e2) {
                                            e = e2;
                                            i = 0;
                                        }
                                        ByteOrder byteOrderT7 = t(byteOrderedDataInputStream2);
                                        this.g = byteOrderT7;
                                        byteOrderedDataInputStream2.b = byteOrderT7;
                                        s2 = byteOrderedDataInputStream2.readShort();
                                        if (s2 != 20306) {
                                            i2 = 1;
                                        } else {
                                            i2 = 1;
                                        }
                                        byteOrderedDataInputStream2.close();
                                    } catch (Exception unused3) {
                                        if (byteOrderedDataInputStream2 != null) {
                                            byteOrderedDataInputStream2.close();
                                        }
                                        i2 = i;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        byteOrderedDataInputStream6 = byteOrderedDataInputStream2;
                                        if (byteOrderedDataInputStream6 != null) {
                                            byteOrderedDataInputStream6.close();
                                        }
                                        throw th;
                                    }
                                    byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(bArr4);
                                } catch (Exception unused4) {
                                    byteOrderedDataInputStream2 = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                i = 0;
                                byteOrderedDataInputStream = null;
                            } catch (Throwable th5) {
                                th = th5;
                                if (r4 != 0) {
                                    r4.close();
                                }
                                throw th;
                            }
                            if (i2 != 0) {
                                return 7;
                            }
                            byteOrderedDataInputStream3 = new ByteOrderedDataInputStream(bArr4);
                            ByteOrder byteOrderT8 = t(byteOrderedDataInputStream3);
                            this.g = byteOrderT8;
                            byteOrderedDataInputStream3.b = byteOrderT8;
                            if (byteOrderedDataInputStream3.readShort() == 85) {
                                i3 = 1;
                            } else {
                                i3 = i;
                            }
                            byteOrderedDataInputStream3.close();
                            if (i3 != 0) {
                                return 10;
                            }
                            i4 = i;
                            while (true) {
                                bArr = x;
                                if (i4 < bArr.length) {
                                    i5 = 1;
                                    break;
                                }
                                if (bArr4[i4] != bArr[i4]) {
                                    i5 = i;
                                    break;
                                }
                                i4++;
                            }
                            if (i5 != 0) {
                                return 13;
                            }
                            i6 = i;
                            while (true) {
                                bArr2 = B;
                                if (i6 < bArr2.length) {
                                    i7 = i;
                                    while (true) {
                                        bArr3 = C;
                                        if (i7 >= bArr3.length) {
                                            break;
                                            break;
                                        }
                                        if (bArr4[bArr2.length + i7 + 4] != bArr3[i7]) {
                                            break;
                                            break;
                                        }
                                        i7++;
                                    }
                                    if (i10 != 0) {
                                        return 14;
                                    }
                                    return i;
                                }
                                if (bArr4[i6] != bArr2[i6]) {
                                    break;
                                    break;
                                }
                                i6++;
                            }
                            i10 = i;
                            if (i10 != 0) {
                                return 14;
                            }
                            return i;
                        } catch (Throwable th6) {
                            th = th6;
                            r4 = r7;
                            if (r4 != 0) {
                                r4.close();
                            }
                            throw th;
                        }
                    }
                }
                return 9;
            }
            i8++;
        }
    }

    public final void i(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        if (m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = x;
        byteOrderedDataInputStream.b(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = byteOrderedDataInputStream.readInt();
                byte[] bArr2 = new byte[4];
                if (byteOrderedDataInputStream.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, z)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, A)) {
                    return;
                }
                if (Arrays.equals(bArr2, y)) {
                    byte[] bArr3 = new byte[i];
                    if (byteOrderedDataInputStream.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ExifInterfaceUtils.a(bArr2));
                    }
                    int i3 = byteOrderedDataInputStream.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.i = i2;
                        u(0, bArr3);
                        A();
                        x(new ByteOrderedDataInputStream(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                byteOrderedDataInputStream.b(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                dr0.h("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    public final void j(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        boolean z2 = m;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        byteOrderedDataInputStream.read(bArr);
        byteOrderedDataInputStream.read(bArr2);
        byteOrderedDataInputStream.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        byteOrderedDataInputStream.b(i - byteOrderedDataInputStream.c);
        byteOrderedDataInputStream.read(bArr4);
        f(new ByteOrderedDataInputStream(bArr4), i, 5);
        byteOrderedDataInputStream.b(i3 - byteOrderedDataInputStream.c);
        byteOrderedDataInputStream.b = ByteOrder.BIG_ENDIAN;
        int i4 = byteOrderedDataInputStream.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = byteOrderedDataInputStream.readUnsignedShort();
            int unsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            if (unsignedShort == H.a) {
                short s2 = byteOrderedDataInputStream.readShort();
                short s3 = byteOrderedDataInputStream.readShort();
                ExifAttribute exifAttributeC = ExifAttribute.c(s2, this.g);
                ExifAttribute exifAttributeC2 = ExifAttribute.c(s3, this.g);
                HashMap[] mapArr = this.e;
                mapArr[0].put("ImageLength", exifAttributeC);
                mapArr[0].put("ImageWidth", exifAttributeC2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            byteOrderedDataInputStream.b(unsignedShort2);
        }
    }

    public final void m(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        if (m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + seekableByteOrderedDataInputStream);
        }
        k(seekableByteOrderedDataInputStream);
        HashMap[] mapArr = this.e;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[0].get("JpgFromRaw");
        if (exifAttribute != null) {
            f(new ByteOrderedDataInputStream(exifAttribute.d), (int) exifAttribute.c, 5);
        }
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[0].get("ISO");
        ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[1].get("PhotographicSensitivity");
        if (exifAttribute2 == null || exifAttribute3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", exifAttribute2);
    }

    public final void n(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        if (m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.b = ByteOrder.LITTLE_ENDIAN;
        byteOrderedDataInputStream.b(B.length);
        int i = byteOrderedDataInputStream.readInt() + 8;
        byte[] bArr = C;
        byteOrderedDataInputStream.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (byteOrderedDataInputStream.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = byteOrderedDataInputStream.readInt();
                int i3 = length + 8;
                if (Arrays.equals(D, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (byteOrderedDataInputStream.read(bArr3) == i2) {
                        this.i = i3;
                        u(0, bArr3);
                        x(new ByteOrderedDataInputStream(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ExifInterfaceUtils.a(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                byteOrderedDataInputStream.b(i2);
            } catch (EOFException unused) {
                dr0.h("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    public final void o(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap map) throws Throwable {
        ExifAttribute exifAttribute = (ExifAttribute) map.get("JPEGInterchangeFormat");
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("JPEGInterchangeFormatLength");
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        int iE = exifAttribute.e(this.g);
        int iE2 = exifAttribute2.e(this.g);
        if (this.d == 7) {
            iE += this.j;
        }
        if (iE > 0 && iE2 > 0 && this.a == null && this.c == null && this.b == null) {
            byteOrderedDataInputStream.skip(iE);
            byteOrderedDataInputStream.read(new byte[iE2]);
        }
        if (m) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean p(HashMap map) {
        ExifAttribute exifAttribute = (ExifAttribute) map.get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.e(this.g) <= 512 && exifAttribute2.e(this.g) <= 512;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008f A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0004, B:5:0x0009, B:12:0x001e, B:18:0x003b, B:20:0x0046, B:28:0x005c, B:23:0x004d, B:26:0x0055, B:27:0x0059, B:29:0x0066, B:31:0x006f, B:33:0x0075, B:35:0x007b, B:37:0x0081, B:43:0x008f), top: B:53:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public final void q(InputStream inputStream) {
        boolean z2 = m;
        for (int i = 0; i < I.length; i++) {
            try {
                try {
                    this.e[i] = new HashMap();
                } catch (IOException e) {
                    e = e;
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    a();
                    if (z2) {
                        s();
                        return;
                    }
                    return;
                } catch (UnsupportedOperationException e2) {
                    e = e2;
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    a();
                    if (z2) {
                        s();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                a();
                if (z2) {
                    s();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iG = g(bufferedInputStream);
        this.d = iG;
        if (iG == 4 || iG == 9 || iG == 13 || iG == 14) {
            ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(bufferedInputStream);
            int i2 = this.d;
            if (i2 == 4) {
                f(byteOrderedDataInputStream, 0, 0);
            } else if (i2 == 13) {
                i(byteOrderedDataInputStream);
            } else if (i2 == 9) {
                j(byteOrderedDataInputStream);
            } else if (i2 == 14) {
                n(byteOrderedDataInputStream);
            }
        } else {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(bufferedInputStream);
            int i3 = this.d;
            if (i3 == 12) {
                e(seekableByteOrderedDataInputStream);
            } else if (i3 == 7) {
                h(seekableByteOrderedDataInputStream);
            } else if (i3 == 10) {
                m(seekableByteOrderedDataInputStream);
            } else {
                k(seekableByteOrderedDataInputStream);
            }
            seekableByteOrderedDataInputStream.f(this.i);
            x(seekableByteOrderedDataInputStream);
        }
        a();
        if (z2) {
            s();
        }
    }

    public final void u(int i, byte[] bArr) throws IOException {
        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(bArr);
        r(seekableByteOrderedDataInputStream);
        v(seekableByteOrderedDataInputStream, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0213  */
    /* JADX WARN: Code duplicated, block: B:108:0x0220  */
    /* JADX WARN: Code duplicated, block: B:109:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x0231  */
    /* JADX WARN: Code duplicated, block: B:112:0x0238  */
    /* JADX WARN: Code duplicated, block: B:115:0x024f  */
    /* JADX WARN: Code duplicated, block: B:117:0x025a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0269  */
    /* JADX WARN: Code duplicated, block: B:121:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x028a  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02df  */
    /* JADX WARN: Code duplicated, block: B:140:0x0309  */
    /* JADX WARN: Code duplicated, block: B:167:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:0x0174  */
    /* JADX WARN: Code duplicated, block: B:80:0x017b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:0x018c  */
    /* JADX WARN: Code duplicated, block: B:86:0x018f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0203  */
    /* JADX WARN: Code duplicated, block: B:97:0x0208  */
    /* JADX WARN: Code duplicated, block: B:99:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:120:0x0269, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x028a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0160, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01e8, please report this as an issue */
    public final void v(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) throws IOException {
        HashMap[] mapArr;
        long j;
        long j2;
        boolean z2;
        int i2;
        long j3;
        Integer num;
        long j4;
        String str;
        int i3;
        int unsignedShort;
        long j5;
        int i4;
        Integer numValueOf = Integer.valueOf(seekableByteOrderedDataInputStream.c);
        HashSet hashSet = this.f;
        hashSet.add(numValueOf);
        short s2 = seekableByteOrderedDataInputStream.readShort();
        boolean z3 = m;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s2));
        }
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            mapArr = this.e;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = seekableByteOrderedDataInputStream.readUnsignedShort();
            int unsignedShort3 = seekableByteOrderedDataInputStream.readUnsignedShort();
            int i5 = seekableByteOrderedDataInputStream.readInt();
            long j6 = ((long) seekableByteOrderedDataInputStream.c) + 4;
            ExifTag exifTag = (ExifTag) K[i].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), exifTag != null ? exifTag.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i5)));
            }
            if (exifTag != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = F;
                    if (unsignedShort3 < iArr.length) {
                        int i6 = exifTag.c;
                        if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3 || (i2 = exifTag.d) == unsignedShort3 || (((i6 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i6 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i6 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i6;
                            }
                            j = j6;
                            j2 = ((long) i5) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i5);
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + E[unsignedShort3] + ") is unexpected for tag: " + exifTag.b);
                        }
                    }
                    if (z2) {
                        j3 = j;
                        if (j2 > 4) {
                            i4 = seekableByteOrderedDataInputStream.readInt();
                            if (z3 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i4);
                            }
                            if (this.d == 7) {
                                if ("MakerNote".equals(exifTag.b)) {
                                    this.j = i4;
                                } else if (i != 6 && "ThumbnailImage".equals(exifTag.b)) {
                                    this.k = i4;
                                    this.l = i5;
                                    ExifAttribute exifAttributeC = ExifAttribute.c(6, this.g);
                                    ExifAttribute exifAttributeA = ExifAttribute.a(this.k, this.g);
                                    ExifAttribute exifAttributeA2 = ExifAttribute.a(this.l, this.g);
                                    mapArr[4].put("Compression", exifAttributeC);
                                    mapArr[4].put("JPEGInterchangeFormat", exifAttributeA);
                                    mapArr[4].put("JPEGInterchangeFormatLength", exifAttributeA2);
                                }
                            }
                            seekableByteOrderedDataInputStream.f(i4);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            unsignedShort3 = unsignedShort3;
                        }
                        num = (Integer) N.get(Integer.valueOf(unsignedShort2));
                        if (z3 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            i3 = unsignedShort3;
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    j5 = ((long) seekableByteOrderedDataInputStream.readInt()) & 4294967295L;
                                } else if (i3 == 8) {
                                    unsignedShort = seekableByteOrderedDataInputStream.readShort();
                                } else if (i3 != 9 || i3 == 13) {
                                    unsignedShort = seekableByteOrderedDataInputStream.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z3 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), exifTag.b));
                                }
                                if (j5 > 0) {
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        seekableByteOrderedDataInputStream.f(j5);
                                        v(seekableByteOrderedDataInputStream, num.intValue());
                                    } else if (z3 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                } else if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                                }
                                seekableByteOrderedDataInputStream.f(j3);
                            } else {
                                unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), exifTag.b));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    seekableByteOrderedDataInputStream.f(j5);
                                    v(seekableByteOrderedDataInputStream, num.intValue());
                                } else if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            seekableByteOrderedDataInputStream.f(j3);
                        } else {
                            j4 = j3;
                            int i7 = seekableByteOrderedDataInputStream.c + this.i;
                            byte[] bArr = new byte[(int) j2];
                            seekableByteOrderedDataInputStream.readFully(bArr);
                            ExifAttribute exifAttribute = new ExifAttribute(i7, bArr, unsignedShort3, i5);
                            HashMap map = mapArr[i];
                            str = exifTag.b;
                            map.put(str, exifAttribute);
                            if ("DNGVersion".equals(str)) {
                                this.d = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && exifAttribute.f(this.g).contains("PENTAX")) || ("Compression".equals(str) && exifAttribute.e(this.g) == 65535)) {
                                this.d = 8;
                            }
                            if (seekableByteOrderedDataInputStream.c != j4) {
                                seekableByteOrderedDataInputStream.f(j4);
                            }
                        }
                    } else {
                        seekableByteOrderedDataInputStream.f(j);
                    }
                    s3 = (short) (s3 + 1);
                    s2 = s2;
                    z3 = z3;
                }
                j = j6;
                if (z3 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z2 = false;
                if (z2) {
                    seekableByteOrderedDataInputStream.f(j);
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i4 = seekableByteOrderedDataInputStream.readInt();
                        if (z3 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i4);
                        }
                        if (this.d == 7) {
                            if ("MakerNote".equals(exifTag.b)) {
                                this.j = i4;
                            } else if (i != 6) {
                            }
                        }
                        seekableByteOrderedDataInputStream.f(i4);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        unsignedShort3 = unsignedShort3;
                    }
                    num = (Integer) N.get(Integer.valueOf(unsignedShort2));
                    if (z3 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        i3 = unsignedShort3;
                        if (i3 != 3) {
                            if (i3 == 4) {
                                j5 = ((long) seekableByteOrderedDataInputStream.readInt()) & 4294967295L;
                            } else if (i3 == 8) {
                                if (i3 != 9) {
                                }
                                unsignedShort = seekableByteOrderedDataInputStream.readInt();
                            } else {
                                unsignedShort = seekableByteOrderedDataInputStream.readShort();
                            }
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), exifTag.b));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    seekableByteOrderedDataInputStream.f(j5);
                                    v(seekableByteOrderedDataInputStream, num.intValue());
                                } else if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            seekableByteOrderedDataInputStream.f(j3);
                        } else {
                            unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), exifTag.b));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                seekableByteOrderedDataInputStream.f(j5);
                                v(seekableByteOrderedDataInputStream, num.intValue());
                            } else if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        seekableByteOrderedDataInputStream.f(j3);
                    } else {
                        j4 = j3;
                        int i8 = seekableByteOrderedDataInputStream.c + this.i;
                        byte[] bArr2 = new byte[(int) j2];
                        seekableByteOrderedDataInputStream.readFully(bArr2);
                        ExifAttribute exifAttribute2 = new ExifAttribute(i8, bArr2, unsignedShort3, i5);
                        HashMap map2 = mapArr[i];
                        str = exifTag.b;
                        map2.put(str, exifAttribute2);
                        if ("DNGVersion".equals(str)) {
                            this.d = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.d = 8;
                        if (seekableByteOrderedDataInputStream.c != j4) {
                            seekableByteOrderedDataInputStream.f(j4);
                        }
                    }
                }
                s3 = (short) (s3 + 1);
                s2 = s2;
                z3 = z3;
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j6;
            j2 = 0;
            z2 = false;
            if (z2) {
                seekableByteOrderedDataInputStream.f(j);
            } else {
                j3 = j;
                if (j2 > 4) {
                    i4 = seekableByteOrderedDataInputStream.readInt();
                    if (z3 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i4);
                    }
                    if (this.d == 7) {
                        if ("MakerNote".equals(exifTag.b)) {
                            this.j = i4;
                        } else if (i != 6) {
                        }
                    }
                    seekableByteOrderedDataInputStream.f(i4);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    unsignedShort3 = unsignedShort3;
                }
                num = (Integer) N.get(Integer.valueOf(unsignedShort2));
                if (z3 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    i3 = unsignedShort3;
                    if (i3 != 3) {
                        if (i3 == 4) {
                            j5 = ((long) seekableByteOrderedDataInputStream.readInt()) & 4294967295L;
                        } else if (i3 == 8) {
                            if (i3 != 9) {
                            }
                            unsignedShort = seekableByteOrderedDataInputStream.readInt();
                        } else {
                            unsignedShort = seekableByteOrderedDataInputStream.readShort();
                        }
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), exifTag.b));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                seekableByteOrderedDataInputStream.f(j5);
                                v(seekableByteOrderedDataInputStream, num.intValue());
                            } else if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        seekableByteOrderedDataInputStream.f(j3);
                    } else {
                        unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z3 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), exifTag.b));
                    }
                    if (j5 > 0) {
                        if (!hashSet.contains(Integer.valueOf((int) j5))) {
                            seekableByteOrderedDataInputStream.f(j5);
                            v(seekableByteOrderedDataInputStream, num.intValue());
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                        }
                    } else if (z3 != 0) {
                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                    }
                    seekableByteOrderedDataInputStream.f(j3);
                } else {
                    j4 = j3;
                    int i9 = seekableByteOrderedDataInputStream.c + this.i;
                    byte[] bArr3 = new byte[(int) j2];
                    seekableByteOrderedDataInputStream.readFully(bArr3);
                    ExifAttribute exifAttribute3 = new ExifAttribute(i9, bArr3, unsignedShort3, i5);
                    HashMap map3 = mapArr[i];
                    str = exifTag.b;
                    map3.put(str, exifAttribute3);
                    if ("DNGVersion".equals(str)) {
                        this.d = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.d = 8;
                    if (seekableByteOrderedDataInputStream.c != j4) {
                        seekableByteOrderedDataInputStream.f(j4);
                    }
                }
            }
            s3 = (short) (s3 + 1);
            s2 = s2;
            z3 = z3;
        }
        boolean z4 = z3;
        int i10 = seekableByteOrderedDataInputStream.readInt();
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i10)));
        }
        long j7 = i10;
        if (j7 <= 0) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        if (hashSet.contains(Integer.valueOf(i10))) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        seekableByteOrderedDataInputStream.f(j7);
        if (mapArr[4].isEmpty()) {
            v(seekableByteOrderedDataInputStream, 4);
        } else if (mapArr[5].isEmpty()) {
            v(seekableByteOrderedDataInputStream, 5);
        }
    }

    public final void w(int i, String str, String str2) {
        HashMap[] mapArr = this.e;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    public final void x(ByteOrderedDataInputStream byteOrderedDataInputStream) throws Throwable {
        ExifAttribute exifAttribute;
        int iE;
        HashMap map = this.e[4];
        ExifAttribute exifAttribute2 = (ExifAttribute) map.get("Compression");
        if (exifAttribute2 == null) {
            o(byteOrderedDataInputStream, map);
            return;
        }
        int iE2 = exifAttribute2.e(this.g);
        if (iE2 != 1) {
            if (iE2 == 6) {
                o(byteOrderedDataInputStream, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        ExifAttribute exifAttribute3 = (ExifAttribute) map.get("BitsPerSample");
        if (exifAttribute3 != null) {
            int[] iArr = (int[]) exifAttribute3.g(this.g);
            int[] iArr2 = p;
            if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (exifAttribute = (ExifAttribute) map.get("PhotometricInterpretation")) != null && (((iE = exifAttribute.e(this.g)) == 1 && Arrays.equals(iArr, q)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                ExifAttribute exifAttribute4 = (ExifAttribute) map.get("StripOffsets");
                ExifAttribute exifAttribute5 = (ExifAttribute) map.get("StripByteCounts");
                if (exifAttribute4 == null || exifAttribute5 == null) {
                    return;
                }
                long[] jArrB = ExifInterfaceUtils.b(exifAttribute4.g(this.g));
                long[] jArrB2 = ExifInterfaceUtils.b(exifAttribute5.g(this.g));
                if (jArrB == null || jArrB.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrB2 == null || jArrB2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrB.length != jArrB2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrB2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.h = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrB.length; i3++) {
                    int i4 = (int) jArrB[i3];
                    int i5 = (int) jArrB2[i3];
                    if (i3 < jArrB.length - 1 && i4 + i5 != jArrB[i3 + 1]) {
                        this.h = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (byteOrderedDataInputStream.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (byteOrderedDataInputStream.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.h) {
                    long j4 = jArrB[0];
                    return;
                }
                return;
            }
        }
        if (m) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void y(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.e;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = m;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[i].get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[i].get("ImageWidth");
        ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[i2].get("ImageLength");
        ExifAttribute exifAttribute4 = (ExifAttribute) mapArr[i2].get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (exifAttribute3 == null || exifAttribute4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = exifAttribute.e(this.g);
        int iE2 = exifAttribute2.e(this.g);
        int iE3 = exifAttribute3.e(this.g);
        int iE4 = exifAttribute4.e(this.g);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void z(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i) throws Throwable {
        ExifAttribute exifAttributeC;
        ExifAttribute exifAttributeC2;
        HashMap[] mapArr = this.e;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[i].get("DefaultCropSize");
        ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[i].get("SensorTopBorder");
        ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[i].get("SensorLeftBorder");
        ExifAttribute exifAttribute4 = (ExifAttribute) mapArr[i].get("SensorBottomBorder");
        ExifAttribute exifAttribute5 = (ExifAttribute) mapArr[i].get("SensorRightBorder");
        if (exifAttribute != null) {
            int i2 = exifAttribute.a;
            ByteOrder byteOrder = this.g;
            if (i2 == 5) {
                Rational[] rationalArr = (Rational[]) exifAttribute.g(byteOrder);
                if (rationalArr == null || rationalArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(rationalArr));
                    return;
                }
                exifAttributeC = ExifAttribute.b(rationalArr[0], this.g);
                exifAttributeC2 = ExifAttribute.b(rationalArr[1], this.g);
            } else {
                int[] iArr = (int[]) exifAttribute.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                exifAttributeC = ExifAttribute.c(iArr[0], this.g);
                exifAttributeC2 = ExifAttribute.c(iArr[1], this.g);
            }
            mapArr[i].put("ImageWidth", exifAttributeC);
            mapArr[i].put("ImageLength", exifAttributeC2);
            return;
        }
        if (exifAttribute2 != null && exifAttribute3 != null && exifAttribute4 != null && exifAttribute5 != null) {
            int iE = exifAttribute2.e(this.g);
            int iE2 = exifAttribute4.e(this.g);
            int iE3 = exifAttribute5.e(this.g);
            int iE4 = exifAttribute3.e(this.g);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            ExifAttribute exifAttributeC3 = ExifAttribute.c(iE2 - iE, this.g);
            ExifAttribute exifAttributeC4 = ExifAttribute.c(iE3 - iE4, this.g);
            mapArr[i].put("ImageLength", exifAttributeC3);
            mapArr[i].put("ImageWidth", exifAttributeC4);
            return;
        }
        ExifAttribute exifAttribute6 = (ExifAttribute) mapArr[i].get("ImageLength");
        ExifAttribute exifAttribute7 = (ExifAttribute) mapArr[i].get("ImageWidth");
        if (exifAttribute6 == null || exifAttribute7 == null) {
            ExifAttribute exifAttribute8 = (ExifAttribute) mapArr[i].get("JPEGInterchangeFormat");
            ExifAttribute exifAttribute9 = (ExifAttribute) mapArr[i].get("JPEGInterchangeFormatLength");
            if (exifAttribute8 == null || exifAttribute9 == null) {
                return;
            }
            int iE5 = exifAttribute8.e(this.g);
            int iE6 = exifAttribute8.e(this.g);
            seekableByteOrderedDataInputStream.f(iE5);
            byte[] bArr = new byte[iE6];
            seekableByteOrderedDataInputStream.read(bArr);
            f(new ByteOrderedDataInputStream(bArr), iE5, i);
        }
    }

    public ExifInterface(String str) throws Throwable {
        boolean z2;
        ExifTag[][] exifTagArr = I;
        this.e = new HashMap[exifTagArr.length];
        this.f = new HashSet(exifTagArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream = null;
        if (str != null) {
            this.c = null;
            this.a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    try {
                        ExifInterfaceUtils.Api21Impl.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                        z2 = true;
                    } catch (Exception unused) {
                        if (m) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z2 = false;
                    }
                    if (z2) {
                        this.b = fileInputStream2.getFD();
                    } else {
                        this.b = null;
                    }
                    q(fileInputStream2);
                    try {
                        fileInputStream2.close();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (RuntimeException e2) {
                            throw e2;
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            d.w("filename cannot be null");
            throw null;
        }
    }

    public static ByteOrder t(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        short s2 = byteOrderedDataInputStream.readShort();
        boolean z2 = m;
        if (s2 != 18761) {
            if (s2 == 19789) {
                if (z2) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            dr0.h(nj.m(s2, new StringBuilder("Invalid byte order: ")));
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final String b(String str) {
        ExifAttribute exifAttributeD = d(str);
        if (exifAttributeD != null) {
            int i = exifAttributeD.a;
            if (!M.contains(str)) {
                return exifAttributeD.f(this.g);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    pv1.u(i, "GPS Timestamp format is not rational. format=", "ExifInterface");
                    return null;
                }
                Rational[] rationalArr = (Rational[]) exifAttributeD.g(this.g);
                if (rationalArr != null && rationalArr.length == 3) {
                    Rational rational = rationalArr[0];
                    Integer numValueOf = Integer.valueOf((int) (rational.a / rational.b));
                    Rational rational2 = rationalArr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (rational2.a / rational2.b));
                    Rational rational3 = rationalArr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (rational3.a / rational3.b)));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(rationalArr));
                return null;
            }
            try {
                return Double.toString(exifAttributeD.d(this.g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final void h(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        int i;
        int i2;
        k(seekableByteOrderedDataInputStream);
        HashMap[] mapArr = this.e;
        ExifAttribute exifAttribute = (ExifAttribute) mapArr[1].get("MakerNote");
        if (exifAttribute != null) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.d);
            seekableByteOrderedDataInputStream2.b = this.g;
            byte[] bArr = v;
            byte[] bArr2 = new byte[bArr.length];
            seekableByteOrderedDataInputStream2.readFully(bArr2);
            seekableByteOrderedDataInputStream2.f(0L);
            byte[] bArr3 = w;
            byte[] bArr4 = new byte[bArr3.length];
            seekableByteOrderedDataInputStream2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                seekableByteOrderedDataInputStream2.f(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                seekableByteOrderedDataInputStream2.f(12L);
            }
            v(seekableByteOrderedDataInputStream2, 6);
            ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[7].get("PreviewImageStart");
            ExifAttribute exifAttribute3 = (ExifAttribute) mapArr[7].get("PreviewImageLength");
            if (exifAttribute2 != null && exifAttribute3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", exifAttribute2);
                mapArr[5].put("JPEGInterchangeFormatLength", exifAttribute3);
            }
            ExifAttribute exifAttribute4 = (ExifAttribute) mapArr[8].get("AspectFrame");
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.g(this.g);
                if (iArr != null && iArr.length == 4) {
                    int i3 = iArr[2];
                    int i4 = iArr[0];
                    if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                        int i5 = (i3 - i4) + 1;
                        int i6 = (i - i2) + 1;
                        if (i5 < i6) {
                            int i7 = i5 + i6;
                            i6 = i7 - i6;
                            i5 = i7 - i6;
                        }
                        ExifAttribute exifAttributeC = ExifAttribute.c(i5, this.g);
                        ExifAttribute exifAttributeC2 = ExifAttribute.c(i6, this.g);
                        mapArr[0].put("ImageWidth", exifAttributeC);
                        mapArr[0].put("ImageLength", exifAttributeC2);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void k(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws Throwable {
        r(seekableByteOrderedDataInputStream);
        v(seekableByteOrderedDataInputStream, 0);
        z(seekableByteOrderedDataInputStream, 0);
        z(seekableByteOrderedDataInputStream, 5);
        z(seekableByteOrderedDataInputStream, 4);
        A();
        if (this.d == 8) {
            HashMap[] mapArr = this.e;
            ExifAttribute exifAttribute = (ExifAttribute) mapArr[1].get("MakerNote");
            if (exifAttribute != null) {
                SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.d);
                seekableByteOrderedDataInputStream2.b = this.g;
                seekableByteOrderedDataInputStream2.b(6);
                v(seekableByteOrderedDataInputStream2, 9);
                ExifAttribute exifAttribute2 = (ExifAttribute) mapArr[9].get("ColorSpace");
                if (exifAttribute2 != null) {
                    mapArr[1].put("ColorSpace", exifAttribute2);
                }
            }
        }
    }

    public final int l() {
        switch (c()) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void r(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        ByteOrder byteOrderT = t(seekableByteOrderedDataInputStream);
        this.g = byteOrderT;
        seekableByteOrderedDataInputStream.b = byteOrderT;
        int unsignedShort = seekableByteOrderedDataInputStream.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            dr0.h(nj.m(unsignedShort, new StringBuilder("Invalid start code: ")));
            return;
        }
        int i2 = seekableByteOrderedDataInputStream.readInt();
        if (i2 >= 8) {
            int i3 = i2 - 8;
            if (i3 > 0) {
                seekableByteOrderedDataInputStream.b(i3);
                return;
            }
            return;
        }
        dr0.h(pv1.k(i2, "Invalid first Ifd offset: "));
    }

    public ExifInterface(InputStream inputStream) throws IOException {
        ExifTag[][] exifTagArr = I;
        this.e = new HashMap[exifTagArr.length];
        this.f = new HashSet(exifTagArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        this.a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                ExifInterfaceUtils.Api21Impl.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.c = null;
                this.b = fileInputStream.getFD();
            } catch (Exception unused) {
                if (m) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.c = null;
                this.b = null;
            }
        } else {
            this.c = null;
            this.b = null;
        }
        q(inputStream);
    }
}
