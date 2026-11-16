package com.explorestack.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class z8 extends b9 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // com.explorestack.protobuf.b9
    public final void c(long j, byte[] bArr, long j2, long j3) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.explorestack.protobuf.b9
    public final boolean d(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (c9.h) {
                    if (c9.h(j, obj) == 0) {
                        return false;
                    }
                } else if (c9.i(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (c9.h) {
                    if (c9.h(j, obj) == 0) {
                        return false;
                    }
                } else if (c9.i(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.explorestack.protobuf.b9
    public final byte e(long j) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.explorestack.protobuf.b9
    public final byte f(long j, Object obj) {
        switch (this.b) {
            case 0:
                return c9.h ? c9.h(j, obj) : c9.i(j, obj);
            default:
                return c9.h ? c9.h(j, obj) : c9.i(j, obj);
        }
    }

    @Override // com.explorestack.protobuf.b9
    public final double g(long j, Object obj) {
        switch (this.b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(k(j, obj));
    }

    @Override // com.explorestack.protobuf.b9
    public final float h(long j, Object obj) {
        switch (this.b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(i(j, obj));
    }

    @Override // com.explorestack.protobuf.b9
    public final long j(long j) {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.explorestack.protobuf.b9
    public final void n(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!c9.h) {
                    c9.n(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    c9.m(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!c9.h) {
                    c9.n(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    c9.m(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.explorestack.protobuf.b9
    public final void o(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!c9.h) {
                    c9.n(obj, j, b);
                } else {
                    c9.m(obj, j, b);
                }
                break;
            default:
                if (!c9.h) {
                    c9.n(obj, j, b);
                } else {
                    c9.m(obj, j, b);
                }
                break;
        }
    }

    @Override // com.explorestack.protobuf.b9
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

    @Override // com.explorestack.protobuf.b9
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

    @Override // com.explorestack.protobuf.b9
    public final boolean v() {
        switch (this.b) {
        }
        return false;
    }
}
