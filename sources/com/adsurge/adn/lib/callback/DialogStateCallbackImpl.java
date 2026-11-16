package com.adsurge.adn.lib.callback;

import com.adsurge.adn.p018e1.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class DialogStateCallbackImpl implements DialogStateCallback {
    private c onShow = null;
    private c onDismiss = null;

    @Override // com.adsurge.adn.lib.callback.DialogStateCallback
    public c onDismiss() {
        if (this.onDismiss == null) {
            this.onDismiss = new c();
        }
        return this.onDismiss;
    }

    @Override // com.adsurge.adn.lib.callback.DialogStateCallback
    public c onShow() {
        if (this.onShow == null) {
            this.onShow = new c();
        }
        return this.onShow;
    }
}
