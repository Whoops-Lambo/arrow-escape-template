package com.facebook.internal;

import java.util.EnumSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public enum s0 {
    /* JADX INFO: Fake field, exist only in values array */
    None(0),
    Enabled(1),
    RequireConfirm(2);

    public static final EnumSet b;
    public final long a;

    static {
        EnumSet enumSetAllOf = EnumSet.allOf(s0.class);
        enumSetAllOf.getClass();
        b = enumSetAllOf;
    }

    s0(long j) {
        this.a = j;
    }
}
