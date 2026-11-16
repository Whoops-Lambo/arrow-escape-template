package com.moloco.sdk.internal.unity_bridge.internal;

import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MolocoUnityLoadCallback b;
    public final /* synthetic */ String c;

    public /* synthetic */ a(MolocoUnityLoadCallback molocoUnityLoadCallback, String str, int i) {
        this.a = i;
        this.b = molocoUnityLoadCallback;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        MolocoUnityLoadCallback molocoUnityLoadCallback = this.b;
        switch (i) {
            case 0:
                molocoUnityLoadCallback.onAdLoadSuccess(str);
                break;
            default:
                molocoUnityLoadCallback.onAdLoadSuccess(str);
                break;
        }
    }
}
