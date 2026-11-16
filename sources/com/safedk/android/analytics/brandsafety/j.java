package com.safedk.android.analytics.brandsafety;

import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.utils.Logger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public class j {
    private static final String a = "FileUtils";

    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    public static File a(String str, String str2, String str3) throws Throwable {
        HttpURLConnection httpURLConnection;
        FileOutputStream fileOutputStream;
        Exception e;
        File file = new File(str2);
        BufferedInputStream bufferedInputStream = null;
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        File file2 = new File(file, str3);
        if (file2.exists() && file2.length() > 0) {
            return file2;
        }
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setConnectTimeout(20000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, "Android");
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode < 300) {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpURLConnection.getInputStream());
                    try {
                        fileOutputStream = new FileOutputStream(file2, false);
                        try {
                            byte[] bArr = new byte[65536];
                            while (true) {
                                int i = bufferedInputStream2.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                            }
                            fileOutputStream.flush();
                            if (file2.length() != 0) {
                                a(bufferedInputStream2);
                                a(fileOutputStream);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return file2;
                            }
                            Logger.d(a, "download and save video - download file is empty, return.");
                            a(bufferedInputStream2);
                            a(fileOutputStream);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return null;
                        } catch (Exception e2) {
                            e = e2;
                            bufferedInputStream = bufferedInputStream2;
                            try {
                                Logger.d(a, "download and save video - exception= ", e);
                                a(bufferedInputStream);
                                a(fileOutputStream);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return file2;
                            } catch (Throwable th) {
                                th = th;
                                a(bufferedInputStream);
                                a(fileOutputStream);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedInputStream = bufferedInputStream2;
                            a(bufferedInputStream);
                            a(fileOutputStream);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                }
                Logger.d(a, "download and save video - response code not good, return. response code= ", Integer.valueOf(responseCode));
                a(null);
                a(null);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return null;
            } catch (Exception e4) {
                e = e4;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (Exception e5) {
            e = e5;
            httpURLConnection = null;
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            fileOutputStream = null;
        }
    }

    private static void a(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof InputStream) {
                ((InputStream) obj).close();
            } else if (obj instanceof OutputStream) {
                ((OutputStream) obj).close();
            }
        } catch (Exception e) {
        }
    }
}
