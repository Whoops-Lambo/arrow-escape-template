package defpackage;

import android.content.Context;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class f81 implements MediationInterstitialAd {
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final g81 e = new g81();
    public MediationInterstitialAdCallback a;
    public final MediationAdLoadCallback b;
    public final String c;

    public static f81 a(String str) {
        ConcurrentHashMap concurrentHashMap = d;
        if (concurrentHashMap.containsKey(str)) {
            return (f81) ((WeakReference) concurrentHashMap.get(str)).get();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        IronSource.showISDemandOnlyInterstitial(this.c);
    }

    public f81(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.c = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.b = mediationAdLoadCallback;
    }
}
