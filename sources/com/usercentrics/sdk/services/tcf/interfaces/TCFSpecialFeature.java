package com.usercentrics.sdk.services.tcf.interfaces;

import defpackage.ep0;
import defpackage.j8;
import defpackage.jc1;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import defpackage.z92;
import defpackage.zj2;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;", "", "Companion", "$serializer", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@z92
public final /* data */ class TCFSpecialFeature {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final KSerializer[] i = {null, new j8(zj2.a, 0), null, null, null, null, null, null};
    public final String a;
    public final List b;
    public final int c;
    public final String d;
    public final Boolean e;
    public final boolean f;
    public final Integer g;
    public final boolean h;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return TCFSpecialFeature$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TCFSpecialFeature)) {
            return false;
        }
        TCFSpecialFeature tCFSpecialFeature = (TCFSpecialFeature) obj;
        return s71.b(this.a, tCFSpecialFeature.a) && s71.b(this.b, tCFSpecialFeature.b) && this.c == tCFSpecialFeature.c && s71.b(this.d, tCFSpecialFeature.d) && s71.b(this.e, tCFSpecialFeature.e) && this.f == tCFSpecialFeature.f && s71.b(this.g, tCFSpecialFeature.g) && this.h == tCFSpecialFeature.h;
    }

    public /* synthetic */ TCFSpecialFeature(int i2, String str, List list, int i3, String str2, Boolean bool, boolean z, Integer num, boolean z2) {
        if (255 != (i2 & 255)) {
            ep0.J(i2, 255, TCFSpecialFeature$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = i3;
        this.d = str2;
        this.e = bool;
        this.f = z;
        this.g = num;
        this.h = z2;
    }

    public final int hashCode() {
        int iC = n30.c(jc1.d(this.c, pv1.e(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        Boolean bool = this.e;
        int iF = jc1.f((iC + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f);
        Integer num = this.g;
        return Boolean.hashCode(this.h) + ((iF + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TCFSpecialFeature(purposeDescription=" + this.a + ", illustrations=" + this.b + ", id=" + this.c + ", name=" + this.d + ", consent=" + this.e + ", isPartOfASelectedStack=" + this.f + ", stackId=" + this.g + ", showConsentToggle=" + this.h + ")";
    }

    public TCFSpecialFeature(String str, List list, int i2, String str2, Boolean bool, boolean z, Integer num, boolean z2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.a = str;
        this.b = list;
        this.c = i2;
        this.d = str2;
        this.e = bool;
        this.f = z;
        this.g = num;
        this.h = z2;
    }
}
