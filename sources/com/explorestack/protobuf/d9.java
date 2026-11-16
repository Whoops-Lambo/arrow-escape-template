package com.explorestack.protobuf;

import defpackage.m93;
import defpackage.vq2;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class d9 {
    public static final x7 b = new x7();
    public static final y7 c = new y7();
    public final /* synthetic */ int a;

    public static void b(byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (b2 < -62 || h(b3)) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static String e(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            vq2.o("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b2 = byteBuffer.get(i);
            if (b2 < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b2;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b3 = byteBuffer.get(i);
            if (b3 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b3;
                int i8 = i6;
                while (i8 < i3) {
                    byte b4 = byteBuffer.get(i8);
                    if (b4 < 0) {
                        break;
                    }
                    i8++;
                    cArr[i7] = (char) b4;
                    i7++;
                }
                i5 = i7;
                i = i8;
            } else if (b3 < -32) {
                if (i6 >= i3) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                i += 2;
                b(b3, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (b3 < -16) {
                if (i6 >= i3 - 1) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                int i9 = i + 2;
                i += 3;
                c(b3, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                byte b5 = byteBuffer.get(i6);
                int i10 = i + 3;
                byte b6 = byteBuffer.get(i + 2);
                i += 4;
                a(b3, b5, b6, byteBuffer.get(i10), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    public static String g(z5 z5Var) {
        byte bByteAt;
        StringBuilder sb = new StringBuilder(z5Var.d());
        for (int i = 0; i < z5Var.d(); i++) {
            switch (z5Var.a) {
                case 3:
                    bByteAt = ((ByteString) z5Var.b).byteAt(i);
                    break;
                default:
                    bByteAt = ((byte[]) z5Var.b)[i];
                    break;
            }
            if (bByteAt == 34) {
                sb.append("\\\"");
            } else if (bByteAt == 39) {
                sb.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean h(byte b2) {
        return b2 > -65;
    }

    public static int k(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byte b2;
        int i4;
        byte b3;
        int i5;
        int i6 = i2;
        if (i != 0) {
            if (i6 >= i3) {
                return i;
            }
            byte b4 = (byte) i;
            if (b4 < -32) {
                if (b4 < -62) {
                    return -1;
                }
                int i7 = i6 + 1;
                if (byteBuffer.get(i6) > -65) {
                    return -1;
                }
                i6 = i7;
            } else if (b4 < -16) {
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i5 = i6 + 1;
                    b3 = byteBuffer.get(i6);
                    if (i5 >= i3) {
                        return f9.e(b4, b3);
                    }
                } else {
                    b3 = b5;
                    i5 = i6;
                }
                if (b3 > -65) {
                    return -1;
                }
                if (b4 == -32 && b3 < -96) {
                    return -1;
                }
                if (b4 == -19 && b3 >= -96) {
                    return -1;
                }
                i6 = i5 + 1;
                if (byteBuffer.get(i5) > -65) {
                    return -1;
                }
            } else {
                byte b6 = (byte) (~(i >> 8));
                if (b6 == 0) {
                    i4 = i6 + 1;
                    b6 = byteBuffer.get(i6);
                    if (i4 >= i3) {
                        return f9.e(b4, b6);
                    }
                    b2 = 0;
                } else {
                    b2 = (byte) (i >> 16);
                    i4 = i6;
                }
                if (b2 == 0) {
                    int i8 = i4 + 1;
                    byte b7 = byteBuffer.get(i4);
                    if (i8 >= i3) {
                        return f9.f(b4, b6, b7);
                    }
                    b2 = b7;
                    i4 = i8;
                }
                if (b6 > -65) {
                    return -1;
                }
                if ((((b6 + 112) + (b4 << 28)) >> 30) != 0 || b2 > -65) {
                    return -1;
                }
                i6 = i4 + 1;
                if (byteBuffer.get(i4) > -65) {
                    return -1;
                }
            }
        }
        d9 d9Var = f9.a;
        int i9 = i3 - 7;
        int i10 = i6;
        while (i10 < i9 && (byteBuffer.getLong(i10) & (-9187201950435737472L)) == 0) {
            i10 += 8;
        }
        int i11 = (i10 - i6) + i6;
        while (i11 < i3) {
            int i12 = i11 + 1;
            byte b8 = byteBuffer.get(i11);
            if (b8 >= 0) {
                i11 = i12;
            } else if (b8 < -32) {
                if (i12 >= i3) {
                    return b8;
                }
                if (b8 < -62 || byteBuffer.get(i12) > -65) {
                    return -1;
                }
                i11 += 2;
            } else if (b8 < -16) {
                if (i12 >= i3 - 1) {
                    return f9.b(byteBuffer, b8, i12, i3 - i12);
                }
                int i13 = i11 + 2;
                byte b9 = byteBuffer.get(i12);
                if (b9 > -65) {
                    return -1;
                }
                if (b8 == -32 && b9 < -96) {
                    return -1;
                }
                if ((b8 == -19 && b9 >= -96) || byteBuffer.get(i13) > -65) {
                    return -1;
                }
                i11 += 3;
            } else {
                if (i12 >= i3 - 2) {
                    return f9.b(byteBuffer, b8, i12, i3 - i12);
                }
                int i14 = i11 + 2;
                byte b10 = byteBuffer.get(i12);
                if (b10 > -65) {
                    return -1;
                }
                if ((((b10 + 112) + (b8 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i15 = i11 + 3;
                if (byteBuffer.get(i14) > -65) {
                    return -1;
                }
                i11 += 4;
                if (byteBuffer.get(i15) > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static int m(int i, int i2, long j) {
        if (i2 == 0) {
            d9 d9Var = f9.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return f9.e(i, c9.c.e(j));
        }
        if (i2 == 2) {
            b9 b9Var = c9.c;
            return f9.f(i, b9Var.e(j), b9Var.e(j + 1));
        }
        io.p071bidmachine.media3.extractor.ts.y.o();
        return 0;
    }

    public static int n(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            d9 d9Var = f9.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return f9.e(i, c9.g(j, bArr));
        }
        if (i2 == 2) {
            return f9.f(i, c9.g(j, bArr), c9.g(j + 1, bArr));
        }
        io.p071bidmachine.media3.extractor.ts.y.o();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[LOOP:2: B:16:0x003d->B:19:0x0046, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8 A[LOOP:5: B:52:0x00f2->B:55:0x00f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0108  */
    /* JADX WARN: Code duplicated, block: B:65:0x011e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0136  */
    /* JADX WARN: Code duplicated, block: B:79:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00ed A[SYNTHETIC] */
    public final String d(int i, int i2, byte[] bArr) throws InvalidProtocolBufferException {
        int i3;
        int i4;
        byte b2;
        int i5;
        byte b3;
        int i6;
        int i7;
        byte bG;
        int i8;
        byte bG2;
        switch (this.a) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    vq2.o("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                    return null;
                }
                int i9 = i + i2;
                char[] cArr = new char[i2];
                int i10 = 0;
                while (i < i9) {
                    byte b4 = bArr[i];
                    if (b4 < 0) {
                        i3 = i10;
                        while (i < i9) {
                            i4 = i + 1;
                            b2 = bArr[i];
                            if (b2 >= 0) {
                                i5 = i3 + 1;
                                cArr[i3] = (char) b2;
                                while (i4 < i9) {
                                    b3 = bArr[i4];
                                    if (b3 >= 0) {
                                        i4++;
                                        cArr[i5] = (char) b3;
                                        i5++;
                                    } else {
                                        i3 = i5;
                                        i = i4;
                                    }
                                }
                                i3 = i5;
                                i = i4;
                            } else if (b2 < -32) {
                                if (i4 < i9) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                i += 2;
                                b(b2, bArr[i4], cArr, i3);
                                i3++;
                            } else if (b2 < -16) {
                                if (i4 < i9 - 1) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                int i11 = i + 2;
                                i += 3;
                                c(b2, bArr[i4], bArr[i11], cArr, i3);
                                i3++;
                            } else {
                                if (i4 < i9 - 2) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                byte b5 = bArr[i4];
                                int i12 = i + 3;
                                byte b6 = bArr[i + 2];
                                i += 4;
                                a(b2, b5, b6, bArr[i12], cArr, i3);
                                i3 += 2;
                            }
                        }
                        return new String(cArr, 0, i3);
                    }
                    i++;
                    cArr[i10] = (char) b4;
                    i10++;
                }
                i3 = i10;
                while (i < i9) {
                    i4 = i + 1;
                    b2 = bArr[i];
                    if (b2 >= 0) {
                        i5 = i3 + 1;
                        cArr[i3] = (char) b2;
                        while (i4 < i9) {
                            b3 = bArr[i4];
                            if (b3 >= 0) {
                                i4++;
                                cArr[i5] = (char) b3;
                                i5++;
                            } else {
                                i3 = i5;
                                i = i4;
                            }
                        }
                        i3 = i5;
                        i = i4;
                    } else if (b2 < -32) {
                        if (i4 < i9) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        i += 2;
                        b(b2, bArr[i4], cArr, i3);
                        i3++;
                    } else if (b2 < -16) {
                        if (i4 < i9 - 1) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        int i13 = i + 2;
                        i += 3;
                        c(b2, bArr[i4], bArr[i13], cArr, i3);
                        i3++;
                    } else {
                        if (i4 < i9 - 2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        byte b7 = bArr[i4];
                        int i14 = i + 3;
                        byte b8 = bArr[i + 2];
                        i += 4;
                        a(b2, b7, b8, bArr[i14], cArr, i3);
                        i3 += 2;
                    }
                }
                return new String(cArr, 0, i3);
            default:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    vq2.o("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                    return null;
                }
                int i15 = i + i2;
                char[] cArr2 = new char[i2];
                int i16 = 0;
                while (i < i15) {
                    byte bG3 = c9.g(i, bArr);
                    if (bG3 < 0) {
                        i6 = i16;
                        while (i < i15) {
                            i7 = i + 1;
                            bG = c9.g(i, bArr);
                            if (bG >= 0) {
                                i8 = i6 + 1;
                                cArr2[i6] = (char) bG;
                                while (i7 < i15) {
                                    bG2 = c9.g(i7, bArr);
                                    if (bG2 >= 0) {
                                        i7++;
                                        cArr2[i8] = (char) bG2;
                                        i8++;
                                    } else {
                                        i6 = i8;
                                        i = i7;
                                    }
                                }
                                i6 = i8;
                                i = i7;
                            } else if (bG < -32) {
                                if (i7 < i15) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                i += 2;
                                b(bG, c9.g(i7, bArr), cArr2, i6);
                                i6++;
                            } else if (bG < -16) {
                                if (i7 < i15 - 1) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                int i17 = i + 2;
                                i += 3;
                                c(bG, c9.g(i7, bArr), c9.g(i17, bArr), cArr2, i6);
                                i6++;
                            } else {
                                if (i7 < i15 - 2) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                byte bG4 = c9.g(i7, bArr);
                                int i18 = i + 3;
                                byte bG5 = c9.g(i + 2, bArr);
                                i += 4;
                                a(bG, bG4, bG5, c9.g(i18, bArr), cArr2, i6);
                                i6 += 2;
                            }
                        }
                        return new String(cArr2, 0, i6);
                    }
                    i++;
                    cArr2[i16] = (char) bG3;
                    i16++;
                }
                i6 = i16;
                while (i < i15) {
                    i7 = i + 1;
                    bG = c9.g(i, bArr);
                    if (bG >= 0) {
                        i8 = i6 + 1;
                        cArr2[i6] = (char) bG;
                        while (i7 < i15) {
                            bG2 = c9.g(i7, bArr);
                            if (bG2 >= 0) {
                                i7++;
                                cArr2[i8] = (char) bG2;
                                i8++;
                            } else {
                                i6 = i8;
                                i = i7;
                            }
                        }
                        i6 = i8;
                        i = i7;
                    } else if (bG < -32) {
                        if (i7 < i15) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        i += 2;
                        b(bG, c9.g(i7, bArr), cArr2, i6);
                        i6++;
                    } else if (bG < -16) {
                        if (i7 < i15 - 1) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        int i19 = i + 2;
                        i += 3;
                        c(bG, c9.g(i7, bArr), c9.g(i19, bArr), cArr2, i6);
                        i6++;
                    } else {
                        if (i7 < i15 - 2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        byte bG6 = c9.g(i7, bArr);
                        int i110 = i + 3;
                        byte bG7 = c9.g(i + 2, bArr);
                        i += 4;
                        a(bG, bG6, bG7, c9.g(i110, bArr), cArr2, i6);
                        i6 += 2;
                    }
                }
                return new String(cArr2, 0, i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    public final int f(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        long j;
        long j2;
        int i5;
        char cCharAt3;
        char c2 = 2048;
        char c3 = 57343;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 >= i6 || (cCharAt2 = str.charAt(i7)) >= 128) {
                        if (i7 == length) {
                            return i + length;
                        }
                        i3 = i + i7;
                        while (i7 < length) {
                            cCharAt = str.charAt(i7);
                            if (cCharAt >= 128 && i3 < i6) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i6 - 2) {
                                int i9 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i9] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i6 - 3) {
                                    if (i3 > i6 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new e9(i7, length);
                                        }
                                        vq2.c(cCharAt, i3);
                                        return 0;
                                    }
                                    int i10 = i7 + 1;
                                    if (i10 != str.length()) {
                                        char cCharAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                                            i7 = i10;
                                        } else {
                                            i7 = i10;
                                        }
                                    }
                                    throw new e9(i7 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | 128);
                            }
                            i7++;
                        }
                        return i3;
                    }
                    bArr[i8] = (byte) cCharAt2;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                i3 = i + i7;
                while (i7 < length) {
                    cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i15 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i15] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i16 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i19 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i19] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i110 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | 128);
                    }
                    i7++;
                }
                return i3;
            default:
                long j3 = i;
                long j4 = ((long) i2) + j3;
                int length2 = str.length();
                if (length2 <= i2 && bArr.length - i2 >= i) {
                    int i20 = 0;
                    while (true) {
                        j = 1;
                        if (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                            c9.l(bArr, j3, (byte) cCharAt3);
                            i20++;
                            j3 = 1 + j3;
                        }
                    }
                    if (i20 != length2) {
                        while (i20 < length2) {
                            char cCharAt5 = str.charAt(i20);
                            if (cCharAt5 < 128 && j3 < j4) {
                                c9.l(bArr, j3, (byte) cCharAt5);
                                j2 = j;
                                j3 += j;
                            } else if (cCharAt5 >= c2 || j3 > j4 - 2) {
                                j2 = j;
                                if ((cCharAt5 < 55296 || c3 < cCharAt5) && j3 <= j4 - 3) {
                                    c9.l(bArr, j3, (byte) ((cCharAt5 >>> '\f') | 480));
                                    long j5 = j3 + 2;
                                    c9.l(bArr, j3 + j2, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                                    j3 += 3;
                                    c9.l(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                                } else {
                                    if (j3 <= j4 - 4) {
                                        int i21 = i20 + 1;
                                        if (i21 != length2) {
                                            char cCharAt6 = str.charAt(i21);
                                            if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                                int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                                c9.l(bArr, j3, (byte) ((codePoint2 >>> 18) | 240));
                                                c9.l(bArr, j3 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                long j6 = j3 + 3;
                                                c9.l(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                j3 += 4;
                                                c9.l(bArr, j6, (byte) ((codePoint2 & 63) | 128));
                                                i20 = i21;
                                            } else {
                                                i20 = i21;
                                            }
                                        }
                                        throw new e9(i20 - 1, length2);
                                    }
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i20 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new e9(i20, length2);
                                    }
                                    m93.e(cCharAt5, j3);
                                }
                            } else {
                                j2 = j;
                                long j7 = j3 + j2;
                                c9.l(bArr, j3, (byte) ((cCharAt5 >>> 6) | 960));
                                j3 += 2;
                                c9.l(bArr, j7, (byte) ((cCharAt5 & '?') | 128));
                            }
                            i20++;
                            j = j2;
                            c2 = 2048;
                            c3 = 57343;
                        }
                    }
                    return (int) j3;
                }
                vq2.p(str.charAt(length2 - 1), i + i2);
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0148  */
    /* JADX WARN: Code duplicated, block: B:105:0x0152  */
    /* JADX WARN: Code duplicated, block: B:156:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:161:0x0208 A[ADDED_TO_REGION, LOOP:4: B:161:0x0208->B:246:0x0208, LOOP_START, PHI: r1
  0x0208: PHI (r1v3 int) = (r1v2 int), (r1v7 int) binds: [B:159:0x0205, B:246:0x0208] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x020c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x021a  */
    /* JADX WARN: Code duplicated, block: B:176:0x022c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x024a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0250  */
    /* JADX WARN: Code duplicated, block: B:192:0x0259  */
    /* JADX WARN: Code duplicated, block: B:194:0x025f  */
    /* JADX WARN: Code duplicated, block: B:199:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:? A[PHI: r1
  PHI (r1v1 int) = (r1v0 int), (r1v13 int), (r1v19 int), (r1v22 int) binds: [B:110:0x0177, B:153:0x01f9, B:134:0x01b6, B:119:0x0189] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x018c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0105  */
    /* JADX WARN: Code duplicated, block: B:87:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x0135  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (com.explorestack.protobuf.c9.g(r13, r24) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        if (com.explorestack.protobuf.c9.g(r13, r24) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
    
        if (com.explorestack.protobuf.c9.g(r13, r24) > (-65)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(int r21, int r22, int r23, byte[] r24) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.d9.i(int, int, int, byte[]):int");
    }

    /* JADX WARN: Code duplicated, block: B:109:0x018a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0196  */
    /* JADX WARN: Code duplicated, block: B:113:0x019f  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:123:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0140  */
    /* JADX WARN: Code duplicated, block: B:86:0x0148  */
    /* JADX WARN: Code duplicated, block: B:88:0x014c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0157  */
    /* JADX WARN: Code duplicated, block: B:97:0x0166  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r0.e(r4) > (-65)) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        if (r0.e(r4) > (-65)) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dd, code lost:
    
        if (r0.e(r4) > (-65)) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int j(java.nio.ByteBuffer r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.d9.j(java.nio.ByteBuffer, int, int, int):int");
    }

    public static void a(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (!h(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !h(b4) && !h(b5)) {
                int i2 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static void c(byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (!h(b3) && ((b2 != -32 || b3 >= -96) && ((b2 != -19 || b3 < -96) && !h(b4)))) {
            cArr[i] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
            return;
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static Object l(r rVar, l9 l9Var, int i) {
        switch (l9Var.ordinal()) {
            case 0:
                return Double.valueOf(rVar.n());
            case 1:
                return Float.valueOf(rVar.r());
            case 2:
                return Long.valueOf(rVar.u());
            case 3:
                return Long.valueOf(rVar.H());
            case 4:
                return Integer.valueOf(rVar.t());
            case 5:
                return Long.valueOf(rVar.q());
            case 6:
                return Integer.valueOf(rVar.p());
            case 7:
                return Boolean.valueOf(rVar.l());
            case 8:
                if (i != 1) {
                    if (i != 2) {
                        return rVar.m();
                    }
                    return rVar.E();
                }
                return rVar.D();
            case 9:
                defpackage.d.r("readPrimitiveField() cannot handle nested groups.");
                return null;
            case 10:
                defpackage.d.r("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case 11:
                return rVar.m();
            case 12:
                return Integer.valueOf(rVar.G());
            case 13:
                defpackage.d.r("readPrimitiveField() cannot handle enums.");
                return null;
            case 14:
                return Integer.valueOf(rVar.z());
            case 15:
                return Long.valueOf(rVar.A());
            case 16:
                return Integer.valueOf(rVar.B());
            case 17:
                return Long.valueOf(rVar.C());
            default:
                io.p071bidmachine.media3.extractor.ts.y.j("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }
}
