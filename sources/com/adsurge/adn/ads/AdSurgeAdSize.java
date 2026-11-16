package com.adsurge.adn.ads;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class AdSurgeAdSize {
    public final int a;
    public final int b;
    public static final AdSurgeAdSize UNSPECIFIED = new AdSurgeAdSize(0, 0);
    public static final AdSurgeAdSize BANNER = new AdSurgeAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final AdSurgeAdSize BANNER_TABLET = new AdSurgeAdSize(728, 90);
    public static final AdSurgeAdSize MREC = new AdSurgeAdSize(300, 250);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSurgeAdSize)) {
            return false;
        }
        AdSurgeAdSize adSurgeAdSize = (AdSurgeAdSize) obj;
        return this.a == adSurgeAdSize.getWidth() && this.b == adSurgeAdSize.getHeight();
    }

    public int getHeight() {
        return this.b;
    }

    public int getWidth() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdSize{width=");
        sb.append(this.a);
        sb.append(", height=");
        return h50.l(sb, this.b, '}');
    }

    public AdSurgeAdSize(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
