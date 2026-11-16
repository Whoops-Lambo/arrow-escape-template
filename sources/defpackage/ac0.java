package defpackage;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Process;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.ironsource.G5;
import com.safedk.android.utils.n;
import io.p071bidmachine.NetworkRegistry;
import io.p071bidmachine.iab.vast.h;
import io.p071bidmachine.k0;
import io.p071bidmachine.x0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ac0 extends Thread {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac0(SimpleCache simpleCache, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.a = 1;
        this.c = simpleCache;
        this.b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream;
        String str3;
        String str4;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                super.run();
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL("https://www.facebook.com/adnw_logging/").openConnection();
                    try {
                        httpURLConnection2.setRequestMethod("POST");
                        httpURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                        httpURLConnection2.setRequestProperty(n.c, G5.M);
                        httpURLConnection2.setRequestProperty("Accept-Charset", "UTF-8");
                        httpURLConnection2.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setDoInput(true);
                        httpURLConnection2.connect();
                        String string = UUID.randomUUID().toString();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("attempt", "0");
                        DexLoadErrorReporter.a(context, jSONObject, string);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("subtype", "generic");
                        jSONObject2.put("subtype_code", "1320");
                        jSONObject2.put("caught_exception", "1");
                        jSONObject2.put("stacktrace", (String) this.c);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("id", UUID.randomUUID().toString());
                        jSONObject3.put("type", "debug");
                        StringBuilder sb = new StringBuilder("");
                        try {
                            sb.append(System.currentTimeMillis() / 1000);
                            jSONObject3.put("session_time", sb.toString());
                            StringBuilder sb2 = new StringBuilder("");
                            httpURLConnection = httpURLConnection2;
                            try {
                                sb2.append(System.currentTimeMillis() / 1000);
                                jSONObject3.put("time", sb2.toString());
                                jSONObject3.put("session_id", string);
                                jSONObject3.put("data", jSONObject2);
                                jSONObject3.put("attempt", "0");
                                DexLoadErrorReporter.a(context, jSONObject2, string);
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(jSONObject3);
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("data", jSONObject);
                                jSONObject4.put("events", jSONArray);
                                String string2 = jSONObject4.toString();
                                DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    dataOutputStream2.writeBytes("payload=" + URLEncoder.encode(string2, "UTF-8"));
                                    dataOutputStream2.flush();
                                    byte[] bArr = new byte[16384];
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStream = httpURLConnection.getInputStream();
                                    while (true) {
                                        try {
                                            int i = inputStream.read(bArr);
                                            try {
                                                if (i == -1) {
                                                    byteArrayOutputStream.flush();
                                                    try {
                                                        dataOutputStream2.close();
                                                        str3 = "Can't close connection.";
                                                        str4 = AudienceNetworkAds.TAG;
                                                    } catch (Exception e) {
                                                        str3 = "Can't close connection.";
                                                        str4 = AudienceNetworkAds.TAG;
                                                        Log.e(str4, str3, e);
                                                    }
                                                    try {
                                                        inputStream.close();
                                                        break;
                                                    } catch (Exception e2) {
                                                        Log.e(str4, str3, e2);
                                                    }
                                                    return;
                                                }
                                                try {
                                                    byteArrayOutputStream.write(bArr, 0, i);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    dataOutputStream = dataOutputStream2;
                                                    str = "Can't close connection.";
                                                    str2 = AudienceNetworkAds.TAG;
                                                }
                                                Log.e(str2, "Can't send error.", th);
                                                if (dataOutputStream != null) {
                                                    try {
                                                        break;
                                                    } catch (Exception e3) {
                                                    }
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        break;
                                                    } catch (Exception e4) {
                                                    }
                                                }
                                                if (httpURLConnection == null) {
                                                    return;
                                                }
                                                return;
                                            } finally {
                                                if (dataOutputStream != null) {
                                                    try {
                                                        dataOutputStream.close();
                                                    } catch (Exception e5) {
                                                        Log.e(str2, str, e5);
                                                    }
                                                    break;
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Exception e6) {
                                                        Log.e(str2, str, e6);
                                                    }
                                                    break;
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            str = "Can't close connection.";
                                            str2 = AudienceNetworkAds.TAG;
                                            dataOutputStream = dataOutputStream2;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    str = "Can't close connection.";
                                    str2 = AudienceNetworkAds.TAG;
                                    dataOutputStream = dataOutputStream2;
                                    inputStream = null;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                str = "Can't close connection.";
                                str2 = AudienceNetworkAds.TAG;
                                inputStream = null;
                                dataOutputStream = null;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            httpURLConnection = httpURLConnection2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        str = "Can't close connection.";
                        str2 = AudienceNetworkAds.TAG;
                        httpURLConnection = httpURLConnection2;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    str = "Can't close connection.";
                    str2 = AudienceNetworkAds.TAG;
                    inputStream = null;
                    httpURLConnection = null;
                }
                break;
            case 1:
                synchronized (((SimpleCache) this.c)) {
                    ((ConditionVariable) this.b).open();
                    ((SimpleCache) this.c).initialize();
                    ((SimpleCache) this.c).evictor.onCacheInitialized();
                    break;
                }
                return;
            case 2:
                super.run();
                NetworkRegistry.initializeNetworksAwait((Context) this.b);
                x0 x0Var = (x0) this.c;
                if (x0Var != null) {
                    ((CountDownLatch) ((k0) x0Var).b).countDown();
                    return;
                }
                return;
            case 3:
                h hVar = (h) this.c;
                hVar.c((Context) this.b, hVar.d, null);
                return;
            default:
                Process.setThreadPriority(((r44) this.c).b);
                ((Runnable) this.b).run();
                return;
        }
    }

    public ac0(h hVar, Context context) {
        this.a = 3;
        this.c = hVar;
        this.b = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac0(r44 r44Var, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.a = 4;
        this.b = runnable2;
        this.c = r44Var;
    }

    public /* synthetic */ ac0(int i, Context context, Object obj) {
        this.a = i;
        this.b = context;
        this.c = obj;
    }
}
