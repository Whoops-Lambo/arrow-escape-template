package com.adsurge.adn.X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class j {
    public static int a;
    public static int b;
    public static String c;
    public static Boolean d;

    public static boolean d(Context context) {
        ActivityInfo activityInfo;
        if (context == null) {
            return false;
        }
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = context.getApplicationInfo().packageName;
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            try {
                ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0);
                if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
                    boolean zEquals = str.equals(activityInfo.packageName);
                    d = Boolean.valueOf(zEquals);
                    return zEquals;
                }
                d = Boolean.FALSE;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static long a(Context context) {
        if (context == null) {
            return 0L;
        }
        try {
            return new File(context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir).length();
        } catch (Exception e) {
            e.getMessage();
            return 0L;
        }
    }

    public static Bitmap b(Context context) {
        int i;
        if (a <= 0) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null || (i = applicationInfo.icon) <= 0) {
                return null;
            }
            a = i;
        }
        try {
            Drawable drawable = context.getDrawable(a);
            if (drawable == null) {
                a = 0;
                return null;
            }
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(Context context) {
        int i;
        String str = c;
        if (str != null) {
            return str;
        }
        if (b <= 0) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null || (i = applicationInfo.labelRes) <= 0) {
                return null;
            }
            b = i;
        }
        String string = context.getString(b);
        c = string;
        return string;
    }

    public static Integer e() {
        if (com.adsurge.adn.K.b.a("app_support_feature")) {
            return null;
        }
        return Integer.valueOf(com.adsurge.adn.p012c1.c.a() != 3 ? 1 : 0);
    }

    public static boolean e(Context context) {
        return (context == null || (context.getApplicationInfo().flags & 1) == 0) ? false : true;
    }

    public static String c() {
        if (com.adsurge.adn.K.b.a("bundle_name")) {
            return null;
        }
        return com.adsurge.adn.J.a.d().b().a();
    }

    public static String a() {
        if (com.adsurge.adn.K.b.a(MBridgeConstans.APP_ID)) {
            return null;
        }
        return com.adsurge.adn.J.a.d().b().d();
    }

    public static String d() {
        if (com.adsurge.adn.K.b.a("sdk_version")) {
            return null;
        }
        return w.a();
    }

    public static String b() {
        if (com.adsurge.adn.K.b.a("app_version")) {
            return null;
        }
        return com.adsurge.adn.J.a.d().b().c();
    }
}
