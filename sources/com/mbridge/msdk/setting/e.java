package com.mbridge.msdk.setting;

import android.text.TextUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class e {
    public int a;
    private HashMap<String, f> b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b {
        private static final e a = new e();
    }

    private e() {
        this.a = 6;
        this.b = new HashMap<>();
    }

    public int a(String str) {
        HashMap<String, f> map;
        f fVar;
        int i;
        if (TextUtils.isEmpty(str) || (map = this.b) == null || !map.containsKey(str) || (fVar = this.b.get(str)) == null) {
            return 0;
        }
        if (fVar.b()) {
            i = 1;
        } else if (fVar.a() >= this.a) {
            i = 2;
        } else {
            i = 0;
        }
        fVar.a(false);
        return i;
    }

    public void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
                if (this.b == null) {
                    this.b = new HashMap<>();
                }
                Iterator<String> itKeys = jSONObjectJsonObjectInit.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String string = jSONObjectJsonObjectInit.getString(next);
                    f fVar = new f();
                    fVar.a(next);
                    fVar.b(string);
                    this.b.put(next, fVar);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static e a() {
        return b.a;
    }
}
