package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class v0 {
    public boolean a = true;
    public String b;

    public boolean getAllowFullscreen() {
        return this.a;
    }

    public String getMediationName() {
        return IAConfigManager.Q.m;
    }

    public String getMediationVersion() {
        return IAConfigManager.Q.o;
    }
}
