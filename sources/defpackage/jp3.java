package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jp3 extends lp3 {
    @Override // defpackage.lp3
    public final void b(Object obj, long j, byte b) {
        if (mp3.f) {
            mp3.b(obj, j, b);
        } else {
            mp3.c(obj, j, b);
        }
    }

    @Override // defpackage.lp3
    public final boolean f(long j, Object obj) {
        return mp3.f ? mp3.n(obj, j) : mp3.o(obj, j);
    }

    @Override // defpackage.lp3
    public final void h(Object obj, long j, boolean z) {
        if (mp3.f) {
            mp3.b(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            mp3.c(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.lp3
    public final float i(long j, Object obj) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // defpackage.lp3
    public final double p(long j, Object obj) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // defpackage.lp3
    public final void o(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.lp3
    public final void t(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
