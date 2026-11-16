package com.adsurge.adn.p059u;

import com.adsurge.adn.I.a;
import com.adsurge.adn.X.h;
import com.adsurge.adn.ads.AdSurgeAdError;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class b {
    public final int a;
    public final String b;

    public AdSurgeAdError a() {
        h.a("[AdSurgeAdError] ErrorCode: " + this.a + ", ErrorMsg: " + this.b);
        a.a();
        return new AdSurgeAdError(this.a, this.b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdInternalError{errorCode=");
        sb.append(this.a);
        sb.append(", errorMsg='");
        return nj.q(sb, this.b, "\"}");
    }

    public b(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
