package com.ironsource.sdk.utils;

import android.content.Context;
import android.os.Build;
import com.ironsource.B7;
import com.ironsource.Bf;
import com.ironsource.C4664b4;
import com.ironsource.C4950r4;
import com.ironsource.D8;
import com.ironsource.Pb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.internal.partials.IronSourceFilesBridge;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.h50;
import defpackage.jc1;
import defpackage.nj;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class IronSourceStorageUtils {
    private static final String a = "supersonicads";
    private static Bf b;
    private static boolean c;

    private static void a(Context context) {
        Bf bf = b;
        if (bf != null && bf.b()) {
            deleteCacheDirectories(context);
        }
        Bf bf2 = b;
        if (bf2 == null || !bf2.c()) {
            return;
        }
        deleteFilesDirectories(context);
    }

    public static String buildAbsolutePathToDirInCache(String str, String str2) {
        return str2 == null ? str : nj.q(h50.p(str), File.separator, str2);
    }

    public static JSONObject buildFilesMap(String str, String str2) {
        File file = new File(str, str2);
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    Object objC = c(file2);
                    if (objC instanceof JSONArray) {
                        jSONObjectJsonObjectInit.put(FileUploadManager.i, c(file2));
                    } else if (objC instanceof JSONObject) {
                        jSONObjectJsonObjectInit.put(file2.getName(), c(file2));
                    }
                } catch (JSONException e) {
                    C4950r4.d().a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public static JSONObject buildFilesMapOfDirectory(D8 d8, JSONObject jSONObject) throws Exception {
        if (d8 == null || !d8.isDirectory()) {
            return IronSourceNetworkBridge.jsonObjectInit();
        }
        File[] fileArrListFiles = d8.listFiles();
        if (fileArrListFiles == null) {
            return IronSourceNetworkBridge.jsonObjectInit();
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (File file : fileArrListFiles) {
            D8 d9 = new D8(file.getPath());
            if (d9.isFile()) {
                String name = d9.getName();
                JSONObject jSONObjectA = d9.a();
                if (jSONObject.has(name)) {
                    jSONObjectJsonObjectInit.put(name, SDKUtils.mergeJSONObjects(jSONObjectA, jSONObject.getJSONObject(name)));
                } else {
                    jSONObjectJsonObjectInit.put(name, jSONObjectA);
                }
            } else if (d9.isDirectory()) {
                jSONObjectJsonObjectInit.put(d9.getName(), buildFilesMapOfDirectory(d9, jSONObject));
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public static synchronized boolean deleteFile(D8 d8) {
        if (!d8.exists()) {
            return false;
        }
        return d8.delete();
    }

    public static synchronized boolean deleteFolder(String str) {
        File file;
        file = new File(str);
        return deleteFolderContentRecursive(file) && file.delete();
    }

    public static void ensurePathSafety(File file, String str) throws Exception {
        Bf bf = b;
        if (bf == null || !bf.e()) {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            if (!canonicalPath2.startsWith(canonicalPath)) {
                throw new Exception(C4664b4.c.u.concat(canonicalPath2));
            }
        }
    }

    public static ArrayList<D8> getFilesInFolderRecursive(D8 d8) {
        if (d8 == null || !d8.isDirectory()) {
            return new ArrayList<>();
        }
        ArrayList<D8> arrayList = new ArrayList<>();
        File[] fileArrListFiles = d8.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                D8 d9 = new D8(file.getPath());
                if (d9.isDirectory()) {
                    arrayList.addAll(getFilesInFolderRecursive(d9));
                }
                if (d9.isFile()) {
                    arrayList.add(d9);
                }
            }
        }
        return arrayList;
    }

    public static String getNetworkStorageDir(Context context) {
        File fileB = b(new File(getDiskCacheDirPath(context)));
        if (!fileB.exists()) {
            fileB.mkdir();
        }
        return fileB.getPath();
    }

    public static long getTotalSizeOfDir(D8 d8) {
        long totalSizeOfDir;
        long j = 0;
        if (d8 != null && d8.isDirectory()) {
            File[] fileArrListFiles = d8.listFiles();
            if (fileArrListFiles == null) {
                return 0L;
            }
            for (File file : fileArrListFiles) {
                D8 d9 = new D8(file.getPath());
                if (d9.isFile()) {
                    totalSizeOfDir = d9.length();
                } else {
                    if (d9.isDirectory()) {
                        totalSizeOfDir = getTotalSizeOfDir(d9);
                    }
                }
                j = totalSizeOfDir + j;
            }
        }
        return j;
    }

    public static void initializeCacheDirectory(@NotNull Context context, @NotNull Bf bf) {
        b = bf;
        a(context);
    }

    public static boolean isPathExist(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static boolean isUxt() {
        return c;
    }

    public static String makeDir(String str) {
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static String readFile(D8 d8) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(d8));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(line);
            sb.append('\n');
        }
    }

    public static boolean renameFile(String str, String str2) throws Exception {
        File file = new File(str);
        File file2 = new File(str2);
        File parentFile = file2.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            return file.renameTo(file2);
        }
        return false;
    }

    public static int saveFile(byte[] bArr, String str) throws Exception {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            return 0;
        }
        FileOutputStream fileOutputStreamFileOutputStreamCtor = IronSourceFilesBridge.fileOutputStreamCtor(file);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i = 0;
            while (true) {
                int i2 = byteArrayInputStream.read(bArr2);
                if (i2 == -1) {
                    fileOutputStreamFileOutputStreamCtor.close();
                    byteArrayInputStream.close();
                    return i;
                }
                fileOutputStreamFileOutputStreamCtor.write(bArr2, 0, i2);
                i += i2;
            }
        } catch (Throwable th) {
            fileOutputStreamFileOutputStreamCtor.close();
            byteArrayInputStream.close();
            throw th;
        }
    }

    private static File b(Context context) {
        B7 b7A = Pb.k0().a();
        Bf bf = b;
        if (bf != null && bf.d()) {
            return b7A.m(context);
        }
        return b7A.g(context);
    }

    public static void deleteCacheDirectories(Context context) {
        B7 b7A = Pb.k0().a();
        a(b7A.m(context));
        a(b7A.C(context));
    }

    public static void deleteFilesDirectories(Context context) {
        B7 b7A = Pb.k0().a();
        a(b7A.g(context));
        a(b7A.k(context));
    }

    public static boolean deleteFolderContentRecursive(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zDeleteFolderContentRecursive = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zDeleteFolderContentRecursive &= deleteFolderContentRecursive(file2);
                }
                if (!file2.delete()) {
                    zDeleteFolderContentRecursive = false;
                }
            }
        }
        return zDeleteFolderContentRecursive;
    }

    public static String getCachedFilesMap(String str, String str2) {
        JSONObject jSONObjectBuildFilesMap = buildFilesMap(str, str2);
        try {
            jSONObjectBuildFilesMap.put("path", str2);
        } catch (JSONException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObjectBuildFilesMap.toString();
    }

    public static String getDiskCacheDirPath(Context context) {
        File fileB;
        if (a() && SDKUtils.isExternalStorageAvailable() && (fileB = b(context)) != null && fileB.canWrite()) {
            c = true;
            return fileB.getPath();
        }
        return c(context).getPath();
    }

    private static Object c(File file) {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        JSONArray jSONArray = new JSONArray();
        try {
            if (file.isFile()) {
                jSONArray.put(file.getName());
                return jSONArray;
            }
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    jSONObjectJsonObjectInit.put(file2.getName(), c(file2));
                } else {
                    jSONArray.put(file2.getName());
                    jSONObjectJsonObjectInit.put(FileUploadManager.i, jSONArray);
                }
            }
            return jSONObjectJsonObjectInit;
        } catch (JSONException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObjectJsonObjectInit;
        }
    }

    private static void a(File file) {
        if (file != null) {
            deleteFolder(b(file).getPath());
        }
    }

    private static File b(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        String str = File.separator;
        return new File(jc1.o(str, a, sb, str));
    }

    private static boolean a() {
        Bf bf;
        return Build.VERSION.SDK_INT > 29 && (bf = b) != null && bf.a();
    }

    private static File c(Context context) {
        B7 b7A = Pb.k0().a();
        Bf bf = b;
        if (bf != null && bf.d()) {
            return b7A.C(context);
        }
        return b7A.k(context);
    }
}
