package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhpo {
    public static final zzidx a = zzidx.a(new byte[0]);

    public static final zzidx a(int i) {
        return zzidx.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zzidx b(int i) {
        return zzidx.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
