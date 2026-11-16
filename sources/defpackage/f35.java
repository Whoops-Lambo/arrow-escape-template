package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzbs;
import com.google.android.gms.internal.p002firebaseauthapi.zzot;
import com.google.android.gms.internal.p002firebaseauthapi.zzpu;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f35 implements zzbs {
    public final zzpu a;
    public final zzot b;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.a.a(bArr).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            zzot zzotVar = this.b;
            if (!zHasNext) {
                zzotVar.getClass();
                e.d("decryption failed");
                return null;
            }
            try {
                byte[] bArrA = ((j35) it.next()).a.a(bArr, null);
                zzotVar.getClass();
                return bArrA;
            } catch (GeneralSecurityException unused) {
            }
        }
    }

    public f35(zzpu zzpuVar, zzot zzotVar) {
        this.a = zzpuVar;
        this.b = zzotVar;
    }
}
