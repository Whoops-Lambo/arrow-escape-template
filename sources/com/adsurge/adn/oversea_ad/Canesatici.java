package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import defpackage.h50;
import defpackage.nj;
import defpackage.pv1;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Canesatici {
    public static final String a = CanisMinor.a(CanisMinor.b);
    public static final String b = CanisMinor.a(CanisMinor.c);
    public static final String c = CanisMinor.a(CanisMinor.d);
    public static final String d = CanisMinor.a(CanisMinor.e);
    public static final String e = CanisMinor.a(CanisMinor.f);
    public static long f = 0;
    public static final String[] g = {"^/data/user/\\d+$", "^/data/data$"};

    /* JADX WARN: Code duplicated, block: B:129:0x029e A[PHI: r0 r6
  0x029e: PHI (r0v30 ??) = (r0v29 ??), (r0v28 ??), (r0v28 ??), (r0v28 ??), (r0v28 ??), (r0v28 ??), (r0v28 ??), (r0v28 ??), (r0v28 ??) binds: [B:154:0x029e, B:125:0x0288, B:127:0x0294, B:121:0x027a, B:113:0x0236, B:108:0x0222, B:102:0x020c, B:91:0x01e4, B:93:0x01ea] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r6v11 ??) = (r6v10 ??), (r6v9 ??), (r6v9 ??), (r6v9 ??), (r6v9 ??), (r6v9 ??), (r6v9 ??), (r6v9 ??), (r6v9 ??) binds: [B:154:0x029e, B:125:0x0288, B:127:0x0294, B:121:0x027a, B:113:0x0236, B:108:0x0222, B:102:0x020c, B:91:0x01e4, B:93:0x01ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x029e -> B:130:0x029f). Please report as a decompilation issue!!! */
    public static String a(Context context) {
        File parentFile;
        char c2;
        boolean z;
        Caelum caelum;
        int iA;
        String str;
        boolean z2;
        Caelum caelum2;
        int iIndexOf;
        boolean z3;
        int i;
        StringBuilder sb;
        int i2;
        Caelum caelum3;
        int i3;
        int iMyUid;
        StringBuilder sb2 = new StringBuilder();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        File parentFile2 = context.getApplicationContext().getFilesDir().getParentFile();
        if (parentFile2 == null || (parentFile = parentFile2.getParentFile()) == null) {
            caelum = new Caelum("", false);
            c2 = 3;
        } else {
            String[] strArr = g;
            int length = strArr.length;
            int i4 = 0;
            c2 = 3;
            while (true) {
                if (i4 >= length) {
                    z = true;
                    break;
                }
                if (Pattern.compile(strArr[i4]).matcher(parentFile.getAbsolutePath()).find()) {
                    z = false;
                    break;
                }
                i4++;
            }
            String absolutePath = parentFile2.getAbsolutePath();
            String packageName = context.getPackageName();
            String[] strArrSplit = absolutePath.split("/", 6);
            if (absolutePath.startsWith("/data/data/") && strArrSplit.length >= 4 && !TextUtils.isEmpty(strArrSplit[3])) {
                packageName = strArrSplit[3];
            } else if (absolutePath.startsWith("/data/user/") && strArrSplit.length >= 5 && !TextUtils.isEmpty(strArrSplit[4])) {
                packageName = strArrSplit[4];
            }
            caelum = (!z || packageName.equals(context.getPackageName())) ? new Caelum("", z) : new Caelum(a(context, packageName), z);
        }
        if (!caelum.a || TextUtils.isEmpty(caelum.b)) {
            iA = 0;
        } else {
            iA = Cimport.a(0, 0, true);
            Andromeda andromeda = new Andromeda();
            andromeda.a = a + c;
            andromeda.b = caelum.b;
            arrayList.add(andromeda);
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            caelum2 = new Caelum("", false);
        } else {
            try {
                Iterator it = Grapefruit.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    String str2 = (String) it.next();
                    int iIndexOf2 = str2.indexOf(47);
                    if (iIndexOf2 != -1) {
                        String strTrim = str2.substring(iIndexOf2).trim();
                        if (strTrim.startsWith("/data/app/") && strTrim.endsWith("/base.odex")) {
                            String[] strArrSplit2 = strTrim.split("/");
                            if (strArrSplit2.length >= 7) {
                                str = strArrSplit2[c2];
                                break;
                            }
                            str = null;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            String packageName2 = applicationContext.getPackageName();
            if (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf("-")) == -1) {
                z2 = false;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (TextUtils.isEmpty(strSubstring)) {
                    z2 = false;
                } else {
                    File file = new File("/data/data/".concat(strSubstring));
                    if (!file.exists() || !file.canWrite()) {
                        strSubstring = packageName2;
                    }
                    z2 = !TextUtils.equals(packageName2, strSubstring);
                    packageName2 = strSubstring;
                }
            }
            caelum2 = z2 ? new Caelum(a(context, packageName2), z2) : new Caelum("", z2);
        }
        ?? A = Cimport.a(iA, 1, caelum2.a);
        if (caelum2.a) {
            Andromeda andromeda2 = new Andromeda();
            andromeda2.a = a + d;
            andromeda2.b = caelum2.b;
            arrayList.add(andromeda2);
        }
        ?? sb3 = new StringBuilder();
        String strA = CanisMinor.a(CanisMinor.c1);
        try {
            try {
                if (strA == null || !strA.equalsIgnoreCase(Build.BRAND)) {
                    String str3 = Build.BRAND;
                    if ("xiaomi".equalsIgnoreCase(str3)) {
                        if (a()) {
                            sb3.append("XiaoMi");
                            z3 = true;
                            sb = sb3;
                            i = A;
                        } else {
                            z3 = false;
                            sb = sb3;
                            i = A;
                        }
                    } else if ("redmi".equalsIgnoreCase(str3)) {
                        if (a()) {
                            sb3.append("Redmi");
                            z3 = true;
                            sb = sb3;
                            i = A;
                        } else {
                            z3 = false;
                            sb = sb3;
                            i = A;
                        }
                    } else if ("oppo".equalsIgnoreCase(str3)) {
                        if (a()) {
                            sb3.append("OPPO");
                            z3 = true;
                            sb = sb3;
                            i = A;
                        } else {
                            z3 = false;
                            sb = sb3;
                            i = A;
                        }
                    } else if ("vivo".equalsIgnoreCase(str3)) {
                        if (a()) {
                            sb3.append("VIVO_A");
                        } else {
                            if (new String(Dorado.a("/proc/self/mountinfo")).contains(context.getApplicationContext().getPackageName() + "_cloned")) {
                                sb3.append("VIVO_B");
                            } else {
                                z3 = false;
                                sb = sb3;
                                i = A;
                            }
                        }
                        z3 = true;
                        sb = sb3;
                        i = A;
                    } else if (!"samsung".equalsIgnoreCase(str3) || (iMyUid = Process.myUid() / 100000) <= 50) {
                        z3 = false;
                        sb = sb3;
                        i = A;
                    } else {
                        sb3.append("samsung");
                        sb3.append(iMyUid);
                        z3 = true;
                        sb = sb3;
                        i = A;
                    }
                } else {
                    String strB = b(context);
                    String str4 = new String(Base64.decode("5YiG6Lqr5bqU55So", 0));
                    if (TextUtils.isEmpty(strB) || !str4.equals(strB)) {
                        z3 = false;
                        sb = sb3;
                        i = A;
                    } else {
                        String strA2 = CanisMinor.a(CanisMinor.d1);
                        if (strA2 != null) {
                            sb3.append(strA2);
                        } else {
                            sb3.append("H");
                        }
                        z3 = true;
                        sb = sb3;
                        i = A;
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
        Caelum caelum4 = new Caelum(sb.toString(), z3);
        sb3 = Cimport.a(i, 2, caelum4.a);
        A = caelum4.a;
        if (A != 0) {
            Andromeda andromeda3 = new Andromeda();
            andromeda3.a = a + e;
            andromeda3.b = caelum4.b;
            arrayList.add(andromeda3);
        }
        new SparseArray();
        try {
            String str5 = (String) Cranberry.a(TNative$aa.d209406_E8E4F4D4F33FB8BF(new SparseArray(), context, 206), 206, String.class);
            b bVar = c.a;
            if (str5 == null) {
                str5 = "";
            }
            i2 = Integer.parseInt(str5);
        } catch (Throwable unused3) {
            i2 = 0;
        }
        if (i2 > 0) {
            caelum3 = new Caelum("", true);
            i3 = 0;
        } else {
            i3 = 0;
            caelum3 = new Caelum("", false);
        }
        int iA2 = Cimport.a(sb3, 4, caelum3.a);
        if (caelum3.a) {
            Andromeda andromeda4 = new Andromeda();
            andromeda4.a = nj.q(new StringBuilder(), a, "dual_e");
            andromeda4.b = caelum4.b;
            arrayList.add(andromeda4);
        }
        if (iA2 > 0) {
            Andromeda andromeda5 = new Andromeda();
            andromeda5.a = a + b;
            andromeda5.b = pv1.k(iA2, "");
            arrayList.add(andromeda5);
        }
        f = System.currentTimeMillis() - jCurrentTimeMillis;
        int size = arrayList.size();
        int i5 = i3;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            Andromeda andromeda6 = (Andromeda) obj;
            sb2.append(andromeda6.a);
            sb2.append(":");
            sb2.append(andromeda6.b);
            sb2.append(",");
        }
        return sb2.toString();
    }

    public static String b(Context context) {
        Method method;
        try {
            Class<?> cls = Class.forName("android.os.UserManager");
            Field field = context.getClass().getField("USER_SERVICE");
            field.setAccessible(true);
            Object systemService = context.getSystemService((String) field.get(context));
            if (systemService == null || (method = cls.getMethod("getUserName", null)) == null) {
                return "";
            }
            method.setAccessible(true);
            return (String) method.invoke(systemService, null);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean a() {
        try {
            return 999 == Process.myUid() / 100000;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    public static String a(Context context, String str) {
        String str2;
        long length;
        StringBuilder sbQ = h50.q(str, "_");
        try {
            str2 = context.getPackageManager().getApplicationInfo(str, 0).sourceDir;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "";
        }
        try {
            sbQ.append((String) Grape.a(new File(str2)).get(0));
        } catch (Throwable unused2) {
            sbQ.append("");
        }
        sbQ.append("_");
        if (TextUtils.isEmpty(str2)) {
            length = -1;
        } else {
            File file = new File(str2);
            if (file.exists()) {
                length = file.length();
            } else {
                length = -1;
            }
        }
        sbQ.append(length);
        sbQ.append("_");
        sbQ.append(Process.myUid());
        return sbQ.toString();
    }
}
