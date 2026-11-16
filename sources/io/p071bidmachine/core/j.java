package io.p071bidmachine.core;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import defpackage.jc1;
import io.p071bidmachine.Executable;
import io.p071bidmachine.SimpleContextProvider;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import io.p071bidmachine.util.p;
import io.p071bidmachine.utils.lazy.a;
import java.io.Closeable;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final Handler b;
    public static final a c;
    public static final char[] d;
    public static String e;
    public static String f;

    static {
        "0123456789abcdef".toCharArray();
        d = "0123456789ABCDEF".toCharArray();
        b = new Handler(jc1.h("BackgroundHandlerThread").getLooper());
        c = new a(new e(19));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                a.i(e2);
            }
        }
    }

    public static Float b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        String string = obj.toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(string));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Context c(Context context, View view) {
        Activity activity = new SimpleContextProvider(context).getActivity();
        if (activity != null) {
            return activity;
        }
        if (view == null) {
            return context;
        }
        View viewP = p.p(view);
        return viewP != null ? viewP.getContext() : view.getContext();
    }

    public static void d(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (Exception e2) {
                a.i(e2);
            }
        }
    }

    public static String f(Context context) {
        if (f == null) {
            try {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                if (str != null) {
                    f = str;
                }
            } catch (Exception e2) {
                a.i(e2);
            }
        }
        return f;
    }

    public static ConnectivityManager g(Context context) {
        if (!j(context, "android.permission.ACCESS_NETWORK_STATE")) {
            a.e(new e(18));
            return null;
        }
        try {
            return (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th) {
            a.i(th);
            return null;
        }
    }

    public static void h(Object obj, Executable executable) {
        if (obj != null) {
            executable.execute(obj);
        }
    }

    public static boolean i(String str) {
        return str.startsWith(d.v) || str.startsWith("https://");
    }

    public static HashMap m(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                map.put(next, objOpt.toString());
            }
        }
        return map;
    }

    public static String n(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >>> 4;
            char[] cArr2 = d;
            cArr[i] = cArr2[i3];
            int i4 = i + 2;
            cArr[i + 1] = cArr2[b2 & 15];
            if (i2 < bArr.length - 1) {
                i += 3;
                cArr[i4] = ':';
            } else {
                i = i4;
            }
        }
        return new String(cArr);
    }

    public static String e(String str) {
        byte[] bArrDigest;
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bytes);
            bArrDigest = messageDigest.digest();
        } catch (NoSuchAlgorithmException e2) {
            a.i(e2);
            bArrDigest = null;
        }
        return new BigInteger(bArrDigest).abs().toString(36);
    }

    public static boolean j(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    public static void k(Runnable runnable) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = b;
        if (looperMyLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void l(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }
}
