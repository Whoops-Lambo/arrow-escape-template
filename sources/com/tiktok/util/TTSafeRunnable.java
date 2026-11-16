package com.tiktok.util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class TTSafeRunnable implements Runnable {
    public abstract void doSafeRun();

    @Override // java.lang.Runnable
    public void run() {
        try {
            doSafeRun();
        } catch (Throwable unused) {
        }
    }
}
