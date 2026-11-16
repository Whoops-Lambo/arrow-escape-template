package com.unity3d.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoadListener b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ b(LoadListener loadListener, Throwable th, int i) {
        this.a = i;
        this.b = loadListener;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Throwable th = this.c;
        LoadListener loadListener = this.b;
        switch (i) {
            case 0:
                InterstitialAd$Companion$load$1.invokeSuspend$lambda$3$lambda$2(loadListener, th);
                break;
            default:
                RewardedAd$Companion$load$1.invokeSuspend$lambda$3$lambda$2(loadListener, th);
                break;
        }
    }
}
