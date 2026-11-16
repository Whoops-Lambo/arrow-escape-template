package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzpj {
    public static final zzaau a = zzaau.a(new byte[0]);

    public static final zzaau a(int i) {
        return zzaau.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zzaau b(int i) {
        return zzaau.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
