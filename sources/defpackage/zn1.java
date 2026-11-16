package defpackage;

import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.NativeAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zn1 extends rc1 implements zr0 {
    public final /* synthetic */ bo1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn1(bo1 bo1Var) {
        super(2);
        this.i = bo1Var;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        NativeAd nativeAd = (NativeAd) obj;
        MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) obj2;
        bo1 bo1Var = this.i;
        if (nativeAd == null) {
            bo1Var.d.onFailure(adCreateError != null ? new AdError(adCreateError.getErrorCode(), adCreateError.getDescription(), "com.moloco.sdk") : new AdError(103, MolocoMediationAdapter.ERROR_MSG_AD_IS_NULL, MolocoMediationAdapter.ADAPTER_ERROR_DOMAIN));
        } else {
            bo1Var.e = nativeAd;
            nativeAd.load(bo1Var.b, bo1Var);
        }
        return az2.a;
    }
}
