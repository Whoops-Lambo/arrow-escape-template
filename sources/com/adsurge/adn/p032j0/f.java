package com.adsurge.adn.p032j0;

import androidx.core.app.NotificationCompat;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.Y0.e;
import com.adsurge.adn.Y0.v;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class f {
    public static void a(Object obj, int i, Exception exc) {
        String str = obj instanceof String ? (String) obj : "";
        String message = exc != null ? exc.getMessage() : "";
        e eVar = new e(1210043);
        eVar.e(i);
        eVar.a(new d().a("url", str).a(NotificationCompat.CATEGORY_MESSAGE, message));
        v.a(eVar);
    }
}
