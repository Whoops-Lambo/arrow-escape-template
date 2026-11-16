package com.adsurge.adn.lib.callback;

import com.adsurge.adn.p018e1.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class RewardCallbackImpl implements RewardCallback {
    private c fireReward = null;

    @Override // com.adsurge.adn.lib.callback.RewardCallback
    public c fireReward() {
        if (this.fireReward == null) {
            this.fireReward = new c();
        }
        return this.fireReward;
    }
}
