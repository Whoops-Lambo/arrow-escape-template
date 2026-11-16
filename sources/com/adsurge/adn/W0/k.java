package com.adsurge.adn.W0;

import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum k {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    public final int a;

    public static k a(int i) {
        if (i == 0) {
            return STATIC;
        }
        if (i == 1) {
            return RELATIVE;
        }
        if (i == 2) {
            return ABSOLUTE;
        }
        defpackage.d.r(pv1.k(i, "Unknown enum value: "));
        return null;
    }

    k(int i) {
        this.a = i;
    }
}
