package com.adsurge.adn.oversea_ad;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Betelnut implements Berry {
    public final LocaleList a;

    @Override // com.adsurge.adn.oversea_ad.Berry
    public final Locale get(int i) {
        return this.a.get(i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.adsurge.adn.oversea_ad.Berry
    public final int size() {
        return this.a.size();
    }

    public Betelnut(Object obj) {
        this.a = (LocaleList) obj;
    }
}
