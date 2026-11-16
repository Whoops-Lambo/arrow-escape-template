package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.h50;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.ironsource.d6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class CallableC4702d6 implements Callable<C4773h5> {
    private static final String d = "FileWorkerThread";
    private static final String e = "X-Android-Protocols";
    private static final String f = "http/1.1,h2";
    private final C4755g5 a;
    private final String b;
    private long c;

    /* JADX WARN: Code duplicated, block: B:112:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0193 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #6 {all -> 0x018f, blocks: (B:109:0x018b, B:113:0x0193), top: B:118:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:118:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    public C4773h5 a(String str, int i, int i2, int i3, boolean z) throws Throwable {
        HttpURLConnection httpURLConnection;
        C4773h5 c4773h5 = new C4773h5();
        if (TextUtils.isEmpty(str)) {
            c4773h5.a(str);
            c4773h5.a(1007);
            return c4773h5;
        }
        InputStream inputStreamUrlConnectionGetInputStream = null;
        int iHttpUrlConnectionGetResponseCode = 0;
        try {
            try {
                try {
                    try {
                        URL url = new URL(str);
                        url.toURI();
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                        try {
                            httpURLConnection.setRequestMethod(C4887nc.a);
                            if (z) {
                                try {
                                    httpURLConnection.setRequestProperty(e, f);
                                } catch (IllegalStateException e2) {
                                    C4950r4.d().a(e2);
                                }
                            }
                            httpURLConnection.setConnectTimeout(i2);
                            httpURLConnection.setReadTimeout(i3);
                            httpURLConnection.connect();
                            iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                            if (iHttpUrlConnectionGetResponseCode < 200 || iHttpUrlConnectionGetResponseCode >= 400) {
                                Logger.i(d, " RESPONSE CODE: " + iHttpUrlConnectionGetResponseCode + " URL: " + str + " ATTEMPT: " + i);
                                iHttpUrlConnectionGetResponseCode = 1011;
                            } else {
                                inputStreamUrlConnectionGetInputStream = IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                                c4773h5.a(a(inputStreamUrlConnectionGetInputStream));
                            }
                            if (inputStreamUrlConnectionGetInputStream != null) {
                                inputStreamUrlConnectionGetInputStream.close();
                            }
                            IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                        } catch (FileNotFoundException e3) {
                            e = e3;
                            C4950r4.d().a(e);
                            this = 1018;
                            this = 1018;
                            if (0 != 0) {
                                inputStreamUrlConnectionGetInputStream.close();
                            }
                            if (httpURLConnection != null) {
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            c4773h5.a(str);
                            c4773h5.a(this);
                            return c4773h5;
                        } catch (Error e4) {
                            e = e4;
                            C4950r4.d().a(e);
                            iHttpUrlConnectionGetResponseCode = 1019;
                            if (!TextUtils.isEmpty(e.getMessage())) {
                                Logger.i(d, e.getMessage());
                            }
                            if (0 != 0) {
                                inputStreamUrlConnectionGetInputStream.close();
                            }
                            if (httpURLConnection != null) {
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                        } catch (MalformedURLException e5) {
                            e = e5;
                            C4950r4.d().a(e);
                            this = 1004;
                            this = 1004;
                            if (0 != 0) {
                                inputStreamUrlConnectionGetInputStream.close();
                            }
                            if (httpURLConnection != null) {
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            c4773h5.a(str);
                            c4773h5.a(this);
                            return c4773h5;
                        } catch (SocketTimeoutException e6) {
                            e = e6;
                            C4950r4.d().a(e);
                            this = 1008;
                            this = 1008;
                            if (0 != 0) {
                                inputStreamUrlConnectionGetInputStream.close();
                            }
                            if (httpURLConnection != null) {
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            c4773h5.a(str);
                            c4773h5.a(this);
                            return c4773h5;
                        } catch (URISyntaxException e7) {
                            e = e7;
                            C4950r4.d().a(e);
                            this = 1010;
                            this = 1010;
                            if (0 != 0) {
                                inputStreamUrlConnectionGetInputStream.close();
                            }
                            if (httpURLConnection != null) {
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            c4773h5.a(str);
                            c4773h5.a(this);
                            return c4773h5;
                        } catch (Exception e8) {
                            e = e8;
                            C4950r4.d().a(e);
                            if (!TextUtils.isEmpty(e.getMessage())) {
                                Logger.i(d, e.getMessage());
                            }
                            this = 1009;
                            this = 1009;
                            if (0 != 0) {
                                inputStreamUrlConnectionGetInputStream.close();
                            }
                            if (httpURLConnection != null) {
                                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                            }
                            c4773h5.a(str);
                            c4773h5.a(this);
                            return c4773h5;
                        }
                    } catch (FileNotFoundException e9) {
                        e = e9;
                        httpURLConnection = null;
                    } catch (Error e10) {
                        e = e10;
                        httpURLConnection = null;
                    } catch (MalformedURLException e11) {
                        e = e11;
                        httpURLConnection = null;
                    } catch (SocketTimeoutException e12) {
                        e = e12;
                        httpURLConnection = null;
                    } catch (URISyntaxException e13) {
                        e = e13;
                        httpURLConnection = null;
                    } catch (Exception e14) {
                        e = e14;
                        httpURLConnection = null;
                    } catch (Throwable th) {
                        th = th;
                        if (0 != 0) {
                            try {
                                inputStreamUrlConnectionGetInputStream.close();
                                if (0 != 0) {
                                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(null);
                                }
                            } catch (Throwable th2) {
                                C4950r4.d().a(th2);
                                IronLog.INTERNAL.error(th2.toString());
                                c4773h5.a(str);
                                c4773h5.a(0);
                                throw th;
                            }
                        } else if (0 != 0) {
                            IronSourceNetworkBridge.httpUrlConnectionDisconnect(null);
                        }
                        c4773h5.a(str);
                        c4773h5.a(0);
                        throw th;
                    }
                } catch (Throwable th3) {
                    C4950r4.d().a(th3);
                    IronLog.INTERNAL.error(th3.toString());
                }
                c4773h5.a(str);
                c4773h5.a(iHttpUrlConnectionGetResponseCode);
                return c4773h5;
            } catch (Throwable th4) {
                th = th4;
                if (0 != 0) {
                    inputStreamUrlConnectionGetInputStream.close();
                    if (0 != 0) {
                        IronSourceNetworkBridge.httpUrlConnectionDisconnect(null);
                    }
                } else if (0 != 0) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(null);
                }
                c4773h5.a(str);
                c4773h5.a(0);
                throw th;
            }
        } catch (Throwable th5) {
            C4950r4.d().a(th5);
            IronLog.INTERNAL.error(th5.toString());
        }
    }

    public CallableC4702d6(C4755g5 c4755g5, String str, long j) {
        this.a = c4755g5;
        this.b = str;
        this.c = j;
    }

    public boolean a(String str, String str2) throws Exception {
        return IronSourceStorageUtils.renameFile(str, str2);
    }

    public byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4773h5 call() throws Throwable {
        CallableC4702d6 callableC4702d6;
        if (this.c == 0) {
            this.c = 1L;
        }
        C4773h5 c4773h5A = null;
        int i = 0;
        while (true) {
            if (i >= this.c) {
                callableC4702d6 = this;
                break;
            }
            callableC4702d6 = this;
            c4773h5A = callableC4702d6.a(this.a.e(), i, this.a.a(), this.a.c(), this.a.f());
            int iB = c4773h5A.b();
            if (iB != 1008 && iB != 1009) {
                break;
            }
            i++;
            this = callableC4702d6;
        }
        C4773h5 c4773h5 = c4773h5A;
        if (c4773h5 != null && c4773h5.a() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(callableC4702d6.b);
            String str = File.separator;
            sb.append(str);
            sb.append(callableC4702d6.a.b().getName());
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            h50.x(callableC4702d6.a.d(), str, sb2, C4700d4.E);
            sb2.append(callableC4702d6.a.b().getName());
            String string2 = sb2.toString();
            try {
                if (callableC4702d6.a(c4773h5.a(), string2) == 0) {
                    c4773h5.a(1006);
                    return c4773h5;
                }
                if (!callableC4702d6.a(string2, string)) {
                    c4773h5.a(1014);
                    return c4773h5;
                }
            } catch (FileNotFoundException e2) {
                C4950r4.d().a(e2);
                c4773h5.a(1018);
            } catch (Error e3) {
                C4950r4.d().a(e3);
                if (!TextUtils.isEmpty(e3.getMessage())) {
                    Logger.i(d, e3.getMessage());
                }
                c4773h5.a(1019);
            } catch (Exception e4) {
                C4950r4.d().a(e4);
                if (!TextUtils.isEmpty(e4.getMessage())) {
                    Logger.i(d, e4.getMessage());
                }
                c4773h5.a(1009);
            }
        }
        return c4773h5;
    }

    public int a(byte[] bArr, String str) throws Exception {
        return IronSourceStorageUtils.saveFile(bArr, str);
    }
}
