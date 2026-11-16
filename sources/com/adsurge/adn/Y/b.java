package com.adsurge.adn.Y;

import android.util.Pair;
import defpackage.h50;
import defpackage.jc1;
import defpackage.nj;
import defpackage.pv1;
import defpackage.vq2;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public final List a;
        public final List b;

        public a(List list, List list2) {
            this.a = list;
            this.b = list2;
        }
    }

    public static Pair a(RandomAccessFile randomAccessFile, long j) throws IOException, d {
        if (j < 32) {
            throw new d(jc1.l(j, "APK too small for APK Signing Block. ZIP Central Directory offset: "));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        randomAccessFile.seek(j - ((long) byteBufferAllocate.capacity()));
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
            throw new d("No APK Signing Block before ZIP Central Directory");
        }
        long j2 = byteBufferAllocate.getLong(0);
        if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
            throw new d(jc1.l(j2, "APK Signing Block size out of range: "));
        }
        int i = (int) (8 + j2);
        long j3 = j - ((long) i);
        if (j3 < 0) {
            throw new d(jc1.l(j3, "APK Signing Block offset out of range: "));
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
        byteBufferAllocate2.order(byteOrder);
        randomAccessFile.seek(j3);
        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
        long j4 = byteBufferAllocate2.getLong(0);
        if (j4 == j2) {
            return Pair.create(byteBufferAllocate2, Long.valueOf(j3));
        }
        StringBuilder sbO = h50.o(j4, "APK Signing Block sizes in header and footer do not match: ", " vs ");
        sbO.append(j2);
        throw new d(sbO.toString());
    }

    public static ByteBuffer b(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            defpackage.d.r(pv1.k(i, "size: "));
            return null;
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static Pair a(RandomAccessFile randomAccessFile) throws IOException, d {
        Pair pairA = h.a(randomAccessFile);
        if (pairA != null) {
            return pairA;
        }
        throw new d("Not an APK file: ZIP End of Central Directory record not found");
    }

    public static long a(ByteBuffer byteBuffer, long j) throws d {
        long jC = h.c(byteBuffer);
        if (jC <= j) {
            if (h.d(byteBuffer) + jC == j) {
                return jC;
            }
            throw new d("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        StringBuilder sbO = h50.o(jC, "ZIP Central Directory offset out of range: ", ". ZIP End of Central Directory offset: ");
        sbO.append(j);
        throw new d(sbO.toString());
    }

    public static c a(RandomAccessFile randomAccessFile, int i) throws IOException, d {
        Pair pairA = a(randomAccessFile);
        ByteBuffer byteBuffer = (ByteBuffer) pairA.first;
        long jLongValue = ((Long) pairA.second).longValue();
        if (!h.a(randomAccessFile, jLongValue)) {
            long jA = a(byteBuffer, jLongValue);
            Pair pairA2 = a(randomAccessFile, jA);
            ByteBuffer byteBuffer2 = (ByteBuffer) pairA2.first;
            return new c(a(byteBuffer2, i), ((Long) pairA2.second).longValue(), jA, jLongValue, byteBuffer);
        }
        throw new d("ZIP64 APK not supported");
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i) throws d {
        a(byteBuffer);
        ByteBuffer byteBufferA = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i2 = 0;
        while (byteBufferA.hasRemaining()) {
            i2++;
            if (byteBufferA.remaining() >= 8) {
                long j = byteBufferA.getLong();
                if (j >= 4 && j <= 2147483647L) {
                    int i3 = (int) j;
                    int iPosition = byteBufferA.position() + i3;
                    if (i3 <= byteBufferA.remaining()) {
                        if (byteBufferA.getInt() == i) {
                            return b(byteBufferA, i3 - 4);
                        }
                        byteBufferA.position(iPosition);
                    } else {
                        StringBuilder sbT = jc1.t("APK Signing Block entry #", i2, " size out of range: ", i3, ", available: ");
                        sbT.append(byteBufferA.remaining());
                        throw new d(sbT.toString());
                    }
                } else {
                    throw new d("APK Signing Block entry #" + i2 + " size out of range: " + j);
                }
            } else {
                throw new d(pv1.k(i2, "Insufficient data to read size of APK Signing Block entry #"));
            }
        }
        throw new d(jc1.k(i, "No block with ID ", " in APK Signing Block."));
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        defpackage.d.r("ByteBuffer byte order must be little endian");
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            defpackage.d.r(pv1.k(i, "start: "));
            return null;
        }
        if (i2 >= i) {
            int iCapacity = byteBuffer.capacity();
            if (i2 <= byteBuffer.capacity()) {
                int iLimit = byteBuffer.limit();
                int iPosition = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i2);
                    byteBuffer.position(i);
                    ByteBuffer byteBufferSlice = byteBuffer.slice();
                    byteBufferSlice.order(byteBuffer.order());
                    return byteBufferSlice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(iLimit);
                    byteBuffer.position(iPosition);
                }
            }
            defpackage.d.r(nj.i(i2, iCapacity, "end > capacity: ", " > "));
            return null;
        }
        defpackage.d.r(nj.i(i2, i, "end < start: ", " < "));
        return null;
    }

    public static byte[] a(byte[] bArr, long j, c cVar) {
        if (bArr.length == 40) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(32);
            if (byteBufferOrder.getLong() == j - (cVar.c - cVar.b)) {
                return Arrays.copyOfRange(bArr, 0, 32);
            }
            vq2.y("APK content size did not verify");
            return null;
        }
        throw new SecurityException("Verity digest size is wrong: " + bArr.length);
    }
}
