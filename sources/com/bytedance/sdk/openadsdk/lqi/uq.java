package com.bytedance.sdk.openadsdk.lqi;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.G5;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class uq {
    private rz ahm;
    private noq rz;
    private kgy uq;
    private final String kgy = "StrategyCenter";
    private int ct = 0;
    private final ConcurrentHashMap<String, Object> noq = new ConcurrentHashMap<>();
    private Runnable yo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.lqi.uq.2
        @Override // java.lang.Runnable
        public void run() {
            uq.this.rz();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void rz() {
        noq noqVar = this.rz;
        if (noqVar == null || noqVar.ct() == null || this.rz.noq() == null || this.rz.fi()) {
            return;
        }
        this.rz.kgy().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lqi.uq.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStreamUrlConnectionGetOutputStream;
                uq.this.ct++;
                try {
                    if (uq.this.uq != null) {
                        uq.this.uq.kgy();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uq.this.rz.ct()).openConnection();
                    if (uq.this.rz.yo() != null && uq.this.rz.yo().size() > 0) {
                        for (Map.Entry<String, String> entry : uq.this.rz.yo().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", G5.M);
                    try {
                        outputStreamUrlConnectionGetOutputStream = PangleNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
                        try {
                            outputStreamUrlConnectionGetOutputStream.write(uq.this.rz.noq().toString().getBytes());
                            outputStreamUrlConnectionGetOutputStream.close();
                            int iHttpUrlConnectionGetResponseCode = PangleNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                            Log.i("StrategyCenter", "executing strategy fetch");
                            if (iHttpUrlConnectionGetResponseCode == 200) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(PangleNetworkBridge.urlConnectionGetInputStream(httpURLConnection)));
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        stringBuffer.append(line);
                                    }
                                }
                                bufferedReader.close();
                                JSONObject jSONObjectKgy = uq.this.rz.kgy(PangleNetworkBridge.jsonObjectInit(stringBuffer.toString()));
                                uq.this.ahm.ahm();
                                uq.this.uq();
                                uq.this.ahm.kgy(jSONObjectKgy);
                                if (uq.this.uq != null) {
                                    uq.this.uq.ahm();
                                }
                            } else if (uq.this.uq != null) {
                                uq.this.uq.kgy(iHttpUrlConnectionGetResponseCode, httpURLConnection.getResponseMessage());
                            }
                            uq.this.ahm.kgy("local_last_update_time", System.currentTimeMillis());
                            uq.this.kgy();
                        } catch (Throwable th) {
                            th = th;
                            if (outputStreamUrlConnectionGetOutputStream != null) {
                                outputStreamUrlConnectionGetOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStreamUrlConnectionGetOutputStream = null;
                    }
                } catch (Throwable th3) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aPo/lBe5bt6jT9lJiQPkeQ==", "Sfsj", 110);
                    Log.e("StrategyCenter", th3.getMessage() == null ? "error " : th3.getMessage());
                    if (uq.this.uq != null) {
                        uq.this.uq.kgy(-1, th3.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uq() {
        this.noq.clear();
    }

    public void kgy() {
        if (this.rz != null) {
            int i = 3600000;
            int iKgy = this.ahm.kgy("req_interval", 3600000);
            long j = 0;
            long jAhm = this.ahm.ahm("local_last_update_time", 0L);
            if (iKgy >= 600000 && iKgy <= 86400000) {
                i = iKgy;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jAhm;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(jCurrentTimeMillis)));
            if (jCurrentTimeMillis >= 0) {
                long j2 = i;
                if (jCurrentTimeMillis <= j2) {
                    j = j2 - jCurrentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j)));
            this.rz.uq().removeCallbacks(this.yo);
            if (this.ct > 24) {
                return;
            }
            this.rz.uq().postDelayed(this.yo, j);
        }
    }

    public uq(noq noqVar) {
        this.ahm = null;
        yo yoVar = new yo(noqVar);
        this.rz = yoVar;
        String strRz = yoVar.rz();
        if (!TextUtils.isEmpty(strRz) && !strRz.startsWith("pag")) {
            strRz = "pag_".concat(strRz);
        }
        this.ahm = new rz(this.rz.ahm(), strRz);
    }

    public rz ahm() {
        return this.ahm;
    }

    public void kgy(kgy kgyVar) {
        this.uq = kgyVar;
    }

    public int kgy(String str, int i) {
        rz rzVar = this.ahm;
        return rzVar == null ? i : rzVar.kgy(str, i);
    }

    public String kgy(String str, String str2) {
        rz rzVar = this.ahm;
        return rzVar == null ? str2 : rzVar.kgy(str, str2);
    }

    public boolean kgy(String str, boolean z) {
        rz rzVar = this.ahm;
        return rzVar == null ? z : rzVar.kgy(str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r7.getClass().isInstance(r0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T kgy(java.lang.String r6, T r7, com.bytedance.sdk.openadsdk.lqi.ahm.kgy<T> r8) {
        /*
            r5 = this;
            com.bytedance.sdk.openadsdk.lqi.rz r0 = r5.ahm
            if (r0 == 0) goto L40
            if (r6 != 0) goto L7
            goto L40
        L7:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r5.noq
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r1 = "XOs5ugG2bMSU"
            java.lang.String r2 = "aPo/lBe5bt6jT9lJiQM="
            java.lang.String r3 = "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM"
            if (r0 == 0) goto L2a
            if (r7 == 0) goto L29
            java.lang.Class r4 = r7.getClass()     // Catch: java.lang.Exception -> L22
            boolean r4 = r4.isInstance(r0)     // Catch: java.lang.Exception -> L22
            if (r4 == 0) goto L2a
            goto L29
        L22:
            r0 = move-exception
            r4 = 223(0xdf, float:3.12E-43)
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(r0, r3, r2, r1, r4)
            goto L2a
        L29:
            return r0
        L2a:
            if (r8 == 0) goto L40
            com.bytedance.sdk.openadsdk.lqi.rz r0 = r5.ahm     // Catch: java.lang.Exception -> L3a
            java.lang.Object r8 = r0.kgy(r6, r7, r8)     // Catch: java.lang.Exception -> L3a
            if (r8 == 0) goto L40
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r5 = r5.noq     // Catch: java.lang.Exception -> L3a
            r5.put(r6, r8)     // Catch: java.lang.Exception -> L3a
            return r8
        L3a:
            r5 = move-exception
            r6 = 235(0xeb, float:3.3E-43)
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(r5, r3, r2, r1, r6)
        L40:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.lqi.uq.kgy(java.lang.String, java.lang.Object, com.bytedance.sdk.openadsdk.lqi.ahm$kgy):java.lang.Object");
    }
}
