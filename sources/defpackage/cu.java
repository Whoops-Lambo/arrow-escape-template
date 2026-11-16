package defpackage;

import com.google.gson.Gson;
import com.ironsource.C4664b4;
import com.singular.sdk.internal.UserDetailsUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class cu implements fs2 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ cu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fs2
    public final es2 a(Gson gson, ts2 ts2Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Type type = ts2Var.b;
                Class cls = ts2Var.a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                eu.e(Collection.class.isAssignableFrom(cls));
                Type typeK = uu.K(type, cls, uu.u(type, cls, Collection.class), new HashMap());
                if (typeK instanceof WildcardType) {
                    typeK = ((WildcardType) typeK).getUpperBounds()[0];
                }
                Type type2 = typeK instanceof ParameterizedType ? ((ParameterizedType) typeK).getActualTypeArguments()[0] : Object.class;
                return new m8(gson, type2, gson.getAdapter(new ts2(type2)), ((mx) obj).a(ts2Var));
            default:
                Class cls2 = ts2Var.a;
                if (cls2 == Calendar.class || cls2 == GregorianCalendar.class) {
                    return (jv0) obj;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + UserDetailsUtils.UserDetailsLiterals.PLUS + GregorianCalendar.class.getName() + ",adapter=" + ((jv0) this.b) + C4664b4.j.e;
            default:
                return super.toString();
        }
    }
}
