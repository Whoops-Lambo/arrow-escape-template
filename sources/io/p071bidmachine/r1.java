package io.p071bidmachine;

import defpackage.n30;
import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r1 implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ BidToken b;

    public /* synthetic */ r1(BidToken bidToken, int i) {
        this.a = i;
        this.b = bidToken;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        String id;
        String str;
        int i = this.a;
        BidToken bidToken = this.b;
        switch (i) {
            case 0:
                id = bidToken.getId();
                str = "BidTokenId - ";
                break;
            default:
                id = bidToken.getId();
                str = "BidToken expired - ";
                break;
        }
        return n30.y(str, id);
    }
}
