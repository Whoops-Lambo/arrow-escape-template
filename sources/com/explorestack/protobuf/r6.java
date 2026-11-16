package com.explorestack.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class r6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
        a = iArr;
        try {
            iArr[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
