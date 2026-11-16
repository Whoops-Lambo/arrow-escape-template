package io.p071bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface UserOrBuilder extends MessageOrBuilder {
    String getCcpa();

    ByteString getCcpaBytes();

    String getConsent();

    ByteString getConsentBytes();

    boolean getCoppa();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo250getDefaultInstanceForType();

    boolean getGdpr();

    String getGpp();

    ByteString getGppBytes();

    int getGppSid(int i);

    int getGppSidCount();

    List<Integer> getGppSidList();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
