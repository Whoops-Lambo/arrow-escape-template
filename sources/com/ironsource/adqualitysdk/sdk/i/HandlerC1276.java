package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﺭ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class HandlerC1276 extends Handler {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1255 f3831;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1276(C1255 c1255, Looper looper) {
        super(looper);
        this.f3831 = c1255;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        AbstractC1273[] abstractC1273Arr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        C1255 c1255 = this.f3831;
        do {
            synchronized (c1255.f3803) {
                try {
                    size = c1255.f3801.size();
                    if (size <= 0) {
                        return;
                    }
                    abstractC1273Arr = new AbstractC1273[size];
                    c1255.f3801.toArray(abstractC1273Arr);
                    c1255.f3801.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (size <= 0);
        AbstractC1273 abstractC1273 = abstractC1273Arr[0];
        throw null;
    }
}
