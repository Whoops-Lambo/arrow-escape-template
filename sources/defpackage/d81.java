package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d81 implements MediationBannerAd {
    public static final ConcurrentHashMap f = new ConcurrentHashMap();
    public static final e81 g = new e81();
    public MediationBannerAdCallback a;
    public final MediationAdLoadCallback b;
    public FrameLayout c;
    public ISDemandOnlyBannerLayout d;
    public ISBannerSize e;

    public static d81 a(String str) {
        ConcurrentHashMap concurrentHashMap = f;
        if (concurrentHashMap.containsKey(str)) {
            return (d81) ((WeakReference) concurrentHashMap.get(str)).get();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return this.c;
    }

    public d81(MediationAdLoadCallback mediationAdLoadCallback) {
        this.b = mediationAdLoadCallback;
    }
}
