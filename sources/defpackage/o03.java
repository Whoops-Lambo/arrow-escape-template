package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o03 {
    public final Unsafe a;

    public abstract void c(long j, byte[] bArr, long j2, long j3);

    public abstract void d(byte[] bArr, long j, long j2, long j3);

    public abstract boolean e(long j, Object obj);

    public abstract byte f(long j);

    public abstract double g(long j, Object obj);

    public abstract float h(long j, Object obj);

    public abstract void m(Object obj, long j, boolean z);

    public abstract void n(byte b, long j);

    public abstract void o(Object obj, long j, byte b);

    public abstract void p(Object obj, long j, double d);

    public abstract void q(Object obj, long j, float f);

    public abstract boolean u();

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public final int i(long j, Object obj) {
        return this.a.getInt(obj, j);
    }

    public final long j(long j, Object obj) {
        return this.a.getLong(obj, j);
    }

    public final Object k(long j, Object obj) {
        return this.a.getObject(obj, j);
    }

    public final long l(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final void r(int i, long j, Object obj) {
        this.a.putInt(obj, j, i);
    }

    public final void s(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final void t(long j, Object obj, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }

    public o03(Unsafe unsafe) {
        this.a = unsafe;
    }
}
