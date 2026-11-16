package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.c5;
import com.explorestack.protobuf.d5;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum NativeAssetPosition implements c5 {
    ASSET_POSITION_TOP_LEFT(0),
    ASSET_POSITION_TOP_RIGHT(1),
    ASSET_POSITION_BOTTOM_LEFT(2),
    ASSET_POSITION_BOTTOM_RIGHT(3),
    UNRECOGNIZED(-1);

    public static final int ASSET_POSITION_BOTTOM_LEFT_VALUE = 2;
    public static final int ASSET_POSITION_BOTTOM_RIGHT_VALUE = 3;
    public static final int ASSET_POSITION_TOP_LEFT_VALUE = 0;
    public static final int ASSET_POSITION_TOP_RIGHT_VALUE = 1;
    private final int value;
    private static final d5 internalValueMap = new d5() { // from class: com.explorestack.protobuf.adcom.NativeAssetPosition.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public NativeAssetPosition m264findValueByNumber(int i) {
            return NativeAssetPosition.forNumber(i);
        }
    };
    private static final NativeAssetPosition[] VALUES = values();

    public static NativeAssetPosition forNumber(int i) {
        if (i == 0) {
            return ASSET_POSITION_TOP_LEFT;
        }
        if (i == 1) {
            return ASSET_POSITION_TOP_RIGHT;
        }
        if (i == 2) {
            return ASSET_POSITION_BOTTOM_LEFT;
        }
        if (i != 3) {
            return null;
        }
        return ASSET_POSITION_BOTTOM_RIGHT;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return b.F0.getEnumTypes().get(22);
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

    NativeAssetPosition(int i) {
        this.value = i;
    }

    public static NativeAssetPosition valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
    public static NativeAssetPosition valueOf(int i) {
        return forNumber(i);
    }
}
