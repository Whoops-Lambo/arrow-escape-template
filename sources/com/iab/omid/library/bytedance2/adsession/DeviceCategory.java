package com.iab.omid.library.bytedance2.adsession;

/* JADX INFO: loaded from: classes7.dex */
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
