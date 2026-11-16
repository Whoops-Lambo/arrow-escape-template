package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
final class zaac {
    private final ApiKey zaa;
    private final TaskCompletionSource zab = new TaskCompletionSource();

    public final ApiKey zaa() {
        return this.zaa;
    }

    public final TaskCompletionSource zab() {
        return this.zab;
    }

    public zaac(ApiKey apiKey) {
        this.zaa = apiKey;
    }
}
