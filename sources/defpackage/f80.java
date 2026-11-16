package defpackage;

import android.database.Cursor;
import com.google.android.exoplayer2.offline.DefaultDownloadIndex;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadCursor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class f80 implements DownloadCursor {
    public final Cursor a;

    @Override // com.google.android.exoplayer2.offline.DownloadCursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // com.google.android.exoplayer2.offline.DownloadCursor
    public final int getCount() {
        return this.a.getCount();
    }

    @Override // com.google.android.exoplayer2.offline.DownloadCursor
    public final Download getDownload() {
        return DefaultDownloadIndex.getDownloadForCurrentRow(this.a);
    }

    @Override // com.google.android.exoplayer2.offline.DownloadCursor
    public final int getPosition() {
        return this.a.getPosition();
    }

    @Override // com.google.android.exoplayer2.offline.DownloadCursor
    public final boolean isClosed() {
        return this.a.isClosed();
    }

    @Override // com.google.android.exoplayer2.offline.DownloadCursor
    public final boolean moveToPosition(int i) {
        return this.a.moveToPosition(i);
    }

    public f80(Cursor cursor) {
        this.a = cursor;
    }
}
