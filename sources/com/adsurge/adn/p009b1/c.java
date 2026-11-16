package com.adsurge.adn.p009b1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static volatile boolean b = false;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Uri data;
            b bVar;
            if (intent == null || (data = intent.getData()) == null) {
                return;
            }
            String schemeSpecificPart = data.getSchemeSpecificPart();
            if (TextUtils.isEmpty(schemeSpecificPart) || (bVar = (b) c.a.remove(schemeSpecificPart)) == null) {
                return;
            }
            bVar.a(schemeSpecificPart);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface b {
        void a(String str);
    }

    public static void a() {
        if (b) {
            return;
        }
        synchronized (c.class) {
            if (b) {
                return;
            }
            try {
                Context contextA = com.adsurge.adn.J.a.d().a();
                if (contextA == null) {
                    return;
                }
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                a aVar = new a();
                if (Build.VERSION.SDK_INT >= 33) {
                    contextA.registerReceiver(aVar, intentFilter, 4);
                } else {
                    contextA.registerReceiver(aVar, intentFilter);
                }
                b = true;
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, b bVar) {
        if (TextUtils.isEmpty(str) || bVar == null) {
            return;
        }
        a.put(str, bVar);
        a();
    }
}
