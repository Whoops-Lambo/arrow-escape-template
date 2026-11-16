package com.facebook.login;

import android.content.ComponentName;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends CustomTabsServiceConnection {
    public static CustomTabsClient b;
    public static CustomTabsSession c;
    public static final ReentrantLock d = new ReentrantLock();

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        CustomTabsClient customTabsClient2;
        componentName.getClass();
        try {
            customTabsClient.a.warmup(0L);
        } catch (RemoteException unused) {
        }
        b = customTabsClient;
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        if (c == null && (customTabsClient2 = b) != null) {
            c = customTabsClient2.d(null);
        }
        reentrantLock.unlock();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
    }
}
