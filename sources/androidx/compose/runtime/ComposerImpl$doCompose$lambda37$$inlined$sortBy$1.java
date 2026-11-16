package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.uu;
import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.runtime.ComposerImpl$doCompose$lambda-37$$inlined$sortBy$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class ComposerImpl$doCompose$lambda37$$inlined$sortBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return uu.k(Integer.valueOf(((Invalidation) obj).b), Integer.valueOf(((Invalidation) obj2).b));
    }
}
