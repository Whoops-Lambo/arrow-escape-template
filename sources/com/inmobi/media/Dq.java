package com.inmobi.media;

import defpackage.dt1;
import defpackage.qh1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Dq implements Fq {
    public final com.inmobi.media.ads.network.common.model.Ad a;
    public final Z9 b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    @Override // com.inmobi.media.Fq
    public final String a(int i, double d) {
        if (!this.c.compareAndSet(false, true)) {
            Z9 z9 = this.b;
            if (z9 == null) {
                return "win/loss notification already triggered";
            }
            z9.b("n1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            com.inmobi.media.ads.network.common.model.Ad ad = this.a;
            List listA = ad != null ? AbstractC3887ak.a(ad, "loss_beacon") : null;
            if (listA != null && !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    String strA = AbstractC4094i4.a((String) it.next(), qh1.Y(new dt1(com.ironsource.mediationsdk.d.l, String.valueOf(i)), new dt1(com.ironsource.mediationsdk.d.n, String.valueOf(d))));
                    X3 x3 = X3.a;
                    Z9 z10 = this.b;
                    strA.getClass();
                    X3.a(strA, true, z10);
                }
                if (i > 0 && d > 0.0d) {
                    return null;
                }
                Z9 z11 = this.b;
                if (z11 == null) {
                    return "notification triggering with invalid params";
                }
                z11.b("n1", "Loss notification triggered with invalid params - lossReason: " + i + ", auctionPrice: " + d);
                return "notification triggering with invalid params";
            }
            Z9 z12 = this.b;
            if (z12 == null) {
                return "no win/loss notification url";
            }
            z12.b("n1", "Loss beacon URLs not found or empty");
            return "no win/loss notification url";
        } catch (Exception e) {
            Z9 z13 = this.b;
            if (z13 == null) {
                return "loss notification failed internally";
            }
            z13.a("n1", "Exception in notifyLoss", e);
            return "loss notification failed internally";
        }
    }

    public Dq(com.inmobi.media.ads.network.common.model.Ad ad, Z9 z9) {
        this.a = ad;
        this.b = z9;
    }

    @Override // com.inmobi.media.Fq
    public final String a(double d) {
        if (this.c.compareAndSet(false, true)) {
            try {
                com.inmobi.media.ads.network.common.model.Ad ad = this.a;
                List listA = ad != null ? AbstractC3887ak.a(ad, "win_beacon") : null;
                if (listA != null && !listA.isEmpty()) {
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        String strA = AbstractC4094i4.a((String) it.next(), qh1.Y(new dt1("${AUCTION_MIN_TO_WIN}", String.valueOf(d)), new dt1("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d))));
                        X3 x3 = X3.a;
                        Z9 z9 = this.b;
                        strA.getClass();
                        X3.a(strA, true, z9);
                    }
                    if (d > 0.0d) {
                        return null;
                    }
                    Z9 z10 = this.b;
                    if (z10 != null) {
                        z10.b("n1", "Win notification triggered with invalid minBidToWin: " + d);
                        return "notification triggering with invalid params";
                    }
                    return "notification triggering with invalid params";
                }
                Z9 z11 = this.b;
                if (z11 != null) {
                    z11.b("n1", "Win beacon URLs not found or empty");
                    return "no win/loss notification url";
                }
                return "no win/loss notification url";
            } catch (Exception e) {
                Z9 z12 = this.b;
                if (z12 != null) {
                    z12.a("n1", "Exception in notifyWin", e);
                    return "win notification failed internally";
                }
                return "win notification failed internally";
            }
        }
        Z9 z13 = this.b;
        if (z13 != null) {
            z13.b("n1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
