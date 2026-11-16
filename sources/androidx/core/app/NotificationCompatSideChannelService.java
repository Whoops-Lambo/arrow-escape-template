package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.v4.app.INotificationSideChannel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class NotificationCompatSideChannelService extends Service {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class NotificationSideChannelStub extends INotificationSideChannel.Stub {
        @Override // android.support.v4.app.INotificationSideChannel
        public final void cancel(String str, int i, String str2) {
            Binder.getCallingUid();
            throw null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public final void cancelAll(String str) {
            Binder.getCallingUid();
            throw null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public final void notify(String str, int i, String str2, Notification notification) {
            Binder.getCallingUid();
            throw null;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
        return null;
    }
}
