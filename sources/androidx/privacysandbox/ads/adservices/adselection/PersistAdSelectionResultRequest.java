package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@ExperimentalFeatures.Ext10OptIn
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PersistAdSelectionResultRequest {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersistAdSelectionResultRequest) && Arrays.equals((byte[]) null, (byte[]) null);
    }

    public final int hashCode() {
        return Long.hashCode(0L) * 961;
    }

    public final String toString() {
        return "PersistAdSelectionResultRequest: adSelectionId=0, seller=null, adSelectionResult=null";
    }
}
