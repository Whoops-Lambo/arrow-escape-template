package com.moloco.sdk;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum i2 implements Internal.EnumLite {
    UNKNOWN(0),
    MAX(1),
    LEVEL_PLAY(2),
    UNRECOGNIZED(-1);

    public final int a;

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        defpackage.d.r("Can't get the number of an unknown enum value.");
        return 0;
    }

    i2(int i) {
        this.a = i;
    }
}
