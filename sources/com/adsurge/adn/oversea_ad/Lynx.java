package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import androidx.media3.common.C;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Lynx {
    public HttpURLConnection a = null;
    public boolean b = false;

    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    public final int a(String str, byte[] bArr) {
        Context context;
        char c;
        int i;
        int i2;
        String property;
        int i3;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !(activeNetworkInfo.getState() == NetworkInfo.State.CONNECTING || activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED)) {
                c = 4;
            } else if (activeNetworkInfo.getType() == 1) {
                c = 1;
            } else if (activeNetworkInfo.getType() != 0 || (property = System.getProperty("http.proxyHost")) == null || property.length() <= 0) {
                c = 3;
            } else {
                try {
                    i3 = Integer.parseInt(System.getProperty("http.proxyPort"));
                } catch (NumberFormatException unused) {
                    i3 = -1;
                }
                if (i3 > 0) {
                    c = 2;
                } else {
                    c = 3;
                }
            }
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null || !message.contains("ACCESS_NETWORK_STATE")) {
                c = 4;
            }
        }
        int i4 = 0;
        if (c == 4) {
            i = -1052;
        } else {
            try {
                URL url = new URL(str);
                if (c == 2) {
                    Proxy.Type type = Proxy.Type.HTTP;
                    Cconst.a();
                    String property2 = System.getProperty("http.proxyHost");
                    Cconst.a();
                    try {
                        i2 = Integer.parseInt(System.getProperty("http.proxyPort"));
                    } catch (NumberFormatException unused2) {
                        i2 = -1;
                    }
                    this.a = (HttpURLConnection) url.openConnection(new Proxy(type, InetSocketAddress.createUnresolved(property2, i2)));
                } else {
                    this.a = (HttpURLConnection) url.openConnection();
                }
                this.a.setReadTimeout(15000);
                this.a.setConnectTimeout(15000);
                i = 0;
            } catch (MalformedURLException e) {
                e.printStackTrace();
                i = -1053;
            } catch (IOException e2) {
                e2.printStackTrace();
                i = -1056;
            } catch (IllegalArgumentException e3) {
                e3.printStackTrace();
                i = -1057;
            } catch (SecurityException e4) {
                e4.printStackTrace();
                i = -1058;
            } catch (UnsupportedOperationException e5) {
                e5.printStackTrace();
                i = -1059;
            } catch (Throwable th2) {
                th2.printStackTrace();
                i = -1000;
            }
        }
        if (i != 0) {
            return i;
        }
        this.b = false;
        try {
            try {
                int length = bArr.length;
                this.a.setDoOutput(true);
                this.a.setDoInput(true);
                this.a.setUseCaches(false);
                this.a.setRequestMethod("POST");
                this.a.setRequestProperty("Pragma", "no-cache");
                this.a.setRequestProperty("Cache-Control", "no-cache");
                this.a.setInstanceFollowRedirects(false);
                this.a.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, "Turing");
                this.a.setRequestProperty(com.safedk.android.utils.n.c, "*/*");
                this.a.setRequestProperty("Accept-Charset", G5.O);
                this.a.setRequestProperty("Content-Type", "application/octet-stream");
                this.a.setRequestProperty("Content-length", "" + length);
                try {
                    if (Build.VERSION.SDK != null) {
                        this.a.setRequestProperty("Connection", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
                    }
                } catch (Exception unused3) {
                }
                OutputStream outputStream = this.a.getOutputStream();
                outputStream.write(bArr);
                outputStream.flush();
                outputStream.close();
                int responseCode = this.a.getResponseCode();
                if (responseCode == 200) {
                    this.b = true;
                } else {
                    i4 = responseCode == -1 ? -2000 : (-2000) - responseCode;
                }
                return i4;
            } catch (IllegalStateException e6) {
                Log.e("TuringHttpUtil", "illegal state error:" + e6.getMessage());
                e6.printStackTrace();
                return -2061;
            } catch (ProtocolException e7) {
                Log.e("TuringHttpUtil", "protocol error:" + e7.getMessage());
                e7.printStackTrace();
                return -2051;
            } catch (IOException e8) {
                Log.e("TuringHttpUtil", "post io error:" + e8.getMessage());
                e8.printStackTrace();
                return -2056;
            }
        } catch (IllegalAccessError e9) {
            Log.e("TuringHttpUtil", "illegal access error:" + e9.getMessage());
            e9.printStackTrace();
            return -2060;
        } catch (Throwable th3) {
            Log.w("TuringHttpUtil", th3);
            th3.printStackTrace();
            return C.PRIORITY_PROCESSING_FOREGROUND;
        }
    }
}
