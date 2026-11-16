package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.extractor.ts.TsExtractor;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.protobuf.openrtb.LossReason;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.q0;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class h {
    private int[] a = {99, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 242, 107, 111, 197, 48, 1, 103, 43, 254, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 171, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 202, 130, 201, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 250, 89, 71, 240, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 212, 162, 175, 156, 164, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 192, 183, 253, 147, 38, 54, 63, 247, 204, 52, 165, 229, 241, 113, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 49, 21, 4, 199, 35, 195, 24, 150, 5, 154, 7, 18, 128, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 39, 178, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 9, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 44, 26, 27, 110, 90, 160, 82, 59, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 179, 41, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 47, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 83, 209, 0, 237, 32, 252, 177, 91, 106, 203, 190, 57, 74, 76, 88, 207, 208, 239, 170, 251, 67, 77, 51, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 69, 249, 2, 127, 80, 60, 159, 168, 81, 163, 64, 143, 146, 157, 56, 245, 188, 182, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 33, 16, 255, 243, 210, 205, 12, 19, 236, 95, 151, 68, 23, 196, 167, 126, 61, 100, 93, 25, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, 96, 129, 79, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 34, 42, 144, 136, 70, 238, 184, 20, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 94, 11, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 224, 50, 58, 10, 73, 6, 36, 92, 194, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 172, 98, 145, 149, 228, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 231, 200, 55, 109, 141, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 78, 169, 108, 86, 244, 234, 101, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 174, 8, 186, com.safedk.android.analytics.brandsafety.b.v, 37, 46, 28, 166, 180, 198, 232, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 116, 31, 75, 189, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 138, 112, 62, 181, 102, 72, 3, 246, 14, 97, 53, 87, ModuleDescriptor.MODULE_VERSION, 134, 193, 29, 158, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 248, 152, 17, 105, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 142, 148, 155, 30, 135, 233, 206, 85, 40, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 140, 161, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 13, 191, 230, 66, 104, 65, 153, 45, 15, 176, 84, 187, 22};
    private byte[][] b;

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        String string = obj.toString();
        byte[] bArrDecode = Base64.decode(string, 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        a(string);
        byte[] bArr = this.b[Integer.parseInt(list.get(0).toString()) % 16];
        for (int i = 0; i < 16; i++) {
            bArrDecode[i] = (byte) (bArrDecode[i] ^ bArr[i]);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        try {
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("886"))) {
                return a(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("887"))) {
                return f(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("888"))) {
                return e(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("889"))) {
                return h(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("890"))) {
                return b(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("891"))) {
                return c(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("892"))) {
                return i(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("893"))) {
                return g(obj, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("894"))) {
                return d(obj, list);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        } catch (Exception unused) {
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i = Integer.parseInt(list.get(0).toString()) % 8;
        for (int i2 = 0; i2 < 16; i2++) {
            int i3 = bArrDecode[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            bArrDecode[i2] = (byte) ((i3 >>> (8 - i)) | (i3 << i));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i = ((Integer.parseInt(list.get(0).toString()) % 128) * 2) + 1;
        for (int i2 = 0; i2 < 16; i2++) {
            bArrDecode[i2] = (byte) (bArrDecode[i2] * i);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i = Integer.parseInt(list.get(0).toString()) % 16;
        if (i > 0) {
            byte[] bArrCopyOf = Arrays.copyOf(bArrDecode, 16);
            for (int i2 = 0; i2 < 16; i2++) {
                bArrDecode[i2] = bArrCopyOf[(i2 + i) % 16];
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a f(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        for (int i = 0; i < 16; i++) {
            bArrDecode[i] = (byte) this.a[bArrDecode[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a g(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null) {
            if (list.size() == 1) {
                byte[] bArrDecode = Base64.decode(obj.toString(), 10);
                if (bArrDecode.length < 16) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
                }
                if (bArrDecode.length > 16) {
                    bArrDecode = Arrays.copyOf(bArrDecode, 16);
                }
                int i = Integer.parseInt(list.get(0).toString()) % 16;
                int i2 = i != 0 ? i : 1;
                for (int i3 = 0; i3 < 16; i3 += 2) {
                    int i4 = (i3 + i2) % 16;
                    byte b = bArrDecode[i3];
                    bArrDecode[i3] = bArrDecode[i4];
                    bArrDecode[i4] = b;
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a h(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        for (int i = 0; i < 16; i++) {
            bArrDecode[i] = (byte) (bArrDecode[i] ^ ((byte) Integer.parseInt(list.get(0).toString())));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a i(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            bArrDecode[i] = (byte) (bArrDecode[i] ^ bArrDecode[i2 % 16]);
            i = i2;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    public h(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
    }

    private void a(String str) {
        this.b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 16, 16);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (int i = 0; i < 16; i++) {
                System.arraycopy(messageDigest.digest((str + "_round_" + i).getBytes(StandardCharsets.UTF_8)), 0, this.b[i], 0, 16);
            }
        } catch (Exception e) {
            q0.b("OperatorEnMethod", e.getMessage());
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (b(str)) {
            return b(str, obj, list);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null && list.size() == 1) {
            byte[] bArrDecode = Base64.decode(obj.toString(), 10);
            if (bArrDecode.length < 16) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
            if (bArrDecode.length > 16) {
                bArrDecode = Arrays.copyOf(bArrDecode, 16);
            }
            for (int i = 0; i < 16; i++) {
                bArrDecode[i] = (byte) (Integer.parseInt(list.get(0).toString()) + bArrDecode[i]);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private boolean b(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("886")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("887")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("888")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("889")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("890")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("891")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("892")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("893")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("894"));
    }
}
