package defpackage;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class u14 {
    public static /* synthetic */ NotificationChannel c(int i) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i);
    }

    public static /* synthetic */ AudioFocusRequest.Builder f() {
        return new AudioFocusRequest.Builder(1);
    }
}
