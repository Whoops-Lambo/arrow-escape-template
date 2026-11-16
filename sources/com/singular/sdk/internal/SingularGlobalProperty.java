package com.singular.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class SingularGlobalProperty {
    public static final int GLOBAL_PROPERTIES_LIMIT = 5;
    private static final int GLOBAL_PROPERTY_MAX_LENGTH = 200;
    private String key;
    private boolean overrideExisting;
    private String value;

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isOverrideExisting() {
        return this.overrideExisting;
    }

    public SingularGlobalProperty(String str, String str2, boolean z) {
        this.key = str;
        this.value = str2;
        this.overrideExisting = z;
        if (str.length() > 200) {
            this.key = this.key.substring(0, 200);
        }
        if (this.value.length() > 200) {
            this.value = this.value.substring(0, 200);
        }
    }
}
