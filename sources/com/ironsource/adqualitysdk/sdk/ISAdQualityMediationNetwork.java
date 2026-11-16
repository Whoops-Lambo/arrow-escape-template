package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public enum ISAdQualityMediationNetwork {
    UNKNOWN(-1),
    ADMOB(0),
    DT_FAIR_BID(1),
    HELIUM(2),
    LEVEL_PLAY(3),
    MAX(4),
    UNITY(5),
    SELF_MEDIATED(6),
    OTHER(7);


    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int f54;

    @Deprecated
    public int getValue() {
        return this.f54;
    }

    ISAdQualityMediationNetwork(int i) {
        this.f54 = i;
    }

    @Deprecated
    public static ISAdQualityMediationNetwork fromInt(int i) {
        switch (i) {
            case -1:
                return UNKNOWN;
            case 0:
                return ADMOB;
            case 1:
                return DT_FAIR_BID;
            case 2:
                return HELIUM;
            case 3:
                return LEVEL_PLAY;
            case 4:
                return MAX;
            case 5:
                return UNITY;
            case 6:
                return SELF_MEDIATED;
            case 7:
                return OTHER;
            default:
                return null;
        }
    }
}
