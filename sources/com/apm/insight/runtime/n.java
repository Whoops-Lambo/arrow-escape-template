package com.apm.insight.runtime;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n {
    private static File a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public String a;
        private String b;
        private long c;

        public a(String str) {
            String[] strArrSplit = str.split("\\s+");
            if (strArrSplit.length == 3) {
                this.b = strArrSplit[0];
                this.a = strArrSplit[1];
                try {
                    this.c = Long.parseLong(strArrSplit[2]);
                    return;
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    j.a(new RuntimeException("err ProcessTrack line:".concat(str), th), "NPTH_CATCH");
                    return;
                }
            }
            com.apm.insight.c.a();
            j.a(new RuntimeException("err ProcessTrack line:".concat(str)), "NPTH_CATCH");
        }
    }

    @NonNull
    public static HashMap<String, a> a(long j, String str) throws Throwable {
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
        String[] list = file.list();
        HashMap<String, a> map = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray jSONArrayA = com.apm.insight.l.f.a(file2, length > 1048576 ? length - 524288 : 0L);
                    for (int length2 = jSONArrayA.length() - 1; length2 >= 0; length2--) {
                        String strOptString = jSONArrayA.optString(length2);
                        if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith(str)) {
                            map.put(str2.replace('_', ':').replace(".txt", ""), new a(strOptString));
                            break;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        return map;
    }

    public static File a(long j) {
        return new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
    }

    public static void a(String str, String str2) {
        File file;
        try {
            if (a == null) {
                com.apm.insight.e.g();
                String strB = com.apm.insight.l.a.b();
                if (strB == null) {
                    file = null;
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    a = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % 86400000)) / 86400000) + '/' + strB.replace(':', '_') + ".txt");
                    file = a;
                }
            } else {
                file = a;
            }
            if (file != null) {
                com.apm.insight.l.f.a(file, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
