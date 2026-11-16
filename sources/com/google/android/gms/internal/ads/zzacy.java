package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzacy {
    public static void a(ByteBuffer byteBuffer, boolean z) {
        boolean z2;
        ArrayList arrayListA = zzhb.a(byteBuffer.asReadOnlyBuffer());
        int size = arrayListA.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListA.get(i);
            i++;
            zzgz zzgzVar = (zzgz) obj;
            int i2 = zzgzVar.a;
            ByteBuffer byteBuffer2 = zzgzVar.b;
            if (i2 == 5) {
                if (i2 == 5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                try {
                    zzgvz.a(z2);
                    ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                    if (zzhb.b(byteBufferAsReadOnlyBuffer) == 4) {
                        if (z) {
                            byte[] bArr = zzdr.a;
                            if (!zzdr.f(byteBufferAsReadOnlyBuffer, byteBufferAsReadOnlyBuffer.position(), byteBufferAsReadOnlyBuffer.limit())) {
                            }
                        }
                        byteBuffer.put(byteBuffer2.position(), (byte) 31);
                    }
                } catch (BufferUnderflowException unused) {
                }
            }
        }
    }
}
