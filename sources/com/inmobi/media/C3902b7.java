package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import defpackage.s71;

/* JADX INFO: renamed from: com.inmobi.media.b7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C3902b7 extends AbstractC3958d7 {
    public final MediaView a;
    public final C4501wn b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3902b7)) {
            return false;
        }
        C3902b7 c3902b7 = (C3902b7) obj;
        return s71.b(this.a, c3902b7.a) && s71.b(this.b, c3902b7.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        C4501wn c4501wn = this.b;
        return iHashCode + (c4501wn == null ? 0 : c4501wn.hashCode());
    }

    public final String toString() {
        return "Success(mediaView=" + this.a + ", vastBeaconData=" + this.b + ")";
    }

    public C3902b7(MediaView mediaView, C4501wn c4501wn) {
        mediaView.getClass();
        this.a = mediaView;
        this.b = c4501wn;
    }
}
