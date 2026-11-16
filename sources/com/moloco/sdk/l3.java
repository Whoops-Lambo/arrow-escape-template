package com.moloco.sdk;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum l3 implements Internal.EnumLite {
    NONE(0),
    CLOSE(1),
    SKIP(2),
    MUTE(3),
    UNMUTE(4),
    CTA(5),
    REPLAY(6),
    DEC_SKIP(7),
    AD_BADGE(8),
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

    l3(int i) {
        this.a = i;
    }
}
