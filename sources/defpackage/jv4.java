package defpackage;

import com.facebook.appevents.p;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class jv4 {
    public static final Unsafe a;
    public static final Class b;
    public static final lp3 c;
    public static final boolean d;
    public static final boolean e;
    public static final boolean f;

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    static {
        boolean z;
        boolean z2;
        lp3 lp3Var;
        Unsafe unsafeE = e();
        a = unsafeE;
        int i = t94.a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM = m(cls);
        Class cls2 = Integer.TYPE;
        boolean zM2 = m(cls2);
        lp3 yu4Var = null;
        if (unsafeE != null) {
            if (zM) {
                yu4Var = new cv4(unsafeE);
            } else if (zM2) {
                yu4Var = new yu4(unsafeE);
            }
        }
        c = yu4Var;
        if (yu4Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = yu4Var.a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (p() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(jv4.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        d = z;
        lp3 lp3Var2 = c;
        if (lp3Var2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls4 = lp3Var2.a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                Logger.getLogger(jv4.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z2 = false;
            }
        }
        e = z2;
        n(byte[].class);
        n(boolean[].class);
        o(boolean[].class);
        n(int[].class);
        o(int[].class);
        n(long[].class);
        o(long[].class);
        n(float[].class);
        o(float[].class);
        n(double[].class);
        o(double[].class);
        n(Object[].class);
        o(Object[].class);
        Field fieldP = p();
        if (fieldP != null && (lp3Var = c) != null) {
            lp3Var.a.objectFieldOffset(fieldP);
        }
        f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Object obj, long j) {
        return c.a.getInt(obj, j);
    }

    public static long b(Object obj, long j) {
        return c.a.getLong(obj, j);
    }

    public static Object c(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            p.g(e2);
            return null;
        }
    }

    public static Object d(Object obj, long j) {
        return c.a.getObject(obj, j);
    }

    public static Unsafe e() {
        try {
            return (Unsafe) AccessController.doPrivileged(new su4());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void f(Object obj, long j, boolean z) {
        lp3 lp3Var = c;
        long j2 = (-4) & j;
        int i = lp3Var.a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        lp3Var.a.putInt(obj, j2, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & i));
    }

    public static /* synthetic */ void g(Object obj, long j, boolean z) {
        lp3 lp3Var = c;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        lp3Var.a.putInt(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & lp3Var.a.getInt(obj, j2)));
    }

    public static void h(int i, long j, Object obj) {
        c.a.putInt(obj, j, i);
    }

    public static void i(Object obj, long j, long j2) {
        c.a.putLong(obj, j, j2);
    }

    public static void j(long j, Object obj, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean k(long j, Object obj) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean l(long j, Object obj) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean m(Class cls) {
        int i = t94.a;
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

    public static void n(Class cls) {
        if (e) {
            c.a.arrayBaseOffset(cls);
        }
    }

    public static void o(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static Field p() {
        Field declaredField;
        Field declaredField2;
        int i = t94.a;
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
}
