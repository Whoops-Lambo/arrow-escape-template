package defpackage;

import com.google.android.gms.internal.ads.zzior;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c34 implements zzior {
    public final ByteBuffer a;

    @Override // com.google.android.gms.internal.ads.zzior
    public final ByteBuffer a(long j, long j2) {
        ByteBuffer byteBuffer = this.a;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit((int) j2);
        byteBuffer.position(iPosition);
        return byteBufferSlice;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.zzior
    public final void j(long j) {
        this.a.position((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzior
    public final int p0(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzior
    public final long zzb() {
        return this.a.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzior
    public final long zzc() {
        return this.a.position();
    }

    public c34(ByteBuffer byteBuffer) {
        this.a = byteBuffer.duplicate();
    }
}
