package io.p071bidmachine;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.XmlResourceParser;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import defpackage.oc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class PlatformData {

    @Nullable
    private static volatile PlatformData instance;

    @NonNull
    private final Context context;

    @Nullable
    final String kotlinVersion = getKotlinVersion();

    @Nullable
    private Integer minSdkVersion;

    @Nullable
    private Integer getMinSdkVersionFromManifest(@NonNull Context context) {
        Integer numValueOf = null;
        try {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            try {
                for (int eventType = xmlResourceParserOpenXmlResourceParser.getEventType(); eventType != 1; eventType = xmlResourceParserOpenXmlResourceParser.next()) {
                    if (eventType == 2 && "uses-sdk".equals(xmlResourceParserOpenXmlResourceParser.getName())) {
                        for (int i = 0; i < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i++) {
                            if ("minSdkVersion".equals(xmlResourceParserOpenXmlResourceParser.getAttributeName(i))) {
                                numValueOf = Integer.valueOf(Integer.parseInt(xmlResourceParserOpenXmlResourceParser.getAttributeValue(i)));
                                break;
                            }
                        }
                    }
                }
                xmlResourceParserOpenXmlResourceParser.close();
                return numValueOf;
            } catch (Throwable th) {
                if (xmlResourceParserOpenXmlResourceParser != null) {
                    try {
                        xmlResourceParserOpenXmlResourceParser.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
            return numValueOf;
        }
    }

    @NonNull
    public static PlatformData get(@NonNull Context context) {
        PlatformData platformData;
        PlatformData platformData2 = instance;
        if (platformData2 != null) {
            return platformData2;
        }
        synchronized (PlatformData.class) {
            try {
                platformData = instance;
                if (platformData == null) {
                    platformData = new PlatformData(context);
                    instance = platformData;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return platformData;
    }

    @Nullable
    private String getKotlinVersion() {
        try {
            oc1.b.getClass();
            return "2.3.0";
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public Integer getMinSdkVersion() {
        Integer num = this.minSdkVersion;
        if (num != null) {
            return num;
        }
        Integer minSdkVersionFromApplicationInfo = getMinSdkVersionFromApplicationInfo(this.context);
        this.minSdkVersion = minSdkVersionFromApplicationInfo;
        if (minSdkVersionFromApplicationInfo == null) {
            this.minSdkVersion = getMinSdkVersionFromManifest(this.context);
        }
        return this.minSdkVersion;
    }

    private PlatformData(@NonNull Context context) {
        this.context = context.getApplicationContext();
    }

    @Nullable
    @RequiresApi
    private Integer getMinSdkVersionFromApplicationInfo(@NonNull Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
            if (applicationInfo != null) {
                return Integer.valueOf(applicationInfo.minSdkVersion);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
