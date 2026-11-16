package defpackage;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.internal.p002firebaseauthapi.zzamp;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.collect.a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.G5;
import com.unity3d.services.core.fid.Constants;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class qb5 {
    public static final b8 b = new b8(1);
    public static final tx c;
    public static final tx d;
    public static Boolean e;
    public final /* synthetic */ int a;

    public static int b(int i) {
        if (i < 3) {
            l93.i(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static final KSerializer j(Object obj, KSerializer... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static int t(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    static {
        int i = 8;
        c = new tx("NONE", i);
        d = new tx("PENDING", i);
    }

    public static final xi2 a(Object obj) {
        if (obj == null) {
            obj = nd4.a;
        }
        return new xi2(obj);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    public static final KSerializer c(KClass kClass, KSerializer... kSerializerArr) {
        Object obj;
        KSerializer kSerializer;
        Class<?> cls;
        Object obj2;
        KSerializer kSerializerJ;
        Field field;
        z92 z92Var;
        kClass.getClass();
        Class clsJ = vk3.j(kClass);
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        if (clsJ.isEnum() && clsJ.getAnnotation(z92.class) == null && clsJ.getAnnotation(qv1.class) == null) {
            Object[] enumConstants = clsJ.getEnumConstants();
            String canonicalName = clsJ.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new mh0(canonicalName, (Enum[]) enumConstants);
        }
        KSerializer[] kSerializerArr3 = (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length);
        tv1 tv1Var = null;
        try {
            Field declaredField = clsJ.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        KSerializer kSerializerJ2 = obj == null ? null : j(obj, (KSerializer[]) Arrays.copyOf(kSerializerArr3, kSerializerArr3.length));
        if (kSerializerJ2 != null) {
            return kSerializerJ2;
        }
        String canonicalName2 = clsJ.getCanonicalName();
        if (canonicalName2 == null || kk2.L(canonicalName2, "java.", false) || kk2.L(canonicalName2, "kotlin.", false)) {
            kSerializer = null;
        } else {
            Field[] declaredFields = clsJ.getDeclaredFields();
            declaredFields.getClass();
            int length = declaredFields.length;
            Field field2 = null;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Field field3 = declaredFields[i];
                if (s71.b(field3.getName(), "INSTANCE") && s71.b(field3.getType(), clsJ) && Modifier.isStatic(field3.getModifiers())) {
                    if (!z) {
                        z = true;
                        field2 = field3;
                    }
                }
                i++;
                field2 = null;
                break;
            }
            if (field2 == null) {
                kSerializer = null;
            } else {
                Object obj3 = field2.get(null);
                Method[] methods = clsJ.getMethods();
                methods.getClass();
                int length2 = methods.length;
                Method method = null;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    if (i2 >= length2) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i2];
                    if (s71.b(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0 && s71.b(method2.getReturnType(), KSerializer.class)) {
                            if (!z2) {
                                z2 = true;
                                method = method2;
                            }
                        }
                    }
                    i2++;
                    method = null;
                    break;
                }
                if (method == null) {
                    kSerializer = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof KSerializer) {
                        kSerializer = (KSerializer) objInvoke;
                    } else {
                        kSerializer = null;
                    }
                }
            }
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer[] kSerializerArr4 = (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length);
        Class<?>[] declaredClasses = clsJ.getDeclaredClasses();
        declaredClasses.getClass();
        int length3 = declaredClasses.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                cls = null;
                break;
            }
            cls = declaredClasses[i3];
            if (cls.getAnnotation(wp1.class) != null) {
                break;
            }
            i3++;
        }
        if (cls == null) {
            obj2 = null;
        } else {
            try {
                Field declaredField2 = clsJ.getDeclaredField(cls.getSimpleName());
                declaredField2.setAccessible(true);
                obj2 = declaredField2.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (kSerializerJ = j(obj2, (KSerializer[]) Arrays.copyOf(kSerializerArr4, kSerializerArr4.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = clsJ.getDeclaredClasses();
                declaredClasses2.getClass();
                int length4 = declaredClasses2.length;
                Class<?> cls2 = null;
                int i4 = 0;
                boolean z3 = false;
                while (true) {
                    if (i4 < length4) {
                        Class<?> cls3 = declaredClasses2[i4];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (!z3) {
                                z3 = true;
                                cls2 = cls3;
                            }
                        }
                        i4++;
                    } else if (!z3) {
                    }
                    cls2 = null;
                    break;
                }
                Object obj4 = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
                kSerializerJ = obj4 instanceof KSerializer ? (KSerializer) obj4 : null;
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (kSerializerJ != null) {
            return kSerializerJ;
        }
        if (clsJ.getAnnotation(qv1.class) != null || ((z92Var = (z92) clsJ.getAnnotation(z92.class)) != null && p32.a(z92Var.with()).equals(p32.a(tv1.class)))) {
            tv1Var = new tv1(p32.a(clsJ));
        }
        return tv1Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0053 -> B:26:0x0074). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0066 -> B:25:0x006d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:31:0x0099
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(defpackage.rl r17, java.io.OutputStream r18, long r19, defpackage.fy r21) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb5.d(rl, java.io.OutputStream, long, fy):java.lang.Object");
    }

    public static boolean e(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static final Object m(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static Task n(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        h10 h10Var = new h10(0, taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource);
        b8 b8Var = b;
        task.continueWithTask(b8Var, h10Var);
        task2.continueWithTask(b8Var, h10Var);
        return taskCompletionSource.getTask();
    }

    public static final FirebaseAnalytics o() {
        FirebaseAnalytics firebaseAnalytics;
        try {
            try {
                String str = FirebaseApp.DEFAULT_APP_NAME;
                Object objInvoke = FirebaseApp.class.getMethod("getApplicationContext", null).invoke(FirebaseApp.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), null);
                objInvoke.getClass();
                Object objInvoke2 = FirebaseAnalytics.class.getMethod(Constants.GET_INSTANCE, Context.class).invoke(null, (Context) objInvoke);
                if (!(objInvoke2 instanceof FirebaseAnalytics)) {
                    return null;
                }
                firebaseAnalytics = (FirebaseAnalytics) objInvoke2;
            } catch (Throwable unused) {
                Class<?> cls = Class.forName("com.google.firebase.ktx.Firebase");
                Object objInvoke3 = Class.forName("com.google.firebase.analytics.ktx.FirebaseAnalyticsKtxKt").getMethod("getAnalytics", cls).invoke(null, cls.getField("INSTANCE").get(null));
                if (!(objInvoke3 instanceof FirebaseAnalytics)) {
                    return null;
                }
                firebaseAnalytics = (FirebaseAnalytics) objInvoke3;
            }
            return firebaseAnalytics;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static final String q(dy dyVar) {
        Object j52Var;
        if (dyVar instanceof oc0) {
            return ((oc0) dyVar).toString();
        }
        try {
            j52Var = dyVar + '@' + i(dyVar);
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        if (k52.b(j52Var) != null) {
            j52Var = dyVar.getClass().getName() + '@' + i(dyVar);
        }
        return (String) j52Var;
    }

    public static zzamp u(Object obj, Object obj2) {
        zzamp zzampVarF = (zzamp) obj;
        zzamp zzampVar = (zzamp) obj2;
        if (!zzampVar.isEmpty()) {
            if (!zzampVarF.a) {
                zzampVarF = zzampVarF.f();
            }
            zzampVarF.g();
            if (!zzampVar.isEmpty()) {
                zzampVarF.putAll(zzampVar);
            }
        }
        return zzampVarF;
    }

    public static void v(Object obj) {
    }

    public static final Object f(om omVar, fy fyVar) throws Throwable {
        Object objD;
        omVar.getClass();
        Throwable thB = omVar.b();
        if (thB == null) {
            bk bkVarE = omVar.e();
            bkVarE.getClass();
            if (((int) bkVarE.c) >= 1048576 && (objD = omVar.d(fyVar)) == dz.a) {
                return objD;
            }
            return az2.a;
        }
        throw thB;
    }

    public static Object g(qy qyVar, Object obj, zr0 zr0Var) {
        zr0Var.getClass();
        return zr0Var.invoke(obj, qyVar);
    }

    public static qy h(qy qyVar, ry ryVar) {
        ryVar.getClass();
        if (s71.b(qyVar.getKey(), ryVar)) {
            return qyVar;
        }
        return null;
    }

    public static final String i(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static sy k(qy qyVar, ry ryVar) {
        ryVar.getClass();
        if (s71.b(qyVar.getKey(), ryVar)) {
            return cg0.a;
        }
        return qyVar;
    }

    public static sy l(qy qyVar, sy syVar) {
        syVar.getClass();
        return h00.o(qyVar, syVar);
    }

    public static boolean p() {
        VersionInfo version = MobileAds.getVersion();
        version.getClass();
        VersionInfo versionInfo = new VersionInfo(1, 2, 0);
        if (version.getMajorVersion() > versionInfo.getMajorVersion() || (version.getMajorVersion() == versionInfo.getMajorVersion() && (version.getMinorVersion() > versionInfo.getMinorVersion() || (version.getMinorVersion() == versionInfo.getMinorVersion() && version.getMicroVersion() >= versionInfo.getMicroVersion())))) {
            return true;
        }
        return false;
    }

    public static String r(Map map) {
        int size = map.size();
        l93.i(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(G5.U);
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static void s(a aVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(aVar.f().size());
        for (Map.Entry entry : aVar.f().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }
}
