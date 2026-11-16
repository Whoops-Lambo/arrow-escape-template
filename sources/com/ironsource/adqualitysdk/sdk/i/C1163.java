package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.乁, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1163 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1152 f3369;

    public C1163(C1152 c1152) {
        this.f3369 = c1152;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        ArrayList arrayList = new ArrayList(this.f3369.f3341.values());
        this.f3369.f3341.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m1 m1Var = (m1) obj;
            m1Var.f3332 = null;
            C0883.m637().m638(m1Var);
        }
    }
}
