package com.bytedance.adsdk.ugeno.yoga;

import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public enum kus {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);

    private final int uq;

    kus(int i) {
        this.uq = i;
    }

    public static kus kgy(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "nowrap":
                return NO_WRAP;
            case "wrap":
                return WRAP;
            case "wrap_reverse":
                return WRAP_REVERSE;
            default:
                d.r("Unknown enum value: ".concat(lowerCase));
                return null;
        }
    }

    public static kus kgy(int i) {
        if (i == 0) {
            return NO_WRAP;
        }
        if (i == 1) {
            return WRAP;
        }
        if (i == 2) {
            return WRAP_REVERSE;
        }
        d.r("Unknown enum value: ".concat(String.valueOf(i)));
        return null;
    }

    public int kgy() {
        return this.uq;
    }
}
