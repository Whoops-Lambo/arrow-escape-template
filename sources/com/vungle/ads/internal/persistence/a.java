package com.vungle.ads.internal.persistence;

import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.util.PathProvider;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final synchronized FilePreferences a(j jVar, PathProvider pathProvider, String str) {
        Object filePreferences;
        Object objPutIfAbsent;
        try {
            jVar.getClass();
            pathProvider.getClass();
            str.getClass();
            ConcurrentHashMap concurrentHashMap = FilePreferences.e;
            filePreferences = concurrentHashMap.get(str);
            if (filePreferences == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (filePreferences = new FilePreferences(jVar, pathProvider, str, 0)))) != null) {
                filePreferences = objPutIfAbsent;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (FilePreferences) filePreferences;
    }
}
