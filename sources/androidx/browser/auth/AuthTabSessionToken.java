package androidx.browser.auth;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.IAuthTabCallback;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class AuthTabSessionToken {
    public final IAuthTabCallback a;
    public final PendingIntent b;

    /* JADX INFO: renamed from: androidx.browser.auth.AuthTabSessionToken$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    class AnonymousClass1 implements AuthTabCallback {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class MockCallback extends IAuthTabCallback.Stub {
        @Override // android.support.customtabs.IAuthTabCallback
        public final void onExtraCallback(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public final void onNavigationEvent(int i, Bundle bundle) {
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public final void onWarmupCompleted(Bundle bundle) {
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public final Bundle onExtraCallbackWithResult(String str, Bundle bundle) {
            return Bundle.EMPTY;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthTabSessionToken) {
            AuthTabSessionToken authTabSessionToken = (AuthTabSessionToken) obj;
            PendingIntent pendingIntent = authTabSessionToken.b;
            PendingIntent pendingIntent2 = this.b;
            if ((pendingIntent2 == null) == (pendingIntent == null)) {
                if (pendingIntent2 != null) {
                    return pendingIntent2.equals(pendingIntent);
                }
                IAuthTabCallback iAuthTabCallback = this.a;
                if (iAuthTabCallback == null) {
                    e32.i("AuthTabSessionToken must have valid binder or pending session");
                    return false;
                }
                IBinder iBinderAsBinder = iAuthTabCallback.asBinder();
                IAuthTabCallback iAuthTabCallback2 = authTabSessionToken.a;
                if (iAuthTabCallback2 != null) {
                    return iBinderAsBinder.equals(iAuthTabCallback2.asBinder());
                }
                e32.i("AuthTabSessionToken must have valid binder or pending session");
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        IAuthTabCallback iAuthTabCallback = this.a;
        if (iAuthTabCallback != null) {
            return iAuthTabCallback.asBinder().hashCode();
        }
        e32.i("AuthTabSessionToken must have valid binder or pending session");
        return 0;
    }

    public AuthTabSessionToken(IAuthTabCallback iAuthTabCallback, PendingIntent pendingIntent) {
        if (iAuthTabCallback == null && pendingIntent == null) {
            e32.i("AuthTabSessionToken must have either a session id or a callback (or both).");
            throw null;
        }
        this.a = iAuthTabCallback;
        this.b = pendingIntent;
    }
}
