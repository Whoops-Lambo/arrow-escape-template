package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class p32 {
    public static final r32 a;
    public static final KClass[] b;

    static {
        r32 r32Var = null;
        try {
            r32Var = (r32) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r32Var == null) {
            r32Var = new r32();
        }
        a = r32Var;
        b = new KClass[0];
    }

    public static vr a(Class cls) {
        a.getClass();
        return new vr(cls);
    }

    public static ss2 b(ss2 ss2Var) {
        a.getClass();
        return new ss2(ss2Var.a, ss2Var.b, ss2Var.c | 2);
    }

    public static void c(qs2 qs2Var, ss2 ss2Var) {
        r32 r32Var = a;
        List listSingletonList = Collections.singletonList(ss2Var);
        r32Var.getClass();
        listSingletonList.getClass();
        if (qs2Var.c == null) {
            qs2Var.c = listSingletonList;
        } else {
            e32.g(qs2Var, "' have already been initialized.", "Upper bounds of type parameter '");
        }
    }

    public static ss2 g(KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        vr vrVarA = a(Map.class);
        List listAsList = Arrays.asList(kTypeProjection, kTypeProjection2);
        a.getClass();
        listAsList.getClass();
        return new ss2(vrVarA, listAsList, 0);
    }

    public static ss2 d(Class cls) {
        vr vrVarA = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        list.getClass();
        return new ss2(vrVarA, list, 0);
    }

    public static ss2 e(Class cls, KTypeProjection kTypeProjection) {
        vr vrVarA = a(cls);
        List listSingletonList = Collections.singletonList(kTypeProjection);
        a.getClass();
        listSingletonList.getClass();
        return new ss2(vrVarA, listSingletonList, 0);
    }

    public static ss2 f(Class cls, KTypeProjection... kTypeProjectionArr) {
        vr vrVarA = a(cls);
        List listO0 = n8.o0(kTypeProjectionArr);
        a.getClass();
        return new ss2(vrVarA, listO0, 0);
    }
}
