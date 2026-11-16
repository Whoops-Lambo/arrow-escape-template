package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.inmobi.ads.listeners.InterstitialAdEventListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p51 implements u41 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ MediationAdConfiguration c;
    public final /* synthetic */ InterstitialAdEventListener d;

    public /* synthetic */ p51(InterstitialAdEventListener interstitialAdEventListener, Context context, MediationAdConfiguration mediationAdConfiguration, int i) {
        this.a = i;
        this.d = interstitialAdEventListener;
        this.b = context;
        this.c = mediationAdConfiguration;
    }

    @Override // defpackage.u41
    public final void onInitializeError(AdError adError) {
        int i = this.a;
        InterstitialAdEventListener interstitialAdEventListener = this.d;
        switch (i) {
            case 0:
                Log.w(InMobiMediationAdapter.TAG, adError.toString());
                MediationAdLoadCallback mediationAdLoadCallback = ((q51) interstitialAdEventListener).b;
                if (mediationAdLoadCallback != null) {
                    mediationAdLoadCallback.onFailure(adError);
                }
                break;
            default:
                Log.w(InMobiMediationAdapter.TAG, adError.toString());
                MediationAdLoadCallback mediationAdLoadCallback2 = ((t51) interstitialAdEventListener).b;
                if (mediationAdLoadCallback2 != null) {
                    mediationAdLoadCallback2.onFailure(adError);
                }
                break;
        }
    }

    @Override // defpackage.u41
    public final void onInitializeSuccess() {
        int i = this.a;
        MediationAdConfiguration mediationAdConfiguration = this.c;
        Context context = this.b;
        InterstitialAdEventListener interstitialAdEventListener = this.d;
        switch (i) {
            case 0:
                ((q51) interstitialAdEventListener).a(context, (MediationInterstitialAdConfiguration) mediationAdConfiguration);
                break;
            default:
                ((t51) interstitialAdEventListener).a(context, (MediationRewardedAdConfiguration) mediationAdConfiguration);
                break;
        }
    }
}
