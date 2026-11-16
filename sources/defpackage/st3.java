package defpackage;

import com.facebook.appevents.p;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class st3 {
    public static final Unsafe a;
    public static final Class b;
    public static final rt3 c;
    public static final boolean d;
    public static final boolean e;

    public static void e(Object obj, long j, boolean z) {
        byte b2 = z ? (byte) 1 : (byte) 0;
        long j2 = (-4) & j;
        int i = c.i(j2, obj);
        int i2 = ((~((int) j)) & 3) << 3;
        b(((255 & b2) << i2) | (i & (~(255 << i2))), j2, obj);
    }

    public static Unsafe f() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new tt3());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(st3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void h(Object obj, long j, boolean z) {
        byte b2 = z ? (byte) 1 : (byte) 0;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        b(((255 & b2) << i) | (c.i(j2, obj) & (~(255 << i))), j2, obj);
    }

    public static Object a(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            p.g(e2);
            return null;
        }
    }

    public static void b(int i, long j, Object obj) {
        c.b(i, j, obj);
    }

    public static void c(long j, Object obj, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static void d(Object obj, long j, long j2) {
        c.e(obj, j, j2);
    }

    public static void g(Class cls) {
        if (d) {
            c.a.arrayBaseOffset(cls);
        }
    }

    public static Field i() {
        Field declaredField;
        Field declaredField2;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField(SafeDKWebAppInterface.j);
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void j(Class cls) {
        if (d) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static boolean k(Class cls) {
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Object l(long j, Object obj) {
        return c.a.getObject(obj, j);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002a  */
    static {
        qt3 qt3Var;
        Unsafe unsafe;
        boolean z;
        rt3 rt3Var;
        Unsafe unsafe2;
        Unsafe unsafeF = f();
        a = unsafeF;
        b = dr3.a;
        Class cls = Long.TYPE;
        boolean zK = k(cls);
        Class cls2 = Integer.TYPE;
        boolean zK2 = k(cls2);
        boolean z2 = true;
        if (unsafeF != null) {
            if (zK) {
                qt3Var = new qt3(unsafeF, 1);
            } else if (zK2) {
                qt3Var = new qt3(unsafeF, 0);
            } else {
                qt3Var = null;
            }
        } else {
            qt3Var = null;
        }
        c = qt3Var;
        if (qt3Var != null && (unsafe2 = qt3Var.a) != null) {
            try {
                Class<?> cls3 = unsafe2.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                i();
            } catch (Throwable th) {
                Logger.getLogger(st3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            }
        }
        rt3 rt3Var2 = c;
        if (rt3Var2 == null || (unsafe = rt3Var2.a) == null) {
            z = false;
        } else {
            try {
                Class<?> cls4 = unsafe.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(st3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th2)));
                z = false;
            }
        }
        d = z;
        g(byte[].class);
        g(boolean[].class);
        j(boolean[].class);
        g(int[].class);
        j(int[].class);
        g(long[].class);
        j(long[].class);
        g(float[].class);
        j(float[].class);
        g(double[].class);
        j(double[].class);
        g(Object[].class);
        j(Object[].class);
        Field fieldI = i();
        if (fieldI != null && (rt3Var = c) != null) {
            rt3Var.a.objectFieldOffset(fieldI);
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            z2 = false;
        }
        e = z2;
    }
}
