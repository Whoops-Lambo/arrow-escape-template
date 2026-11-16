package com.google.protobuf;

import defpackage.c43;
import defpackage.ek2;
import defpackage.vq2;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class i2 {
    public final boolean c(int i, int i2, byte[] bArr) {
        return d(0, i, i2, bArr) == 0;
    }

    public abstract int d(int i, int i2, int i3, byte[] bArr);

    public abstract int g(ByteBuffer byteBuffer, int i, int i2, int i3);

    public static String a(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            vq2.o("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (b2 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                int i8 = i6;
                while (i8 < i3) {
                    byte b3 = byteBuffer.get(i8);
                    if (b3 < 0) {
                        break;
                    }
                    i8++;
                    cArr[i7] = (char) b3;
                    i7++;
                }
                i5 = i7;
                i = i8;
            } else if (b2 < -32) {
                if (i6 >= i3) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                i += 2;
                ek2.b(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                int i9 = i + 2;
                i += 3;
                ek2.c(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                byte b4 = byteBuffer.get(i6);
                int i10 = i + 3;
                byte b5 = byteBuffer.get(i + 2);
                i += 4;
                ek2.a(b2, b4, b5, byteBuffer.get(i10), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    public static int f(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6 = i2;
        if (i != 0) {
            if (i6 >= i3) {
                return i;
            }
            byte b3 = (byte) i;
            if (b3 < -32) {
                if (b3 < -62) {
                    return -1;
                }
                int i7 = i6 + 1;
                if (byteBuffer.get(i6) > -65) {
                    return -1;
                }
                i6 = i7;
            } else if (b3 < -16) {
                byte b4 = (byte) (~(i >> 8));
                if (b4 == 0) {
                    i5 = i6 + 1;
                    b2 = byteBuffer.get(i6);
                    if (i5 >= i3) {
                        return k2.g(b3, b2);
                    }
                } else {
                    b2 = b4;
                    i5 = i6;
                }
                if (b2 > -65) {
                    return -1;
                }
                if (b3 == -32 && b2 < -96) {
                    return -1;
                }
                if (b3 == -19 && b2 >= -96) {
                    return -1;
                }
                i6 = i5 + 1;
                if (byteBuffer.get(i5) > -65) {
                    return -1;
                }
            } else {
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i6 + 1;
                    b5 = byteBuffer.get(i6);
                    if (i4 >= i3) {
                        return k2.g(b3, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i6;
                }
                if (b == 0) {
                    int i8 = i4 + 1;
                    byte b6 = byteBuffer.get(i4);
                    if (i8 >= i3) {
                        return k2.h(b3, b5, b6);
                    }
                    b = b6;
                    i4 = i8;
                }
                if (b5 > -65) {
                    return -1;
                }
                if ((((b5 + 112) + (b3 << 28)) >> 30) != 0 || b > -65) {
                    return -1;
                }
                i6 = i4 + 1;
                if (byteBuffer.get(i4) > -65) {
                    return -1;
                }
            }
        }
        c43 c43Var = k2.a;
        int i9 = i3 - 7;
        int i10 = i6;
        while (i10 < i9 && (byteBuffer.getLong(i10) & (-9187201950435737472L)) == 0) {
            i10 += 8;
        }
        int i11 = (i10 - i6) + i6;
        while (i11 < i3) {
            int i12 = i11 + 1;
            byte b7 = byteBuffer.get(i11);
            if (b7 >= 0) {
                i11 = i12;
            } else if (b7 < -32) {
                if (i12 >= i3) {
                    return b7;
                }
                if (b7 < -62 || byteBuffer.get(i12) > -65) {
                    return -1;
                }
                i11 += 2;
            } else if (b7 < -16) {
                if (i12 >= i3 - 1) {
                    return k2.b(byteBuffer, b7, i12, i3 - i12);
                }
                int i13 = i11 + 2;
                byte b8 = byteBuffer.get(i12);
                if (b8 > -65) {
                    return -1;
                }
                if (b7 == -32 && b8 < -96) {
                    return -1;
                }
                if ((b7 == -19 && b8 >= -96) || byteBuffer.get(i13) > -65) {
                    return -1;
                }
                i11 += 3;
            } else {
                if (i12 >= i3 - 2) {
                    return k2.b(byteBuffer, b7, i12, i3 - i12);
                }
                int i14 = i11 + 2;
                byte b9 = byteBuffer.get(i12);
                if (b9 > -65) {
                    return -1;
                }
                if ((((b9 + 112) + (b7 << 28)) >> 30) != 0) {
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

    public static void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i, (byte) cCharAt);
                i++;
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        if (i == length) {
            byteBuffer.position(iPosition + i);
            return;
        }
        iPosition += i;
        while (i < length) {
            char cCharAt2 = charSequence.charAt(i);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i2 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i2, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i2;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i2;
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i3 = i + 1;
                    if (i3 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i3);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i4 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    int i5 = iPosition + 2;
                                    try {
                                        byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                        iPosition += 3;
                                        byteBuffer.put(i5, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                        i = i3;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        i = i3;
                                        iPosition = i5;
                                    }
                                } catch (IndexOutOfBoundsException unused4) {
                                    iPosition = i4;
                                    i = i3;
                                }
                            } else {
                                i = i3;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                        i = i3;
                        vq2.p(charSequence.charAt(i), Math.max(i, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position());
                        return;
                    }
                    throw new j2(i, length);
                }
                int i6 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition += 2;
                byteBuffer.put(i6, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    public final int e(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            return d(i, i2 + iArrayOffset, iArrayOffset + i3, byteBuffer.array());
        }
        if (byteBuffer.isDirect()) {
            return g(byteBuffer, i, i2, i3);
        }
        return f(byteBuffer, i, i2, i3);
    }
}
