package com.fyber.inneractive.sdk.rtb.data.types;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum a {
    VAST_1_0(1),
    VAST_2_0(2),
    VAST_3_0(3),
    VAST_1_0_WRAPPER(4),
    VAST_2_0_WRAPPER(5),
    VAST_3_0_WRAPPER(6);

    int value;

    public final int a() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.value);
    }

    a(int i) {
        this.value = i;
    }
}
