package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.util.RunnableFutureTask;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class e extends RunnableFutureTask {
    public final /* synthetic */ ProgressiveDownloader a;

    public e(ProgressiveDownloader progressiveDownloader) {
        this.a = progressiveDownloader;
    }

    @Override // com.google.android.exoplayer2.util.RunnableFutureTask
    public final void cancelWork() {
        this.a.cacheWriter.cancel();
    }

    @Override // com.google.android.exoplayer2.util.RunnableFutureTask
    public final Object doWork() throws IOException {
        this.a.cacheWriter.cache();
        return null;
    }
}
