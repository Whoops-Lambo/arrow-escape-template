package defpackage;

import com.google.android.gms.internal.ads.zzgch;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ek4 extends zzgch {
    public final String b;
    public final int c;
    public final int d;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof zzgch)) {
                return false;
            }
            zzgch zzgchVar = (zzgch) obj;
            if (!this.b.equals(zzgchVar.a())) {
                return false;
            }
            int iB = zzgchVar.b();
            int i = this.c;
            if (i == 0) {
                throw null;
            }
            if (i != iB) {
                return false;
            }
            int iC = zzgchVar.c();
            if (this.d == 0) {
                throw null;
            }
            if (iC != 1) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgch
    public final String a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzgch
    public final int b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzgch
    public final int c() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ 1000003;
        int i = this.c;
        if (i == 0) {
            throw null;
        }
        int i2 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.d != 0) {
            return (i2 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i == 1) {
            str = "ALL_CHECKS";
        } else if (i == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i != 3) {
            str = i != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        String str2 = this.d == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.b;
        StringBuilder sb = new StringBuilder(str2.length() + q63.a(String.valueOf(str3).length() + 73, 52, str) + 1);
        q63.y(sb, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return jc1.o(", multipleProductIdGroupsResolver=null, filePurpose=", str2, sb, "}");
    }

    public /* synthetic */ ek4(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
    }
}
