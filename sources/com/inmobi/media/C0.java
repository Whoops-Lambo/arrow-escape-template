package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.az2;
import defpackage.cg0;
import defpackage.tb5;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final HashMap c = new HashMap();
    public final B0 d = new B0(this);

    public static final az2 b(C0 c0) {
        c0.a.set(true);
        tb5.t(AbstractC4211ma.d, null, null, new A0(c0, (AdConfig) AbstractC4563z4.a.a(AdConfig.class), null), 3);
        return az2.a;
    }

    public C0() {
        AbstractC4221mk.h.submit(new defpackage.s3(this, 9));
    }

    public static void a(AdQualityResult adQualityResult) {
        adQualityResult.getClass();
        try {
            tb5.y(cg0.a, new C4559z0(adQualityResult, null));
            if (adQualityResult.getImageLocation().length() != 0) {
                new File(adQualityResult.getImageLocation()).delete();
            }
        } catch (Exception unused) {
        }
    }

    public final void a() {
        AbstractC3950d.a(new defpackage.s5(this, 12));
    }

    public static final void a(C0 c0) {
        J0 j0 = (J0) G0.a.getValue();
        B0 b0 = c0.d;
        j0.getClass();
        b0.getClass();
        j0.b = new WeakReference(b0);
    }
}
