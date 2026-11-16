package com.bytedance.sdk.openadsdk.ioy;

import com.safedk.android.analytics.brandsafety.b;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fpp {
    private static final fpp[] kgy = uq();
    private final int ahm;
    private final ahm[] rz;
    private final int uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ahm {
        private final kgy[] ahm;
        private final int kgy;

        public int ahm() {
            int iKgy = 0;
            for (kgy kgyVar : this.ahm) {
                iKgy += kgyVar.kgy();
            }
            return iKgy;
        }

        public int kgy() {
            return this.kgy;
        }

        public int rz() {
            return ahm() * this.kgy;
        }

        public kgy[] uq() {
            return this.ahm;
        }

        public ahm(int i, kgy... kgyVarArr) {
            this.kgy = i;
            this.ahm = kgyVarArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class kgy {
        private final int ahm;
        private final int kgy;

        public int ahm() {
            return this.ahm;
        }

        public int kgy() {
            return this.kgy;
        }

        public kgy(int i, int i2) {
            this.kgy = i;
            this.ahm = i2;
        }
    }

    private static fpp[] uq() {
        return new fpp[]{new fpp(1, new int[0], new ahm(7, new kgy(1, 19)), new ahm(10, new kgy(1, 16)), new ahm(13, new kgy(1, 13)), new ahm(17, new kgy(1, 9))), new fpp(2, new int[]{6, 18}, new ahm(10, new kgy(1, 34)), new ahm(16, new kgy(1, 28)), new ahm(22, new kgy(1, 22)), new ahm(28, new kgy(1, 16))), new fpp(3, new int[]{6, 22}, new ahm(15, new kgy(1, 55)), new ahm(26, new kgy(1, 44)), new ahm(18, new kgy(2, 17)), new ahm(22, new kgy(2, 13))), new fpp(4, new int[]{6, 26}, new ahm(20, new kgy(1, 80)), new ahm(18, new kgy(2, 32)), new ahm(26, new kgy(2, 24)), new ahm(16, new kgy(4, 9))), new fpp(5, new int[]{6, 30}, new ahm(26, new kgy(1, 108)), new ahm(24, new kgy(2, 43)), new ahm(18, new kgy(2, 15), new kgy(2, 16)), new ahm(22, new kgy(2, 11), new kgy(2, 12))), new fpp(6, new int[]{6, 34}, new ahm(18, new kgy(2, 68)), new ahm(16, new kgy(4, 27)), new ahm(24, new kgy(4, 19)), new ahm(28, new kgy(4, 15))), new fpp(7, new int[]{6, 22, 38}, new ahm(20, new kgy(2, 78)), new ahm(18, new kgy(4, 31)), new ahm(18, new kgy(2, 14), new kgy(4, 15)), new ahm(26, new kgy(4, 13), new kgy(1, 14))), new fpp(8, new int[]{6, 24, 42}, new ahm(24, new kgy(2, 97)), new ahm(22, new kgy(2, 38), new kgy(2, 39)), new ahm(22, new kgy(4, 18), new kgy(2, 19)), new ahm(26, new kgy(4, 14), new kgy(2, 15))), new fpp(9, new int[]{6, 26, 46}, new ahm(30, new kgy(2, 116)), new ahm(22, new kgy(3, 36), new kgy(2, 37)), new ahm(20, new kgy(4, 16), new kgy(4, 17)), new ahm(24, new kgy(4, 12), new kgy(4, 13))), new fpp(10, new int[]{6, 28, 50}, new ahm(18, new kgy(2, 68), new kgy(2, 69)), new ahm(26, new kgy(4, 43), new kgy(1, 44)), new ahm(24, new kgy(6, 19), new kgy(2, 20)), new ahm(28, new kgy(6, 15), new kgy(2, 16))), new fpp(11, new int[]{6, 30, 54}, new ahm(20, new kgy(4, 81)), new ahm(30, new kgy(1, 50), new kgy(4, 51)), new ahm(28, new kgy(4, 22), new kgy(4, 23)), new ahm(24, new kgy(3, 12), new kgy(8, 13))), new fpp(12, new int[]{6, 32, 58}, new ahm(24, new kgy(2, 92), new kgy(2, 93)), new ahm(22, new kgy(6, 36), new kgy(2, 37)), new ahm(26, new kgy(4, 20), new kgy(6, 21)), new ahm(28, new kgy(7, 14), new kgy(4, 15))), new fpp(13, new int[]{6, 34, 62}, new ahm(26, new kgy(4, 107)), new ahm(22, new kgy(8, 37), new kgy(1, 38)), new ahm(24, new kgy(8, 20), new kgy(4, 21)), new ahm(22, new kgy(12, 11), new kgy(4, 12))), new fpp(14, new int[]{6, 26, 46, 66}, new ahm(30, new kgy(3, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), new kgy(1, 116)), new ahm(24, new kgy(4, 40), new kgy(5, 41)), new ahm(20, new kgy(11, 16), new kgy(5, 17)), new ahm(24, new kgy(11, 12), new kgy(5, 13))), new fpp(15, new int[]{6, 26, 48, 70}, new ahm(22, new kgy(5, 87), new kgy(1, 88)), new ahm(24, new kgy(5, 41), new kgy(5, 42)), new ahm(30, new kgy(5, 24), new kgy(7, 25)), new ahm(24, new kgy(11, 12), new kgy(7, 13))), new fpp(16, new int[]{6, 26, 50, 74}, new ahm(24, new kgy(5, 98), new kgy(1, 99)), new ahm(28, new kgy(7, 45), new kgy(3, 46)), new ahm(24, new kgy(15, 19), new kgy(2, 20)), new ahm(30, new kgy(3, 15), new kgy(13, 16))), new fpp(17, new int[]{6, 30, 54, 78}, new ahm(28, new kgy(1, 107), new kgy(5, 108)), new ahm(28, new kgy(10, 46), new kgy(1, 47)), new ahm(28, new kgy(1, 22), new kgy(15, 23)), new ahm(28, new kgy(2, 14), new kgy(17, 15))), new fpp(18, new int[]{6, 30, 56, 82}, new ahm(30, new kgy(5, b.v), new kgy(1, Sdk.SDKError.Reason.TPAT_ERROR_VALUE)), new ahm(26, new kgy(9, 43), new kgy(4, 44)), new ahm(28, new kgy(17, 22), new kgy(1, 23)), new ahm(28, new kgy(2, 14), new kgy(19, 15))), new fpp(19, new int[]{6, 30, 58, 86}, new ahm(28, new kgy(3, 113), new kgy(4, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE)), new ahm(26, new kgy(3, 44), new kgy(11, 45)), new ahm(26, new kgy(17, 21), new kgy(4, 22)), new ahm(26, new kgy(9, 13), new kgy(16, 14))), new fpp(20, new int[]{6, 34, 62, 90}, new ahm(28, new kgy(3, 107), new kgy(5, 108)), new ahm(26, new kgy(3, 41), new kgy(13, 42)), new ahm(30, new kgy(15, 24), new kgy(5, 25)), new ahm(28, new kgy(15, 15), new kgy(10, 16))), new fpp(21, new int[]{6, 28, 50, 72, 94}, new ahm(28, new kgy(4, 116), new kgy(4, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)), new ahm(26, new kgy(17, 42)), new ahm(28, new kgy(17, 22), new kgy(6, 23)), new ahm(30, new kgy(19, 16), new kgy(6, 17))), new fpp(22, new int[]{6, 26, 50, 74, 98}, new ahm(28, new kgy(2, 111), new kgy(7, 112)), new ahm(28, new kgy(17, 46)), new ahm(30, new kgy(7, 24), new kgy(16, 25)), new ahm(24, new kgy(34, 13))), new fpp(23, new int[]{6, 30, 54, 78, 102}, new ahm(30, new kgy(4, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), new kgy(5, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)), new ahm(28, new kgy(4, 47), new kgy(14, 48)), new ahm(30, new kgy(11, 24), new kgy(14, 25)), new ahm(30, new kgy(16, 15), new kgy(14, 16))), new fpp(24, new int[]{6, 28, 54, 80, 106}, new ahm(30, new kgy(6, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), new kgy(4, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)), new ahm(28, new kgy(6, 45), new kgy(14, 46)), new ahm(30, new kgy(11, 24), new kgy(16, 25)), new ahm(30, new kgy(30, 16), new kgy(2, 17))), new fpp(25, new int[]{6, 32, 58, 84, 110}, new ahm(26, new kgy(8, 106), new kgy(4, 107)), new ahm(28, new kgy(8, 47), new kgy(13, 48)), new ahm(30, new kgy(7, 24), new kgy(22, 25)), new ahm(30, new kgy(22, 15), new kgy(13, 16))), new fpp(26, new int[]{6, 30, 58, 86, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE}, new ahm(28, new kgy(10, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE), new kgy(2, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE)), new ahm(28, new kgy(19, 46), new kgy(4, 47)), new ahm(28, new kgy(28, 22), new kgy(6, 23)), new ahm(30, new kgy(33, 16), new kgy(4, 17))), new fpp(27, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, new ahm(30, new kgy(8, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), new kgy(4, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)), new ahm(28, new kgy(22, 45), new kgy(3, 46)), new ahm(30, new kgy(8, 23), new kgy(26, 24)), new ahm(30, new kgy(12, 15), new kgy(28, 16))), new fpp(28, new int[]{6, 26, 50, 74, 98, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, new ahm(30, new kgy(3, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), new kgy(10, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)), new ahm(28, new kgy(3, 45), new kgy(23, 46)), new ahm(30, new kgy(4, 24), new kgy(31, 25)), new ahm(30, new kgy(11, 15), new kgy(31, 16))), new fpp(29, new int[]{6, 30, 54, 78, 102, 126}, new ahm(30, new kgy(7, 116), new kgy(7, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)), new ahm(28, new kgy(21, 45), new kgy(7, 46)), new ahm(30, new kgy(1, 23), new kgy(37, 24)), new ahm(30, new kgy(19, 15), new kgy(26, 16))), new fpp(30, new int[]{6, 26, 52, 78, 104, 130}, new ahm(30, new kgy(5, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), new kgy(10, 116)), new ahm(28, new kgy(19, 47), new kgy(10, 48)), new ahm(30, new kgy(15, 24), new kgy(25, 25)), new ahm(30, new kgy(23, 15), new kgy(25, 16))), new fpp(31, new int[]{6, 30, 56, 82, 108, 134}, new ahm(30, new kgy(13, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), new kgy(3, 116)), new ahm(28, new kgy(2, 46), new kgy(29, 47)), new ahm(30, new kgy(42, 24), new kgy(1, 25)), new ahm(30, new kgy(23, 15), new kgy(28, 16))), new fpp(32, new int[]{6, 34, 60, 86, 112, 138}, new ahm(30, new kgy(17, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE)), new ahm(28, new kgy(10, 46), new kgy(23, 47)), new ahm(30, new kgy(10, 24), new kgy(35, 25)), new ahm(30, new kgy(19, 15), new kgy(35, 16))), new fpp(33, new int[]{6, 30, 58, 86, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 142}, new ahm(30, new kgy(17, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), new kgy(1, 116)), new ahm(28, new kgy(14, 46), new kgy(21, 47)), new ahm(30, new kgy(29, 24), new kgy(19, 25)), new ahm(30, new kgy(11, 15), new kgy(46, 16))), new fpp(34, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 146}, new ahm(30, new kgy(13, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), new kgy(6, 116)), new ahm(28, new kgy(14, 46), new kgy(23, 47)), new ahm(30, new kgy(44, 24), new kgy(7, 25)), new ahm(30, new kgy(59, 16), new kgy(1, 17))), new fpp(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new ahm(30, new kgy(12, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), new kgy(7, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)), new ahm(28, new kgy(12, 47), new kgy(26, 48)), new ahm(30, new kgy(39, 24), new kgy(14, 25)), new ahm(30, new kgy(22, 15), new kgy(41, 16))), new fpp(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new ahm(30, new kgy(6, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), new kgy(14, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)), new ahm(28, new kgy(6, 47), new kgy(34, 48)), new ahm(30, new kgy(46, 24), new kgy(10, 25)), new ahm(30, new kgy(2, 15), new kgy(64, 16))), new fpp(37, new int[]{6, 28, 54, 80, 106, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 158}, new ahm(30, new kgy(17, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), new kgy(4, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)), new ahm(28, new kgy(29, 46), new kgy(14, 47)), new ahm(30, new kgy(49, 24), new kgy(10, 25)), new ahm(30, new kgy(24, 15), new kgy(46, 16))), new fpp(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new ahm(30, new kgy(4, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), new kgy(18, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)), new ahm(28, new kgy(13, 46), new kgy(32, 47)), new ahm(30, new kgy(48, 24), new kgy(14, 25)), new ahm(30, new kgy(42, 15), new kgy(32, 16))), new fpp(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new ahm(30, new kgy(20, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), new kgy(4, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)), new ahm(28, new kgy(40, 47), new kgy(7, 48)), new ahm(30, new kgy(43, 24), new kgy(22, 25)), new ahm(30, new kgy(10, 15), new kgy(67, 16))), new fpp(40, new int[]{6, 30, 58, 86, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 142, 170}, new ahm(30, new kgy(19, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), new kgy(6, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)), new ahm(28, new kgy(18, 47), new kgy(31, 48)), new ahm(30, new kgy(34, 24), new kgy(34, 25)), new ahm(30, new kgy(20, 15), new kgy(61, 16)))};
    }

    public static fpp kgy(int i) {
        if (i > 0 && i <= 40) {
            return kgy[i - 1];
        }
        e32.a();
        return null;
    }

    public int ahm() {
        return this.uq;
    }

    public int rz() {
        return (this.ahm * 4) + 17;
    }

    private fpp(int i, int[] iArr, ahm... ahmVarArr) {
        this.ahm = i;
        this.rz = ahmVarArr;
        int iKgy = ahmVarArr[0].kgy();
        int iAhm = 0;
        for (kgy kgyVar : ahmVarArr[0].uq()) {
            iAhm += (kgyVar.ahm() + iKgy) * kgyVar.kgy();
        }
        this.uq = iAhm;
    }

    public ahm kgy(fi fiVar) {
        return this.rz[fiVar.ordinal()];
    }

    public int kgy() {
        return this.ahm;
    }
}
