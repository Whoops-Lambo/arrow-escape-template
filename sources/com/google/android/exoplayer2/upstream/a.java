package com.google.android.exoplayer2.upstream;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public final Handler a;
    public final BandwidthMeter.EventListener b;
    public boolean c;

    public a(Handler handler, BandwidthMeter.EventListener eventListener) {
        this.a = handler;
        this.b = eventListener;
    }
}
