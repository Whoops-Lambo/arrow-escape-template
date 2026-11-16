package com.explorestack.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface g7 {
    Object parseDelimitedFrom(InputStream inputStream);

    Object parseDelimitedFrom(InputStream inputStream, o3 o3Var);

    Object parseFrom(ByteString byteString);

    Object parseFrom(ByteString byteString, o3 o3Var);

    Object parseFrom(r rVar);

    Object parseFrom(r rVar, o3 o3Var);

    Object parseFrom(InputStream inputStream);

    Object parseFrom(InputStream inputStream, o3 o3Var);

    Object parseFrom(ByteBuffer byteBuffer);

    Object parseFrom(ByteBuffer byteBuffer, o3 o3Var);

    Object parseFrom(byte[] bArr);

    Object parseFrom(byte[] bArr, o3 o3Var);

    Object parsePartialFrom(r rVar, o3 o3Var);
}
