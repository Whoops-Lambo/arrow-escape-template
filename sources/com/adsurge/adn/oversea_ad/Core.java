package com.adsurge.adn.oversea_ad;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Core {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long a(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int length = bArr.length;
        long j = -4132994306676758123L;
        long j2 = ((long) length) * (-4132994306676758123L);
        int i = length >> 3;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 << 3;
            long j3 = j;
            long j4 = ((((long) byteBufferWrap.get(i3)) & 255) + ((((long) byteBufferWrap.get(i3 + 1)) & 255) << 8) + ((((long) byteBufferWrap.get(i3 + 2)) & 255) << 16) + ((((long) byteBufferWrap.get(i3 + 3)) & 255) << 24) + ((((long) byteBufferWrap.get(i3 + 4)) & 255) << 32) + ((((long) byteBufferWrap.get(i3 + 5)) & 255) << 40) + ((((long) byteBufferWrap.get(i3 + 6)) & 255) << 48) + ((((long) byteBufferWrap.get(i3 + 7)) & 255) << 56)) * j3;
            j2 = (j2 ^ ((j4 ^ (j4 >>> 47)) * j3)) * j3;
            i2++;
            j = j3;
        }
        long j5 = j;
        int i4 = length & 7;
        switch (i4) {
            case 1:
                j2 = (((long) byteBufferWrap.get(length - i4)) ^ j2) * j5;
                break;
            case 2:
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 1)) << 8;
                j2 = (((long) byteBufferWrap.get(length - i4)) ^ j2) * j5;
                break;
            case 3:
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 2)) << 16;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 1)) << 8;
                j2 = (((long) byteBufferWrap.get(length - i4)) ^ j2) * j5;
                break;
            case 4:
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 3)) << 24;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 2)) << 16;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 1)) << 8;
                j2 = (((long) byteBufferWrap.get(length - i4)) ^ j2) * j5;
                break;
            case 5:
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 4)) << 32;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 3)) << 24;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 2)) << 16;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 1)) << 8;
                j2 = (((long) byteBufferWrap.get(length - i4)) ^ j2) * j5;
                break;
            case 6:
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 5)) << 40;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 4)) << 32;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 3)) << 24;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 2)) << 16;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 1)) << 8;
                j2 = (((long) byteBufferWrap.get(length - i4)) ^ j2) * j5;
                break;
            case 7:
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 6)) << 48;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 5)) << 40;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 4)) << 32;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 3)) << 24;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 2)) << 16;
                j2 ^= ((long) byteBufferWrap.get((length - i4) + 1)) << 8;
                j2 = (((long) byteBufferWrap.get(length - i4)) ^ j2) * j5;
                break;
        }
        long j6 = ((j2 >>> 47) ^ j2) * j5;
        return j6 ^ (j6 >>> 47);
    }
}
