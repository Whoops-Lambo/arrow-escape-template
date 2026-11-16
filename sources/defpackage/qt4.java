package defpackage;

import com.google.android.gms.internal.ads.zzhcz;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qt4 extends ns1 {
    public static final Unsafe f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;

    static {
        Unsafe unsafeO;
        try {
            try {
                unsafeO = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    unsafeO = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, tt4.a);
                } catch (Exception unused2) {
                    unsafeO = O();
                    Unsafe unsafe = unsafeO;
                }
            }
            try {
                h = unsafeO.objectFieldOffset(st4.class.getDeclaredField("c"));
                g = unsafeO.objectFieldOffset(st4.class.getDeclaredField("b"));
                i = unsafeO.objectFieldOffset(st4.class.getDeclaredField("a"));
                j = unsafeO.objectFieldOffset(rt4.class.getDeclaredField("a"));
                k = unsafeO.objectFieldOffset(rt4.class.getDeclaredField("b"));
                f = unsafeO;
            } catch (NoSuchFieldException e) {
                dr0.m(e);
            }
        } catch (Exception e2) {
            vq2.n("Could not initialize intrinsics", e2);
        }
    }

    public static /* synthetic */ Unsafe O() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // defpackage.ns1
    public final void G(rt4 rt4Var, Thread thread) {
        f.putObject(rt4Var, j, thread);
    }

    @Override // defpackage.ns1
    public final void H(rt4 rt4Var, rt4 rt4Var2) {
        f.putObject(rt4Var, k, rt4Var2);
    }

    @Override // defpackage.ns1
    public final boolean J(st4 st4Var, rt4 rt4Var, rt4 rt4Var2) {
        return ot4.a(f, st4Var, h, rt4Var, rt4Var2);
    }

    @Override // defpackage.ns1
    public final boolean K(zzhcz zzhczVar, it4 it4Var, it4 it4Var2) {
        return nt4.a(f, zzhczVar, g, it4Var, it4Var2);
    }

    @Override // defpackage.ns1
    public final rt4 L(zzhcz zzhczVar) {
        rt4 rt4Var;
        rt4 rt4Var2 = rt4.c;
        do {
            rt4Var = zzhczVar.c;
            if (rt4Var2 == rt4Var) {
                break;
            }
        } while (!J(zzhczVar, rt4Var, rt4Var2));
        return rt4Var;
    }

    @Override // defpackage.ns1
    public final it4 M(zzhcz zzhczVar) {
        it4 it4Var;
        it4 it4Var2 = it4.d;
        do {
            it4Var = zzhczVar.b;
            if (it4Var2 == it4Var) {
                break;
            }
        } while (!K(zzhczVar, it4Var, it4Var2));
        return it4Var;
    }

    @Override // defpackage.ns1
    public final boolean N(st4 st4Var, Object obj, Object obj2) {
        return pt4.a(f, st4Var, i, obj, obj2);
    }
}
