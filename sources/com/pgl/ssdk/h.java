package com.pgl.ssdk;

import defpackage.jc1;
import defpackage.nj;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes7.dex */
public class h {
    private static final char[] a = "0123456789abcdef".toCharArray();

    public static ByteBuffer a(ByteBuffer byteBuffer, int i) throws j {
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
                        throw new j(sbT.toString());
                    }
                } else {
                    throw new j("APK Signing Block entry #" + i2 + " size out of range: " + j);
                }
            } else {
                throw new j("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i2)));
            }
        }
        throw new j("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i)));
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) throws a {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return b(byteBuffer, i);
                }
                StringBuilder sbS = jc1.s(i, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
                sbS.append(byteBuffer.remaining());
                throw new a(sbS.toString());
            }
            defpackage.d.r("Negative length");
            return null;
        }
        throw new a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    public static byte[] c(ByteBuffer byteBuffer) throws a {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            StringBuilder sbS = jc1.s(i, "Underflow while reading length-prefixed value. Length: ", ", available: ");
            sbS.append(byteBuffer.remaining());
            throw new a(sbS.toString());
        }
        throw new a("Negative length");
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            defpackage.d.r("size: ".concat(String.valueOf(i)));
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

    public static i a(q qVar, t tVar, int i) throws j {
        try {
            d.a aVarA = d.a(qVar, tVar);
            long jB = aVarA.b();
            q qVarA = aVarA.a();
            ByteBuffer byteBufferA = qVarA.a(0L, (int) qVarA.a());
            byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
            return new i(a(byteBufferA, i), jB, tVar.a(), tVar.e(), tVar.d());
        } catch (b e) {
            throw new j(e.getMessage(), e);
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2) {
        String strConcat;
        if (i < 0) {
            strConcat = "start: ".concat(String.valueOf(i));
        } else if (i2 >= i) {
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
            strConcat = nj.i(i2, iCapacity, "end > capacity: ", " > ");
        } else {
            strConcat = nj.i(i2, i, "end < start: ", " < ");
        }
        defpackage.d.r(strConcat);
        return null;
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        defpackage.d.r("ByteBuffer byte order must be little endian");
    }
}
