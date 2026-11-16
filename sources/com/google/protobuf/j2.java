package com.google.protobuf;

import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class j2 extends IllegalArgumentException {
    public j2(int i, int i2) {
        super(nj.i(i, i2, "Unpaired surrogate at index ", " of "));
    }
}
