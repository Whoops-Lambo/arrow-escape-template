package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kf0 {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final df0 d;
    public final cf0 e;
    public final jf0 f;
    public Bitmap g;

    public static byte[] a(ParsableBitArray parsableBitArray, int i2, int i3) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) parsableBitArray.readBits(i3);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = d(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = d(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = d(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = d(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = d(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = d(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = d(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0197  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:120:0x0203 A[LOOP:3: B:88:0x0156->B:120:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x015c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0166  */
    /* JADX WARN: Code duplicated, block: B:95:0x016c  */
    /* JADX WARN: Code duplicated, block: B:96:0x017c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0182  */
    public static void e(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z;
        int bits;
        int bits2;
        char c;
        char c2;
        int bits3;
        int bits4;
        boolean z2;
        int bits5;
        int bits6;
        int bits7;
        int i5;
        int i6;
        boolean z3;
        int bits8;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        int i7 = i3;
        int i8 = i4;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int i9 = 8;
            int bits9 = parsableBitArray.readBits(8);
            if (bits9 != 240) {
                int i10 = 3;
                int i11 = 2;
                int i12 = 4;
                switch (bits9) {
                    case 16:
                        if (i2 == 3) {
                            bArr3 = bArrA == null ? i : bArrA;
                        } else {
                            if (i2 == 2) {
                                bArr3 = bArrA3 == null ? h : bArrA3;
                            } else {
                                bArr2 = null;
                            }
                            z = false;
                            while (true) {
                                bits = parsableBitArray.readBits(2);
                                if (bits != 0) {
                                    bits3 = bits;
                                    bits4 = 1;
                                } else {
                                    if (parsableBitArray.readBit()) {
                                        int bits10 = parsableBitArray.readBits(3) + 3;
                                        bits3 = parsableBitArray.readBits(2);
                                        bits4 = bits10;
                                    } else {
                                        if (parsableBitArray.readBit()) {
                                            bits4 = 1;
                                            c = '\b';
                                            c2 = 4;
                                        } else {
                                            bits2 = parsableBitArray.readBits(2);
                                            if (bits2 != 0) {
                                                c = '\b';
                                                c2 = 4;
                                                z = true;
                                            } else if (bits2 != 1) {
                                                c = '\b';
                                                c2 = 4;
                                                bits4 = 2;
                                            } else if (bits2 != 2) {
                                                c = '\b';
                                                c2 = 4;
                                                bits4 = parsableBitArray.readBits(4) + 12;
                                                bits3 = parsableBitArray.readBits(2);
                                                z = z;
                                            } else if (bits2 != 3) {
                                                z = z;
                                                c = '\b';
                                                c2 = 4;
                                            } else {
                                                c = '\b';
                                                int bits11 = parsableBitArray.readBits(8) + 29;
                                                bits3 = parsableBitArray.readBits(2);
                                                z = z;
                                                bits4 = bits11;
                                                c2 = 4;
                                            }
                                            bits3 = 0;
                                            bits4 = 0;
                                        }
                                        bits3 = 0;
                                    }
                                    if (bits4 == 0 && paint != null) {
                                        if (bArr2 != 0) {
                                            bits3 = bArr2[bits3];
                                        }
                                        paint.setColor(iArr[bits3]);
                                        canvas.drawRect(i7, i8, i7 + bits4, i8 + 1, paint);
                                    }
                                    i7 += bits4;
                                    if (z) {
                                        parsableBitArray.byteAlign();
                                    } else {
                                        paint = paint;
                                        z = z;
                                    }
                                }
                                c = '\b';
                                c2 = 4;
                                if (bits4 == 0) {
                                }
                                i7 += bits4;
                                if (z) {
                                    parsableBitArray.byteAlign();
                                } else {
                                    paint = paint;
                                    z = z;
                                }
                            }
                        }
                        bArr2 = bArr3;
                        z = false;
                        while (true) {
                            bits = parsableBitArray.readBits(2);
                            if (bits != 0) {
                                bits3 = bits;
                                bits4 = 1;
                            } else {
                                if (parsableBitArray.readBit()) {
                                    int bits12 = parsableBitArray.readBits(3) + 3;
                                    bits3 = parsableBitArray.readBits(2);
                                    bits4 = bits12;
                                } else {
                                    if (parsableBitArray.readBit()) {
                                        bits4 = 1;
                                        c = '\b';
                                        c2 = 4;
                                    } else {
                                        bits2 = parsableBitArray.readBits(2);
                                        if (bits2 != 0) {
                                            c = '\b';
                                            c2 = 4;
                                            z = true;
                                        } else if (bits2 != 1) {
                                            c = '\b';
                                            c2 = 4;
                                            bits4 = 2;
                                        } else if (bits2 != 2) {
                                            c = '\b';
                                            c2 = 4;
                                            bits4 = parsableBitArray.readBits(4) + 12;
                                            bits3 = parsableBitArray.readBits(2);
                                            z = z;
                                        } else if (bits2 != 3) {
                                            z = z;
                                            c = '\b';
                                            c2 = 4;
                                        } else {
                                            c = '\b';
                                            int bits13 = parsableBitArray.readBits(8) + 29;
                                            bits3 = parsableBitArray.readBits(2);
                                            z = z;
                                            bits4 = bits13;
                                            c2 = 4;
                                        }
                                        bits3 = 0;
                                        bits4 = 0;
                                    }
                                    bits3 = 0;
                                }
                                if (bits4 == 0) {
                                }
                                i7 += bits4;
                                if (z) {
                                    parsableBitArray.byteAlign();
                                } else {
                                    paint = paint;
                                    z = z;
                                }
                            }
                            c = '\b';
                            c2 = 4;
                            if (bits4 == 0) {
                            }
                            i7 += bits4;
                            if (z) {
                                parsableBitArray.byteAlign();
                            } else {
                                paint = paint;
                                z = z;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i2 == 3 ? bArrA2 == null ? j : bArrA2 : null;
                        boolean z4 = false;
                        while (true) {
                            int bits14 = parsableBitArray.readBits(i12);
                            if (bits14 != 0) {
                                z2 = z4;
                                bits7 = bits14;
                                bits5 = 1;
                            } else if (parsableBitArray.readBit()) {
                                if (parsableBitArray.readBit()) {
                                    int bits15 = parsableBitArray.readBits(i11);
                                    if (bits15 == 0) {
                                        z2 = z4;
                                        bits5 = 1;
                                    } else if (bits15 != 1) {
                                        if (bits15 == i11) {
                                            bits5 = parsableBitArray.readBits(i12) + 9;
                                            bits6 = parsableBitArray.readBits(i12);
                                        } else if (bits15 != i10) {
                                            z2 = z4;
                                            bits5 = 0;
                                        } else {
                                            bits5 = parsableBitArray.readBits(i9) + 25;
                                            bits6 = parsableBitArray.readBits(i12);
                                        }
                                        bits7 = bits6;
                                    } else {
                                        z2 = z4;
                                        bits5 = i11;
                                    }
                                    bits7 = 0;
                                } else {
                                    bits5 = parsableBitArray.readBits(i11) + 4;
                                    bits7 = parsableBitArray.readBits(i12);
                                }
                                z2 = z4;
                            } else {
                                int bits16 = parsableBitArray.readBits(i10);
                                if (bits16 != 0) {
                                    bits5 = bits16 + 2;
                                    z2 = z4;
                                } else {
                                    z2 = true;
                                    bits5 = 0;
                                }
                                bits7 = 0;
                            }
                            if (bits5 == 0 || paint == 0) {
                                i5 = i10;
                                i6 = i11;
                            } else {
                                if (bArr4 != 0) {
                                    bits7 = bArr4[bits7];
                                }
                                paint.setColor(iArr[bits7]);
                                i5 = i10;
                                i6 = 2;
                                canvas.drawRect(i7, i8, i7 + bits5, i8 + 1, paint);
                            }
                            i7 += bits5;
                            if (z2) {
                                parsableBitArray.byteAlign();
                            } else {
                                z4 = z2;
                                i10 = i5;
                                i11 = i6;
                                i12 = 4;
                                i9 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z5 = false;
                        while (true) {
                            int bits17 = parsableBitArray.readBits(8);
                            if (bits17 != 0) {
                                z3 = z5;
                                bits8 = 1;
                            } else if (parsableBitArray.readBit()) {
                                z3 = z5;
                                bits8 = parsableBitArray.readBits(7);
                                bits17 = parsableBitArray.readBits(8);
                            } else {
                                int bits18 = parsableBitArray.readBits(7);
                                if (bits18 != 0) {
                                    z3 = z5;
                                    bits8 = bits18;
                                    bits17 = 0;
                                } else {
                                    z3 = true;
                                    bits17 = 0;
                                    bits8 = 0;
                                }
                            }
                            if (bits8 != 0 && paint != 0) {
                                paint.setColor(iArr[bits17]);
                                canvas.drawRect(i7, i8, i7 + bits8, i8 + 1, paint);
                            }
                            i7 += bits8;
                            if (!z3) {
                                z5 = z3;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (bits9) {
                            case 32:
                                bArrA3 = a(parsableBitArray, 4, 4);
                                break;
                            case 33:
                                bArrA = a(parsableBitArray, 4, 8);
                                break;
                            case 34:
                                bArrA2 = a(parsableBitArray, 16, 8);
                                break;
                        }
                        break;
                }
            } else {
                i8 += 2;
                i7 = i3;
            }
        }
    }

    public static cf0 f(ParsableBitArray parsableBitArray, int i2) {
        int[] iArr;
        int bits;
        int i3;
        int bits2;
        int bits3;
        int bits4;
        int i4 = 8;
        int bits5 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int i7 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i6 > 0) {
            int bits6 = parsableBitArray.readBits(i4);
            int bits7 = parsableBitArray.readBits(i4);
            if ((bits7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (bits7 & 64) != 0 ? iArrB : iArrC;
            }
            if ((bits7 & 1) != 0) {
                bits3 = parsableBitArray.readBits(i4);
                bits4 = parsableBitArray.readBits(i4);
                bits = parsableBitArray.readBits(i4);
                bits2 = parsableBitArray.readBits(i4);
                i3 = i6 - 6;
            } else {
                int bits8 = parsableBitArray.readBits(6) << i5;
                int bits9 = parsableBitArray.readBits(4) << 4;
                bits = parsableBitArray.readBits(4) << 4;
                i3 = i6 - 4;
                bits2 = parsableBitArray.readBits(i5) << 6;
                bits3 = bits8;
                bits4 = bits9;
            }
            if (bits3 == 0) {
                bits4 = i7;
                bits = bits4;
                bits2 = 255;
            }
            double d = bits3;
            double d2 = bits4 - 128;
            double d3 = bits - 128;
            iArr[bits6] = d((byte) (255 - (bits2 & 255)), Util.constrainValue((int) ((1.402d * d2) + d), 0, 255), Util.constrainValue((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), Util.constrainValue((int) ((d3 * 1.772d) + d), 0, 255));
            i6 = i3;
            i7 = 0;
            bits5 = bits5;
            iArrC = iArrC;
            i4 = 8;
            i5 = 2;
        }
        return new cf0(bits5, iArr2, iArrB, iArrC);
    }

    public static ef0 g(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int bits = parsableBitArray.readBits(16);
        parsableBitArray.skipBits(4);
        int bits2 = parsableBitArray.readBits(2);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(1);
        byte[] bArr2 = Util.EMPTY_BYTE_ARRAY;
        if (bits2 != 1) {
            if (bits2 == 0) {
                int bits3 = parsableBitArray.readBits(16);
                int bits4 = parsableBitArray.readBits(16);
                if (bits3 > 0) {
                    bArr2 = new byte[bits3];
                    parsableBitArray.readBytes(bArr2, 0, bits3);
                }
                if (bits4 > 0) {
                    bArr = new byte[bits4];
                    parsableBitArray.readBytes(bArr, 0, bits4);
                }
            }
            return new ef0(bits, bit, bArr2, bArr);
        }
        parsableBitArray.skipBits(parsableBitArray.readBits(8) * 16);
        bArr = bArr2;
        return new ef0(bits, bit, bArr2, bArr);
    }

    public kf0(int i2, int i3) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new df0(719, 575, 0, 719, 0, 575);
        this.e = new cf0(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f = new jf0(i2, i3, 0);
    }
}
