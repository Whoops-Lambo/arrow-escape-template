package com.explorestack.protobuf;

import defpackage.n30;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class u extends IOException {
    public u(String str, Throwable th) {
        super(n30.y("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
    }

    public u(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
