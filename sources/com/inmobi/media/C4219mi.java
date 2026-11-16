package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import defpackage.s71;

/* JADX INFO: renamed from: com.inmobi.media.mi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4219mi {
    public final InMobiNativeViewData a;
    public final MediaView b;
    public final View c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4219mi)) {
            return false;
        }
        C4219mi c4219mi = (C4219mi) obj;
        return s71.b(this.a, c4219mi.a) && s71.b(this.b, c4219mi.b) && s71.b(this.c, c4219mi.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        MediaView mediaView = this.b;
        int iHashCode2 = (iHashCode + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.c;
        return iHashCode2 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "PublisherNativeViewData(pubView=" + this.a + ", mediaView=" + this.b + ", adChoice=" + this.c + ")";
    }

    public C4219mi(InMobiNativeViewData inMobiNativeViewData, MediaView mediaView, View view) {
        inMobiNativeViewData.getClass();
        this.a = inMobiNativeViewData;
        this.b = mediaView;
        this.c = view;
    }
}
