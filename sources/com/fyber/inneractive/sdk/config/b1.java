package com.fyber.inneractive.sdk.config;

import com.singular.sdk.internal.Constants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum b1 {
    NO_CLICK("0"),
    CTA_BUTTON("1"),
    COMPANION("2"),
    VIDEO(Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET),
    APP_INFO("4"),
    STORE_PROMO("5");

    String value;

    public final String a() {
        return this.value;
    }

    b1(String str) {
        this.value = str;
    }
}
