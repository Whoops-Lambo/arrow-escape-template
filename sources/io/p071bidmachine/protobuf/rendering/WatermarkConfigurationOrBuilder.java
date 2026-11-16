package io.p071bidmachine.protobuf.rendering;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface WatermarkConfigurationOrBuilder extends MessageOrBuilder {
    WatermarkAlgorithm getAlgorithm();

    int getAlgorithmValue();

    String getBaseColorRgb();

    ByteString getBaseColorRgbBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo250getDefaultInstanceForType();

    WatermarkLocation getLocation();

    int getLocationValue();

    WatermarkPayloadType getPayloadType();

    int getPayloadTypeValue();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
