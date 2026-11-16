package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h81 implements MediationRewardedAd {
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final i81 e = new i81();
    public MediationRewardedAdCallback a;
    public final MediationAdLoadCallback b;
    public final String c;

    public static h81 a(String str) {
        ConcurrentHashMap concurrentHashMap = d;
        if (concurrentHashMap.containsKey(str)) {
            return (h81) ((WeakReference) concurrentHashMap.get(str)).get();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        StringBuilder sb = new StringBuilder("Showing IronSource rewarded ad for instance ID: ");
        String str = this.c;
        sb.append(str);
        Log.d("IronSourceMediationAdapter", sb.toString());
        IronSource.showISDemandOnlyRewardedVideo(str);
    }

    public h81(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.c = mediationRewardedAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.b = mediationAdLoadCallback;
    }
}
