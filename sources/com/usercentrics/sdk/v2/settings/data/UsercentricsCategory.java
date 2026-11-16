package com.usercentrics.sdk.v2.settings.data;

import defpackage.ep0;
import defpackage.jc1;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import defpackage.z92;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;", "", "Companion", "$serializer", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@z92
public final /* data */ class UsercentricsCategory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return UsercentricsCategory$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsercentricsCategory)) {
            return false;
        }
        UsercentricsCategory usercentricsCategory = (UsercentricsCategory) obj;
        return s71.b(this.a, usercentricsCategory.a) && s71.b(this.b, usercentricsCategory.b) && s71.b(this.c, usercentricsCategory.c) && this.d == usercentricsCategory.d && this.e == usercentricsCategory.e && this.f == usercentricsCategory.f;
    }

    public /* synthetic */ UsercentricsCategory(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (1 != (i & 1)) {
            ep0.J(i, 1, UsercentricsCategory$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z3;
        }
    }

    public final int hashCode() {
        int iC = n30.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.f) + jc1.f(jc1.f((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbR = pv1.r("UsercentricsCategory(categorySlug=", this.a, ", label=", this.b, ", description=");
        sbR.append(this.c);
        sbR.append(", isEssential=");
        sbR.append(this.d);
        sbR.append(", isHidden=");
        sbR.append(this.e);
        sbR.append(", isExempt=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
