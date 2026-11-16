package io.p071bidmachine.protobuf.rendering;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.c5;
import com.explorestack.protobuf.d5;
import defpackage.d;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public enum WatermarkPayloadType implements c5 {
    WM_PAYLOAD_UNSPECIFIED(0),
    WM_PAYLOAD_BID_ID(1),
    WM_PAYLOAD_RAW_CRID(2),
    UNRECOGNIZED(-1);

    public static final int WM_PAYLOAD_BID_ID_VALUE = 1;
    public static final int WM_PAYLOAD_RAW_CRID_VALUE = 2;
    public static final int WM_PAYLOAD_UNSPECIFIED_VALUE = 0;
    private final int value;
    private static final d5 internalValueMap = new d5() { // from class: io.bidmachine.protobuf.rendering.WatermarkPayloadType.1
        public WatermarkPayloadType findValueByNumber(int i) {
            return WatermarkPayloadType.forNumber(i);
        }
    };
    private static final WatermarkPayloadType[] VALUES = values();

    public static WatermarkPayloadType forNumber(int i) {
        if (i == 0) {
            return WM_PAYLOAD_UNSPECIFIED;
        }
        if (i == 1) {
            return WM_PAYLOAD_BID_ID;
        }
        if (i != 2) {
            return null;
        }
        return WM_PAYLOAD_RAW_CRID;
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

    WatermarkPayloadType(int i) {
        this.value = i;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return RenderingProto.getDescriptor().getEnumTypes().get(1);
    }

    public static WatermarkPayloadType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
    public static WatermarkPayloadType valueOf(int i) {
        return forNumber(i);
    }
}
