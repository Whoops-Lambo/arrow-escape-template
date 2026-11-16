package defpackage;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.PlaceholderDataSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class uu1 implements DataSource.Factory {
    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public final DataSource createDataSource() {
        return PlaceholderDataSource.b();
    }
}
