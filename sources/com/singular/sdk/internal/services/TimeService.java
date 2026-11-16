package com.singular.sdk.internal.services;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class TimeService {
    private final TimeProvider timeProvider;

    public long getCurrentTimeMillis() {
        return this.timeProvider.currentTimeMillis();
    }

    public TimeService(TimeProvider timeProvider) {
        if (timeProvider == null) {
            this.timeProvider = new SingularTimeProvider();
        } else {
            this.timeProvider = timeProvider;
        }
    }

    public double lagSince(long j) {
        return (getCurrentTimeMillis() - j) * 0.001d;
    }
}
