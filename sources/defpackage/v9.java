package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class v9 implements n02 {
    public final int d;

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return n02.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n02)) {
            return false;
        }
        n02 n02Var = (n02) obj;
        return this.d == n02Var.tag() && l02.a.equals(n02Var.intEncoding());
    }

    @Override // defpackage.n02
    public final l02 intEncoding() {
        return l02.a;
    }

    @Override // defpackage.n02
    public final int tag() {
        return this.d;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.d + "intEncoding=" + l02.a + ')';
    }

    public v9(int i) {
        this.d = i;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.d ^ 14552422) + (l02.a.hashCode() ^ 2041407134);
    }
}
