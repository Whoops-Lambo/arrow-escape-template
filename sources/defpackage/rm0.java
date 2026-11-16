package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class rm0 {
    public final File a;
    public final List b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm0)) {
            return false;
        }
        rm0 rm0Var = (rm0) obj;
        return this.a.equals(rm0Var.a) && this.b.equals(rm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilePathComponents(root=");
        sb.append(this.a);
        sb.append(", segments=");
        return pv1.q(sb, this.b, ')');
    }

    public rm0(File file, List list) {
        this.a = file;
        this.b = list;
    }
}
