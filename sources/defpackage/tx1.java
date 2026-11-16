package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class tx1 extends ns1 {
    public final ArrayList f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tx1) && this.f.equals(((tx1) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "PredefinedUIServicesCardContent(services=" + this.f + ")";
    }

    public tx1(ArrayList arrayList) {
        this.f = arrayList;
    }
}
