package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f34 {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE);
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                HashMap map = a;
                if (map.containsKey(string)) {
                    return rd1.t(((String) map.get(string)) + ":" + string2);
                }
            }
            return rd1.t("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e) {
            return rd1.t("WEB_INTERNAL_ERROR:" + str + "[ " + e.getLocalizedMessage() + " ]");
        }
    }
}
