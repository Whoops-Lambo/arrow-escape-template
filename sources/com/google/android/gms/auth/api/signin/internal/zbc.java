package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.AsyncTaskLoader;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zbc extends AsyncTaskLoader implements SignInConnectionListener {
    public final Semaphore k;
    public final Set l;

    @Override // androidx.loader.content.Loader
    public final void e() {
        this.k.drainPermits();
        k();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final /* bridge */ /* synthetic */ Object i() {
        Iterator it = this.l.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((GoogleApiClient) it.next()).maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.k.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.k.release();
    }

    public zbc(Context context, Set set) {
        this.c = false;
        this.d = false;
        this.e = true;
        this.f = false;
        this.g = false;
        this.b = context.getApplicationContext();
        this.k = new Semaphore(0);
        this.l = set;
    }
}
