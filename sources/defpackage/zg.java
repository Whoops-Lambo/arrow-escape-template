package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zg {
    public static boolean b;
    public static final zg a = new zg();
    public static HashSet c = new HashSet();

    public static final void a(Bundle bundle) {
        if (lz.a.contains(zg.class)) {
            return;
        }
        try {
            if (b && bundle != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : c) {
                    if (bundle.containsKey(str)) {
                        bundle.remove(str);
                        jSONArray.put(str);
                    }
                }
                if (jSONArray.length() > 0) {
                    bundle.putString("_bannedParams", jSONArray.toString());
                }
            }
        } catch (Throwable th) {
            lz.a(zg.class, th);
        }
    }
}
