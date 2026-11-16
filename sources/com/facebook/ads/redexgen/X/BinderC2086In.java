package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.In, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class BinderC2086In extends ICustomTabsCallback.Stub {
    public Handler A00 = new Handler(Looper.getMainLooper());
    public final /* synthetic */ IX A01;
    public final /* synthetic */ AbstractC2087Io A02;

    public BinderC2086In(AbstractC2087Io abstractC2087Io, IX ix) {
        this.A02 = abstractC2087Io;
        this.A01 = ix;
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void extraCallback(String str, Bundle bundle) throws RemoteException {
        if (this.A01 == null) {
            return;
        }
        this.A00.post(new RunnableC2078If(this, str, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
        if (this.A01 == null) {
            return null;
        }
        return this.A01.A00(str, bundle);
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException {
        if (this.A01 == null) {
            return;
        }
        this.A00.post(new RunnableC2084Il(this, i, i2, i3, i4, i5, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onActivityResized(int i, int i2, Bundle bundle) throws RemoteException {
        if (this.A01 == null) {
            return;
        }
        this.A00.post(new RunnableC2082Ij(this, i, i2, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onMessageChannelReady(Bundle bundle) throws RemoteException {
        if (this.A01 == null) {
            return;
        }
        this.A00.post(new RunnableC2079Ig(this, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onMinimized(Bundle bundle) throws RemoteException {
        if (this.A01 == null) {
            return;
        }
        this.A00.post(new RunnableC2085Im(this, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        if (this.A01 == null) {
            return;
        }
        this.A00.post(new RunnableC2077Ie(this, i, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onPostMessage(String str, Bundle bundle) throws RemoteException {
        if (this.A01 == null) {
            return;
        }
        this.A00.post(new RunnableC2080Ih(this, str, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
        if (this.A01 == null) {
            return;
        }
        this.A00.post(new RunnableC2081Ii(this, i, uri, z, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onUnminimized(Bundle bundle) throws RemoteException {
        if (this.A01 == null) {
            return;
        }
        this.A00.post(new RunnableC2076Id(this, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onWarmupCompleted(Bundle bundle) throws RemoteException {
        if (this.A01 == null) {
            return;
        }
        this.A00.post(new RunnableC2083Ik(this, bundle));
    }
}
