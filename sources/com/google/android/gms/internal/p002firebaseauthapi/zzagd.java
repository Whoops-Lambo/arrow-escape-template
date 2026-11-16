package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.G5;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzagd {
    public static void b(String str, zzaga zzagaVar, zzafi zzafiVar, zzafj zzafjVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(60000);
            zzafjVar.a(httpURLConnection);
            c(httpURLConnection, zzagaVar, zzafiVar);
        } catch (SocketTimeoutException unused) {
            zzagaVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzagaVar.zza("<<Network Error>>");
        } catch (IOException e) {
            zzagaVar.zza(e.getMessage());
        }
    }

    public static void a(String str, zzaff zzaffVar, zzaga zzagaVar, zzafi zzafiVar, zzafj zzafjVar) {
        try {
            Preconditions.checkNotNull(zzaffVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzaffVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", G5.M);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(60000);
            zzafjVar.a(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(AdMobNetworkBridge.urlConnectionGetOutputStream(httpURLConnection), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                c(httpURLConnection, zzagaVar, zzafiVar);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (NullPointerException e) {
            e = e;
            zzagaVar.zza(e.getMessage());
        } catch (SocketTimeoutException unused) {
            zzagaVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzagaVar.zza("<<Network Error>>");
        } catch (IOException e2) {
            e = e2;
            zzagaVar.zza(e.getMessage());
        } catch (JSONException e3) {
            e = e3;
            zzagaVar.zza(e.getMessage());
        }
    }

    public static void c(HttpURLConnection httpURLConnection, zzaga zzagaVar, zzafi zzafiVar) {
        boolean z;
        InputStream errorStream;
        try {
            try {
                int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                boolean z2 = false;
                if (iHttpUrlConnectionGetResponseCode >= 200 && iHttpUrlConnectionGetResponseCode < 300) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    errorStream = AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                } else {
                    errorStream = httpURLConnection.getErrorStream();
                }
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb.append(line);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String string = sb.toString();
                if (iHttpUrlConnectionGetResponseCode >= 200 && iHttpUrlConnectionGetResponseCode < 300) {
                    z2 = true;
                }
                if (!z2) {
                    zzagaVar.zza(zzafg.b(string));
                } else {
                    zzagaVar.i(zzafg.a(string, zzafiVar));
                }
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (zzacw e) {
                e = e;
                zzagaVar.zza(e.getMessage());
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (SocketTimeoutException unused) {
                zzagaVar.zza("TIMEOUT");
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (IOException e2) {
                e = e2;
                zzagaVar.zza(e.getMessage());
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            }
        } catch (Throwable th3) {
            AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            throw th3;
        }
    }
}
