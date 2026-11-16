package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;

/* JADX INFO: renamed from: com.inmobi.media.z2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class HandlerC4561z2 extends Handler {
    public final InMobiBanner a;

    /* JADX WARN: Illegal instructions before constructor call */
    public HandlerC4561z2(InMobiBanner inMobiBanner) {
        inMobiBanner.getClass();
        Looper mainLooper = Looper.getMainLooper();
        mainLooper.getClass();
        super(mainLooper);
        this.a = inMobiBanner;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        message.getClass();
        if (message.what == 1) {
            this.a.refreshBanner$media_release();
        }
    }
}
