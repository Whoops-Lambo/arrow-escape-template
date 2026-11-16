package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g85 extends lp3 {
    @Override // defpackage.lp3
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // defpackage.lp3
    public final float d(Object obj, long j) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // defpackage.lp3
    public final void h(Object obj, long j, boolean z) {
        if (i85.g) {
            i85.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            i85.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.lp3
    public final void j(Object obj, long j, byte b) {
        if (i85.g) {
            i85.c(obj, j, b);
        } else {
            i85.d(obj, j, b);
        }
    }

    @Override // defpackage.lp3
    public final boolean u(Object obj, long j) {
        return i85.g ? i85.n(obj, j) : i85.o(obj, j);
    }

    @Override // defpackage.lp3
    public final void n(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.lp3
    public final void r(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }
}
