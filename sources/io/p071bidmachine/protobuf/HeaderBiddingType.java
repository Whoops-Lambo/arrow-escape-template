package io.p071bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.c5;
import com.explorestack.protobuf.d5;
import defpackage.d;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public enum HeaderBiddingType implements c5 {
    HEADER_BIDDING_TYPE_INVALID(0),
    HEADER_BIDDING_TYPE_DISABLED(-1),
    HEADER_BIDDING_TYPE_ENABLED(1),
    UNRECOGNIZED(-1);

    public static final int HEADER_BIDDING_TYPE_DISABLED_VALUE = -1;
    public static final int HEADER_BIDDING_TYPE_ENABLED_VALUE = 1;
    public static final int HEADER_BIDDING_TYPE_INVALID_VALUE = 0;
    private final int value;
    private static final d5 internalValueMap = new d5() { // from class: io.bidmachine.protobuf.HeaderBiddingType.1
        public HeaderBiddingType findValueByNumber(int i) {
            return HeaderBiddingType.forNumber(i);
        }
    };
    private static final HeaderBiddingType[] VALUES = values();

    public static HeaderBiddingType forNumber(int i) {
        if (i == -1) {
            return HEADER_BIDDING_TYPE_DISABLED;
        }
        if (i == 0) {
            return HEADER_BIDDING_TYPE_INVALID;
        }
        if (i != 1) {
            return null;
        }
        return HEADER_BIDDING_TYPE_ENABLED;
    }

    public static d5 internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.explorestack.protobuf.c5
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        d.r("Can't get the number of an unknown enum value.");
        return 0;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        e32.i("Can't get the descriptor of an unrecognized enum value.");
        return null;
    }

    HeaderBiddingType(int i) {
        this.value = i;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return ExtensionsProto.getDescriptor().getEnumTypes().get(4);
    }

    public static HeaderBiddingType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        d.r("EnumValueDescriptor is not for this type.");
        return null;
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Deprecated
    public static HeaderBiddingType valueOf(int i) {
        return forNumber(i);
    }
}
