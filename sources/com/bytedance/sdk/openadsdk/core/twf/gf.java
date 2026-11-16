package com.bytedance.sdk.openadsdk.core.twf;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class gf extends yo {

    @NonNull
    private final MediaEvents ct;
    private boolean noq;

    @Override // com.bytedance.sdk.openadsdk.core.twf.yo
    public void kgy(boolean z, float f) {
        if (z) {
            this.uq = VastProperties.createVastPropertiesForSkippableMedia(f, true, Position.STANDALONE);
        } else {
            this.uq = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        kgy(2);
    }

    public gf(@NonNull AdSession adSession, @NonNull AdEvents adEvents, @NonNull View view, @NonNull MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.ct = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.twf.yo
    public void ahm(int i) {
        float f;
        if (!kgy()) {
            return;
        }
        switch (i) {
            case 0:
                this.ct.pause();
                break;
            case 1:
                this.ct.resume();
                break;
            case 2:
            case 14:
                this.ct.skipped();
                break;
            case 4:
                this.ct.bufferStart();
                break;
            case 5:
                this.ct.bufferFinish();
                break;
            case 6:
                this.ct.firstQuartile();
                break;
            case 7:
                this.ct.midpoint();
                break;
            case 8:
                this.ct.thirdQuartile();
                break;
            case 9:
                this.ct.complete();
                break;
            case 10:
                this.ct.playerStateChange(PlayerState.FULLSCREEN);
                break;
            case 11:
                this.ct.playerStateChange(PlayerState.NORMAL);
                break;
            case 12:
                MediaEvents mediaEvents = this.ct;
                if (this.noq) {
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    f = 1.0f;
                }
                mediaEvents.volumeChange(f);
                break;
            case 13:
                this.ct.adUserInteraction(InteractionType.CLICK);
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.twf.yo
    public void kgy(float f, boolean z) {
        if (kgy()) {
            this.ct.start(f, z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.twf.yo
    public void kgy(boolean z) {
        this.noq = z;
        ahm(12);
    }
}
