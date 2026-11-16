package com.adsurge.adn.x1;

import android.content.Context;
import android.text.TextUtils;
import defpackage.nj;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class l {
    public static boolean a(InputStream inputStream, File file) {
        if (inputStream == null || file == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                a(inputStream);
                a((OutputStream) null);
                return false;
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[16384];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        a(inputStream);
                        a(fileOutputStream2);
                        return true;
                    }
                    fileOutputStream2.write(bArr, 0, i);
                }
            } catch (Throwable unused) {
                fileOutputStream = fileOutputStream2;
            }
        } catch (Throwable unused2) {
        }
        try {
            file.getAbsolutePath();
            new StringBuilder().append("Exception while copy from InputStream to File ");
            return false;
        } finally {
            a(inputStream);
            a(fileOutputStream);
        }
    }

    public static byte[] c(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        if (file != null && file.exists()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                    }
                    return bArr;
                } catch (IOException unused2) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return null;
    }

    public static void b(File file, byte[] bArr) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        if (file == null || bArr == null || bArr.length == 0) {
            return;
        }
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            } catch (Throwable th) {
                th = th;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
    }

    public static File e() {
        File file = new File(g(), "tpl4native");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File d() {
        File file = new File(c(), "com_qq_e_download");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File f() {
        File file = new File(com.adsurge.adn.s1.a.b().a().getCacheDir(), "adapterjs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File g() {
        return com.adsurge.adn.s1.a.b().a().getDir("adnet", 0);
    }

    public static File h() {
        File file = new File(com.adsurge.adn.s1.a.b().a().getCacheDir(), "resource");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File i() {
        File file = new File(d(), "video");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean b(File file, String str) {
        if (file == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return c(file, str.getBytes(com.adsurge.adn.B0.a.a));
    }

    public static String b(File file) throws Throwable {
        byte[] bArrC = c(file);
        if (bArrC != null) {
            return new String(bArrC, com.adsurge.adn.B0.a.a);
        }
        return null;
    }

    public static File b() {
        return new File(com.adsurge.adn.s1.a.b().a().getCacheDir(), "GDTDOWNLOAD/image");
    }

    public static String b(String str) {
        return com.adsurge.adn.I0.h.a(str);
    }

    public static boolean c(File file, byte[] bArr) {
        if (file != null && bArr != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                fileOutputStream.close();
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static File c() {
        File externalCacheDir = com.adsurge.adn.s1.a.b().a().getApplicationContext().getExternalCacheDir();
        return externalCacheDir != null ? externalCacheDir : com.adsurge.adn.s1.a.b().a().getApplicationContext().getCacheDir();
    }

    public static void a(File file, String str) throws Throwable {
        if (file == null || TextUtils.isEmpty(str)) {
            return;
        }
        a(file, str.getBytes(com.adsurge.adn.B0.a.a));
    }

    public static void a(File file, byte[] bArr) throws Throwable {
        if (file == null || bArr == null || bArr.length == 0) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        if (file.exists()) {
            File file2 = new File(parentFile, file.getName() + "_tmp_" + Thread.currentThread().getName() + "_" + System.nanoTime());
            b(file2, bArr);
            file2.renameTo(file);
            return;
        }
        b(file, bArr);
    }

    public static String a(String str) {
        return com.adsurge.adn.I0.h.a(str);
    }

    public static File a(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "gdtadmobwebdatabase");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File a() {
        File fileC = c();
        if (fileC == null) {
            return null;
        }
        File file = new File(fileC, nj.q(new StringBuilder("com_adsurge_adn_download"), File.separator, "apk"));
        if ((file.exists() || file.mkdirs()) && file.isDirectory()) {
            return file;
        }
        return null;
    }

    public static long a(File file) {
        long length;
        long j = 0;
        if (file != null && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    length = a(file2);
                } else {
                    length = file2.length();
                }
                j = length + j;
            }
        }
        return j;
    }

    public static boolean a(File file, File file2) {
        if (file == null || file2 == null || !file.exists()) {
            return false;
        }
        if (file.renameTo(file2)) {
            return true;
        }
        try {
            return a(new FileInputStream(file), file2);
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
