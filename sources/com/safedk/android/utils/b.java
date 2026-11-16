package com.safedk.android.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.singular.sdk.internal.Constants;
import com.singular.sdk.internal.UserDetailsUtils;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static List<String> a = Arrays.asList(n.f, "java.util.List", "java.util.ArrayList", "java.util.Map", "java.util.HashMap", "org.json.JSONObject", "com.five_corp.ad.internal.cache", "com.five_corp.ad.internal.context", com.safedk.android.analytics.brandsafety.m.w, Constants.LONG);
    private static final String b = "DebugUtils";

    private static void a(String str, String str2, ViewGroup viewGroup, String str3) {
        try {
            int childCount = viewGroup.getChildCount();
            int length = (childCount + "").length();
            int i = 0;
            while (i < childCount) {
                View childAt = viewGroup.getChildAt(i);
                float z = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (Build.VERSION.SDK_INT >= 21) {
                    z = childAt.getZ();
                }
                String str4 = "type : " + childAt.getClass().getName() + ", viewId :" + Integer.toHexString(childAt.getId()) + ", address : " + BrandSafetyUtils.a(childAt) + ", top/left/width/height : " + childAt.getTop() + "," + childAt.getLeft() + "," + childAt.getWidth() + "," + childAt.getHeight() + ",z-order : " + z;
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                i++;
                sb.append(String.format(str2 + " " + ("|— %0" + length + "d/%0" + length + "d %s"), Integer.valueOf(i), Integer.valueOf(childCount), str4));
                String string = sb.toString();
                if (childAt instanceof SurfaceView) {
                    SurfaceView surfaceView = (SurfaceView) childAt;
                    string = string + ", surfaceView Holder : " + surfaceView.getHolder();
                    if (surfaceView.getHolder() != null) {
                        string = string + ", surfaceView Holder Surface object : " + surfaceView.getHolder().getSurface();
                    }
                }
                Logger.d(str, string);
                if (childAt instanceof ViewGroup) {
                    a(str, str2, (ViewGroup) childAt, str3 + "  ");
                }
            }
        } catch (Throwable th) {
            Logger.e(b, "Exception in printViewHierarchy", th);
        }
    }

    private static void a(View view, String str, String str2) {
        try {
            Logger.d(str, str2, " getViewDetails started, View type is ", view.getClass().getName(), ", Id=", Integer.toHexString(view.getId()));
            if (view.getParent() != null) {
                if (view.getParent() instanceof View) {
                    a((View) view.getParent(), str, str2);
                } else {
                    Log.d(str, str2 + " getViewDetails parent is ViewParent, view : " + view.getId() + ", View type is " + view.getClass().getName());
                }
            }
        } catch (Throwable th) {
            Logger.e(str, str2, " Exception in getViewDetails", th);
        }
    }

    private static void a(Context context, String str) {
        File file = new File(context.getFilesDir() + "/" + str);
        if (file.exists()) {
            a(file);
        } else {
            Logger.d(b, "listFiles directory does not exist : ", file);
        }
    }

    private static void a(Context context) {
        Logger.d(b, "listFilesInFilesDir started, dir : ", context.getFilesDir().getPath());
        a(context.getFilesDir());
    }

    private static void b(Context context) {
        a(context.getCacheDir());
    }

    private static void a(File file) {
        if (file != null) {
            if (file.isFile()) {
                Logger.d(b, "listFilesInDir file ", a(file.length()), " ", file.getPath());
                return;
            }
            if (file.isDirectory()) {
                Logger.d(b, "listFilesInDir dir  ", file.getPath());
                for (File file2 : file.listFiles()) {
                    a(file2);
                }
            }
        }
    }

    private static String a(long j) {
        if (j <= 0) {
            return "0 Bytes";
        }
        double d = j;
        int iLog10 = (int) (Math.log10(d) / Math.log10(1024.0d));
        return new DecimalFormat("#,##0.#").format(d / Math.pow(1024.0d, iLog10)) + " " + new String[]{"Bt", "kB", "MB", "GB", "TB"}[iLog10];
    }

    private static void a(String str, String str2, Object obj, int i, int i2) {
        String string;
        if (obj == null) {
            return;
        }
        boolean z = true;
        try {
            if (obj.getClass() == null) {
                return;
            }
            if (i > i2) {
                Log.d(str, str2 + " reflectRecursively cannot go beyond level " + i2 + " current level is " + i);
                return;
            }
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            int length = declaredFields.length;
            int i3 = 0;
            while (i3 < length) {
                Field field = declaredFields[i3];
                field.setAccessible(z);
                Object obj2 = field.get(obj);
                if (c(field.getType().getName())) {
                    string = obj2 != null ? obj2.toString() : "null";
                } else {
                    string = null;
                }
                String strReplace = new String(new char[i * 2]).replace("\u0000", "-");
                if (a.contains(field.getType().getName())) {
                    Logger.d(str, str2, " reflectRecursively level ", Integer.valueOf(i), strReplace, ", name : ", field.getName(), ", type : ", field.getType().getName(), ", value : ", string);
                } else {
                    Logger.d(str, str2, " reflectRecursively level ", Integer.valueOf(i), strReplace, ", name : ", field.getName(), ", type : ", field.getType().getName());
                }
                if (!field.getType().isPrimitive() && obj2 != null) {
                    a(str, str2, obj2, i + 1, i2);
                }
                i3++;
                z = true;
            }
        } catch (Throwable th) {
            Logger.e(str, str2, " reflectRecursively Exception, stopping", th);
        }
    }

    private static boolean c(String str) {
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            if (str.toLowerCase().startsWith(it.next().toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static void a(String str, String str2) {
        String str3;
        Logger.d(b, "Copy File To External Storage: src is: ", str, " directory: ", str2);
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append(File.separator);
        if (str2 != null) {
            str3 = str2 + File.separator;
        } else {
            str3 = "";
        }
        sb.append(str3);
        String string = sb.toString();
        Logger.d(b, "Copy File To External Storage: destination: ", string);
        String[] strArrSplit = str.split("/");
        String str4 = string + strArrSplit[strArrSplit.length - 1];
        Logger.d(b, "Copy File To External Storage: target = ", str4);
        Logger.d(b, "Copy File To External Storage: result = ", Boolean.valueOf(b(str, str4)));
    }

    private static boolean b(String str, String str2) {
        int i;
        try {
            if (new File(str).exists()) {
                FileInputStream fileInputStream = new FileInputStream(str);
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                byte[] bArr = new byte[1444];
                i = 0;
                while (true) {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    i += i2;
                    fileOutputStream.write(bArr, 0, i2);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else {
                i = 0;
            }
            if (new File(str2).exists()) {
                Logger.d(b, "copyFile finished creating file ", str2, ", ", Integer.valueOf(i), " bytes written");
            } else {
                Logger.d(b, "copyFile failed to create file ", str2);
            }
            return true;
        } catch (Throwable th) {
            Logger.d(b, "Exception in copyFile : ", th.getMessage(), th);
            return false;
        }
    }

    public static List<String> a(String str) {
        File[] fileArrListFiles = new File(str).listFiles(new FileFilter() { // from class: com.safedk.android.utils.b.1
            private final List<String> a = Arrays.asList("jpeg", "jpg", "png", "bmp", "gif");

            @Override // java.io.FileFilter
            public boolean accept(File pathname) {
                String path = pathname.getPath();
                return this.a.contains(path.substring(path.lastIndexOf(UserDetailsUtils.UserDetailsLiterals.DOT) + 1));
            }
        });
        ArrayList arrayList = new ArrayList();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file : fileArrListFiles) {
                arrayList.add(file.getName());
            }
        }
        return arrayList;
    }

    private static void a(File file, File file2) throws IOException {
        FileChannel channel;
        FileChannel channel2;
        try {
            channel = new FileInputStream(file).getChannel();
            try {
                channel2 = new FileOutputStream(file2).getChannel();
            } catch (FileNotFoundException e) {
                e = e;
                Logger.d(b, "Exception copying file :", e.getMessage(), e);
                channel2 = null;
            }
        } catch (FileNotFoundException e2) {
            e = e2;
            channel = null;
        }
        try {
            channel.transferTo(0L, channel.size(), channel2);
        } catch (Throwable th) {
            Logger.d(b, "Exception copying file :", th.getMessage(), th);
        } finally {
            if (channel != null) {
                channel.close();
            }
            if (channel2 != null) {
                channel2.close();
            }
        }
    }

    public static String b(String str) {
        SafeDK.getInstance().m();
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(str)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (FileNotFoundException e) {
            Logger.e(b, "Exception reading file ", str, e);
        } catch (IOException e2) {
            Logger.e(b, "Exception reading file ", str, e2);
        }
        return sb.toString();
    }
}
