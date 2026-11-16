package io.p071bidmachine.protobuf.rendering;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.c5;
import com.explorestack.protobuf.d5;
import defpackage.d;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum WatermarkLocation implements c5 {
    WM_LOCATION_UNSPECIFIED(0),
    WM_LOCATION_TOP_LEFT(1),
    WM_LOCATION_TOP_CENTER(2),
    WM_LOCATION_TOP_RIGHT(3),
    WM_LOCATION_BOTTOM_LEFT(4),
    WM_LOCATION_BOTTOM_CENTER(5),
    WM_LOCATION_BOTTOM_RIGHT(6),
    UNRECOGNIZED(-1);

    public static final int WM_LOCATION_BOTTOM_CENTER_VALUE = 5;
    public static final int WM_LOCATION_BOTTOM_LEFT_VALUE = 4;
    public static final int WM_LOCATION_BOTTOM_RIGHT_VALUE = 6;
    public static final int WM_LOCATION_TOP_CENTER_VALUE = 2;
    public static final int WM_LOCATION_TOP_LEFT_VALUE = 1;
    public static final int WM_LOCATION_TOP_RIGHT_VALUE = 3;
    public static final int WM_LOCATION_UNSPECIFIED_VALUE = 0;
    private final int value;
    private static final d5 internalValueMap = new d5() { // from class: io.bidmachine.protobuf.rendering.WatermarkLocation.1
        public WatermarkLocation findValueByNumber(int i) {
            return WatermarkLocation.forNumber(i);
        }
    };
    private static final WatermarkLocation[] VALUES = values();

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

    WatermarkLocation(int i) {
        this.value = i;
    }

    public static WatermarkLocation forNumber(int i) {
        switch (i) {
            case 0:
                return WM_LOCATION_UNSPECIFIED;
            case 1:
                return WM_LOCATION_TOP_LEFT;
            case 2:
                return WM_LOCATION_TOP_CENTER;
            case 3:
                return WM_LOCATION_TOP_RIGHT;
            case 4:
                return WM_LOCATION_BOTTOM_LEFT;
            case 5:
                return WM_LOCATION_BOTTOM_CENTER;
            case 6:
                return WM_LOCATION_BOTTOM_RIGHT;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return RenderingProto.getDescriptor().getEnumTypes().get(2);
    }

    public static WatermarkLocation valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
    public static WatermarkLocation valueOf(int i) {
        return forNumber(i);
    }
}
