package com.fyber.inneractive.sdk.external;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class e implements Runnable {
    public final /* synthetic */ InneractiveAdViewUnitController a;

    public e(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        this.a = inneractiveAdViewUnitController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
    }
}
