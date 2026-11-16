package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p003activity.result.ActivityResultLauncher;
import androidx.p003activity.result.IntentSenderRequest;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.service.zas;
import com.google.android.gms.common.internal.zad;
import com.google.android.gms.common.internal.zak;
import com.google.android.gms.common.internal.zao;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zan;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.services.UnityAdsConstants;
import defpackage.pv1;
import defpackage.z30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    @NonNull
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Nullable
    private static volatile Boolean zab;

    @GuardedBy
    private String zad;

    @Nullable
    private zad zae;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zac = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    @Nullable
    public final Dialog zaa(@NonNull Context context, int i, @Nullable zao zaoVar, @Nullable DialogInterface.OnCancelListener onCancelListener, @Nullable DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2 = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(zak.zac(context, i));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String strZae = zak.zae(context, i);
        DialogInterface.OnClickListener onClickListener2 = zaoVar;
        if (strZae != null) {
            if (zaoVar == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strZae, onClickListener2);
        }
        String strZaa = zak.zaa(context, i);
        if (strZaa != null) {
            builder2.setTitle(strZaa);
        }
        Log.w("GoogleApiAvailability", pv1.k(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder2.create();
    }

    @NonNull
    public static GoogleApiAvailability getInstance() {
        return zac;
    }

    @NonNull
    public Task<Void> checkApiAvailability(@NonNull Executor executor, @NonNull HasApiKey<?> hasApiKey, @NonNull HasApiKey<?>... hasApiKeyArr) {
        Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (HasApiKey<?> hasApiKey2 : hasApiKeyArr) {
            Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zab().zah(arrayList).onSuccessTask(executor, zab.zaa);
    }

    @Nullable
    public Dialog getErrorDialog(@NonNull Fragment fragment, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i, zao.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i, "d"), i2), onCancelListener, null);
    }

    @NonNull
    @MainThread
    public Task<Void> makeGooglePlayServicesAvailable(@NonNull Activity activity) {
        int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i);
        if (iIsGooglePlayServicesAvailable == 0) {
            return Tasks.forResult(null);
        }
        zabw zabwVarZaa = zabw.zaa(activity);
        zabwVarZaa.zaf(new ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        return zabwVarZaa.zab();
    }

    public boolean showErrorDialogFragment(@NonNull Activity activity, int i, @NonNull ActivityResultLauncher<IntentSenderRequest> activityResultLauncher, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i, null, onCancelListener, new zaa(this, activity, i, activityResultLauncher));
        if (dialogZaa == null) {
            return false;
        }
        zah(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zab(@NonNull Activity activity, @NonNull LifecycleFragment lifecycleFragment, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i, zao.zad(lifecycleFragment, getErrorResolutionIntent(activity, i, "d"), 2), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        zah(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @NonNull
    public final Dialog zaf(@NonNull Activity activity, @NonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(zak.zac(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        zah(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @Nullable
    public final zabr zag(Context context, zabq zabqVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabr zabrVar = new zabr(zabqVar);
        ContextCompat.d(context, zabrVar, intentFilter, null);
        zabrVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabrVar;
        }
        zabqVar.zaa();
        zabrVar.zab();
        return null;
    }

    public final void zah(Activity activity, Dialog dialog, String str, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void zai(Context context) {
        new zac(this, context).sendEmptyMessageDelayed(1, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    public final boolean zaj(int i) {
        if (i == 9) {
            return true;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i) {
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(@NonNull Context context) {
        return super.getClientVersion(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @Nullable
    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(@Nullable Context context, int i, @Nullable String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    @Nullable
    public PendingIntent getErrorResolutionPendingIntent(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        if (connectionResult.hasResolution()) {
            return connectionResult.getResolution();
        }
        return getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @NonNull
    public final String getErrorString(int i) {
        return super.getErrorString(i);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @HideFirstParty
    public int isGooglePlayServicesAvailable(@NonNull Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(@NonNull Context context, @NonNull String str) {
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkNotNull(((NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zad = str;
        }
    }

    public void showErrorNotification(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        zac(context, new ConnectionResult(connectionResult.getErrorCode(), getErrorResolutionPendingIntent(context, connectionResult), connectionResult.getErrorMessage(), connectionResult.getClientMethodKey()), null);
    }

    public final void zac(Context context, ConnectionResult connectionResult, @Nullable String str) {
        int i;
        String str2;
        int errorCode = connectionResult.getErrorCode();
        Object obj = zaa;
        synchronized (obj) {
            try {
                if (zab == null) {
                    zab = Boolean.valueOf(ClientLibraryUtils.isPackageSide());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!zab.booleanValue()) {
            Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, methodKey=%d, tag=%s", Integer.valueOf(connectionResult.getErrorCode()), connectionResult.getClientMethodKey(), null), new IllegalArgumentException());
            if (errorCode == 18) {
                zai(context);
                return;
            }
            PendingIntent resolution = connectionResult.getResolution();
            if (resolution == null) {
                if (errorCode == 6) {
                    Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                    return;
                }
                return;
            }
            String strZab = zak.zab(context, errorCode);
            String strZad = zak.zad(context, errorCode);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"));
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, null);
            builder.r = true;
            builder.c(16, true);
            builder.e = NotificationCompat.Builder.b(strZab);
            NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
            bigTextStyle.b = NotificationCompat.Builder.b(strZad);
            builder.d(bigTextStyle);
            boolean zIsWearable = DeviceProperties.isWearable(context);
            int i2 = android.R.drawable.stat_sys_warning;
            if (zIsWearable) {
                int i3 = context.getApplicationInfo().icon;
                if (i3 != 0) {
                    i2 = i3;
                }
                builder.B.icon = i2;
                builder.i = 2;
                if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                    builder.b.add(new NotificationCompat.Action(com.ecffri.arrows.R.drawable.common_full_open_on_phone, resources.getString(com.ecffri.arrows.R.string.common_open_on_phone), resolution));
                } else {
                    builder.g = resolution;
                }
            } else {
                builder.B.icon = android.R.drawable.stat_sys_warning;
                String string = resources.getString(com.ecffri.arrows.R.string.common_google_play_services_notification_ticker);
                builder.B.tickerText = NotificationCompat.Builder.b(string);
                builder.B.when = System.currentTimeMillis();
                builder.g = resolution;
                builder.f = NotificationCompat.Builder.b(strZad);
            }
            if (PlatformVersion.isAtLeastO()) {
                Preconditions.checkState(PlatformVersion.isAtLeastO());
                synchronized (obj) {
                    str2 = this.zad;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String string2 = context.getResources().getString(com.ecffri.arrows.R.string.common_google_play_services_notification_channel_name);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(z30.d(string2));
                    } else if (!string2.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                builder.x = str2;
            }
            Notification notificationA = builder.a();
            if (errorCode != 1 && errorCode != 2 && errorCode != 3 && errorCode != 21) {
                i = 39789;
            } else {
                GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
                i = 10436;
            }
            notificationManager.notify(i, notificationA);
            zae(context, connectionResult, false);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(errorCode).length() + 54);
        sb.append("Suppressing show error notification for package side: ");
        sb.append(errorCode);
        Log.w("GoogleApiAvailability", sb.toString());
    }

    public final boolean zad(@NonNull Context context, @NonNull ConnectionResult connectionResult, int i) {
        PendingIntent errorResolutionPendingIntent;
        if (InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zac(context, new ConnectionResult(connectionResult.getErrorCode(), PendingIntent.getActivity(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i, true), zan.a | 134217728), connectionResult.getErrorMessage(), connectionResult.getClientMethodKey()), null);
        return true;
    }

    public final void zae(@NonNull Context context, @NonNull ConnectionResult connectionResult, boolean z) {
        int iIntValue;
        Integer clientMethodKey = connectionResult.getClientMethodKey();
        if (clientMethodKey == null) {
            iIntValue = -1;
        } else {
            iIntValue = clientMethodKey.intValue();
        }
        com.google.android.gms.common.internal.zab zabVar = new com.google.android.gms.common.internal.zab(iIntValue, context.getPackageName(), System.currentTimeMillis(), connectionResult.getErrorCode(), z);
        if (this.zae == null) {
            this.zae = new zas(context);
        }
        this.zae.zaa(zabVar);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(@NonNull Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @Nullable
    public PendingIntent getErrorResolutionPendingIntent(@NonNull Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    public boolean showErrorDialogFragment(@NonNull Activity activity, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zah(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public void showErrorNotification(@NonNull Context context, int i) {
        zac(context, new ConnectionResult(i, getErrorResolutionPendingIntent(context, i, 0, "n")), null);
    }

    @Nullable
    public Dialog getErrorDialog(@NonNull Activity activity, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i, zao.zab(activity, getErrorResolutionIntent(activity, i, "d"), i2), onCancelListener, null);
    }

    public boolean showErrorDialogFragment(@NonNull Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    @Nullable
    public Dialog getErrorDialog(@NonNull Fragment fragment, int i, int i2) {
        return getErrorDialog(fragment, i, i2, (DialogInterface.OnCancelListener) null);
    }

    @Nullable
    public Dialog getErrorDialog(@NonNull Activity activity, int i, int i2) {
        return getErrorDialog(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    @NonNull
    public Task<Void> checkApiAvailability(@NonNull HasApiKey<?> hasApiKey, @NonNull HasApiKey<?>... hasApiKeyArr) {
        return checkApiAvailability(TaskExecutors.MAIN_THREAD, hasApiKey, hasApiKeyArr);
    }

    @NonNull
    public Task<Void> checkApiAvailability(@NonNull GoogleApi<?> googleApi, @NonNull GoogleApi<?>... googleApiArr) {
        return checkApiAvailability(TaskExecutors.MAIN_THREAD, googleApi, googleApiArr);
    }
}
