package com.bytedance.adsdk.ahm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.ahm.ct.ioy;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import defpackage.pv1;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class fi {
    private static final Map<String, twf<yo>> kgy = new HashMap();
    private static final Set<Object> ahm = new HashSet();
    private static final byte[] rz = {80, 75, 3, 4};

    private static at<yo> ahm(Context context, ZipInputStream zipInputStream, String str) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            yo yoVarKgy = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    yoVarKgy = kgy(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).kgy();
                } else if (name.endsWith(".png") || name.endsWith(".webp") || name.endsWith(BrandSafetyUtils.a) || name.endsWith(".jpeg")) {
                    if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] strArrSplit = name.split("/");
                        map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                } else if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                    zipInputStream.closeEntry();
                } else if (name.contains("../")) {
                    zipInputStream.closeEntry();
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    String[] strArrSplit2 = name.split("/");
                    String str2 = strArrSplit2[strArrSplit2.length - 1];
                    String str3 = str2.split("\\.")[0];
                    File file = new File(context.getCacheDir(), str2);
                    new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                file.getAbsolutePath();
                            }
                            map2.put(str3, typefaceCreateFromFile);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (yoVarKgy == null) {
                return new at<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                ra raVarKgy = kgy(yoVarKgy, (String) entry.getKey());
                if (raVarKgy != null) {
                    raVarKgy.kgy(com.bytedance.adsdk.ahm.noq.noq.kgy((Bitmap) entry.getValue(), raVarKgy.kgy(), raVarKgy.ahm()));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z = false;
                for (com.bytedance.adsdk.ahm.rz.rz rzVar : yoVarKgy.vs().values()) {
                    if (rzVar.kgy().equals(entry2.getKey())) {
                        rzVar.kgy((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, ra>> it = yoVarKgy.dg().entrySet().iterator();
                while (it.hasNext()) {
                    ra value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String strGf = value.gf();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (strGf.startsWith("data:") && strGf.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(strGf.substring(strGf.indexOf(44) + 1), 0);
                            value.kgy(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, ra> entry3 : yoVarKgy.dg().entrySet()) {
                if (entry3.getValue().nu() == null) {
                    return new at<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().gf()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.ahm.rz.ct.kgy().kgy(str, yoVarKgy);
            }
            return new at<>(yoVarKgy);
        } catch (IOException e) {
            return new at<>((Throwable) e);
        }
    }

    private static twf<yo> kgy(final String str, Callable<at<yo>> callable) {
        final yo yoVarKgy = str == null ? null : com.bytedance.adsdk.ahm.rz.ct.kgy().kgy(str);
        if (yoVarKgy != null) {
            return new twf<>(new Callable<at<yo>>() { // from class: com.bytedance.adsdk.ahm.fi.7
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
                public at<yo> call() throws Exception {
                    return new at<>(yoVarKgy);
                }
            });
        }
        if (str != null) {
            Map<String, twf<yo>> map = kgy;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        twf<yo> twfVar = new twf<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            twfVar.kgy(new nu<yo>() { // from class: com.bytedance.adsdk.ahm.fi.2
                @Override // com.bytedance.adsdk.ahm.nu
                public void kgy(yo yoVar) {
                    fi.kgy.remove(str);
                    atomicBoolean.set(true);
                    if (fi.kgy.size() != 0) {
                        return;
                    }
                    fi.ahm(true);
                }
            });
            twfVar.rz(new nu<Throwable>() { // from class: com.bytedance.adsdk.ahm.fi.3
                @Override // com.bytedance.adsdk.ahm.nu
                public void kgy(Throwable th) {
                    fi.kgy.remove(str);
                    atomicBoolean.set(true);
                    if (fi.kgy.size() != 0) {
                        return;
                    }
                    fi.ahm(true);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, twf<yo>> map2 = kgy;
                map2.put(str, twfVar);
                if (map2.size() == 1) {
                    ahm(false);
                }
            }
        }
        return twfVar;
    }

    public static at<yo> rz(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return ahm(context.getAssets().open(str), str2);
            }
            return kgy(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new at<>((Throwable) e);
        }
    }

    public static at<yo> rz(Context context, String str) {
        return rz(context, str, "asset_".concat(String.valueOf(str)));
    }

    private static String rz(Context context, int i) {
        return pv1.l(i, kgy(context) ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }

    public static twf<yo> kgy(Context context, String str) {
        return kgy(context, str, "url_".concat(String.valueOf(str)));
    }

    public static twf<yo> kgy(final Context context, final String str, final String str2) {
        return kgy(str2, new Callable<at<yo>>() { // from class: com.bytedance.adsdk.ahm.fi.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public at<yo> call() throws Exception {
                at<yo> atVarKgy = ct.kgy(context).kgy(context, str, str2);
                if (str2 != null && atVarKgy.kgy() != null) {
                    com.bytedance.adsdk.ahm.rz.ct.kgy().kgy(str2, atVarKgy.kgy());
                }
                return atVarKgy;
            }
        });
    }

    public static twf<yo> kgy(Context context, int i) {
        return kgy(context, i, rz(context, i));
    }

    public static twf<yo> kgy(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return kgy(str, new Callable<at<yo>>() { // from class: com.bytedance.adsdk.ahm.fi.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public at<yo> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return fi.ahm(context2, i, str);
            }
        });
    }

    private static boolean kgy(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static twf<yo> kgy(final InputStream inputStream, final String str) {
        return kgy(str, new Callable<at<yo>>() { // from class: com.bytedance.adsdk.ahm.fi.6
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public at<yo> call() throws Exception {
                return fi.ahm(inputStream, str);
            }
        });
    }

    private static at<yo> kgy(InputStream inputStream, String str, boolean z) {
        try {
            return kgy(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                com.bytedance.adsdk.ahm.noq.noq.kgy(inputStream);
            }
        }
    }

    public static at<yo> kgy(JsonReader jsonReader, String str) {
        return kgy(jsonReader, str, true);
    }

    private static at<yo> kgy(JsonReader jsonReader, String str, boolean z) {
        try {
            yo yoVarKgy = ioy.kgy(jsonReader);
            com.bytedance.adsdk.ahm.rz.ct.kgy().kgy(str, yoVarKgy);
            return new at<>(yoVarKgy);
        } catch (Exception e) {
            return new at<>((Throwable) e);
        } finally {
            if (z) {
                kgy(jsonReader);
            }
        }
    }

    public static void kgy(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static at<yo> kgy(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return ahm(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.ahm.noq.noq.kgy(zipInputStream);
        }
    }

    private static ra kgy(yo yoVar, String str) {
        for (ra raVar : yoVar.dg().values()) {
            if (raVar.gf().equals(str)) {
                return raVar;
            }
        }
        return null;
    }

    public static twf<yo> ahm(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return kgy(str2, new Callable<at<yo>>() { // from class: com.bytedance.adsdk.ahm.fi.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public at<yo> call() throws Exception {
                return fi.rz(applicationContext, str, str2);
            }
        });
    }

    public static at<yo> ahm(Context context, int i) {
        return ahm(context, i, rz(context, i));
    }

    public static at<yo> ahm(Context context, int i, String str) {
        try {
            return ahm(context.getResources().openRawResource(i), rz(context, i));
        } catch (Resources.NotFoundException e) {
            return new at<>((Throwable) e);
        }
    }

    public static at<yo> ahm(InputStream inputStream, String str) {
        return kgy(inputStream, str, true);
    }

    public static twf<yo> ahm(Context context, String str) {
        return ahm(context, str, "asset_".concat(String.valueOf(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ahm(boolean z) {
        ArrayList arrayList = new ArrayList(ahm);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
    }
}
