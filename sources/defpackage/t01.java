package defpackage;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class t01 implements Comparable {
    public static final t01 c;
    public static final t01 d;
    public static final t01 e;
    public static final t01 f;
    public static final t01 g;
    public static final t01 h;
    public static final t01 i;
    public static final t01 j;
    public static final t01 k;
    public static final t01 l;
    public static final t01 m;
    public static final t01 n;
    public static final List o;
    public static final LinkedHashMap p;
    public final int a;
    public final String b;

    static {
        t01 t01Var = new t01(100, "Continue");
        t01 t01Var2 = new t01(101, "Switching Protocols");
        t01 t01Var3 = new t01(102, "Processing");
        t01 t01Var4 = new t01(200, "OK");
        c = t01Var4;
        t01 t01Var5 = new t01(201, "Created");
        t01 t01Var6 = new t01(202, "Accepted");
        t01 t01Var7 = new t01(203, "Non-Authoritative Information");
        t01 t01Var8 = new t01(204, "No Content");
        d = t01Var8;
        t01 t01Var9 = new t01(205, "Reset Content");
        t01 t01Var10 = new t01(206, "Partial Content");
        t01 t01Var11 = new t01(207, "Multi-Status");
        t01 t01Var12 = new t01(300, "Multiple Choices");
        t01 t01Var13 = new t01(Sdk.SDKError.Reason.MRAID_ERROR_VALUE, "Moved Permanently");
        e = t01Var13;
        t01 t01Var14 = new t01(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE, "Found");
        f = t01Var14;
        t01 t01Var15 = new t01(303, "See Other");
        g = t01Var15;
        t01 t01Var16 = new t01(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, "Not Modified");
        h = t01Var16;
        t01 t01Var17 = new t01(Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, "Use Proxy");
        t01 t01Var18 = new t01(306, "Switch Proxy");
        t01 t01Var19 = new t01(307, "Temporary Redirect");
        i = t01Var19;
        t01 t01Var20 = new t01(308, "Permanent Redirect");
        j = t01Var20;
        t01 t01Var21 = new t01(400, "Bad Request");
        k = t01Var21;
        t01 t01Var22 = new t01(401, "Unauthorized");
        t01 t01Var23 = new t01(TTAdConstant.AD_ID_IS_NULL_CODE, "Payment Required");
        t01 t01Var24 = new t01(403, "Forbidden");
        t01 t01Var25 = new t01(404, "Not Found");
        l = t01Var25;
        t01 t01Var26 = new t01(405, "Method Not Allowed");
        t01 t01Var27 = new t01(406, "Not Acceptable");
        t01 t01Var28 = new t01(407, "Proxy Authentication Required");
        t01 t01Var29 = new t01(408, "Request Timeout");
        m = t01Var29;
        t01 t01Var30 = new t01(409, "Conflict");
        t01 t01Var31 = new t01(410, "Gone");
        t01 t01Var32 = new t01(411, "Length Required");
        t01 t01Var33 = new t01(TTAdConstant.IMAGE_URL_CODE, "Precondition Failed");
        t01 t01Var34 = new t01(TTAdConstant.VIDEO_INFO_CODE, "Payload Too Large");
        t01 t01Var35 = new t01(TTAdConstant.VIDEO_URL_CODE, "Request-URI Too Long");
        t01 t01Var36 = new t01(TTAdConstant.VIDEO_COVER_URL_CODE, "Unsupported Media Type");
        t01 t01Var37 = new t01(TTAdConstant.PACKAGE_NAME_CODE, "Requested Range Not Satisfiable");
        t01 t01Var38 = new t01(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, "Expectation Failed");
        t01 t01Var39 = new t01(422, "Unprocessable Entity");
        t01 t01Var40 = new t01(423, "Locked");
        t01 t01Var41 = new t01(424, "Failed Dependency");
        t01 t01Var42 = new t01(425, "Too Early");
        t01 t01Var43 = new t01(426, "Upgrade Required");
        t01 t01Var44 = new t01(CommonGatewayClient.CODE_TOO_MANY_REQUESTS, "Too Many Requests");
        n = t01Var44;
        List listZ = eu.z(t01Var, t01Var2, t01Var3, t01Var4, t01Var5, t01Var6, t01Var7, t01Var8, t01Var9, t01Var10, t01Var11, t01Var12, t01Var13, t01Var14, t01Var15, t01Var16, t01Var17, t01Var18, t01Var19, t01Var20, t01Var21, t01Var22, t01Var23, t01Var24, t01Var25, t01Var26, t01Var27, t01Var28, t01Var29, t01Var30, t01Var31, t01Var32, t01Var33, t01Var34, t01Var35, t01Var36, t01Var37, t01Var38, t01Var39, t01Var40, t01Var41, t01Var42, t01Var43, t01Var44, new t01(431, "Request Header Fields Too Large"), new t01(500, "Internal Server Error"), new t01(501, "Not Implemented"), new t01(502, "Bad Gateway"), new t01(503, "Service Unavailable"), new t01(504, "Gateway Timeout"), new t01(505, "HTTP Version Not Supported"), new t01(506, "Variant Also Negotiates"), new t01(507, "Insufficient Storage"));
        o = listZ;
        List list = listZ;
        int iU = rh1.U(eu.f(list, 10));
        if (iU < 16) {
            iU = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((t01) obj).a), obj);
        }
        p = linkedHashMap;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        t01 t01Var = (t01) obj;
        t01Var.getClass();
        return this.a - t01Var.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t01) && ((t01) obj).a == this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return this.a + ' ' + this.b;
    }

    public t01(int i2, String str) {
        this.a = i2;
        this.b = str;
    }
}
