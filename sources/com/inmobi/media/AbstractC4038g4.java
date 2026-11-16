package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebResourceResponse;
import android.widget.RelativeLayout;
import com.ironsource.C4664b4;
import defpackage.az2;
import defpackage.c91;
import defpackage.cz;
import defpackage.dk2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.gd1;
import defpackage.kc2;
import defpackage.kk2;
import defpackage.nl0;
import defpackage.rd1;
import defpackage.tb5;
import defpackage.wr0;
import defpackage.wz2;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: renamed from: com.inmobi.media.g4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4038g4 {
    public static final String a(BufferedSource bufferedSource, int i) {
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            if (bufferedSource != null) {
                int i2 = i;
                boolean z = false;
                do {
                    try {
                        String utf8Line = bufferedSource.readUtf8Line();
                        if (utf8Line == null) {
                            break;
                        }
                        if (i > 0 && !z) {
                            sb2.append(utf8Line);
                            sb2.append("\n");
                            i--;
                        }
                        if (kk2.L(utf8Line, "\"main\"", false)) {
                            sb2.setLength(0);
                            z = true;
                        }
                        if (z) {
                            i2--;
                            sb.append(utf8Line);
                            sb.append("\n");
                        }
                        if (dk2.O(utf8Line, "ZygoteInit.java", false)) {
                            break;
                        }
                    } catch (IOException e) {
                        Log.e("CommonExt", "Error reading from input stream", e);
                    }
                } while (i2 > 0);
            }
            if (sb.length() == 0) {
                String string = sb2.toString();
                if (bufferedSource != null) {
                    try {
                        bufferedSource.close();
                    } catch (IOException unused) {
                    }
                }
                return string;
            }
            String string2 = sb.toString();
            if (bufferedSource != null) {
                try {
                    bufferedSource.close();
                } catch (IOException unused2) {
                }
            }
            return string2;
        } catch (Throwable th) {
            if (bufferedSource != null) {
                try {
                    bufferedSource.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public static final int b(float f) {
        try {
            return rd1.p(f);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int c(float f) {
        try {
            return (int) (f / AbstractC4151k6.b());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final WebResourceResponse a(InputStream inputStream, String str) {
        inputStream.getClass();
        str.getClass();
        Map mapSingletonMap = Collections.singletonMap("Access-Control-Allow-Origin", "*");
        mapSingletonMap.getClass();
        Y5.a.getClass();
        if (Y5.x()) {
            return new WebResourceResponse(str, "UTF-8", 200, "OK", mapSingletonMap, inputStream);
        }
        return new WebResourceResponse(str, "UTF-8", inputStream);
    }

    public static final int a(int i) {
        try {
            return (int) (i / AbstractC4151k6.b());
        } catch (Exception unused) {
            return i;
        }
    }

    public static final float a(float f) {
        return b(f * 10.0f) / 10.0f;
    }

    public static final boolean a(String str) {
        return str != null && str.length() > 0;
    }

    public static final boolean a(Context context) {
        int i;
        context.getClass();
        Y5.a.getClass();
        if (Build.VERSION.SDK_INT < 35) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            packageInfo.getClass();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            i = applicationInfo != null ? applicationInfo.targetSdkVersion : -1;
        } catch (Exception unused) {
        }
        return i >= 35;
    }

    public static final void a(Kq kq, RelativeLayout.LayoutParams layoutParams, Hg hg) {
        kq.getClass();
        layoutParams.getClass();
        hg.getClass();
        Jq jq = (Jq) kq.a.get(hg);
        int i = jq != null ? jq.a : 0;
        Jq jq2 = (Jq) kq.a.get(hg);
        int i2 = jq2 != null ? jq2.c : 0;
        Jq jq3 = (Jq) kq.a.get(hg);
        layoutParams.setMargins(i, 0, i2, jq3 != null ? jq3.d : 0);
    }

    public static final String a(HashMap map) {
        String strEncode;
        String strEncode2;
        map.getClass();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String string = dk2.y0((String) entry.getValue()).toString();
            if (string.length() != 0) {
                if (sb.length() > 0) {
                    sb.append(C4664b4.j.c);
                }
                Locale locale = Locale.US;
                try {
                    strEncode = URLEncoder.encode(str, "UTF-8");
                    strEncode.getClass();
                } catch (UnsupportedEncodingException unused) {
                    strEncode = "";
                }
                try {
                    strEncode2 = URLEncoder.encode(string, "UTF-8");
                    strEncode2.getClass();
                } catch (UnsupportedEncodingException unused2) {
                    strEncode2 = "";
                }
                sb.append(String.format(locale, "%s=%s", Arrays.copyOf(new Object[]{strEncode, strEncode2}, 2)));
            }
        }
        return sb.toString();
    }

    public static final String a(Buffer buffer) {
        buffer.getClass();
        String strEncodeToString = Base64.encodeToString(buffer.readByteArray(), 0);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    public static final void a(cz czVar) {
        if (czVar == null || czVar.getA().get(nl0.i) == null) {
            return;
        }
        try {
            kc2.g(czVar, null);
        } catch (Exception unused) {
        }
    }

    public static final c91 a(cz czVar, long j, long j2, wr0 wr0Var) {
        czVar.getClass();
        wr0Var.getClass();
        return tb5.t(czVar, null, null, new C3927c4(j, wr0Var, j2, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(Oi oi, wr0 wr0Var, dy dyVar) {
        C3982e4 c3982e4;
        if (dyVar instanceof C3982e4) {
            c3982e4 = (C3982e4) dyVar;
            int i = c3982e4.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3982e4.b = i - Integer.MIN_VALUE;
            } else {
                c3982e4 = new C3982e4(dyVar);
            }
        } else {
            c3982e4 = new C3982e4(dyVar);
        }
        Object obj = c3982e4.a;
        int i2 = c3982e4.b;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                C4010f4 c4010f4 = new C4010f4(wr0Var, null);
                c3982e4.b = 1;
                Object objA = oi.a(c4010f4, c3982e4);
                Object obj2 = dz.a;
                if (objA == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
        } catch (IllegalStateException e) {
            gd1 gd1Var = Ba.a;
            Ba.a(new C4120j3(e));
        }
        return az2.a;
    }

    public static final Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        context.getClass();
        intentFilter.getClass();
        try {
            Y5.a.getClass();
            if (Build.VERSION.SDK_INT >= 33) {
                return context.registerReceiver(broadcastReceiver, intentFilter, 2);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            gd1 gd1Var = Ba.a;
            U9.a(e);
            return null;
        }
    }
}
