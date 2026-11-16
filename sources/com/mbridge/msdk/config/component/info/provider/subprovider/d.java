package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C4664b4;
import com.ironsource.C4788i2;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.h50;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class d {
    static String a = "OtherDeviceInfoProvider";

    public int d(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
        } catch (Throwable th) {
            q0.b(a, th.getMessage());
            return -1;
        }
    }

    public Map<String, Object> a(Context context) {
        Intent intentE = h50.e("android.intent.action.BATTERY_CHANGED", context, null);
        HashMap map = new HashMap();
        if (intentE != null) {
            int intExtra = intentE.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = intentE.getIntExtra("scale", -1);
            int i = (intExtra == -1 || intExtra2 == -1) ? -1 : (intExtra * 100) / intExtra2;
            int intExtra3 = intentE.getIntExtra("status", -1);
            map.put(C4664b4.j.Y, Integer.valueOf(i));
            map.put("charging", Integer.valueOf(intExtra3 == 2 ? 1 : 2));
        }
        return map;
    }

    public String b(Context context) {
        if (context == null) {
            return C4788i2.f;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
            String str = new DecimalFormat("0.0").format((audioManager != null ? audioManager.getStreamVolume(3) : -1) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1));
            return TextUtils.isEmpty(str) ? C4788i2.f : str;
        } catch (Throwable th) {
            q0.b(a, th.getMessage());
            return C4788i2.f;
        }
    }

    public float c(Context context) {
        if (context == null) {
            return -1.0f;
        }
        try {
            Resources resources = context.getResources();
            if (resources != null) {
                return resources.getConfiguration().fontScale;
            }
        } catch (Throwable th) {
            q0.b(a, th.getMessage());
        }
        return -1.0f;
    }

    public Map<String, Object> a() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            long totalBytes = statFs.getTotalBytes();
            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            HashMap map = new HashMap();
            map.put("totalSpace", Long.valueOf(totalBytes));
            map.put("freeExternalSize", Long.valueOf(availableBlocksLong));
            return map;
        } catch (Throwable th) {
            q0.b(a, th.getMessage(), th);
            return null;
        }
    }

    public String b() {
        try {
            return TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
        } catch (Throwable th) {
            q0.b(a, th.getMessage(), th);
            return "";
        }
    }
}
