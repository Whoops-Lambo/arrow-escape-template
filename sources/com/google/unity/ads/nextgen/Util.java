package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.PrecisionType;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
class Util {

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.Util$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$libraries$ads$mobile$sdk$common$PrecisionType;

        static {
            int[] iArr = new int[PrecisionType.values().length];
            $SwitchMap$com$google$android$libraries$ads$mobile$sdk$common$PrecisionType = iArr;
            try {
                iArr[PrecisionType.ESTIMATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$libraries$ads$mobile$sdk$common$PrecisionType[PrecisionType.PUBLISHER_PROVIDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$libraries$ads$mobile$sdk$common$PrecisionType[PrecisionType.PRECISE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$android$libraries$ads$mobile$sdk$common$PrecisionType[PrecisionType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static int getAdValuePrecisionType(PrecisionType precisionType) {
        int i = AnonymousClass1.$SwitchMap$com$google$android$libraries$ads$mobile$sdk$common$PrecisionType[precisionType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    private Util() {
    }
}
