package com.adsurge.adn.W0;

import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum n {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    public final int a;

    public static n a(int i) {
        if (i == 0) {
            return NO_WRAP;
        }
        if (i == 1) {
            return WRAP;
        }
        if (i == 2) {
            return WRAP_REVERSE;
        }
        defpackage.d.r(pv1.k(i, "Unknown enum value: "));
        return null;
    }

    n(int i) {
        this.a = i;
    }
}
