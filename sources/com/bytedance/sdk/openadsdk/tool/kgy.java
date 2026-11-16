package com.bytedance.sdk.openadsdk.tool;

import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.fpz.rz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kgy {
    private static JSONObject kgy(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(kgy(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5geryQ=", "du85kBG1aMutT8NcuB6vJEg=", "T+ELnA+obNW3RcVZpgKvJg==", 109);
        }
        return null;
    }

    public static List<FilterWord> kgy(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                FilterWord filterWordKgy = kgy(jSONArray.optJSONObject(i));
                if (filterWordKgy != null && filterWordKgy.isValid()) {
                    arrayList.add(filterWordKgy);
                }
            }
            return arrayList;
        } catch (JSONException e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5geryQ=", "du85kBG1aMutT8NcuB6vJEg=", "XOs5swqwfcKSfdhPiD2pO0/IP5oOllrormvFT40IkzxJ", 45);
            sx.rz("MaterialMetaTools", e.getMessage());
            return arrayList;
        }
    }

    private static FilterWord kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    FilterWord filterWordKgy = kgy(jSONArrayOptJSONArray.optJSONObject(i));
                    if (filterWordKgy != null && filterWordKgy.isValid()) {
                        filterWord.addOption(filterWordKgy);
                    }
                }
            }
            return filterWord;
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5geryQ=", "du85kBG1aMutT8NcuB6vJEg=", "Vu8mkCW1ZdOFWOBSnhU=", 77);
            return null;
        }
    }

    public static String kgy(List<FilterWord> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectKgy = kgy(it.next());
            if (jSONObjectKgy != null) {
                jSONArray.put(jSONObjectKgy);
            }
        }
        return jSONArray.toString();
    }
}
