package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.protobuf.d1;
import com.fyber.inneractive.sdk.protobuf.e1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum g implements d1 {
    AUTOSTOREKITNONE(0),
    AUTOSTOREKITPRESENTONLY(1),
    AUTOSTOREKITPRESENTANDTRACK(2),
    UNRECOGNIZED(-1);

    public static final int AUTOSTOREKITNONE_VALUE = 0;
    public static final int AUTOSTOREKITPRESENTANDTRACK_VALUE = 2;
    public static final int AUTOSTOREKITPRESENTONLY_VALUE = 1;
    private static final e1 internalValueMap = new e1() { // from class: com.fyber.inneractive.sdk.bidder.adm.f
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final d1 a(int i) {
            if (i == 0) {
                return g.AUTOSTOREKITNONE;
            }
            if (i == 1) {
                return g.AUTOSTOREKITPRESENTONLY;
            }
            if (i != 2) {
                return null;
            }
            return g.AUTOSTOREKITPRESENTANDTRACK;
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

    g(int i) {
        this.value = i;
    }
}
