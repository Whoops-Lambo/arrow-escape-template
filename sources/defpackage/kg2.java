package defpackage;

import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kg2 implements Loader.Loadable {
    public final long a = LoadEventInfo.getNewId();
    public final DataSpec b;
    public final StatsDataSource c;
    public byte[] d;

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void load() {
        StatsDataSource statsDataSource = this.c;
        statsDataSource.resetBytesRead();
        try {
            statsDataSource.open(this.b);
            int i = 0;
            while (i != -1) {
                int bytesRead = (int) statsDataSource.getBytesRead();
                byte[] bArr = this.d;
                if (bArr == null) {
                    this.d = new byte[1024];
                } else if (bytesRead == bArr.length) {
                    this.d = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.d;
                i = statsDataSource.read(bArr2, bytesRead, bArr2.length - bytesRead);
            }
        } finally {
            DataSourceUtil.closeQuietly(statsDataSource);
        }
    }

    public kg2(DataSource dataSource, DataSpec dataSpec) {
        this.b = dataSpec;
        this.c = new StatsDataSource(dataSource);
    }
}
