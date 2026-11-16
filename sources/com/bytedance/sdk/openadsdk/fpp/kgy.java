package com.bytedance.sdk.openadsdk.fpp;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.gm;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.bytedance.sdk.openadsdk.lqi.ct;
import com.ironsource.C4664b4;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy {
    private static final AtomicBoolean ahm = new AtomicBoolean(false);
    private static boolean kgy = true;

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0050: MOVE (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:81), block:B:15:0x0050 */
    private static void ahm(Context context) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        Exception e;
        AbstractInterruptibleChannel abstractInterruptibleChannel;
        String strAhm = ahm();
        File file = new File(context.getDir(TextUtils.isEmpty(strAhm) ? C4664b4.i.K : "webview_".concat(String.valueOf(strAhm)), 0).getPath(), "webview_data.lock");
        file.getAbsolutePath();
        if (!file.exists()) {
            return;
        }
        AbstractInterruptibleChannel abstractInterruptibleChannel2 = null;
        FileLock fileLockTryLock = null;
        abstractInterruptibleChannel2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    channel = randomAccessFile.getChannel();
                    if (channel != null) {
                        try {
                            fileLockTryLock = channel.tryLock();
                        } catch (Exception e2) {
                            e = e2;
                            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+a", "b9oAgA+oYO6OQ8N1iR2wLUk=", "WOYolgiLbMW2Q9JKqBC0KXfhLp4=", 150);
                            kgy(file);
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th) {
                                    rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+a", "b9oAgA+oYO6OQ8N1iR2wLUk=", "WOYolgiLbMW2Q9JKqBC0KXfhLp4=", 157);
                                    th.getMessage();
                                }
                            }
                            if (randomAccessFile == null) {
                                return;
                            }
                        }
                    }
                    if (fileLockTryLock != null) {
                        fileLockTryLock.close();
                    } else {
                        kgy(file);
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (Throwable th2) {
                            rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+a", "b9oAgA+oYO6OQ8N1iR2wLUk=", "WOYolgiLbMW2Q9JKqBC0KXfhLp4=", 157);
                            th2.getMessage();
                        }
                    }
                } catch (Exception e3) {
                    channel = null;
                    e = e3;
                } catch (Throwable th3) {
                    th = th3;
                    if (abstractInterruptibleChannel2 != null) {
                        try {
                            abstractInterruptibleChannel2.close();
                        } catch (Throwable th4) {
                            rz.kgy(th4, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+a", "b9oAgA+oYO6OQ8N1iR2wLUk=", "WOYolgiLbMW2Q9JKqBC0KXfhLp4=", 157);
                            th4.getMessage();
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th;
                    }
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (Throwable th5) {
                        rz.kgy(th5, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+a", "b9oAgA+oYO6OQ8N1iR2wLUk=", "WOYolgiLbMW2Q9JKqBC0KXfhLp4=", 164);
                        th5.getMessage();
                        throw th;
                    }
                }
            } catch (Exception e4) {
                channel = null;
                e = e4;
                randomAccessFile = null;
            } catch (Throwable th6) {
                th = th6;
                randomAccessFile = null;
            }
            try {
                randomAccessFile.close();
            } catch (Throwable th7) {
                rz.kgy(th7, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+a", "b9oAgA+oYO6OQ8N1iR2wLUk=", "WOYolgiLbMW2Q9JKqBC0KXfhLp4=", 164);
                th7.getMessage();
            }
        } catch (Throwable th8) {
            th = th8;
            abstractInterruptibleChannel2 = abstractInterruptibleChannel;
        }
    }

    public static void kgy(Context context) {
        if (context != null && kgy && ahm.compareAndSet(false, true)) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (gm.kgy(context)) {
                        if (ct.kgy("webview_defend", false)) {
                            ahm(context);
                            return;
                        }
                        return;
                    }
                    String strAhm = gm.ahm(context);
                    try {
                        if (TextUtils.isEmpty(strAhm)) {
                            strAhm = context.getPackageName() + Process.myPid();
                        }
                        WebView.setDataDirectorySuffix(strAhm);
                        sx.kgy("TTAD.TTMultiInitHelper", "init: WebView.setDataDirectorySuffix with ".concat(String.valueOf(strAhm)));
                    } catch (IllegalStateException e) {
                        rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+a", "b9oAgA+oYO6OQ8N1iR2wLUk=", "UuAkgQ==", 68);
                        sx.kgy("TTAD.TTMultiInitHelper", "init: ", e);
                        kgy(strAhm);
                    } catch (Exception e2) {
                        rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+a", "b9oAgA+oYO6OQ8N1iR2wLUk=", "UuAkgQ==", 72);
                        sx.kgy("TTAD.TTMultiInitHelper", "init: ", e2);
                    }
                }
            } catch (Throwable th) {
                rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+a", "b9oAgA+oYO6OQ8N1iR2wLUk=", "UuAkgQ==", 77);
                sx.kgy("TTAD.TTMultiInitHelper", "init: ", th);
            }
        }
    }

    public static void kgy() {
        kgy = false;
    }

    private static void kgy(String str) {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            Field field = (Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
            field.setAccessible(true);
            if (TextUtils.isEmpty((String) field.get(cls))) {
                field.set(cls, str);
            }
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+a", "b9oAgA+oYO6OQ8N1iR2wLUk=", "T/w0pgaoTcaUS/NUnhSjPFT8NKYWum/OmA==", 111);
            Log.e("TTAD.TTMultiInitHelper", "trySetDataDirectorySuffix: ", th);
        }
    }

    private static void kgy(File file) {
        kgy(file, file.exists() ? file.delete() : false);
    }

    private static void kgy(File file, boolean z) {
        if (!z || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+a", "b9oAgA+oYO6OQ8N1iR2wLUk=", "T/w0thG5aNOFZthehzepJF4=", 188);
            sx.rz("TTAD.TTMultiInitHelper", e.getMessage());
        }
    }

    private static String ahm() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+a", "b9oAgA+oYO6OQ8N1iR2wLUk=", "T/w0sgaoRMaJRPNUniK1Ll3nNQ==", 207);
            return null;
        }
    }
}
