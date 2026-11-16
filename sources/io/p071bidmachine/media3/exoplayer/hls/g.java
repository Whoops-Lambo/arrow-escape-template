package io.p071bidmachine.media3.exoplayer.hls;

import android.os.SystemClock;
import io.p071bidmachine.media3.exoplayer.source.chunk.k;
import io.p071bidmachine.media3.exoplayer.trackselection.c;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class g extends c {
    public int g;

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final Object getSelectionData() {
        return null;
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int getSelectionReason() {
        return 0;
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final int getSelectedIndex() {
        return this.g;
    }

    @Override // io.p071bidmachine.media3.exoplayer.trackselection.q
    public final void b(long j, long j2, long j3, List list, k[] kVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!isTrackExcluded(this.g, jElapsedRealtime)) {
            return;
        }
        for (int i = this.b - 1; i >= 0; i--) {
            if (!isTrackExcluded(i, jElapsedRealtime)) {
                this.g = i;
                return;
            }
        }
        y.b();
    }
}
