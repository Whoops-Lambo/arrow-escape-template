package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class RunnableC4968s4 implements Runnable {

    @NotNull
    private final JSONObject a;

    @Override // java.lang.Runnable
    public void run() {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("preparing to send crashes report");
            URLConnection uRLConnectionOpenConnection = new URL(C4950r4.d().h).openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            httpURLConnection.setRequestProperty(com.safedk.android.utils.n.c, G5.M);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
            dataOutputStream.writeBytes(this.a.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
            Log.i("STATUS", String.valueOf(IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection)));
            Log.i("MSG", httpURLConnection.getResponseMessage());
            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            ironLog.verbose("sent crash report for type " + this.a.get("crashType") + " and date " + this.a.get("crashDate"));
        } catch (Exception e) {
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public RunnableC4968s4(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject;
    }
}
