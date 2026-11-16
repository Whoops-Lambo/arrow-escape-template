package defpackage;

import androidx.annotation.NonNull;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.MultiFactorResolver;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class nn0 extends FirebaseAuthException {
    private MultiFactorResolver a;

    public nn0(@NonNull String str, @NonNull String str2, @NonNull MultiFactorResolver multiFactorResolver) {
        super(str, str2);
        this.a = multiFactorResolver;
    }
}
