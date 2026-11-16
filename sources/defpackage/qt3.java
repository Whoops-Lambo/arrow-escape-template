package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qt3 extends rt3 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qt3(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.rt3
    public final double a(Object obj, long j) {
        switch (this.b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(j(j, obj));
    }

    @Override // defpackage.rt3
    public final void c(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                e(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                e(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.rt3
    public final void d(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                b(Float.floatToIntBits(f), j, obj);
                break;
            default:
                b(Float.floatToIntBits(f), j, obj);
                break;
        }
    }

    @Override // defpackage.rt3
    public final void f(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!st3.e) {
                    st3.h(obj, j, z);
                } else {
                    st3.e(obj, j, z);
                }
                break;
            default:
                if (!st3.e) {
                    st3.h(obj, j, z);
                } else {
                    st3.e(obj, j, z);
                }
                break;
        }
    }

    @Override // defpackage.rt3
    public final float g(Object obj, long j) {
        switch (this.b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(i(j, obj));
    }

    @Override // defpackage.rt3
    public final boolean h(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (st3.e) {
                    if (((byte) (st3.c.i((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else {
                    if (((byte) (st3.c.i((-4) & j, obj) >>> ((int) ((j & 3) << 3)))) == 0) {
                        return false;
                    }
                }
                return true;
            default:
                if (st3.e) {
                    if (((byte) (st3.c.i((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else {
                    if (((byte) (st3.c.i((-4) & j, obj) >>> ((int) ((j & 3) << 3)))) == 0) {
                        return false;
                    }
                }
                return true;
        }
    }
}
