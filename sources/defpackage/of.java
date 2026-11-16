package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class of extends rf1 {
    public final long a;
    public final Integer b;
    public final nv c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final kq1 h;
    public final ik0 i;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rf1) {
            rf1 rf1Var = (rf1) obj;
            of ofVar = (of) rf1Var;
            if (this.a == ofVar.a) {
                Integer num = ofVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    nv nvVar = ofVar.c;
                    nv nvVar2 = this.c;
                    if (nvVar2 != null ? nvVar2.equals(nvVar) : nvVar == null) {
                        if (this.d == ofVar.d) {
                            if (Arrays.equals(this.e, rf1Var instanceof of ? ((of) rf1Var).e : ofVar.e)) {
                                String str = ofVar.f;
                                String str2 = this.f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.g == ofVar.g) {
                                        kq1 kq1Var = ofVar.h;
                                        kq1 kq1Var2 = this.h;
                                        if (kq1Var2 != null ? kq1Var2.equals(kq1Var) : kq1Var == null) {
                                            ik0 ik0Var = ofVar.i;
                                            ik0 ik0Var2 = this.i;
                                            if (ik0Var2 != null ? ik0Var2.equals(ik0Var) : ik0Var == null) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        nv nvVar = this.c;
        int iHashCode2 = (iHashCode ^ (nvVar == null ? 0 : nvVar.hashCode())) * 1000003;
        long j2 = this.d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        kq1 kq1Var = this.h;
        int iHashCode5 = (i2 ^ (kq1Var == null ? 0 : kq1Var.hashCode())) * 1000003;
        ik0 ik0Var = this.i;
        return iHashCode5 ^ (ik0Var != null ? ik0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }

    public of(long j, Integer num, nv nvVar, long j2, byte[] bArr, String str, long j3, kq1 kq1Var, ik0 ik0Var) {
        this.a = j;
        this.b = num;
        this.c = nvVar;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = kq1Var;
        this.i = ik0Var;
    }
}
