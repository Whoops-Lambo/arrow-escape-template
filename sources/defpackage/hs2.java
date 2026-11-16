package defpackage;

import com.google.gson.Gson;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class hs2 implements fs2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ es2 c;

    public /* synthetic */ hs2(Object obj, es2 es2Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = es2Var;
    }

    @Override // defpackage.fs2
    public final es2 a(Gson gson, ts2 ts2Var) {
        int i = this.a;
        es2 es2Var = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (ts2Var.a == ((Class) obj)) {
                    return es2Var;
                }
                return null;
            case 1:
                Class<?> cls = ts2Var.a;
                if (((Class) obj).isAssignableFrom(cls)) {
                    return new m8(this, cls);
                }
                return null;
            default:
                if (ts2Var.equals((ts2) obj)) {
                    return es2Var;
                }
                return null;
        }
    }

    public String toString() {
        int i = this.a;
        es2 es2Var = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "Factory[type=" + ((Class) obj).getName() + ",adapter=" + es2Var + C4664b4.j.e;
            case 1:
                return "Factory[typeHierarchy=" + ((Class) obj).getName() + ",adapter=" + es2Var + C4664b4.j.e;
            default:
                return super.toString();
        }
    }
}
