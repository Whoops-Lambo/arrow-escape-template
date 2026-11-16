package io.p071bidmachine;

import defpackage.n30;
import defpackage.pv1;
import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ y(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        switch (this.a) {
            case 0:
                return BidMachine.lambda$initialize$0(this.b);
            case 1:
                return BidMachine.lambda$getBidToken$17(this.b);
            case 2:
                return BidMachine.lambda$setEndpoint$1(this.b);
            case 3:
                return BidMachine.lambda$setUSPrivacyString$11(this.b);
            case 4:
                return BidMachineFetcher.lambda$release$1(this.b);
            case 5:
                return n30.y("Initialization error: ", this.b);
            case 6:
                return UrlProvider.lambda$setEndpoint$0(this.b);
            case 7:
                return n30.y("BidTokenId from bidPayload - ", this.b);
            case 8:
                return n30.y("BidToken is null by bidTokenId - ", this.b);
            case 9:
                return pv1.n("Network (", this.b, ") adUnit register fail: format not provided");
            case 10:
                return pv1.n("Network (", this.b, ") adUnit register fail: format not provided");
            case 11:
                return pv1.n("Network (", this.b, ") load fail!");
            default:
                return pv1.n("Network (", this.b, ") load fail!");
        }
    }
}
