package defpackage;

import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.SntpClient;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class dh2 implements Loader.Loadable {
    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void load() {
        synchronized (SntpClient.loaderLock) {
            synchronized (SntpClient.valueLock) {
                if (!SntpClient.isInitialized) {
                    long jLoadNtpTimeOffsetMs = SntpClient.loadNtpTimeOffsetMs();
                    synchronized (SntpClient.valueLock) {
                        long unused = SntpClient.elapsedRealtimeOffsetMs = jLoadNtpTimeOffsetMs;
                        boolean unused2 = SntpClient.isInitialized = true;
                    }
                }
            }
        }
    }
}
