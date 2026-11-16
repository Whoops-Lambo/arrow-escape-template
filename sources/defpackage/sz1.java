package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.IcyDataSource$Listener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class sz1 implements Loader.Loadable, IcyDataSource$Listener {
    public final Uri b;
    public final StatsDataSource c;
    public final ProgressiveMediaExtractor d;
    public final n e;
    public final ConditionVariable f;
    public volatile boolean h;
    public long j;
    public SampleQueue l;
    public boolean m;
    public final /* synthetic */ n n;
    public final PositionHolder g = new PositionHolder();
    public boolean i = true;
    public final long a = LoadEventInfo.getNewId();
    public DataSpec k = a(0);

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.h = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x002f */
    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void load() {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz1.load():void");
    }

    public final DataSpec a(long j) {
        return new DataSpec.Builder().setUri(this.b).setPosition(j).setKey(this.n.i).setFlags(6).setHttpRequestHeaders(n.M).build();
    }

    @Override // com.google.android.exoplayer2.source.IcyDataSource$Listener
    public final void onIcyMetadata(ParsableByteArray parsableByteArray) {
        long jMax = !this.m ? this.j : Math.max(this.n.c(true), this.j);
        int iBytesLeft = parsableByteArray.bytesLeft();
        TrackOutput trackOutput = (TrackOutput) Assertions.checkNotNull(this.l);
        trackOutput.sampleData(parsableByteArray, iBytesLeft);
        trackOutput.sampleMetadata(jMax, 1, iBytesLeft, 0, null);
        this.m = true;
    }

    public sz1(n nVar, Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, n nVar2, ConditionVariable conditionVariable) {
        this.n = nVar;
        this.b = uri;
        this.c = new StatsDataSource(dataSource);
        this.d = progressiveMediaExtractor;
        this.e = nVar2;
        this.f = conditionVariable;
    }
}
