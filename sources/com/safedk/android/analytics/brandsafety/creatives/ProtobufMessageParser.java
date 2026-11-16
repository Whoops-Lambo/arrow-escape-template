package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ProtobufMessageParser {
    private static final String a = "ProtobufMessageParser";
    private static final String b = "array";
    private static final String c = "string";
    private static final String d = "undefined_key";
    private byte[] f = null;
    private int e = 0;

    public static class ProtobufParserException extends Exception {
    }

    private ProtobufMessageParser() {
    }

    public static JSONObject a(byte[] bArr, String str) {
        return new ProtobufMessageParser().b(bArr, str);
    }

    private JSONObject b(byte[] bArr, String str) {
        if (bArr == null || bArr.length == 0 || str == null || str.isEmpty()) {
            Logger.d(a, "parse protobuf message - invalid input");
            return new JSONObject();
        }
        this.e = 0;
        this.f = bArr;
        JSONObject jSONObject = new JSONObject();
        try {
            a(new JSONObject(str), jSONObject, bArr.length);
            return jSONObject;
        } catch (ProtobufParserException | JSONException e) {
            Logger.d(a, "parse protobuf message - invalid json template: ", str);
            return jSONObject;
        }
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2, int i) throws ProtobufParserException {
        while (this.e != i) {
            int iC = c();
            String strValueOf = String.valueOf(b(iC));
            int iC2 = c(iC);
            Object objOpt = jSONObject.opt(strValueOf);
            if (iC2 != 5) {
                switch (iC2) {
                    case 0:
                        b(jSONObject2, objOpt);
                        break;
                    case 1:
                        b();
                        break;
                    case 2:
                        a(jSONObject2, objOpt);
                        break;
                }
            } else {
                a();
            }
        }
    }

    private String a(JSONArray jSONArray) {
        String strOptString = jSONArray.optString(0);
        if (strOptString == null || strOptString.isEmpty()) {
            return d;
        }
        return strOptString;
    }

    private String b(JSONArray jSONArray) {
        return jSONArray.optString(1, "");
    }

    private Object c(JSONArray jSONArray) {
        return jSONArray.opt(2);
    }

    private String a(int i) {
        if (this.e + i <= this.f.length) {
            return new String(this.f, this.e, i);
        }
        return "";
    }

    private JSONArray a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        a(jSONObject, str, jSONArrayOptJSONArray);
        return jSONArrayOptJSONArray;
    }

    private void a(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException e) {
            }
        }
    }

    private void a(JSONObject jSONObject, Object obj) throws ProtobufParserException {
        JSONObject jSONObject2;
        String strA;
        int iC = c();
        JSONArray jSONArrayA = null;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            strA = a(jSONArray);
            String strB = b(jSONArray);
            if (strB.equals(b)) {
                jSONArrayA = a(jSONObject, strA);
                obj = c(jSONArray);
                jSONObject2 = new JSONObject();
            } else {
                if (strB.equals(c)) {
                    obj = "";
                }
                jSONObject2 = jSONObject;
            }
        } else {
            jSONObject2 = jSONObject;
            strA = null;
        }
        if (obj instanceof JSONObject) {
            if (jSONArrayA != null) {
                jSONArrayA.put(jSONObject2);
            }
            a((JSONObject) obj, jSONObject2, this.e + iC);
            return;
        }
        if (obj instanceof String) {
            String strA2 = a(iC);
            if (jSONArrayA != null) {
                jSONArrayA.put(strA2);
            } else if (strA != null) {
                a(jSONObject, strA, strA2);
            }
        }
        this.e += iC;
    }

    private void b(JSONObject jSONObject, Object obj) throws ProtobufParserException {
        int iC = c();
        if (obj instanceof JSONArray) {
            a(jSONObject, a((JSONArray) obj), Integer.valueOf(iC));
        }
    }

    private void a() {
        this.e += 4;
    }

    private void b() {
        this.e += 8;
    }

    private int c() throws ProtobufParserException {
        byte bD;
        ArrayList arrayList = new ArrayList();
        do {
            bD = d();
            arrayList.add(Byte.valueOf(bD));
        } while (!a(bD));
        Collections.reverse(arrayList);
        int iByteValue = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iByteValue = (iByteValue << 7) | ((byte) (((Byte) it.next()).byteValue() & 127));
        }
        return iByteValue;
    }

    private byte d() throws ProtobufParserException {
        if (this.e < 0 || this.e >= this.f.length) {
            throw new ProtobufParserException();
        }
        byte[] bArr = this.f;
        int i = this.e;
        this.e = i + 1;
        return bArr[i];
    }

    private boolean a(byte b2) {
        return (b2 & 128) == 0;
    }

    private int b(int i) {
        return i >> 3;
    }

    private int c(int i) {
        return i & 7;
    }
}
