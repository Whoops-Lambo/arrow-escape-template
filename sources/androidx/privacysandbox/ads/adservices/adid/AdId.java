package androidx.privacysandbox.ads.adservices.adid;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdId;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdId {
    public final String a;
    public final boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdId)) {
            return false;
        }
        AdId adId = (AdId) obj;
        return this.a.equals(adId.a) && this.b == adId.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdId: adId=" + this.a + ", isLimitAdTrackingEnabled=" + this.b;
    }

    public AdId(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
