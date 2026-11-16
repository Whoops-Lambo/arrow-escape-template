package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import defpackage.jc1;
import defpackage.nj;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class z {
    public static final String b = nj.l(Plum.a, "_oversea_ad", new StringBuilder("turingfd_conf_"));
    public final Handler a;

    public static void a(Context context, Olive olive) {
        if (TextUtils.isEmpty(olive.b)) {
            return;
        }
        HashMap map = new HashMap();
        map.put("1001", olive.b);
        map.put("1002", String.valueOf(olive.c));
        map.put("1003", String.valueOf(olive.d));
        map.put("1004", String.valueOf(olive.e));
        String str = olive.f;
        b bVar = c.a;
        String strEncodeToString = "";
        if (str == null) {
            str = "";
        }
        map.put("1005", str);
        Orange orange = olive.g;
        if (orange != null) {
            String str2 = TextUtils.isEmpty(orange.a) ? "" : orange.a;
            byte[] bArr = orange.b;
            if (bArr != null && bArr.length > 0) {
                try {
                    strEncodeToString = Base64.encodeToString(bArr, 0);
                } catch (Exception unused) {
                }
            }
            strEncodeToString = str2 + com.safedk.android.analytics.brandsafety.m.ad + strEncodeToString + com.safedk.android.analytics.brandsafety.m.ad + orange.c;
        }
        map.put("2010", strEncodeToString);
        a(context, map);
    }

    public static String b(Context context, String str) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = context.getSharedPreferences(b, 0);
        } catch (Throwable unused) {
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return "";
        }
        String string = sharedPreferences.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            b bVar = c.a;
            int length = string.length() / 2;
            byte[] bArr = new byte[length];
            char[] charArray = string.toUpperCase().toCharArray();
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (((byte) "0123456789ABCDEF".indexOf(charArray[i2 + 1])) | (((byte) "0123456789ABCDEF".indexOf(charArray[i2])) << 4));
            }
            return c.a("UTF-8", Cinstanceof.a(bArr, Cinstanceof.a()));
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static long c() {
        Context context;
        try {
            synchronized (Cconst.class) {
                context = Cconst.a;
            }
            return Long.parseLong(b(context, "503"));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static void d() {
        Context context;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        byte[] bArrB;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        String strA = null;
        try {
            sharedPreferences = context.getSharedPreferences(b, 0);
        } catch (Throwable unused) {
            sharedPreferences = null;
        }
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.remove("504");
        String strValueOf = String.valueOf(1);
        byte[] bArrA = Cinstanceof.a();
        if (bArrA != null && (bArrB = Cinstanceof.b(strValueOf.getBytes(), bArrA)) != null) {
            strA = c.a(bArrB);
        }
        if (strA != null) {
            editorEdit.putString("503", strA);
        }
        try {
            editorEdit.commit();
        } catch (Throwable unused2) {
        }
    }

    public z(w wVar) {
        this.a = wVar;
    }

    public static Avocado b(Context context) {
        System.currentTimeMillis();
        Avocado avocado = new Avocado(30);
        for (String str : b(context, "402").split("_")) {
            try {
                Long lValueOf = Long.valueOf(str);
                lValueOf.getClass();
                avocado.a(lValueOf);
            } catch (NumberFormatException unused) {
            }
        }
        return avocado;
    }

    public final void b(long j) {
        Context context;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        String strL = jc1.l(j, "");
        HashMap map = new HashMap();
        map.put("502", strL);
        a(context, map, false);
    }

    public static String b() {
        Context context;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        return b(context, "1005");
    }

    public static void a(Context context, HashMap map) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        try {
            sharedPreferences = context.getSharedPreferences(b, 0);
        } catch (Throwable unused) {
            sharedPreferences = null;
        }
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        for (String str : map.keySet()) {
            try {
                editorEdit.putString(str, c.a(Cinstanceof.b(((String) map.get(str)).getBytes(), Cinstanceof.a())));
            } catch (Throwable unused2) {
            }
        }
        try {
            editorEdit.commit();
        } catch (Throwable unused3) {
        }
    }

    public final void a(Context context, HashMap map, boolean z) {
        Handler handler;
        if (!z && (handler = this.a) != null) {
            handler.post(new y(context, map));
        } else {
            a(context, map);
        }
    }

    public static long a(Context context, String str) {
        try {
            return Long.parseLong(b(context, str));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static void a(long j) {
        Context context;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        byte[] bArrB;
        byte[] bArrB2;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        String strA = null;
        try {
            sharedPreferences = context.getSharedPreferences(b, 0);
        } catch (Throwable unused) {
            sharedPreferences = null;
        }
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.remove("502");
        editorEdit.remove(StatisticData.ERROR_CODE_IO_ERROR);
        editorEdit.remove("902");
        editorEdit.remove("901");
        editorEdit.remove("1001");
        String strValueOf = String.valueOf(-1);
        byte[] bArrA = Cinstanceof.a();
        String strA2 = (bArrA == null || (bArrB2 = Cinstanceof.b(strValueOf.getBytes(), bArrA)) == null) ? null : c.a(bArrB2);
        if (strA2 != null) {
            editorEdit.putString("503", strA2);
        }
        String strValueOf2 = String.valueOf(j);
        byte[] bArrA2 = Cinstanceof.a();
        if (bArrA2 != null && (bArrB = Cinstanceof.b(strValueOf2.getBytes(), bArrA2)) != null) {
            strA = c.a(bArrB);
        }
        if (strA != null) {
            editorEdit.putString("504", strA);
        }
        try {
            editorEdit.commit();
        } catch (Throwable unused2) {
        }
    }

    public static r a(Context context) {
        long jLongValue;
        try {
            String strB = b(context, StatisticData.ERROR_CODE_IO_ERROR);
            if (TextUtils.isEmpty(strB)) {
                return new r(1, 0, 0);
            }
            try {
                jLongValue = Long.valueOf(b(context, "102")).longValue();
            } catch (Throwable unused) {
                jLongValue = 0;
            }
            String strB2 = b(context, "104");
            String strB3 = b(context, "105");
            String strB4 = b(context, "106");
            String strB5 = b(context, "110");
            q qVar = new q();
            qVar.b = jLongValue;
            qVar.a = strB;
            qVar.c = strB2;
            qVar.d = strB3;
            qVar.e = strB4;
            qVar.f = strB5;
            return new r(qVar);
        } catch (Throwable unused2) {
            return new r(1, 0, 0);
        }
    }

    public static Orange a() {
        Context context;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        String strB = b(context, "2010");
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        String[] strArrSplit = strB.split("\\|", 3);
        if (strArrSplit.length != 3) {
            return null;
        }
        try {
            return new Orange(strArrSplit[0], !TextUtils.isEmpty(strArrSplit[1]) ? Base64.decode(strArrSplit[1], 0) : null, Integer.parseInt(strArrSplit[2]));
        } catch (Exception unused) {
            return null;
        }
    }
}
