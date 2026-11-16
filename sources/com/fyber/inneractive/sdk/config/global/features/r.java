package com.fyber.inneractive.sdk.config.global.features;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class r extends i {
    public r() {
        super("store_webpage");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final i b() {
        r rVar = new r();
        a(rVar);
        return rVar;
    }

    public final q c() {
        String strA = a("presentation_mode", null);
        if (strA != null) {
            for (q qVar : q.values()) {
                Locale locale = Locale.US;
                if (strA.toLowerCase(locale).equals(qVar.value.toLowerCase(locale))) {
                    return qVar;
                }
            }
        }
        return q.FullScreen;
    }
}
