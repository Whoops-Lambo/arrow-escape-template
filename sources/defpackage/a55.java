package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzcs;
import com.google.android.gms.internal.p002firebaseauthapi.zzcv;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a55 extends zzcs {
    public final String a;
    public final zzcv b;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final boolean a() {
        return this.b != zzcv.e;
    }

    public final String toString() {
        return n30.n("(typeUrl=", this.a, ", outputPrefixType=", this.b.a, ")");
    }

    public a55(String str, zzcv zzcvVar) {
        this.a = str;
        this.b = zzcvVar;
    }
}
