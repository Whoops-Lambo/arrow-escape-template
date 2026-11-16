package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.util.Util;
import com.unity3d.services.UnityAdsConstants;
import defpackage.zd0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class DownloadNotificationHelper {

    @StringRes
    private static final int NULL_STRING_ID = 0;
    private final NotificationCompat.Builder notificationBuilder;

    private Notification buildEndStateNotification(Context context, @DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str, @StringRes int i2) {
        return buildNotification(context, i, pendingIntent, str, i2, 0, 0, false, false, true);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    public Notification buildProgressNotification(Context context, @DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str, List<Download> list, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        float percentDownloaded;
        boolean z3;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i7 = 0;
        boolean z9 = true;
        for (int i8 = 0; i8 < list.size(); i8++) {
            Download download = list.get(i8);
            int i9 = download.state;
            if (i9 == 0) {
                z6 = true;
            } else if (i9 == 2) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z9 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z7 |= z3;
                i7++;
                z5 = true;
            } else if (i9 == 5) {
                z8 = true;
            } else if (i9 == 7) {
                percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z9 = false;
                }
                if (download.getBytesDownloaded() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z7 |= z3;
                i7++;
                z5 = true;
            }
        }
        if (!z5) {
            if (!z6 || i2 == 0) {
                if (z8) {
                    i4 = com.google.android.exoplayer2.core.R.string.exo_download_removing;
                } else {
                    i3 = 0;
                }
                z = true;
            } else {
                i3 = (i2 & 2) != 0 ? com.google.android.exoplayer2.core.R.string.exo_download_paused_for_wifi : (i2 & 1) != 0 ? com.google.android.exoplayer2.core.R.string.exo_download_paused_for_network : com.google.android.exoplayer2.core.R.string.exo_download_paused;
                z = false;
            }
            if (z) {
                if (z5) {
                    int i10 = (int) (f / i7);
                    if (z9 && z7) {
                        z4 = true;
                    }
                    i6 = i10;
                    z2 = z4;
                } else {
                    i6 = 0;
                    z2 = true;
                }
                i5 = 100;
            } else {
                i5 = 0;
                i6 = 0;
                z2 = false;
            }
            return buildNotification(context, i, pendingIntent, str, i3, i5, i6, z2, true, false);
        }
        i4 = com.google.android.exoplayer2.core.R.string.exo_download_downloading;
        i3 = i4;
        z = true;
        if (z) {
            if (z5) {
                int i11 = (int) (f / i7);
                if (z9) {
                    z4 = true;
                }
                i6 = i11;
                z2 = z4;
            } else {
                i6 = 0;
                z2 = true;
            }
            i5 = 100;
        } else {
            i5 = 0;
            i6 = 0;
            z2 = false;
        }
        return buildNotification(context, i, pendingIntent, str, i3, i5, i6, z2, true, false);
    }

    private Notification buildNotification(Context context, @DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str, @StringRes int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        NotificationCompat.Builder builder = this.notificationBuilder;
        builder.B.icon = i;
        NotificationCompat.BigTextStyle bigTextStyle = null;
        builder.e = NotificationCompat.Builder.b(i2 == 0 ? null : context.getResources().getString(i2));
        NotificationCompat.Builder builder2 = this.notificationBuilder;
        builder2.g = pendingIntent;
        if (str != null) {
            bigTextStyle = new NotificationCompat.BigTextStyle();
            bigTextStyle.b = NotificationCompat.Builder.b(str);
        }
        builder2.d(bigTextStyle);
        NotificationCompat.Builder builder3 = this.notificationBuilder;
        builder3.n = i3;
        builder3.o = i4;
        builder3.p = z;
        builder3.c(2, z2);
        NotificationCompat.Builder builder4 = this.notificationBuilder;
        builder4.j = z3;
        if (Util.SDK_INT >= 31) {
            zd0.a(builder4);
        }
        return this.notificationBuilder.a();
    }

    public Notification buildDownloadCompletedNotification(Context context, @DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, @DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_failed);
    }

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new NotificationCompat.Builder(context.getApplicationContext(), str);
    }

    @Deprecated
    public Notification buildProgressNotification(Context context, @DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str, List<Download> list) {
        return buildProgressNotification(context, i, pendingIntent, str, list, 0);
    }
}
