package com.inmobi.media;

import android.content.ContentValues;
import defpackage.dz;
import defpackage.e32;
import defpackage.eu;
import defpackage.fy;
import defpackage.wz2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.w3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4481w3 {
    public final S9 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, int i2, fy fyVar) {
        C4399t3 c4399t3;
        if (fyVar instanceof C4399t3) {
            c4399t3 = (C4399t3) fyVar;
            int i3 = c4399t3.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c4399t3.c = i3 - Integer.MIN_VALUE;
            } else {
                c4399t3 = new C4399t3(this, fyVar);
            }
        } else {
            c4399t3 = new C4399t3(this, fyVar);
        }
        Object objA = c4399t3.a;
        int i4 = c4399t3.c;
        if (i4 == 0) {
            wz2.a0(objA);
            String str = "SELECT * FROM click WHERE ts < " + (System.currentTimeMillis() - ((long) i2)) + " ORDER BY ts ASC LIMIT " + i;
            S9 s9 = this.a;
            c4399t3.c = 1;
            s9.getClass();
            objA = s9.a(new O9(s9, str, null), c4399t3);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i4 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objA);
        }
        Iterable<ContentValues> iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(eu.f(iterable, 10));
        for (ContentValues contentValues : iterable) {
            contentValues.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String asString = contentValues.getAsString("track_extras");
            if (asString != null) {
                try {
                    JSONObject jSONObject = new JSONObject(asString);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object obj = jSONObject.get(next);
                        obj.getClass();
                        linkedHashMap2.put(next, (String) obj);
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                } catch (Exception unused) {
                }
            }
            Integer asInteger = contentValues.getAsInteger("id");
            asInteger.getClass();
            int iIntValue = asInteger.intValue();
            String asString2 = contentValues.getAsString("url");
            asString2.getClass();
            Boolean asBoolean = contentValues.getAsBoolean("follow_redirect");
            asBoolean.getClass();
            boolean zBooleanValue = asBoolean.booleanValue();
            Boolean asBoolean2 = contentValues.getAsBoolean("ping_in_webview");
            asBoolean2.getClass();
            boolean zBooleanValue2 = asBoolean2.booleanValue();
            Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
            asInteger2.getClass();
            int iIntValue2 = asInteger2.intValue();
            Long asLong = contentValues.getAsLong("ts");
            asLong.getClass();
            long jLongValue = asLong.longValue();
            Long asLong2 = contentValues.getAsLong("created_ts");
            asLong2.getClass();
            arrayList.add(new C4371s3(iIntValue, asString2, linkedHashMap, zBooleanValue, zBooleanValue2, iIntValue2, jLongValue, asLong2.longValue()));
        }
        return arrayList;
    }

    public C4481w3(S9 s9) {
        s9.getClass();
        this.a = s9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) {
        C4427u3 c4427u3;
        if (fyVar instanceof C4427u3) {
            c4427u3 = (C4427u3) fyVar;
            int i = c4427u3.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4427u3.c = i - Integer.MIN_VALUE;
            } else {
                c4427u3 = new C4427u3(this, fyVar);
            }
        } else {
            c4427u3 = new C4427u3(this, fyVar);
        }
        Object objA = c4427u3.a;
        int i2 = c4427u3.c;
        if (i2 == 0) {
            wz2.a0(objA);
            S9 s9 = this.a;
            c4427u3.c = 1;
            s9.getClass();
            objA = s9.a(new J9(s9, "SELECT COUNT(*) FROM click", null), c4427u3);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objA);
        }
        return Boolean.valueOf(((Number) objA).intValue() != 0);
    }
}
