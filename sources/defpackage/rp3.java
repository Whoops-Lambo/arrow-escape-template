package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import androidx.core.content.ContextCompat;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.p001authapiphone.zzab;
import com.google.android.gms.internal.p001authapiphone.zzac;
import com.google.android.gms.internal.p001authapiphone.zzx;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeu;
import com.google.android.gms.internal.p002firebaseauthapi.zzagk;
import com.google.firebase.auth.PhoneAuthCredential;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class rp3 {
    public static final Pattern d = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)");
    public static final Logger e = new Logger("FirebaseAuth", "SmsRetrieverHelper");
    public final Context a;
    public final ScheduledExecutorService b;
    public final HashMap c = new HashMap();

    public static String a(String str, String str2) {
        Logger logger = e;
        String strI = h50.i(str, " ", str2);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(strI.getBytes(StandardCharsets.UTF_8));
            String strSubstring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            logger.d("Package: " + str + " -- Hash: " + strSubstring, new Object[0]);
            return strSubstring;
        } catch (NoSuchAlgorithmException e2) {
            logger.e(n30.y("NoSuchAlgorithm: ", e2.getMessage()), new Object[0]);
            return null;
        }
    }

    public static void f(rp3 rp3Var, String str) {
        tp3 tp3Var = (tp3) rp3Var.c.get(str);
        if (tp3Var != null) {
            ArrayList arrayList = tp3Var.b;
            if (vk3.G(tp3Var.d) || vk3.G(tp3Var.e) || arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((zzaeu) obj).i(PhoneAuthCredential.zza(tp3Var.d, tp3Var.e));
            }
            tp3Var.h = true;
        }
    }

    public final void b(String str, zzaeu zzaeuVar, long j, boolean z) {
        tp3 tp3Var = new tp3(j, z);
        HashMap map = this.c;
        map.put(str, tp3Var);
        d(zzaeuVar, str);
        tp3 tp3Var2 = (tp3) map.get(str);
        long j2 = tp3Var2.a;
        Logger logger = e;
        if (j2 <= 0) {
            logger.w("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzagk zzagkVar = new zzagk();
        zzagkVar.a = this;
        zzagkVar.b = str;
        tp3Var2.f = this.b.schedule(zzagkVar, j2, TimeUnit.SECONDS);
        if (!tp3Var2.c) {
            logger.w("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        up3 up3Var = new up3(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        Context context = this.a;
        ContextCompat.d(context.getApplicationContext(), up3Var, intentFilter, null);
        new zzab(context, SmsRetrieverClient.a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS).doWrite(TaskApiCall.builder().run(new zzx()).setFeatures(zzac.a).setMethodKey(1567).build()).addOnFailureListener(new t40(17));
    }

    public final String c() {
        Logger logger = e;
        Context context = this.a;
        try {
            String packageName = context.getPackageName();
            String strA = a(packageName, (Build.VERSION.SDK_INT < 28 ? Wrappers.packageManager(context).getPackageInfo(packageName, 64).signatures : Wrappers.packageManager(context).getPackageInfo(packageName, 134217728).signingInfo.getApkContentsSigners())[0].toCharsString());
            if (strA != null) {
                return strA;
            }
            logger.e("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            logger.e("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    public final void d(zzaeu zzaeuVar, String str) {
        tp3 tp3Var = (tp3) this.c.get(str);
        if (tp3Var == null) {
            return;
        }
        tp3Var.b.add(zzaeuVar);
        if (tp3Var.g) {
            zzaeuVar.zzb(tp3Var.d);
        }
        if (tp3Var.h) {
            zzaeuVar.i(PhoneAuthCredential.zza(tp3Var.d, tp3Var.e));
        }
        if (tp3Var.i) {
            zzaeuVar.zza(tp3Var.d);
        }
    }

    public final void e(String str) {
        HashMap map = this.c;
        tp3 tp3Var = (tp3) map.get(str);
        if (tp3Var == null) {
            return;
        }
        ScheduledFuture scheduledFuture = tp3Var.f;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            tp3Var.f.cancel(false);
        }
        tp3Var.b.clear();
        map.remove(str);
    }

    public final void g(String str) {
        tp3 tp3Var = (tp3) this.c.get(str);
        if (tp3Var == null || tp3Var.h || vk3.G(tp3Var.d)) {
            return;
        }
        int i = 0;
        e.w("Timed out waiting for SMS.", new Object[0]);
        ArrayList arrayList = tp3Var.b;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((zzaeu) obj).zza(tp3Var.d);
        }
        tp3Var.i = true;
    }

    public rp3(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.b = scheduledExecutorService;
    }
}
