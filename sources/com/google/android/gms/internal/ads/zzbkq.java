package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import defpackage.zy3;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbkq extends CustomTabsServiceConnection {
    public final AtomicBoolean b = new AtomicBoolean(false);
    public Context c;
    public zzeaw d;
    public CustomTabsSession e;
    public CustomTabsClient f;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f = null;
        this.e = null;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        this.f = customTabsClient;
        try {
            customTabsClient.a.warmup(0L);
        } catch (RemoteException unused) {
        }
        this.e = customTabsClient.d(new zy3(this));
    }
}
