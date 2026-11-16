package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class e extends com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b {
    public int g;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final Object b() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final int c() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final int a() {
        return this.g;
    }

    public e(y yVar, int[] iArr) {
        super(yVar, iArr);
        int i = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = yVar.b[0];
        while (i < this.b) {
            if (this.d[i] != oVar) {
                i++;
            } else {
                this.g = i;
            }
        }
        i = -1;
        this.g = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final void d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.e[this.g] > jElapsedRealtime) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (this.e[i] <= jElapsedRealtime) {
                    this.g = i;
                    return;
                }
            }
            io.p071bidmachine.media3.extractor.ts.y.b();
        }
    }
}
