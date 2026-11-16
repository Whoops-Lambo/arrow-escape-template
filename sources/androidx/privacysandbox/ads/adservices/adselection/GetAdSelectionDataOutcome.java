package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@ExperimentalFeatures.Ext10OptIn
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetAdSelectionDataOutcome {
    public final long a;
    public final byte[] b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAdSelectionDataOutcome)) {
            return false;
        }
        GetAdSelectionDataOutcome getAdSelectionDataOutcome = (GetAdSelectionDataOutcome) obj;
        return this.a == getAdSelectionDataOutcome.a && Arrays.equals(this.b, getAdSelectionDataOutcome.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        byte[] bArr = this.b;
        return iHashCode + (bArr != null ? bArr.hashCode() : 0);
    }

    public final String toString() {
        return "GetAdSelectionDataOutcome: adSelectionId=" + this.a + ", adSelectionData=" + this.b;
    }

    public GetAdSelectionDataOutcome(android.adservices.adselection.GetAdSelectionDataOutcome getAdSelectionDataOutcome) {
        getAdSelectionDataOutcome.getClass();
        long adSelectionId = getAdSelectionDataOutcome.getAdSelectionId();
        byte[] adSelectionData = getAdSelectionDataOutcome.getAdSelectionData();
        this.a = adSelectionId;
        this.b = adSelectionData;
    }
}
