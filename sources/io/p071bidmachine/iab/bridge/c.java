package io.p071bidmachine.iab.bridge;

import android.content.Context;
import android.os.Handler;
import android.util.Base64;
import android.util.Pair;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.freeze.d;
import com.safedk.android.internal.partials.BidMachineFilesBridge;
import defpackage.fh1;
import io.p071bidmachine.iab.mraid.h0;
import io.p071bidmachine.iab.mraid.u;
import io.p071bidmachine.iab.utils.m;
import io.p071bidmachine.iab.utils.y;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLDecoder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public final b a = new b();
    public String b;

    public static void a(h0 h0Var, String str, fh1 fh1Var) {
        byte b;
        FileInputStream fileInputStreamOpenFileInput;
        switch (str) {
            case "writeFile":
                b = 0;
                break;
            case "writeDefaults":
                b = 1;
                break;
            case "readFile":
                b = 2;
                break;
            case "readDefaults":
                b = 3;
                break;
            default:
                b = -1;
                break;
        }
        FileOutputStream fileOutputStreamFileOutputStreamCtor = null;
        byteArrayOutputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        fileOutputStreamFileOutputStreamCtor = null;
        switch (b) {
            case 0:
                String str2 = (String) fh1Var.get("path");
                String str3 = (String) fh1Var.get("data");
                if (d.k(h0Var, str2, str3)) {
                    return;
                }
                try {
                    String strC = io.p071bidmachine.iab.utils.c.c(URLDecoder.decode(str2, "UTF-8"));
                    byte[] bArrDecode = Base64.decode(URLDecoder.decode(str3, "UTF-8"), 2);
                    if (!d.k(h0Var, strC, new String(bArrDecode))) {
                        fileOutputStreamFileOutputStreamCtor = strC.contains("/") ? BidMachineFilesBridge.fileOutputStreamCtor(strC) : h0Var.getContext().getApplicationContext().openFileOutput(strC, 0);
                        fileOutputStreamFileOutputStreamCtor.write(bArrDecode);
                        break;
                    }
                    Handler handler = y.a;
                    if (fileOutputStreamFileOutputStreamCtor != null) {
                        try {
                            fileOutputStreamFileOutputStreamCtor.flush();
                        } catch (Throwable th) {
                            m.a.C("Utils", th);
                        }
                        break;
                    }
                    y.a(fileOutputStreamFileOutputStreamCtor);
                    return;
                } catch (Throwable th2) {
                    try {
                        d.i(h0Var);
                        u.d("NativeStorage", th2);
                        if (fileOutputStreamFileOutputStreamCtor != null) {
                            try {
                                break;
                            } catch (Throwable th3) {
                            }
                        }
                        return;
                    } finally {
                        Handler handler2 = y.a;
                        if (fileOutputStreamFileOutputStreamCtor != null) {
                            try {
                                fileOutputStreamFileOutputStreamCtor.flush();
                            } catch (Throwable th4) {
                                m.a.C("Utils", th4);
                            }
                            break;
                        }
                        y.a(fileOutputStreamFileOutputStreamCtor);
                    }
                }
            case 1:
                String str4 = (String) fh1Var.get("path");
                String str5 = (String) fh1Var.get("data");
                if (d.k(h0Var, str4, str5)) {
                    return;
                }
                try {
                    String strC2 = io.p071bidmachine.iab.utils.c.c(URLDecoder.decode(str4, "UTF-8"));
                    byte[] bArrDecode2 = Base64.decode(URLDecoder.decode(str5, "UTF-8"), 2);
                    String[] strArrSplit = strC2.split("/");
                    Pair pair = new Pair(strArrSplit[0], strArrSplit[1]);
                    if (d.k(h0Var, (String) pair.first, (String) pair.second)) {
                        return;
                    }
                    h0Var.getContext().getApplicationContext().getSharedPreferences((String) pair.first, 0).edit().putString((String) pair.second, new String(bArrDecode2)).apply();
                    return;
                } catch (Throwable th5) {
                    d.i(h0Var);
                    u.d("NativeStorage", th5);
                    return;
                }
            case 2:
                String str6 = (String) fh1Var.get("path");
                if (d.k(h0Var, str6)) {
                    return;
                }
                try {
                    String strC3 = io.p071bidmachine.iab.utils.c.c(URLDecoder.decode(str6, "UTF-8"));
                    Context applicationContext = h0Var.getContext().getApplicationContext();
                    File file = strC3.contains("/") ? new File(strC3) : applicationContext.getFileStreamPath(strC3);
                    if (file != null && file.exists()) {
                        fileInputStreamOpenFileInput = applicationContext.openFileInput(strC3);
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                byte[] bArr = new byte[8192];
                                if (fileInputStreamOpenFileInput != null) {
                                    while (true) {
                                        int i = fileInputStreamOpenFileInput.read(bArr);
                                        if (-1 != i) {
                                            byteArrayOutputStream2.write(bArr, 0, i);
                                        }
                                    }
                                }
                                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                if (byteArray.length > 0) {
                                    d.j(h0Var, "fireReadFileSuccessEvent", str6, Base64.encodeToString(byteArray, 2));
                                } else {
                                    d.i(h0Var);
                                }
                                y.a(fileInputStreamOpenFileInput);
                                y.a(byteArrayOutputStream2);
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                try {
                                    d.i(h0Var);
                                    u.d("NativeStorage", th);
                                    return;
                                } finally {
                                    y.a(fileInputStreamOpenFileInput);
                                    y.a(byteArrayOutputStream);
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    }
                    d.i(h0Var);
                    Handler handler3 = y.a;
                    return;
                } catch (Throwable th8) {
                    th = th8;
                    fileInputStreamOpenFileInput = null;
                }
                break;
            case 3:
                String str7 = (String) fh1Var.get("path");
                if (d.k(h0Var, str7)) {
                    return;
                }
                try {
                    String[] strArrSplit2 = io.p071bidmachine.iab.utils.c.c(URLDecoder.decode(str7, "UTF-8")).split("/");
                    Pair pair2 = new Pair(strArrSplit2[0], strArrSplit2[1]);
                    if (!d.k(h0Var, (String) pair2.first, (String) pair2.second)) {
                        Object obj = h0Var.getContext().getApplicationContext().getSharedPreferences((String) pair2.first, 0).getAll().get(pair2.second);
                        if (obj == null) {
                            d.i(h0Var);
                        } else {
                            String strValueOf = String.valueOf(obj);
                            if (!d.k(h0Var, strValueOf)) {
                                d.j(h0Var, "fireReadDefaultsSuccessEvent", str7, Base64.encodeToString(strValueOf.getBytes(), 2));
                            }
                        }
                    }
                    return;
                } catch (Throwable th9) {
                    d.i(h0Var);
                    u.d("NativeStorage", th9);
                    return;
                }
            default:
                return;
        }
    }
}
