package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kn0 implements g05 {
    public final /* synthetic */ FirebaseAuth a;

    public kn0(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.a = firebaseAuth;
    }

    @Override // defpackage.g05
    public final void b(zzaia zzaiaVar, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(zzaiaVar);
        Preconditions.checkNotNull(firebaseUser);
        firebaseUser.zza(zzaiaVar);
        this.a.zza(firebaseUser, zzaiaVar, true);
    }
}
