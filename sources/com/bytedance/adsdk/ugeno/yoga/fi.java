package com.bytedance.adsdk.ugeno.yoga;

import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public enum fi {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int uq;

    public static fi kgy(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return EXACTLY;
        }
        if (i == 2) {
            return AT_MOST;
        }
        d.r("Unknown enum value: ".concat(String.valueOf(i)));
        return null;
    }

    fi(int i) {
        this.uq = i;
    }
}
