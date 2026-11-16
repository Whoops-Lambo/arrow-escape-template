package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzbd;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ey3 extends zzbd implements Serializable {
    public final byte[] b;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    public final int d() {
        byte[] bArr = this.b;
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (z) {
            return ((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }
        e32.i(zzac.b("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    public final boolean f(zzbd zzbdVar) {
        byte[] bArr = this.b;
        if (bArr.length != zzbdVar.i().length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            z &= bArr[i] == zzbdVar.i()[i];
        }
        return z;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    public final int g() {
        return this.b.length << 3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    public final byte[] h() {
        return (byte[]) this.b.clone();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    public final byte[] i() {
        return this.b;
    }

    public ey3(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }
}
