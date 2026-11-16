package com.bytedance.sdk.component.ahm.kgy.kgy.kgy;

import android.text.TextUtils;
import com.bytedance.sdk.component.ahm.kgy.at;
import com.bytedance.sdk.component.ahm.kgy.kus;
import com.bytedance.sdk.component.ahm.kgy.vs;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class fi extends kus {
    public static int ahm = -2;
    public static int kgy = -1;
    final int ct;
    String noq;
    HttpURLConnection rz;
    at uq;
    String yo;

    @Override // com.bytedance.sdk.component.ahm.kgy.kus
    public long ahm() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.kus
    public String ct() throws IOException {
        return !TextUtils.isEmpty(this.noq) ? this.noq : this.rz.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.kus
    public String gf() {
        return this.yo;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.kus
    public long kgy() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.kus
    public vs noq() {
        com.bytedance.sdk.component.rz.kgy.kgy kgyVar;
        com.bytedance.sdk.component.rz.kgy.kgy kgyVar2;
        at atVar = this.uq;
        if (atVar != null && (kgyVar2 = atVar.ahm) != null) {
            kgyVar2.nu();
        }
        gf gfVar = null;
        try {
            HttpURLConnection httpURLConnection = this.rz;
            if (httpURLConnection == null) {
                return null;
            }
            return new gf(httpURLConnection);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VryMV5X7bArho15RPxROCFLQ=", "des5pwaveciOWdI=", "WeEpjA==", 100);
            HttpURLConnection httpURLConnection2 = this.rz;
            gfVar = new gf(httpURLConnection2, httpURLConnection2.getErrorStream());
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VryMV5X7bArho15RPxROCFLQ=", "des5pwaveciOWdI=", "WeEpjA==", 103);
            th.getMessage();
        } finally {
            at atVar2 = this.uq;
            if (atVar2 != null && (kgyVar = atVar2.ahm) != null) {
                kgyVar.twf();
            }
        }
        return gfVar;
    }

    public at nu() {
        return this.uq;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.kus
    public Map<String, List<String>> ra() {
        HttpURLConnection httpURLConnection = this.rz;
        return httpURLConnection == null ? new HashMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.kus
    public int rz() {
        return this.ct;
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.kus
    public boolean uq() {
        int i = this.ct;
        return i >= 200 && i < 300;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.kus
    public com.bytedance.sdk.component.ahm.kgy.noq yo() {
        if (this.rz == null) {
            return new com.bytedance.sdk.component.ahm.kgy.noq(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.rz.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || rz() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.ahm.kgy.noq((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public fi(int i, String str, at atVar, String str2) {
        this.noq = str;
        this.uq = atVar;
        this.ct = i;
        this.yo = str2;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.kus, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            vs vsVarNoq = noq();
            if (vsVarNoq != null) {
                vsVarNoq.close();
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VryMV5X7bArho15RPxROCFLQ=", "des5pwaveciOWdI=", "WOIihgY=", 155);
        }
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.kus
    public com.bytedance.sdk.component.ahm.kgy.ra fi() {
        if (nu() != null && nu().ahm != null) {
            return new com.bytedance.sdk.component.ahm.kgy.ra(nu().ahm);
        }
        return null;
    }

    public void kgy(String str) {
        this.yo = str;
    }

    public fi(int i, String str, at atVar) {
        this.noq = str;
        this.uq = atVar;
        this.ct = i;
    }

    public fi(HttpURLConnection httpURLConnection, at atVar, int i) {
        this.rz = httpURLConnection;
        this.uq = atVar;
        this.ct = i;
    }
}
