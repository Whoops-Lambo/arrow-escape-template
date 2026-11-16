package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzbm;
import com.google.android.gms.internal.p002firebaseauthapi.zzot;
import com.google.android.gms.internal.p002firebaseauthapi.zzpu;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class uz4 implements zzbm {
    public final vy4 a;
    public final zzpu b;
    public final zzot c;
    public final zzot d;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.b.a(bArr).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            zzot zzotVar = this.d;
            if (!zHasNext) {
                zzotVar.getClass();
                e.d("decryption failed");
                return null;
            }
            try {
                byte[] bArrA = ((vy4) it.next()).a.a(bArr, bArr2);
                zzotVar.getClass();
                return bArrA;
            } catch (GeneralSecurityException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzot zzotVar = this.c;
        try {
            byte[] bArrB = this.a.a.b(bArr, bArr2);
            int length = bArr.length;
            zzotVar.getClass();
            return bArrB;
        } catch (GeneralSecurityException e) {
            zzotVar.getClass();
            throw e;
        }
    }

    public uz4(vy4 vy4Var, zzpu zzpuVar, zzot zzotVar, zzot zzotVar2) {
        this.a = vy4Var;
        this.b = zzpuVar;
        this.c = zzotVar;
        this.d = zzotVar2;
    }
}
