package com.vungle.ads.internal.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.R;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.az2;
import defpackage.er;
import defpackage.h00;
import defpackage.j52;
import defpackage.k52;
import defpackage.nq2;
import defpackage.qb3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public final Context a;
    public final Handler b;
    public AtomicReference c;
    public AtomicReference d;

    public final void b() {
        this.b.post(new qb3(this, 4));
    }

    public c(Context context) {
        context.getClass();
        this.a = context;
        this.b = new Handler(Looper.getMainLooper());
        this.c = new AtomicReference(null);
        this.d = new AtomicReference(null);
    }

    public final void a(File file) {
        file.getClass();
        ArrayList arrayList = new ArrayList();
        File file2 = new File(file, "omsdk.js");
        if (!file2.exists()) {
            boolean z = u.a;
            StringBuilder sbA = l.a("injecting omsdk.js to ");
            sbA.append(file2.getAbsolutePath());
            t.a("OMInjector", sbA.toString());
            String strA = a();
            if (strA != null) {
                FileWriter fileWriter = new FileWriter(file2);
                try {
                    fileWriter.write(strA);
                    fileWriter.flush();
                    fileWriter.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        nq2.e(fileWriter, th);
                        throw th2;
                    }
                }
            }
            arrayList.add(file2);
        }
        File file3 = new File(file, "omsdk-session.js");
        if (!file3.exists()) {
            boolean z2 = u.a;
            StringBuilder sbA2 = l.a("injecting omsdk-session.js to ");
            sbA2.append(file3.getAbsolutePath());
            t.a("OMInjector", sbA2.toString());
            String strA2 = (String) this.d.get();
            if (strA2 == null) {
                strA2 = a(R.raw.omid_session_client_v1_6_9);
                this.d.set(strA2);
            }
            if (strA2 != null) {
                FileWriter fileWriter2 = new FileWriter(file3);
                try {
                    fileWriter2.write(strA2);
                    fileWriter2.flush();
                    fileWriter2.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        nq2.e(fileWriter2, th3);
                        throw th4;
                    }
                }
            }
            arrayList.add(file3);
        }
    }

    public static final void a(c cVar) {
        Object j52Var;
        cVar.getClass();
        try {
            if (!Omid.isActive()) {
                Omid.activate(cVar.a);
            }
            j52Var = az2.a;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Throwable thB = k52.b(j52Var);
        if (thB != null) {
            boolean z = u.a;
            StringBuilder sbA = l.a("error: ");
            sbA.append(thB.getLocalizedMessage());
            t.b("OMInjector", sbA.toString());
        }
    }

    public final String a() {
        String str = (String) this.c.get();
        if (str != null) {
            return str;
        }
        String strA = a(R.raw.omsdk_v1_6_9);
        this.c.set(strA);
        return strA;
    }

    public final String a(int i) {
        Object j52Var;
        try {
            InputStream inputStreamOpenRawResource = this.a.getResources().openRawResource(i);
            inputStreamOpenRawResource.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, er.a), 8192);
            try {
                j52Var = h00.q(bufferedReader);
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    nq2.e(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            j52Var = new j52(th3);
        }
        if (j52Var instanceof j52) {
            j52Var = null;
        }
        return (String) j52Var;
    }
}
