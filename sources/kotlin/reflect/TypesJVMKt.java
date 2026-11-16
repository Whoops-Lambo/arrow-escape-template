package kotlin.reflect;

import defpackage.eu;
import defpackage.kk2;
import defpackage.l92;
import defpackage.p92;
import defpackage.vk3;
import defpackage.vq2;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0083\u0080\u0004\u001a$\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0083\u0080\u0004\u001a\u0012\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0082\u0080\u0004\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0084\b¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u000f8BX\u0083\u0084\b¢\u0006\f\u0012\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, d2 = {"javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "computeJavaType", "forceWrapper", "", "createPossiblyInnerType", "jClass", "Ljava/lang/Class;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "(Lkotlin/reflect/KTypeProjection;)V", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "typeToString", "", "type", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class TypesJVMKt {
    public static /* synthetic */ void getJavaType$annotations(KType kType) {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ Type computeJavaType$default(KType kType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return computeJavaType(kType, z);
    }

    private static /* synthetic */ void getJavaType$annotations(KTypeProjection kTypeProjection) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String typeToString(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        l92 l92VarJ = p92.J(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
        StringBuilder sb = new StringBuilder();
        Iterator it = l92VarJ.iterator();
        if (!it.hasNext()) {
            vq2.s("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        sb.append(((Class) next).getName());
        Iterator it2 = l92VarJ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            it2.next();
            i++;
            if (i < 0) {
                eu.F();
                throw null;
            }
        }
        sb.append(kk2.H(i, "[]"));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type computeJavaType(KType kType, boolean z) {
        Class clsJ;
        KTypeProjection kTypeProjection;
        int i;
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KTypeParameter) {
            return new TypeVariableImpl((KTypeParameter) classifier);
        }
        if (classifier instanceof KClass) {
            KClass kClass = (KClass) classifier;
            if (z) {
                clsJ = vk3.k(kClass);
            } else {
                clsJ = vk3.j(kClass);
            }
            List<KTypeProjection> arguments = kType.getArguments();
            if (!arguments.isEmpty()) {
                if (clsJ.isArray()) {
                    if (!clsJ.getComponentType().isPrimitive()) {
                        if (arguments.size() == 1) {
                            kTypeProjection = arguments.get(0);
                        } else {
                            kTypeProjection = null;
                        }
                        KTypeProjection kTypeProjection2 = kTypeProjection;
                        if (kTypeProjection2 != null) {
                            KVariance variance = kTypeProjection2.getVariance();
                            KType type = kTypeProjection2.getType();
                            if (variance == null) {
                                i = -1;
                            } else {
                                i = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
                            }
                            if (i != -1 && i != 1) {
                                if (i != 2 && i != 3) {
                                    e.b();
                                    return null;
                                }
                                type.getClass();
                                Type typeComputeJavaType$default = computeJavaType$default(type, false, 1, null);
                                if (!(typeComputeJavaType$default instanceof Class)) {
                                    return new GenericArrayTypeImpl(typeComputeJavaType$default);
                                }
                                return clsJ;
                            }
                            return clsJ;
                        }
                        vq2.r(kType, "kotlin.Array must have exactly one type argument: ");
                        return null;
                    }
                    return clsJ;
                }
                return createPossiblyInnerType(clsJ, arguments);
            }
            return clsJ;
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
    }

    private static final Type createPossiblyInnerType(Class<?> cls, List<KTypeProjection> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<KTypeProjection> list2 = list;
            ArrayList arrayList = new ArrayList(eu.f(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(getJavaType((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<KTypeProjection> list3 = list;
            ArrayList arrayList2 = new ArrayList(eu.f(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(getJavaType((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeCreatePossiblyInnerType = createPossiblyInnerType(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(eu.f(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(getJavaType((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, typeCreatePossiblyInnerType, arrayList3);
    }

    private static final Type getJavaType(KTypeProjection kTypeProjection) {
        KVariance variance = kTypeProjection.getVariance();
        if (variance == null) {
            return WildcardTypeImpl.Companion.getSTAR();
        }
        KType type = kTypeProjection.getType();
        type.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new WildcardTypeImpl(computeJavaType(type, true), null);
                }
                e.b();
                return null;
            }
            return computeJavaType(type, true);
        }
        return new WildcardTypeImpl(null, computeJavaType(type, true));
    }

    @NotNull
    public static final Type getJavaType(@NotNull KType kType) {
        kType.getClass();
        return computeJavaType$default(kType, false, 1, null);
    }
}
