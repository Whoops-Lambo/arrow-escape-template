package com.explorestack.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b9 {
    public final Unsafe a;

    public abstract void c(long j, byte[] bArr, long j2, long j3);

    public abstract boolean d(long j, Object obj);

    public abstract byte e(long j);

    public abstract byte f(long j, Object obj);

    public abstract double g(long j, Object obj);

    public abstract float h(long j, Object obj);

    public abstract long j(long j);

    public abstract void n(Object obj, long j, boolean z);

    public abstract void o(Object obj, long j, byte b);

    public abstract void p(Object obj, long j, double d);

    public abstract void q(Object obj, long j, float f);

    public abstract boolean v();

    public final int a(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public final int i(long j, Object obj) {
        return this.a.getInt(obj, j);
    }

    public final long k(long j, Object obj) {
        return this.a.getLong(obj, j);
    }

    public final Object l(long j, Object obj) {
        return this.a.getObject(obj, j);
    }

    public final long m(Field field) {
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

    public boolean u() {
        Unsafe unsafe = this.a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            c9.a(th);
            return false;
        }
    }

    public b9(Unsafe unsafe) {
        this.a = unsafe;
    }
}
