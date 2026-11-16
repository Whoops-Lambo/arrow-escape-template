package defpackage;

import com.google.gson.Gson;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class l8 implements fs2 {
    public final /* synthetic */ int a;

    public /* synthetic */ l8(int i) {
        this.a = i;
    }

    @Override // defpackage.fs2
    public final es2 a(Gson gson, ts2 ts2Var) {
        switch (this.a) {
            case 0:
                Type type = ts2Var.b;
                boolean z = type instanceof GenericArrayType;
                if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new m8(gson, gson.getAdapter(new ts2(genericComponentType)), uu.x(genericComponentType));
            case 1:
                if (ts2Var.a == Date.class) {
                    return new ai2(2);
                }
                return null;
            case 2:
                if (ts2Var.a == Object.class) {
                    return new wr1(gson);
                }
                return null;
            case 3:
                if (ts2Var.a == java.sql.Date.class) {
                    return new ai2(0);
                }
                return null;
            case 4:
                if (ts2Var.a == Time.class) {
                    return new ai2(1);
                }
                return null;
            case 5:
                if (ts2Var.a != Timestamp.class) {
                    return null;
                }
                return new kv0(gson.getAdapter(Date.class), 3);
            default:
                Class superclass = ts2Var.a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new m8(superclass);
        }
    }
}
