package defpackage;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class tn0 extends FirebaseException {

    @NonNull
    private final sn0 a;

    public tn0(@NonNull sn0 sn0Var) {
        this.a = sn0Var;
    }

    public tn0(@NonNull String str, @NonNull sn0 sn0Var) {
        super(str);
        this.a = sn0Var;
    }
}
