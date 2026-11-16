package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class rt3 {
    public final Unsafe a;

    public abstract double a(Object obj, long j);

    public abstract void c(Object obj, long j, double d);

    public abstract void d(Object obj, long j, float f);

    public abstract void f(Object obj, long j, boolean z);

    public abstract float g(Object obj, long j);

    public abstract boolean h(long j, Object obj);

    public final void b(int i, long j, Object obj) {
        this.a.putInt(obj, j, i);
    }

    public final void e(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final int i(long j, Object obj) {
        return this.a.getInt(obj, j);
    }

    public final long j(long j, Object obj) {
        return this.a.getLong(obj, j);
    }

    public rt3(Unsafe unsafe) {
        this.a = unsafe;
    }
}
