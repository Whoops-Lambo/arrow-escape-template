package io.p071bidmachine;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import defpackage.rc1;
import defpackage.sr0;
import io.p071bidmachine.util.d;
import io.p071bidmachine.util.p;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n0 extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ DeviceInfo j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(DeviceInfo deviceInfo, int i) {
        super(0);
        this.i = i;
        this.j = deviceInfo;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        UiModeManager uiModeManager = null;
        DeviceInfo deviceInfo = this.j;
        switch (i) {
            case 0:
                Context context = deviceInfo.appContext;
                context.getClass();
                try {
                    Object systemService = context.getSystemService("uimode");
                    if (!(systemService instanceof UiModeManager)) {
                        systemService = null;
                    }
                    uiModeManager = (UiModeManager) systemService;
                } catch (Throwable unused) {
                }
                if ((uiModeManager != null && uiModeManager.getCurrentModeType() == 4) || context.getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return d.a;
                }
                Configuration configuration = context.getResources().getConfiguration();
                configuration.getClass();
                return configuration.smallestScreenWidthDp >= 600 ? d.b : d.c;
            case 1:
                Context context2 = deviceInfo.appContext;
                context2.getClass();
                TelephonyManager telephonyManagerY = p.y(context2);
                if (telephonyManagerY != null) {
                    return Boolean.valueOf(telephonyManagerY.isNetworkRoaming());
                }
                return null;
            case 2:
                Context context3 = deviceInfo.appContext;
                context3.getClass();
                Configuration configuration2 = context3.getResources().getConfiguration();
                configuration2.getClass();
                return Boolean.valueOf(configuration2.smallestScreenWidthDp >= 600);
            case 3:
                Context context4 = deviceInfo.appContext;
                context4.getClass();
                TelephonyManager telephonyManagerY2 = p.y(context4);
                if (telephonyManagerY2 != null) {
                    return telephonyManagerY2.getNetworkOperatorName();
                }
                return null;
            case 4:
                Context context5 = deviceInfo.appContext;
                context5.getClass();
                try {
                    TelephonyManager telephonyManagerY3 = p.y(context5);
                    String networkOperator = telephonyManagerY3 != null ? telephonyManagerY3.getNetworkOperator() : null;
                    if (networkOperator == null || networkOperator.length() < 3) {
                        return null;
                    }
                    return networkOperator.substring(0, 3) + '-' + networkOperator.substring(3);
                } catch (Exception unused2) {
                    return null;
                }
            case 5:
                Context context6 = deviceInfo.appContext;
                context6.getClass();
                return Float.valueOf(p.t(context6).density);
            case 6:
                return Integer.valueOf(deviceInfo.appContext.getResources().getDisplayMetrics().densityDpi);
            case 7:
                Context context7 = deviceInfo.appContext;
                context7.getClass();
                TelephonyManager telephonyManagerY4 = p.y(context7);
                if (telephonyManagerY4 != null) {
                    return telephonyManagerY4.getSimOperatorName();
                }
                return null;
            default:
                Context context8 = deviceInfo.appContext;
                context8.getClass();
                TelephonyManager telephonyManagerY5 = p.y(context8);
                if (telephonyManagerY5 != null) {
                    return telephonyManagerY5.getSimCountryIso();
                }
                return null;
        }
    }
}
