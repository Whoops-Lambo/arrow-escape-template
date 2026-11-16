package defpackage;

import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i40 implements VideoContentListener {
    public final /* synthetic */ l40 a;

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public final void onPlayerError() {
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public final void onProgress(int i, int i2) {
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public final void onCompleted() {
        MediationNativeAdCallback mediationNativeAdCallback = this.a.b;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoComplete();
        }
    }

    public i40(l40 l40Var) {
        this.a = l40Var;
    }
}
