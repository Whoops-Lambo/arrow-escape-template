package com.adsurge.adn.oversea_ad;

import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Sculptor {
    public static String a(String str) {
        int iIndexOf;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(" ", 3);
        if (strArrSplit.length <= 2 || !"rwxp".equals(strArrSplit[1]) || (iIndexOf = strArrSplit[2].indexOf(47)) == -1) {
            return null;
        }
        String strTrim = strArrSplit[2].substring(iIndexOf).trim();
        if (strTrim.startsWith("/data/")) {
            return null;
        }
        return jc1.o(strArrSplit[1], ";", new StringBuilder(), strTrim);
    }
}
