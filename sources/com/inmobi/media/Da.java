package com.inmobi.media;

import com.inmobi.media.core.config.models.CrashConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Da {
    public final C4137jk a;
    public final C4137jk b;
    public final C4137jk c;
    public final C4137jk d;

    public Da(CrashConfig crashConfig) {
        crashConfig.getClass();
        this.a = new C4137jk(crashConfig.getCrashConfig().getSamplingPercent());
        this.b = new C4137jk(crashConfig.getCatchConfig().getSamplingPercent());
        this.c = new C4137jk(crashConfig.getAnr().getWatchdog().getSamplingPercent());
        this.d = new C4137jk(crashConfig.getAnr().getAppExitReason().getSamplingPercent());
    }
}
