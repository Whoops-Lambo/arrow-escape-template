package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.gms.internal.consent_sdk.zzaq;
import com.google.android.gms.internal.consent_sdk.zzcf;
import com.google.android.gms.internal.consent_sdk.zzcg;
import com.google.android.gms.internal.consent_sdk.zzch;
import com.google.android.gms.internal.consent_sdk.zzci;
import com.google.android.gms.internal.consent_sdk.zzcj;
import com.google.android.gms.internal.consent_sdk.zzck;
import com.google.android.gms.internal.consent_sdk.zzcl;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n35 {
    public final Application a;
    public final zzaq b;

    public n35(Application application, zzaq zzaqVar) {
        this.a = application;
        this.b = zzaqVar;
    }

    public final zzcl a(Activity activity, ConsentRequestParameters consentRequestParameters) throws zzg {
        Bundle bundle;
        List list;
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List list2;
        PackageInfo packageInfo;
        long longVersionCode;
        ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
        Application application = this.a;
        if (consentDebugSettings == null) {
            consentDebugSettings = new ConsentDebugSettings.Builder(application).build();
        }
        zzcl zzclVar = new zzcl();
        String strZza = consentRequestParameters.zza();
        String string = null;
        if (TextUtils.isEmpty(strZza)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                strZza = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(strZza)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzclVar.a = strZza;
        if (!consentDebugSettings.isTestDevice()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            int debugGeography = consentDebugSettings.getDebugGeography();
            if (debugGeography != 1) {
                if (debugGeography != 2) {
                    if (debugGeography != 3) {
                        if (debugGeography == 4) {
                            arrayList.add(zzcg.c);
                        }
                    } else {
                        arrayList.add(zzcg.b);
                    }
                } else {
                    arrayList.add(zzcg.d);
                }
            } else {
                arrayList.add(zzcg.a);
            }
            arrayList.add(zzcg.e);
            list = arrayList;
        }
        zzclVar.j = list;
        zzclVar.f = this.b.a();
        zzclVar.e = Boolean.valueOf(consentRequestParameters.isTagForUnderAgeOfConsent());
        zzclVar.d = Locale.getDefault().toLanguageTag();
        zzch zzchVar = new zzch();
        int i = Build.VERSION.SDK_INT;
        zzchVar.b = Integer.valueOf(i);
        zzchVar.a = Build.MODEL;
        zzchVar.c = 2;
        zzclVar.c = zzchVar;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        zzcj zzcjVar = new zzcj();
        zzcjVar.a = Integer.valueOf(configuration.screenWidthDp);
        zzcjVar.b = Integer.valueOf(configuration.screenHeightDp);
        zzcjVar.c = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i < 28) {
            list2 = Collections.EMPTY_LIST;
        } else {
            if (activity == null) {
                window = null;
            } else {
                window = activity.getWindow();
            }
            if (window == null) {
                decorView = null;
            } else {
                decorView = window.getDecorView();
            }
            if (decorView == null) {
                rootWindowInsets = null;
            } else {
                rootWindowInsets = decorView.getRootWindowInsets();
            }
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
            } else {
                displayCutout = null;
            }
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        zzci zzciVar = new zzci();
                        zzciVar.b = Integer.valueOf(rect.left);
                        zzciVar.c = Integer.valueOf(rect.right);
                        zzciVar.a = Integer.valueOf(rect.top);
                        zzciVar.d = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzciVar);
                    }
                }
                list2 = arrayList2;
            } else {
                list2 = Collections.EMPTY_LIST;
            }
        }
        zzcjVar.d = list2;
        zzclVar.g = zzcjVar;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzcf zzcfVar = new zzcf();
        zzcfVar.a = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        if (applicationLabel != null) {
            string = applicationLabel.toString();
        }
        zzcfVar.b = string;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = packageInfo.getLongVersionCode();
            } else {
                longVersionCode = packageInfo.versionCode;
            }
            zzcfVar.c = Long.toString(longVersionCode);
        }
        zzclVar.h = zzcfVar;
        zzck zzckVar = new zzck();
        zzckVar.a = "4.0.0";
        zzclVar.i = zzckVar;
        zzclVar.b = consentRequestParameters.getConsentSyncId();
        return zzclVar;
    }
}
