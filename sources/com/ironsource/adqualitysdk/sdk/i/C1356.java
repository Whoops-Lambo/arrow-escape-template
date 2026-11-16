package com.ironsource.adqualitysdk.sdk.i;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﾚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C1356 {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int f4055;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List f4056;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final HashSet f4054 = new HashSet();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final HashSet f4053 = new HashSet();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public int f4052 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m976(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof String) {
            return ((String) obj).isEmpty();
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return obj.getClass().isArray() && Array.getLength(obj) == 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m978(Object obj) {
        String strM977;
        if (obj instanceof WeakReference) {
            obj = ((WeakReference) obj).get();
        } else if (obj instanceof AtomicReference) {
            obj = ((AtomicReference) obj).get();
        }
        if (obj == null) {
            return StringFog.decrypt("5hSmLA==\n", "iGHKQEBoOCM=\n");
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() > 30) {
                if (this.f4053.contains(str)) {
                    return StringFog.decrypt("uV/Ixj9chg==\n", "m2Oss09ipDU=\n");
                }
                this.f4053.add(str);
            }
            return m977(str);
        }
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            return String.valueOf(obj);
        }
        if (obj instanceof Character) {
            return m977(String.valueOf(obj));
        }
        int i = 0;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            while (i < jSONArray.length()) {
                Object objOpt = jSONArray.opt(i);
                if (objOpt != null) {
                    arrayList.add(objOpt);
                }
                i++;
            }
            return m979((Collection) arrayList);
        }
        String str2 = null;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Map linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.optString(next, null));
            }
            return m980(linkedHashMap);
        }
        if (obj instanceof Map) {
            return m980((Map) obj);
        }
        if (obj instanceof Collection) {
            return m979((Collection) obj);
        }
        if (obj.getClass().isArray()) {
            ArrayList arrayList2 = new ArrayList();
            while (i < Array.getLength(obj)) {
                arrayList2.add(Array.get(obj, i));
                i++;
            }
            return m979((Collection) arrayList2);
        }
        if (obj instanceof Bundle) {
            Bundle bundle = (Bundle) obj;
            HashMap map = new HashMap();
            for (String str3 : bundle.keySet()) {
                map.put(str3, bundle.get(str3));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("DvlYKS871x5X4SUINjTAARD5K2gcPsUZFPk9\n", "ddsHSkNapG0=\n"));
            sb.append(m980((Map) map));
            return AbstractC1156.m868("yg==\n", "t1TCavfzW9Q=\n", sb);
        }
        if (obj instanceof SharedPreferences) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(StringFog.decrypt("gVIbTQGkBpbYSmZ9BaQHgJ4gNksLoAeAlBMhXU/pV7qeETBPT/8=\n", "+nBELm3FdeU=\n"));
            sb2.append(m980(((SharedPreferences) obj).getAll()));
            return AbstractC1156.m868("jQ==\n", "8D5n4tjPzW8=\n", sb2);
        }
        if (!AbstractC0951.m735(obj.getClass(), this.f4056)) {
            return m977(obj.getClass().getSimpleName() + StringFog.decrypt("SQ==\n", "CWbSJZuU6JQ=\n") + Integer.toHexString(obj.hashCode()));
        }
        if (this.f4052 > this.f4055 || this.f4054.contains(obj)) {
            return m977(obj.getClass().getSimpleName() + StringFog.decrypt("RA==\n", "BJpI2PLJXFI=\n") + Integer.toHexString(obj.hashCode()));
        }
        this.f4054.add(obj);
        this.f4052++;
        StringBuilder sb3 = new StringBuilder(StringFog.decrypt("X7QaM3VFkf8GrA==\n", "JJZFUBkk4ow=\n"));
        sb3.append(m977(obj.getClass().getSimpleName()));
        try {
            String string = obj.toString();
            if (!TextUtils.isEmpty(string)) {
                String hexString = Integer.toHexString(obj.hashCode());
                if (!string.equals(obj.getClass().getName() + StringFog.decrypt("sg==\n", "8guLx2kpCXA=\n") + hexString)) {
                    if (!string.equals(obj.getClass().getSimpleName() + StringFog.decrypt("JA==\n", "ZKTcQXJzsUw=\n") + hexString)) {
                        str2 = string;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(str2)) {
            sb3.append(StringFog.decrypt("A8xRwGWX11lGgGmWMA==\n", "L+4OtArEoys=\n"));
            if (str2.length() <= 30) {
                strM977 = m977(str2);
            } else if (this.f4053.contains(str2)) {
                strM977 = StringFog.decrypt("uV/Ixj9chg==\n", "m2Oss09ipDU=\n");
            } else {
                this.f4053.add(str2);
                strM977 = m977(str2);
            }
            sb3.append(strM977);
        }
        try {
            ArrayList arrayList3 = new ArrayList();
            for (Class<?> superclass = obj.getClass(); superclass != null && AbstractC0951.m735(superclass, this.f4056); superclass = superclass.getSuperclass()) {
                arrayList3.addAll(Arrays.asList(superclass.getDeclaredFields()));
            }
            Field[] fieldArr = (Field[]) arrayList3.toArray(new Field[0]);
            int length = fieldArr.length;
            while (i < length) {
                Field field = fieldArr[i];
                if (Modifier.isStatic(field.getModifiers())) {
                    Class<?> type = field.getType();
                    if (!type.isPrimitive() && type != String.class) {
                    }
                    i++;
                }
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                if (obj2 instanceof WeakReference) {
                    obj2 = ((WeakReference) obj2).get();
                } else if (obj2 instanceof AtomicReference) {
                    obj2 = ((AtomicReference) obj2).get();
                }
                if (!m976(obj2)) {
                    sb3.append(StringFog.decrypt("paY=\n", "iYSXpZaMyVI=\n"));
                    sb3.append(field.getName());
                    sb3.append(StringFog.decrypt("fzk=\n", "XQOtzGR5bdM=\n"));
                    sb3.append(m978(obj2));
                }
                i++;
            }
        } catch (Throwable unused2) {
        }
        this.f4052--;
        sb3.append(StringFog.decrypt("+Q==\n", "hGpbISCyPIw=\n"));
        return sb3.toString();
    }

    public C1356(List list, int i) {
        this.f4056 = list;
        this.f4055 = i;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m980(Map map) {
        StringBuilder sb = new StringBuilder(StringFog.decrypt("AA==\n", "e67tDkmq5Ig=\n"));
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!m976(entry.getValue())) {
                if (!z) {
                    sb.append(StringFog.decrypt("Sg==\n", "ZrjvMZHE7OY=\n"));
                }
                sb.append(m977(String.valueOf(entry.getKey())));
                sb.append(StringFog.decrypt("Tg==\n", "dDuTsrazVDc=\n"));
                sb.append(m978(entry.getValue()));
                z = false;
            }
        }
        sb.append(StringFog.decrypt("uA==\n", "xaOGnQgWI6k=\n"));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m977(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("wg==\n", "4PsfowcgAmY=\n"));
        sb.append(str.replace(StringFog.decrypt("zA==\n", "kK2+EyRrbWQ=\n"), StringFog.decrypt("hWY=\n", "2TrI9hAaT1U=\n")).replace(StringFog.decrypt("EQ==\n", "MyfUVEeN5cU=\n"), StringFog.decrypt("DI8=\n", "UK0e4xUQFLg=\n")).replace("\n", StringFog.decrypt("6ek=\n", "tYdbTOVdjQM=\n")).replace("\r", StringFog.decrypt("6hw=\n", "tm5JNVxTQJ4=\n")).replace("\t", StringFog.decrypt("+A8=\n", "pHvNpDDerOc=\n")));
        return AbstractC1156.m868("Ew==\n", "MWlGofohbqM=\n", sb);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m979(Collection collection) {
        StringBuilder sb = new StringBuilder(StringFog.decrypt("PA==\n", "Z1eXCObFtyI=\n"));
        boolean z = true;
        for (Object obj : collection) {
            if (!m976(obj)) {
                if (!z) {
                    sb.append(StringFog.decrypt("bw==\n", "Q9D8Pp3b0LI=\n"));
                }
                sb.append(m978(obj));
                z = false;
            }
        }
        sb.append(StringFog.decrypt("Vg==\n", "CzlQPiI6EQw=\n"));
        return sb.toString();
    }
}
