package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.丿, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1161 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1082 f3368;

    public C1161(C1082 c1082) {
        this.f3368 = c1082;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        C1082 c1082 = this.f3368;
        synchronized (c1082) {
            c1082.f3122 = true;
        }
        C0670 c0670 = this.f3368.f3126;
        if (c0670 != null) {
            c0670.mo418();
        }
        ArrayList arrayList = new ArrayList(this.f3368.f3125);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((InterfaceC1265) obj).mo418();
        }
        this.f3368.f3125.clear();
        ArrayList arrayList2 = new ArrayList(this.f3368.f3124);
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((InterfaceC1265) obj2).mo418();
        }
    }
}
