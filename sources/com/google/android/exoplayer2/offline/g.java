package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class g extends RunnableFutureTask {
    public final SegmentDownloader.Segment a;
    public final CacheDataSource b;
    public final f c;
    public final byte[] d;
    public final CacheWriter e;

    @Override // com.google.android.exoplayer2.util.RunnableFutureTask
    public final void cancelWork() {
        this.e.cancel();
    }

    @Override // com.google.android.exoplayer2.util.RunnableFutureTask
    public final Object doWork() throws IOException {
        this.e.cache();
        f fVar = this.c;
        if (fVar == null) {
            return null;
        }
        fVar.e++;
        fVar.a.onProgress(fVar.b, fVar.d, fVar.a());
        return null;
    }

    public g(SegmentDownloader.Segment segment, CacheDataSource cacheDataSource, f fVar, byte[] bArr) {
        this.a = segment;
        this.b = cacheDataSource;
        this.c = fVar;
        this.d = bArr;
        this.e = new CacheWriter(cacheDataSource, segment.dataSpec, bArr, fVar);
    }
}
