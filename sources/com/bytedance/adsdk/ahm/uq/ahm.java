package com.bytedance.adsdk.ahm.uq;

import com.ironsource.C4887nc;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ahm implements noq {
    @Override // com.bytedance.adsdk.ahm.uq.noq
    public uq kgy(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(C4887nc.a);
        httpURLConnection.connect();
        return new kgy(httpURLConnection);
    }
}
