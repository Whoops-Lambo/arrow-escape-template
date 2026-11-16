package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ἷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1092 implements InterfaceC0594 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1091 f3171;

    public C1092(C1091 c1091) {
        this.f3171 = c1091;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0594
    /* JADX INFO: renamed from: ﾒ */
    public final void mo531(C0872 c0872) {
        C0875 c0875 = c0872.f2355;
        int i = c0875.f2360;
        String str = c0875.f2359;
        int i2 = 0;
        if (i >= 200 && i <= 299) {
            String strDecrypt = StringFog.decrypt("hXMW3csMUVy3\n", "xB13sbJ4OD8=\n");
            AbstractC0509.m496(strDecrypt, strDecrypt, StringFog.decrypt("c9nvwvUtpRhX1f6R5y2kCEfG9IznaPYLW8S7kfFjsihC0/WWtQ==\n", "NLab4pQN1m0=\n"), this.f3171.f3170, true);
            ArrayList arrayList = this.f3171.f3169;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                C1258 c1258 = this.f3171.f3167.f2566;
                C1327 c1327 = ((C0946) obj).f2545;
                c1258.getClass();
                C0969.m739().post(new C1262(c1258, c1327));
            }
            AbstractC4631n.m401(new C1128(this, c0872));
            return;
        }
        if (i == 403) {
            synchronized (this.f3171.f3167) {
                try {
                    ArrayList arrayList2 = this.f3171.f3167.f2560;
                    int size2 = arrayList2.size();
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        AbstractC4631n.m401(new C1134((C0564) obj2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AbstractC0509.m495(StringFog.decrypt("VkTjr2CHlCpk\n", "FyqCwxnz/Uk=\n"), StringFog.decrypt("EvQfT393LzsmuwVPZWtmIjP0HE0raC8hKbsBT2V7AyMk9QYEK1gpIWHpF1l7cCgmJKFS\n", "QZtyKgsfRlU=\n") + i + " " + str);
        }
        AbstractC4631n.m401(new C1123(this, c0872, i, str));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0594
    /* JADX INFO: renamed from: ﾒ */
    public final void mo532(C0872 c0872, String str) {
        AbstractC4631n.m401(new C1120(this, c0872, str));
    }
}
