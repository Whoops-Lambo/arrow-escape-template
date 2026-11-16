package com.fyber.inneractive.sdk.flow.endcard;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public enum l {
    Default(1),
    Fmp(2),
    Companion(3);

    private final int mPriority;

    public final int a() {
        return this.mPriority;
    }

    l(int i) {
        this.mPriority = i;
    }
}
