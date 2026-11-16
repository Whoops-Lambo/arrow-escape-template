package com.adsurge.adn.p051q;

import com.adsurge.adn.ads.AdSurgeAd;
import com.adsurge.adn.ads.AdSurgeAdError;
import com.adsurge.adn.ads.interstitial.InterstitialAdListener;
import com.adsurge.adn.ads.rewarded.RewardItem;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements InterstitialAdListener {
    public InterstitialAdListener a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public final /* synthetic */ AdSurgeAd a;
        public final /* synthetic */ RewardItem b;

        public a(AdSurgeAd adSurgeAd, RewardItem rewardItem) {
            this.a = adSurgeAd;
            this.b = rewardItem;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterstitialAdListener interstitialAdListener = b.this.a;
            if (interstitialAdListener != null) {
                interstitialAdListener.onUserEarnedReward(this.a, this.b);
            }
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.q.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC0131b implements Runnable {
        public final /* synthetic */ AdSurgeAd a;

        public RunnableC0131b(AdSurgeAd adSurgeAd) {
            this.a = adSurgeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterstitialAdListener interstitialAdListener = b.this.a;
            if (interstitialAdListener != null) {
                interstitialAdListener.onAdLoaded(this.a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        public final /* synthetic */ AdSurgeAdError a;

        public c(AdSurgeAdError adSurgeAdError) {
            this.a = adSurgeAdError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterstitialAdListener interstitialAdListener = b.this.a;
            if (interstitialAdListener != null) {
                interstitialAdListener.onAdFailed(this.a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements Runnable {
        public final /* synthetic */ AdSurgeAd a;
        public final /* synthetic */ AdSurgeAdError b;

        public d(AdSurgeAd adSurgeAd, AdSurgeAdError adSurgeAdError) {
            this.a = adSurgeAd;
            this.b = adSurgeAdError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterstitialAdListener interstitialAdListener = b.this.a;
            if (interstitialAdListener != null) {
                interstitialAdListener.onAdShowFailed(this.a, this.b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class e implements Runnable {
        public final /* synthetic */ AdSurgeAd a;

        public e(AdSurgeAd adSurgeAd) {
            this.a = adSurgeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterstitialAdListener interstitialAdListener = b.this.a;
            if (interstitialAdListener != null) {
                interstitialAdListener.onAdImpression(this.a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class f implements Runnable {
        public final /* synthetic */ AdSurgeAd a;

        public f(AdSurgeAd adSurgeAd) {
            this.a = adSurgeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterstitialAdListener interstitialAdListener = b.this.a;
            if (interstitialAdListener != null) {
                interstitialAdListener.onAdClicked(this.a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class g implements Runnable {
        public final /* synthetic */ AdSurgeAd a;

        public g(AdSurgeAd adSurgeAd) {
            this.a = adSurgeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterstitialAdListener interstitialAdListener = b.this.a;
            if (interstitialAdListener != null) {
                interstitialAdListener.onAdDismissed(this.a);
            }
        }
    }

    public void a(InterstitialAdListener interstitialAdListener) {
        this.a = interstitialAdListener;
    }

    @Override // com.adsurge.adn.ads.BaseAdListener
    public void onAdClicked(AdSurgeAd adSurgeAd) {
        com.adsurge.adn.I0.g.c(new f(adSurgeAd));
    }

    @Override // com.adsurge.adn.ads.BaseAdListener
    public void onAdDismissed(AdSurgeAd adSurgeAd) {
        com.adsurge.adn.I0.g.c(new g(adSurgeAd));
    }

    @Override // com.adsurge.adn.ads.BaseAdListener
    public void onAdFailed(AdSurgeAdError adSurgeAdError) {
        com.adsurge.adn.I0.g.c(new c(adSurgeAdError));
    }

    @Override // com.adsurge.adn.ads.BaseAdListener
    public void onAdImpression(AdSurgeAd adSurgeAd) {
        com.adsurge.adn.I0.g.c(new e(adSurgeAd));
    }

    @Override // com.adsurge.adn.ads.BaseAdListener
    public void onAdLoaded(AdSurgeAd adSurgeAd) {
        com.adsurge.adn.I0.g.c(new RunnableC0131b(adSurgeAd));
    }

    @Override // com.adsurge.adn.ads.BaseAdListener
    public void onAdShowFailed(AdSurgeAd adSurgeAd, AdSurgeAdError adSurgeAdError) {
        com.adsurge.adn.I0.g.c(new d(adSurgeAd, adSurgeAdError));
    }

    @Override // com.adsurge.adn.ads.BaseAdListener
    public void onUserEarnedReward(AdSurgeAd adSurgeAd, RewardItem rewardItem) {
        com.adsurge.adn.I0.g.c(new a(adSurgeAd, rewardItem));
    }
}
