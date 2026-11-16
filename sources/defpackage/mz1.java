package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.profileinstaller.ProfileInstaller;
import com.adsurge.adn.D1.d;
import com.applovin.impl.i1;
import com.tiktok.appevents.TTIdentifierFactory;
import com.unity.androidnotifications.UnityNotificationManager;
import com.unity.androidnotifications.UnityNotificationRestartReceiver;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mz1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ mz1(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new mz1(context, 1));
                break;
            case 1:
                ProfileInstaller.b(context, new b8(1), ProfileInstaller.a, false);
                break;
            case 2:
                TTIdentifierFactory.lambda$updateAdIdInfo$0(context);
                break;
            case 3:
                int i2 = UnityNotificationRestartReceiver.a;
                UnityNotificationManager unityNotificationManagerG = UnityNotificationManager.g(context);
                ArrayList arrayListK = unityNotificationManagerG.k();
                Date time = Calendar.getInstance().getTime();
                int size = arrayListK.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    Notification.Builder builder = (Notification.Builder) arrayListK.get(i3);
                    try {
                        Bundle extras = builder.getExtras();
                        long j = extras.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, 0L);
                        long j2 = extras.getLong(UnityNotificationManager.KEY_FIRE_TIME, 0L);
                        Date date = new Date(j2);
                        boolean z = j > 0;
                        if (date.after(time) || z) {
                            long j3 = builder.getExtras().getLong(UnityNotificationManager.KEY_FIRE_TIME, 0L);
                            Intent intent = new Intent(unityNotificationManagerG.a, (Class<?>) UnityNotificationManager.class);
                            intent.setFlags(268468224);
                            unityNotificationManagerG.q(builder, intent, j3);
                        } else if (time.getTime() - j2 < 600000) {
                            unityNotificationManagerG.m(builder, extras.getInt("id"));
                        } else {
                            Log.d("UnityNotifications", "Notification expired, not rescheduling, ID: " + extras.getInt("id", -1));
                        }
                    } catch (Exception e) {
                        Log.e("UnityNotifications", "Failed to reschedule notification", e);
                    }
                    i3 = i4;
                }
                break;
            case 4:
                d.b(context);
                break;
            default:
                i1.b(context);
                break;
        }
    }
}
