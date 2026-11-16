package com.adsurge.adn.p008b0;

import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.adsurge.adn.E0.c;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.Y0.v;
import com.adsurge.adn.Z.a;
import com.adsurge.adn.Z.e;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class j implements d, Callable {
    public b a;

    public final boolean b(b bVar) {
        int length;
        byte[] bArr = bVar.j;
        if (bArr == null || (length = bArr.length) == 0) {
            return true;
        }
        int i = 0;
        while (i < length && bArr[i] == 0) {
            i++;
        }
        if (i != length) {
            return false;
        }
        a(bVar.b == null ? -3 : -2, null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws Throwable {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        int i;
        e eVarA = a.a();
        if (eVarA.b()) {
            return Boolean.TRUE;
        }
        BufferedWriter bufferedWriter = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(a.d()).openConnection();
            try {
                int i2 = 4000;
                if (this.a.i) {
                    i = 2000;
                } else {
                    i = 4000;
                }
                httpURLConnection.setConnectTimeout(i);
                if (this.a.i) {
                    i2 = 2000;
                }
                httpURLConnection.setReadTimeout(i2);
                boolean z = true;
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                e.c cVarF = eVarA.f();
                httpURLConnection.setRequestProperty("Content-Type", cVarF.a());
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), com.adsurge.adn.B0.a.a));
                try {
                    bufferedWriter2.write(cVarF.a(this.a.j));
                    bufferedWriter2.flush();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        a(responseCode, null);
                        Boolean bool = Boolean.FALSE;
                        try {
                            bufferedWriter2.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused2) {
                        }
                        return bool;
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        }
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        int iA = cVarF.a(jSONObject);
                        if (iA != 0) {
                            a(iA, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
                        }
                        if (iA != 0) {
                            z = false;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z);
                        try {
                            bufferedWriter2.close();
                        } catch (Throwable unused3) {
                        }
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused4) {
                        }
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused5) {
                        }
                        return boolValueOf;
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (Throwable unused6) {
                            }
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused7) {
                            }
                        }
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                                throw th;
                            } catch (Throwable unused8) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = null;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    @Override // com.adsurge.adn.p008b0.d
    public boolean a(b bVar) {
        String stackTraceString;
        int i;
        if (TextUtils.isEmpty(a.d())) {
            a(-1, null);
            return false;
        }
        if (b(bVar)) {
            return false;
        }
        c cVarB = com.adsurge.adn.D0.a.c().d().b();
        if (cVarB != c.WIFI && cVarB != c.NET_4G && cVarB != c.NET_5G) {
            return false;
        }
        this.a = bVar;
        FutureTask futureTask = new FutureTask(this);
        if (bVar.i) {
            com.adsurge.adn.Z.c.a().postAtFrontOfQueue(futureTask);
        } else {
            futureTask.run();
        }
        try {
            Boolean bool = (Boolean) futureTask.get();
            if (bool == null || !bool.booleanValue()) {
                return false;
            }
            File file = bVar.h;
            if (file == null) {
                return true;
            }
            file.delete();
            return true;
        } catch (InterruptedException e) {
            a(-998, Log.getStackTraceString(e));
            return false;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof SocketTimeoutException) {
                stackTraceString = cause.getMessage();
                i = -4;
            } else {
                stackTraceString = Log.getStackTraceString(cause);
                i = -999;
            }
            a(i, stackTraceString);
            return false;
        } catch (Throwable th) {
            a(-1000, Log.getStackTraceString(th));
            return false;
        }
    }

    public final void a(int i, String str) {
        com.adsurge.adn.Y0.e eVar = new com.adsurge.adn.Y0.e(a.a().g().a());
        eVar.e(i);
        if (!TextUtils.isEmpty(str)) {
            d dVar = new d();
            dVar.a(NotificationCompat.CATEGORY_MESSAGE, str);
            eVar.a(dVar);
        }
        v.a(eVar);
    }
}
