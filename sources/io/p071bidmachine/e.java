package io.p071bidmachine;

import io.p071bidmachine.utils.a;
import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ e(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                return AdRequest.lambda$processRequestFail$11(aVar);
            case 1:
                return AdResponseAdProcessCallback.processShowFail$lambda$7$lambda$6(aVar);
            case 2:
                return AdResponseAdProcessCallback.processLoadFail$lambda$3$lambda$2(aVar);
            default:
                return "Dispatching tracking fail to server - " + aVar;
        }
    }
}
