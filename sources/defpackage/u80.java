package defpackage;

import com.google.android.exoplayer2.upstream.HttpDataSource;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u80 implements ly1 {
    public final /* synthetic */ int a;

    public /* synthetic */ u80(int i) {
        this.a = i;
    }

    @Override // defpackage.ly1
    public final boolean apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((String) obj) != null;
            case 1:
                return ((Map.Entry) obj).getKey() != null;
            case 2:
                return HttpDataSource.lambda$static$0((String) obj);
            case 3:
                return androidx.media3.datasource.HttpDataSource.lambda$static$0((String) obj);
            case 4:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
