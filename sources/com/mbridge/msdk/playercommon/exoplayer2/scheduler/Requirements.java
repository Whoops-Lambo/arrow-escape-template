package com.mbridge.msdk.playercommon.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import defpackage.h50;
import io.p071bidmachine.media3.extractor.ts.y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Requirements {
    private static final int DEVICE_CHARGING = 16;
    private static final int DEVICE_IDLE = 8;
    public static final int NETWORK_TYPE_ANY = 1;
    private static final int NETWORK_TYPE_MASK = 7;
    public static final int NETWORK_TYPE_METERED = 4;
    public static final int NETWORK_TYPE_NONE = 0;
    public static final int NETWORK_TYPE_NOT_ROAMING = 3;
    private static final String[] NETWORK_TYPE_STRINGS = null;
    public static final int NETWORK_TYPE_UNMETERED = 2;
    private static final String TAG = "Requirements";
    private final int requirements;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface NetworkType {
    }

    public Requirements(int i, boolean z, boolean z2) {
        this(i | (z ? 16 : 0) | (z2 ? 8 : 0));
    }

    private static void logd(String str) {
    }

    private static boolean checkInternetConnectivity(ConnectivityManager connectivityManager) {
        if (Util.SDK_INT < 23) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            logd("No active network.");
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        boolean z = networkCapabilities == null || !networkCapabilities.hasCapability(16);
        logd(h50.j("Network capability validated: ", z));
        return !z;
    }

    private static boolean isActiveNetworkMetered(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        if (Util.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        int type = networkInfo.getType();
        return (type == 1 || type == 7 || type == 9) ? false : true;
    }

    public int getRequiredNetworkType() {
        return this.requirements & 7;
    }

    public int getRequirementsData() {
        return this.requirements;
    }

    public boolean isChargingRequired() {
        return (this.requirements & 16) != 0;
    }

    public boolean isIdleRequired() {
        return (this.requirements & 8) != 0;
    }

    private boolean checkChargingRequirement(Context context) {
        if (!isChargingRequired()) {
            return true;
        }
        Intent intentE = h50.e("android.intent.action.BATTERY_CHANGED", context, null);
        if (intentE == null) {
            return false;
        }
        int intExtra = intentE.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    private boolean checkIdleRequirement(Context context) {
        if (!isIdleRequired()) {
            return true;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        int i = Util.SDK_INT;
        if (i >= 23) {
            if (powerManager.isDeviceIdleMode()) {
                return false;
            }
        } else if (i >= 20) {
            if (powerManager.isInteractive()) {
                return false;
            }
        } else if (powerManager.isScreenOn()) {
            return false;
        }
        return true;
    }

    private boolean checkNetworkRequirements(Context context) {
        int requiredNetworkType = getRequiredNetworkType();
        if (requiredNetworkType == 0) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (!checkInternetConnectivity(connectivityManager)) {
                return false;
            }
            if (requiredNetworkType == 1) {
                return true;
            }
            if (requiredNetworkType == 3) {
                boolean zIsRoaming = activeNetworkInfo.isRoaming();
                logd(h50.j("Roaming: ", zIsRoaming));
                return !zIsRoaming;
            }
            boolean zIsActiveNetworkMetered = isActiveNetworkMetered(connectivityManager, activeNetworkInfo);
            logd(h50.j("Metered network: ", zIsActiveNetworkMetered));
            if (requiredNetworkType == 2) {
                return !zIsActiveNetworkMetered;
            }
            if (requiredNetworkType == 4) {
                return zIsActiveNetworkMetered;
            }
            y.b();
            return false;
        }
        logd("No network info or no connection.");
        return false;
    }

    public boolean checkRequirements(Context context) {
        if (checkNetworkRequirements(context) && checkChargingRequirement(context) && checkIdleRequirement(context)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return super.toString();
    }

    public Requirements(int i) {
        this.requirements = i;
    }
}
