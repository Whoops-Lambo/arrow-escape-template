package com.mbridge.msdk.playercommon.exoplayer2.util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ConditionVariable {
    private boolean isOpen;

    public synchronized boolean block(long j) throws InterruptedException {
        boolean z;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j2 = j + jElapsedRealtime;
        while (true) {
            z = this.isOpen;
            if (z || jElapsedRealtime >= j2) {
                break;
            }
            wait(j2 - jElapsedRealtime);
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        return z;
    }

    public synchronized boolean close() {
        boolean z;
        z = this.isOpen;
        this.isOpen = false;
        return z;
    }

    public synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public synchronized void block() throws InterruptedException {
        while (!this.isOpen) {
            wait();
        }
    }
}
