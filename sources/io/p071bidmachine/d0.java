package io.p071bidmachine;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ d0(e0 e0Var, int i) {
        this.a = i;
        this.b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        e0 e0Var = this.b;
        switch (i) {
            case 0:
                BidMachineAd bidMachineAd = e0Var.b;
                AdListener adListener = bidMachineAd.listener;
                if (adListener != null) {
                    bidMachineAd.log("notify AdLoaded");
                    adListener.onAdLoaded(bidMachineAd);
                }
                break;
            case 1:
                BidMachineAd bidMachineAd2 = e0Var.b;
                AdListener adListener2 = bidMachineAd2.listener;
                if (adListener2 != null) {
                    bidMachineAd2.log("notify AdImpression");
                    adListener2.onAdImpression(bidMachineAd2);
                }
                break;
            case 2:
                BidMachineAd bidMachineAd3 = e0Var.b;
                AdListener adListener3 = bidMachineAd3.listener;
                if (adListener3 != null) {
                    bidMachineAd3.log("notify AdClicked");
                    adListener3.onAdClicked(bidMachineAd3);
                }
                break;
            case 3:
                BidMachineAd bidMachineAd4 = e0Var.b;
                AdListener adListener4 = bidMachineAd4.listener;
                if (adListener4 != null && (adListener4 instanceof AdRewardedListener)) {
                    bidMachineAd4.log("notify AdRewarded");
                    ((AdRewardedListener) adListener4).onAdRewarded(bidMachineAd4);
                    break;
                }
                break;
            default:
                BidMachineAd bidMachineAd5 = e0Var.b;
                AdListener adListener5 = bidMachineAd5.listener;
                if (adListener5 != null) {
                    bidMachineAd5.log("notify AdExpired");
                    adListener5.onAdExpired(bidMachineAd5);
                }
                break;
        }
    }
}
