package com.bytedance.sdk.openadsdk.component.rz;

import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.uq.ra;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy implements com.bytedance.sdk.openadsdk.kgy.rz.ahm {
    private final PAGInterstitialAdInteractionListener kgy;
    private final ioy uq;
    private final AtomicBoolean ahm = new AtomicBoolean(false);
    private final AtomicBoolean rz = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.kgy.rz.ahm
    public void ahm() {
        boolean zCompareAndSet = this.rz.compareAndSet(false, true);
        AtomicBoolean atomicBoolean = this.rz;
        if (!zCompareAndSet) {
            ra.kgy("close_callback_repeat", atomicBoolean.get(), this.ahm.get(), this.uq);
            return;
        }
        ra.kgy("close_callback", atomicBoolean.get(), this.ahm.get(), this.uq);
        sx.kgy("BVA", "full video onAdClose");
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.kgy;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.kgy.rz.ahm
    public void kgy() {
        boolean zCompareAndSet = this.ahm.compareAndSet(false, true);
        AtomicBoolean atomicBoolean = this.rz;
        if (!zCompareAndSet) {
            ra.kgy("show_callback_repeat", atomicBoolean.get(), this.ahm.get(), this.uq);
            return;
        }
        ra.kgy("show_callback", atomicBoolean.get(), this.ahm.get(), this.uq);
        sx.kgy("BVA", "full video onAdShow");
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.kgy;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.kgy;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }

    public kgy(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.kgy kgyVar) {
        ioy ioyVarYo;
        this.kgy = pAGInterstitialAdInteractionListener;
        if (kgyVar != null) {
            ioyVarYo = kgyVar.yo();
        } else {
            ioyVarYo = null;
        }
        this.uq = ioyVarYo;
    }
}
