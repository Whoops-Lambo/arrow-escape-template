package defpackage;

import com.singular.sdk.internal.UserDetailsUtils;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c52 implements y02 {
    public final Set a;
    public final y02 b;

    @Override // defpackage.y02
    public final void a(xh0 xh0Var) {
        if (this.a.contains(a50.class)) {
            this.b.a(xh0Var);
        } else {
            e32.l(xh0Var, UserDetailsUtils.UserDetailsLiterals.DOT, "Attempting to publish an undeclared event ");
        }
    }

    public c52(Set set, y02 y02Var) {
        this.a = set;
        this.b = y02Var;
    }
}
