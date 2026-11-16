package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ｳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1329 implements InterfaceC0536 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1168 f3968;

    public C1329(C1168 c1168) {
        this.f3968 = c1168;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0536
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo334(ArrayList arrayList, C0752 c0752) {
        C1168 c1168 = this.f3968;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) arrayList.get(0);
        c1168.getClass();
        return new C1193(c1168, threadPoolExecutor, c0752);
    }
}
