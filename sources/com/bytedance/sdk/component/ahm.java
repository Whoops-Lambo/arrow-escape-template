package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import com.safedk.android.internal.partials.PangleFilesBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ahm {
    private static boolean ahm;

    @GuardedBy
    private static ArrayMap<String, File> at;
    protected static kgy kgy;
    private static ArrayMap<File, ahm> twf;

    @GuardedBy
    private Properties ct;

    @GuardedBy
    private long fi;

    @GuardedBy
    private long gf;
    private volatile boolean noq;
    private final File nu;
    private final File ra;
    private final Object rz;
    private final Object uq;

    @GuardedBy
    private int yo;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ahm$ahm, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0211ahm {
        final Properties ahm;
        boolean ct;
        final long kgy;
        final CountDownLatch rz;

        @GuardedBy
        volatile boolean uq;

        public void kgy(boolean z, boolean z2) {
            this.ct = z;
            this.uq = z2;
            this.rz.countDown();
        }

        private C0211ahm(long j, Properties properties) {
            this.rz = new CountDownLatch(1);
            this.uq = false;
            this.ct = false;
            this.kgy = j;
            this.ahm = properties;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        HandlerThread kgy(String str, int i);

        ExecutorService kgy();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class rz implements SharedPreferences.Editor {
        private final Object ahm = new Object();

        @GuardedBy
        private final Map<String, Object> rz = new HashMap();

        @GuardedBy
        private boolean uq = false;

        public rz() {
        }

        private C0211ahm ahm() {
            Properties properties;
            long j;
            Object obj;
            boolean z;
            synchronized (ahm.this.rz) {
                try {
                    if (ahm.this.yo > 0) {
                        Properties properties2 = new Properties();
                        properties2.putAll(ahm.this.ct);
                        ahm.this.ct = properties2;
                    }
                    properties = ahm.this.ct;
                    ahm.ct(ahm.this);
                    synchronized (this.ahm) {
                        try {
                            boolean z2 = false;
                            if (this.uq) {
                                if (properties.isEmpty()) {
                                    z = false;
                                } else {
                                    properties.clear();
                                    z = true;
                                }
                                this.uq = false;
                                z2 = z;
                            }
                            for (Map.Entry<String, Object> entry : this.rz.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == this || value == null) {
                                    if (properties.containsKey(key)) {
                                        properties.remove(key);
                                        z2 = true;
                                    }
                                } else if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                    properties.put(key, String.valueOf(value));
                                    z2 = true;
                                }
                            }
                            this.rz.clear();
                            if (z2) {
                                ahm.noq(ahm.this);
                            }
                            j = ahm.this.fi;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new C0211ahm(j, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long jCurrentTimeMillis = ahm.ahm ? System.currentTimeMillis() : 0L;
            C0211ahm c0211ahmAhm = ahm();
            ahm.this.kgy(c0211ahmAhm, true);
            try {
                c0211ahmAhm.rz.await();
                return c0211ahmAhm.uq;
            } catch (InterruptedException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJPyCGyJ0vLKZwXs3s=", "WOEgmAqo", 403);
            } finally {
                if (ahm.ahm) {
                    Log.d("TTPropHelper", ahm.this.ra.getName() + ":" + c0211ahmAhm.kgy + " committed after " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
            }
        }

        public rz kgy(String str, Set<String> set) {
            synchronized (this.ahm) {
                this.rz.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            ahm.this.kgy(ahm(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        public /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
            return kgy(str, (Set<String>) set);
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public rz putInt(String str, int i) {
            synchronized (this.ahm) {
                this.rz.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public rz putLong(String str, long j) {
            synchronized (this.ahm) {
                this.rz.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public rz putFloat(String str, float f) {
            synchronized (this.ahm) {
                this.rz.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public rz putString(String str, String str2) {
            synchronized (this.ahm) {
                this.rz.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public rz putBoolean(String str, boolean z) {
            synchronized (this.ahm) {
                this.rz.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public rz remove(String str) {
            synchronized (this.ahm) {
                this.rz.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public rz clear() {
            synchronized (this.ahm) {
                this.uq = true;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:120:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0144 A[Catch: all -> 0x0149, TryCatch #7 {all -> 0x0149, blocks: (B:40:0x008e, B:41:0x0090, B:78:0x0140, B:80:0x0144, B:84:0x014e, B:86:0x0157, B:88:0x0160, B:90:0x016c, B:98:0x01c1, B:99:0x01c2, B:77:0x013f, B:63:0x00f4, B:76:0x012d, B:97:0x01c0, B:96:0x01ae, B:60:0x00ef, B:73:0x0128, B:93:0x01a9), top: B:118:0x008e, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0157 A[Catch: all -> 0x0149, TryCatch #7 {all -> 0x0149, blocks: (B:40:0x008e, B:41:0x0090, B:78:0x0140, B:80:0x0144, B:84:0x014e, B:86:0x0157, B:88:0x0160, B:90:0x016c, B:98:0x01c1, B:99:0x01c2, B:77:0x013f, B:63:0x00f4, B:76:0x012d, B:97:0x01c0, B:96:0x01ae, B:60:0x00ef, B:73:0x0128, B:93:0x01a9), top: B:118:0x008e, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x015e  */
    /* JADX WARN: Code duplicated, block: B:90:0x016c A[Catch: all -> 0x0149, TRY_LEAVE, TryCatch #7 {all -> 0x0149, blocks: (B:40:0x008e, B:41:0x0090, B:78:0x0140, B:80:0x0144, B:84:0x014e, B:86:0x0157, B:88:0x0160, B:90:0x016c, B:98:0x01c1, B:99:0x01c2, B:77:0x013f, B:63:0x00f4, B:76:0x012d, B:97:0x01c0, B:96:0x01ae, B:60:0x00ef, B:73:0x0128, B:93:0x01a9), top: B:118:0x008e, inners: #5 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x016c, please report this as an issue */
    @GuardedBy
    public void ahm(C0211ahm c0211ahm, boolean z) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        Throwable th;
        long jCurrentTimeMillis3;
        long jCurrentTimeMillis4;
        long jCurrentTimeMillis5;
        boolean z2;
        long jCurrentTimeMillis6 = ahm ? System.currentTimeMillis() : 0L;
        boolean zExists = this.ra.exists();
        if (ahm) {
            jCurrentTimeMillis = System.currentTimeMillis();
            jCurrentTimeMillis2 = jCurrentTimeMillis;
        } else {
            jCurrentTimeMillis = 0;
            jCurrentTimeMillis2 = 0;
        }
        if (zExists) {
            if (this.gf >= c0211ahm.kgy) {
                z2 = false;
            } else if (z) {
                z2 = true;
            } else {
                synchronized (this.rz) {
                    z2 = this.fi == c0211ahm.kgy;
                }
            }
            if (!z2) {
                c0211ahm.kgy(false, true);
                return;
            }
            boolean zExists2 = this.nu.exists();
            if (ahm) {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            File file = this.ra;
            if (zExists2) {
                file.delete();
            } else if (!file.renameTo(this.nu)) {
                Log.e("TTPropHelper", "Couldn't rename file " + this.ra + " to backup file " + this.nu);
                c0211ahm.kgy(false, false);
                return;
            }
        }
        try {
            synchronized (this.uq) {
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        FileOutputStream fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(this.ra);
                        try {
                            try {
                                jCurrentTimeMillis3 = ahm ? System.currentTimeMillis() : 0L;
                                try {
                                    c0211ahm.ahm.store(fileOutputStreamFileOutputStreamCtor, (String) null);
                                    if (ahm) {
                                        Log.d("TTPropHelper", "save: " + c0211ahm.ahm);
                                        Log.d("TTPropHelper", "saveToLocal: save to" + this.ra.getAbsolutePath() + "success");
                                    }
                                    try {
                                        fileOutputStreamFileOutputStreamCtor.close();
                                    } catch (Throwable th2) {
                                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJP", "TPwkgQaIZuGJRtI=", 615);
                                        Log.w("TTPropHelper", th2.getMessage());
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJP", "TPwkgQaIZuGJRtI=", 608);
                                    Log.e("TTPropHelper", "saveToLocal: ", e);
                                    c0211ahm.kgy(false, false);
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th3) {
                                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th3, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJP", "TPwkgQaIZuGJRtI=", 615);
                                            Log.w("TTPropHelper", th3.getMessage());
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                jCurrentTimeMillis3 = 0;
                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJP", "TPwkgQaIZuGJRtI=", 608);
                                Log.e("TTPropHelper", "saveToLocal: ", e);
                                c0211ahm.kgy(false, false);
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (ahm) {
                                    jCurrentTimeMillis4 = System.currentTimeMillis();
                                } else {
                                    jCurrentTimeMillis4 = 0;
                                }
                                this.nu.delete();
                                if (ahm) {
                                    jCurrentTimeMillis5 = System.currentTimeMillis();
                                } else {
                                    jCurrentTimeMillis5 = 0;
                                }
                                this.gf = c0211ahm.kgy;
                                c0211ahm.kgy(true, true);
                                if (ahm) {
                                    Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                            if (fileOutputStream == null) {
                                throw th;
                            }
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (Throwable th5) {
                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th5, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJP", "TPwkgQaIZuGJRtI=", 615);
                                Log.w("TTPropHelper", th5.getMessage());
                                throw th;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            if (ahm) {
                jCurrentTimeMillis4 = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis4 = 0;
            }
            this.nu.delete();
            if (ahm) {
                jCurrentTimeMillis5 = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis5 = 0;
            }
            this.gf = c0211ahm.kgy;
            c0211ahm.kgy(true, true);
            if (ahm) {
                Log.d("TTPropHelper", "write: " + (jCurrentTimeMillis - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis2 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis3 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis4 - jCurrentTimeMillis6) + "/" + (jCurrentTimeMillis5 - jCurrentTimeMillis6));
            }
        } catch (Throwable th7) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th7, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJP", "TPwkgQaIZuGJRtI=", 646);
            Log.w("TTPropHelper", "writeToFile: Got exception:", th7);
            if (this.ra.exists() && !this.ra.delete()) {
                Log.e("TTPropHelper", "Couldn't clean up partially-written file " + this.ra);
            }
            c0211ahm.kgy(false, false);
        }
    }

    public static /* synthetic */ int ct(ahm ahmVar) {
        int i = ahmVar.yo;
        ahmVar.yo = i + 1;
        return i;
    }

    public static /* synthetic */ int gf(ahm ahmVar) {
        int i = ahmVar.yo;
        ahmVar.yo = i - 1;
        return i;
    }

    public static /* synthetic */ long noq(ahm ahmVar) {
        long j = ahmVar.fi;
        ahmVar.fi = 1 + j;
        return j;
    }

    private void uq() {
        while (!this.noq) {
            try {
                this.rz.wait();
            } catch (InterruptedException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJP", "WvksnBeQZsaET9NxgxKrLV8=", 196);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7 A[Catch: all -> 0x00fa, TryCatch #5 {all -> 0x00fa, blocks: (B:50:0x00f1, B:52:0x00f7, B:55:0x00fc, B:56:0x0104), top: B:71:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void kgy() {
        FileInputStream fileInputStream;
        Throwable th;
        synchronized (this.rz) {
            try {
                if (this.noq) {
                    if (ahm) {
                        Log.d("TTPropHelper", "reload: already loaded, ignore");
                    }
                    return;
                }
                if (this.nu.exists()) {
                    this.ra.delete();
                    this.nu.renameTo(this.ra);
                }
                if (ahm) {
                    Log.d("TTPropHelper", "reload: " + this.ra.getAbsolutePath() + ", exist? " + this.ra.exists());
                }
                Properties properties = null;
                if (this.ra.exists()) {
                    Properties properties2 = new Properties();
                    try {
                        fileInputStream = new FileInputStream(this.ra);
                        try {
                            properties2.load(fileInputStream);
                            if (ahm) {
                                Log.d("TTPropHelper", "reload: find " + properties2.size() + " ,items from " + this.ra.getAbsolutePath());
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJP", "V+EskSWuZsqkQ8RW", 171);
                                Log.e("TTPropHelper", "reload: ", th);
                                if (fileInputStream != null) {
                                }
                                properties = properties2;
                                synchronized (this.rz) {
                                    if (properties != null) {
                                        try {
                                            if (!properties.isEmpty()) {
                                                this.ct = properties;
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                    this.noq = true;
                                    this.rz.notifyAll();
                                }
                            } catch (Throwable th4) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th5) {
                                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th5, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJP", "V+EskSWuZsqkQ8RW", 177);
                                        Log.w("TTPropHelper", th5.getMessage());
                                    }
                                }
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        fileInputStream = null;
                        th = th6;
                    }
                    try {
                        fileInputStream.close();
                    } catch (Throwable th7) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th7, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJP", "V+EskSWuZsqkQ8RW", 177);
                        Log.w("TTPropHelper", th7.getMessage());
                    }
                    properties = properties2;
                }
                synchronized (this.rz) {
                    if (properties != null) {
                        if (!properties.isEmpty()) {
                            this.ct = properties;
                        }
                    }
                    this.noq = true;
                    this.rz.notifyAll();
                }
            } catch (Throwable th8) {
                throw th8;
            }
        }
    }

    private ahm(File file) {
        Object obj = new Object();
        this.rz = obj;
        this.uq = new Object();
        this.ct = new Properties();
        this.noq = false;
        this.yo = 0;
        this.ra = file;
        this.nu = kgy(file);
        synchronized (obj) {
            this.noq = false;
        }
        kgy kgyVar = kgy;
        if (kgyVar != null && kgyVar.kgy() != null) {
            kgy.kgy().execute(new Runnable() { // from class: com.bytedance.sdk.component.ahm.2
                @Override // java.lang.Runnable
                public void run() {
                    ahm.this.kgy();
                }
            });
        } else {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.ahm.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    ahm.this.kgy();
                }
            }.start();
        }
    }

    public static void kgy(@NotNull kgy kgyVar) {
        kgy = kgyVar;
    }

    @RequiresApi
    public static ahm kgy(@NotNull Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (ahm.class) {
            try {
                if (at == null) {
                    at = new ArrayMap<>();
                }
                File file = at.get(str);
                if (file == null) {
                    file = new File(context.getFilesDir(), str);
                    at.put(str, file);
                }
                if (twf == null) {
                    twf = new ArrayMap<>();
                }
                ahm ahmVar = twf.get(file);
                if (ahmVar != null) {
                    return ahmVar;
                }
                ahm ahmVar2 = new ahm(file);
                twf.put(file, ahmVar2);
                return ahmVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File kgy(File file) {
        return new File(file.getPath() + ".bak");
    }

    public String kgy(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.rz) {
            uq();
            property = this.ct.getProperty(str, str2);
        }
        return property;
    }

    public int kgy(String str, int i) {
        int i2;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.rz) {
                try {
                    try {
                        uq();
                        i2 = Integer.parseInt(this.ct.getProperty(str, String.valueOf(i)));
                    } catch (NumberFormatException e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJP", "XOs5vA2o", Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
                        Log.e("TTPropHelper", e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i2;
        }
        return i;
    }

    public long kgy(String str, long j) {
        long j2;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.rz) {
                try {
                    try {
                        uq();
                        j2 = Long.parseLong(this.ct.getProperty(str, String.valueOf(j)));
                    } catch (NumberFormatException e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJP", "XOs5uQyybg==", 236);
                        Log.e("TTPropHelper", e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return j2;
        }
        return j;
    }

    public boolean kgy(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.rz) {
                try {
                    try {
                        uq();
                        z2 = Boolean.parseBoolean(this.ct.getProperty(str, String.valueOf(z)));
                    } catch (NumberFormatException e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJP", "XOs5twyzZcKBRA==", 267);
                        Log.e("TTPropHelper", e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z2;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(final C0211ahm c0211ahm, final boolean z) {
        boolean z2;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.ahm.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (ahm.this.uq) {
                    try {
                        ahm.this.ahm(c0211ahm, z);
                    } catch (OutOfMemoryError e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTD", "b9odhwysQcKMWtJPyEI=", "Sfsj", 500);
                    }
                }
                synchronized (ahm.this.rz) {
                    ahm.gf(ahm.this);
                }
            }
        };
        if (z) {
            synchronized (this.rz) {
                z2 = this.yo == 1;
            }
            if (z2) {
                runnable.run();
                return;
            }
        }
        com.bytedance.sdk.component.rz.kgy(runnable, !z);
    }

    public rz ahm() {
        return new rz();
    }
}
