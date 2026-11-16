package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class CustomTabsSessionToken {
    public final ICustomTabsCallback a;
    public final PendingIntent b;

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSessionToken$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    class AnonymousClass1 extends CustomTabsCallback {
        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void extraCallback(String str, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onActivityResized(int i, int i2, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onMessageChannelReady(Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onMinimized(Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onNavigationEvent(int i, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onPostMessage(String str, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onUnminimized(Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onWarmupCompleted(Bundle bundle) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class MockCallback extends ICustomTabsCallback.Stub {
        @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void extraCallback(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void onActivityResized(int i, int i2, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void onMessageChannelReady(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void onMinimized(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void onNavigationEvent(int i, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void onPostMessage(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void onUnminimized(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void onWarmupCompleted(Bundle bundle) {
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CustomTabsSessionToken) {
            CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) obj;
            PendingIntent pendingIntent = customTabsSessionToken.b;
            PendingIntent pendingIntent2 = this.b;
            if ((pendingIntent2 == null) == (pendingIntent == null)) {
                if (pendingIntent2 != null) {
                    return pendingIntent2.equals(pendingIntent);
                }
                ICustomTabsCallback iCustomTabsCallback = this.a;
                if (iCustomTabsCallback == null) {
                    e32.i("CustomTabSessionToken must have valid binder or pending session");
                    return false;
                }
                IBinder iBinderAsBinder = iCustomTabsCallback.asBinder();
                ICustomTabsCallback iCustomTabsCallback2 = customTabsSessionToken.a;
                if (iCustomTabsCallback2 != null) {
                    return iBinderAsBinder.equals(iCustomTabsCallback2.asBinder());
                }
                e32.i("CustomTabSessionToken must have valid binder or pending session");
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
        ICustomTabsCallback iCustomTabsCallback = this.a;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder().hashCode();
        }
        e32.i("CustomTabSessionToken must have valid binder or pending session");
        return 0;
    }

    public CustomTabsSessionToken(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            e32.i("CustomTabsSessionToken must have either a session id or a callback (or both).");
            throw null;
        }
        this.a = iCustomTabsCallback;
        this.b = pendingIntent;
    }
}
