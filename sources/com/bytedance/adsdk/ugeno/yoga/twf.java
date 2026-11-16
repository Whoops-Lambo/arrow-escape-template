package com.bytedance.adsdk.ugeno.yoga;

import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public enum twf {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    private final int uq;

    twf(int i) {
        this.uq = i;
    }

    public static twf kgy(String str) {
        str.getClass();
        switch (str) {
            case "static":
                return STATIC;
            case "relative":
                return RELATIVE;
            case "absolute":
                return ABSOLUTE;
            default:
                d.r("Unknown enum value: ".concat(str));
                return null;
        }
    }

    public static twf kgy(int i) {
        if (i == 0) {
            return STATIC;
        }
        if (i == 1) {
            return RELATIVE;
        }
        if (i == 2) {
            return ABSOLUTE;
        }
        d.r("Unknown enum value: ".concat(String.valueOf(i)));
        return null;
    }

    public int kgy() {
        return this.uq;
    }
}
