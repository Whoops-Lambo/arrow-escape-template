package defpackage;

import com.facebook.appevents.p;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class p03 {
    public static final Unsafe a;
    public static final Class b;
    public static final o03 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    public static void a(Throwable th) {
        Logger.getLogger(p03.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static long b(ByteBuffer byteBuffer) {
        return c.j(g, byteBuffer);
    }

    public static Object c(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            p.g(e2);
            return null;
        }
    }

    public static int d(Class cls) {
        if (e) {
            return c.a(cls);
        }
        return -1;
    }

    public static void e(Class cls) {
        if (e) {
            c.b(cls);
        }
    }

    public static void f(long j, byte[] bArr, long j2, long j3) {
        c.c(j, bArr, j2, j3);
    }

    public static boolean g(Class cls) {
        Class cls2 = r5.a;
        try {
            Class cls3 = b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", cls, cls4);
            cls3.getMethod("pokeLong", cls, Long.TYPE, cls4);
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", cls, cls5, cls4);
            cls3.getMethod("peekInt", cls, cls4);
            cls3.getMethod("pokeByte", cls, Byte.TYPE);
            cls3.getMethod("peekByte", cls);
            cls3.getMethod("pokeByteArray", cls, byte[].class, cls5, cls5);
            cls3.getMethod("peekByteArray", cls, byte[].class, cls5, cls5);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte h(long j, Object obj) {
        return (byte) ((c.i((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((c.i((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new m03());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte b2, long j) {
        c.n(b2, j);
    }

    public static void l(byte[] bArr, long j, byte b2) {
        c.o(bArr, f + j, b2);
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = c.i(j2, obj);
        int i2 = ((~((int) j)) & 3) << 3;
        o(((255 & b2) << i2) | (i & (~(255 << i2))), j2, obj);
    }

    public static void n(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        o(((255 & b2) << i) | (c.i(j2, obj) & (~(255 << i))), j2, obj);
    }

    public static void o(int i, long j, Object obj) {
        c.r(i, j, obj);
    }

    public static void p(Object obj, long j, long j2) {
        c.s(obj, j, j2);
    }

    public static void q(long j, Object obj, Object obj2) {
        c.t(j, obj, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x001b  */
    static {
        n03 n03Var;
        boolean zU;
        Unsafe unsafe;
        boolean z;
        Field declaredField;
        long jL;
        Field declaredField2;
        Unsafe unsafeJ = j();
        a = unsafeJ;
        b = r5.a;
        Class<?> cls = Long.TYPE;
        boolean zG = g(cls);
        Class cls2 = Integer.TYPE;
        boolean zG2 = g(cls2);
        boolean z2 = true;
        Field field = null;
        if (unsafeJ == null) {
            n03Var = null;
        } else if (zG) {
            n03Var = new n03(unsafeJ, 1);
        } else if (!zG2) {
            n03Var = null;
        } else {
            n03Var = new n03(unsafeJ, 0);
        }
        c = n03Var;
        if (n03Var == null) {
            zU = false;
        } else {
            zU = n03Var.u();
        }
        d = zU;
        if (n03Var == null || (unsafe = n03Var.a) == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = unsafe.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                cls3.getMethod("getInt", Object.class, cls);
                cls3.getMethod("putInt", Object.class, cls, cls2);
                cls3.getMethod("getLong", Object.class, cls);
                cls3.getMethod("putLong", Object.class, cls, cls);
                cls3.getMethod("getObject", Object.class, cls);
                cls3.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th) {
                a(th);
                z = false;
            }
        }
        e = z;
        f = d(byte[].class);
        d(boolean[].class);
        e(boolean[].class);
        d(int[].class);
        e(int[].class);
        d(long[].class);
        e(long[].class);
        d(float[].class);
        e(float[].class);
        d(double[].class);
        e(double[].class);
        d(Object[].class);
        e(Object[].class);
        Class cls4 = r5.a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField == null) {
            try {
                declaredField2 = Buffer.class.getDeclaredField(SafeDKWebAppInterface.j);
            } catch (Throwable unused2) {
                declaredField2 = null;
            }
            if (declaredField2 != null && declaredField2.getType() == cls) {
                field = declaredField2;
            }
            declaredField = field;
        }
        if (declaredField != null && n03Var != null) {
            jL = n03Var.l(declaredField);
        } else {
            jL = -1;
        }
        g = jL;
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            z2 = false;
        }
        h = z2;
    }
}
