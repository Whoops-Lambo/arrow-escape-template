package com.google.android.exoplayer2.util;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class g implements HandlerWrapper.Message {
    public Message a;
    public h b;

    public final void a() {
        this.a = null;
        this.b = null;
        ArrayList arrayList = h.b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper.Message
    public final HandlerWrapper getTarget() {
        return (HandlerWrapper) Assertions.checkNotNull(this.b);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper.Message
    public final void sendToTarget() {
        ((Message) Assertions.checkNotNull(this.a)).sendToTarget();
        a();
    }
}
