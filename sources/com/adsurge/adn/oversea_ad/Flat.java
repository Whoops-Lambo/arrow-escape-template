package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import defpackage.nj;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Flat {
    public static final String a = nj.l(Plum.a, "_1", new StringBuilder("mpdc_"));
    public static final String b = nj.l(Plum.a, "_1", new StringBuilder("mpdc_r_"));

    /* JADX WARN: Code duplicated, block: B:100:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bd A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #6 {all -> 0x0051, blocks: (B:4:0x0007, B:59:0x011a, B:98:0x01b3, B:103:0x01bd, B:118:0x01ff, B:120:0x0205, B:121:0x0208, B:126:0x0214, B:128:0x021a, B:129:0x021d, B:106:0x01c8, B:65:0x013b, B:68:0x0144, B:70:0x014a, B:71:0x0150, B:82:0x017f, B:84:0x0185, B:85:0x0188, B:90:0x019a, B:92:0x01a0, B:93:0x01a3, B:62:0x0131, B:7:0x0013, B:12:0x0021, B:14:0x0025, B:17:0x002f, B:23:0x0048, B:28:0x0054, B:30:0x0069, B:32:0x006c, B:41:0x0097, B:43:0x009c, B:44:0x009f, B:45:0x00a0, B:53:0x00c2, B:40:0x0094), top: B:158:0x0007, inners: #17 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c8 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #6 {all -> 0x0051, blocks: (B:4:0x0007, B:59:0x011a, B:98:0x01b3, B:103:0x01bd, B:118:0x01ff, B:120:0x0205, B:121:0x0208, B:126:0x0214, B:128:0x021a, B:129:0x021d, B:106:0x01c8, B:65:0x013b, B:68:0x0144, B:70:0x014a, B:71:0x0150, B:82:0x017f, B:84:0x0185, B:85:0x0188, B:90:0x019a, B:92:0x01a0, B:93:0x01a3, B:62:0x0131, B:7:0x0013, B:12:0x0021, B:14:0x0025, B:17:0x002f, B:23:0x0048, B:28:0x0054, B:30:0x0069, B:32:0x006c, B:41:0x0097, B:43:0x009c, B:44:0x009f, B:45:0x00a0, B:53:0x00c2, B:40:0x0094), top: B:158:0x0007, inners: #17 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01f4 A[Catch: all -> 0x0212, LOOP:0: B:113:0x01ee->B:115:0x01f4, LOOP_END, TryCatch #8 {all -> 0x0212, blocks: (B:112:0x01df, B:113:0x01ee, B:115:0x01f4, B:116:0x01f8), top: B:161:0x01df }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01ff A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x0051, blocks: (B:4:0x0007, B:59:0x011a, B:98:0x01b3, B:103:0x01bd, B:118:0x01ff, B:120:0x0205, B:121:0x0208, B:126:0x0214, B:128:0x021a, B:129:0x021d, B:106:0x01c8, B:65:0x013b, B:68:0x0144, B:70:0x014a, B:71:0x0150, B:82:0x017f, B:84:0x0185, B:85:0x0188, B:90:0x019a, B:92:0x01a0, B:93:0x01a3, B:62:0x0131, B:7:0x0013, B:12:0x0021, B:14:0x0025, B:17:0x002f, B:23:0x0048, B:28:0x0054, B:30:0x0069, B:32:0x006c, B:41:0x0097, B:43:0x009c, B:44:0x009f, B:45:0x00a0, B:53:0x00c2, B:40:0x0094), top: B:158:0x0007, inners: #17 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0214 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #6 {all -> 0x0051, blocks: (B:4:0x0007, B:59:0x011a, B:98:0x01b3, B:103:0x01bd, B:118:0x01ff, B:120:0x0205, B:121:0x0208, B:126:0x0214, B:128:0x021a, B:129:0x021d, B:106:0x01c8, B:65:0x013b, B:68:0x0144, B:70:0x014a, B:71:0x0150, B:82:0x017f, B:84:0x0185, B:85:0x0188, B:90:0x019a, B:92:0x01a0, B:93:0x01a3, B:62:0x0131, B:7:0x0013, B:12:0x0021, B:14:0x0025, B:17:0x002f, B:23:0x0048, B:28:0x0054, B:30:0x0069, B:32:0x006c, B:41:0x0097, B:43:0x009c, B:44:0x009f, B:45:0x00a0, B:53:0x00c2, B:40:0x0094), top: B:158:0x0007, inners: #17 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0179 A[EDGE_INSN: B:186:0x0179->B:80:0x0179 BREAK  A[LOOP:1: B:77:0x016a->B:79:0x0170], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x011a A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #6 {all -> 0x0051, blocks: (B:4:0x0007, B:59:0x011a, B:98:0x01b3, B:103:0x01bd, B:118:0x01ff, B:120:0x0205, B:121:0x0208, B:126:0x0214, B:128:0x021a, B:129:0x021d, B:106:0x01c8, B:65:0x013b, B:68:0x0144, B:70:0x014a, B:71:0x0150, B:82:0x017f, B:84:0x0185, B:85:0x0188, B:90:0x019a, B:92:0x01a0, B:93:0x01a3, B:62:0x0131, B:7:0x0013, B:12:0x0021, B:14:0x0025, B:17:0x002f, B:23:0x0048, B:28:0x0054, B:30:0x0069, B:32:0x006c, B:41:0x0097, B:43:0x009c, B:44:0x009f, B:45:0x00a0, B:53:0x00c2, B:40:0x0094), top: B:158:0x0007, inners: #17 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0131 A[Catch: all -> 0x0051, TryCatch #6 {all -> 0x0051, blocks: (B:4:0x0007, B:59:0x011a, B:98:0x01b3, B:103:0x01bd, B:118:0x01ff, B:120:0x0205, B:121:0x0208, B:126:0x0214, B:128:0x021a, B:129:0x021d, B:106:0x01c8, B:65:0x013b, B:68:0x0144, B:70:0x014a, B:71:0x0150, B:82:0x017f, B:84:0x0185, B:85:0x0188, B:90:0x019a, B:92:0x01a0, B:93:0x01a3, B:62:0x0131, B:7:0x0013, B:12:0x0021, B:14:0x0025, B:17:0x002f, B:23:0x0048, B:28:0x0054, B:30:0x0069, B:32:0x006c, B:41:0x0097, B:43:0x009c, B:44:0x009f, B:45:0x00a0, B:53:0x00c2, B:40:0x0094), top: B:158:0x0007, inners: #17 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0138  */
    /* JADX WARN: Code duplicated, block: B:65:0x013b A[Catch: all -> 0x0051, TryCatch #6 {all -> 0x0051, blocks: (B:4:0x0007, B:59:0x011a, B:98:0x01b3, B:103:0x01bd, B:118:0x01ff, B:120:0x0205, B:121:0x0208, B:126:0x0214, B:128:0x021a, B:129:0x021d, B:106:0x01c8, B:65:0x013b, B:68:0x0144, B:70:0x014a, B:71:0x0150, B:82:0x017f, B:84:0x0185, B:85:0x0188, B:90:0x019a, B:92:0x01a0, B:93:0x01a3, B:62:0x0131, B:7:0x0013, B:12:0x0021, B:14:0x0025, B:17:0x002f, B:23:0x0048, B:28:0x0054, B:30:0x0069, B:32:0x006c, B:41:0x0097, B:43:0x009c, B:44:0x009f, B:45:0x00a0, B:53:0x00c2, B:40:0x0094), top: B:158:0x0007, inners: #17 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0141  */
    /* JADX WARN: Code duplicated, block: B:68:0x0144 A[Catch: all -> 0x0051, TryCatch #6 {all -> 0x0051, blocks: (B:4:0x0007, B:59:0x011a, B:98:0x01b3, B:103:0x01bd, B:118:0x01ff, B:120:0x0205, B:121:0x0208, B:126:0x0214, B:128:0x021a, B:129:0x021d, B:106:0x01c8, B:65:0x013b, B:68:0x0144, B:70:0x014a, B:71:0x0150, B:82:0x017f, B:84:0x0185, B:85:0x0188, B:90:0x019a, B:92:0x01a0, B:93:0x01a3, B:62:0x0131, B:7:0x0013, B:12:0x0021, B:14:0x0025, B:17:0x002f, B:23:0x0048, B:28:0x0054, B:30:0x0069, B:32:0x006c, B:41:0x0097, B:43:0x009c, B:44:0x009f, B:45:0x00a0, B:53:0x00c2, B:40:0x0094), top: B:158:0x0007, inners: #17 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x014a A[Catch: all -> 0x0051, TryCatch #6 {all -> 0x0051, blocks: (B:4:0x0007, B:59:0x011a, B:98:0x01b3, B:103:0x01bd, B:118:0x01ff, B:120:0x0205, B:121:0x0208, B:126:0x0214, B:128:0x021a, B:129:0x021d, B:106:0x01c8, B:65:0x013b, B:68:0x0144, B:70:0x014a, B:71:0x0150, B:82:0x017f, B:84:0x0185, B:85:0x0188, B:90:0x019a, B:92:0x01a0, B:93:0x01a3, B:62:0x0131, B:7:0x0013, B:12:0x0021, B:14:0x0025, B:17:0x002f, B:23:0x0048, B:28:0x0054, B:30:0x0069, B:32:0x006c, B:41:0x0097, B:43:0x009c, B:44:0x009f, B:45:0x00a0, B:53:0x00c2, B:40:0x0094), top: B:158:0x0007, inners: #17 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0150 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #6 {all -> 0x0051, blocks: (B:4:0x0007, B:59:0x011a, B:98:0x01b3, B:103:0x01bd, B:118:0x01ff, B:120:0x0205, B:121:0x0208, B:126:0x0214, B:128:0x021a, B:129:0x021d, B:106:0x01c8, B:65:0x013b, B:68:0x0144, B:70:0x014a, B:71:0x0150, B:82:0x017f, B:84:0x0185, B:85:0x0188, B:90:0x019a, B:92:0x01a0, B:93:0x01a3, B:62:0x0131, B:7:0x0013, B:12:0x0021, B:14:0x0025, B:17:0x002f, B:23:0x0048, B:28:0x0054, B:30:0x0069, B:32:0x006c, B:41:0x0097, B:43:0x009c, B:44:0x009f, B:45:0x00a0, B:53:0x00c2, B:40:0x0094), top: B:158:0x0007, inners: #17 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0170 A[Catch: all -> 0x0198, LOOP:1: B:77:0x016a->B:79:0x0170, LOOP_END, TryCatch #16 {all -> 0x0198, blocks: (B:76:0x0166, B:77:0x016a, B:79:0x0170, B:80:0x0179), top: B:177:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01af  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b3 A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #6 {all -> 0x0051, blocks: (B:4:0x0007, B:59:0x011a, B:98:0x01b3, B:103:0x01bd, B:118:0x01ff, B:120:0x0205, B:121:0x0208, B:126:0x0214, B:128:0x021a, B:129:0x021d, B:106:0x01c8, B:65:0x013b, B:68:0x0144, B:70:0x014a, B:71:0x0150, B:82:0x017f, B:84:0x0185, B:85:0x0188, B:90:0x019a, B:92:0x01a0, B:93:0x01a3, B:62:0x0131, B:7:0x0013, B:12:0x0021, B:14:0x0025, B:17:0x002f, B:23:0x0048, B:28:0x0054, B:30:0x0069, B:32:0x006c, B:41:0x0097, B:43:0x009c, B:44:0x009f, B:45:0x00a0, B:53:0x00c2, B:40:0x0094), top: B:158:0x0007, inners: #17 }] */
    public static synchronized String a(Context context, String str) {
        ApplicationInfo applicationInfo;
        long length;
        String str2;
        ByteArrayInputStream byteArrayInputStream;
        String strA;
        File dir;
        File file;
        ByteArrayOutputStream byteArrayOutputStream;
        FileChannel channel;
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock;
        ByteBuffer byteBufferAllocate;
        int i;
        String str3;
        File dir2;
        File file2;
        RandomAccessFile randomAccessFile2;
        FileChannel channel2;
        FileLock fileLockLock2;
        ByteBuffer byteBufferAllocate2;
        try {
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
                    if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && !TextUtils.isEmpty(applicationInfo.sourceDir)) {
                        String str4 = applicationInfo.sourceDir;
                        File file3 = new File(str4);
                        int i2 = applicationInfo.flags;
                        long jLastModified = -1;
                        try {
                            length = file3.length();
                        } catch (Throwable unused) {
                            length = -1;
                        }
                        try {
                            jLastModified = file3.lastModified() / 1000;
                        } catch (Throwable unused2) {
                        }
                        String str5 = packageInfo.versionName;
                        b bVar = c.a;
                        if (str5 == null) {
                            str5 = "";
                        }
                        int i3 = packageInfo.versionCode;
                        long j = packageInfo.firstInstallTime;
                        long j2 = packageInfo.lastUpdateTime;
                        System.currentTimeMillis();
                        String strA2 = "";
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length > 0) {
                            try {
                                byteArrayInputStream = new ByteArrayInputStream(signatureArr[0].toByteArray());
                                try {
                                    strA2 = c.a(Casaba.a(((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(byteArrayInputStream)).getEncoded()));
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        th.printStackTrace();
                                    } catch (Throwable th2) {
                                        Octans.a(byteArrayInputStream);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                byteArrayInputStream = null;
                            }
                            Octans.a(byteArrayInputStream);
                        }
                        if (TextUtils.isEmpty(strA2)) {
                            try {
                                ArrayList arrayListA = Grape.a(new File(str4));
                                if (arrayListA.size() > 0) {
                                    String str6 = (String) arrayListA.get(0);
                                    if (str6 == null) {
                                        str6 = "";
                                    }
                                    strA2 = str6;
                                }
                            } catch (Throwable unused3) {
                            }
                        }
                        str2 = length + ":" + strA2 + ":" + packageName + ":" + str5 + ":" + i3 + ":" + j + ":" + j2 + ":" + i2 + ":" + jLastModified;
                    }
                } catch (Throwable unused4) {
                }
                if (str2 == null) {
                    return "";
                }
                strA = c.a(Casaba.a(str2.getBytes()));
                dir = context.getDir("turingfd_pri", 0);
                if (dir == null) {
                    file = null;
                } else {
                    file = new File(dir, str);
                }
                if (file == null) {
                    str3 = null;
                } else if (!file.exists()) {
                    str3 = "";
                } else if (file.isFile()) {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        randomAccessFile = new RandomAccessFile(file, "rw");
                        try {
                            channel = randomAccessFile.getChannel();
                            try {
                                fileLockLock = channel.lock();
                                try {
                                    byteBufferAllocate = ByteBuffer.allocate(32);
                                    while (true) {
                                        i = channel.read(byteBufferAllocate);
                                        if (i > 0) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(byteBufferAllocate.array(), 0, i);
                                    }
                                    String string = byteArrayOutputStream.toString();
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException unused5) {
                                        }
                                    }
                                    Octans.a(channel);
                                    Octans.a(randomAccessFile);
                                    Octans.a(byteArrayOutputStream);
                                    str3 = string;
                                } catch (Throwable unused6) {
                                    if (fileLockLock != null) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException unused7) {
                                        }
                                    }
                                    Octans.a(channel);
                                    Octans.a(randomAccessFile);
                                    Octans.a(byteArrayOutputStream);
                                    str3 = null;
                                }
                            } catch (Throwable unused8) {
                                fileLockLock = null;
                                if (fileLockLock != null && fileLockLock.isValid()) {
                                    fileLockLock.release();
                                }
                                Octans.a(channel);
                                Octans.a(randomAccessFile);
                                Octans.a(byteArrayOutputStream);
                                str3 = null;
                                if (str3 == null) {
                                    return "";
                                }
                                if (TextUtils.equals(str3, strA)) {
                                    return "";
                                }
                                dir2 = context.getDir("turingfd_pri", 0);
                                if (dir2 == null) {
                                    file2 = null;
                                } else {
                                    file2 = new File(dir2, str);
                                }
                                if (file2 != null) {
                                    try {
                                        randomAccessFile2 = new RandomAccessFile(file2, "rw");
                                        try {
                                            channel2 = randomAccessFile2.getChannel();
                                            try {
                                                fileLockLock2 = channel2.lock();
                                                try {
                                                    byte[] bytes = strA.getBytes();
                                                    byteBufferAllocate2 = ByteBuffer.allocate(bytes.length);
                                                    byteBufferAllocate2.put(bytes);
                                                    byteBufferAllocate2.flip();
                                                    while (byteBufferAllocate2.hasRemaining()) {
                                                        channel2.write(byteBufferAllocate2);
                                                    }
                                                    channel2.truncate(bytes.length);
                                                    if (fileLockLock2 != null) {
                                                        try {
                                                            fileLockLock2.release();
                                                        } catch (IOException unused9) {
                                                        }
                                                    }
                                                    Octans.a(channel2);
                                                    Octans.a(randomAccessFile2);
                                                } catch (Throwable unused10) {
                                                    if (fileLockLock2 != null) {
                                                        try {
                                                            fileLockLock2.release();
                                                        } catch (IOException unused11) {
                                                        }
                                                    }
                                                    Octans.a(channel2);
                                                    Octans.a(randomAccessFile2);
                                                }
                                            } catch (Throwable unused12) {
                                                fileLockLock2 = null;
                                                if (fileLockLock2 != null) {
                                                    fileLockLock2.release();
                                                }
                                                Octans.a(channel2);
                                                Octans.a(randomAccessFile2);
                                                return str2;
                                            }
                                        } catch (Throwable unused13) {
                                            channel2 = null;
                                            fileLockLock2 = null;
                                            if (fileLockLock2 != null && fileLockLock2.isValid()) {
                                                fileLockLock2.release();
                                            }
                                            Octans.a(channel2);
                                            Octans.a(randomAccessFile2);
                                            return str2;
                                        }
                                    } catch (Throwable unused14) {
                                        randomAccessFile2 = null;
                                    }
                                }
                                return str2;
                            }
                        } catch (Throwable unused15) {
                            channel = null;
                        }
                    } catch (Throwable unused16) {
                        channel = null;
                        randomAccessFile = null;
                    }
                } else {
                    Dorado.a(file);
                    str3 = "";
                }
                if (str3 == null) {
                    return "";
                }
                if (TextUtils.equals(str3, strA)) {
                    return "";
                }
                dir2 = context.getDir("turingfd_pri", 0);
                if (dir2 == null) {
                    file2 = null;
                } else {
                    file2 = new File(dir2, str);
                }
                if (file2 != null) {
                    randomAccessFile2 = new RandomAccessFile(file2, "rw");
                    channel2 = randomAccessFile2.getChannel();
                    fileLockLock2 = channel2.lock();
                    byte[] bytes2 = strA.getBytes();
                    byteBufferAllocate2 = ByteBuffer.allocate(bytes2.length);
                    byteBufferAllocate2.put(bytes2);
                    byteBufferAllocate2.flip();
                    while (byteBufferAllocate2.hasRemaining()) {
                        channel2.write(byteBufferAllocate2);
                    }
                    channel2.truncate(bytes2.length);
                    if (fileLockLock2 != null && fileLockLock2.isValid()) {
                        fileLockLock2.release();
                    }
                    Octans.a(channel2);
                    Octans.a(randomAccessFile2);
                }
                return str2;
            }
            str2 = null;
            if (str2 == null) {
                return "";
            }
            strA = c.a(Casaba.a(str2.getBytes()));
            dir = context.getDir("turingfd_pri", 0);
            if (dir == null) {
                file = null;
            } else {
                file = new File(dir, str);
            }
            if (file == null) {
                str3 = null;
            } else if (!file.exists()) {
                str3 = "";
            } else if (file.isFile()) {
                Dorado.a(file);
                str3 = "";
            } else {
                byteArrayOutputStream = new ByteArrayOutputStream();
                randomAccessFile = new RandomAccessFile(file, "rw");
                channel = randomAccessFile.getChannel();
                fileLockLock = channel.lock();
                byteBufferAllocate = ByteBuffer.allocate(32);
                while (true) {
                    i = channel.read(byteBufferAllocate);
                    if (i > 0) {
                        break;
                        break;
                    }
                    byteArrayOutputStream.write(byteBufferAllocate.array(), 0, i);
                }
                String string2 = byteArrayOutputStream.toString();
                if (fileLockLock != null) {
                    fileLockLock.release();
                }
                Octans.a(channel);
                Octans.a(randomAccessFile);
                Octans.a(byteArrayOutputStream);
                str3 = string2;
            }
            if (str3 == null) {
                return "";
            }
            if (TextUtils.equals(str3, strA)) {
                return "";
            }
            dir2 = context.getDir("turingfd_pri", 0);
            if (dir2 == null) {
                file2 = null;
            } else {
                file2 = new File(dir2, str);
            }
            if (file2 != null) {
                randomAccessFile2 = new RandomAccessFile(file2, "rw");
                channel2 = randomAccessFile2.getChannel();
                fileLockLock2 = channel2.lock();
                byte[] bytes3 = strA.getBytes();
                byteBufferAllocate2 = ByteBuffer.allocate(bytes3.length);
                byteBufferAllocate2.put(bytes3);
                byteBufferAllocate2.flip();
                while (byteBufferAllocate2.hasRemaining()) {
                    channel2.write(byteBufferAllocate2);
                }
                channel2.truncate(bytes3.length);
                if (fileLockLock2 != null) {
                    fileLockLock2.release();
                }
                Octans.a(channel2);
                Octans.a(randomAccessFile2);
            }
            return str2;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public static synchronized String a(Context context) {
        return a(context, b);
    }
}
