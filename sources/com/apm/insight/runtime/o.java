package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {
    private static o a;
    private File b;
    private File c;
    private File d;
    private Context e;
    private a f = null;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        private long a;
        private long b;
        private File c;
        private JSONObject d;

        public static /* synthetic */ boolean a(a aVar, long j) {
            long j2 = aVar.a;
            if (j2 > j && j2 - j > 604800000) {
                return true;
            }
            long j3 = aVar.b;
            if (j3 >= j || j - j3 <= 604800000) {
                return aVar.c.lastModified() < j && j - aVar.c.lastModified() > 604800000;
            }
            return true;
        }

        public static /* synthetic */ void d(a aVar) {
            aVar.c.delete();
        }

        private a(File file) {
            this.d = null;
            this.c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.a = Long.parseLong(strArrSplit[0]);
                this.b = Long.parseLong(strArrSplit[1]);
                return;
            }
            String name = file.getName();
            if (!TextUtils.isEmpty(name) && name.length() >= 13) {
                String strSubstring = name.substring(0, 13);
                if (TextUtils.isDigitsOnly(strSubstring)) {
                    long j = Long.parseLong(strSubstring);
                    this.a = j;
                    this.b = j;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject a() {
            if (this.d == null) {
                try {
                    this.d = new JSONObject(com.apm.insight.l.f.a(this.c.getAbsolutePath(), "\n"));
                } catch (Throwable unused) {
                }
                if (this.d == null) {
                    this.d = new JSONObject();
                }
            }
            return this.d;
        }

        public /* synthetic */ a(File file, byte b) {
            this(file);
        }
    }

    private ArrayList<a> c(final String str) {
        File[] fileArrListFiles = this.b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.o.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (fileArrListFiles != null) {
            com.apm.insight.a.a((Object) ("foundRuntimeContextFiles " + fileArrListFiles.length));
            byte b = 0;
            a aVar = null;
            for (File file : fileArrListFiles) {
                try {
                    a aVar2 = new a(file, b);
                    arrayList.add(aVar2);
                    if (this.f == null && ".ctx".equals(str) && (aVar == null || aVar2.b >= aVar.b)) {
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    j.a(th, "NPTH_CATCH");
                }
            }
            if (this.f == null && aVar != null) {
                this.f = aVar;
            }
        }
        return arrayList;
    }

    @Nullable
    public final JSONObject a(long j) {
        JSONObject jSONObject;
        File file;
        String strA;
        ArrayList<a> arrayListC = c(".ctx");
        int size = arrayListC.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            jSONObject = null;
            if (i2 >= size) {
                file = null;
                break;
            }
            a aVar = arrayListC.get(i2);
            i2++;
            a aVar2 = aVar;
            if (j >= aVar2.a && j <= aVar2.b) {
                file = aVar2.c;
                break;
            }
        }
        if (file == null) {
            ArrayList<a> arrayListC2 = c(".ctx");
            int size2 = arrayListC2.size();
            a aVar3 = null;
            while (i < size2) {
                a aVar4 = arrayListC2.get(i);
                i++;
                a aVar5 = aVar4;
                if (aVar3 == null || Math.abs(aVar3.b - j) > Math.abs(aVar5.b - j)) {
                    aVar3 = aVar5;
                }
            }
            file = aVar3 == null ? null : aVar3.c;
            i = 1;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    jSONObject = new JSONObject(strA);
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                }
            } catch (Throwable th2) {
                th = th2;
                strA = null;
            }
        }
        if (jSONObject != null && i != 0) {
            try {
                jSONObject.put("unauthentic_version", 1);
            } catch (JSONException e) {
                com.apm.insight.c.a();
                j.a(e, "NPTH_CATCH");
            }
        }
        return jSONObject;
    }

    @Nullable
    public final JSONArray b(long j) {
        File file;
        String strA;
        ArrayList<a> arrayListC = c(".allData");
        int size = arrayListC.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                file = null;
                break;
            }
            a aVar = arrayListC.get(i2);
            i2++;
            a aVar2 = aVar;
            if (j >= aVar2.a && j <= aVar2.b) {
                file = aVar2.c;
                break;
            }
        }
        if (file == null) {
            ArrayList<a> arrayListC2 = c(".allData");
            int size2 = arrayListC2.size();
            a aVar3 = null;
            while (i < size2) {
                a aVar4 = arrayListC2.get(i);
                i++;
                a aVar5 = aVar4;
                if (aVar3 == null || Math.abs(aVar3.b - j) > Math.abs(aVar5.b - j)) {
                    aVar3 = aVar5;
                }
            }
            file = aVar3 == null ? null : aVar3.c;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    return new JSONArray(strA);
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                strA = null;
            }
        }
        return null;
    }

    private o(Context context) {
        File fileC = com.apm.insight.l.j.c(context);
        if (!fileC.exists() || (!fileC.isDirectory() && fileC.delete())) {
            fileC.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.b = fileC;
        this.c = new File(fileC, "did");
        this.d = new File(fileC, "device_uuid");
        this.e = context;
    }

    public final String c() {
        try {
            return com.apm.insight.l.f.a(this.d.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void b(String str) {
        try {
            com.apm.insight.l.f.a(this.d, str, false);
        } catch (Throwable unused) {
        }
    }

    public final String b() {
        try {
            return com.apm.insight.l.f.a(this.c.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    public final void a(Map<String, Object> map, JSONArray jSONArray) {
        JSONObject jSONObjectA = Header.a(this.e).a(map);
        if (Header.c(jSONObjectA)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f == null) {
            c(".ctx");
        }
        a aVar = this.f;
        if (aVar != null) {
            JSONObject jSONObjectA2 = aVar.a();
            if (!Header.c(jSONObjectA2)) {
                if (!Header.c(jSONObjectA)) {
                    if (String.valueOf(jSONObjectA.opt("update_version_code")).equals(String.valueOf(jSONObjectA2.opt("update_version_code"))) && Header.d(jSONObjectA2)) {
                        a(aVar.a, jCurrentTimeMillis, jSONObjectA, jSONArray);
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        com.apm.insight.l.f.a(aVar.c);
                    } else {
                        a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
                    }
                }
            } else {
                a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
            }
            try {
                ArrayList<a> arrayListC = c("");
                if (arrayListC.size() <= 6) {
                    return;
                }
                int size = arrayListC.size();
                int i = 0;
                while (i < size) {
                    a aVar2 = arrayListC.get(i);
                    i++;
                    a aVar3 = aVar2;
                    if (a.a(aVar3, jCurrentTimeMillis)) {
                        a.d(aVar3);
                    }
                }
                return;
            } catch (Throwable th) {
                com.apm.insight.c.a();
                j.a(th, "NPTH_CATCH");
                return;
            }
        }
        a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
    }

    private void a(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.b, j + "-" + j2 + ".ctx");
        File file2 = new File(this.b, j + "-" + j2 + ".allData");
        try {
            com.apm.insight.l.f.a(file, jSONObject);
            com.apm.insight.l.f.a(file2, jSONArray);
            this.f = new a(file, (byte) 0);
        } catch (IOException e) {
            com.apm.insight.c.a();
            j.a(e, "NPTH_CATCH");
        }
    }

    public final void a(String str) {
        try {
            com.apm.insight.l.f.a(this.c, str, false);
        } catch (Throwable unused) {
        }
    }

    public static o a() {
        if (a == null) {
            a = new o(com.apm.insight.e.g());
        }
        return a;
    }
}
