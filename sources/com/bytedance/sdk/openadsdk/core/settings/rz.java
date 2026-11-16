package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.media3.extractor.ts.TsExtractor;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.utils.twf;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class rz {
    private static final ConcurrentHashMap<String, ahm> kgy = new ConcurrentHashMap<>();

    @NonNull
    private static HashMap<String, ahm> ahm(JSONArray jSONArray) {
        HashMap<String, ahm> map = new HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                ahm ahmVarKgy = kgy(jSONArray.getJSONObject(i));
                if (ahmVarKgy != null) {
                    map.put(ahmVarKgy.kgy, ahmVarKgy);
                }
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "euoemQyoWsKUXt5TiwI=", "S+8/hgaWWuiu", 75);
                return map;
            }
        }
        return map;
    }

    @WorkerThread
    public static void kgy(JSONArray jSONArray) throws Throwable {
        if (jSONArray == null) {
            return;
        }
        File fileKgy = kgy();
        File file = new File(fileKgy.getParent(), fileKgy.getName() + ".tmp");
        FileWriter fileWriter = null;
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                FileWriter fileWriter2 = new FileWriter(file);
                try {
                    fileWriter2.write(jSONArray.toString());
                    file.renameTo(fileKgy);
                    if (file.exists()) {
                        file.delete();
                    }
                    twf.kgy(fileWriter2);
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "euoemQyoWsKUXt5TiwI=", "SO87kCK4WsuPXuNSoB6jKVc=", TsExtractor.TS_STREAM_TYPE_DTS_UHD);
                    Log.e("SdkSettings.AdSlot", "saveAdSlotToLocal: ", e);
                    if (file.exists()) {
                        file.delete();
                    }
                    twf.kgy(fileWriter);
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    if (file.exists()) {
                        file.delete();
                    }
                    twf.kgy(fileWriter);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            HashMap<String, ahm> mapAhm = ahm(jSONArray);
            if (mapAhm.isEmpty()) {
                return;
            }
            for (Map.Entry<String, ahm> entry : mapAhm.entrySet()) {
                kgy.put(entry.getKey(), entry.getValue());
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static ahm ahm(String str) {
        return new ahm(str, 1);
    }

    public static void ahm() {
        File fileKgy = kgy();
        if (fileKgy.exists()) {
            fileKgy.delete();
        }
    }

    @NonNull
    public static File kgy() {
        return com.bytedance.sdk.component.utils.yo.kgy(xh.kgy(), xh.kgy().getFilesDir(), "tt_ads_conf_sr");
    }

    private static ahm kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new ahm(jSONObject);
    }

    @NonNull
    public static ahm kgy(String str) {
        ahm ahmVar = kgy.get(str);
        return ahmVar == null ? ahm(str) : ahmVar;
    }

    @WorkerThread
    public static void kgy(boolean z) {
        File fileKgy = kgy();
        if (fileKgy.exists()) {
            try {
                HashMap<String, ahm> mapAhm = ahm(new JSONArray(new String(com.bytedance.sdk.component.utils.yo.uq(fileKgy))));
                if (mapAhm.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, ahm> entry : mapAhm.entrySet()) {
                    kgy.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "euoemQyoWsKUXt5TiwI=", "V+EskSWuZsqsRdRcgA==", 57);
            }
        }
    }
}
