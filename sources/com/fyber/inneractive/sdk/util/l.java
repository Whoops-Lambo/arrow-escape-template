package com.fyber.inneractive.sdk.util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class l implements Runnable {
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.a a;

    public l(com.fyber.inneractive.sdk.cache.a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.cache.a aVar;
        try {
            if (o.a == null || (aVar = this.a) == null) {
                return;
            }
            o.a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(aVar.b()).apply();
        } catch (Throwable unused) {
        }
    }
}
