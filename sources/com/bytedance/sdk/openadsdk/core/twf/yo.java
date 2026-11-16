package com.bytedance.sdk.openadsdk.core.twf;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class yo {
    private final AdSession ct;
    private final AdEvents noq;
    protected String rz;
    protected VastProperties uq;
    private boolean yo = false;
    protected boolean kgy = false;
    protected int ahm = 0;

    public void ahm() {
        kgy(4);
    }

    public void rz() {
        kgy(3);
    }

    public void kgy(int i) {
        int i2;
        if (this.ct == null || this.noq == null || !ct.rz()) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || (i2 = this.ahm) == 0 || i2 == 4) {
                        return;
                    }
                    this.ct.finish();
                    this.kgy = false;
                } else {
                    if (this.yo) {
                        return;
                    }
                    int i3 = this.ahm;
                    if (i3 != 1 && i3 != 2) {
                        return;
                    }
                    this.noq.impressionOccurred();
                    this.yo = true;
                }
            } else {
                if (this.ahm != 0) {
                    return;
                }
                this.ct.start();
                if (this.uq == null) {
                    this.uq = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.noq.loaded(this.uq);
                this.kgy = true;
                this.uq = null;
            }
        } else {
            if (this.ahm != 0) {
                return;
            }
            this.ct.start();
            this.noq.loaded();
            this.kgy = true;
        }
        this.ahm = i;
    }

    public yo(AdSession adSession, AdEvents adEvents, View view) {
        this.ct = adSession;
        this.noq = adEvents;
        this.rz = adSession.getAdSessionId();
        kgy(view);
    }

    public void ahm(int i) {
    }

    public void kgy(boolean z) {
    }

    public void kgy(boolean z, float f) {
    }

    public void kgy(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.ct) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void kgy(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.ct;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    public boolean kgy() {
        return this.kgy;
    }

    public void kgy(float f, boolean z) {
    }

    public void kgy(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            kgy((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
