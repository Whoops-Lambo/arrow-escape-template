package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.utils.mw;
import com.bytedance.sdk.openadsdk.utils.twf;
import com.safedk.android.internal.partials.PangleFilesBridge;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.n30;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ra implements ct {
    private boolean nu;
    private final kgy ra;
    private final String yo;
    private final ConcurrentHashMap<String, Object> rz = new ConcurrentHashMap<>();
    private final Object uq = new Object();
    private final Object ct = new Object();
    private final CountDownLatch noq = new CountDownLatch(1);
    private Properties fi = new Properties();
    private volatile boolean gf = false;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ahm implements ct.kgy {
        private final Map<String, Object> ahm = new HashMap();
        private final Object rz = new Object();

        public ahm() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.ct.kgy
        public void kgy() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.rz) {
                try {
                    properties.putAll(ra.this.fi);
                    boolean z = false;
                    for (Map.Entry<String, Object> entry : this.ahm.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value == this || value == null) {
                            if (properties.containsKey(key)) {
                                properties.remove(key);
                                z = true;
                            }
                        } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                            properties.put(key, String.valueOf(value));
                            z = true;
                        }
                    }
                    this.ahm.clear();
                    if (z) {
                        ra.this.kgy(properties);
                        ra.this.fi = properties;
                        ra.this.rz.clear();
                        ra.this.nu = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.ct.kgy
        public ct.kgy kgy(String str, String str2) {
            synchronized (this.rz) {
                this.ahm.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.ct.kgy
        public ct.kgy kgy(String str, int i) {
            synchronized (this.rz) {
                this.ahm.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.ct.kgy
        public ct.kgy kgy(String str, long j) {
            synchronized (this.rz) {
                this.ahm.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.ct.kgy
        public ct.kgy kgy(String str) {
            synchronized (this.rz) {
                this.ahm.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.ct.kgy
        public ct.kgy kgy(String str, float f) {
            synchronized (this.rz) {
                this.ahm.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.ct.kgy
        public ct.kgy kgy(String str, boolean z) {
            synchronized (this.rz) {
                this.ahm.put(str, Boolean.valueOf(z));
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        void ahm();

        void kgy();
    }

    public abstract String kgy();

    private void noq() {
        if (this.nu && xh.kgy() != null) {
            kgy(true);
        }
        if (this.gf) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.noq.await(mw.noq() ? 4 : 8, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "aOs5gQqybtSwWNhNvhSwJ0jnOZoRpQ==", "WvksnBeQZsaET9NxgxKrLV8=", 91);
            sx.kgy("SdkSettings.Prop", "awaitLoadedLocked: ", e);
        }
    }

    public ct.kgy ahm() {
        return new ahm();
    }

    public void ct() {
        kgy kgyVar = this.ra;
        if (kgyVar != null) {
            kgyVar.ahm();
        }
    }

    public void kgy(boolean z) {
        kgy kgyVar;
        synchronized (this.uq) {
            try {
                if (!this.gf || z) {
                    if (xh.kgy() != null) {
                        this.nu = false;
                        File fileYo = yo();
                        if (fileYo != null && fileYo.exists()) {
                            Properties properties = new Properties();
                            FileInputStream fileInputStream = null;
                            try {
                                try {
                                    FileInputStream fileInputStream2 = new FileInputStream(fileYo);
                                    try {
                                        properties.load(fileInputStream2);
                                        properties.size();
                                        new StringBuilder("items from ").append(fileYo.getAbsolutePath());
                                        if (!properties.isEmpty()) {
                                            this.fi = properties;
                                            this.rz.clear();
                                        }
                                        twf.kgy(fileInputStream2);
                                    } catch (OutOfMemoryError e) {
                                        e = e;
                                        fileInputStream = fileInputStream2;
                                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "aOs5gQqybtSwWNhNvhSwJ0jnOZoRpQ==", "SeshmgK4", 190);
                                        try {
                                            com.bytedance.sdk.component.utils.yo.rz(fileYo);
                                        } catch (Throwable th) {
                                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "aOs5gQqybtSwWNhNvhSwJ0jnOZoRpQ==", "SeshmgK4", 193);
                                            sx.kgy("SdkSettings.Prop", "delete: ", th);
                                        }
                                        if (fileInputStream != null) {
                                            twf.kgy(fileInputStream);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileInputStream = fileInputStream2;
                                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "aOs5gQqybtSwWNhNvhSwJ0jnOZoRpQ==", "SeshmgK4", 196);
                                        sx.kgy("SdkSettings.Prop", "reload: ", th);
                                        if (fileInputStream != null) {
                                            twf.kgy(fileInputStream);
                                        }
                                    }
                                } catch (OutOfMemoryError e2) {
                                    e = e2;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                this.uq.notifyAll();
                            } catch (Throwable th4) {
                                if (fileInputStream != null) {
                                    twf.kgy(fileInputStream);
                                }
                                this.uq.notifyAll();
                                throw th4;
                            }
                        }
                    } else {
                        this.nu = true;
                    }
                    boolean z2 = this.gf;
                    this.noq.countDown();
                    this.gf = true;
                    if (!z2 && (kgyVar = this.ra) != null) {
                        kgyVar.kgy();
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public boolean rz() {
        return this.gf;
    }

    public ra(kgy kgyVar) {
        String strKgy = kgy();
        this.yo = strKgy;
        this.ra = kgyVar;
        mw.kgy(new com.bytedance.sdk.component.gf.ahm.rz(n30.y("SetL_", strKgy)) { // from class: com.bytedance.sdk.openadsdk.core.settings.ra.1
            @Override // java.lang.Runnable
            public void run() {
                ra.this.kgy(false);
            }
        });
    }

    @Nullable
    private File yo() {
        Context contextKgy = xh.kgy();
        if (contextKgy != null) {
            return new File(contextKgy.getFilesDir(), this.yo);
        }
        return null;
    }

    public void uq() {
        File fileYo = yo();
        if (fileYo != null && fileYo.exists()) {
            fileYo.delete();
        }
    }

    public String kgy(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        noq();
        return this.fi.getProperty(str, str2);
    }

    public int kgy(String str, int i) {
        if (str != null && !str.isEmpty()) {
            noq();
            try {
                return Integer.parseInt(this.fi.getProperty(str, String.valueOf(i)));
            } catch (NumberFormatException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "aOs5gQqybtSwWNhNvhSwJ0jnOZoRpQ==", "XOs5vA2o", 108);
                sx.kgy("SdkSettings.Prop", "", e);
            }
        }
        return i;
    }

    public long kgy(String str, long j) {
        if (str != null && !str.isEmpty()) {
            noq();
            try {
                return Long.parseLong(this.fi.getProperty(str, String.valueOf(j)));
            } catch (NumberFormatException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "aOs5gQqybtSwWNhNvhSwJ0jnOZoRpQ==", "XOs5uQyybg==", Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
                sx.kgy("SdkSettings.Prop", "", e);
            }
        }
        return j;
    }

    public float kgy(String str, float f) {
        if (str != null && !str.isEmpty()) {
            noq();
            try {
                return Float.parseFloat(this.fi.getProperty(str, String.valueOf(f)));
            } catch (NumberFormatException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "aOs5gQqybtSwWNhNvhSwJ0jnOZoRpQ==", "XOs5sw+zaNM=", 142);
                sx.kgy("SdkSettings.Prop", "", e);
            }
        }
        return f;
    }

    public boolean kgy(String str, boolean z) {
        if (str != null && !str.isEmpty()) {
            noq();
            try {
                return Boolean.parseBoolean(this.fi.getProperty(str, String.valueOf(z)));
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "aOs5gQqybtSwWNhNvhSwJ0jnOZoRpQ==", "XOs5twyzZcKBRA==", 159);
                sx.kgy("SdkSettings.Prop", "", e);
            }
        }
        return z;
    }

    public <T> T kgy(String str, T t, ct.ahm<T> ahmVar) {
        T tAhm;
        if (str != null && !str.isEmpty()) {
            T t2 = (T) this.rz.get(str);
            if (t2 != null) {
                return t2;
            }
            noq();
            String property = this.fi.getProperty(str, null);
            if (property != null && ahmVar != null && (tAhm = ahmVar.ahm(property)) != null) {
                this.rz.put(str, tAhm);
                return tAhm;
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(Properties properties) {
        synchronized (this.ct) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(yo());
                    try {
                        properties.store(fileOutputStreamFileOutputStreamCtor, (String) null);
                        twf.kgy(fileOutputStreamFileOutputStreamCtor);
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "aOs5gQqybtSwWNhNvhSwJ0jnOZoRpQ==", "SO87kDezRciDS9s=", 277);
                        sx.kgy("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            twf.kgy(fileOutputStream);
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                        if (fileOutputStream != null) {
                            twf.kgy(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }
}
