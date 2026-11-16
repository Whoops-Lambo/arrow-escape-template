package com.unity.androidnotifications;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.C;
import com.google.android.gms.ads.AdError;
import com.safedk.android.utils.Logger;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import defpackage.n30;
import defpackage.ok2;
import defpackage.pz2;
import defpackage.qp1;
import defpackage.qz2;
import defpackage.rz2;
import defpackage.sz2;
import defpackage.uz2;
import defpackage.vz2;
import defpackage.wz2;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedTransferQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class UnityNotificationManager extends BroadcastReceiver {
    public static final String KEY_BIG_CONTENT_DESCRIPTION = "com.unity.BigContentDescription";
    public static final String KEY_BIG_CONTENT_TITLE = "com.unity.BigContentTytle";
    public static final String KEY_BIG_LARGE_ICON = "com.unity.BigLargeIcon";
    public static final String KEY_BIG_PICTURE = "com.unity.BigPicture";
    public static final String KEY_BIG_SHOW_WHEN_COLLAPSED = "com.unity.BigShowWhenCollapsed";
    public static final String KEY_BIG_SUMMARY_TEXT = "com.unity.BigSummaryText";
    public static final String KEY_CHANNEL_ID = "channelID";
    public static final String KEY_FIRE_TIME = "fireTime";
    public static final String KEY_ID = "id";
    public static final String KEY_INTENT_DATA = "data";
    public static final String KEY_LARGE_ICON = "largeIcon";
    public static final String KEY_NOTIFICATION = "unityNotification";
    public static final String KEY_NOTIFICATION_ID = "com.unity.NotificationID";
    public static final String KEY_REPEAT_INTERVAL = "repeatInterval";
    public static final String KEY_SHOW_IN_FOREGROUND = "com.unity.showInForeground";
    public static final String KEY_SMALL_ICON = "smallIcon";
    public static UnityNotificationManager i;
    public uz2 d;
    public Random e;
    public ConcurrentHashMap f;
    public NotificationCallback g;
    public Context a = null;
    public Activity b = null;
    public Class c = null;
    public int h = -1;

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public final synchronized void d(String str) {
        this.a.getSharedPreferences(i(str), 0).edit().clear().apply();
    }

    public final Parcelable f(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                return BitmapFactory.decodeFile(str);
            }
            Icon iconCreateWithContentUri = (!str.isEmpty() && str.indexOf("://") > 0) ? Icon.createWithContentUri(str) : null;
            if (iconCreateWithContentUri != null) {
                return iconCreateWithContentUri;
            }
            int iQ = wz2.Q(this.a, str);
            if (iQ != 0) {
                return Icon.createWithResource(this.a, iQ);
            }
        }
        return null;
    }

    public final synchronized ArrayList k() {
        Set<String> stringSet;
        try {
            synchronized (this) {
                stringSet = this.a.getSharedPreferences("UNITY_STORED_NOTIFICATION_IDS", 0).getStringSet("UNITY_NOTIFICATION_IDS", new HashSet());
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        ArrayList arrayList = new ArrayList();
        HashSet<String> hashSet = new HashSet();
        for (String str : stringSet) {
            Object objM = wz2.M(this.a, this.a.getSharedPreferences(i(str), 0));
            Notification.Builder builderS = objM != null ? objM instanceof Notification.Builder ? (Notification.Builder) objM : wz2.S(this.a, (Notification) objM) : null;
            if (builderS != null) {
                arrayList.add(builderS);
            } else {
                hashSet.add(str);
            }
        }
        if (!hashSet.isEmpty()) {
            HashSet hashSet2 = new HashSet(stringSet);
            for (String str2 : hashSet) {
                hashSet2.remove(str2);
                d(str2);
            }
            p(hashSet2);
        }
        return arrayList;
    }

    public final synchronized void p(HashSet hashSet) {
        SharedPreferences.Editor editorClear = this.a.getSharedPreferences("UNITY_STORED_NOTIFICATION_IDS", 0).edit().clear();
        editorClear.putStringSet("UNITY_NOTIFICATION_IDS", hashSet);
        editorClear.apply();
    }

    public static synchronized UnityNotificationManager g(Context context) {
        try {
            if (i == null) {
                UnityNotificationManager unityNotificationManager = new UnityNotificationManager();
                i = unityNotificationManager;
                unityNotificationManager.f = new ConcurrentHashMap();
            }
            i.a = context.getApplicationContext();
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public static String getNotificationChannelId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    public static Integer getNotificationColor(Notification notification) {
        if (Build.VERSION.SDK_INT < 26 || notification.extras.containsKey(NotificationCompat.EXTRA_COLORIZED)) {
            return Integer.valueOf(notification.color);
        }
        return null;
    }

    public static int getNotificationGroupAlertBehavior(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    public static synchronized UnityNotificationManager getNotificationManagerImpl(Activity activity, NotificationCallback notificationCallback) {
        try {
            if (i == null) {
                i = new UnityNotificationManager();
            }
            i.j(activity, notificationCallback);
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public static Object h(Intent intent) {
        if (intent.hasExtra(KEY_NOTIFICATION_ID)) {
            return Integer.valueOf(intent.getExtras().getInt(KEY_NOTIFICATION_ID));
        }
        if (intent.hasExtra(KEY_NOTIFICATION)) {
            return intent.getParcelableExtra(KEY_NOTIFICATION);
        }
        return null;
    }

    public static String i(String str) {
        return n30.y("u_notification_data_", str);
    }

    public static void setNotificationColor(Notification.Builder builder, int i2) {
        if (i2 != 0) {
            builder.setColor(i2);
            if (Build.VERSION.SDK_INT >= 26) {
                builder.setColorized(true);
            }
        }
    }

    public static void setNotificationGroupAlertBehavior(Notification.Builder builder, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setGroupAlertBehavior(i2);
        }
    }

    public static void setNotificationIcon(Notification.Builder builder, String str, String str2) {
        if (str2 == null || (str2.isEmpty() && builder.getExtras().getString(str) != null)) {
            builder.getExtras().remove(str);
        } else {
            builder.getExtras().putString(str, str2);
        }
    }

    @TargetApi(24)
    public int areNotificationsEnabled() {
        boolean z = Build.VERSION.SDK_INT < 33 || this.a.checkCallingOrSelfPermission("android.permission.POST_NOTIFICATIONS") == 0;
        boolean zAreNotificationsEnabled = getNotificationManager().areNotificationsEnabled();
        if (z) {
            return zAreNotificationsEnabled ? 1 : 5;
        }
        return 2;
    }

    public final boolean b(AlarmManager alarmManager) {
        Bundle bundle;
        if (this.h < 0) {
            try {
                bundle = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                this.h = bundle.getInt("com.unity.androidnotifications.exact_scheduling", 1);
            }
        }
        if (this.h == 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        return alarmManager.canScheduleExactAlarms();
    }

    public final void c(int i2) {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.a, i2, new Intent(this.a, (Class<?>) UnityNotificationManager.class), 603979776);
        if (broadcast != null) {
            ((AlarmManager) this.a.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(broadcast);
            broadcast.cancel();
        }
    }

    public boolean canScheduleExactAlarms() {
        return b((AlarmManager) this.a.getSystemService(NotificationCompat.CATEGORY_ALARM));
    }

    public void cancelAllPendingNotificationIntents() {
        this.d.a.add(new pz2());
    }

    public void cancelPendingNotification(int i2) {
        LinkedTransferQueue linkedTransferQueue = this.d.a;
        qz2 qz2Var = new qz2();
        qz2Var.a = i2;
        linkedTransferQueue.add(qz2Var);
    }

    public boolean checkIfPendingNotificationIsRegistered(int i2) {
        return PendingIntent.getBroadcast(this.a, i2, new Intent(this.b, (Class<?>) UnityNotificationManager.class), 603979776) != null;
    }

    public Notification.Builder createNotificationBuilder(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return vz2.c(this.a, str);
        }
        Notification.Builder builder = new Notification.Builder(this.a);
        NotificationChannelWrapper notificationChannel = getNotificationChannel(str);
        long[] jArr = notificationChannel.vibrationPattern;
        int i2 = -1;
        if (jArr == null || jArr.length <= 0) {
            builder.setDefaults(-1);
        } else {
            builder.setDefaults(5);
            builder.setVibrate(notificationChannel.vibrationPattern);
        }
        builder.setVisibility(notificationChannel.lockscreenVisibility);
        int i3 = notificationChannel.importance;
        if (i3 == 0) {
            i2 = -2;
        } else if (i3 != 2) {
            i2 = (i3 == 3 || i3 != 4) ? 0 : 2;
        }
        builder.setPriority(i2);
        builder.getExtras().putString(KEY_CHANNEL_ID, str);
        return builder;
    }

    public void deleteNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            getNotificationManager().deleteNotificationChannel(str);
            return;
        }
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("UNITY_NOTIFICATIONS", 0);
        Set<String> stringSet = sharedPreferences.getStringSet("ChannelIDs", new HashSet());
        if (stringSet.contains(str)) {
            HashSet hashSet = new HashSet(stringSet);
            hashSet.remove(str);
            SharedPreferences.Editor editorClear = sharedPreferences.edit().clear();
            editorClear.putStringSet("ChannelIDs", hashSet);
            editorClear.apply();
            this.a.getSharedPreferences("unity_notification_channel_" + str, 0).edit().clear().apply();
        }
    }

    public void deleteNotificationChannelGroup(String str) {
        if (str == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            getNotificationManager().deleteNotificationChannelGroup(str);
            return;
        }
        for (NotificationChannelWrapper notificationChannelWrapper : getNotificationChannels()) {
            if (str.equals(notificationChannelWrapper.group)) {
                deleteNotificationChannel(notificationChannelWrapper.id);
            }
        }
    }

    public final Notification.Builder e(Integer num) throws IOException {
        Object objM = wz2.M(this.a, this.a.getSharedPreferences(i(num.toString()), 0));
        if (objM == null) {
            return null;
        }
        return objM instanceof Notification ? wz2.S(this.a, (Notification) objM) : (Notification.Builder) objM;
    }

    public NotificationChannelWrapper getNotificationChannel(String str) {
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i2 >= 26) {
            NotificationChannel notificationChannel = g(context).getNotificationManager().getNotificationChannel(str);
            if (notificationChannel == null) {
                return null;
            }
            return l(notificationChannel);
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("unity_notification_channel_" + str, 0);
        NotificationChannelWrapper notificationChannelWrapper = new NotificationChannelWrapper();
        notificationChannelWrapper.id = str;
        notificationChannelWrapper.name = sharedPreferences.getString("title", AdError.UNDEFINED_DOMAIN);
        notificationChannelWrapper.importance = sharedPreferences.getInt("importance", 3);
        notificationChannelWrapper.description = sharedPreferences.getString(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION, AdError.UNDEFINED_DOMAIN);
        notificationChannelWrapper.enableLights = sharedPreferences.getBoolean("enableLights", false);
        notificationChannelWrapper.enableVibration = sharedPreferences.getBoolean("enableVibration", false);
        notificationChannelWrapper.canBypassDnd = sharedPreferences.getBoolean("canBypassDnd", false);
        notificationChannelWrapper.canShowBadge = sharedPreferences.getBoolean("canShowBadge", false);
        notificationChannelWrapper.lockscreenVisibility = sharedPreferences.getInt("lockscreenVisibility", 1);
        notificationChannelWrapper.group = sharedPreferences.getString("group", null);
        String[] strArrSplit = sharedPreferences.getString("vibrationPattern", "[]").split(",");
        int length = strArrSplit.length;
        long[] jArr = new long[length];
        if (length > 1) {
            for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                try {
                    jArr[i3] = Long.parseLong(strArrSplit[i3]);
                } catch (NumberFormatException unused) {
                    jArr[i3] = 1;
                }
            }
        }
        notificationChannelWrapper.vibrationPattern = length > 1 ? jArr : null;
        return notificationChannelWrapper;
    }

    public NotificationChannelWrapper[] getNotificationChannels() {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            List notificationChannels = getNotificationManager().getNotificationChannels();
            if (notificationChannels.isEmpty()) {
                return null;
            }
            NotificationChannelWrapper[] notificationChannelWrapperArr = new NotificationChannelWrapper[notificationChannels.size()];
            Iterator it = notificationChannels.iterator();
            while (it.hasNext()) {
                notificationChannelWrapperArr[i2] = l(vz2.d(it.next()));
                i2++;
            }
            return notificationChannelWrapperArr;
        }
        Set<String> stringSet = this.a.getSharedPreferences("UNITY_NOTIFICATIONS", 0).getStringSet("ChannelIDs", new HashSet());
        if (stringSet.isEmpty()) {
            return null;
        }
        NotificationChannelWrapper[] notificationChannelWrapperArr2 = new NotificationChannelWrapper[stringSet.size()];
        Iterator<String> it2 = stringSet.iterator();
        while (it2.hasNext()) {
            notificationChannelWrapperArr2[i2] = getNotificationChannel(it2.next());
            i2++;
        }
        return notificationChannelWrapperArr2;
    }

    public Notification getNotificationFromIntent(Intent intent) {
        if (intent.hasExtra(KEY_NOTIFICATION_ID)) {
            int i2 = intent.getExtras().getInt(KEY_NOTIFICATION_ID);
            for (StatusBarNotification statusBarNotification : getNotificationManager().getActiveNotifications()) {
                if (statusBarNotification.getId() == i2) {
                    return statusBarNotification.getNotification();
                }
            }
        }
        Object objH = h(intent);
        if (objH instanceof Integer) {
            Integer num = (Integer) objH;
            Object obj = this.f.get(num);
            objH = obj == null ? e(num) : obj;
        }
        if (objH == null) {
            return null;
        }
        return objH instanceof Notification ? (Notification) objH : ((Notification.Builder) objH).build();
    }

    public NotificationManager getNotificationManager() {
        return (NotificationManager) this.a.getSystemService("notification");
    }

    public int getTargetSdk() {
        return this.a.getApplicationInfo().targetSdkVersion;
    }

    public final void m(Notification.Builder builder, int i2) {
        Class clsR = this.c;
        if (clsR == null && (clsR = wz2.R(this.a)) == null) {
            Log.e("UnityNotifications", "Activity not found, cannot show notification");
            return;
        }
        Notification notificationA = a(clsR, builder);
        if (notificationA != null) {
            n(notificationA, i2);
        }
    }

    public final void n(Notification notification, int i2) {
        boolean z = notification.extras.getBoolean(KEY_SHOW_IN_FOREGROUND, true);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i3 = runningAppProcessInfo.importance;
        if ((i3 != 100 && i3 != 200) || z) {
            getNotificationManager().notify(i2, notification);
        }
        if (notification.extras.getLong(KEY_REPEAT_INTERVAL, -1L) <= 0) {
            this.f.remove(Integer.valueOf(i2));
            c(i2);
        }
        try {
            NotificationCallback notificationCallback = this.g;
            if (notificationCallback != null) {
                notificationCallback.onSentNotification(notification);
            }
        } catch (RuntimeException unused) {
            Log.w("UnityNotifications", "Can not invoke OnNotificationReceived event when the app is not running!");
        }
    }

    public void registerNotificationChannel(String str, String str2, int i2, String str3, boolean z, boolean z2, boolean z3, boolean z4, long[] jArr, int i3, String str4) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannelD = qp1.d(i2, str, str2);
            notificationChannelD.setDescription(str3);
            notificationChannelD.enableLights(z);
            notificationChannelD.enableVibration(z2);
            notificationChannelD.setBypassDnd(z3);
            notificationChannelD.setShowBadge(z4);
            notificationChannelD.setVibrationPattern(jArr);
            notificationChannelD.setLockscreenVisibility(i3);
            notificationChannelD.setGroup(str4);
            getNotificationManager().createNotificationChannel(notificationChannelD);
            return;
        }
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("UNITY_NOTIFICATIONS", 0);
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet("ChannelIDs", new HashSet()));
        hashSet.add(str);
        SharedPreferences.Editor editorClear = sharedPreferences.edit().clear();
        editorClear.putStringSet("ChannelIDs", hashSet);
        editorClear.apply();
        SharedPreferences.Editor editorEdit = this.a.getSharedPreferences("unity_notification_channel_" + str, 0).edit();
        editorEdit.putString("title", str2);
        editorEdit.putInt("importance", i2);
        editorEdit.putString(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION, str3);
        editorEdit.putBoolean("enableLights", z);
        editorEdit.putBoolean("enableVibration", z2);
        editorEdit.putBoolean("canBypassDnd", z3);
        editorEdit.putBoolean("canShowBadge", z4);
        editorEdit.putString("vibrationPattern", Arrays.toString(jArr));
        editorEdit.putInt("lockscreenVisibility", i3);
        editorEdit.putString("group", str4);
        editorEdit.apply();
    }

    public void registerNotificationChannelGroup(String str, String str2, String str3) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            NotificationChannelGroup notificationChannelGroupE = vz2.e(str, str2);
            if (i2 >= 28) {
                notificationChannelGroupE.setDescription(str3);
            }
            getNotificationManager().createNotificationChannelGroup(notificationChannelGroupE);
        }
    }

    public void showNotificationSettings(String str) {
        Intent intent;
        if (Build.VERSION.SDK_INT < 26) {
            intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.a.getPackageName(), null));
        } else {
            if (str == null || str.isEmpty()) {
                intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            } else {
                Intent intent2 = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                intent2.putExtra("android.provider.extra.CHANNEL_ID", str);
                intent = intent2;
            }
            intent.putExtra("android.provider.extra.APP_PACKAGE", this.a.getPackageName());
        }
        intent.addFlags(268435456);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.b, intent);
    }

    public static NotificationChannelWrapper l(Object obj) {
        NotificationChannel notificationChannelD = vz2.d(obj);
        NotificationChannelWrapper notificationChannelWrapper = new NotificationChannelWrapper();
        notificationChannelWrapper.id = notificationChannelD.getId();
        notificationChannelWrapper.name = notificationChannelD.getName().toString();
        notificationChannelWrapper.importance = notificationChannelD.getImportance();
        notificationChannelWrapper.description = notificationChannelD.getDescription();
        notificationChannelWrapper.enableLights = notificationChannelD.shouldShowLights();
        notificationChannelWrapper.enableVibration = notificationChannelD.shouldVibrate();
        notificationChannelWrapper.canBypassDnd = notificationChannelD.canBypassDnd();
        notificationChannelWrapper.canShowBadge = notificationChannelD.canShowBadge();
        notificationChannelWrapper.vibrationPattern = notificationChannelD.getVibrationPattern();
        notificationChannelWrapper.lockscreenVisibility = notificationChannelD.getLockscreenVisibility();
        notificationChannelWrapper.group = notificationChannelD.getGroup();
        return notificationChannelWrapper;
    }

    public static void setNotificationUsesChronometer(Notification.Builder builder, boolean z) {
        builder.setUsesChronometer(z);
    }

    public final Notification a(Class cls, Notification.Builder builder) {
        Icon iconCreateWithContentUri;
        boolean z;
        Bitmap bitmapDecodeResource;
        Icon iconCreateWithResource;
        int i2 = builder.getExtras().getInt("id", -1);
        Intent intent = new Intent(this.a, (Class<?>) cls);
        intent.addFlags(C.ENCODING_PCM_32BIT);
        intent.putExtra(KEY_NOTIFICATION_ID, i2);
        builder.setContentIntent(PendingIntent.getActivity(this.a, i2, intent, androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON));
        String string = builder.getExtras().getString(KEY_SMALL_ICON);
        Object obj = null;
        Bitmap bitmapDecodeStream = null;
        if (string != null && !string.isEmpty() && string.indexOf("://") > 0) {
            iconCreateWithContentUri = Icon.createWithContentUri(string);
        } else {
            iconCreateWithContentUri = null;
        }
        if (iconCreateWithContentUri != null) {
            builder.setSmallIcon(iconCreateWithContentUri);
        } else {
            int iQ = wz2.Q(this.a, string);
            if (iQ == 0) {
                iQ = this.a.getApplicationInfo().icon;
            }
            builder.setSmallIcon(iQ);
        }
        Parcelable parcelableF = f(builder.getExtras().getString(KEY_LARGE_ICON));
        if (parcelableF != null) {
            if (parcelableF instanceof Icon) {
                builder.setLargeIcon((Icon) parcelableF);
            } else {
                builder.setLargeIcon((Bitmap) parcelableF);
            }
        }
        Bundle extras = builder.getExtras();
        String string2 = extras.getString(KEY_BIG_PICTURE);
        if (string2 != null) {
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            Parcelable parcelableF2 = f(extras.getString(KEY_BIG_LARGE_ICON));
            if (parcelableF2 != null) {
                if (parcelableF2 instanceof Icon) {
                    bigPictureStyle.bigLargeIcon((Icon) parcelableF2);
                } else {
                    bigPictureStyle.bigLargeIcon((Bitmap) parcelableF2);
                }
            }
            if (string2.charAt(0) == '/') {
                bigPictureStyle.bigPicture(BitmapFactory.decodeFile(string2));
            } else if (string2.indexOf("://") > 0) {
                if (Build.VERSION.SDK_INT >= 31) {
                    bigPictureStyle.bigPicture(Icon.createWithContentUri(string2));
                } else {
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(this.a.getContentResolver().openInputStream(Uri.parse(string2)));
                    } catch (Exception e) {
                        Log.e("UnityNotifications", "Failed to load image ".concat(string2), e);
                    }
                    if (bitmapDecodeStream != null) {
                        bigPictureStyle.bigPicture(bitmapDecodeStream);
                    }
                }
            } else {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 31) {
                    z = true;
                } else {
                    z = false;
                }
                int iQ2 = wz2.Q(this.a, string2);
                if (iQ2 != 0) {
                    Context context = this.a;
                    if (!z) {
                        iconCreateWithResource = Icon.createWithResource(context, iQ2);
                    } else {
                        bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), iQ2);
                    }
                }
                if (i3 >= 31 && (obj instanceof Icon)) {
                    obj = bitmapDecodeResource;
                    obj = iconCreateWithResource;
                    bigPictureStyle.bigPicture((Icon) obj);
                } else {
                    obj = bitmapDecodeResource;
                    obj = iconCreateWithResource;
                    obj = bitmapDecodeResource;
                    obj = iconCreateWithResource;
                    if (obj instanceof Bitmap) {
                        bigPictureStyle.bigPicture((Bitmap) obj);
                    }
                }
            }
            bigPictureStyle.setBigContentTitle(extras.getString(KEY_BIG_CONTENT_TITLE));
            bigPictureStyle.setSummaryText(extras.getString(KEY_BIG_SUMMARY_TEXT));
            if (Build.VERSION.SDK_INT >= 31) {
                bigPictureStyle.setContentDescription(extras.getString(KEY_BIG_CONTENT_DESCRIPTION));
                bigPictureStyle.showBigPictureWhenCollapsed(extras.getBoolean(KEY_BIG_SHOW_WHEN_COLLAPSED, false));
            }
            builder.setStyle(bigPictureStyle);
        }
        return builder.build();
    }

    public void cancelAllNotifications() {
        getNotificationManager().cancelAll();
    }

    public void cancelDisplayedNotification(int i2) {
        getNotificationManager().cancel(i2);
    }

    public int checkNotificationStatus(int i2) {
        for (StatusBarNotification statusBarNotification : getNotificationManager().getActiveNotifications()) {
            if (i2 == statusBarNotification.getId()) {
                return 2;
            }
        }
        if (!this.f.containsKey(Integer.valueOf(i2)) && !checkIfPendingNotificationIsRegistered(i2)) {
            return 0;
        }
        return 1;
    }

    public final void j(Activity activity, NotificationCallback notificationCallback) {
        this.a = activity.getApplicationContext();
        this.b = activity;
        this.g = notificationCallback;
        if (this.f == null) {
            this.f = new ConcurrentHashMap();
        }
        uz2 uz2Var = this.d;
        if (uz2Var == null || !uz2Var.isAlive()) {
            ConcurrentHashMap concurrentHashMap = this.f;
            uz2 uz2Var2 = new uz2();
            uz2Var2.a = new LinkedTransferQueue();
            uz2Var2.d = 50;
            uz2Var2.c = this;
            uz2Var2.b = concurrentHashMap;
            if (concurrentHashMap.size() == 0) {
                ArrayList arrayListK = k();
                if (arrayListK.size() != 0) {
                    long time = Calendar.getInstance().getTime().getTime();
                    int size = arrayListK.size();
                    boolean z = false;
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayListK.get(i2);
                        i2++;
                        Notification.Builder builder = (Notification.Builder) obj;
                        Bundle extras = builder.getExtras();
                        int i3 = extras.getInt("id", -1);
                        if (extras.getLong(KEY_FIRE_TIME, -1L) - time > 0) {
                            uz2Var2.b.put(Integer.valueOf(i3), builder);
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        LinkedTransferQueue linkedTransferQueue = uz2Var2.a;
                        rz2 rz2Var = new rz2();
                        rz2Var.a = uz2Var2;
                        linkedTransferQueue.add(rz2Var);
                    }
                }
            }
            this.d = uz2Var2;
        }
        if (this.e == null) {
            this.e = new Random();
        }
        Class clsR = wz2.R(this.a);
        this.c = clsR;
        if (clsR != null) {
            if (!this.d.isAlive()) {
                this.d.start();
                return;
            }
            return;
        }
        y.j("Failed to determine Activity to be opened when tapping notification");
    }

    public final void o(int i2, Notification.Builder builder, boolean z) {
        boolean z2;
        Bundle extras = builder.getExtras();
        long j = extras.getLong(KEY_REPEAT_INTERVAL, -1L);
        long j2 = extras.getLong(KEY_FIRE_TIME, -1L);
        if (j2 - Calendar.getInstance().getTime().getTime() < 1000) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || j > 0) {
            if (z2) {
                j2 += j;
            }
            Intent intent = new Intent(this.a, (Class<?>) UnityNotificationManager.class);
            intent.setFlags(268468224);
            Notification notificationBuild = builder.build();
            synchronized (this) {
                wz2.U(this.a.getSharedPreferences(i(Integer.toString(notificationBuild.extras.getInt("id", -1))), 0), notificationBuild, z);
            }
            q(builder, intent, j2);
        }
        if (z2) {
            n(a(this.c, builder), i2);
        }
    }

    public void onReceive(Intent intent) {
        Object objH = h(intent);
        if (objH == null) {
            return;
        }
        if (objH instanceof Notification) {
            Notification notification = (Notification) objH;
            n(notification, notification.extras.getInt("id", -1));
            return;
        }
        Integer num = (Integer) objH;
        Notification.Builder builder = (Notification.Builder) this.f.get(num);
        if (builder != null) {
            m(builder, num.intValue());
        } else {
            AsyncTask.execute(new ok2(8, this, num));
        }
    }

    public final void q(Notification.Builder builder, Intent intent, long j) {
        Bundle extras = builder.getExtras();
        int i2 = extras.getInt("id", -1);
        long j2 = extras.getLong(KEY_REPEAT_INTERVAL, -1L);
        this.f.put(Integer.valueOf(i2), builder);
        intent.putExtra(KEY_NOTIFICATION_ID, i2);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.a, i2, intent, 201326592);
        AlarmManager alarmManager = (AlarmManager) this.a.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (j2 <= 0) {
            if (b(alarmManager)) {
                alarmManager.setExactAndAllowWhileIdle(0, j, broadcast);
                return;
            } else {
                alarmManager.set(0, j, broadcast);
                return;
            }
        }
        alarmManager.setInexactRepeating(0, j, j2, broadcast);
    }

    public int scheduleNotification(Notification.Builder builder, boolean z) {
        int i2;
        Bundle extras = builder.getExtras();
        boolean z2 = false;
        if (extras.containsKey("id")) {
            i2 = builder.getExtras().getInt("id", -1);
        } else {
            int iNextInt = 0;
            do {
                iNextInt += this.e.nextInt(1000);
            } while (this.f.containsKey(Integer.valueOf(iNextInt)));
            extras.putInt("id", iNextInt);
            i2 = iNextInt;
        }
        if (this.f.putIfAbsent(Integer.valueOf(i2), builder) == null) {
            z2 = true;
        }
        LinkedTransferQueue linkedTransferQueue = this.d.a;
        sz2 sz2Var = new sz2();
        sz2Var.a = i2;
        sz2Var.b = builder;
        sz2Var.c = z;
        sz2Var.d = z2;
        linkedTransferQueue.add(sz2Var);
        return i2;
    }

    public void setupBigPictureStyle(Notification.Builder builder, String str, String str2, String str3, String str4, String str5, boolean z) {
        Bundle extras = builder.getExtras();
        if (str2 != null && !str2.isEmpty()) {
            extras.putString(KEY_BIG_LARGE_ICON, str);
            extras.putString(KEY_BIG_PICTURE, str2);
            extras.putString(KEY_BIG_CONTENT_TITLE, str3);
            extras.putString(KEY_BIG_SUMMARY_TEXT, str5);
            extras.putString(KEY_BIG_CONTENT_DESCRIPTION, str4);
            extras.putBoolean(KEY_BIG_SHOW_WHEN_COLLAPSED, z);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        g(context).onReceive(intent);
    }
}
