package com.usercentrics.sdk.services.tcf.interfaces;

import com.usercentrics.tcf.core.model.gvl.DataRetention;
import com.usercentrics.tcf.core.model.gvl.VendorUrl$$serializer;
import defpackage.ep0;
import defpackage.h50;
import defpackage.j8;
import defpackage.jc1;
import defpackage.n30;
import defpackage.pv1;
import defpackage.q63;
import defpackage.s71;
import defpackage.z92;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;", "", "Companion", "$serializer", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@z92
public final /* data */ class TCFVendor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final KSerializer[] x;
    public final Boolean a;
    public final List b;
    public final List c;
    public final int d;
    public final Boolean e;
    public final List f;
    public final String g;
    public final String h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final boolean m;
    public final boolean n;
    public final Double o;
    public final boolean p;
    public final String q;
    public final boolean r;
    public final Boolean s;
    public final Boolean t;
    public final DataRetention u;
    public final List v;
    public final List w;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return TCFVendor$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TCFVendor(int i, Boolean bool, List list, List list2, int i2, Boolean bool2, List list3, String str, String str2, List list4, List list5, List list6, List list7, boolean z, boolean z2, Double d, boolean z3, String str3, boolean z4, Boolean bool3, Boolean bool4, DataRetention dataRetention, List list8, List list9) {
        if (6340607 != (i & 6340607)) {
            ep0.J(i, 6340607, TCFVendor$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = bool;
        this.b = list;
        this.c = list2;
        this.d = i2;
        this.e = bool2;
        this.f = list3;
        this.g = str;
        this.h = str2;
        this.i = list4;
        this.j = list5;
        this.k = list6;
        this.l = list7;
        this.m = z;
        this.n = z2;
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = d;
        }
        this.p = z3;
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str3;
        }
        this.r = (131072 & i) == 0 ? false : z4;
        this.s = (262144 & i) == 0 ? Boolean.FALSE : bool3;
        this.t = (524288 & i) == 0 ? Boolean.FALSE : bool4;
        if ((i & 1048576) == 0) {
            this.u = null;
        } else {
            this.u = dataRetention;
        }
        this.v = list8;
        this.w = list9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TCFVendor)) {
            return false;
        }
        TCFVendor tCFVendor = (TCFVendor) obj;
        return s71.b(this.a, tCFVendor.a) && s71.b(this.b, tCFVendor.b) && s71.b(this.c, tCFVendor.c) && this.d == tCFVendor.d && s71.b(this.e, tCFVendor.e) && s71.b(this.f, tCFVendor.f) && s71.b(this.g, tCFVendor.g) && s71.b(this.h, tCFVendor.h) && s71.b(this.i, tCFVendor.i) && s71.b(this.j, tCFVendor.j) && s71.b(this.k, tCFVendor.k) && s71.b(this.l, tCFVendor.l) && this.m == tCFVendor.m && this.n == tCFVendor.n && s71.b(this.o, tCFVendor.o) && this.p == tCFVendor.p && s71.b(this.q, tCFVendor.q) && this.r == tCFVendor.r && s71.b(this.s, tCFVendor.s) && s71.b(this.t, tCFVendor.t) && s71.b(this.u, tCFVendor.u) && s71.b(this.v, tCFVendor.v) && s71.b(this.w, tCFVendor.w);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iD = jc1.d(this.d, pv1.e(pv1.e((bool == null ? 0 : bool.hashCode()) * 31, 31, this.b), 31, this.c), 31);
        Boolean bool2 = this.e;
        int iF = jc1.f(jc1.f(pv1.e(pv1.e(pv1.e(pv1.e(n30.c(n30.c(pv1.e((iD + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        Double d = this.o;
        int iF2 = jc1.f((iF + (d == null ? 0 : d.hashCode())) * 31, 31, this.p);
        String str = this.q;
        int iF3 = jc1.f((iF2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.r);
        Boolean bool3 = this.s;
        int iHashCode = (iF3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.t;
        int iHashCode2 = (iHashCode + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        DataRetention dataRetention = this.u;
        return this.w.hashCode() + pv1.e((iHashCode2 + (dataRetention != null ? dataRetention.hashCode() : 0)) * 31, 31, this.v);
    }

    static {
        IdAndName$$serializer idAndName$$serializer = IdAndName$$serializer.INSTANCE;
        x = new KSerializer[]{null, new j8(idAndName$$serializer, 0), new j8(idAndName$$serializer, 0), null, null, new j8(idAndName$$serializer, 0), null, null, new j8(idAndName$$serializer, 0), new j8(TCFVendorRestriction$$serializer.INSTANCE, 0), new j8(idAndName$$serializer, 0), new j8(idAndName$$serializer, 0), null, null, null, null, null, null, null, null, null, new j8(idAndName$$serializer, 0), new j8(VendorUrl$$serializer.INSTANCE, 0)};
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TCFVendor(consent=");
        sb.append(this.a);
        sb.append(", features=");
        sb.append(this.b);
        sb.append(", flexiblePurposes=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", legitimateInterestConsent=");
        sb.append(this.e);
        sb.append(", legitimateInterestPurposes=");
        sb.append(this.f);
        sb.append(", name=");
        q63.y(sb, this.g, ", policyUrl=", this.h, ", purposes=");
        jc1.A(sb, this.i, ", restrictions=", this.j, ", specialFeatures=");
        jc1.A(sb, this.k, ", specialPurposes=", this.l, ", showConsentToggle=");
        h50.z(sb, this.m, ", showLegitimateInterestToggle=", this.n, ", cookieMaxAgeSeconds=");
        sb.append(this.o);
        sb.append(", usesNonCookieAccess=");
        sb.append(this.p);
        sb.append(", deviceStorageDisclosureUrl=");
        sb.append(this.q);
        sb.append(", usesCookies=");
        sb.append(this.r);
        sb.append(", cookieRefresh=");
        sb.append(this.s);
        sb.append(", dataSharedOutsideEU=");
        sb.append(this.t);
        sb.append(", dataRetention=");
        sb.append(this.u);
        sb.append(", dataCategories=");
        sb.append(this.v);
        sb.append(", vendorUrls=");
        sb.append(this.w);
        sb.append(")");
        return sb.toString();
    }

    public TCFVendor(Boolean bool, ArrayList arrayList, ArrayList arrayList2, int i, Boolean bool2, List list, String str, String str2, List list2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, boolean z, boolean z2, Double d, boolean z3, String str3, boolean z4, Boolean bool3, Boolean bool4, DataRetention dataRetention, List list3, List list4) {
        list.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        this.a = bool;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = i;
        this.e = bool2;
        this.f = list;
        this.g = str;
        this.h = str2;
        this.i = list2;
        this.j = arrayList3;
        this.k = arrayList4;
        this.l = arrayList5;
        this.m = z;
        this.n = z2;
        this.o = d;
        this.p = z3;
        this.q = str3;
        this.r = z4;
        this.s = bool3;
        this.t = bool4;
        this.u = dataRetention;
        this.v = list3;
        this.w = list4;
    }
}
