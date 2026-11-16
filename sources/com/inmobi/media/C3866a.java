package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import defpackage.az2;
import defpackage.dy;
import defpackage.er;
import defpackage.h50;
import defpackage.wr0;

/* JADX INFO: renamed from: com.inmobi.media.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C3866a extends T0 {
    public final byte[] b;
    public final long c;

    @Override // com.inmobi.media.T0
    public final az2 a(AdResponse adResponse, wr0 wr0Var) {
        Z9 z9 = this.a;
        if (z9 != null) {
            long j = this.c;
            long placementId = adResponse.getPlacementId();
            StringBuilder sbO = h50.o(j, "Instance PLId: ", ", Response PLId: ");
            sbO.append(placementId);
            z9.a("ABAdResponseManager", sbO.toString());
        }
        X0.a(adResponse, this.a, wr0Var);
        return az2.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3866a(byte[] bArr, long j, Z9 z9) {
        super(z9);
        bArr.getClass();
        this.b = bArr;
        this.c = j;
    }

    @Override // com.inmobi.media.T0
    public final Object a(dy dyVar) {
        return new String(this.b, er.a);
    }
}
