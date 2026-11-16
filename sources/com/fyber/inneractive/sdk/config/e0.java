package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.iab.omid.library.fyber.Omid;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e0 implements Runnable {
    public final /* synthetic */ IAConfigManager a;
    public final /* synthetic */ Context b;

    public e0(IAConfigManager iAConfigManager, Context context) {
        this.a = iAConfigManager;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = Omid.a;
            com.fyber.inneractive.sdk.util.r.b.post(new d0(this));
        } catch (Throwable unused) {
        }
    }
}
