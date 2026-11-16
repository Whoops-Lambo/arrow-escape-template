package org.chromium.net;

import defpackage.e32;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class NetworkQualityRttListener {
    private final Executor mExecutor;

    public abstract void onRttObservation(int i, long j, int i2);

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public NetworkQualityRttListener(Executor executor) {
        if (executor != null) {
            this.mExecutor = executor;
        } else {
            e32.i("Executor must not be null");
            throw null;
        }
    }
}
