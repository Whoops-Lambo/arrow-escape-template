package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import defpackage.pv1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFeatures.Ext8OptIn
public final class UpdateAdCounterHistogramRequest {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof UpdateAdCounterHistogramRequest);
    }

    public final int hashCode() {
        Long.hashCode(0L);
        Integer.hashCode(0);
        throw null;
    }

    public final String toString() {
        return pv1.n("UpdateAdCounterHistogramRequest: adSelectionId=0, adEventType=", "AD_EVENT_TYPE_WIN", ", callerAdTech=null");
    }
}
