package defpackage;

import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.inmobi.ads.InMobiInterstitial;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class q51 extends w41 {
    @Override // defpackage.w41
    public final void b(x41 x41Var, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        ((InMobiInterstitial) x41Var.b).setExtras((HashMap) wx.b(mediationInterstitialAdConfiguration.getContext(), "c_admob", mediationInterstitialAdConfiguration.getMediationExtras()).b);
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) x41Var.b;
        inMobiInterstitial.setKeywords("");
        inMobiInterstitial.load();
    }
}
