package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᵤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1030 implements InterfaceC1265 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0905 f3006;

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1265
    /* JADX INFO: renamed from: ﾒ */
    public final void mo418() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f3006.f2407);
            this.f3006.f2407.clear();
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
    }

    public C1030(C0905 c0905) {
        this.f3006 = c0905;
    }
}
