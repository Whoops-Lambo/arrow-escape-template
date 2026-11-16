package defpackage;

import androidx.compose.runtime.internal.ComposableLambda;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.reflect.KClass;
import kotlin.reflect.KVisibility;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vr implements KClass, tr {
    public static final Map b;
    public final Class a;

    static {
        List listZ = eu.z(sr0.class, wr0.class, zr0.class, as0.class, bs0.class, cs0.class, ds0.class, es0.class, fs0.class, ComposableLambda.class, tr0.class, ur0.class, vr0.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, yr0.class);
        ArrayList arrayList = new ArrayList(eu.f(listZ, 10));
        int i = 0;
        for (Object obj : listZ) {
            int i2 = i + 1;
            if (i < 0) {
                eu.G();
                throw null;
            }
            arrayList.add(new dt1((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = qh1.g0(arrayList);
    }

    public static void b() {
        throw new nc1();
    }

    @Override // defpackage.tr
    public final Class a() {
        return this.a;
    }

    @Override // kotlin.reflect.KClass
    public final boolean equals(Object obj) {
        return (obj instanceof vr) && vk3.k(this).equals(vk3.k((KClass) obj));
    }

    @Override // kotlin.reflect.KClass
    public final String getQualifiedName() {
        String strC;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strC2 = uj2.c(cls.getName());
            return strC2 == null ? cls.getCanonicalName() : strC2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strC = uj2.c(componentType.getName())) != null) {
            strConcat = strC.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // kotlin.reflect.KClass
    public final String getSimpleName() {
        String strM;
        Class cls = this.a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM2 = uj2.m(cls.getName());
                return strM2 == null ? cls.getSimpleName() : strM2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM = uj2.m(componentType.getName())) != null) {
                strConcat = strM.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return dk2.q0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iW = dk2.W(simpleName, '$', 0, 6);
            return iW == -1 ? simpleName : simpleName.substring(iW + 1, simpleName.length());
        }
        return dk2.q0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInstance(Object obj) {
        Class clsK = this.a;
        clsK.getClass();
        Map map = b;
        map.getClass();
        Integer num = (Integer) map.get(clsK);
        if (num != null) {
            return os2.w(num.intValue(), obj);
        }
        if (clsK.isPrimitive()) {
            clsK = vk3.k(p32.a(clsK));
        }
        return clsK.isInstance(obj);
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }

    public vr(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final Collection getConstructors() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    public final Collection getMembers() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final Collection getNestedClasses() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final Object getObjectInstance() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final List getSealedSubclasses() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final List getSupertypes() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final List getTypeParameters() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final KVisibility getVisibility() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return vk3.k(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isAbstract() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isCompanion() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isData() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isFinal() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isFun() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInner() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isOpen() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isSealed() {
        b();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isValue() {
        b();
        throw null;
    }
}
