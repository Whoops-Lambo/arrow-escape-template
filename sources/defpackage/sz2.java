package defpackage;

import android.app.Notification;
import com.unity.androidnotifications.UnityNotificationManager;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class sz2 extends tz2 {
    public int a;
    public Notification.Builder b;
    public boolean c;
    public boolean d;

    @Override // defpackage.tz2
    public final boolean a(UnityNotificationManager unityNotificationManager, ConcurrentHashMap concurrentHashMap) {
        int i = this.a;
        String strValueOf = String.valueOf(i);
        try {
            UnityNotificationManager.i.o(i, this.b, this.c);
            return this.d;
        } catch (Throwable th) {
            concurrentHashMap.remove(Integer.valueOf(i));
            unityNotificationManager.c(i);
            unityNotificationManager.d(strValueOf);
            throw th;
        }
    }
}
