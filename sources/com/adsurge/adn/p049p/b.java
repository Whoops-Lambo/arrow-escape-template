package com.adsurge.adn.p049p;

import com.adsurge.adn.lib.callback.RewardCallback;
import com.adsurge.adn.p018e1.a;
import com.adsurge.adn.p036k1.q;
import com.adsurge.adn.u1.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class b implements g {
    public final c a;
    public final boolean b;

    @Override // com.adsurge.adn.p049p.g
    public boolean a(String str) {
        if ("clickAd".equals(str)) {
            return true;
        }
        return "clickInteractionArea".equals(str) && !this.b;
    }

    public b(q qVar, c cVar) {
        this.a = cVar;
        this.b = cVar.a0().b();
    }

    @Override // com.adsurge.adn.p049p.g
    public void a() {
        ((RewardCallback) a.b(this.a.h(), RewardCallback.class)).fireReward().b(null);
    }

    @Override // com.adsurge.adn.p049p.g
    public void a(g.b bVar, boolean z) {
    }
}
