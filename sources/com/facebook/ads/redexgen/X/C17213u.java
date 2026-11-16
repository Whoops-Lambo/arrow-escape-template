package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C17213u extends C7O {
    public C17213u(C2055Hi c2055Hi) {
        super(c2055Hi);
        setCarouselLayoutManager(c2055Hi);
    }

    public AbstractC1919Cb getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.C7O
    public J7 getLayoutManager() {
        return (J7) super.getLayoutManager();
    }

    public AbstractC3062j1 getOnScrollListener() {
        return new C2013Fs(this);
    }

    private void setCarouselLayoutManager(C2055Hi c2055Hi) {
        J7 j7 = new J7(c2055Hi, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            j7.A2q(true);
        }
        super.setLayoutManager(j7);
    }

    @Override // com.facebook.ads.redexgen.X.C7O
    public void setLayoutManager(AbstractC3057iw abstractC3057iw) {
    }
}
