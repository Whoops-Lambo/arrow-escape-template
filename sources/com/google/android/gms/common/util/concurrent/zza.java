package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zza implements Runnable {
    private final Runnable zza;

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.zza.run();
    }

    public zza(Runnable runnable, int i) {
        this.zza = runnable;
    }
}
