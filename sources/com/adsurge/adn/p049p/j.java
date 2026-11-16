package com.adsurge.adn.p049p;

import android.text.TextUtils;
import android.util.Pair;
import com.adsurge.adn.lib.callback.RewardCallback;
import com.adsurge.adn.p036k1.h;
import com.adsurge.adn.p036k1.q;
import com.adsurge.adn.u1.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class j implements g {
    public final q a;
    public final c b;
    public String c;
    public String d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.b.values().length];
            a = iArr;
            try {
                iArr[g.b.FRONT_CARD_WITHOUT_TIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.b.FRONT_CARD_WITH_TIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.b.END_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public void a(Pair pair) {
        if (pair == null) {
            return;
        }
        boolean zEquals = TextUtils.equals((CharSequence) pair.first, this.c);
        boolean zEquals2 = TextUtils.equals((CharSequence) pair.second, this.d);
        if (zEquals && zEquals2) {
            return;
        }
        h hVar = new h();
        if (!zEquals) {
            String str = (String) pair.first;
            this.c = str;
            hVar.a("rewardText", str);
        }
        if (!zEquals2) {
            String str2 = (String) pair.second;
            this.d = str2;
            hVar.a("rewardImg", str2);
        }
        a(this.a, hVar, true);
    }

    public void b() {
        a(this.a, new h().a("countDownHintVis", 2));
    }

    public void c() {
        a(this.a, new h().a("countDownHintVis", 0));
    }

    public j(q qVar, c cVar) {
        this.a = qVar;
        this.b = cVar;
    }

    @Override // com.adsurge.adn.p049p.g
    public void a() {
        ((RewardCallback) com.adsurge.adn.p018e1.a.b(this.b.h(), RewardCallback.class)).fireReward().b(null);
    }

    @Override // com.adsurge.adn.p049p.g
    public void a(g.b bVar, boolean z) {
        int i = a.a[bVar.ordinal()];
        if (i == 1) {
            b();
            return;
        }
        if (i == 2 || i == 3) {
            if (z) {
                a(new Pair("Rewarding granted", "https://sdkstatic.adsurge.com/web/tpl_img/reward_finish.png"));
            } else {
                a(new Pair("Tap to Play!", "https://sdkstatic.adsurge.com/web/tpl_img/reward_icon.png"));
            }
            c();
        }
    }

    @Override // com.adsurge.adn.p049p.g
    public boolean a(String str) {
        return "clickRewardTip".equals(str);
    }
}
