package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.facebook.a0;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.f0;
import com.facebook.internal.s0;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yb0 {
    public static final yb0 a = new yb0();
    public static final HashMap b = new HashMap();

    public static final void a(String str) {
        Set set = lz.a;
        if (set.contains(yb0.class)) {
            return;
        }
        try {
            yb0 yb0Var = a;
            HashMap map = b;
            if (set.contains(yb0Var)) {
                return;
            }
            try {
                NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) map.get(str);
                if (registrationListener != null) {
                    Object systemService = a0.a().getSystemService("servicediscovery");
                    systemService.getClass();
                    try {
                        ((NsdManager) systemService).unregisterService(registrationListener);
                    } catch (IllegalArgumentException unused) {
                        a0 a0Var = a0.a;
                    }
                    map.remove(str);
                    return;
                }
                return;
            } catch (Throwable th) {
                lz.a(yb0Var, th);
                return;
            }
            lz.a(yb0.class, th);
        } catch (Throwable th2) {
            lz.a(yb0.class, th2);
        }
    }

    public static final boolean b() {
        if (!lz.a.contains(yb0.class)) {
            try {
                f0 appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(a0.b());
                if (appSettingsWithoutQuery != null && appSettingsWithoutQuery.c.contains(s0.Enabled)) {
                    return true;
                }
            } catch (Throwable th) {
                lz.a(yb0.class, th);
                return false;
            }
        }
        return false;
    }

    public final boolean c(String str) {
        if (lz.a.contains(this)) {
            return false;
        }
        try {
            HashMap map = b;
            if (map.containsKey(str)) {
                return true;
            }
            a0 a0Var = a0.a;
            String strReplace = "18.3.0".replace('.', '|');
            strReplace.getClass();
            String str2 = "fbsdk_" + "android-".concat(strReplace) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = a0.a().getSystemService("servicediscovery");
            systemService.getClass();
            xb0 xb0Var = new xb0(str2, str);
            map.put(str, xb0Var);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, xb0Var);
            return true;
        } catch (Throwable th) {
            lz.a(this, th);
            return false;
        }
    }
}
