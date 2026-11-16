package defpackage;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.internal.fido.zzbl;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ez3 extends zzbl {
    public final PublicKeyCredentialParameters a;

    @Override // com.google.android.gms.internal.fido.zzbl
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final Object d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ez3) {
            return this.a.equals(((ez3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return pv1.n("Optional.of(", this.a.toString(), ")");
    }

    public ez3(PublicKeyCredentialParameters publicKeyCredentialParameters) {
        this.a = publicKeyCredentialParameters;
    }
}
