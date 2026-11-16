package com.explorestack.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface s5 extends j7 {
    void b(ByteString byteString);

    ByteString getByteString(int i);

    Object getRaw(int i);

    List getUnderlyingElements();

    s5 getUnmodifiableView();
}
