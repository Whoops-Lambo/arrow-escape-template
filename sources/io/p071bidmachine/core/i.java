package io.p071bidmachine.core;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.f;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import io.p071bidmachine.util.taskmanager.c;
import io.p071bidmachine.util.taskmanager.coroutine.b;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    @NonNull
    private static final c TASK_MANAGER = new b();

    @Nullable
    private b callback;

    @Nullable
    private c cancelCallback;

    @Nullable
    private ArrayList<g> contentEncoders;

    @Nullable
    private URLConnection currentConnection;
    private h currentState = h.a;

    @Nullable
    private f dataBinder;

    @Nullable
    private ArrayList<g> dataEncoders;

    @Nullable
    private Object errorResult;

    @NonNull
    private final e method;

    @Nullable
    private final String path;

    @Nullable
    private final Object requestData;

    @Nullable
    private Object requestResult;

    public abstract String getBaseUrl();

    public abstract Object obtainError(URLConnection uRLConnection, int i);

    public abstract Object obtainError(URLConnection uRLConnection, Throwable th);

    public abstract void prepareRequestParams(URLConnection uRLConnection);

    /* JADX WARN: Code duplicated, block: B:92:0x0152 A[DONT_GENERATE] */
    public static void access$100(i iVar) {
        URLConnection uRLConnection;
        URL url;
        InputStream inputStream;
        Throwable th;
        InputStream inputStreamUrlConnectionGetInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        f fVar;
        BufferedOutputStream bufferedOutputStream;
        h hVar = h.d;
        h hVar2 = h.c;
        iVar.currentState = h.b;
        try {
            if (iVar.path != null) {
                url = new URL(iVar.getBaseUrl() + "/" + iVar.path);
            } else {
                url = new URL(iVar.getBaseUrl());
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            try {
                iVar.currentConnection = uRLConnectionOpenConnection;
                e eVar = iVar.method;
                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnectionOpenConnection).setRequestMethod(eVar.a);
                } else {
                    eVar.getClass();
                }
                iVar.prepareRequestParams(uRLConnectionOpenConnection);
                byte[] bArrObtainRequestData = iVar.obtainRequestData(uRLConnectionOpenConnection);
                if (bArrObtainRequestData != null) {
                    byte[] bArrEncodeRequestData = iVar.encodeRequestData(uRLConnectionOpenConnection, bArrObtainRequestData);
                    uRLConnectionOpenConnection.setDoOutput(true);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(BidMachineNetworkBridge.urlConnectionGetOutputStream(uRLConnectionOpenConnection));
                        try {
                            bufferedOutputStream.write(bArrEncodeRequestData);
                            j.d(bufferedOutputStream);
                            j.a(bufferedOutputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            j.d(bufferedOutputStream);
                            j.a(bufferedOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedOutputStream = null;
                    }
                }
                try {
                    int iHttpUrlConnectionGetResponseCode = uRLConnectionOpenConnection instanceof HttpURLConnection ? BidMachineNetworkBridge.httpUrlConnectionGetResponseCode((HttpURLConnection) uRLConnectionOpenConnection) : -1;
                    if (iVar.isCanceled()) {
                        Handler handler = j.a;
                        if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                            BidMachineNetworkBridge.httpUrlConnectionDisconnect((HttpURLConnection) uRLConnectionOpenConnection);
                        }
                        iVar.currentConnection = null;
                        if (iVar.isCanceled()) {
                            return;
                        }
                        if (iVar.errorResult == null) {
                            hVar = hVar2;
                        }
                        iVar.currentState = hVar;
                        return;
                    }
                    if (iHttpUrlConnectionGetResponseCode != 200) {
                        iVar.errorResult = iVar.obtainError(uRLConnectionOpenConnection, iHttpUrlConnectionGetResponseCode);
                        inputStreamUrlConnectionGetInputStream = null;
                        byteArrayOutputStream = null;
                    } else {
                        inputStreamUrlConnectionGetInputStream = BidMachineNetworkBridge.urlConnectionGetInputStream(uRLConnectionOpenConnection);
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i = inputStreamUrlConnectionGetInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i);
                                    }
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                if (byteArray != null) {
                                    byteArray = iVar.decodeResponseData(uRLConnectionOpenConnection, byteArray);
                                }
                                if (byteArray != null && byteArray.length > 0 && (fVar = iVar.dataBinder) != null) {
                                    Object objCreateSuccessResult = fVar.createSuccessResult(iVar, uRLConnectionOpenConnection, byteArray);
                                    iVar.requestResult = objCreateSuccessResult;
                                    if (objCreateSuccessResult == null) {
                                        iVar.errorResult = iVar.dataBinder.createFailResult(iVar, uRLConnectionOpenConnection, byteArray);
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                j.d(byteArrayOutputStream);
                                j.a(byteArrayOutputStream);
                                j.a(inputStreamUrlConnectionGetInputStream);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            inputStream = inputStreamUrlConnectionGetInputStream;
                            th = th5;
                            InputStream inputStream2 = inputStream;
                            th = th;
                            inputStreamUrlConnectionGetInputStream = inputStream2;
                            byteArrayOutputStream = null;
                            j.d(byteArrayOutputStream);
                            j.a(byteArrayOutputStream);
                            j.a(inputStreamUrlConnectionGetInputStream);
                            throw th;
                        }
                    }
                    j.d(byteArrayOutputStream);
                    j.a(byteArrayOutputStream);
                    j.a(inputStreamUrlConnectionGetInputStream);
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        BidMachineNetworkBridge.httpUrlConnectionDisconnect((HttpURLConnection) uRLConnectionOpenConnection);
                    }
                    iVar.currentConnection = null;
                    if (iVar.isCanceled()) {
                        return;
                    }
                    if (iVar.errorResult == null) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    inputStream = null;
                }
            } catch (Throwable th7) {
                uRLConnection = uRLConnectionOpenConnection;
                th = th7;
                try {
                    a.i(th);
                    iVar.errorResult = iVar.obtainError(uRLConnection, th);
                } finally {
                    if (uRLConnection instanceof HttpURLConnection) {
                        BidMachineNetworkBridge.httpUrlConnectionDisconnect((HttpURLConnection) uRLConnection);
                    }
                    iVar.currentConnection = null;
                    if (!iVar.isCanceled()) {
                        if (iVar.errorResult == null) {
                            hVar = hVar2;
                        }
                        iVar.currentState = hVar;
                    }
                }
            }
        } catch (Throwable th8) {
            th = th8;
            uRLConnection = null;
        }
    }

    public void addContentEncoder(g gVar) {
        if (this.contentEncoders == null) {
            this.contentEncoders = new ArrayList<>();
        }
        this.contentEncoders.add(gVar);
    }

    public void addDataEncoder(g gVar) {
        if (this.dataEncoders == null) {
            this.dataEncoders = new ArrayList<>();
        }
        this.dataEncoders.add(gVar);
    }

    public void cancel() {
        this.currentState = h.e;
        c cVar = this.cancelCallback;
        if (cVar != null) {
            cVar.onCanceled();
        }
    }

    public byte[] decodeResponseData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<g> arrayList = this.contentEncoders;
        int i = 0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                g gVar = arrayList.get(i2);
                i2++;
                bArr = gVar.a(uRLConnection, bArr);
            }
        }
        ArrayList<g> arrayList2 = this.dataEncoders;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            while (i < size2) {
                g gVar2 = arrayList2.get(i);
                i++;
                bArr = gVar2.a(uRLConnection, bArr);
            }
        }
        return bArr;
    }

    public byte[] encodeRequestData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<g> arrayList = this.dataEncoders;
        int i = 0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                g gVar = arrayList.get(i2);
                i2++;
                g gVar2 = gVar;
                ((d) gVar2).getClass();
                uRLConnection.setRequestProperty("Accept-Encoding", "gzip");
                uRLConnection.setRequestProperty("Content-Encoding", "gzip");
                bArr = gVar2.b(bArr);
            }
        }
        ArrayList<g> arrayList2 = this.contentEncoders;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            while (i < size2) {
                g gVar3 = arrayList2.get(i);
                i++;
                g gVar4 = gVar3;
                ((d) gVar4).getClass();
                uRLConnection.setRequestProperty("Accept-Encoding", "gzip");
                uRLConnection.setRequestProperty("Content-Encoding", "gzip");
                bArr = gVar4.b(bArr);
            }
        }
        return bArr;
    }

    @NonNull
    public e getMethod() {
        return this.method;
    }

    @Nullable
    public String getPath() {
        return this.path;
    }

    public boolean isCanceled() {
        return this.currentState == h.e;
    }

    public byte[] obtainRequestData(URLConnection uRLConnection) throws Exception {
        f fVar = this.dataBinder;
        if (fVar == null) {
            return null;
        }
        fVar.prepareRequest(this, uRLConnection);
        this.dataBinder.prepareHeaders(this, uRLConnection);
        return this.dataBinder.obtainData(this, uRLConnection, this.requestData);
    }

    public void request(@NonNull c cVar) {
        try {
            cVar.execute(new f(this, 3));
        } catch (Throwable th) {
            a.i(th);
            b bVar = this.callback;
            if (bVar != null) {
                bVar.f(obtainError((URLConnection) null, th));
            }
        }
    }

    public void setCallback(@Nullable b bVar) {
        this.callback = bVar;
    }

    public void setCancelCallback(@Nullable c cVar) {
        this.cancelCallback = cVar;
    }

    public void setDataBinder(@Nullable f fVar) {
        this.dataBinder = fVar;
    }

    public i(e eVar, String str, Object obj) {
        this.method = eVar;
        this.path = str;
        this.requestData = obj;
    }

    public void request() {
        request(TASK_MANAGER);
    }
}
