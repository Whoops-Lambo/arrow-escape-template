package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ĩ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0368 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0365 f708;

    public C0368(C0365 c0365) {
        this.f708 = c0365;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        boolean z;
        C0365 c0365 = this.f708;
        if (c0365.f705) {
            C0604 c0604 = c0365.f700.f3957;
            Context context = c0365.f704;
            C0445 c0445 = new C0445(this);
            if (c0604.f1487.get()) {
                return;
            }
            C4640s.f447 = AbstractC1081.m765().mo774();
            AbstractC0823.f2182 = AbstractC1081.m765().mo775();
            synchronized (c0604) {
                z = c0604.f1486;
            }
            if (z) {
                AbstractC4631n.m401(new C0699(c0445));
                return;
            }
            String str = AbstractC0888.f2379;
            ArrayList arrayList = new ArrayList(AbstractC0888.f2377.keySet());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str2 = (String) obj;
                List<AbstractC0451> list = (List) AbstractC0888.f2377.get(str2);
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (AbstractC0451 abstractC0451 : list) {
                        if (AbstractC0888.m640(abstractC0451)) {
                            arrayList2.add(abstractC0451);
                        }
                    }
                    linkedHashMap.put(str2, arrayList2);
                }
            }
            c0604.m547(context, c0445, linkedHashMap);
        }
    }
}
