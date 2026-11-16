package com.vungle.ads.internal.presenter;

import com.vungle.ads.VungleError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c implements b {
    public final b a;

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdClick(String str) {
        this.a.onAdClick(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdLeftApplication(String str) {
        this.a.onAdLeftApplication(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdRewarded(String str) {
        this.a.onAdRewarded(str);
    }

    public c(b bVar) {
        bVar.getClass();
        this.a = bVar;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public void onFailure(VungleError vungleError) {
        vungleError.getClass();
        this.a.onFailure(vungleError);
    }
}
