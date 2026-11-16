package com.fyber.inneractive.sdk.config.global.features;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends i {
    public static final a e = a.OPEN;

    public b() {
        super("ad_identifier");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final i b() {
        b bVar = new b();
        a(bVar);
        return bVar;
    }

    public final a c() {
        String strA = a("identifier_click_action", e.mKey);
        for (a aVar : a.values()) {
            if (strA.equalsIgnoreCase(aVar.mKey)) {
                return aVar;
            }
        }
        return a.NONE;
    }
}
