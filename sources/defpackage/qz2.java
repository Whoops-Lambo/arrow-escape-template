package defpackage;

import com.unity.androidnotifications.UnityNotificationManager;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class qz2 extends tz2 {
    public int a;

    @Override // defpackage.tz2
    public final boolean a(UnityNotificationManager unityNotificationManager, ConcurrentHashMap concurrentHashMap) {
        int i = this.a;
        unityNotificationManager.c(i);
        if (concurrentHashMap.remove(Integer.valueOf(i)) == null) {
            return false;
        }
        unityNotificationManager.d(String.valueOf(i));
        return true;
    }
}
