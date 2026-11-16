package com.mbridge.msdk.config.component.database.file;

import android.text.TextUtils;
import com.ironsource.Z5;
import defpackage.n30;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class a {
    final String a = "FileOperate";

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    public void a(String str) {
        String str2;
        ArrayList arrayList;
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("WHERE")) {
                String[] strArrSplit = str.split("WHERE");
                if (strArrSplit.length <= 1) {
                    str2 = "";
                } else {
                    str2 = strArrSplit[1];
                }
            } else if (!str.contains("where")) {
                str2 = "";
            } else {
                String[] strArrSplit2 = str.split("where");
                if (strArrSplit2.length <= 1) {
                    str2 = "";
                } else {
                    str2 = strArrSplit2[1];
                }
            }
            Map<String, Object> mapD = com.mbridge.msdk.config.component.database.a.a().d(n30.y("SELECT filePath FROM FileDB WHERE ", str2));
            if (mapD != null && !mapD.isEmpty() && (mapD.get("data") instanceof List) && (arrayList = (ArrayList) mapD.get("data")) != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (((String) entry.getKey()).equals(Z5.c.c)) {
                            arrayList2.add(String.valueOf(entry.getValue()));
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        String str3 = (String) obj2;
                        a(new File(str3));
                        if (str3.contains(".zip")) {
                            String strReplace = str3.replace(".zip", "");
                            if (!TextUtils.isEmpty(strReplace)) {
                                a(new File(strReplace));
                            }
                        }
                    }
                }
            }
        }
    }

    public void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                a(new File(file2.getAbsolutePath()));
            }
        }
        file.delete();
    }
}
