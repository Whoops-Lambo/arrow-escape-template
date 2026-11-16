package com.safedk.android.a;

import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes5.dex */
public class b implements Runnable {
    private static final String a = "ConfigDownload";
    private static final int b = 2;
    private static final int[] c = {60000, 300000};
    private e d;
    private final String e;
    private final String f;

    public b(e eVar, String str, String str2) {
        this.d = new e();
        this.d = eVar;
        this.e = str;
        this.f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[PHI: r2
  0x0068: PHI (r2v4 com.safedk.android.a.f) = (r2v2 com.safedk.android.a.f), (r2v5 com.safedk.android.a.f) binds: [B:23:0x0066, B:36:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    @Override // java.lang.Runnable
    public void run() throws Throwable {
        Throwable th;
        f fVar = null;
        for (int i = 0; i <= 2; i++) {
            try {
                URL url = new URL(this.e);
                Logger.d(a, "Config url: ", url);
                f fVar2 = new f(url.openConnection());
                try {
                    fVar2.a(false);
                    if (this.f != null) {
                        fVar2.a("If-None-Match", this.f);
                    }
                    fVar2.f();
                    a(fVar2);
                    if (fVar2 != null) {
                        fVar2.d();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    e = e;
                    fVar = fVar2;
                    Logger.e(a, "Failed to download configuration", e);
                    this.d.b(e.getMessage());
                    if (i >= 2 || !a(e)) {
                        if (fVar != null) {
                            fVar.d();
                            return;
                        }
                        return;
                    }
                    int iA = a(i);
                    try {
                        Logger.d(a, "Next retry in ", Integer.valueOf(iA), " ms");
                        Thread.sleep(iA);
                    } catch (InterruptedException e2) {
                        Logger.e(a, "Thread interrupted while sleeping: ", e2);
                        Thread.currentThread().interrupt();
                    }
                    if (fVar != null) {
                        fVar.d();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fVar = fVar2;
                    try {
                        Logger.e(a, "Caught exception", th);
                        new CrashReporter().caughtException(th);
                        if (fVar != null) {
                            fVar.d();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (fVar != null) {
                            fVar.d();
                        }
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e = e3;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    private String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            char[] cArr = new char[65536];
            while (true) {
                int i = inputStreamReader.read(cArr);
                if (i == -1) {
                    break;
                }
                sb.append(cArr, 0, i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            Logger.e(a, "Failed to read configuration from input stream", e);
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int a(f fVar) throws Throwable {
        InputStream inputStream;
        int iB = fVar.b();
        Logger.d(a, "response code = ", Integer.valueOf(iB));
        InputStream inputStream2 = null;
        InputStream inputStream3 = null;
        InputStream inputStream4 = null;
        try {
            if (iB < 300) {
                try {
                    InputStream inputStreamE = fVar.e();
                    try {
                        String strA = a(inputStreamE);
                        Logger.d(a, "response = ", strA);
                        this.d.a(strA, b(fVar));
                        inputStream2 = strA;
                        if (inputStreamE != null) {
                            inputStreamE.close();
                            inputStream2 = strA;
                        }
                    } catch (IOException e) {
                        e = e;
                        inputStream3 = inputStreamE;
                        Logger.e(a, "Failed to get response from server", e);
                        this.d.a("Failed to read data from connection");
                        inputStream2 = inputStream3;
                        inputStream = inputStream3;
                        if (inputStream3 != null) {
                            inputStream.close();
                            inputStream2 = inputStream;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream4 = inputStreamE;
                        Logger.e(a, "Caught exception", th);
                        new CrashReporter().caughtException(th);
                        inputStream2 = inputStream4;
                        if (inputStream4 != null) {
                            inputStream = inputStream4;
                            inputStream.close();
                            inputStream2 = inputStream;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                if (iB != 304) {
                    InputStream inputStreamG = fVar.g();
                    String strA2 = a(inputStreamG);
                    this.d.a(strA2);
                    if (inputStreamG != null) {
                        inputStreamG.close();
                    }
                    throw new HttpRetryException(strA2, iB);
                }
                this.d.a(null, b(fVar));
            }
            return iB;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private int a(int i) {
        return c[i];
    }

    private boolean a(Exception exc) {
        if (exc.getClass().isInstance(InterruptedIOException.class) || exc.getClass().isInstance(UnknownHostException.class) || exc.getClass().isInstance(MalformedURLException.class)) {
            return false;
        }
        return true;
    }

    private String b(f fVar) {
        return fVar.b(Command.HTTP_HEADER_ETAG);
    }
}
