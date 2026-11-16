package defpackage;

import com.google.gson.Gson;
import com.ironsource.C4664b4;
import com.singular.sdk.internal.UserDetailsUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class is2 implements fs2 {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ es2 c;

    @Override // defpackage.fs2
    public final es2 a(Gson gson, ts2 ts2Var) {
        Class cls = ts2Var.a;
        if (cls == this.a || cls == this.b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.b.getName() + UserDetailsUtils.UserDetailsLiterals.PLUS + this.a.getName() + ",adapter=" + this.c + C4664b4.j.e;
    }

    public is2(Class cls, Class cls2, es2 es2Var) {
        this.a = cls;
        this.b = cls2;
        this.c = es2Var;
    }
}
