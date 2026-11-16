package com.adsurge.adn.oversea_ad;

import defpackage.jc1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class Bergamot implements Berry {
    public static final Locale[] b = new Locale[0];
    public final Locale[] a;

    @Override // com.adsurge.adn.oversea_ad.Berry
    public final Locale get(int i) {
        if (i < 0) {
            return null;
        }
        Locale[] localeArr = this.a;
        if (i < localeArr.length) {
            return localeArr[i];
        }
        return null;
    }

    @Override // com.adsurge.adn.oversea_ad.Berry
    public final int size() {
        return this.a.length;
    }

    public Bergamot(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.a = b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    locale2.getLanguage();
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        locale2.getCountry();
                    }
                    hashSet.add(locale2);
                }
            } else {
                defpackage.d.w(jc1.k(i, "list[", "] is null"));
                throw null;
            }
        }
        this.a = (Locale[]) arrayList.toArray(new Locale[0]);
    }
}
