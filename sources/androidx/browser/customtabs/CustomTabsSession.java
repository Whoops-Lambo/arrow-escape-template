package androidx.browser.customtabs;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.IAuthTabCallback;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.IEngagementSignalsCallback;
import com.inmobi.media.C4109ik;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class CustomTabsSession {
    public final Object a = new Object();
    public final ICustomTabsService b;
    public final ICustomTabsCallback c;
    public final ComponentName d;

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    class AnonymousClass1 extends IEngagementSignalsCallback.Stub {
        public static final /* synthetic */ int c = 0;
        public final Handler a = new Handler(Looper.getMainLooper());
        public final /* synthetic */ EngagementSignalsCallback b;

        public AnonymousClass1(EngagementSignalsCallback engagementSignalsCallback) {
            this.b = engagementSignalsCallback;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onGreatestScrollPercentageIncreased(final int i, final Bundle bundle) {
            final EngagementSignalsCallback engagementSignalsCallback = this.b;
            this.a.post(new Runnable() { // from class: androidx.browser.customtabs.b
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = CustomTabsSession.AnonymousClass1.c;
                    engagementSignalsCallback.onGreatestScrollPercentageIncreased(i, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onSessionEnded(boolean z, Bundle bundle) {
            this.a.post(new a(this.b, z, bundle, 0));
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onVerticalScrollEvent(boolean z, Bundle bundle) {
            this.a.post(new a(this.b, z, bundle, 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class MockSession extends ICustomTabsService.Stub {
        @Override // android.support.customtabs.ICustomTabsService
        public final Bundle extraCommand(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List list) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean newAuthTabSession(IAuthTabCallback iAuthTabCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final void prefetch(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final void prefetchWithMultipleUrls(ICustomTabsCallback iCustomTabsCallback, List list, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean warmup(long j) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class PendingSession {
    }

    public final void c(String str) {
        Bundle bundleA = a(null);
        synchronized (this.a) {
            try {
                try {
                    this.b.postMessage(this.c, str, bundleA);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    class AnonymousClass2 extends IEngagementSignalsCallback.Stub {
        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                throw null;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onSessionEnded(boolean z, Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                throw null;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onVerticalScrollEvent(boolean z, Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                throw null;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }
    }

    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return bundle2;
    }

    public final boolean b() {
        try {
            return this.b.isEngagementSignalsApiAvailable(this.c, a(Bundle.EMPTY));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public final void d(C4109ik c4109ik) throws RemoteException {
        try {
            this.b.setEngagementSignalsCallback(this.c, new AnonymousClass1(c4109ik).asBinder(), a(Bundle.EMPTY));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public CustomTabsSession(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName) {
        this.b = iCustomTabsService;
        this.c = iCustomTabsCallback;
        this.d = componentName;
    }
}
