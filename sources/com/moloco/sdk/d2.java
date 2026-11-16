package com.moloco.sdk;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class d2 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public final Object convert(Object obj) {
        i2 i2Var;
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue == 0) {
            i2Var = i2.UNKNOWN;
        } else if (iIntValue != 1) {
            i2Var = iIntValue != 2 ? null : i2.LEVEL_PLAY;
        } else {
            i2Var = i2.MAX;
        }
        return i2Var == null ? i2.UNRECOGNIZED : i2Var;
    }
}
