package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.internal.ads.zzagu;
import com.google.android.gms.internal.play_billing.zzcm;
import com.inmobi.media.core.config.models.AdConfig;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import defpackage.az2;
import io.p071bidmachine.internal.a1;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class uu implements zzagu {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Type[] b = new Type[0];
    public static final SerialDescriptor[] c = new SerialDescriptor[0];
    public static final /* synthetic */ int d = 0;

    public static float D(float[] fArr, float f) {
        for (float f2 : fArr) {
            f = Math.max(f, f2);
        }
        return f;
    }

    public static int E(int i, int... iArr) {
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    public static float G(float[] fArr, float f) {
        for (float f2 : fArr) {
            f = Math.min(f, f2);
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    /* JADX WARN: Code duplicated, block: B:77:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static Type K(Type type, Class cls, Type type2, HashMap map) {
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeK;
        Type[] upperBounds2;
        Type typeK2;
        Type[] lowerBounds2;
        Type typeK3;
        boolean z;
        Type[] actualTypeArguments;
        int length;
        Type bVar;
        Type typeK4;
        Type genericComponentType;
        Type typeK5;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            int i = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1) {
                                    break;
                                }
                                if (typeK instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeK).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeK};
                                }
                                type2 = new c(upperBounds2, b);
                                break;
                            }
                            typeK2 = K(type, cls, lowerBounds[0], map);
                            if (typeK2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeK2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeK2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeK2};
                            }
                            type2 = new c(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        typeK3 = K(type, cls, ownerType, map);
                        z = !q(typeK3, ownerType);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i < length) {
                            typeK4 = K(type, cls, actualTypeArguments[i], map);
                            if (q(typeK4, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = typeK4;
                            }
                            i++;
                        }
                        if (z) {
                            break;
                        }
                        bVar = new b(typeK3, type2.getRawType(), actualTypeArguments);
                        type2 = bVar;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeK5 = K(type, cls, genericComponentType, map);
                    if (q(genericComponentType, typeK5)) {
                        bVar = new a(typeK5);
                        type2 = bVar;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1 && (typeK = K(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                                    if (typeK instanceof WildcardType) {
                                        upperBounds2 = ((WildcardType) typeK).getUpperBounds();
                                    } else {
                                        upperBounds2 = new Type[]{typeK};
                                    }
                                    type2 = new c(upperBounds2, b);
                                    break;
                                }
                                break;
                                break;
                            }
                            typeK2 = K(type, cls, lowerBounds[0], map);
                            if (typeK2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeK2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeK2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeK2};
                            }
                            type2 = new c(new Type[]{Object.class}, lowerBounds2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        typeK3 = K(type, cls, ownerType2, map);
                        z = !q(typeK3, ownerType2);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i < length) {
                            typeK4 = K(type, cls, actualTypeArguments[i], map);
                            if (q(typeK4, actualTypeArguments[i])) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = typeK4;
                            }
                            i++;
                        }
                        if (z) {
                            break;
                        }
                        bVar = new b(typeK3, type2.getRawType(), actualTypeArguments);
                        type2 = bVar;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeK5 = K(type, cls, genericComponentType, map);
                    if (q(genericComponentType, typeK5)) {
                        break;
                    }
                    bVar = new a(typeK5);
                    type2 = bVar;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeK6 = K(type, cls, componentType, map);
                if (!q(componentType, typeK6)) {
                    bVar = new a(typeK6);
                    type2 = bVar;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            Class cls3 = Void.TYPE;
            if (type3 != null) {
                return type3 == cls3 ? type2 : type3;
            }
            map.put(typeVariable, cls3);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls4 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls4 == null) {
                type2 = typeVariable;
            } else {
                Type typeU = u(type, cls, cls4);
                if (typeU instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls4.getTypeParameters();
                    int length2 = typeParameters.length;
                    while (true) {
                        if (i >= length2) {
                            d.v();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type2 = ((ParameterizedType) typeU).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    public static final void g(int i) {
        if (i >= 1) {
            return;
        }
        ak1.n(pv1.k(i, "Expected positive parallelism level, but got "));
    }

    public static final SerialDescriptor[] j(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? c : serialDescriptorArr;
    }

    public static String z(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            int i3 = (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >>> 4;
            char[] cArr2 = a;
            cArr[i2] = cArr2[i3];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public abstract a44 P(zzcm zzcmVar);

    public abstract m44 Q(zzcm zzcmVar);

    public abstract void R(m44 m44Var, m44 m44Var2);

    public abstract void S(m44 m44Var, Thread thread);

    public abstract boolean U(zzcm zzcmVar, a44 a44Var, a44 a44Var2);

    public abstract boolean V(n44 n44Var, Object obj, Object obj2);

    public abstract boolean W(n44 n44Var, m44 m44Var, m44 m44Var2);

    public static boolean A() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    public static ol2 F(ol2 ol2Var) {
        if ((ol2Var instanceof ql2) || (ol2Var instanceof pl2)) {
            return ol2Var;
        }
        return ol2Var instanceof Serializable ? new pl2(ol2Var) : new ql2(ol2Var);
    }

    public static final void I(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void J(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    public static final void L(KClass kClass) {
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        throw new ba2(pv1.n("Serializer for class '", simpleName, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static String M(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(bytes);
            return z(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e);
            return "";
        }
    }

    public static String N(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
            scannerUseDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (scannerUseDelimiter != null) {
                try {
                    scannerUseDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static String O(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static boolean T(byte b2) {
        return b2 > -65;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(Lifecycle lifecycle, fy fyVar) throws Throwable {
        f fVar;
        Lifecycle lifecycle2;
        m32 m32Var;
        Throwable th;
        LifecycleObserver lifecycleObserver;
        LifecycleObserver lifecycleObserver2;
        if (fyVar instanceof f) {
            fVar = (f) fyVar;
            int i = fVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.u = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(fyVar);
            }
        } else {
            fVar = new f(fyVar);
        }
        Object obj = fVar.t;
        int i2 = fVar.u;
        az2 az2Var = az2.a;
        if (i2 != 0) {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m32Var = fVar.s;
            lifecycle2 = fVar.r;
            try {
                wz2.a0(obj);
                lifecycleObserver2 = (LifecycleObserver) m32Var.a;
                if (lifecycleObserver2 != null) {
                    lifecycle2.c(lifecycleObserver2);
                }
                return az2Var;
            } catch (Throwable th2) {
                th = th2;
                lifecycleObserver = (LifecycleObserver) m32Var.a;
                if (lifecycleObserver != null) {
                    lifecycle2.c(lifecycleObserver);
                }
                throw th;
            }
        }
        wz2.a0(obj);
        if (lifecycle.getD().compareTo(Lifecycle.State.d) >= 0) {
            return az2Var;
        }
        m32 m32Var2 = new m32();
        try {
            fVar.r = lifecycle;
            fVar.s = m32Var2;
            fVar.u = 1;
            final qo qoVar = new qo(1, kc2.q(fVar));
            qoVar.s();
            DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: coil.util.-Lifecycles$awaitStarted$2$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final void onStart(LifecycleOwner lifecycleOwner) {
                    qoVar.resumeWith(az2.a);
                }
            };
            m32Var2.a = defaultLifecycleObserver;
            lifecycle.a(defaultLifecycleObserver);
            Object objR = qoVar.r();
            dz dzVar = dz.a;
            if (objR == dzVar) {
                return dzVar;
            }
            lifecycle2 = lifecycle;
            m32Var = m32Var2;
            lifecycleObserver2 = (LifecycleObserver) m32Var.a;
            if (lifecycleObserver2 != null) {
                lifecycle2.c(lifecycleObserver2);
            }
            return az2Var;
        } catch (Throwable th3) {
            lifecycle2 = lifecycle;
            m32Var = m32Var2;
            th = th3;
            lifecycleObserver = (LifecycleObserver) m32Var.a;
            if (lifecycleObserver != null) {
                lifecycle2.c(lifecycleObserver);
            }
            throw th;
        }
    }

    public static synchronized long d(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static Type e(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(e(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void f(Type type) {
        eu.e(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static void h(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", str, e);
            }
        }
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static int k(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean q(Type type, Type type2) {
        if (type != type2) {
            return type != null && type.equals(type2);
        }
        return true;
    }

    public static boolean r(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return q(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return r(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static boolean s(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int iY = y(context, str, "bool");
            if (iY > 0) {
                return resources.getBoolean(iY);
            }
            int iY2 = y(context, str, "string");
            if (iY2 > 0) {
                return Boolean.parseBoolean(context.getString(iY2));
            }
        }
        return z;
    }

    public static Type u(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return u(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return u(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e A[LOOP:0: B:28:0x009c->B:29:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[LOOP:1: B:33:0x00c9->B:34:0x00cb, LOOP_END] */
    public static yh0 v(JSONObject jSONObject) throws JSONException {
        int i;
        String upperCase;
        JSONArray jSONArray;
        ArrayList arrayList;
        int length;
        int i2;
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList2;
        int length2;
        String string = jSONObject.getString("event_name");
        String string2 = jSONObject.getString("method");
        string2.getClass();
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String upperCase2 = string2.toUpperCase(locale);
        upperCase2.getClass();
        int i3 = 2;
        if (upperCase2 != null) {
            if (upperCase2.equals("MANUAL")) {
                i = 1;
            } else if (upperCase2.equals("INFERENCE")) {
                i = 2;
            } else {
                d.r("No enum constant com.facebook.appevents.codeless.internal.EventBinding.MappingMethod.".concat(upperCase2));
            }
            String string3 = jSONObject.getString(StatsEvent.z);
            string3.getClass();
            upperCase = string3.toUpperCase(locale);
            upperCase.getClass();
            if (upperCase != null) {
                if (upperCase.equals("CLICK")) {
                    i3 = 1;
                } else if (!upperCase.equals("SELECTED")) {
                    if (upperCase.equals("TEXT_CHANGED")) {
                        i3 = 3;
                    } else {
                        d.r("No enum constant com.facebook.appevents.codeless.internal.EventBinding.ActionType.".concat(upperCase));
                    }
                }
                String string4 = jSONObject.getString("app_version");
                jSONArray = jSONObject.getJSONArray("path");
                arrayList = new ArrayList();
                length = jSONArray.length();
                for (i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    jSONObject2.getClass();
                    arrayList.add(new gu1(jSONObject2));
                }
                String strOptString = jSONObject.optString("path_type", "absolute");
                jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
                arrayList2 = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    length2 = jSONArrayOptJSONArray.length();
                    for (int i4 = 0; i4 < length2; i4++) {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i4);
                        jSONObject3.getClass();
                        arrayList2.add(new xt1(jSONObject3));
                    }
                }
                String strOptString2 = jSONObject.optString("component_id");
                String strOptString3 = jSONObject.optString("activity_name");
                string.getClass();
                string4.getClass();
                strOptString2.getClass();
                strOptString.getClass();
                strOptString3.getClass();
                return new yh0(string, i, i3, string4, arrayList, arrayList2, strOptString2, strOptString, strOptString3);
            }
            d.w("Name is null");
            i3 = 0;
            String string5 = jSONObject.getString("app_version");
            jSONArray = jSONObject.getJSONArray("path");
            arrayList = new ArrayList();
            length = jSONArray.length();
            while (i2 < length) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                jSONObject4.getClass();
                arrayList.add(new gu1(jSONObject4));
            }
            String strOptString4 = jSONObject.optString("path_type", "absolute");
            jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
            arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                length2 = jSONArrayOptJSONArray.length();
                while (i4 < length2) {
                    JSONObject jSONObject5 = jSONArrayOptJSONArray.getJSONObject(i4);
                    jSONObject5.getClass();
                    arrayList2.add(new xt1(jSONObject5));
                }
            }
            String strOptString5 = jSONObject.optString("component_id");
            String strOptString6 = jSONObject.optString("activity_name");
            string.getClass();
            string5.getClass();
            strOptString5.getClass();
            strOptString4.getClass();
            strOptString6.getClass();
            return new yh0(string, i, i3, string5, arrayList, arrayList2, strOptString5, strOptString4, strOptString6);
        }
        d.w("Name is null");
        i = 0;
        String string6 = jSONObject.getString(StatsEvent.z);
        string6.getClass();
        upperCase = string6.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase != null) {
            if (upperCase.equals("CLICK")) {
                i3 = 1;
            } else if (!upperCase.equals("SELECTED")) {
                if (upperCase.equals("TEXT_CHANGED")) {
                    i3 = 3;
                } else {
                    d.r("No enum constant com.facebook.appevents.codeless.internal.EventBinding.ActionType.".concat(upperCase));
                }
            }
            String string7 = jSONObject.getString("app_version");
            jSONArray = jSONObject.getJSONArray("path");
            arrayList = new ArrayList();
            length = jSONArray.length();
            while (i2 < length) {
                JSONObject jSONObject6 = jSONArray.getJSONObject(i2);
                jSONObject6.getClass();
                arrayList.add(new gu1(jSONObject6));
            }
            String strOptString7 = jSONObject.optString("path_type", "absolute");
            jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
            arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                length2 = jSONArrayOptJSONArray.length();
                while (i4 < length2) {
                    JSONObject jSONObject7 = jSONArrayOptJSONArray.getJSONObject(i4);
                    jSONObject7.getClass();
                    arrayList2.add(new xt1(jSONObject7));
                }
            }
            String strOptString8 = jSONObject.optString("component_id");
            String strOptString9 = jSONObject.optString("activity_name");
            string.getClass();
            string7.getClass();
            strOptString8.getClass();
            strOptString7.getClass();
            strOptString9.getClass();
            return new yh0(string, i, i3, string7, arrayList, arrayList2, strOptString8, strOptString7, strOptString9);
        }
        d.w("Name is null");
        i3 = 0;
        String string8 = jSONObject.getString("app_version");
        jSONArray = jSONObject.getJSONArray("path");
        arrayList = new ArrayList();
        length = jSONArray.length();
        while (i2 < length) {
            JSONObject jSONObject8 = jSONArray.getJSONObject(i2);
            jSONObject8.getClass();
            arrayList.add(new gu1(jSONObject8));
        }
        String strOptString10 = jSONObject.optString("path_type", "absolute");
        jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
        arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            length2 = jSONArrayOptJSONArray.length();
            while (i4 < length2) {
                JSONObject jSONObject9 = jSONArrayOptJSONArray.getJSONObject(i4);
                jSONObject9.getClass();
                arrayList2.add(new xt1(jSONObject9));
            }
        }
        String strOptString11 = jSONObject.optString("component_id");
        String strOptString12 = jSONObject.optString("activity_name");
        string.getClass();
        string8.getClass();
        strOptString11.getClass();
        strOptString10.getClass();
        strOptString12.getClass();
        return new yh0(string, i, i3, string8, arrayList, arrayList2, strOptString11, strOptString10, strOptString12);
    }

    public static Class x(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            eu.e(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) x(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return x(((WildcardType) type).getUpperBounds()[0]);
        }
        d10.c("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static boolean B() {
        boolean zA = A();
        String str = Build.TAGS;
        if ((!zA && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!zA && file.exists()) {
            return true;
        }
        return false;
    }

    public static final KClass C(KType kType) {
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (!(classifier instanceof KTypeParameter)) {
            vq2.r(classifier, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }

    public static Comparable H(a1 a1Var, a1 a1Var2) {
        a1Var.getClass();
        a1Var2.getClass();
        if (a1Var.compareTo(a1Var2) <= 0) {
            return a1Var;
        }
        return a1Var2;
    }

    public static final vh1 a(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new vh1(matcher, charSequence);
    }

    public static final Set c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof vn) {
            return ((vn) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.e());
        int iE = serialDescriptor.e();
        for (int i = 0; i < iE; i++) {
            hashSet.add(serialDescriptor.f(i));
        }
        return hashSet;
    }

    public static final Long l(d01 d01Var) {
        d01Var.getClass();
        sw0 sw0VarA = d01Var.a();
        List list = qy0.a;
        String str = sw0VarA.get("Content-Length");
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static final rx m(uy0 uy0Var) {
        uy0Var.getClass();
        tw0 tw0VarA = uy0Var.a();
        List list = qy0.a;
        String strM = tw0VarA.m("Content-Type");
        if (strM != null) {
            rx rxVar = rx.e;
            return l7.q(strM);
        }
        return null;
    }

    public static final void n(lz0 lz0Var, rx rxVar) {
        rxVar.getClass();
        tw0 tw0Var = lz0Var.c;
        List list = qy0.a;
        String string = rxVar.toString();
        tw0Var.getClass();
        tw0Var.s(string);
        List listL = tw0Var.l("Content-Type");
        listL.clear();
        listL.add(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int t() {
        boolean zA = A();
        ?? r0 = zA;
        if (B()) {
            r0 = (zA ? 1 : 0) | 2;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            return r0;
        }
        return r0 | 4;
    }

    public static final KSerializer w(KSerializer kSerializer) {
        kSerializer.getClass();
        if (kSerializer.getDescriptor().b()) {
            return kSerializer;
        }
        return new or1(kSerializer);
    }

    public static int y(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }
}
