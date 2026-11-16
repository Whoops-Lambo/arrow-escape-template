package com.inmobi.media;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.inmobi.media.na, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ThreadFactoryC4239na implements ThreadFactory {
    public final boolean a;
    public final String b;

    public ThreadFactoryC4239na(String str, boolean z) {
        str.getClass();
        this.a = z;
        this.b = "TIM-".concat(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        runnable.getClass();
        try {
            Thread thread = new Thread(runnable, this.b);
            thread.setDaemon(this.a);
            return thread;
        } catch (InternalError e) {
            e.toString();
            return null;
        }
    }
}
