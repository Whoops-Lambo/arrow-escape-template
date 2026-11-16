package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vs {
    public final float a;
    public final float b;

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean a() {
        return this.a > this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vs)) {
            return false;
        }
        if (a() && ((vs) obj).a()) {
            return true;
        }
        vs vsVar = (vs) obj;
        return this.a == vsVar.a && this.b == vsVar.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }

    public vs(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
