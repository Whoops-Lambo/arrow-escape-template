package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class h implements HandlerWrapper {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public static g a() {
        g gVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                gVar = arrayList.isEmpty() ? new g() : (g) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final Looper getLooper() {
        return this.a.getLooper();
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final boolean hasMessages(int i) {
        return this.a.hasMessages(i);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final boolean post(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final boolean postAtFrontOfQueue(Runnable runnable) {
        return this.a.postAtFrontOfQueue(runnable);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final boolean postDelayed(Runnable runnable, long j) {
        return this.a.postDelayed(runnable, j);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final void removeCallbacksAndMessages(Object obj) {
        this.a.removeCallbacksAndMessages(obj);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final void removeMessages(int i) {
        this.a.removeMessages(i);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final boolean sendEmptyMessage(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final boolean sendEmptyMessageAtTime(int i, long j) {
        return this.a.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final boolean sendEmptyMessageDelayed(int i, int i2) {
        return this.a.sendEmptyMessageDelayed(i, i2);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final boolean sendMessageAtFrontOfQueue(HandlerWrapper.Message message) {
        g gVar = (g) message;
        boolean zSendMessageAtFrontOfQueue = this.a.sendMessageAtFrontOfQueue((Message) Assertions.checkNotNull(gVar.a));
        gVar.a();
        return zSendMessageAtFrontOfQueue;
    }

    public h(Handler handler) {
        this.a = handler;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final HandlerWrapper.Message obtainMessage(int i) {
        g gVarA = a();
        gVarA.a = this.a.obtainMessage(i);
        gVarA.b = this;
        return gVarA;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final HandlerWrapper.Message obtainMessage(int i, Object obj) {
        g gVarA = a();
        gVarA.a = this.a.obtainMessage(i, obj);
        gVarA.b = this;
        return gVarA;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final HandlerWrapper.Message obtainMessage(int i, int i2, int i3) {
        g gVarA = a();
        gVarA.a = this.a.obtainMessage(i, i2, i3);
        gVarA.b = this;
        return gVarA;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public final HandlerWrapper.Message obtainMessage(int i, int i2, int i3, Object obj) {
        g gVarA = a();
        gVarA.a = this.a.obtainMessage(i, i2, i3, obj);
        gVarA.b = this;
        return gVarA;
    }
}
