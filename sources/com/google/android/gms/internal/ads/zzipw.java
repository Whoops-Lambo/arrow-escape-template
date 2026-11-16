package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzipw extends CustomTabsServiceConnection {
    public final WeakReference b;

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbks zzbksVar = (zzbks) this.b.get();
        if (zzbksVar != null) {
            zzbksVar.b = customTabsClient;
            try {
                customTabsClient.a.warmup(0L);
            } catch (RemoteException unused) {
            }
            zzbkr zzbkrVar = zzbksVar.d;
            if (zzbkrVar != null) {
                zzbkrVar.zza();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbks zzbksVar = (zzbks) this.b.get();
        if (zzbksVar != null) {
            zzbksVar.b = null;
            zzbksVar.a = null;
        }
    }

    public zzipw(zzbks zzbksVar) {
        this.b = new WeakReference(zzbksVar);
    }
}
