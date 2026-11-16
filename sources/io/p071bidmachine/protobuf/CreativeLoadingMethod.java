package io.p071bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.c5;
import com.explorestack.protobuf.d5;
import defpackage.d;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum CreativeLoadingMethod implements c5 {
    FullLoad(0),
    Stream(1),
    PartialLoad(2),
    UNRECOGNIZED(-1);

    public static final int FullLoad_VALUE = 0;
    public static final int PartialLoad_VALUE = 2;
    public static final int Stream_VALUE = 1;
    private final int value;
    private static final d5 internalValueMap = new d5() { // from class: io.bidmachine.protobuf.CreativeLoadingMethod.1
        public CreativeLoadingMethod findValueByNumber(int i) {
            return CreativeLoadingMethod.forNumber(i);
        }
    };
    private static final CreativeLoadingMethod[] VALUES = values();

    public static CreativeLoadingMethod forNumber(int i) {
        if (i == 0) {
            return FullLoad;
        }
        if (i == 1) {
            return Stream;
        }
        if (i != 2) {
            return null;
        }
        return PartialLoad;
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

    CreativeLoadingMethod(int i) {
        this.value = i;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return ExtensionsProto.getDescriptor().getEnumTypes().get(6);
    }

    public static CreativeLoadingMethod valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
    public static CreativeLoadingMethod valueOf(int i) {
        return forNumber(i);
    }
}
