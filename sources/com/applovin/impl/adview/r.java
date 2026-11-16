package com.applovin.impl.adview;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppLovinWebVideoPlayerView.b b;

    public /* synthetic */ r(AppLovinWebVideoPlayerView.b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AppLovinWebVideoPlayerView.b bVar = this.b;
        switch (i) {
            case 0:
                bVar.b();
                break;
            case 1:
                bVar.c();
                break;
            default:
                bVar.a();
                break;
        }
    }
}
