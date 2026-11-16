package androidx.emoji2.text.flatbuffer;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.d;
import defpackage.vq2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ArrayReadWriteBuf implements ReadWriteBuf {
    public byte[] a;

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public final String a(int i, int i2) {
        byte[] bArr = this.a;
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            vq2.o("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                int i6 = i4 + 1;
                cArr[i4] = (char) b2;
                while (i5 < i3) {
                    byte b3 = bArr[i5];
                    if (b3 < 0) {
                        break;
                    }
                    i5++;
                    cArr[i6] = (char) b3;
                    i6++;
                }
                i4 = i6;
                i = i5;
            } else if (b2 < -32) {
                if (i5 >= i3) {
                    d.r("Invalid UTF-8");
                    return null;
                }
                i += 2;
                byte b4 = bArr[i5];
                int i7 = i4 + 1;
                if (b2 < -62) {
                    d.r("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
                    return null;
                }
                if (Utf8.DecodeUtil.a(b4)) {
                    d.r("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
                    return null;
                }
                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                i4 = i7;
            } else {
                if (b2 >= -16) {
                    if (i5 >= i3 - 2) {
                        d.r("Invalid UTF-8");
                        return null;
                    }
                    byte b5 = bArr[i5];
                    int i8 = i + 3;
                    byte b6 = bArr[i + 2];
                    i += 4;
                    byte b7 = bArr[i8];
                    if (!Utf8.DecodeUtil.a(b5)) {
                        if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !Utf8.DecodeUtil.a(b6) && !Utf8.DecodeUtil.a(b7)) {
                            int i9 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                            cArr[i4] = (char) ((i9 >>> 10) + 55232);
                            cArr[i4 + 1] = (char) ((i9 & 1023) + 56320);
                            i4 += 2;
                        }
                    }
                    d.r("Invalid UTF-8");
                    return null;
                }
                if (i5 >= i3 - 1) {
                    d.r("Invalid UTF-8");
                    return null;
                }
                int i10 = i + 2;
                byte b8 = bArr[i5];
                i += 3;
                byte b9 = bArr[i10];
                int i11 = i4 + 1;
                if (Utf8.DecodeUtil.a(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || Utf8.DecodeUtil.a(b9)))) {
                    d.r("Invalid UTF-8");
                    return null;
                }
                cArr[i4] = (char) (((b8 & 63) << 6) | ((b2 & 15) << 12) | (b9 & 63));
                i4 = i11;
            }
        }
        return new String(cArr, 0, i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public final byte get(int i) {
        return this.a[i];
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public final int getInt(int i) {
        byte[] bArr = this.a;
        return (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i + 3] << 24) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public final long getLong(int i) {
        byte[] bArr = this.a;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40);
        return (((long) bArr[i + 7]) << 56) | j | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public final short getShort(int i) {
        byte[] bArr = this.a;
        return (short) ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public final double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public final float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }
}
