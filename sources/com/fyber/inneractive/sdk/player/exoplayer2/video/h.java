package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.WindowManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public final g a;
    public final boolean b;
    public final long c;
    public final long d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public long i;
    public long j;
    public long k;

    public h() {
        double refreshRate = ((WindowManager) IAConfigManager.Q.v.a().getSystemService("window")).getDefaultDisplay().getRefreshRate();
        this.b = true;
        this.a = g.e;
        long j = (long) (1.0E9d / refreshRate);
        this.c = j;
        this.d = (j * 80) / 100;
    }
}
