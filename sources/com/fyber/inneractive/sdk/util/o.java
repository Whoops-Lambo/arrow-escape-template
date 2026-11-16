package com.fyber.inneractive.sdk.util;

import android.app.Application;
import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4664b4;
import com.vungle.ads.internal.protos.Sdk;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class o {
    public static Application a;

    public static int d() {
        int i;
        WindowManager windowManager;
        Display defaultDisplay;
        try {
            if (a == null || (windowManager = (WindowManager) IAConfigManager.Q.v.a().getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
                i = -1;
            } else {
                Point point = new Point();
                defaultDisplay.getSize(point);
                i = point.x;
            }
        } catch (Throwable unused) {
        }
        if (i != -1) {
            return i;
        }
        try {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics != null) {
                i = displayMetrics.widthPixels;
            }
        } catch (Throwable unused2) {
        }
        return i == -1 ? Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE : i;
    }

    public static String e() {
        IAConfigManager iAConfigManager;
        int i = 0;
        while (true) {
            iAConfigManager = IAConfigManager.Q;
            if (!iAConfigManager.y.a.get() || iAConfigManager.y.d.compareAndSet(true, true) || i >= 25) {
                break;
            }
            IAlog.a("UserAgentProvider | waiting on user agent", new Object[0]);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            i++;
        }
        return iAConfigManager.y.a();
    }

    public static String b(String str) {
        String string = (String) n.a.get(str);
        if (!TextUtils.isEmpty(string)) {
            IAlog.a("Assets cache: returning cached assets for %s", str);
            return string;
        }
        IAlog.a("Assets cache: reading file: %s", str);
        try {
            InputStream inputStreamOpen = a.getAssets().open(str, 3);
            StringBuffer stringBuffer = new StringBuffer();
            byte[] bArr = new byte[4096];
            for (int i = 0; i != -1; i = inputStreamOpen.read(bArr)) {
                stringBuffer.append(new String(bArr, 0, i));
            }
            inputStreamOpen.close();
            string = stringBuffer.toString();
            IAlog.a("Assets cache: success - %s", str);
        } catch (IOException e) {
            IAlog.a("Assets cache: Could not read response from file", new Object[0]);
            IAlog.e(v.b(e), new Object[0]);
        }
        if (!TextUtils.isEmpty(string)) {
            n.a.put(str, string);
        }
        return string;
    }

    public static int c() {
        int i;
        WindowManager windowManager;
        Display defaultDisplay;
        if (a == null || (windowManager = (WindowManager) IAConfigManager.Q.v.a().getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            i = -1;
        } else {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.y;
        }
        if (i != -1) {
            return i;
        }
        try {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics != null) {
                i = displayMetrics.heightPixels;
            }
        } catch (Throwable unused) {
        }
        if (i == -1) {
            return 480;
        }
        return i;
    }

    public static void a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (i == 17) {
                layoutParams2.addRule(13);
            } else {
                int i2 = i & 7;
                if (i2 != 1) {
                    if (i2 != 3) {
                        if (i2 == 5) {
                            layoutParams2.addRule(11);
                        }
                    } else {
                        layoutParams2.addRule(9);
                    }
                } else {
                    layoutParams2.addRule(14);
                }
                int i3 = i & 112;
                if (i3 != 16) {
                    if (i3 != 48) {
                        if (i3 == 80) {
                            layoutParams2.addRule(12);
                        }
                    } else {
                        layoutParams2.addRule(10);
                    }
                } else {
                    layoutParams2.addRule(15);
                }
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public static int c(int i) {
        try {
            return (int) ((i / (IAConfigManager.Q.v.a().getResources().getConfiguration().densityDpi / 160.0f)) + 0.5f);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static Drawable d(int i) {
        return IAConfigManager.Q.v.a().getDrawable(i);
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static int a(int i) {
        return Math.round(((IAConfigManager.Q.v.a().getResources().getConfiguration().densityDpi / 160.0f) * i) + 0.5f);
    }

    public static int a() {
        return ((WindowManager) IAConfigManager.Q.v.a().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static int a(float f) {
        return (int) (TypedValue.applyDimension(1, f, IAConfigManager.Q.v.a().getResources().getDisplayMetrics()) + 0.5f);
    }

    public static String a(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) ",");
                }
            }
            return sb.toString();
        }
        return TextUtils.join(",", arrayList);
    }

    public static int b() {
        Application application = a;
        int i = (application == null || application.getResources() == null || application.getResources().getConfiguration() == null) ? 1 : application.getResources().getConfiguration().orientation;
        try {
            if (Settings.System.getInt(application.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                i = 1;
            }
        } catch (Throwable th) {
            IAlog.a("failed getOrientation. returning portrait orientation", th, new Object[0]);
        }
        IAlog.a("The device orientation: %s", i == 1 ? C4664b4.i.D : C4664b4.i.C);
        return i;
    }

    public static void a(Context context, byte[] bArr) {
        FileOutputStream fileOutputStreamOpenFileOutput;
        try {
            fileOutputStreamOpenFileOutput = context.openFileOutput("session_details.json", 0);
            try {
                fileOutputStreamOpenFileOutput.write(bArr);
                fileOutputStreamOpenFileOutput.flush();
            } catch (Throwable unused) {
                try {
                    IAlog.a("writeFileWithContext failed writing %s", "session_details.json");
                } finally {
                    v.a(fileOutputStreamOpenFileOutput);
                }
            }
        } catch (Throwable unused2) {
            fileOutputStreamOpenFileOutput = null;
        }
    }

    public static int b(int i) {
        return (int) (((IAConfigManager.Q.v.a().getResources().getConfiguration().densityDpi / 160.0f) * i) + 0.5f);
    }

    public static String a(Context context) {
        if (context != null) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr.length > 0) {
                    Signature signature = signatureArr[0];
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(signature.toByteArray());
                    byte[] bArrDigest = messageDigest.digest();
                    StringBuilder sb = new StringBuilder();
                    for (byte b : bArrDigest) {
                        String hexString = Integer.toHexString(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                        if (hexString.length() == 1) {
                            sb.append("0");
                        }
                        sb.append(hexString);
                    }
                    return sb.toString();
                }
                return "";
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static boolean a(String str) {
        try {
            return a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
        }
    }

    public static Context a(View view) {
        if (view != null) {
            return view.getContext();
        }
        return a;
    }

    public static void a(FrameLayout frameLayout) {
        if (Build.VERSION.SDK_INT >= 35) {
            frameLayout.setOnApplyWindowInsetsListener(new m());
        }
    }
}
