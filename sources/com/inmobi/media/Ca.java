package com.inmobi.media;

import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.n30;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class Ca extends F2 {
    public final String e;
    public final String f;

    public final String toString() {
        return pv1.w(this.a, UserDetailsUtils.UserDetailsLiterals.AT, this.f, " ");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ca(String str, String str2, String str3, String str4) {
        super(str3, str4);
        com.explorestack.protobuf.z.r(str, str2, str3);
        this.e = str;
        this.f = str2;
    }

    public Ca(String str, String str2, String str3) {
        this(n30.f(), str, str2, str3);
    }
}
