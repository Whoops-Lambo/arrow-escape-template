package com.fyber.inneractive.sdk.external;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class g implements Runnable {
    public final /* synthetic */ NativeAdUnitController a;

    public g(NativeAdUnitController nativeAdUnitController) {
        this.a = nativeAdUnitController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
    }
}
