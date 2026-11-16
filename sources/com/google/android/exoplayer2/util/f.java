package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements Loader.Callback {
    public final SntpClient.InitializationCallback a;

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public final void onLoadCanceled(Loader.Loadable loadable, long j, long j2, boolean z) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public final void onLoadCompleted(Loader.Loadable loadable, long j, long j2) {
        SntpClient.InitializationCallback initializationCallback = this.a;
        if (initializationCallback != null) {
            if (SntpClient.isInitialized()) {
                initializationCallback.onInitialized();
            } else {
                initializationCallback.onInitializationFailed(new IOException(new ConcurrentModificationException()));
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public final Loader.LoadErrorAction onLoadError(Loader.Loadable loadable, long j, long j2, IOException iOException, int i) {
        SntpClient.InitializationCallback initializationCallback = this.a;
        if (initializationCallback != null) {
            initializationCallback.onInitializationFailed(iOException);
        }
        return Loader.DONT_RETRY;
    }

    public f(SntpClient.InitializationCallback initializationCallback) {
        this.a = initializationCallback;
    }
}
