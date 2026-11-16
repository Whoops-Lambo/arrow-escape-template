package defpackage;

import com.google.android.gms.internal.ads.zzhhb;
import com.google.android.gms.internal.ads.zzhpy;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jx4 implements zzhhb {
    public final zzhpy a;

    @Override // com.google.android.gms.internal.ads.zzhhb
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((kx4) it.next()).a.a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        e.d("invalid signature");
    }

    public jx4(zzhpy zzhpyVar) {
        this.a = zzhpyVar;
    }
}
