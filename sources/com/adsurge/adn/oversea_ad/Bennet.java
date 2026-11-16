package com.adsurge.adn.oversea_ad;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Bennet {
    public static final Bennet b = new Bennet(new Betelnut(Banana.a(new Locale[0])));
    public final Berry a;

    public static Bennet a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Bagasse.a(strArrSplit[i]);
        }
        return new Bennet(new Betelnut(Banana.a(localeArr)));
    }

    public Bennet(Berry berry) {
        this.a = berry;
    }
}
