package com.adsurge.adn.lib.callback;

import com.adsurge.adn.p018e1.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class TimerStateCallbackImpl implements TimerStateCallback {
    private c onPause = null;
    private c onResume = null;

    @Override // com.adsurge.adn.lib.callback.TimerStateCallback
    public c onPause() {
        if (this.onPause == null) {
            this.onPause = new c();
        }
        return this.onPause;
    }

    @Override // com.adsurge.adn.lib.callback.TimerStateCallback
    public c onResume() {
        if (this.onResume == null) {
            this.onResume = new c();
        }
        return this.onResume;
    }
}
