package defpackage;

import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.AdConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c73 extends u63 {
    @Override // defpackage.u63
    public final String a(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        mediationAppOpenAdConfiguration.getClass();
        String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
        bidResponse.getClass();
        return bidResponse;
    }

    @Override // defpackage.u63
    public final void b(AdConfig adConfig, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        mediationAppOpenAdConfiguration.getClass();
        String watermark = mediationAppOpenAdConfiguration.getWatermark();
        watermark.getClass();
        if (watermark.length() > 0) {
            adConfig.setWatermark(watermark);
        }
    }
}
