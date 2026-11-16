package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﬤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1175 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1152 f3472;

    public C1175(C1152 c1152) {
        this.f3472 = c1152;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        ArrayList arrayList = new ArrayList(this.f3472.f3342.values());
        this.f3472.f3342.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1192 c1192 = (C1192) obj;
            c1192.f3332 = null;
            c1192.f3595 = null;
            AbstractC1227 abstractC1227M885 = AbstractC1227.m885();
            synchronized (abstractC1227M885) {
                abstractC1227M885.f3730.remove(c1192);
            }
        }
    }
}
