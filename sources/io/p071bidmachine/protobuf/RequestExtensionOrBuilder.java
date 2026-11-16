package io.p071bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface RequestExtensionOrBuilder extends MessageOrBuilder {
    boolean containsSellerData(String str);

    String getBmIfv();

    ByteString getBmIfvBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo250getDefaultInstanceForType();

    HeaderBiddingType getHeaderBiddingType();

    int getHeaderBiddingTypeValue();

    String getIfv();

    ByteString getIfvBytes();

    String getIntegrationType();

    ByteString getIntegrationTypeBytes();

    @Deprecated
    Map<String, String> getSellerData();

    int getSellerDataCount();

    Map<String, String> getSellerDataMap();

    String getSellerDataOrDefault(String str, String str2);

    String getSellerDataOrThrow(String str);

    String getSellerId();

    ByteString getSellerIdBytes();

    String getSessionId();

    ByteString getSessionIdBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
