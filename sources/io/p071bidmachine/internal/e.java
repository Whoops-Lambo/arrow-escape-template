package io.p071bidmachine.internal;

import android.content.Context;
import defpackage.cn0;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    public final Context a;

    public final void a(d dVar) {
        long j = dVar.a;
        try {
            File file = new File(this.a.getFilesDir(), "bm/quality/startup");
            file.mkdirs();
            if (file.exists()) {
                File file2 = new File(file, j + ".trace.json");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("startInitTime", j);
                jSONObject.put("initDuration", dVar.b);
                jSONObject.put("finished", dVar.c);
                String string = jSONObject.toString();
                string.getClass();
                cn0.G(file2, string);
            }
        } catch (Throwable unused) {
        }
    }

    public e(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
    }
}
