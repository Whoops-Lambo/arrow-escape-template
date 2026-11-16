package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.IAuthTabCallback;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.IEngagementSignalsCallback;
import androidx.annotation.RestrictTo;
import androidx.browser.auth.AuthTabSessionToken;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class CustomTabsService extends Service {

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsService$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 extends ICustomTabsService.Stub {
        @Override // android.support.customtabs.ICustomTabsService
        public final Bundle extraCommand(String str, Bundle bundle) {
            throw null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean warmup(long j) {
            throw null;
        }

        public static PendingIntent r(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(CustomTabsIntent.EXTRA_SESSION_ID);
            bundle.remove(CustomTabsIntent.EXTRA_SESSION_ID);
            return pendingIntent;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, r(bundle));
            throw null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List list) {
            new CustomTabsSessionToken(iCustomTabsCallback, r(bundle));
            throw null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
            new CustomTabsSessionToken(iCustomTabsCallback, null);
            throw null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, r(bundle));
            throw null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final void prefetch(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, r(bundle));
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{uri}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            Collections.unmodifiableList(arrayList);
            PrefetchOptions.a(bundle);
            throw null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final void prefetchWithMultipleUrls(ICustomTabsCallback iCustomTabsCallback, List list, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, r(bundle));
            PrefetchOptions.a(bundle);
            throw null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, r(bundle));
            throw null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            new CustomTabsSessionToken(iCustomTabsCallback, null);
            new Bundle();
            throw null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, r(bundle));
            if (bundle != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                }
            }
            throw null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, r(bundle));
            throw null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, r(bundle));
            throw null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean newAuthTabSession(IAuthTabCallback iAuthTabCallback, Bundle bundle) {
            new AuthTabSessionToken(iAuthTabCallback, r(bundle));
            throw null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, r(bundle));
            throw null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
            IEngagementSignalsCallback.Stub.asInterface(iBinder);
            new CustomTabsSessionToken(iCustomTabsCallback, r(bundle));
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FilePurpose {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }
}
