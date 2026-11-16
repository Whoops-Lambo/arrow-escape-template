package defpackage;

import com.usercentrics.sdk.v2.settings.data.CCPASettings;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vd1 {
    public final List a;
    public final List b;
    public final xs0 c;
    public final CCPASettings d;
    public String e;
    public final String f;
    public final boolean g;
    public final List h;
    public final xw1 i;
    public final ls j;
    public final String k;
    public final String l;
    public final Long m;
    public final Long n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd1)) {
            return false;
        }
        vd1 vd1Var = (vd1) obj;
        return s71.b(this.a, vd1Var.a) && s71.b(this.b, vd1Var.b) && s71.b(this.c, vd1Var.c) && s71.b(this.d, vd1Var.d) && s71.b(this.e, vd1Var.e) && s71.b(this.f, vd1Var.f) && this.g == vd1Var.g && s71.b(this.h, vd1Var.h) && s71.b(this.i, vd1Var.i) && s71.b(this.j, vd1Var.j) && s71.b(this.k, vd1Var.k) && s71.b(this.l, vd1Var.l) && s71.b(this.m, vd1Var.m) && s71.b(this.n, vd1Var.n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ vd1(List list, List list2, xs0 xs0Var, CCPASettings cCPASettings, String str, String str2, boolean z, ArrayList arrayList, xw1 xw1Var, ls lsVar, String str3, String str4, Long l, int i) {
        int i2 = i & 1;
        gg0 gg0Var = gg0.a;
        this(i2 != 0 ? gg0Var : list, (i & 2) != 0 ? gg0Var : list2, (i & 4) != 0 ? null : xs0Var, (i & 8) != 0 ? null : cCPASettings, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? gg0Var : arrayList, (i & 256) != 0 ? null : xw1Var, (i & 512) != 0 ? null : lsVar, (i & 1024) != 0 ? "" : str3, (i & 2048) != 0 ? null : str4, (Long) null, (i & 8192) != 0 ? null : l);
    }

    public static vd1 a(vd1 vd1Var, List list, String str, String str2, Long l, int i) {
        List list2 = vd1Var.a;
        List list3 = (i & 2) != 0 ? vd1Var.b : list;
        xs0 xs0Var = vd1Var.c;
        List list4 = list3;
        CCPASettings cCPASettings = vd1Var.d;
        String str3 = (i & 16) != 0 ? vd1Var.e : str;
        String str4 = vd1Var.f;
        String str5 = str3;
        boolean z = vd1Var.g;
        List list5 = vd1Var.h;
        xw1 xw1Var = vd1Var.i;
        ls lsVar = vd1Var.j;
        String str6 = (i & 1024) != 0 ? vd1Var.k : str2;
        String str7 = vd1Var.l;
        Long l2 = (i & 4096) != 0 ? vd1Var.m : l;
        Long l3 = vd1Var.n;
        vd1Var.getClass();
        list2.getClass();
        list4.getClass();
        str5.getClass();
        str4.getClass();
        list5.getClass();
        str6.getClass();
        return new vd1(list2, list4, xs0Var, cCPASettings, str5, str4, z, list5, xw1Var, lsVar, str6, str7, l2, l3);
    }

    public final int hashCode() {
        int iE = pv1.e(this.a.hashCode() * 31, 31, this.b);
        xs0 xs0Var = this.c;
        int iHashCode = (iE + (xs0Var == null ? 0 : xs0Var.hashCode())) * 31;
        CCPASettings cCPASettings = this.d;
        int iE2 = pv1.e(jc1.f(n30.c(n30.c((iHashCode + (cCPASettings == null ? 0 : cCPASettings.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        xw1 xw1Var = this.i;
        int iHashCode2 = (iE2 + (xw1Var == null ? 0 : xw1Var.hashCode())) * 31;
        ls lsVar = this.j;
        int iC = n30.c((iHashCode2 + (lsVar == null ? 0 : lsVar.hashCode())) * 31, 31, this.k);
        String str = this.l;
        int iHashCode3 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.m;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.n;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.e;
        StringBuilder sb = new StringBuilder("LegacyExtendedSettings(categories=");
        sb.append(this.a);
        sb.append(", services=");
        sb.append(this.b);
        sb.append(", gdpr=");
        sb.append(this.c);
        sb.append(", ccpa=");
        sb.append(this.d);
        sb.append(", controllerId=");
        q63.y(sb, str, ", id=", this.f, ", isTcfEnabled=");
        sb.append(this.g);
        sb.append(", showFirstLayerOnVersionChange=");
        sb.append(this.h);
        sb.append(", tcfui=");
        sb.append(this.i);
        sb.append(", ui=");
        sb.append(this.j);
        sb.append(", version=");
        q63.y(sb, this.k, ", framework=", this.l, ", restoredSessionLastInteractionTimestamp=");
        sb.append(this.m);
        sb.append(", renewConsentsTimestampInSeconds=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }

    public vd1(List list, List list2, xs0 xs0Var, CCPASettings cCPASettings, String str, String str2, boolean z, List list3, xw1 xw1Var, ls lsVar, String str3, String str4, Long l, Long l2) {
        list.getClass();
        list2.getClass();
        str.getClass();
        str2.getClass();
        list3.getClass();
        str3.getClass();
        this.a = list;
        this.b = list2;
        this.c = xs0Var;
        this.d = cCPASettings;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = list3;
        this.i = xw1Var;
        this.j = lsVar;
        this.k = str3;
        this.l = str4;
        this.m = l;
        this.n = l2;
    }
}
