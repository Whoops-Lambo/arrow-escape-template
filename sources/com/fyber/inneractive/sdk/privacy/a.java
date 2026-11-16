package com.fyber.inneractive.sdk.privacy;

import com.fyber.inneractive.sdk.config.h;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements Runnable {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (c.g) {
            try {
                c cVar = this.a;
                boolean z = cVar.c;
                AtomicReference atomicReference = cVar.b;
                if (!z) {
                    atomicReference.set(null);
                    return;
                }
                String str = (String) atomicReference.getAndSet(null);
                if (str != null) {
                    h hVar = (h) this.a.a;
                    hVar.getClass();
                    IAlog.a("%sIAB app default preference updated (%s) — refreshing cached GDPR/GPP state", "ConfigDataProtectionProvider: ", str);
                    hVar.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
