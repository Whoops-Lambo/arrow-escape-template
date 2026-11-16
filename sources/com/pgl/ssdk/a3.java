package com.pgl.ssdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class a3 extends Handler {
    protected WeakReference<a> a;

    public interface a {
        void a(Message message);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar;
        WeakReference<a> weakReference = this.a;
        if (weakReference == null || (aVar = weakReference.get()) == null || message == null) {
            return;
        }
        aVar.a(message);
    }

    public a3(Looper looper, a aVar) {
        super(looper);
        if (aVar != null) {
            this.a = new WeakReference<>(aVar);
        }
    }
}
