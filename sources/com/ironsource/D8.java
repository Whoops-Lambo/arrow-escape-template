package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class D8 extends File {
    @Override // java.io.File
    public String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }

    public D8(String str, String str2) {
        super(str, str2);
    }

    public D8(String str) {
        super(str);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put("name", getName());
        jSONObjectJsonObjectInit.put("path", getPath());
        jSONObjectJsonObjectInit.put("lastModified", lastModified());
        if (isFile()) {
            jSONObjectJsonObjectInit.put("size", length());
        }
        return jSONObjectJsonObjectInit;
    }
}
