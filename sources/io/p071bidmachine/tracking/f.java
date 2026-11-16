package io.p071bidmachine.tracking;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements e {

    @NonNull
    private final Object trackingKey;

    @Override // io.p071bidmachine.tracking.e
    @NonNull
    public Object getTrackingKey() {
        return this.trackingKey;
    }

    public f(Object obj) {
        this.trackingKey = obj;
    }
}
