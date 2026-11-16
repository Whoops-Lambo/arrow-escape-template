package com.adsurge.adn.oversea_ad;

import android.os.Process;
import android.text.TextUtils;
import defpackage.jc1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Serpens {
    public static final HashSet a;
    public static final String[] b;
    public static final HashSet c;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        b = new String[0];
        hashSet.add(CanisMinor.a(CanisMinor.K));
        hashSet.add(CanisMinor.a(CanisMinor.L));
        hashSet.add(CanisMinor.a(CanisMinor.M));
        hashSet.add(CanisMinor.a(CanisMinor.N));
        hashSet.add(CanisMinor.a(CanisMinor.O));
        hashSet.add(CanisMinor.a(CanisMinor.P));
        hashSet.add(CanisMinor.a(CanisMinor.Q));
        hashSet.add(CanisMinor.a(CanisMinor.R));
        hashSet.add(CanisMinor.a(CanisMinor.S));
        hashSet.add(CanisMinor.a(CanisMinor.T));
        hashSet.add(CanisMinor.a(CanisMinor.U));
        hashSet.add(CanisMinor.a(CanisMinor.V));
        HashSet hashSet2 = new HashSet();
        c = hashSet2;
        hashSet2.add(CanisMinor.a(CanisMinor.J));
    }

    public static ArrayList a() {
        Guava guavaB;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String[] list = new File("/proc").list();
        if (list != null) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        char cCharAt = str.charAt(0);
                        if (cCharAt <= '9' && cCharAt >= '0' && (guavaB = Haw.b(Integer.parseInt(str))) != null) {
                            arrayList2.add(guavaB);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int iMyPid = Process.myPid();
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Guava guava = (Guava) obj;
            if (iMyPid == guava.a) {
                i2 = guava.e;
            }
        }
        if (i2 != 0 && iMyPid != i2) {
            int size2 = arrayList2.size();
            String str2 = "";
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                Guava guava2 = (Guava) obj2;
                if (i2 == guava2.a) {
                    str2 = guava2.d;
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                Andromeda andromeda = new Andromeda();
                andromeda.a = p.a + p.e;
                andromeda.b = str2;
                arrayList3.add(andromeda);
            }
        }
        arrayList.addAll(arrayList3);
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            Guava guava3 = (Guava) obj3;
            Iterator it = a.iterator();
            while (it.hasNext()) {
                if (guava3.d.contains((String) it.next())) {
                    sb.append(guava3.d);
                    sb.append("_");
                }
            }
        }
        String string = sb.toString();
        if (!TextUtils.isEmpty(string)) {
            Andromeda andromeda2 = new Andromeda();
            andromeda2.a = p.a + p.c;
            andromeda2.b = jc1.j(1, 0, string);
            arrayList4.add(andromeda2);
        }
        arrayList.addAll(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        HashSet hashSet = new HashSet();
        int size4 = arrayList2.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size4) {
            Object obj4 = arrayList2.get(i5);
            i5++;
            Guava guava4 = (Guava) obj4;
            if (guava4.c == 0 && guava4.d.startsWith("/") && !guava4.d.startsWith("/system") && !guava4.d.startsWith("/dev") && !guava4.d.startsWith("/sbin") && !guava4.d.startsWith("/init") && !guava4.d.startsWith("/vendor") && !guava4.d.startsWith("/bin") && !guava4.d.startsWith("/usr") && !guava4.d.contains("kinguser") && !guava4.d.endsWith("so")) {
                Iterator it2 = a.iterator();
                do {
                    if (!it2.hasNext()) {
                        Iterator it3 = c.iterator();
                        do {
                            if (!it3.hasNext()) {
                                hashSet.add(guava4.d);
                                int i7 = i6 + 1;
                                if (i6 < 8) {
                                    i6 = i7;
                                    break;
                                }
                                break;
                            }
                        } while (!guava4.d.contains((String) it3.next()));
                    }
                } while (!guava4.d.contains((String) it2.next()));
            }
        }
        if (hashSet.size() > 0) {
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb2.append((String) it4.next());
                sb2.append("%3B");
            }
            String string2 = sb2.toString();
            Andromeda andromeda3 = new Andromeda();
            andromeda3.a = p.a + p.d;
            andromeda3.b = jc1.j(1, 0, string2);
            arrayList5.add(andromeda3);
        }
        arrayList.addAll(arrayList5);
        return arrayList;
    }

    public static String b() {
        StringBuffer stringBuffer = new StringBuffer();
        String strA = a(CanisMinor.a(CanisMinor.m0), CanisMinor.a(CanisMinor.A0), "v4");
        if (!TextUtils.isEmpty(strA)) {
            stringBuffer.append(strA);
        }
        String strA2 = a(CanisMinor.a(CanisMinor.n0), "(.{32}:.{3,4})\\s(.{32}:.{3,4})\\s(.{2})\\s.{8}:.{8}\\s.{2}:.{8}\\s.{8}\\s+(.{4,5})", "v6");
        if (!TextUtils.isEmpty(strA2)) {
            if (!TextUtils.isEmpty(strA)) {
                stringBuffer.append("_");
            }
            stringBuffer.append(strA2);
        }
        return stringBuffer.toString();
    }

    public static String a(String str, String str2, String str3) {
        String[] strArrSplit;
        String[] strArrSplit2;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            String str4 = new String(Dorado.a(str));
            if (TextUtils.isEmpty(str4) || (strArrSplit = str4.split("\n")) == null || strArrSplit.length == 0) {
                strArrSplit = b;
            }
        } catch (Throwable unused) {
            strArrSplit = null;
        }
        if (strArrSplit == null) {
            stringBuffer.append(str3.concat(";-1"));
            return stringBuffer.toString();
        }
        stringBuffer.append(str3.concat(";0"));
        new HashMap();
        HashMap map = new HashMap();
        Pattern patternCompile = Pattern.compile(str2);
        for (String str5 : strArrSplit) {
            Matcher matcher = patternCompile.matcher(str5);
            if (matcher.find()) {
                String strTrim = matcher.group(4).trim();
                if ("0A".equals(matcher.group(3)) && (strArrSplit2 = matcher.group(1).split(":")) != null && strArrSplit2.length >= 2) {
                    map.put(strArrSplit2[1], strTrim);
                }
            }
        }
        if (!map.isEmpty()) {
            stringBuffer.append(";");
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                String str6 = (String) it.next();
                stringBuffer.append((String) map.get(str6));
                stringBuffer.append(":");
                stringBuffer.append(str6);
                if (it.hasNext()) {
                    stringBuffer.append(",");
                }
            }
        }
        return stringBuffer.toString();
    }
}
