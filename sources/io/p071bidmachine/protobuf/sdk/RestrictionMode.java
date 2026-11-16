package io.p071bidmachine.protobuf.sdk;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.c5;
import com.explorestack.protobuf.d5;
import defpackage.d;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum RestrictionMode implements c5 {
    RESTRICTION_MODE_STRICT(0),
    RESTRICTION_MODE_MODERATE(1),
    RESTRICTION_MODE_OPEN(2),
    UNRECOGNIZED(-1);

    public static final int RESTRICTION_MODE_MODERATE_VALUE = 1;
    public static final int RESTRICTION_MODE_OPEN_VALUE = 2;
    public static final int RESTRICTION_MODE_STRICT_VALUE = 0;
    private final int value;
    private static final d5 internalValueMap = new d5() { // from class: io.bidmachine.protobuf.sdk.RestrictionMode.1
        public RestrictionMode findValueByNumber(int i) {
            return RestrictionMode.forNumber(i);
        }
    };
    private static final RestrictionMode[] VALUES = values();

    public static RestrictionMode forNumber(int i) {
        if (i == 0) {
            return RESTRICTION_MODE_STRICT;
        }
        if (i == 1) {
            return RESTRICTION_MODE_MODERATE;
        }
        if (i != 2) {
            return null;
        }
        return RESTRICTION_MODE_OPEN;
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

    RestrictionMode(int i) {
        this.value = i;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return SDKContextProto.getDescriptor().getEnumTypes().get(1);
    }

    public static RestrictionMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
    public static RestrictionMode valueOf(int i) {
        return forNumber(i);
    }
}
