package com.ironsource;

import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Qc implements Pc {

    @Nullable
    private L2 a;

    @NotNull
    private WeakReference<N2> b = new WeakReference<>(null);

    @Override // com.ironsource.Pc
    public void onBannerInitFailed(@Nullable String str) {
    }

    @Override // com.ironsource.Pc
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.Pc
    public void onBannerClick() {
        N2 n2 = this.b.get();
        if (n2 != null) {
            n2.onBannerClick();
        }
    }

    @Override // com.ironsource.Pc
    public void onBannerShowSuccess() {
        N2 n2 = this.b.get();
        if (n2 != null) {
            n2.onBannerShowSuccess();
        }
    }

    public final void a(@NotNull N2 n2) {
        n2.getClass();
        this.b = new WeakReference<>(n2);
    }

    @Override // com.ironsource.Pc
    public void onBannerLoadFail(@NotNull String str) {
        str.getClass();
        L2 l2 = this.a;
        if (l2 != null) {
            l2.onBannerLoadFail(str);
        }
    }

    @Override // com.ironsource.Pc
    public void onBannerLoadSuccess(@NotNull R9 r9, @NotNull C4829k8 c4829k8) {
        r9.getClass();
        c4829k8.getClass();
        L2 l2 = this.a;
        if (l2 != null) {
            l2.onBannerLoadSuccess(r9, c4829k8);
        }
    }

    public final void a(@NotNull L2 l2) {
        l2.getClass();
        this.a = l2;
    }
}
