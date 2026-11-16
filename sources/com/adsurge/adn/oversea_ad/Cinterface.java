package com.adsurge.adn.oversea_ad;

import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.interface, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Cinterface {
    static {
        new HashSet();
        new HashSet();
    }

    public static String a() {
        String strA = a0.f.a("s_h");
        if (strA == null || strA.isEmpty()) {
            return "";
        }
        HashSet<String> hashSet = new HashSet(Arrays.asList(strA.split(";")));
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            for (String str : hashSet) {
                jsonWriter.name(str);
                v0 v0VarA = Strawberry.a(str);
                jsonWriter.beginObject();
                jsonWriter.name("std");
                jsonWriter.value(v0VarA.a);
                jsonWriter.name(NotificationCompat.CATEGORY_ERROR);
                jsonWriter.value(v0VarA.b);
                jsonWriter.endObject();
            }
            jsonWriter.endObject();
            return stringWriter.toString();
        } catch (IOException unused) {
            return "";
        }
    }
}
