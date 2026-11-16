package defpackage;

import com.google.android.gms.internal.fido.zzbo;
import com.google.android.gms.internal.fido.zzft;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ji4 extends zzft implements Serializable {
    public final byte[] b;

    @Override // com.google.android.gms.internal.fido.zzft
    public final int d() {
        byte[] bArr = this.b;
        int length = bArr.length;
        if (length < 4) {
            e32.i(zzbo.a("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
            return 0;
        }
        int i = bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i2 = bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i | (i2 << 8) | (i3 << 16);
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int f() {
        return this.b.length * 8;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final byte[] h() {
        return this.b;
    }

    public ji4(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final boolean g(zzft zzftVar) {
        boolean z;
        int length = zzftVar.h().length;
        byte[] bArr = this.b;
        if (bArr.length != length) {
            return false;
        }
        boolean z2 = true;
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == zzftVar.h()[i]) {
                z = true;
            } else {
                z = false;
            }
            z2 &= z;
        }
        return z2;
    }
}
