package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y extends rc1 implements sr0 {
    public final /* synthetic */ Sdk.SDKError.Reason a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Sdk.SDKError.Builder c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Sdk.SDKError.Reason reason, String str, Sdk.SDKError.Builder builder) {
        super(0);
        this.a = reason;
        this.b = str;
        this.c = builder;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Logging error: ");
        sbA.append(this.a);
        sbA.append(" with message: ");
        sbA.append(this.b);
        sbA.append(", mediation: ");
        sbA.append(this.c.getMediationName());
        return sbA.toString();
    }
}
