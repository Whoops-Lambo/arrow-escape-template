package com.inmobi.media;

import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.pv1;
import defpackage.s71;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class T7 {
    public static final Q7 k = new Q7();
    public final byte a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final Y9 f;
    public C4349r9 g;
    public C4513x8 h;
    public final LinkedHashMap i = new LinkedHashMap();
    public final R7 j = new R7(this);

    public T7(byte b, String str, int i, int i2, int i3, Y9 y9) {
        this.a = b;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = y9;
    }

    public final void a(View view) {
        C4349r9 c4349r9;
        view.getClass();
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (!s71.b(this.b, "video") && !s71.b(this.b, "audio") && (c4349r9 = this.g) != null) {
            c4349r9.a.remove(view);
            c4349r9.b.remove(view);
            c4349r9.c.a(view);
            if (c4349r9.a.isEmpty()) {
                Y9 y10 = this.f;
                if (y10 != null) {
                    ((Z9) y10).a("HtmlAdTracker", "Impression tracker is free, removing it");
                }
                C4349r9 c4349r10 = this.g;
                if (c4349r10 != null) {
                    c4349r10.a.clear();
                    c4349r10.b.clear();
                    c4349r10.c.a();
                    c4349r10.e.removeMessages(0);
                    c4349r10.c.b();
                }
                this.g = null;
            }
        }
    }

    public final void b(View view) {
        view.getClass();
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        C4513x8 c4513x8 = this.h;
        if (c4513x8 != null) {
            c4513x8.a(view);
            if (c4513x8.a.isEmpty()) {
                Y9 y10 = this.f;
                if (y10 != null) {
                    ((Z9) y10).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                C4513x8 c4513x9 = this.h;
                if (c4513x9 != null) {
                    c4513x9.b();
                }
                this.h = null;
            }
        }
        this.i.remove(view);
    }

    public final void a(View view, View view2, Zp zp, AdConfig.ViewabilityConfig viewabilityConfig, boolean z) {
        int companionVisibilityMinPercentageViewed;
        C4513x8 c4513x8;
        view.getClass();
        view2.getClass();
        zp.getClass();
        viewabilityConfig.getClass();
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).c("HtmlAdTracker", "startTrackingForVisibility");
        }
        C4513x8 c4513x9 = this.h;
        if (c4513x9 == null) {
            Y9 y10 = this.f;
            if (z) {
                c4513x8 = new C4400t4(viewabilityConfig, y10);
            } else {
                c4513x8 = new C4513x8(viewabilityConfig, (byte) 1, y10);
            }
            c4513x9 = c4513x8;
            this.h = c4513x9;
        }
        S7 s7 = new S7(this);
        Y9 y11 = c4513x9.d;
        if (y11 != null) {
            ((Z9) y11).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        c4513x9.h = s7;
        this.i.put(view, zp);
        if (z) {
            companionVisibilityMinPercentageViewed = viewabilityConfig.getCompanionVisibilityMinPercentageViewed();
        } else {
            companionVisibilityMinPercentageViewed = this.e;
        }
        c4513x9.a(view, view, view2, companionVisibilityMinPercentageViewed);
    }

    public final void a() {
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).c("HtmlAdTracker", "onActivityStarted");
        }
        C4349r9 c4349r9 = this.g;
        if (c4349r9 != null) {
            c4349r9.d.getClass();
            for (Map.Entry entry : c4349r9.a.entrySet()) {
                View view = (View) entry.getKey();
                C4294p9 c4294p9 = (C4294p9) entry.getValue();
                C4513x8 c4513x8 = c4349r9.c;
                View view2 = c4294p9.a;
                int i = c4294p9.b;
                c4513x8.getClass();
                view.getClass();
                c4513x8.a(view, view, view2, i);
            }
            if (!c4349r9.e.hasMessages(0)) {
                c4349r9.e.postDelayed(c4349r9.f, c4349r9.g);
            }
            c4349r9.c.f();
        }
        C4513x8 c4513x9 = this.h;
        if (c4513x9 != null) {
            c4513x9.f();
        }
    }

    public final C4349r9 a(byte b, AdConfig.ViewabilityConfig viewabilityConfig) {
        C4349r9 c4349r9 = this.g;
        if (c4349r9 != null) {
            return c4349r9;
        }
        Y9 y9 = this.f;
        if (y9 != null) {
            ((Z9) y9).c("HtmlAdTracker", pv1.k(b, "creating Visibility Tracker for "));
        }
        C4513x8 c4513x8 = new C4513x8(viewabilityConfig, b, this.f);
        Y9 y10 = this.f;
        if (y10 != null) {
            ((Z9) y10).c("HtmlAdTracker", pv1.k(b, "creating Impression Tracker for "));
        }
        C4349r9 c4349r10 = new C4349r9(viewabilityConfig, c4513x8, this.j);
        this.g = c4349r10;
        return c4349r10;
    }
}
