package defpackage;

import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sh2 {
    public final boolean a;
    public final TCFSpecialFeature b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh2)) {
            return false;
        }
        sh2 sh2Var = (sh2) obj;
        return this.a == sh2Var.a && this.b.equals(sh2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SpecialFeatureProps(checked=" + this.a + ", specialFeature=" + this.b + ")";
    }

    public sh2(boolean z, TCFSpecialFeature tCFSpecialFeature) {
        this.a = z;
        this.b = tCFSpecialFeature;
    }
}
