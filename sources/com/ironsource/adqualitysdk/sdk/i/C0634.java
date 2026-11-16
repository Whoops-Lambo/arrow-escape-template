package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ب, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0634 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0613 f1663;

    public C0634(C0613 c0613) {
        this.f1663 = c0613;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        boolean zMo766;
        C1189 c1189;
        EnumC0584 enumC0584;
        C0517 c0517 = this.f1663.f1499.f1478;
        if (c0517 != null && (c1189 = c0517.f1163) != null) {
            c1189.f3579 = true;
            HashMap map = c1189.f3585.f1314.f1164;
            ArrayList arrayList = (map == null || map.isEmpty()) ? new ArrayList() : new ArrayList(map.values());
            int size = arrayList.size();
            int i = 0;
            do {
                if (i >= size) {
                    c1189.m871(false);
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                enumC0584 = ((C0582) obj).f1430;
                if (enumC0584 == EnumC0584.f1444 || enumC0584 == EnumC0584.f1443) {
                    break;
                }
            } while (enumC0584 != EnumC0584.f1445);
        }
        synchronized (this.f1663.f1499) {
            zMo766 = AbstractC1081.m765().mo766();
        }
        if (zMo766) {
            C0604.m536(this.f1663.f1499);
        }
    }
}
