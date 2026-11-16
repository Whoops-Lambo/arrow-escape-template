package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzjc;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ha5 extends zzjc {
    public long h;
    public int i;
    public int j;

    public final int h() {
        return this.i;
    }

    public final boolean i() {
        return this.i > 0;
    }

    public final boolean j(zzjc zzjcVar) {
        ByteBuffer byteBuffer;
        zzgvz.a(!zzjcVar.b(1073741824));
        zzgvz.a(!zzjcVar.b(268435456));
        zzgvz.a(!zzjcVar.b(4));
        if (i()) {
            if (this.i >= this.j) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzjcVar.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.i;
        this.i = i + 1;
        if (i == 0) {
            this.e = zzjcVar.e;
            if (zzjcVar.b(1)) {
                this.a = 1;
            }
        }
        ByteBuffer byteBuffer3 = zzjcVar.d;
        if (byteBuffer3 != null) {
            d(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.h = zzjcVar.e;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzjc
    public final void c() {
        super.c();
        this.i = 0;
    }
}
