package defpackage;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ss2 implements KType {
    public final KClassifier a;
    public final List b;
    public final int c;

    public final String toString() {
        return a(false).concat(" (Kotlin reflection is not available)");
    }

    public final String a(boolean z) {
        String name;
        KClassifier kClassifier = this.a;
        KClass kClass = kClassifier instanceof KClass ? (KClass) kClassifier : null;
        Class clsJ = kClass != null ? vk3.j(kClass) : null;
        if (clsJ == null) {
            name = kClassifier.toString();
        } else if ((this.c & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (!clsJ.isArray()) {
            name = (z && clsJ.isPrimitive()) ? vk3.k((KClass) kClassifier).getName() : clsJ.getName();
        } else if (clsJ.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsJ.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsJ.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsJ.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsJ.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsJ.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsJ.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsJ.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        List list = this.b;
        return h50.i(name, list.isEmpty() ? "" : du.g0(list, ", ", "<", ">", new w01(this), 24), isMarkedNullable() ? "?" : "");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ss2)) {
            return false;
        }
        ss2 ss2Var = (ss2) obj;
        return s71.b(this.a, ss2Var.a) && s71.b(this.b, ss2Var.b) && this.c == ss2Var.c;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return gg0.a;
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        return this.b;
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + pv1.e(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return (this.c & 1) != 0;
    }

    public ss2(KClassifier kClassifier, List list, int i) {
        kClassifier.getClass();
        list.getClass();
        this.a = kClassifier;
        this.b = list;
        this.c = i;
    }
}
