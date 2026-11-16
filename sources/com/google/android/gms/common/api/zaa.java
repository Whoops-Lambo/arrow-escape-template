package com.google.android.gms.common.api;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zaa implements PendingResult.StatusListener {
    final /* synthetic */ Batch zaa;

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        Batch batch = this.zaa;
        synchronized (batch.zai()) {
            try {
                if (batch.isCanceled()) {
                    return;
                }
                if (status.isCanceled()) {
                    batch.zag(true);
                } else if (!status.isSuccess()) {
                    batch.zae(true);
                }
                batch.zac(batch.zab() - 1);
                if (batch.zab() == 0) {
                    if (batch.zaf()) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        batch.setResult(new BatchResult(batch.zad() ? new Status(13) : Status.RESULT_SUCCESS, batch.zah()));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zaa(Batch batch) {
        Objects.requireNonNull(batch);
        this.zaa = batch;
    }
}
