package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class uw1 {
    public final String a;
    public final List b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw1)) {
            return false;
        }
        uw1 uw1Var = (uw1) obj;
        return this.a.equals(uw1Var.a) && this.b.equals(uw1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PredefinedUIDeviceStorageContent(title=" + this.a + ", content=" + this.b + ")";
    }

    public uw1(String str, List list) {
        this.a = str;
        this.b = list;
    }
}
