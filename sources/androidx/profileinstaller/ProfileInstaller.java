package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import defpackage.e32;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ProfileInstaller {
    public static final DiagnosticsCallback a = new AnonymousClass1();
    public static final DiagnosticsCallback b = new AnonymousClass2();

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstaller$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements DiagnosticsCallback {
        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void a(int i, Object obj) {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void b() {
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstaller$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 implements DiagnosticsCallback {
        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void b() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void a(int i, Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i != 6 && i != 7 && i != 8) {
                Log.d("ProfileInstaller", str);
            } else {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DiagnosticCode {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface DiagnosticsCallback {
        void a(int i, Object obj);

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ResultCode {
    }

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0183 A[Catch: all -> 0x0180, TRY_ENTER, TryCatch #15 {all -> 0x0180, blocks: (B:90:0x015f, B:92:0x016b, B:103:0x0183, B:104:0x0188), top: B:236:0x015f }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0194 A[Catch: IllegalStateException -> 0x017a, IOException -> 0x017c, FileNotFoundException -> 0x017e, TRY_LEAVE, TryCatch #29 {FileNotFoundException -> 0x017e, IOException -> 0x017c, IllegalStateException -> 0x017a, blocks: (B:88:0x0157, B:93:0x0175, B:111:0x0194, B:109:0x0191, B:108:0x018e), top: B:255:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:128:0x01cd A[Catch: all -> 0x01db, TRY_LEAVE, TryCatch #30 {all -> 0x01db, blocks: (B:126:0x01c1, B:128:0x01cd, B:137:0x01de), top: B:251:0x01c1 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x01de A[Catch: all -> 0x01db, TRY_ENTER, TRY_LEAVE, TryCatch #30 {all -> 0x01db, blocks: (B:126:0x01c1, B:128:0x01cd, B:137:0x01de), top: B:251:0x01c1 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:152:0x0203  */
    /* JADX WARN: Code duplicated, block: B:153:0x0207  */
    /* JADX WARN: Code duplicated, block: B:161:0x0221 A[Catch: all -> 0x0243, TRY_LEAVE, TryCatch #17 {all -> 0x0243, blocks: (B:158:0x0219, B:159:0x021b, B:161:0x0221), top: B:233:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:202:0x0270  */
    /* JADX WARN: Code duplicated, block: B:205:0x0279  */
    /* JADX WARN: Code duplicated, block: B:210:0x0284 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x0288  */
    /* JADX WARN: Code duplicated, block: B:236:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x020b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x016b A[Catch: all -> 0x0180, TRY_LEAVE, TryCatch #15 {all -> 0x0180, blocks: (B:90:0x015f, B:92:0x016b, B:103:0x0183, B:104:0x0188), top: B:236:0x015f }] */
    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Context context, Executor executor, DiagnosticsCallback diagnosticsCallback, boolean z) {
        char c;
        FileInputStream fileInputStreamA;
        byte[] bArr;
        DexProfileData[] dexProfileDataArrG;
        DiagnosticsCallback diagnosticsCallback2;
        DexProfileData[] dexProfileDataArr;
        byte[] bArr2;
        byte[] bArr3;
        boolean z2;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr4;
        int i;
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        DeviceProfileWriter deviceProfileWriter;
        FileInputStream fileInputStreamA2;
        boolean z3;
        boolean z4;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z4 = j == packageInfo.lastUpdateTime;
                            if (z4) {
                                diagnosticsCallback.a(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                if (z4) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    ProfileVerifier.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            DeviceProfileWriter deviceProfileWriter2 = new DeviceProfileWriter(assets, executor, diagnosticsCallback, name, file2);
            byte[] bArr5 = deviceProfileWriter2.c;
            if (bArr5 == null) {
                deviceProfileWriter2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            } else {
                try {
                    try {
                        if (file2.exists()) {
                            if (!file2.canWrite()) {
                                deviceProfileWriter2.b(4, null);
                            }
                            if (z2 || !z) {
                                z3 = 0;
                            } else {
                                z3 = c;
                            }
                            ProfileVerifier.c(context, z3);
                        }
                        try {
                            file2.createNewFile();
                        } catch (IOException unused2) {
                            c = 1;
                            deviceProfileWriter2.b(4, null);
                            z2 = false;
                        }
                        if (fileInputStreamA != null) {
                            try {
                                if (!Arrays.equals(bArr, Encoding.b(4, fileInputStreamA))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                dexProfileDataArrG = ProfileTranscoder.g(fileInputStreamA, Encoding.b(4, fileInputStreamA), deviceProfileWriter2.e);
                                try {
                                    fileInputStreamA.close();
                                } catch (IOException e) {
                                    diagnosticsCallback.a(7, e);
                                }
                                deviceProfileWriter2.g = dexProfileDataArrG;
                            } catch (IOException e2) {
                                diagnosticsCallback.a(7, e2);
                                try {
                                    fileInputStreamA.close();
                                } catch (IOException e3) {
                                    diagnosticsCallback.a(7, e3);
                                }
                                dexProfileDataArrG = null;
                            } catch (IllegalStateException e4) {
                                diagnosticsCallback.a(8, e4);
                                fileInputStreamA.close();
                                dexProfileDataArrG = null;
                            }
                        }
                        DexProfileData[] dexProfileDataArr2 = deviceProfileWriter2.g;
                        if (dexProfileDataArr2 != null && (i2 = Build.VERSION.SDK_INT) <= 34) {
                            if (i2 != 25) {
                                switch (i2) {
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                        try {
                                            fileInputStreamA2 = deviceProfileWriter2.a("dexopt/baseline.profm", assets);
                                            if (fileInputStreamA2 == null) {
                                                try {
                                                    if (Arrays.equals(ProfileTranscoder.b, Encoding.b(4, fileInputStreamA2))) {
                                                        throw new IllegalStateException("Invalid magic");
                                                    }
                                                    deviceProfileWriter2.g = ProfileTranscoder.d(fileInputStreamA2, Encoding.b(4, fileInputStreamA2), bArr5, dexProfileDataArr2);
                                                    fileInputStreamA2.close();
                                                    deviceProfileWriter = deviceProfileWriter2;
                                                } catch (Throwable th4) {
                                                    try {
                                                        fileInputStreamA2.close();
                                                        throw th4;
                                                    } catch (Throwable th5) {
                                                        th4.addSuppressed(th5);
                                                        throw th4;
                                                    }
                                                }
                                            } else {
                                                if (fileInputStreamA2 != null) {
                                                    fileInputStreamA2.close();
                                                }
                                                deviceProfileWriter = null;
                                            }
                                        } catch (FileNotFoundException e5) {
                                            diagnosticsCallback.a(9, e5);
                                        } catch (IOException e6) {
                                            diagnosticsCallback.a(7, e6);
                                        } catch (IllegalStateException e7) {
                                            deviceProfileWriter2.g = null;
                                            diagnosticsCallback.a(8, e7);
                                        }
                                        if (deviceProfileWriter != null) {
                                            deviceProfileWriter2 = deviceProfileWriter;
                                            break;
                                        }
                                    default:
                                        diagnosticsCallback2 = deviceProfileWriter2.b;
                                        dexProfileDataArr = deviceProfileWriter2.g;
                                        bArr2 = deviceProfileWriter2.c;
                                        if (dexProfileDataArr != null && bArr2 != null) {
                                            if (deviceProfileWriter2.f) {
                                                e32.i("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                                return;
                                            }
                                            try {
                                                byteArrayOutputStream = new ByteArrayOutputStream();
                                                try {
                                                    byteArrayOutputStream.write(bArr);
                                                    byteArrayOutputStream.write(bArr2);
                                                    if (ProfileTranscoder.i(byteArrayOutputStream, bArr2, dexProfileDataArr)) {
                                                        deviceProfileWriter2.h = byteArrayOutputStream.toByteArray();
                                                        byteArrayOutputStream.close();
                                                        deviceProfileWriter2.g = null;
                                                    } else {
                                                        diagnosticsCallback2.a(5, null);
                                                        deviceProfileWriter2.g = null;
                                                        byteArrayOutputStream.close();
                                                    }
                                                } catch (Throwable th6) {
                                                    try {
                                                        byteArrayOutputStream.close();
                                                        throw th6;
                                                    } catch (Throwable th7) {
                                                        th6.addSuppressed(th7);
                                                        throw th6;
                                                    }
                                                }
                                            } catch (IOException e8) {
                                                diagnosticsCallback2.a(7, e8);
                                            } catch (IllegalStateException e9) {
                                                diagnosticsCallback2.a(8, e9);
                                            }
                                        }
                                        bArr3 = deviceProfileWriter2.h;
                                        if (bArr3 != null) {
                                            z2 = false;
                                            c = 1;
                                        } else {
                                            try {
                                                if (deviceProfileWriter2.f) {
                                                    e32.i("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                                    return;
                                                }
                                                try {
                                                    try {
                                                        byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                                        try {
                                                            fileOutputStream = new FileOutputStream(deviceProfileWriter2.d);
                                                            try {
                                                                try {
                                                                    bArr4 = new byte[512];
                                                                    while (true) {
                                                                        i = byteArrayInputStream.read(bArr4);
                                                                        if (i > 0) {
                                                                            fileOutputStream.write(bArr4, 0, i);
                                                                        } else {
                                                                            c = 1;
                                                                            try {
                                                                                deviceProfileWriter2.b(1, null);
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                deviceProfileWriter2.h = null;
                                                                                deviceProfileWriter2.g = null;
                                                                                z2 = true;
                                                                            } catch (Throwable th8) {
                                                                                th = th8;
                                                                            }
                                                                        }
                                                                        th = th;
                                                                        try {
                                                                            fileOutputStream.close();
                                                                            throw th;
                                                                        } catch (Throwable th9) {
                                                                            th.addSuppressed(th9);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } catch (Throwable th10) {
                                                                    th = th10;
                                                                }
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                                Throwable th12 = th;
                                                                try {
                                                                    byteArrayInputStream.close();
                                                                    throw th12;
                                                                } catch (Throwable th13) {
                                                                    th12.addSuppressed(th13);
                                                                    throw th12;
                                                                }
                                                            }
                                                        } catch (Throwable th14) {
                                                            th = th14;
                                                        }
                                                    } catch (FileNotFoundException e10) {
                                                        e = e10;
                                                        deviceProfileWriter2.b(6, e);
                                                        deviceProfileWriter2.h = null;
                                                        deviceProfileWriter2.g = null;
                                                        z2 = false;
                                                    } catch (IOException e11) {
                                                        e = e11;
                                                        deviceProfileWriter2.b(7, e);
                                                        deviceProfileWriter2.h = null;
                                                        deviceProfileWriter2.g = null;
                                                        z2 = false;
                                                    }
                                                } catch (FileNotFoundException e12) {
                                                    e = e12;
                                                    c = 1;
                                                    deviceProfileWriter2.b(6, e);
                                                    deviceProfileWriter2.h = null;
                                                    deviceProfileWriter2.g = null;
                                                    z2 = false;
                                                } catch (IOException e13) {
                                                    e = e13;
                                                    c = 1;
                                                    deviceProfileWriter2.b(7, e);
                                                    deviceProfileWriter2.h = null;
                                                    deviceProfileWriter2.g = null;
                                                    z2 = false;
                                                }
                                            } catch (Throwable th15) {
                                                deviceProfileWriter2.h = null;
                                                deviceProfileWriter2.g = null;
                                                throw th15;
                                            }
                                        }
                                        if (z2) {
                                            a(packageInfo, filesDir);
                                        }
                                        if (z2) {
                                            z3 = 0;
                                        } else {
                                            z3 = 0;
                                        }
                                        ProfileVerifier.c(context, z3);
                                }
                            } else {
                                fileInputStreamA2 = deviceProfileWriter2.a("dexopt/baseline.profm", assets);
                                if (fileInputStreamA2 == null) {
                                    if (fileInputStreamA2 != null) {
                                        fileInputStreamA2.close();
                                    }
                                    deviceProfileWriter = null;
                                } else {
                                    if (Arrays.equals(ProfileTranscoder.b, Encoding.b(4, fileInputStreamA2))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    deviceProfileWriter2.g = ProfileTranscoder.d(fileInputStreamA2, Encoding.b(4, fileInputStreamA2), bArr5, dexProfileDataArr2);
                                    fileInputStreamA2.close();
                                    deviceProfileWriter = deviceProfileWriter2;
                                }
                                if (deviceProfileWriter != null) {
                                    deviceProfileWriter2 = deviceProfileWriter;
                                }
                            }
                        }
                        diagnosticsCallback2 = deviceProfileWriter2.b;
                        dexProfileDataArr = deviceProfileWriter2.g;
                        bArr2 = deviceProfileWriter2.c;
                        if (dexProfileDataArr != null) {
                            if (deviceProfileWriter2.f) {
                                e32.i("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(bArr);
                            byteArrayOutputStream.write(bArr2);
                            if (ProfileTranscoder.i(byteArrayOutputStream, bArr2, dexProfileDataArr)) {
                                diagnosticsCallback2.a(5, null);
                                deviceProfileWriter2.g = null;
                                byteArrayOutputStream.close();
                            } else {
                                deviceProfileWriter2.h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                deviceProfileWriter2.g = null;
                            }
                        }
                        bArr3 = deviceProfileWriter2.h;
                        if (bArr3 != null) {
                            if (deviceProfileWriter2.f) {
                                e32.i("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            byteArrayInputStream = new ByteArrayInputStream(bArr3);
                            fileOutputStream = new FileOutputStream(deviceProfileWriter2.d);
                            bArr4 = new byte[512];
                            while (true) {
                                i = byteArrayInputStream.read(bArr4);
                                if (i > 0) {
                                    fileOutputStream.write(bArr4, 0, i);
                                } else {
                                    c = 1;
                                    deviceProfileWriter2.b(1, null);
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    deviceProfileWriter2.h = null;
                                    deviceProfileWriter2.g = null;
                                    z2 = true;
                                }
                                th = th;
                                fileOutputStream.close();
                                throw th;
                            }
                        }
                        z2 = false;
                        c = 1;
                        if (z2) {
                            a(packageInfo, filesDir);
                        }
                        if (z2) {
                            z3 = 0;
                        } else {
                            z3 = 0;
                        }
                        ProfileVerifier.c(context, z3);
                    } catch (Throwable th16) {
                        try {
                            fileInputStreamA.close();
                            throw th16;
                        } catch (IOException e14) {
                            diagnosticsCallback.a(7, e14);
                            throw th16;
                        }
                    }
                    fileInputStreamA = deviceProfileWriter2.a("dexopt/baseline.prof", assets);
                } catch (FileNotFoundException e15) {
                    diagnosticsCallback.a(6, e15);
                    fileInputStreamA = null;
                } catch (IOException e16) {
                    diagnosticsCallback.a(7, e16);
                    fileInputStreamA = null;
                }
                deviceProfileWriter2.f = true;
                bArr = ProfileTranscoder.a;
                c = '\b';
            }
            c = 1;
            z2 = false;
            if (z2) {
                z3 = 0;
            } else {
                z3 = 0;
            }
            ProfileVerifier.c(context, z3);
        } catch (PackageManager.NameNotFoundException e17) {
            diagnosticsCallback.a(7, e17);
            ProfileVerifier.c(context, false);
        }
    }
}
