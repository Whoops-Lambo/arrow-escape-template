package com.pgl.ssdk;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class a0 extends a3 implements a1 {
    private final HandlerThread b;

    public void a(a3.a aVar) {
        this.a = new WeakReference<>(aVar);
    }

    public a0(HandlerThread handlerThread, a3.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.b = handlerThread;
    }

    public void a(String str) {
        HandlerThread handlerThread = this.b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
