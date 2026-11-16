package com.explorestack.protobuf;

import defpackage.vq2;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f9 {
    public static final d9 a;

    static {
        a = (c9.e && c9.d && !f.a()) ? new d9(1) : new d9(0);
    }

    public static int a(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return e(b, bArr[i]);
        }
        if (i3 == 2) {
            return f(b, bArr[i], bArr[i + 1]);
        }
        io.p071bidmachine.media3.extractor.ts.y.o();
        return 0;
    }

    public static int b(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i3 == 1) {
            return e(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return f(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        io.p071bidmachine.media3.extractor.ts.y.o();
        return 0;
    }

    public static String c(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        long j;
        byte bE;
        byte bE2;
        d9 d9Var = a;
        d9Var.getClass();
        if (byteBuffer.hasArray()) {
            return d9Var.d(byteBuffer.arrayOffset() + i, i2, byteBuffer.array());
        }
        if (!byteBuffer.isDirect()) {
            return d9.e(byteBuffer, i, i2);
        }
        switch (d9Var.a) {
            case 0:
                return d9.e(byteBuffer, i, i2);
            default:
                if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                    vq2.o("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
                    return null;
                }
                long jK = c9.c.k(c9.g, byteBuffer) + ((long) i);
                long j2 = ((long) i2) + jK;
                char[] cArr = new char[i2];
                int i3 = 0;
                while (true) {
                    j = 1;
                    if (jK < j2 && (bE2 = c9.c.e(jK)) >= 0) {
                        jK++;
                        cArr[i3] = (char) bE2;
                        i3++;
                    }
                }
                int i4 = i3;
                while (jK < j2) {
                    long j3 = jK + j;
                    b9 b9Var = c9.c;
                    byte bE3 = b9Var.e(jK);
                    if (bE3 >= 0) {
                        int i5 = i4 + 1;
                        cArr[i4] = (char) bE3;
                        while (j3 < j2 && (bE = c9.c.e(j3)) >= 0) {
                            j3 += j;
                            cArr[i5] = (char) bE;
                            i5++;
                        }
                        i4 = i5;
                        jK = j3;
                    } else if (bE3 < -32) {
                        if (j3 >= j2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        jK += 2;
                        d9.b(bE3, b9Var.e(j3), cArr, i4);
                        i4++;
                    } else if (bE3 < -16) {
                        if (j3 >= j2 - j) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        long j4 = 2 + jK;
                        jK += 3;
                        d9.c(bE3, b9Var.e(j3), b9Var.e(j4), cArr, i4);
                        i4++;
                    } else {
                        if (j3 >= j2 - 2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        byte bE4 = b9Var.e(j3);
                        long j5 = jK + 3;
                        byte bE5 = b9Var.e(2 + jK);
                        jK += 4;
                        d9.a(bE3, bE4, bE5, b9Var.e(j5), cArr, i4);
                        i4 += 2;
                    }
                    j = 1;
                }
                return new String(cArr, 0, i4);
        }
    }

    public static int e(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int f(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int d(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
                i++;
            } else {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i) >= 65536) {
                                i++;
                            } else {
                                throw new e9(i, length2);
                            }
                        }
                    }
                    i++;
                }
                i2 += i3;
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        vq2.f(((long) i2) + 4294967296L, "UTF-8 length does not fit in int: ");
        return 0;
    }
}
