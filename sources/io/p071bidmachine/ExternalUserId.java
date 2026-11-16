package io.p071bidmachine;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ExternalUserId {
    private final String sourceId;
    private final String value;

    @NonNull
    public String getSourceId() {
        return this.sourceId;
    }

    @NonNull
    public String getValue() {
        return this.value;
    }

    public ExternalUserId(@NonNull String str, @NonNull String str2) {
        this.sourceId = str;
        this.value = str2;
    }
}
