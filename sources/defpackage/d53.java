package defpackage;

import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d53 {
    public final boolean a;
    public final boolean b;
    public final TCFVendor c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d53)) {
            return false;
        }
        d53 d53Var = (d53) obj;
        return this.a == d53Var.a && this.b == d53Var.b && this.c.equals(d53Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + jc1.f(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "VendorProps(checked=" + this.a + ", legitimateInterestChecked=" + this.b + ", vendor=" + this.c + ")";
    }

    public d53(boolean z, boolean z2, TCFVendor tCFVendor) {
        this.a = z;
        this.b = z2;
        this.c = tCFVendor;
    }
}
