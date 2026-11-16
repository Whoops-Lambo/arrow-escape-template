package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.ads.AdConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e73 extends z63 {
    @Override // defpackage.z63
    public final String a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        return mediationInterstitialAdConfiguration.getBidResponse();
    }

    @Override // defpackage.z63
    public final void b(AdConfig adConfig, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            adConfig.setWatermark(watermark);
        }
    }
}
