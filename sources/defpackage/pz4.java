package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pz4 extends lp3 {
    @Override // defpackage.lp3
    public final boolean c(long j, Object obj) {
        return rz4.e ? rz4.j(j, obj) : rz4.k(j, obj);
    }

    @Override // defpackage.lp3
    public final void e(Object obj, long j, boolean z) {
        if (rz4.e) {
            rz4.l(obj, j, z);
        } else {
            rz4.m(obj, j, z);
        }
    }

    @Override // defpackage.lp3
    public final float g(long j, Object obj) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // defpackage.lp3
    public final double m(long j, Object obj) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // defpackage.lp3
    public final void l(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.lp3
    public final void q(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
