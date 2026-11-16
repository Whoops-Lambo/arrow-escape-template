package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.uq.ra;
import com.ironsource.Yf;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ct implements com.bytedance.sdk.openadsdk.kgy.uq.ahm {
    private final PAGAppOpenAdInteractionListener ahm;
    private final ioy kgy;
    private final AtomicBoolean rz = new AtomicBoolean(false);
    private final AtomicBoolean uq = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.kgy.uq.ahm
    public void ahm() {
        sx.kgy("BVA", "onAdSkip");
        boolean andSet = this.rz.getAndSet(true);
        AtomicBoolean atomicBoolean = this.rz;
        if (andSet) {
            ra.kgy("close_callback_repeat", atomicBoolean.get(), this.uq.get(), this.kgy);
            return;
        }
        ra.kgy("close_callback", atomicBoolean.get(), this.uq.get(), this.kgy);
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.ahm;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.kgy.uq.ahm
    public void kgy() {
        boolean zCompareAndSet = this.uq.compareAndSet(false, true);
        AtomicBoolean atomicBoolean = this.rz;
        if (!zCompareAndSet) {
            ra.kgy("show_callback_repeat", atomicBoolean.get(), this.uq.get(), this.kgy);
            return;
        }
        ra.kgy("show_callback", atomicBoolean.get(), this.uq.get(), this.kgy);
        sx.kgy("BVA", "onAdShow");
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.ahm;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        sx.kgy("BVA", Yf.f);
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.ahm;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.kgy.uq.ahm
    public void rz() {
        boolean andSet = this.rz.getAndSet(true);
        AtomicBoolean atomicBoolean = this.rz;
        if (andSet) {
            ra.kgy("close_callback_repeat", atomicBoolean.get(), this.uq.get(), this.kgy);
            return;
        }
        ra.kgy("close_callback", atomicBoolean.get(), this.uq.get(), this.kgy);
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.ahm;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }

    public ct(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener, ioy ioyVar) {
        this.kgy = ioyVar;
        this.ahm = pAGAppOpenAdInteractionListener;
    }
}
