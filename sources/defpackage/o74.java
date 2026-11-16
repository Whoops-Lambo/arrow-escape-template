package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzbt;
import com.google.android.gms.internal.p002firebaseauthapi.zzct;
import com.google.android.gms.internal.p002firebaseauthapi.zzcy;
import com.google.android.gms.internal.p002firebaseauthapi.zzdd;
import com.google.android.gms.internal.p002firebaseauthapi.zzon;
import com.google.android.gms.internal.p002firebaseauthapi.zzpf;
import com.google.android.gms.internal.p002firebaseauthapi.zzqo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class o74 implements zzcy {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcy
    public final zzbt a(zzct zzctVar, zzdd zzddVar) {
        zzpf zzpfVar = zzpf.b;
        return !((zzqo) zzpfVar.a.get()).b.containsKey(zzctVar.a) ? new zzon(zzctVar, zzddVar) : ((zzqo) zzpfVar.a.get()).a(zzctVar, zzddVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcy
    public final zzct b(zzbt zzbtVar, zzdd zzddVar) {
        return ((zzqo) zzpf.b.a.get()).b(zzbtVar, zzddVar);
    }
}
