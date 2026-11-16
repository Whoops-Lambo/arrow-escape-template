package io.p071bidmachine;

import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Boolean b;

    public /* synthetic */ x(int i, Boolean bool) {
        this.a = i;
        this.b = bool;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        int i = this.a;
        Boolean bool = this.b;
        switch (i) {
            case 0:
                return BidMachine.lambda$setCoppa$9(bool);
            case 1:
                return BidMachine.lambda$setSubjectToGDPR$7(bool);
            default:
                return BidMachine.lambda$setNonPersonalized$15(bool);
        }
    }
}
