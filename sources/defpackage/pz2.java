package defpackage;

import com.unity.androidnotifications.UnityNotificationManager;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pz2 extends tz2 {
    @Override // defpackage.tz2
    public final boolean a(UnityNotificationManager unityNotificationManager, ConcurrentHashMap concurrentHashMap) {
        if (concurrentHashMap.isEmpty()) {
            return false;
        }
        Enumeration enumerationKeys = concurrentHashMap.keys();
        while (enumerationKeys.hasMoreElements()) {
            Integer num = (Integer) enumerationKeys.nextElement();
            unityNotificationManager.c(num.intValue());
            unityNotificationManager.d(String.valueOf(num));
        }
        concurrentHashMap.clear();
        return true;
    }
}
