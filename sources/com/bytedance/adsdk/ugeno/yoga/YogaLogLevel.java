package com.bytedance.adsdk.ugeno.yoga;

import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@com.bytedance.adsdk.ugeno.yoga.kgy.kgy
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    private final int yo;

    @com.bytedance.adsdk.ugeno.yoga.kgy.kgy
    public static YogaLogLevel fromInt(int i) {
        if (i == 0) {
            return ERROR;
        }
        if (i == 1) {
            return WARN;
        }
        if (i == 2) {
            return INFO;
        }
        if (i == 3) {
            return DEBUG;
        }
        if (i == 4) {
            return VERBOSE;
        }
        if (i == 5) {
            return FATAL;
        }
        d.r("Unknown enum value: ".concat(String.valueOf(i)));
        return null;
    }

    YogaLogLevel(int i) {
        this.yo = i;
    }
}
