package com.vungle.ads.internal.executor;

import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.OutOfMemory;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends rc1 implements sr0 {
    public final /* synthetic */ j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(0);
        this.a = jVar;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        StringBuilder sbA = l.a("submit callable error in ");
        sbA.append(this.a.a());
        new OutOfMemory(sbA.toString()).logErrorNoReturnValue$vungle_ads_release();
        return az2.a;
    }
}
