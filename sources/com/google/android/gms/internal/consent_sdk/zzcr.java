package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import defpackage.q84;
import defpackage.x74;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzcr {
    public final Application b;
    public final zzco c;
    public final Executor d;
    public final boolean e;
    public final AtomicReference f = new AtomicReference(new ArrayDeque());
    public final AtomicReference g = new AtomicReference(new ArrayDeque());
    public final AtomicReference h = new AtomicReference(new ArrayDeque());
    public final AtomicReference i = new AtomicReference(new ArrayDeque());
    public final AtomicReference j = new AtomicReference(new ArrayDeque());
    public final AtomicReference k = new AtomicReference(new ArrayDeque());
    public final AtomicReference l = new AtomicReference(new ArrayDeque());
    public final AtomicReference a = new AtomicReference(null);

    public zzcr(Application application, Executor executor, zzco zzcoVar, boolean z) {
        this.e = z;
        this.b = application;
        this.c = zzcoVar;
        this.d = executor;
    }

    public final void a(Queue queue, int i, int i2, String str) {
        Bundle bundle;
        long longVersionCode;
        Long l = (Long) queue.poll();
        if (l != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            if (str != null) {
                i = i2;
            }
            AtomicReference atomicReference = this.k;
            Queue queue2 = (Queue) atomicReference.get();
            zzco zzcoVar = this.c;
            Application application = zzcoVar.a;
            zzid zzidVarN = zzif.n();
            zzgu zzguVarN = zzhc.n();
            zzgx zzgxVarN = zzgy.n();
            zzgxVarN.e();
            zzgy.q((zzgy) zzgxVarN.b, i);
            if (str != null) {
                zzgxVarN.e();
                zzgy.o((zzgy) zzgxVarN.b, str);
            }
            if (jCurrentTimeMillis > 0) {
                zzgxVarN.e();
                zzgy.p((zzgy) zzgxVarN.b, jCurrentTimeMillis);
            }
            zzgy zzgyVar = (zzgy) zzgxVarN.c();
            zzguVarN.e();
            zzhc.s((zzhc) zzguVarN.b, zzgyVar);
            String str2 = zzcoVar.e;
            PackageInfo packageInfo = null;
            if (str2 == null) {
                try {
                    bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle = null;
                }
                if (bundle != null) {
                    zzcoVar.e = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
                }
                if (TextUtils.isEmpty(zzcoVar.e)) {
                    Log.w("UserMessagingPlatform", "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
                }
                str2 = zzcoVar.e;
            }
            if (str2 != null) {
                zzguVarN.e();
                zzhc.p((zzhc) zzguVarN.b, str2);
            }
            zzha zzhaVar = zzcoVar.b;
            if (zzhaVar == null) {
                zzgz zzgzVarN = zzha.n();
                zzgzVarN.e();
                zzha.o((zzha) zzgzVarN.b);
                zzhaVar = (zzha) zzgzVarN.c();
                zzcoVar.b = zzhaVar;
            }
            zzguVarN.e();
            zzhc.t((zzhc) zzguVarN.b, zzhaVar);
            zzgw zzgwVar = zzcoVar.d;
            if (zzgwVar == null) {
                zzgv zzgvVarN = zzgw.n();
                int i3 = Build.VERSION.SDK_INT;
                zzgvVarN.e();
                zzgw.o((zzgw) zzgvVarN.b, i3);
                String str3 = Build.MODEL;
                zzgvVarN.e();
                zzgw.p((zzgw) zzgvVarN.b);
                zzgvVarN.e();
                zzgw.r((zzgw) zzgvVarN.b);
                String str4 = Build.VERSION.RELEASE;
                zzgvVarN.e();
                zzgw.q((zzgw) zzgvVarN.b);
                zzgwVar = (zzgw) zzgvVarN.c();
                zzcoVar.d = zzgwVar;
            }
            zzguVarN.e();
            zzhc.r((zzhc) zzguVarN.b, zzgwVar);
            zzgt zzgtVar = zzcoVar.c;
            if (zzgtVar == null) {
                String packageName = application.getPackageName();
                try {
                    packageInfo = application.getPackageManager().getPackageInfo(packageName, 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (packageInfo != null) {
                    zzgs zzgsVarN = zzgt.n();
                    if (Build.VERSION.SDK_INT >= 28) {
                        longVersionCode = packageInfo.getLongVersionCode();
                    } else {
                        longVersionCode = packageInfo.versionCode;
                    }
                    String string = Long.toString(longVersionCode);
                    zzgsVarN.e();
                    zzgt.p((zzgt) zzgsVarN.b, string);
                    zzgsVarN.e();
                    zzgt.o((zzgt) zzgsVarN.b, packageName);
                    zzcoVar.c = (zzgt) zzgsVarN.c();
                }
                zzgtVar = zzcoVar.c;
            }
            if (zzgtVar != null) {
                zzguVarN.e();
                zzhc.q((zzhc) zzguVarN.b, zzgtVar);
            }
            String string2 = PreferenceManager.getDefaultSharedPreferences(application).getString("UMP_eids", "");
            if (string2 != null && !string2.isEmpty()) {
                x74 x74Var = new zzdo(new zzdk(new x74())).a.a;
                q84 q84Var = new q84(string2);
                while (q84Var.hasNext()) {
                    String str5 = (String) q84Var.next();
                    zzguVarN.e();
                    zzhc.o((zzhc) zzguVarN.b, str5);
                }
            }
            zzhc zzhcVar = (zzhc) zzguVarN.c();
            zzidVarN.e();
            zzif.o((zzif) zzidVarN.b, zzhcVar);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            zzidVarN.e();
            zzif.p((zzif) zzidVarN.b, jCurrentTimeMillis2);
            queue2.add((zzif) zzidVarN.c());
            if (this.e) {
                ((ArrayDeque) this.l.get()).addAll((Collection) atomicReference.get());
            }
            this.d.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzcq
                @Override // java.lang.Runnable
                public final void run() {
                    zzcr zzcrVar = this.a;
                    AtomicReference atomicReference2 = zzcrVar.k;
                    String str6 = (String) zzcrVar.a.get();
                    if (str6 == null) {
                        Log.w("UserMessagingPlatform", "Metrics reporting URL is not set yet.");
                        return;
                    }
                    int size = ((Queue) atomicReference2.get()).size();
                    for (int i4 = 0; i4 < size; i4++) {
                        zzif zzifVar = (zzif) ((Queue) atomicReference2.get()).poll();
                        if (zzifVar != null) {
                            try {
                                HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str6).toURL().openConnection();
                                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, WebSettings.getDefaultUserAgent(zzcrVar.b));
                                httpURLConnection.setConnectTimeout(10000);
                                httpURLConnection.setReadTimeout(30000);
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod("POST");
                                httpURLConnection.setRequestProperty("Content-Type", "application/protobuf");
                                zzifVar.b(AdMobNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
                                int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                                if (iHttpUrlConnectionGetResponseCode != 200 && iHttpUrlConnectionGetResponseCode != 204) {
                                    Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: Http error code - " + iHttpUrlConnectionGetResponseCode + ".\n" + (httpURLConnection.getErrorStream() != null ? new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next() : null));
                                    ((Queue) atomicReference2.get()).add(zzifVar);
                                }
                            } catch (IOException e) {
                                Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: ".concat(String.valueOf(e.getMessage())));
                                ((Queue) atomicReference2.get()).add(zzifVar);
                            } catch (URISyntaxException e2) {
                                Log.w("UserMessagingPlatform", "Metrics reporting URL " + str6 + " is not valid: " + e2.getMessage());
                            }
                        }
                    }
                }
            });
        }
    }
}
