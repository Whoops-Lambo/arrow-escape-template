package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTRewardWebActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.wy;
import com.bytedance.sdk.openadsdk.utils.ft;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class ra extends PAGRewardedAd {
    private final AdSlot ahm;
    private final twf ct;
    private final com.bytedance.sdk.openadsdk.core.model.kgy kgy;
    private com.bytedance.sdk.openadsdk.kgy.ct.kgy rz;
    private final String uq = ft.kgy();

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.ct.kgy(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.ct.ahm();
    }

    public void kgy() {
        this.ct.kgy();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        this.ct.kgy(d, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.rz = new nu(pAGRewardedAdInteractionCallback, this.kgy);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.rz = new nu(pAGRewardedAdInteractionListener, this.kgy);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(@Nullable Activity activity) {
        this.ct.kgy(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        this.ct.kgy(d);
    }

    public ra(Context context, com.bytedance.sdk.openadsdk.core.model.kgy kgyVar, AdSlot adSlot) {
        this.kgy = kgyVar;
        this.ahm = adSlot;
        this.ct = new twf(context, kgyVar, "rewarded_video", new twf.kgy() { // from class: com.bytedance.sdk.openadsdk.component.reward.ra.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.twf.kgy
            public void kgy(Intent intent, @Nullable Activity activity, ioy ioyVar) {
                com.bytedance.sdk.openadsdk.component.reward.kgy.rz.kgy(intent, activity, ra.this.ct.rz(), ra.this.kgy, ra.this.uq);
                intent.putExtra("media_extra", ra.this.ahm.getMediaExtra());
                intent.putExtra("user_id", ra.this.ahm.getUserID());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.twf.kgy
            public Intent kgy(Context context2, ioy ioyVar, @Nullable Activity activity) {
                if (com.bytedance.sdk.openadsdk.component.reward.rz.fi.kgy(ioyVar)) {
                    return new Intent(context2, (Class<?>) TTRewardWebActivity.class);
                }
                if (ioyVar.lb()) {
                    return new Intent(context2, (Class<?>) TTAdActivity.class);
                }
                return ioyVar.noq() ? new Intent(context2, (Class<?>) TTRewardExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTRewardVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.twf.kgy
            public void kgy() {
                if (ra.this.rz == null) {
                    return;
                }
                wy.kgy().kgy(ra.this.uq, ra.this.rz);
                ra.this.rz = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.twf.kgy
            public void kgy(ioy ioyVar) {
                ahm.kgy(ioyVar, ra.this.ct.rz(), true);
            }
        });
    }
}
