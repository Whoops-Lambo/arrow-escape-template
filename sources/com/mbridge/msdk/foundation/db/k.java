package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class k extends a {
    private static String a = "ReplaceTempDao";
    private static k b;

    /* JADX WARN: Code duplicated, block: B:16:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[Catch: all -> 0x0042, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0042, blocks: (B:4:0x0011, B:6:0x0017, B:17:0x0046), top: B:36:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067 A[RETURN] */
    public JSONObject d() {
        JSONObject jSONObject;
        a(7);
        JSONObject jSONObject2 = null;
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM c_replace_temp", null);
        if (cursorRawQuery != null) {
            try {
                if (cursorRawQuery.getCount() > 0) {
                    jSONObject = new JSONObject();
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            jSONObject.put(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("d_key")), MintegralNetworkBridge.jsonObjectInit(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("d_value"))));
                        } catch (Throwable th) {
                            th = th;
                            try {
                                q0.b(a, th.getMessage());
                                return jSONObject;
                            } finally {
                                if (cursorRawQuery != null) {
                                    try {
                                        cursorRawQuery.close();
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                    jSONObject2 = jSONObject;
                } else if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                if (cursorRawQuery != null) {
                    return jSONObject2;
                }
                jSONObject = jSONObject2;
            } catch (Throwable th2) {
                JSONObject jSONObject3 = jSONObject2;
                th = th2;
                jSONObject = jSONObject3;
            }
        } else {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            if (cursorRawQuery != null) {
                return jSONObject2;
            }
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    private k(f fVar) {
        super(fVar);
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("d_key", str);
            contentValues.put("d_value", jSONObject.toString());
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            if (!a(str)) {
                getWritableDatabase().insert("c_replace_temp", null, contentValues);
            } else {
                getWritableDatabase().update("c_replace_temp", contentValues, "d_key = ? ", new String[]{str});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0057 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r1
  0x0057: PHI (r1v4 org.json.JSONObject) = (r1v0 org.json.JSONObject), (r1v6 org.json.JSONObject) binds: [B:20:0x004b, B:26:0x0055] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public JSONObject b(String str) throws JSONException {
        JSONObject jSONObject = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM c_replace_temp WHERE d_key = ? ", new String[]{str});
        if (cursorRawQuery != null) {
            try {
                if (cursorRawQuery.getCount() > 0) {
                    jSONObject = new JSONObject();
                    while (cursorRawQuery.moveToNext()) {
                        jSONObject = MintegralNetworkBridge.jsonObjectInit(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("d_value")));
                    }
                } else if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused) {
                    }
                }
                if (cursorRawQuery != null) {
                }
            } catch (Throwable th) {
                try {
                    q0.b(a, th.getMessage());
                } finally {
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        } else {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            if (cursorRawQuery != null) {
            }
        }
        return jSONObject;
    }

    public static k a(f fVar) {
        if (b == null) {
            synchronized (e.class) {
                try {
                    if (b == null) {
                        b = new k(fVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public boolean a(String str) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT d_value FROM c_replace_temp WHERE d_key= ? ", new String[]{str});
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            try {
                cursorRawQuery.close();
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
        if (cursorRawQuery == null) {
            return false;
        }
        try {
            cursorRawQuery.close();
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    public void a(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis() - ((long) (i * BrandSafetyUtils.g));
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            getWritableDatabase().delete("c_replace_temp", "time<?", new String[]{String.valueOf(jCurrentTimeMillis)});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
