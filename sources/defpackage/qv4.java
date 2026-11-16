package defpackage;

import com.google.android.gms.internal.ads.zzhfw;
import com.google.android.gms.internal.ads.zzhpy;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qv4 implements zzhfw {
    public final zzhpy a;

    @Override // com.google.android.gms.internal.ads.zzhfw
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((pv4) it.next()).a.a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        e.d("decryption failed");
        return null;
    }
}
