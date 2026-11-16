package defpackage;

import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class b12 {
    public final boolean a;
    public final boolean b;
    public final TCFPurpose c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b12)) {
            return false;
        }
        b12 b12Var = (b12) obj;
        return this.a == b12Var.a && this.b == b12Var.b && this.c.equals(b12Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + jc1.f(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "PurposeProps(checked=" + this.a + ", legitimateInterestChecked=" + this.b + ", purpose=" + this.c + ")";
    }

    public b12(boolean z, boolean z2, TCFPurpose tCFPurpose) {
        this.a = z;
        this.b = z2;
        this.c = tCFPurpose;
    }
}
