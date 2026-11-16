package io.p071bidmachine.analytics.internal.I;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import defpackage.az2;
import defpackage.dk2;
import defpackage.er;
import defpackage.eu;
import defpackage.gd1;
import defpackage.i71;
import defpackage.ix;
import defpackage.j52;
import defpackage.j71;
import defpackage.p92;
import defpackage.rc1;
import defpackage.s71;
import defpackage.sr0;
import defpackage.tb5;
import java.io.Closeable;
import java.io.Flushable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g {
    private static final gd1 a = eu.w(a.a);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a extends rc1 implements sr0 {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // defpackage.sr0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ROOT);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    }

    public static final Map a(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            Object string = bundle.get(str);
            if (!(string instanceof Boolean)) {
                if (string instanceof Byte) {
                    string = Integer.valueOf(((Number) string).byteValue());
                } else if (!(string instanceof Character) && !(string instanceof Double) && !(string instanceof Float) && !(string instanceof Integer) && !(string instanceof Long)) {
                    if (string instanceof Short) {
                        string = Integer.valueOf(((Number) string).shortValue());
                    } else if (!(string instanceof String)) {
                        string = string instanceof Bundle ? a((Bundle) string) : (!(string instanceof CharSequence) && string == null) ? null : string.toString();
                    }
                }
            }
            if (string != null) {
                linkedHashMap.put(str, string);
            }
        }
        return linkedHashMap;
    }

    public static final byte[] b(byte[] bArr, String str) {
        return a(bArr, str.getBytes(er.a));
    }

    public static final String c(String str) {
        return Base64.encodeToString(str.getBytes(er.a), 2);
    }

    public static final String d(String str) {
        return e(c(str));
    }

    public static final String e(String str) {
        if (str.length() == 0) {
            return str;
        }
        int iX = dk2.X(str, "=", 0, false, 6);
        if (iX == -1) {
            return dk2.k0(str).toString();
        }
        return dk2.k0(str.substring(0, iX)).toString().concat(str.substring(iX));
    }

    public static final String b(String str) {
        return a(e(str));
    }

    public static final Object a(Closeable closeable) {
        try {
            closeable.close();
            return az2.a;
        } catch (Throwable th) {
            return new j52(th);
        }
    }

    public static final Object a(Flushable flushable) {
        try {
            flushable.flush();
            return az2.a;
        } catch (Throwable th) {
            return new j52(th);
        }
    }

    public static final JSONArray a(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof List) {
                jSONArray.put(a((List) obj));
            } else if (obj instanceof Map) {
                jSONArray.put(a((Map) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public static final JSONObject a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            try {
                String strValueOf = String.valueOf(key);
                if (strValueOf.length() != 0 && value != null) {
                    if (value instanceof List) {
                        value = a((List) value);
                    } else if (value instanceof Map) {
                        value = a((Map) value);
                    }
                    jSONObject.put(strValueOf, value);
                }
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    public static final Map a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : (ix) p92.F(jSONObject.keys())) {
            Object objA = a(jSONObject.get(str));
            if (objA != null) {
                linkedHashMap.put(str, objA);
            }
        }
        return linkedHashMap;
    }

    public static final List a(JSONArray jSONArray) {
        j71 j71VarD = tb5.D(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        i71 it = j71VarD.iterator();
        while (it.d) {
            Object objA = a(jSONArray.get(it.nextInt()));
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    private static final Object a(Object obj) {
        if (s71.b(obj, JSONObject.NULL)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    private static final SimpleDateFormat a() {
        return (SimpleDateFormat) a.getValue();
    }

    public static final boolean a(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static final byte[] a(byte[] bArr, String str) {
        return a(bArr, str.getBytes(er.a));
    }

    private static final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i % bArr2.length]);
        }
        return bArr3;
    }

    public static final String a(String str) {
        return new String(Base64.decode(str, 2), er.a);
    }

    public static final String a(Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            return th.getClass().getName();
        }
        return th.getClass().getName() + ": " + message;
    }

    public static final String a(Date date) {
        return a().format(date);
    }
}
