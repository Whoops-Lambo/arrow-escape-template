package com.google.android.gms.internal.ads;

import defpackage.cj0;
import defpackage.gm3;
import defpackage.nm3;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaco {
    public static final zzaci d = new zzaci(2, -9223372036854775807L);
    public static final zzaci e = new zzaci(3, -9223372036854775807L);
    public final nm3 a;
    public gm3 b;
    public IOException c;

    public zzaco() {
        String str = zzfq.a;
        this.a = new nm3(Executors.newSingleThreadExecutor(new cj0(1, "ExoPlayer:Loader:ProgressiveMediaPeriod")));
    }
}
