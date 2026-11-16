package defpackage;

import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.RunnableFutureTask;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i82 extends RunnableFutureTask {
    public final /* synthetic */ DataSource a;
    public final /* synthetic */ DataSpec b;
    public final /* synthetic */ SegmentDownloader c;

    public i82(SegmentDownloader segmentDownloader, DataSource dataSource, DataSpec dataSpec) {
        this.c = segmentDownloader;
        this.a = dataSource;
        this.b = dataSpec;
    }

    @Override // com.google.android.exoplayer2.util.RunnableFutureTask
    public final Object doWork() {
        return (FilterableManifest) ParsingLoadable.load(this.a, this.c.manifestParser, this.b, 4);
    }
}
