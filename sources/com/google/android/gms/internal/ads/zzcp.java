package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface zzcp {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    default long a(long j) {
        return j;
    }

    void b(ByteBuffer byteBuffer);

    zzcl c(zzcl zzclVar);

    boolean zzc();

    void zze();

    ByteBuffer zzf();

    boolean zzg();

    void zzj();

    default void zzh() {
        throw new IllegalStateException("AudioProcessor must implement at least one #flush() overload.");
    }

    default void d(zzcn zzcnVar) {
        zzh();
        throw null;
    }
}
