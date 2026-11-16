package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import defpackage.h50;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Cascara {
    public static final j a = new j();

    public static int d(Context context) {
        return 0;
    }

    public static String a() {
        Context context;
        StringBuilder sb = new StringBuilder();
        try {
            synchronized (Cconst.class) {
                context = Cconst.a;
            }
            Bennet bennetA = Bryony.a(context);
            for (int i = 0; i < bennetA.a.size(); i++) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                Locale locale = bennetA.a.get(i);
                if (locale != null) {
                    sb.append(locale.getLanguage());
                    sb.append("-");
                    sb.append(locale.getCountry());
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public static int b(Context context) {
        Intent intentRegisterReceiver = null;
        try {
            intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Throwable unused) {
        }
        if (intentRegisterReceiver == null) {
            return 0;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        if (intExtra != 2 && intExtra != 5) {
            return 1;
        }
        int intExtra2 = intentRegisterReceiver.getIntExtra("plugged", -1);
        if (intExtra2 == 2) {
            return 3;
        }
        return intExtra2 == 1 ? 2 : 0;
    }

    public static String c(Context context) {
        String string;
        j jVar = a;
        synchronized (jVar) {
            try {
                String str = (String) jVar.a();
                if (str != null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    sb.append(telephonyManager.getSimState());
                    int i = Build.VERSION.SDK_INT;
                    int phoneCount = telephonyManager.getPhoneCount();
                    sb.append(",");
                    sb.append(phoneCount);
                    if (phoneCount > 1 && i >= 26) {
                        sb.append(",");
                        for (int i2 = 0; i2 < phoneCount; i2++) {
                            if (i2 > 0) {
                                sb.append(";");
                            }
                            sb.append(telephonyManager.getSimState(i2));
                        }
                    }
                    string = sb.toString();
                } catch (Throwable unused) {
                    string = sb.toString();
                }
                a.a(string, 0L);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String e(Context context) {
        ByteArrayInputStream byteArrayInputStream;
        String strA;
        ArrayList arrayList = new ArrayList();
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                byteArrayInputStream = new ByteArrayInputStream(packageManager.getPackageInfo(packageManager.getPackagesForUid(context.getPackageManager().getApplicationInfo(packageName, 0).uid)[0], 64).signatures[0].toByteArray());
                try {
                    strA = c.a(Casaba.a(((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(byteArrayInputStream)).getEncoded()));
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    strA = "";
                }
            } catch (Throwable unused4) {
                byteArrayInputStream = null;
            }
            Andromeda andromeda = new Andromeda();
            andromeda.a = p.a + p.b;
            andromeda.b = h50.i(packageName, "_", strA);
            arrayList.add(andromeda);
        }
        return !arrayList.isEmpty() ? ((Andromeda) arrayList.get(0)).b : "";
    }

    public static int a(Context context) {
        boolean z = false;
        int iA = Cimport.a(Cimport.a(0, 0, Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0), 1, Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) > 0);
        try {
            if ((context.getApplicationInfo().flags & 2) > 0) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        return Cimport.a(Cimport.a(iA, 2, z), 3, Debug.isDebuggerConnected());
    }
}
