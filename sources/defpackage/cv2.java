package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cv2 {
    public final String a;
    public final boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv2)) {
            return false;
        }
        cv2 cv2Var = (cv2) obj;
        return s71.b(this.a, cv2Var.a) && this.b == cv2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UCFirstLayerCCPAToggle(label=" + this.a + ", initialValue=" + this.b + ")";
    }

    public cv2(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }
}
