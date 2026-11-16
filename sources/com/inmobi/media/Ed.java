package com.inmobi.media;

import com.inmobi.media.Ed;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import defpackage.cm2;
import defpackage.gd1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ed {
    public final C4531y a;
    public final InMobiJsonResponse b;
    public final Ad c;
    public final Id d;
    public C4528xn e;
    public final gd1 f;
    public final gd1 g;

    public static final C4186ld a(Ed ed) {
        C4314q1 c4314q1 = ed.d.a.a;
        return new C4186ld(c4314q1.b, c4314q1.e, c4314q1.c);
    }

    public static final Dd b(Ed ed) {
        return (Dd) ed.d.b.getValue();
    }

    public Ed(C4531y c4531y, InMobiJsonResponse inMobiJsonResponse, Ad ad) {
        c4531y.getClass();
        inMobiJsonResponse.getClass();
        ad.getClass();
        this.a = c4531y;
        this.b = inMobiJsonResponse;
        this.c = ad;
        this.d = new Id(c4531y);
        final int i = 0;
        this.f = new cm2(new sr0(this) { // from class: tf0
            public final /* synthetic */ Ed b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                int i2 = i;
                Ed ed = this.b;
                switch (i2) {
                    case 0:
                        return Ed.b(ed);
                    default:
                        return Ed.a(ed);
                }
            }
        });
        final int i2 = 1;
        this.g = new cm2(new sr0(this) { // from class: tf0
            public final /* synthetic */ Ed b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                int i3 = i2;
                Ed ed = this.b;
                switch (i3) {
                    case 0:
                        return Ed.b(ed);
                    default:
                        return Ed.a(ed);
                }
            }
        });
    }
}
