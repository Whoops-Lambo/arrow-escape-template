package defpackage;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mm0 extends AsyncTask {
    public final String a;
    public final File b;
    public final lm0 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Boolean] */
    public final Boolean a(String... strArr) {
        Set set = lz.a;
        if (set.contains(this)) {
            return null;
        }
        try {
            if (set.contains(this)) {
                return null;
            }
            try {
                strArr.getClass();
                try {
                    URL url = new URL(this.a);
                    int contentLength = url.openConnection().getContentLength();
                    DataInputStream dataInputStream = new DataInputStream(url.openStream());
                    byte[] bArr = new byte[contentLength];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.b));
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    this = Boolean.TRUE;
                    return this;
                } catch (Exception unused) {
                    this = Boolean.FALSE;
                    return this;
                }
            } catch (Throwable th) {
                lz.a(this, th);
                return null;
            }
        } catch (Throwable th2) {
            lz.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Boolean, java.lang.Object] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Set set = lz.a;
        if (!set.contains(this)) {
            try {
                if (!set.contains(this)) {
                    try {
                        this = a((String[]) objArr);
                        return this;
                    } catch (Throwable th) {
                        lz.a(this, th);
                        return null;
                    }
                }
            } catch (Throwable th2) {
                lz.a(this, th2);
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Set set = lz.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (set.contains(this)) {
                    return;
                }
                try {
                    if (!set.contains(this) && zBooleanValue) {
                        try {
                            this.c.a(this.b);
                        } catch (Throwable th) {
                            lz.a(this, th);
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    lz.a(this, th2);
                    return;
                }
            } catch (Throwable th3) {
                lz.a(this, th3);
                return;
            }
            lz.a(this, th);
        } catch (Throwable th4) {
            lz.a(this, th4);
        }
    }

    public mm0(String str, File file, lm0 lm0Var) {
        str.getClass();
        this.a = str;
        this.b = file;
        this.c = lm0Var;
    }
}
