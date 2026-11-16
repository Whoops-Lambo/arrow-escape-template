package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import defpackage.ac2;
import defpackage.bo0;
import defpackage.d;
import defpackage.do0;
import defpackage.h50;
import defpackage.jd2;
import defpackage.jk;
import defpackage.k5;
import defpackage.k92;
import defpackage.l5;
import defpackage.n30;
import defpackage.nf;
import defpackage.oc2;
import defpackage.pv1;
import defpackage.tx;
import defpackage.uf0;
import defpackage.uf1;
import defpackage.uu;
import defpackage.wb0;
import defpackage.x41;
import defpackage.xn;
import defpackage.zz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class FirebaseCrashlytics {
    static final int APP_EXCEPTION_CALLBACK_TIMEOUT_MS = 500;
    static final String FIREBASE_CRASHLYTICS_ANALYTICS_ORIGIN = "clx";
    static final String LEGACY_CRASH_ANALYTICS_ORIGIN = "crash";

    @VisibleForTesting
    final CrashlyticsCore core;

    public void recordException(@NonNull Throwable th, @NonNull CustomKeysAndValues customKeysAndValues) {
        if (th == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        CrashlyticsCore crashlyticsCore = this.core;
        customKeysAndValues.getClass();
        crashlyticsCore.logException(th, null);
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        return this.core.checkForUnsentReports();
    }

    public void deleteUnsentReports() {
        this.core.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.core.didCrashOnPreviousExecution();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.core.isCrashlyticsCollectionEnabled();
    }

    public void log(@NonNull String str) {
        this.core.log(str);
    }

    public void sendUnsentReports() {
        this.core.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.core.setCrashlyticsCollectionEnabled(Boolean.valueOf(z));
    }

    public void setCustomKey(@NonNull String str, boolean z) {
        this.core.setCustomKey(str, Boolean.toString(z));
    }

    public void setCustomKeys(@NonNull CustomKeysAndValues customKeysAndValues) {
        CrashlyticsCore crashlyticsCore = this.core;
        customKeysAndValues.getClass();
        crashlyticsCore.setCustomKeys(null);
    }

    public void setUserId(@NonNull String str) {
        this.core.setUserId(str);
    }

    private FirebaseCrashlytics(@NonNull CrashlyticsCore crashlyticsCore) {
        this.core = crashlyticsCore;
    }

    @NonNull
    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.getInstance().get(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        d.w("FirebaseCrashlytics component is not present.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x02c2 A[EDGE_INSN: B:104:0x02c2->B:70:0x02c2 BREAK  A[LOOP:2: B:64:0x02a9->B:69:0x02bf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0197  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ee A[Catch: NameNotFoundException -> 0x03be, TryCatch #0 {NameNotFoundException -> 0x03be, blocks: (B:45:0x01d8, B:47:0x01ee, B:50:0x0200, B:53:0x0206, B:49:0x01f9), top: B:98:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01f9 A[Catch: NameNotFoundException -> 0x03be, TryCatch #0 {NameNotFoundException -> 0x03be, blocks: (B:45:0x01d8, B:47:0x01ee, B:50:0x0200, B:53:0x0206, B:49:0x01f9), top: B:98:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0204  */
    /* JADX WARN: Code duplicated, block: B:56:0x0230  */
    /* JADX WARN: Code duplicated, block: B:59:0x028f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0295  */
    /* JADX WARN: Code duplicated, block: B:62:0x029e  */
    /* JADX WARN: Code duplicated, block: B:66:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:72:0x02d1 A[LOOP:3: B:71:0x02cf->B:72:0x02d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x0375  */
    /* JADX WARN: Code duplicated, block: B:88:0x037c  */
    /* JADX WARN: Code duplicated, block: B:92:0x03b5  */
    @Nullable
    public static FirebaseCrashlytics init(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseInstallationsApi firebaseInstallationsApi, @NonNull Deferred deferred, @NonNull Deferred deferred2, @NonNull Deferred deferred3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        String string;
        CrashlyticsCore crashlyticsCore;
        CrashlyticsWorkers crashlyticsWorkers;
        int i;
        Throwable th;
        String strY;
        int size;
        int i2;
        PackageInfo packageInfo;
        String string2;
        String str;
        AppData appData;
        String strY2;
        String strD;
        int iY;
        String string3;
        String[] strArr;
        ArrayList arrayList;
        int i3;
        int i4;
        StringBuilder sb;
        int size2;
        int i5;
        String string4;
        String strM;
        nf nfVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        oc2 oc2VarF;
        Task taskOnSuccessTask;
        CrashlyticsCore crashlyticsCore2;
        oc2 oc2VarF2;
        String str2;
        String string5;
        Context applicationContext = firebaseApp.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics " + CrashlyticsCore.getVersion() + " for " + packageName, null);
        CrashlyticsWorkers crashlyticsWorkers2 = new CrashlyticsWorkers(executorService, executorService2);
        FileStore fileStore = new FileStore(applicationContext);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        IdManager idManager = new IdManager(applicationContext, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        zz zzVar = new zz(deferred);
        l5 l5Var = new l5(deferred2);
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
        do0 do0Var = do0.a;
        do0 do0Var2 = do0.a;
        ac2 ac2Var = ac2.a;
        bo0 bo0VarA = do0.a(ac2Var);
        if (bo0VarA.b != null) {
            Log.d("FirebaseSessions", "Subscriber " + ac2Var + " already registered.");
        } else {
            bo0VarA.b = crashlyticsAppQualitySessionsSubscriber;
            Log.d("FirebaseSessions", "Subscriber " + ac2Var + " registered.");
            bo0VarA.a.countDown();
        }
        CrashlyticsCore crashlyticsCore3 = new CrashlyticsCore(firebaseApp, idManager, zzVar, dataCollectionArbiter, new k5(l5Var), new k5(l5Var), fileStore, crashlyticsAppQualitySessionsSubscriber, new RemoteConfigDeferredProxy(deferred3), crashlyticsWorkers2);
        String applicationId = firebaseApp.getOptions().getApplicationId();
        int iY2 = uu.y(applicationContext, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iY2 == 0) {
            iY2 = uu.y(applicationContext, "com.crashlytics.android.build_id", "string");
        }
        if (iY2 != 0) {
            string = applicationContext.getResources().getString(iY2);
        } else {
            string = null;
        }
        ArrayList arrayList2 = new ArrayList();
        int iY3 = uu.y(applicationContext, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iY4 = uu.y(applicationContext, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iY5 = uu.y(applicationContext, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        try {
            if (iY3 == 0 || iY4 == 0 || iY5 == 0) {
                crashlyticsCore = crashlyticsCore3;
                crashlyticsWorkers = crashlyticsWorkers2;
                String str3 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iY3), Integer.valueOf(iY4), Integer.valueOf(iY5));
                i = 3;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    th = null;
                    Log.d("FirebaseCrashlytics", str3, null);
                }
                strY = n30.y("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i)) {
                    Log.d("FirebaseCrashlytics", strY, th);
                }
                size = arrayList2.size();
                i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    jk jkVar = (jk) obj;
                    String str4 = jkVar.a;
                    String str5 = jkVar.b;
                    String str6 = jkVar.c;
                    int i6 = size;
                    StringBuilder sbR = pv1.r("Build id for ", str4, " on ", str5, ": ");
                    sbR.append(str6);
                    string5 = sbR.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", string5, null);
                    }
                    size = i6;
                }
                uf1 uf1Var = new uf1(applicationContext, false, 11);
                String packageName2 = applicationContext.getPackageName();
                String strD2 = idManager.d();
                packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName2, 0);
                if (Build.VERSION.SDK_INT >= 28) {
                    string2 = Long.toString(packageInfo.getLongVersionCode());
                } else {
                    string2 = Integer.toString(packageInfo.versionCode);
                }
                String str7 = string2;
                str = packageInfo.versionName;
                if (str == null) {
                    str = "0.0";
                }
                String str8 = str;
                appData = new AppData(applicationId, string, arrayList2, strD2, packageName2, str7, str8, uf1Var);
                strY2 = n30.y("Installer package name is: ", strD2);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strY2, null);
                }
                k92 k92Var = new k92(12);
                strD = idManager.d();
                uf0 uf0Var = new uf0(15);
                x41 x41Var = new x41(uf0Var, 23);
                xn xnVar = new xn(fileStore);
                Locale locale = Locale.US;
                tx txVar = new tx(pv1.n("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", applicationId, "/settings"), k92Var);
                String str9 = Build.MANUFACTURER;
                String str10 = IdManager.h;
                String strI = h50.i(str9.replaceAll(str10, ""), "/", Build.MODEL.replaceAll(str10, ""));
                String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str10, "");
                String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str10, "");
                iY = uu.y(applicationContext, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (iY == 0) {
                    iY = uu.y(applicationContext, "com.crashlytics.android.build_id", "string");
                }
                if (iY != 0) {
                    string3 = applicationContext.getResources().getString(iY);
                } else {
                    string3 = null;
                }
                strArr = new String[]{string3, applicationId, str8, str7};
                arrayList = new ArrayList();
                i3 = 0;
                while (true) {
                    i4 = 4;
                    if (i3 < 4) {
                        break;
                    }
                    str2 = strArr[i3];
                    if (str2 != null) {
                        arrayList.add(str2.replace("-", "").toLowerCase(Locale.US));
                    }
                    i3++;
                }
                Collections.sort(arrayList);
                sb = new StringBuilder();
                size2 = arrayList.size();
                i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList.get(i5);
                    i5++;
                    sb.append((String) obj2);
                }
                string4 = sb.toString();
                if (string4.length() > 0) {
                    strM = uu.M(string4);
                } else {
                    strM = null;
                }
                if (strD == null) {
                    i4 = 1;
                }
                jd2 jd2Var = new jd2(applicationId, strI, strReplaceAll, strReplaceAll2, idManager, strM, str8, str7, n30.a(i4));
                nfVar = new nf();
                AtomicReference atomicReference3 = new AtomicReference();
                nfVar.h = atomicReference3;
                nfVar.i = new AtomicReference(new TaskCompletionSource());
                nfVar.a = applicationContext;
                nfVar.b = jd2Var;
                nfVar.d = uf0Var;
                nfVar.c = x41Var;
                nfVar.e = xnVar;
                nfVar.f = txVar;
                nfVar.g = dataCollectionArbiter;
                atomicReference3.set(k92.g(uf0Var));
                atomicReference = (AtomicReference) nfVar.i;
                atomicReference2 = (AtomicReference) nfVar.h;
                if (!((Context) nfVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals((String) ((jd2) nfVar.b).f) && (oc2VarF2 = nfVar.f(1)) != null) {
                    atomicReference2.set(oc2VarF2);
                    ((TaskCompletionSource) atomicReference.get()).trySetResult(oc2VarF2);
                    taskOnSuccessTask = Tasks.forResult(null);
                } else {
                    oc2VarF = nfVar.f(3);
                    if (oc2VarF != null) {
                        atomicReference2.set(oc2VarF);
                        ((TaskCompletionSource) atomicReference.get()).trySetResult(oc2VarF);
                    }
                    CrashlyticsWorkers crashlyticsWorkers3 = crashlyticsWorkers;
                    taskOnSuccessTask = ((DataCollectionArbiter) nfVar.g).waitForDataCollectionPermission().onSuccessTask(crashlyticsWorkers3.a, new uf1(25, nfVar, crashlyticsWorkers3));
                }
                taskOnSuccessTask.addOnFailureListener(executorService3, new wb0(24));
                crashlyticsCore2 = crashlyticsCore;
                if (crashlyticsCore2.onPreExecute(appData, nfVar)) {
                    crashlyticsCore2.doBackgroundInitializationAsync(nfVar);
                }
                return new FirebaseCrashlytics(crashlyticsCore2);
            }
            String[] stringArray = applicationContext.getResources().getStringArray(iY3);
            String[] stringArray2 = applicationContext.getResources().getStringArray(iY4);
            String[] stringArray3 = applicationContext.getResources().getStringArray(iY5);
            if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
                crashlyticsCore = crashlyticsCore3;
                crashlyticsWorkers = crashlyticsWorkers2;
                String str11 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str11, null);
                }
            } else {
                int i7 = 0;
                while (i7 < stringArray3.length) {
                    int i8 = i7;
                    arrayList2.add(new jk(stringArray[i8], stringArray2[i8], stringArray3[i8]));
                    i7 = i8 + 1;
                    crashlyticsCore3 = crashlyticsCore3;
                    crashlyticsWorkers2 = crashlyticsWorkers2;
                }
                crashlyticsCore = crashlyticsCore3;
                crashlyticsWorkers = crashlyticsWorkers2;
            }
            i = 3;
            String packageName3 = applicationContext.getPackageName();
            String strD3 = idManager.d();
            packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName3, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                string2 = Long.toString(packageInfo.getLongVersionCode());
            } else {
                string2 = Integer.toString(packageInfo.versionCode);
            }
            String str12 = string2;
            str = packageInfo.versionName;
            if (str == null) {
                str = "0.0";
            }
            String str13 = str;
            appData = new AppData(applicationId, string, arrayList2, strD3, packageName3, str12, str13, uf1Var);
            strY2 = n30.y("Installer package name is: ", strD3);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strY2, null);
            }
            k92 k92Var2 = new k92(12);
            strD = idManager.d();
            uf0 uf0Var2 = new uf0(15);
            x41 x41Var2 = new x41(uf0Var2, 23);
            xn xnVar2 = new xn(fileStore);
            Locale locale2 = Locale.US;
            tx txVar2 = new tx(pv1.n("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", applicationId, "/settings"), k92Var2);
            String str14 = Build.MANUFACTURER;
            String str15 = IdManager.h;
            String strI2 = h50.i(str14.replaceAll(str15, ""), "/", Build.MODEL.replaceAll(str15, ""));
            String strReplaceAll3 = Build.VERSION.INCREMENTAL.replaceAll(str15, "");
            String strReplaceAll4 = Build.VERSION.RELEASE.replaceAll(str15, "");
            iY = uu.y(applicationContext, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (iY == 0) {
                iY = uu.y(applicationContext, "com.crashlytics.android.build_id", "string");
            }
            if (iY != 0) {
                string3 = applicationContext.getResources().getString(iY);
            } else {
                string3 = null;
            }
            strArr = new String[]{string3, applicationId, str13, str12};
            arrayList = new ArrayList();
            i3 = 0;
            while (true) {
                i4 = 4;
                if (i3 < 4) {
                    break;
                    break;
                }
                str2 = strArr[i3];
                if (str2 != null) {
                    arrayList.add(str2.replace("-", "").toLowerCase(Locale.US));
                }
                i3++;
            }
            Collections.sort(arrayList);
            sb = new StringBuilder();
            size2 = arrayList.size();
            i5 = 0;
            while (i5 < size2) {
                Object obj3 = arrayList.get(i5);
                i5++;
                sb.append((String) obj3);
            }
            string4 = sb.toString();
            if (string4.length() > 0) {
                strM = uu.M(string4);
            } else {
                strM = null;
            }
            if (strD == null) {
                i4 = 1;
            }
            jd2 jd2Var2 = new jd2(applicationId, strI2, strReplaceAll3, strReplaceAll4, idManager, strM, str13, str12, n30.a(i4));
            nfVar = new nf();
            AtomicReference atomicReference4 = new AtomicReference();
            nfVar.h = atomicReference4;
            nfVar.i = new AtomicReference(new TaskCompletionSource());
            nfVar.a = applicationContext;
            nfVar.b = jd2Var2;
            nfVar.d = uf0Var2;
            nfVar.c = x41Var2;
            nfVar.e = xnVar2;
            nfVar.f = txVar2;
            nfVar.g = dataCollectionArbiter;
            atomicReference4.set(k92.g(uf0Var2));
            atomicReference = (AtomicReference) nfVar.i;
            atomicReference2 = (AtomicReference) nfVar.h;
            if (!((Context) nfVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals((String) ((jd2) nfVar.b).f)) {
                oc2VarF = nfVar.f(3);
                if (oc2VarF != null) {
                    atomicReference2.set(oc2VarF);
                    ((TaskCompletionSource) atomicReference.get()).trySetResult(oc2VarF);
                }
                CrashlyticsWorkers crashlyticsWorkers4 = crashlyticsWorkers;
                taskOnSuccessTask = ((DataCollectionArbiter) nfVar.g).waitForDataCollectionPermission().onSuccessTask(crashlyticsWorkers4.a, new uf1(25, nfVar, crashlyticsWorkers4));
            } else {
                oc2VarF = nfVar.f(3);
                if (oc2VarF != null) {
                    atomicReference2.set(oc2VarF);
                    ((TaskCompletionSource) atomicReference.get()).trySetResult(oc2VarF);
                }
                CrashlyticsWorkers crashlyticsWorkers5 = crashlyticsWorkers;
                taskOnSuccessTask = ((DataCollectionArbiter) nfVar.g).waitForDataCollectionPermission().onSuccessTask(crashlyticsWorkers5.a, new uf1(25, nfVar, crashlyticsWorkers5));
            }
            taskOnSuccessTask.addOnFailureListener(executorService3, new wb0(24));
            crashlyticsCore2 = crashlyticsCore;
            if (crashlyticsCore2.onPreExecute(appData, nfVar)) {
                crashlyticsCore2.doBackgroundInitializationAsync(nfVar);
            }
            return new FirebaseCrashlytics(crashlyticsCore2);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e);
            return null;
        }
        th = null;
        strY = n30.y("Mapping file ID is: ", string);
        if (Log.isLoggable("FirebaseCrashlytics", i)) {
            Log.d("FirebaseCrashlytics", strY, th);
        }
        size = arrayList2.size();
        i2 = 0;
        while (i2 < size) {
            Object obj4 = arrayList2.get(i2);
            i2++;
            jk jkVar2 = (jk) obj4;
            String str16 = jkVar2.a;
            String str17 = jkVar2.b;
            String str18 = jkVar2.c;
            int i9 = size;
            StringBuilder sbR2 = pv1.r("Build id for ", str16, " on ", str17, ": ");
            sbR2.append(str18);
            string5 = sbR2.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string5, null);
            }
            size = i9;
        }
        uf1 uf1Var2 = new uf1(applicationContext, false, 11);
    }

    public void setCrashlyticsCollectionEnabled(@Nullable Boolean bool) {
        this.core.setCrashlyticsCollectionEnabled(bool);
    }

    public void setCustomKey(@NonNull String str, double d) {
        this.core.setCustomKey(str, Double.toString(d));
    }

    public void setCustomKey(@NonNull String str, float f) {
        this.core.setCustomKey(str, Float.toString(f));
    }

    public void setCustomKey(@NonNull String str, int i) {
        this.core.setCustomKey(str, Integer.toString(i));
    }

    public void setCustomKey(@NonNull String str, long j) {
        this.core.setCustomKey(str, Long.toString(j));
    }

    public void setCustomKey(@NonNull String str, @NonNull String str2) {
        this.core.setCustomKey(str, str2);
    }

    public void recordException(@NonNull Throwable th) {
        if (th == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
        } else {
            this.core.logException(th, Collections.EMPTY_MAP);
        }
    }
}
