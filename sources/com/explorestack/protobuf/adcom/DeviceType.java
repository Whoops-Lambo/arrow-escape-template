package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.c5;
import com.explorestack.protobuf.d5;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum DeviceType implements c5 {
    DEVICE_TYPE_INVALID(0),
    DEVICE_TYPE_MOBILE(1),
    DEVICE_TYPE_CTV(3),
    DEVICE_TYPE_PHONE_DEVICE(4),
    DEVICE_TYPE_TABLET(5),
    DEVICE_TYPE_TV_BOX(7),
    UNRECOGNIZED(-1);

    public static final int DEVICE_TYPE_CTV_VALUE = 3;
    public static final int DEVICE_TYPE_INVALID_VALUE = 0;
    public static final int DEVICE_TYPE_MOBILE_VALUE = 1;
    public static final int DEVICE_TYPE_PHONE_DEVICE_VALUE = 4;
    public static final int DEVICE_TYPE_TABLET_VALUE = 5;
    public static final int DEVICE_TYPE_TV_BOX_VALUE = 7;
    private final int value;
    private static final d5 internalValueMap = new d5() { // from class: com.explorestack.protobuf.adcom.DeviceType.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public DeviceType m262findValueByNumber(int i) {
            return DeviceType.forNumber(i);
        }
    };
    private static final DeviceType[] VALUES = values();

    public static DeviceType forNumber(int i) {
        if (i == 0) {
            return DEVICE_TYPE_INVALID;
        }
        if (i == 1) {
            return DEVICE_TYPE_MOBILE;
        }
        if (i == 3) {
            return DEVICE_TYPE_CTV;
        }
        if (i == 4) {
            return DEVICE_TYPE_PHONE_DEVICE;
        }
        if (i == 5) {
            return DEVICE_TYPE_TABLET;
        }
        if (i != 7) {
            return null;
        }
        return DEVICE_TYPE_TV_BOX;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.F0.getEnumTypes().get(9);
    }

    public static d5 internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.explorestack.protobuf.c5
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        defpackage.d.r("Can't get the number of an unknown enum value.");
        return 0;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        e32.i("Can't get the descriptor of an unrecognized enum value.");
        return null;
    }

    DeviceType(int i) {
        this.value = i;
    }

    public static DeviceType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        defpackage.d.r("EnumValueDescriptor is not for this type.");
        return null;
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Deprecated
    public static DeviceType valueOf(int i) {
        return forNumber(i);
    }
}
