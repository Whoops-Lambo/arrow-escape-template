package com.applovin.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class y {
    private static y e;
    private static final Object f = new Object();
    private final Bundle a;
    private final int b;
    private final boolean c;
    private final String d;

    private y(Context context) throws Throwable {
        Bundle bundle;
        int iIntValue;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            bundle = applicationInfo.metaData;
            try {
                try {
                    String str = applicationInfo.processName;
                    this.a = bundle;
                    this.d = str;
                } catch (Throwable th) {
                    th = th;
                    this.a = bundle;
                    this.d = null;
                    throw th;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e = e2;
                com.applovin.impl.sdk.p.c("AndroidManifest", "Failed to get meta data.", e);
                this.a = bundle;
                this.d = null;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            bundle = null;
        } catch (Throwable th2) {
            th = th2;
            bundle = null;
            this.a = bundle;
            this.d = null;
            throw th;
        }
        boolean z = false;
        try {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            int eventType = xmlResourceParserOpenXmlResourceParser.getEventType();
            iIntValue = 0;
            boolean zBooleanValue = false;
            do {
                if (2 == eventType) {
                    try {
                        if (xmlResourceParserOpenXmlResourceParser.getName().equals("application")) {
                            for (int i = 0; i < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i++) {
                                String attributeName = xmlResourceParserOpenXmlResourceParser.getAttributeName(i);
                                String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(i);
                                if (attributeName.equals("networkSecurityConfig")) {
                                    iIntValue = Integer.valueOf(attributeValue.substring(1)).intValue();
                                } else if (attributeName.equals("usesCleartextTraffic")) {
                                    zBooleanValue = Boolean.valueOf(attributeValue).booleanValue();
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z = zBooleanValue;
                        try {
                            com.applovin.impl.sdk.p.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                            return;
                        } finally {
                            this.b = iIntValue;
                            this.c = z;
                        }
                    }
                }
                eventType = xmlResourceParserOpenXmlResourceParser.next();
            } while (eventType != 1);
            this.b = iIntValue;
            this.c = zBooleanValue;
        } catch (Throwable th4) {
            th = th4;
            iIntValue = 0;
        }
    }

    public static y a(Context context) {
        y yVar;
        synchronized (f) {
            try {
                if (e == null) {
                    e = new y(context);
                }
                yVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yVar;
    }

    public boolean a(String str) {
        Bundle bundle = this.a;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public boolean a(String str, boolean z) {
        Bundle bundle = this.a;
        return bundle != null ? bundle.getBoolean(str, z) : z;
    }

    public String a() {
        return this.d;
    }
}
