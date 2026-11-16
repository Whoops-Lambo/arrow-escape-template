package com.iab.omid.library.applovin.adsession;

/* JADX INFO: loaded from: classes6.dex */
public enum DeviceCategory {
    CTV("ctv"),
    MOBILE("mobile"),
    OTHER("other");

    private final String deviceCategory;

    @Override // java.lang.Enum
    public String toString() {
        return this.deviceCategory;
    }

    DeviceCategory(String str) {
        this.deviceCategory = str;
    }
}
