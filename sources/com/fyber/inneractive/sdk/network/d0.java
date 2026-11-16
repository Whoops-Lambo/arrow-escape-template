package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class d0 {
    public final Context a;
    public final com.fyber.inneractive.sdk.cache.a b;
    public SharedPreferences c;

    /* JADX WARN: Code duplicated, block: B:39:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final String a(String str) throws Throwable {
        FileInputStream fileInputStreamOpenFileInput;
        IAlog.a("reading local file: %s", str);
        ?? r1 = 0;
        str = null;
        str = null;
        String str2 = null;
        try {
            try {
                fileInputStreamOpenFileInput = this.a.openFileInput(str);
                try {
                    byte[] bArr = new byte[fileInputStreamOpenFileInput.available()];
                    fileInputStreamOpenFileInput.read(bArr);
                    String str3 = new String(bArr, "UTF-8");
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (Exception e) {
                        IAlog.f("Failed closing local file: %s", e.getMessage());
                    }
                    str2 = str3;
                } catch (Exception e2) {
                    e = e2;
                    if (e instanceof FileNotFoundException) {
                        throw new FileNotFoundException();
                    }
                    IAlog.a("Failed reading local file: %s", e.getMessage());
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (Exception e3) {
                            IAlog.f("Failed closing local file: %s", e3.getMessage());
                        }
                    }
                }
            } catch (Exception e4) {
                e = e4;
                fileInputStreamOpenFileInput = null;
            } catch (Throwable th) {
                th = th;
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (Exception e5) {
                        IAlog.f("Failed closing local file: %s", e5.getMessage());
                    }
                }
                throw th;
            }
            IAlog.a("local file %s read successfully", str);
            return str2;
        } catch (Throwable th2) {
            th = th2;
            r1 = this;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    public final void b(String str) {
        if (this.c == null) {
            this.c = this.a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.c.edit().putString(this.b.b(), str).apply();
    }

    public d0(Context context, com.fyber.inneractive.sdk.cache.a aVar) {
        this.a = context;
        this.b = aVar;
    }

    public final void b() {
        if (this.c == null) {
            this.c = this.a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.c.edit().remove(this.b.b()).apply();
    }

    public boolean a(String str, String str2) {
        boolean z;
        IAlog.a("caching file %s", str);
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        boolean z2 = false;
        try {
            try {
                fileOutputStreamOpenFileOutput = this.a.openFileOutput(str, 0);
                fileOutputStreamOpenFileOutput.write(str2.getBytes());
                z = true;
                try {
                    IAlog.a("File cached successfully", new Object[0]);
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e) {
                        IAlog.f("Failed closing cache file: %s", e.getMessage());
                    }
                } catch (Exception e2) {
                    e = e2;
                    z2 = true;
                    IAlog.f("Failed caching file: %s", e.getMessage());
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (Exception e3) {
                            IAlog.f("Failed closing cache file: %s", e3.getMessage());
                        }
                    }
                    z = z2;
                }
            } catch (Exception e4) {
                e = e4;
            }
            return z;
        } catch (Throwable th) {
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (Exception e5) {
                    IAlog.f("Failed closing cache file: %s", e5.getMessage());
                }
            }
            throw th;
        }
    }

    public com.fyber.inneractive.sdk.cache.n a() throws Throwable {
        try {
            if (!this.b.d()) {
                new c0();
                return new com.fyber.inneractive.sdk.cache.n();
            }
            Object objA = this.b.a(a(this.b.c()));
            if (this.c == null) {
                this.c = this.a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            return new com.fyber.inneractive.sdk.cache.n(objA, this.c.getString(this.b.b(), null));
        } catch (Exception unused) {
            b();
            return new com.fyber.inneractive.sdk.cache.n();
        }
    }
}
