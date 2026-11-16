package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int f52;

    @Deprecated
    public static ISAdQualityLogLevel fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return ERROR;
        }
        if (i == 2) {
            return WARNING;
        }
        if (i == 3) {
            return INFO;
        }
        if (i == 4) {
            return DEBUG;
        }
        if (i != 5) {
            return null;
        }
        return VERBOSE;
    }

    @Deprecated
    public int getValue() {
        return this.f52;
    }

    @Deprecated
    public boolean shouldPrintLog(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = this.f52;
        return i != NONE.f52 && i >= iSAdQualityLogLevel.f52;
    }

    ISAdQualityLogLevel(int i) {
        this.f52 = i;
    }
}
