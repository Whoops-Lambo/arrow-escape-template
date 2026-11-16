package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hm extends OutputStream {
    public final /* synthetic */ int a;

    private final void b(int i) {
    }

    private final void d(int i) {
    }

    public /* synthetic */ hm(int i) {
        this.a = i;
    }

    public final String toString() {
        switch (this.a) {
        }
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                bArr.getClass();
                fs1.m(i, i2 + i, bArr.length);
                break;
            default:
                bArr.getClass();
                zzgvz.k(i, i2 + i, bArr.length);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.a) {
            case 0:
                bArr.getClass();
                break;
            default:
                bArr.getClass();
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.a;
    }
}
