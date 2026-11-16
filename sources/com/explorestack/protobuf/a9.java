package com.explorestack.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a9 extends b9 {
    @Override // com.explorestack.protobuf.b9
    public final void c(long j, byte[] bArr, long j2, long j3) {
        this.a.copyMemory((Object) null, j, bArr, c9.f + j2, j3);
    }

    @Override // com.explorestack.protobuf.b9
    public final boolean d(long j, Object obj) {
        return this.a.getBoolean(obj, j);
    }

    @Override // com.explorestack.protobuf.b9
    public final byte e(long j) {
        return this.a.getByte(j);
    }

    @Override // com.explorestack.protobuf.b9
    public final byte f(long j, Object obj) {
        return this.a.getByte(obj, j);
    }

    @Override // com.explorestack.protobuf.b9
    public final double g(long j, Object obj) {
        return this.a.getDouble(obj, j);
    }

    @Override // com.explorestack.protobuf.b9
    public final float h(long j, Object obj) {
        return this.a.getFloat(obj, j);
    }

    @Override // com.explorestack.protobuf.b9
    public final long j(long j) {
        return this.a.getLong(j);
    }

    @Override // com.explorestack.protobuf.b9
    public final void n(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    @Override // com.explorestack.protobuf.b9
    public final void o(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    @Override // com.explorestack.protobuf.b9
    public final void p(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    @Override // com.explorestack.protobuf.b9
    public final void q(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    @Override // com.explorestack.protobuf.b9
    public final boolean u() {
        if (!super.u()) {
            return false;
        }
        try {
            Class<?> cls = this.a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            c9.a(th);
            return false;
        }
    }

    @Override // com.explorestack.protobuf.b9
    public final boolean v() {
        Unsafe unsafe = this.a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (c9.e() != null) {
                    try {
                        Class<?> cls3 = this.a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        c9.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                c9.a(th2);
            }
        }
        return false;
    }
}
