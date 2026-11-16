package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class sm1 extends UnifiedNativeAdMapper implements OnMBMediaViewListener {
    public Campaign a;
    public final MediationAdLoadCallback b;
    public MediationNativeAdCallback c;
    public final boolean d;

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onFinishRedirection(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onRedirectionFailed(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onStartRedirection(Campaign campaign, String str) {
    }

    public static ArrayList a(View view) {
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            if (view instanceof MediaView) {
                arrayList.add(view);
                return arrayList;
            }
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return arrayList;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                    arrayList.addAll(a(viewGroup.getChildAt(i)));
                } else {
                    arrayList.add(viewGroup.getChildAt(i));
                }
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onEnterFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
            this.c.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onExitFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onVideoAdClicked(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public final void onVideoStart() {
        MediationNativeAdCallback mediationNativeAdCallback = this.c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoPlay();
            this.c.reportAdImpression();
        }
    }

    public sm1(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        Bundle mediationExtras = mediationNativeAdConfiguration.getMediationExtras();
        int i = fs1.c;
        this.d = mediationExtras.getBoolean("mute_audio");
        this.b = mediationAdLoadCallback;
    }
}
