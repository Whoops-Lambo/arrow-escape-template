package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Interval", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IntervalList<T> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Interval<T> {
    }

    void a(int i, int i2, wr0 wr0Var);

    Interval get(int i);
}
