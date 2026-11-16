package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n03 extends o03 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n03(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.o03
    public final void c(long j, byte[] bArr, long j2, long j3) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.o03
    public final void d(byte[] bArr, long j, long j2, long j3) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.o03
    public final boolean e(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (p03.h) {
                    if (p03.h(j, obj) == 0) {
                        return false;
                    }
                } else if (p03.i(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (p03.h) {
                    if (p03.h(j, obj) == 0) {
                        return false;
                    }
                } else if (p03.i(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.o03
    public final byte f(long j) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.o03
    public final double g(long j, Object obj) {
        switch (this.b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(j(j, obj));
    }

    @Override // defpackage.o03
    public final float h(long j, Object obj) {
        switch (this.b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(i(j, obj));
    }

    @Override // defpackage.o03
    public final void m(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!p03.h) {
                    p03.n(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    p03.m(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!p03.h) {
                    p03.n(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    p03.m(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.o03
    public final void n(byte b, long j) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.o03
    public final void o(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!p03.h) {
                    p03.n(obj, j, b);
                } else {
                    p03.m(obj, j, b);
                }
                break;
            default:
                if (!p03.h) {
                    p03.n(obj, j, b);
                } else {
                    p03.m(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.o03
    public final void p(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                s(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                s(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.o03
    public final void q(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                r(Float.floatToIntBits(f), j, obj);
                break;
            default:
                r(Float.floatToIntBits(f), j, obj);
                break;
        }
    }

    @Override // defpackage.o03
    public final boolean u() {
        switch (this.b) {
        }
        return false;
    }
}
