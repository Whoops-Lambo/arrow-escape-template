package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzath {
    public static Pair a(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length >= 22) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            long jCapacity = length - ((long) byteBufferAllocate.capacity());
            randomAccessFile.seek(jCapacity);
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            b(byteBufferAllocate);
            int iCapacity = byteBufferAllocate.capacity();
            if (iCapacity < 22) {
                i2 = -1;
                break;
            }
            int i3 = iCapacity - 22;
            int iMin = Math.min(i3, 65535);
            int i4 = 0;
            while (true) {
                if (i4 >= iMin) {
                    i2 = -1;
                    break;
                }
                i2 = i3 - i4;
                if (byteBufferAllocate.getInt(i2) == 101010256 && ((char) byteBufferAllocate.getShort(i2 + 20)) == i4) {
                    break;
                }
                i4++;
            }
            if (i2 != -1) {
                byteBufferAllocate.position(i2);
                ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
                byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
                return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i2)));
            }
            return null;
        }
        return null;
    }

    public static void b(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        defpackage.d.r("ByteBuffer byte order must be little endian");
    }
}
