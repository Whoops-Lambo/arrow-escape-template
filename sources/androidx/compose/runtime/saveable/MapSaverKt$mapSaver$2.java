package androidx.compose.runtime.saveable;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.rc1;
import defpackage.wr0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "list", "", "", "invoke", "(Ljava/util/List;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class MapSaverKt$mapSaver$2 extends rc1 implements wr0 {
    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.size() % 2 != 0) {
            throw new IllegalStateException("Check failed.");
        }
        for (int i = 0; i < list.size(); i += 2) {
            Object obj2 = list.get(i);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            linkedHashMap.put((String) obj2, list.get(i + 1));
        }
        throw null;
    }
}
