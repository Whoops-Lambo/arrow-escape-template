package com.bytedance.sdk.component.ahm.kgy.kgy.kgy;

import com.bytedance.sdk.component.ahm.kgy.vs;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class gf extends vs {
    InputStream ahm;
    HttpURLConnection kgy;
    InputStream rz;

    @Override // com.bytedance.sdk.component.ahm.kgy.vs
    public byte[] uq() {
        try {
            if (this.rz == null) {
                return new byte[0];
            }
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = this.ahm.read(bArr);
                if (i == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VryMV5X7bArho15RPxROCFLQ=", "des5pwaveciOWdJ/gxW5", "Wfc5kBA=", 86);
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.vs
    public String ahm() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.ahm));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    close();
                    return string;
                }
                stringBuffer.append(line + "\n");
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VryMV5X7bArho15RPxROCFLQ=", "des5pwaveciOWdJ/gxW5", "SPo/nA27", 53);
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.vs, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.ahm.close();
            PangleNetworkBridge.httpUrlConnectionDisconnect(this.kgy);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VryMV5X7bArho15RPxROCFLQ=", "des5pwaveciOWdJ/gxW5", "WOIihgY=", 63);
        }
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.vs
    public com.bytedance.sdk.component.ahm.kgy.gf ct() {
        if (this.kgy.getContentType() != null) {
            return com.bytedance.sdk.component.ahm.kgy.gf.kgy(this.kgy.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.vs
    public long kgy() {
        try {
            return this.kgy.getContentLength();
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VryMV5X7bArho15RPxROCFLQ=", "des5pwaveciOWdJ/gxW5", "WOEjgQayfeuFRNBJhA==", 35);
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.vs
    public String noq() {
        return this.kgy.getContentEncoding();
    }

    @Override // com.bytedance.sdk.component.ahm.kgy.vs
    public InputStream rz() {
        return this.ahm;
    }

    public gf(HttpURLConnection httpURLConnection) throws IOException {
        this.kgy = httpURLConnection;
        InputStream inputStreamUrlConnectionGetInputStream = PangleNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
        this.rz = inputStreamUrlConnectionGetInputStream;
        this.ahm = new yo(inputStreamUrlConnectionGetInputStream, httpURLConnection);
    }

    public gf(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.kgy = httpURLConnection;
        this.rz = inputStream;
        this.ahm = new yo(inputStream, httpURLConnection);
    }
}
