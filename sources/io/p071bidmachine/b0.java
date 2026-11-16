package io.p071bidmachine;

import io.p071bidmachine.utils.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ a c;

    public /* synthetic */ b0(e0 e0Var, a aVar, int i) {
        this.a = i;
        this.b = e0Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a aVar = this.c;
        e0 e0Var = this.b;
        switch (i) {
            case 0:
                BidMachineAd bidMachineAd = e0Var.b;
                AdListener adListener = bidMachineAd.listener;
                if (adListener != null) {
                    bidMachineAd.log("notify AdShowFailed");
                    adListener.onAdShowFailed(bidMachineAd, aVar);
                }
                break;
            default:
                BidMachineAd bidMachineAd2 = e0Var.b;
                AdListener adListener2 = bidMachineAd2.listener;
                if (adListener2 != null) {
                    bidMachineAd2.log("notify AdLoadFailed");
                    adListener2.onAdLoadFailed(bidMachineAd2, aVar);
                }
                break;
        }
    }
}
