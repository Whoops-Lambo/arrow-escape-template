package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.k0;
import defpackage.bi0;
import defpackage.lz;
import defpackage.s7;
import defpackage.t7;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a0 {
    public final com.facebook.internal.e a;
    public final String b;
    public ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public int e;

    public final synchronized void a(f fVar) {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            fVar.getClass();
            if (this.c.size() + this.d.size() >= 1000) {
                this.e++;
            } else {
                this.c.add(fVar);
            }
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public final synchronized void b(boolean z) {
        if (lz.a.contains(this)) {
            return;
        }
        if (z) {
            try {
                this.c.addAll(this.d);
            } catch (Throwable th) {
                lz.a(this, th);
                return;
            }
        }
        this.d.clear();
        this.e = 0;
    }

    public final synchronized List c() {
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.c;
            this.c = new ArrayList();
            return arrayList;
        } catch (Throwable th) {
            lz.a(this, th);
            return null;
        }
    }

    public final int d(k0 k0Var, Context context, boolean z, boolean z2) {
        Throwable th;
        Throwable th2;
        if (lz.a.contains(this)) {
            return 0;
        }
        try {
            try {
                synchronized (this) {
                    try {
                        int i = this.e;
                        bi0.b(this.c);
                        this.d.addAll(this.c);
                        this.c.clear();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        ArrayList arrayList = this.d;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            try {
                                Object obj = arrayList.get(i2);
                                i2++;
                                f fVar = (f) obj;
                                if (z || !fVar.c) {
                                    jSONArray.put(fVar.a);
                                    jSONArray2.put(fVar.b);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            e(k0Var, context, i, jSONArray, jSONArray2, z2);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                    lz.a(this, th);
                    return 0;
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
            }
        } catch (Throwable th7) {
            th = th7;
            th = th;
        }
    }

    public final void e(k0 k0Var, Context context, int i, JSONArray jSONArray, JSONArray jSONArray2, boolean z) {
        JSONObject jSONObject;
        try {
            if (lz.a.contains(this)) {
                return;
            }
            try {
                jSONObject = t7.a(s7.b, this.a, this.b, z, context);
                if (this.e > 0) {
                    jSONObject.put("num_skipped_events", i);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            k0Var.c = jSONObject;
            Bundle bundle = k0Var.d;
            String string = jSONArray.toString();
            string.getClass();
            bundle.putString("custom_events", string);
            if (com.facebook.internal.b0.b(com.facebook.internal.z.IapLoggingLib5To7)) {
                bundle.putString("operational_parameters", jSONArray2.toString());
            }
            k0Var.e = string;
            k0Var.d = bundle;
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public a0(com.facebook.internal.e eVar, String str) {
        this.a = eVar;
        this.b = str;
    }
}
