package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.d1;
import com.fyber.inneractive.sdk.protobuf.e1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum q0 implements d1 {
    UNKNOWN(0),
    MALE(1),
    FEMALE(2),
    OTHER(3),
    UNRECOGNIZED(-1);

    public static final int FEMALE_VALUE = 2;
    public static final int MALE_VALUE = 1;
    public static final int OTHER_VALUE = 3;
    public static final int UNKNOWN_VALUE = 0;
    private static final e1 internalValueMap = new e1() { // from class: com.fyber.inneractive.sdk.bidder.p0
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final d1 a(int i) {
            if (i == 0) {
                return q0.UNKNOWN;
            }
            if (i == 1) {
                return q0.MALE;
            }
            if (i == 2) {
                return q0.FEMALE;
            }
            if (i != 3) {
                return null;
            }
            return q0.OTHER;
        }
    };
    private final int value;

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        defpackage.d.r("Can't get the number of an unknown enum value.");
        return 0;
    }

    q0(int i) {
        this.value = i;
    }
}
