package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.tb5;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Ph extends AbstractC4060gq {
    public final AdConfig.ViewabilityConfig l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ph(AdConfig.ViewabilityConfig viewabilityConfig, byte b, Y9 y9) {
        super(new WeakHashMap(10), new Handler(Looper.getMainLooper()), b, y9);
        T7.k.getClass();
        this.l = viewabilityConfig;
    }

    @Override // com.inmobi.media.AbstractC4060gq
    public final void d() {
        toString();
        if (!this.j && !this.g.get()) {
            this.j = true;
            this.k = tb5.t(AbstractC4211ma.e, null, null, new C4032fq(new WeakReference(this), null), 3);
        }
    }
}
