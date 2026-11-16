package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import defpackage.du;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.inmobi.media.t1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4397t1 {
    public final AbstractC4230n1 a;
    public final C4418tm b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public final C4369s1 k;

    public final String a() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad;
        String telemetryMetadataBlob;
        AdSet adSetS = this.a.s();
        return (adSetS == null || (ads = adSetS.getAds()) == null || (ad = (com.inmobi.media.ads.network.common.model.Ad) du.c0(ads)) == null || (telemetryMetadataBlob = ad.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }

    public C4397t1(AbstractC4230n1 abstractC4230n1) {
        abstractC4230n1.getClass();
        this.a = abstractC4230n1;
        this.b = new C4418tm();
        this.k = new C4369s1(this);
    }
}
