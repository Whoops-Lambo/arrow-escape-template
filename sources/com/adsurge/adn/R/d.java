package com.adsurge.adn.R;

import com.adsurge.adn.X.h;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d implements com.adsurge.adn.G0.b {
    public abstract void a(com.adsurge.adn.H0.a aVar, int i, Exception exc);

    @Override // com.adsurge.adn.G0.b
    public final void a(com.adsurge.adn.H0.a aVar, Exception exc) {
        int i;
        if (exc instanceof SocketTimeoutException) {
            h.a("网络超时：网络请求出现异常" + exc.getMessage());
            i = 93002;
        } else if (exc instanceof UnknownHostException) {
            h.a("网络不可用：网络请求出现异常" + exc.getMessage());
            i = 93003;
        } else if (exc instanceof ConnectException) {
            h.a("网络异常：网络请求出现异常" + exc.getMessage());
            i = 93001;
        } else if (exc instanceof SSLHandshakeException) {
            h.a("网络异常：网络请求出现异常" + exc.getMessage());
            i = 93004;
        } else {
            h.a("网络异常：网络请求出现异常" + exc.getMessage());
            i = 93000;
        }
        a(aVar, i, exc);
        com.adsurge.adn.I.a.a();
    }
}
