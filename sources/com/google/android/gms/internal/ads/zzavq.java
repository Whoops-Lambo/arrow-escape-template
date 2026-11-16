package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzavq {
    public static final boolean a(short s, int i, byte[] bArr) {
        bArr.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.getClass();
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.putInt(i);
        byte[] bArrArray = byteBufferAllocate.array();
        bArrArray.getClass();
        return Arrays.equals(bArrArray, bArr);
    }
}
