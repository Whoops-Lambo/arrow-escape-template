package com.inmobi.media;

import com.inmobi.media.Ld;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4664b4;
import defpackage.d21;
import defpackage.du;
import defpackage.gg0;
import defpackage.sr0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Ld {
    public final Pd a;
    public final Mk b;
    public final C2 c;
    public final Mk d;
    public final Mk e;
    public final Mk f;
    public final Mk g;

    public static final List a(Ld ld) {
        return du.o0(Vn.a("Impression", ld.a.b), AbstractC3872a5.a("impression", ld.a.a.a));
    }

    public static final List b(Ld ld) {
        return AbstractC3872a5.a("impression_shown", ld.a.a.a);
    }

    public static final List c(Ld ld) {
        return AbstractC3872a5.a(C4664b4.i.r, ld.a.a.a);
    }

    public static final List d(Ld ld) {
        return AbstractC3872a5.a("mrc50", ld.a.a.a);
    }

    public static final List e(Ld ld) {
        return AbstractC3872a5.a("start_tracking", ld.a.a.a);
    }

    public Ld(Md md, Pd pd) {
        C2 c4545yd;
        md.getClass();
        pd.getClass();
        this.a = pd;
        final int i = 0;
        this.b = new Mk(md, new sr0(this) { // from class: qd1
            public final /* synthetic */ Ld b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                int i2 = i;
                Ld ld = this.b;
                switch (i2) {
                    case 0:
                        return Ld.c(ld);
                    case 1:
                        return Ld.e(ld);
                    case 2:
                        return Ld.b(ld);
                    case 3:
                        return Ld.a(ld);
                    default:
                        return Ld.d(ld);
                }
            }
        });
        if (((AdConfig) AbstractC4563z4.a.a(AdConfig.class)).getNative().getInteraction().getClickDedupingEnabled()) {
            c4545yd = new C4562z3(md);
        } else {
            c4545yd = new C4545yd(md, new d21(23));
        }
        this.c = c4545yd;
        final int i2 = 1;
        this.d = new Mk(md, new sr0(this) { // from class: qd1
            public final /* synthetic */ Ld b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                int i3 = i2;
                Ld ld = this.b;
                switch (i3) {
                    case 0:
                        return Ld.c(ld);
                    case 1:
                        return Ld.e(ld);
                    case 2:
                        return Ld.b(ld);
                    case 3:
                        return Ld.a(ld);
                    default:
                        return Ld.d(ld);
                }
            }
        });
        final int i3 = 2;
        this.e = new Mk(md, new sr0(this) { // from class: qd1
            public final /* synthetic */ Ld b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                int i4 = i3;
                Ld ld = this.b;
                switch (i4) {
                    case 0:
                        return Ld.c(ld);
                    case 1:
                        return Ld.e(ld);
                    case 2:
                        return Ld.b(ld);
                    case 3:
                        return Ld.a(ld);
                    default:
                        return Ld.d(ld);
                }
            }
        });
        final int i4 = 3;
        this.f = new Mk(md, new sr0(this) { // from class: qd1
            public final /* synthetic */ Ld b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                int i5 = i4;
                Ld ld = this.b;
                switch (i5) {
                    case 0:
                        return Ld.c(ld);
                    case 1:
                        return Ld.e(ld);
                    case 2:
                        return Ld.b(ld);
                    case 3:
                        return Ld.a(ld);
                    default:
                        return Ld.d(ld);
                }
            }
        });
        final int i5 = 4;
        this.g = new Mk(md, new sr0(this) { // from class: qd1
            public final /* synthetic */ Ld b;

            {
                this.b = this;
            }

            @Override // defpackage.sr0
            public final Object invoke() {
                int i6 = i5;
                Ld ld = this.b;
                switch (i6) {
                    case 0:
                        return Ld.c(ld);
                    case 1:
                        return Ld.e(ld);
                    case 2:
                        return Ld.b(ld);
                    case 3:
                        return Ld.a(ld);
                    default:
                        return Ld.d(ld);
                }
            }
        });
    }

    public static final List a() {
        return gg0.a;
    }
}
