package androidx.browser.trusted;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class TrustedWebActivityService extends Service {

    /* JADX INFO: renamed from: androidx.browser.trusted.TrustedWebActivityService$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 extends ITrustedWebActivityService.Stub {
        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle areNotificationsEnabled(Bundle bundle) {
            throw null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final void cancelNotification(Bundle bundle) {
            throw null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
            throw null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle getActiveNotifications() {
            throw null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle getSmallIconBitmap() {
            throw null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final int getSmallIconId() {
            throw null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle notifyNotificationWithChannel(Bundle bundle) {
            throw null;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }
}
