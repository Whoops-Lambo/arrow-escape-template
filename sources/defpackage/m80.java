package defpackage;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.gms.internal.ads.zzagp;
import com.inmobi.media.core.config.models.AdConfig;
import io.p071bidmachine.media3.extractor.mkv.d;
import io.p071bidmachine.media3.extractor.n;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m80 implements sf0 {
    public final byte[] a;
    public final ArrayDeque b;
    public int c;
    public int d;
    public long e;
    public final Object f;
    public Object g;

    public long a(ExtractorInput extractorInput, int i) {
        byte[] bArr = this.a;
        extractorInput.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        return j;
    }

    public long b(n nVar, int i) {
        byte[] bArr = this.a;
        nVar.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        return j;
    }

    public long c(zzagp zzagpVar, int i) {
        byte[] bArr = this.a;
        zzagpVar.h(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        return j;
    }

    public m80(int i) {
        switch (i) {
            case 1:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new d();
                break;
            case 2:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new vr3();
                break;
            default:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new x43();
                break;
        }
    }
}
