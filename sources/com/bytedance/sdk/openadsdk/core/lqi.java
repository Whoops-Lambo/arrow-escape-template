package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class lqi implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene kgy;

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i) {
        fpz.kgy(1, this.kgy, i);
        return com.bytedance.sdk.component.utils.kgy.kgy(jSONObject);
    }

    public lqi(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.kgy = cryptDataScene;
    }
}
