package com.google.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface FieldMaskOrBuilder extends MessageLiteOrBuilder {
    String getPaths(int i);

    ByteString getPathsBytes(int i);

    int getPathsCount();

    List<String> getPathsList();
}
