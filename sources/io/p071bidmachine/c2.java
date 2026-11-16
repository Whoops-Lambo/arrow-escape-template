package io.p071bidmachine;

import android.content.res.AssetManager;
import android.os.Handler;
import android.text.TextUtils;
import io.p071bidmachine.core.a;
import io.p071bidmachine.core.j;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c2 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static d2 a(String str, AssetManager assetManager) {
        d2 d2Var = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                String strB = b(str, assetManager);
                if (!TextUtils.isEmpty(strB)) {
                    JSONObject jSONObject = new JSONObject(strB);
                    String strOptString = jSONObject.optString("name");
                    String strOptString2 = jSONObject.optString("version");
                    String strOptString3 = jSONObject.optString("classpath");
                    String strOptString4 = jSONObject.optString("sdk_version");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && !TextUtils.isEmpty(strOptString4)) {
                        d2Var = new d2(strOptString, strOptString2, strOptString3, strOptString4);
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (d2Var != null) {
            a.put(d2Var.a, d2Var);
        }
        return d2Var;
    }

    public static String b(String str, AssetManager assetManager) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            InputStream inputStreamOpen = assetManager.open("bm_networks/" + str);
            Handler handler = j.a;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i == -1) {
                            String string = byteArrayOutputStream.toString("UTF-8");
                            j.d(byteArrayOutputStream);
                            j.a(byteArrayOutputStream);
                            j.a(inputStreamOpen);
                            return string;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                } catch (Throwable unused) {
                    j.d(byteArrayOutputStream);
                    j.a(byteArrayOutputStream);
                    j.a(inputStreamOpen);
                    return null;
                }
            } catch (Throwable unused2) {
                byteArrayOutputStream = null;
            }
        } catch (Throwable th) {
            a.i(th);
            return null;
        }
    }
}
