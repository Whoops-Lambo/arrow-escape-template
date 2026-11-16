package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzjf {
    public final HashMap a;

    public final void d(String str, String str2) {
        this.a.put(str, str2);
    }

    public final void e(String str, ByteBuffer byteBuffer) {
        HashMap map = this.a;
        if (byteBuffer == null) {
            map.put(str, null);
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer.duplicate());
        byteBufferAllocate.flip();
        map.put(str, byteBufferAllocate);
    }

    public final void a(String str, int i) {
        this.a.put(str, Integer.valueOf(i));
    }

    public final void b(long j, String str) {
        this.a.put(str, Long.valueOf(j));
    }

    public final void c(String str, float f) {
        this.a.put(str, Float.valueOf(f));
    }

    public zzjf() {
        this.a = new HashMap();
    }
}
