package com.moloco.sdk.internal.unity_bridge.internal;

import com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback;
import com.moloco.sdk.publisher.MolocoAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MolocoUnityShowCallback b;
    public final /* synthetic */ MolocoAd c;

    public /* synthetic */ c(MolocoUnityShowCallback molocoUnityShowCallback, MolocoAd molocoAd, int i) {
        this.a = i;
        this.b = molocoUnityShowCallback;
        this.c = molocoAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MolocoAd molocoAd = this.c;
        MolocoUnityShowCallback molocoUnityShowCallback = this.b;
        switch (i) {
            case 0:
                molocoUnityShowCallback.onAdHidden(molocoAd.getAdUnitId());
                break;
            case 1:
                molocoUnityShowCallback.onAdClicked(molocoAd.getAdUnitId());
                break;
            default:
                molocoUnityShowCallback.onAdShowSuccess(molocoAd.getAdUnitId());
                break;
        }
    }
}
