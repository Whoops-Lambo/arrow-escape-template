package com.applovin.mediation.adapters;

import com.google.android.gms.ads.nativead.MediaView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaView b;

    public /* synthetic */ a(MediaView mediaView, int i) {
        this.a = i;
        this.b = mediaView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MediaView mediaView = this.b;
        switch (i) {
            case 0:
                ((GoogleAdManagerMediationAdapter.AutoMeasuringMediaView) mediaView).lambda$requestLayout$0();
                break;
            default:
                ((GoogleMediationAdapter.AutoMeasuringMediaView) mediaView).lambda$requestLayout$0();
                break;
        }
    }
}
