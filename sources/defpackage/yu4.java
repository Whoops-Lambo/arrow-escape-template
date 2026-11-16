package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yu4 extends lp3 {
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
        if (jv4.f) {
            jv4.f(obj, j, z);
        } else {
            jv4.g(obj, j, z);
        }
    }

    @Override // defpackage.lp3
    public final boolean s(long j, Object obj) {
        return jv4.f ? jv4.k(j, obj) : jv4.l(j, obj);
    }

    @Override // defpackage.lp3
    public final void k(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.lp3
    public final void o(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }
}
