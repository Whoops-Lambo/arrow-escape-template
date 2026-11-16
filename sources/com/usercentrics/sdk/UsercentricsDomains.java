package com.usercentrics.sdk;

import defpackage.dk2;
import defpackage.ep0;
import defpackage.n30;
import defpackage.nj;
import defpackage.pv1;
import defpackage.q63;
import defpackage.s71;
import defpackage.z92;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/sdk/UsercentricsDomains;", "", "Companion", "$serializer", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@z92
public final /* data */ class UsercentricsDomains {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/usercentrics/sdk/UsercentricsDomains$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/UsercentricsDomains;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return UsercentricsDomains$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsercentricsDomains)) {
            return false;
        }
        UsercentricsDomains usercentricsDomains = (UsercentricsDomains) obj;
        return s71.b(this.a, usercentricsDomains.a) && s71.b(this.b, usercentricsDomains.b) && s71.b(this.c, usercentricsDomains.c) && s71.b(this.d, usercentricsDomains.d) && s71.b(this.e, usercentricsDomains.e);
    }

    public /* synthetic */ UsercentricsDomains(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            ep0.J(i, 31, UsercentricsDomains$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean a() {
        String str = this.a;
        if (!dk2.Z(str)) {
            String str2 = this.b;
            if (!dk2.Z(str2)) {
                String str3 = this.c;
                if (!dk2.Z(str3)) {
                    String str4 = this.d;
                    if (!dk2.Z(str4)) {
                        String str5 = this.e;
                        if (!dk2.Z(str5) && !dk2.O(str, "usercentrics.eu", false) && !dk2.O(str2, "usercentrics.eu", false) && !dk2.O(str3, "usercentrics.eu", false) && !dk2.O(str4, "usercentrics.eu", false) && !dk2.O(str5, "usercentrics.eu", false)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + n30.c(n30.c(n30.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = pv1.r("UsercentricsDomains(aggregatorCdnUrl=", this.a, ", cdnUrl=", this.b, ", analyticsUrl=");
        q63.y(sbR, this.c, ", saveConsentsUrl=", this.d, ", getConsentsUrl=");
        return nj.q(sbR, this.e, ")");
    }

    public UsercentricsDomains(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }
}
