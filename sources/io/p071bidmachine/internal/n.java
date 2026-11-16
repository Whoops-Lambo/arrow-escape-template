package io.p071bidmachine.internal;

import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.media.Position;
import com.iab.omid.library.appodeal.adsession.media.VastProperties;
import com.ironsource.Yf;
import io.p071bidmachine.iab.measurer.c;
import io.p071bidmachine.iab.vast.d;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class n extends v0 implements c, d {
    public final ArrayList h;
    public Float i;

    public n() {
        super(false);
        this.h = new ArrayList();
    }

    @Override // io.p071bidmachine.internal.v0
    public final void a(AdEvents adEvents) {
        Float f = this.i;
        adEvents.loaded(f == null ? VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE) : VastProperties.createVastPropertiesForSkippableMedia(f.floatValue(), true, Position.STANDALONE));
        v0.c(Yf.j);
    }
}
