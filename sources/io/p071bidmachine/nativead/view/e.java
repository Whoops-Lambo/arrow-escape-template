package io.p071bidmachine.nativead.view;

import io.p071bidmachine.PositionData;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[PositionData.values().length];
        try {
            iArr[PositionData.TopLeft.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PositionData.TopRight.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PositionData.BottomLeft.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PositionData.BottomRight.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
