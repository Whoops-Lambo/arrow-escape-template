package com.adsurge.adn.I0;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import defpackage.dr0;
import defpackage.e32;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static boolean a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context != null && (runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && packageName.equals(runningAppProcessInfo.processName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(int i) throws Throwable {
        String strA = a(String.format("/proc/%d/stat", Integer.valueOf(i)));
        com.adsurge.adn.J0.a.a("gdt_tag_p", "checkForegroundUseStat : stat = %s ", strA);
        if (!TextUtils.isEmpty(strA)) {
            String[] strArrSplit = strA.split("\\s+");
            if (strArrSplit != null && strArrSplit.length > 40) {
                if (Integer.parseInt(strArrSplit[40]) != 0) {
                    return false;
                }
                return true;
            }
            dr0.h("Invalid format,no match status");
            return false;
        }
        dr0.h("No content");
        return false;
    }

    public static boolean c(Context context) {
        int iMyPid = Process.myPid();
        if (new File("/dev/cpuctl/tasks").exists()) {
            try {
                return a(iMyPid);
            } catch (IOException unused) {
                com.adsurge.adn.J0.a.a("checkForegroundUseCGroup Exception", new Object[0]);
            }
        } else {
            try {
                return b(iMyPid);
            } catch (IOException unused2) {
                com.adsurge.adn.J0.a.a("checkForegroundUseStat Exception", new Object[0]);
            }
        }
        return a(context);
    }

    public static boolean a(int i) throws Throwable {
        String strA = a(String.format("/proc/%d/cgroup", Integer.valueOf(i)));
        com.adsurge.adn.J0.a.a("gdt_tag_p", "checkForegroundUseCGroup : cgroup = %s ", strA);
        if (!TextUtils.isEmpty(strA)) {
            return (strA.contains("bg_non_interactive") || strA.contains("background")) ? false : true;
        }
        dr0.h("No content");
        return false;
    }

    public static String a(String str) throws Throwable {
        BufferedReader bufferedReader;
        try {
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str), com.adsurge.adn.B0.a.a));
            try {
                String str2 = "";
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    sb.append(str2);
                    sb.append(line);
                    str2 = "\n";
                }
                String string = sb.toString();
                bufferedReader.close();
                return string;
            } catch (Throwable th) {
                th = th;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    public static boolean b(Context context) {
        if (context != null) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            String packageName = context.getPackageName();
            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
            if (runningTasks != null && !runningTasks.isEmpty()) {
                ComponentName componentName = runningTasks.get(0).topActivity;
                return componentName != null && packageName.equals(componentName.getPackageName());
            }
            e32.i("tasks is empty");
            return false;
        }
        e32.i("context is null");
        return false;
    }
}
