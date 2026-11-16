package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/CorruptionHandler;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {
    public final wr0 a;

    @Override // androidx.datastore.core.CorruptionHandler
    public final Object a(CorruptionException corruptionException) {
        return this.a.invoke(corruptionException);
    }

    public ReplaceFileCorruptionHandler(wr0 wr0Var) {
        this.a = wr0Var;
    }
}
