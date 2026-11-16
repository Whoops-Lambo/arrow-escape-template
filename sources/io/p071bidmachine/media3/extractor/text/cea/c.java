package io.p071bidmachine.media3.extractor.text.cea;

import com.explorestack.protobuf.openrtb.LossReason;
import com.safedk.android.analytics.brandsafety.b;
import com.vungle.ads.internal.protos.Sdk;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.extractor.metadata.scte35.f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends h {
    public final int i;
    public final int j;
    public final int k;
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, 116, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, b.v, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] E = {193, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    public static final int[] F = {195, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 205, 204, 236, 210, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 92, 94, 95, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final q h = new q();
    public final ArrayList m = new ArrayList();
    public b n = new b(0, 4);
    public int w = 0;
    public final long l = 16000000;

    @Override // io.p071bidmachine.media3.extractor.text.cea.h, io.p071bidmachine.media3.decoder.b
    public final void release() {
    }

    @Override // io.p071bidmachine.media3.extractor.text.cea.h
    public final f b() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new f(list);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x022a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0235  */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:159:0x024a  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // io.p071bidmachine.media3.extractor.text.cea.h
    public final void c(g gVar) {
        boolean z2;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = gVar.e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        q qVar = this.h;
        qVar.D(bArrArray, iLimit);
        boolean z3 = false;
        while (true) {
            int iA = qVar.a();
            int i5 = this.i;
            if (iA < i5) {
                if (z3) {
                    int i6 = this.q;
                    if (i6 == 1 || i6 == 3) {
                        this.o = f();
                        this.y = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iT = i5 == 2 ? -4 : qVar.t();
            int iT2 = qVar.t();
            int iT3 = qVar.t();
            if ((iT & 2) == 0 && (iT & 1) == this.j) {
                byte b = (byte) (iT2 & 127);
                byte b2 = (byte) (iT3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.s;
                    if ((iT & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[iT2] && zArr[iT3]) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    this.s = z2;
                    if (!z2 || (b & 240) != 16) {
                        this.t = false;
                        if (!z2) {
                            if (1 > b && b <= 15) {
                                this.x = false;
                            } else if ((b & 246) == 20) {
                                if (b2 == 32 && b2 != 47) {
                                    switch (b2) {
                                        default:
                                            switch (b2) {
                                                case 42:
                                                case 43:
                                                    this.x = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.x = true;
                                            break;
                                    }
                                } else {
                                    this.x = true;
                                }
                            }
                            if (this.x) {
                                i = b & 224;
                                if (i == 0) {
                                    this.w = (b >> 3) & 1;
                                }
                                if (this.w != this.k) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17 || (b2 & 240) != 48) {
                                            i3 = b & 246;
                                            if (i3 != 18 && (b2 & 224) == 32) {
                                                this.n.b();
                                                this.n.a((char) ((b & 1) == 0 ? E[b2 & 31] : F[b2 & 31]));
                                            } else if (i2 != 17 && (b2 & 240) == 32) {
                                                this.n.a(' ');
                                                boolean z5 = (b2 & 1) == 1;
                                                b bVar = this.n;
                                                bVar.a.add(new a((b2 >> 1) & 7, z5, bVar.c.length()));
                                            } else if ((b & 240) != 16 && (b2 & 192) == 64) {
                                                int i7 = z[b & 7];
                                                if ((b2 & 32) != 0) {
                                                    i7++;
                                                }
                                                b bVar2 = this.n;
                                                if (i7 != bVar2.d) {
                                                    if (this.q != 1 && !bVar2.e()) {
                                                        b bVar3 = new b(this.q, this.r);
                                                        this.n = bVar3;
                                                        this.m.add(bVar3);
                                                    }
                                                    this.n.d = i7;
                                                }
                                                boolean z6 = (b2 & 16) == 16;
                                                boolean z7 = (b2 & 1) == 1;
                                                int i8 = (b2 >> 1) & 7;
                                                b bVar4 = this.n;
                                                bVar4.a.add(new a(z6 ? 8 : i8, z7, bVar4.c.length()));
                                                if (z6) {
                                                    this.n.e = A[i8];
                                                }
                                            } else if (i2 != 23 && b2 >= 33 && b2 <= 35) {
                                                this.n.f = b2 - 32;
                                            } else if (i3 == 20 && (b2 & 240) == 32) {
                                                if (b2 == 32) {
                                                    h(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            h(1);
                                                            this.r = 2;
                                                            this.n.h = 2;
                                                            break;
                                                        case 38:
                                                            h(1);
                                                            this.r = 3;
                                                            this.n.h = 3;
                                                            break;
                                                        case 39:
                                                            h(1);
                                                            this.r = 4;
                                                            this.n.h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.q;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.o = Collections.EMPTY_LIST;
                                                                            if (i4 != 1 || i4 == 3) {
                                                                                g();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i4 == 1 && !this.n.e()) {
                                                                                b bVar5 = this.n;
                                                                                arrayList = bVar5.b;
                                                                                arrayList.add(bVar5.d());
                                                                                bVar5.c.setLength(0);
                                                                                bVar5.a.clear();
                                                                                iMin = Math.min(bVar5.h, bVar5.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            g();
                                                                            break;
                                                                        case 47:
                                                                            this.o = f();
                                                                            g();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    h(3);
                                                }
                                            }
                                        } else {
                                            this.n.a((char) D[b2 & 15]);
                                        }
                                    } else {
                                        b bVar6 = this.n;
                                        iArr = C;
                                        bVar6.a((char) iArr[(b & 127) - 32]);
                                        if ((b2 & 224) != 0) {
                                            this.n.a((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            g();
                            z3 = true;
                        }
                    } else if (this.t && this.u == b && this.v == b2) {
                        this.t = false;
                    } else {
                        this.t = true;
                        this.u = b;
                        this.v = b2;
                        if (!z2) {
                            if (1 > b) {
                                if ((b & 246) == 20) {
                                    if (b2 == 32) {
                                        this.x = true;
                                    } else {
                                        this.x = true;
                                    }
                                }
                            } else if ((b & 246) == 20) {
                                if (b2 == 32) {
                                    this.x = true;
                                } else {
                                    this.x = true;
                                }
                            }
                            if (this.x) {
                                i = b & 224;
                                if (i == 0) {
                                    this.w = (b >> 3) & 1;
                                }
                                if (this.w != this.k) {
                                    if (i == 0) {
                                        i2 = b & 247;
                                        if (i2 == 17) {
                                            i3 = b & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    h(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            h(1);
                                                                            this.r = 2;
                                                                            this.n.h = 2;
                                                                            break;
                                                                        case 38:
                                                                            h(1);
                                                                            this.r = 3;
                                                                            this.n.h = 3;
                                                                            break;
                                                                        case 39:
                                                                            h(1);
                                                                            this.r = 4;
                                                                            this.n.h = 4;
                                                                            break;
                                                                        default:
                                                                            i4 = this.q;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.o = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                g();
                                                                                            } else {
                                                                                                g();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i4 == 1) {
                                                                                                b bVar7 = this.n;
                                                                                                arrayList = bVar7.b;
                                                                                                arrayList.add(bVar7.d());
                                                                                                bVar7.c.setLength(0);
                                                                                                bVar7.a.clear();
                                                                                                iMin = Math.min(bVar7.h, bVar7.d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            g();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.o = f();
                                                                                            g();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    h(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.r = 2;
                                                                        this.n.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.r = 3;
                                                                        this.n.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.r = 4;
                                                                        this.n.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            b bVar8 = this.n;
                                                                                            arrayList = bVar8.b;
                                                                                            arrayList.add(bVar8.d());
                                                                                            bVar8.c.setLength(0);
                                                                                            bVar8.a.clear();
                                                                                            iMin = Math.min(bVar8.h, bVar8.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.r = 2;
                                                                        this.n.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.r = 3;
                                                                        this.n.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.r = 4;
                                                                        this.n.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            b bVar9 = this.n;
                                                                                            arrayList = bVar9.b;
                                                                                            arrayList.add(bVar9.d());
                                                                                            bVar9.c.setLength(0);
                                                                                            bVar9.a.clear();
                                                                                            iMin = Math.min(bVar9.h, bVar9.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.r = 2;
                                                                    this.n.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.r = 3;
                                                                    this.n.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.r = 4;
                                                                    this.n.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        b bVar10 = this.n;
                                                                                        arrayList = bVar10.b;
                                                                                        arrayList.add(bVar10.d());
                                                                                        bVar10.c.setLength(0);
                                                                                        bVar10.a.clear();
                                                                                        iMin = Math.min(bVar10.h, bVar10.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.r = 2;
                                                                        this.n.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.r = 3;
                                                                        this.n.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.r = 4;
                                                                        this.n.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            b bVar11 = this.n;
                                                                                            arrayList = bVar11.b;
                                                                                            arrayList.add(bVar11.d());
                                                                                            bVar11.c.setLength(0);
                                                                                            bVar11.a.clear();
                                                                                            iMin = Math.min(bVar11.h, bVar11.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.r = 2;
                                                                    this.n.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.r = 3;
                                                                    this.n.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.r = 4;
                                                                    this.n.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        b bVar12 = this.n;
                                                                                        arrayList = bVar12.b;
                                                                                        arrayList.add(bVar12.d());
                                                                                        bVar12.c.setLength(0);
                                                                                        bVar12.a.clear();
                                                                                        iMin = Math.min(bVar12.h, bVar12.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.r = 2;
                                                                    this.n.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.r = 3;
                                                                    this.n.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.r = 4;
                                                                    this.n.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        b bVar13 = this.n;
                                                                                        arrayList = bVar13.b;
                                                                                        arrayList.add(bVar13.d());
                                                                                        bVar13.c.setLength(0);
                                                                                        bVar13.a.clear();
                                                                                        iMin = Math.min(bVar13.h, bVar13.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.r = 2;
                                                                this.n.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.r = 3;
                                                                this.n.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.r = 4;
                                                                this.n.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    b bVar14 = this.n;
                                                                                    arrayList = bVar14.b;
                                                                                    arrayList.add(bVar14.d());
                                                                                    bVar14.c.setLength(0);
                                                                                    bVar14.a.clear();
                                                                                    iMin = Math.min(bVar14.h, bVar14.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.o = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.r = 2;
                                                                        this.n.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.r = 3;
                                                                        this.n.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.r = 4;
                                                                        this.n.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            b bVar15 = this.n;
                                                                                            arrayList = bVar15.b;
                                                                                            arrayList.add(bVar15.d());
                                                                                            bVar15.c.setLength(0);
                                                                                            bVar15.a.clear();
                                                                                            iMin = Math.min(bVar15.h, bVar15.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.r = 2;
                                                                    this.n.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.r = 3;
                                                                    this.n.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.r = 4;
                                                                    this.n.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        b bVar16 = this.n;
                                                                                        arrayList = bVar16.b;
                                                                                        arrayList.add(bVar16.d());
                                                                                        bVar16.c.setLength(0);
                                                                                        bVar16.a.clear();
                                                                                        iMin = Math.min(bVar16.h, bVar16.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.r = 2;
                                                                    this.n.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.r = 3;
                                                                    this.n.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.r = 4;
                                                                    this.n.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        b bVar17 = this.n;
                                                                                        arrayList = bVar17.b;
                                                                                        arrayList.add(bVar17.d());
                                                                                        bVar17.c.setLength(0);
                                                                                        bVar17.a.clear();
                                                                                        iMin = Math.min(bVar17.h, bVar17.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.r = 2;
                                                                this.n.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.r = 3;
                                                                this.n.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.r = 4;
                                                                this.n.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    b bVar18 = this.n;
                                                                                    arrayList = bVar18.b;
                                                                                    arrayList.add(bVar18.d());
                                                                                    bVar18.c.setLength(0);
                                                                                    bVar18.a.clear();
                                                                                    iMin = Math.min(bVar18.h, bVar18.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.o = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.r = 2;
                                                                    this.n.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.r = 3;
                                                                    this.n.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.r = 4;
                                                                    this.n.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        b bVar19 = this.n;
                                                                                        arrayList = bVar19.b;
                                                                                        arrayList.add(bVar19.d());
                                                                                        bVar19.c.setLength(0);
                                                                                        bVar19.a.clear();
                                                                                        iMin = Math.min(bVar19.h, bVar19.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.r = 2;
                                                                this.n.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.r = 3;
                                                                this.n.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.r = 4;
                                                                this.n.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    b bVar110 = this.n;
                                                                                    arrayList = bVar110.b;
                                                                                    arrayList.add(bVar110.d());
                                                                                    bVar110.c.setLength(0);
                                                                                    bVar110.a.clear();
                                                                                    iMin = Math.min(bVar110.h, bVar110.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.o = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.r = 2;
                                                                this.n.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.r = 3;
                                                                this.n.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.r = 4;
                                                                this.n.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    b bVar111 = this.n;
                                                                                    arrayList = bVar111.b;
                                                                                    arrayList.add(bVar111.d());
                                                                                    bVar111.c.setLength(0);
                                                                                    bVar111.a.clear();
                                                                                    iMin = Math.min(bVar111.h, bVar111.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.o = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b2 == 32) {
                                                    h(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            h(1);
                                                            this.r = 2;
                                                            this.n.h = 2;
                                                            break;
                                                        case 38:
                                                            h(1);
                                                            this.r = 3;
                                                            this.n.h = 3;
                                                            break;
                                                        case 39:
                                                            h(1);
                                                            this.r = 4;
                                                            this.n.h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.q;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.o = Collections.EMPTY_LIST;
                                                                            if (i4 != 1) {
                                                                                g();
                                                                            } else {
                                                                                g();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i4 == 1) {
                                                                                b bVar112 = this.n;
                                                                                arrayList = bVar112.b;
                                                                                arrayList.add(bVar112.d());
                                                                                bVar112.c.setLength(0);
                                                                                bVar112.a.clear();
                                                                                iMin = Math.min(bVar112.h, bVar112.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            g();
                                                                            break;
                                                                        case 47:
                                                                            this.o = f();
                                                                            g();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    h(3);
                                                }
                                            }
                                        } else {
                                            i3 = b & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b2 == 32) {
                                                                    h(2);
                                                                } else if (b2 != 41) {
                                                                    switch (b2) {
                                                                        case 37:
                                                                            h(1);
                                                                            this.r = 2;
                                                                            this.n.h = 2;
                                                                            break;
                                                                        case 38:
                                                                            h(1);
                                                                            this.r = 3;
                                                                            this.n.h = 3;
                                                                            break;
                                                                        case 39:
                                                                            h(1);
                                                                            this.r = 4;
                                                                            this.n.h = 4;
                                                                            break;
                                                                        default:
                                                                            i4 = this.q;
                                                                            if (i4 != 0) {
                                                                                if (b2 != 33) {
                                                                                    switch (b2) {
                                                                                        case 44:
                                                                                            this.o = Collections.EMPTY_LIST;
                                                                                            if (i4 != 1) {
                                                                                                g();
                                                                                            } else {
                                                                                                g();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i4 == 1) {
                                                                                                b bVar113 = this.n;
                                                                                                arrayList = bVar113.b;
                                                                                                arrayList.add(bVar113.d());
                                                                                                bVar113.c.setLength(0);
                                                                                                bVar113.a.clear();
                                                                                                iMin = Math.min(bVar113.h, bVar113.d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            g();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.o = f();
                                                                                            g();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    h(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.r = 2;
                                                                        this.n.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.r = 3;
                                                                        this.n.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.r = 4;
                                                                        this.n.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            b bVar114 = this.n;
                                                                                            arrayList = bVar114.b;
                                                                                            arrayList.add(bVar114.d());
                                                                                            bVar114.c.setLength(0);
                                                                                            bVar114.a.clear();
                                                                                            iMin = Math.min(bVar114.h, bVar114.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.r = 2;
                                                                        this.n.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.r = 3;
                                                                        this.n.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.r = 4;
                                                                        this.n.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            b bVar115 = this.n;
                                                                                            arrayList = bVar115.b;
                                                                                            arrayList.add(bVar115.d());
                                                                                            bVar115.c.setLength(0);
                                                                                            bVar115.a.clear();
                                                                                            iMin = Math.min(bVar115.h, bVar115.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.r = 2;
                                                                    this.n.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.r = 3;
                                                                    this.n.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.r = 4;
                                                                    this.n.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        b bVar116 = this.n;
                                                                                        arrayList = bVar116.b;
                                                                                        arrayList.add(bVar116.d());
                                                                                        bVar116.c.setLength(0);
                                                                                        bVar116.a.clear();
                                                                                        iMin = Math.min(bVar116.h, bVar116.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.r = 2;
                                                                        this.n.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.r = 3;
                                                                        this.n.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.r = 4;
                                                                        this.n.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            b bVar117 = this.n;
                                                                                            arrayList = bVar117.b;
                                                                                            arrayList.add(bVar117.d());
                                                                                            bVar117.c.setLength(0);
                                                                                            bVar117.a.clear();
                                                                                            iMin = Math.min(bVar117.h, bVar117.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.r = 2;
                                                                    this.n.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.r = 3;
                                                                    this.n.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.r = 4;
                                                                    this.n.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        b bVar118 = this.n;
                                                                                        arrayList = bVar118.b;
                                                                                        arrayList.add(bVar118.d());
                                                                                        bVar118.c.setLength(0);
                                                                                        bVar118.a.clear();
                                                                                        iMin = Math.min(bVar118.h, bVar118.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.r = 2;
                                                                    this.n.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.r = 3;
                                                                    this.n.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.r = 4;
                                                                    this.n.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        b bVar119 = this.n;
                                                                                        arrayList = bVar119.b;
                                                                                        arrayList.add(bVar119.d());
                                                                                        bVar119.c.setLength(0);
                                                                                        bVar119.a.clear();
                                                                                        iMin = Math.min(bVar119.h, bVar119.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.r = 2;
                                                                this.n.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.r = 3;
                                                                this.n.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.r = 4;
                                                                this.n.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    b bVar1110 = this.n;
                                                                                    arrayList = bVar1110.b;
                                                                                    arrayList.add(bVar1110.d());
                                                                                    bVar1110.c.setLength(0);
                                                                                    bVar1110.a.clear();
                                                                                    iMin = Math.min(bVar1110.h, bVar1110.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.o = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b2 == 32) {
                                                                h(2);
                                                            } else if (b2 != 41) {
                                                                switch (b2) {
                                                                    case 37:
                                                                        h(1);
                                                                        this.r = 2;
                                                                        this.n.h = 2;
                                                                        break;
                                                                    case 38:
                                                                        h(1);
                                                                        this.r = 3;
                                                                        this.n.h = 3;
                                                                        break;
                                                                    case 39:
                                                                        h(1);
                                                                        this.r = 4;
                                                                        this.n.h = 4;
                                                                        break;
                                                                    default:
                                                                        i4 = this.q;
                                                                        if (i4 != 0) {
                                                                            if (b2 != 33) {
                                                                                switch (b2) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (i4 != 1) {
                                                                                            g();
                                                                                        } else {
                                                                                            g();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i4 == 1) {
                                                                                            b bVar1111 = this.n;
                                                                                            arrayList = bVar1111.b;
                                                                                            arrayList.add(bVar1111.d());
                                                                                            bVar1111.c.setLength(0);
                                                                                            bVar1111.a.clear();
                                                                                            iMin = Math.min(bVar1111.h, bVar1111.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        g();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = f();
                                                                                        g();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                h(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.r = 2;
                                                                    this.n.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.r = 3;
                                                                    this.n.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.r = 4;
                                                                    this.n.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        b bVar1112 = this.n;
                                                                                        arrayList = bVar1112.b;
                                                                                        arrayList.add(bVar1112.d());
                                                                                        bVar1112.c.setLength(0);
                                                                                        bVar1112.a.clear();
                                                                                        iMin = Math.min(bVar1112.h, bVar1112.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.r = 2;
                                                                    this.n.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.r = 3;
                                                                    this.n.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.r = 4;
                                                                    this.n.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        b bVar1113 = this.n;
                                                                                        arrayList = bVar1113.b;
                                                                                        arrayList.add(bVar1113.d());
                                                                                        bVar1113.c.setLength(0);
                                                                                        bVar1113.a.clear();
                                                                                        iMin = Math.min(bVar1113.h, bVar1113.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.r = 2;
                                                                this.n.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.r = 3;
                                                                this.n.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.r = 4;
                                                                this.n.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    b bVar1114 = this.n;
                                                                                    arrayList = bVar1114.b;
                                                                                    arrayList.add(bVar1114.d());
                                                                                    bVar1114.c.setLength(0);
                                                                                    bVar1114.a.clear();
                                                                                    iMin = Math.min(bVar1114.h, bVar1114.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.o = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if ((b & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b2 == 32) {
                                                            h(2);
                                                        } else if (b2 != 41) {
                                                            switch (b2) {
                                                                case 37:
                                                                    h(1);
                                                                    this.r = 2;
                                                                    this.n.h = 2;
                                                                    break;
                                                                case 38:
                                                                    h(1);
                                                                    this.r = 3;
                                                                    this.n.h = 3;
                                                                    break;
                                                                case 39:
                                                                    h(1);
                                                                    this.r = 4;
                                                                    this.n.h = 4;
                                                                    break;
                                                                default:
                                                                    i4 = this.q;
                                                                    if (i4 != 0) {
                                                                        if (b2 != 33) {
                                                                            switch (b2) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (i4 != 1) {
                                                                                        g();
                                                                                    } else {
                                                                                        g();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i4 == 1) {
                                                                                        b bVar1115 = this.n;
                                                                                        arrayList = bVar1115.b;
                                                                                        arrayList.add(bVar1115.d());
                                                                                        bVar1115.c.setLength(0);
                                                                                        bVar1115.a.clear();
                                                                                        iMin = Math.min(bVar1115.h, bVar1115.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    g();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = f();
                                                                                    g();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            h(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.r = 2;
                                                                this.n.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.r = 3;
                                                                this.n.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.r = 4;
                                                                this.n.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    b bVar1116 = this.n;
                                                                                    arrayList = bVar1116.b;
                                                                                    arrayList.add(bVar1116.d());
                                                                                    bVar1116.c.setLength(0);
                                                                                    bVar1116.a.clear();
                                                                                    iMin = Math.min(bVar1116.h, bVar1116.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.o = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b2 == 32) {
                                                        h(2);
                                                    } else if (b2 != 41) {
                                                        switch (b2) {
                                                            case 37:
                                                                h(1);
                                                                this.r = 2;
                                                                this.n.h = 2;
                                                                break;
                                                            case 38:
                                                                h(1);
                                                                this.r = 3;
                                                                this.n.h = 3;
                                                                break;
                                                            case 39:
                                                                h(1);
                                                                this.r = 4;
                                                                this.n.h = 4;
                                                                break;
                                                            default:
                                                                i4 = this.q;
                                                                if (i4 != 0) {
                                                                    if (b2 != 33) {
                                                                        switch (b2) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i4 != 1) {
                                                                                    g();
                                                                                } else {
                                                                                    g();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i4 == 1) {
                                                                                    b bVar1117 = this.n;
                                                                                    arrayList = bVar1117.b;
                                                                                    arrayList.add(bVar1117.d());
                                                                                    bVar1117.c.setLength(0);
                                                                                    bVar1117.a.clear();
                                                                                    iMin = Math.min(bVar1117.h, bVar1117.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                g();
                                                                                break;
                                                                            case 47:
                                                                                this.o = f();
                                                                                g();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        h(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b2 == 32) {
                                                    h(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            h(1);
                                                            this.r = 2;
                                                            this.n.h = 2;
                                                            break;
                                                        case 38:
                                                            h(1);
                                                            this.r = 3;
                                                            this.n.h = 3;
                                                            break;
                                                        case 39:
                                                            h(1);
                                                            this.r = 4;
                                                            this.n.h = 4;
                                                            break;
                                                        default:
                                                            i4 = this.q;
                                                            if (i4 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.o = Collections.EMPTY_LIST;
                                                                            if (i4 != 1) {
                                                                                g();
                                                                            } else {
                                                                                g();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i4 == 1) {
                                                                                b bVar1118 = this.n;
                                                                                arrayList = bVar1118.b;
                                                                                arrayList.add(bVar1118.d());
                                                                                bVar1118.c.setLength(0);
                                                                                bVar1118.a.clear();
                                                                                iMin = Math.min(bVar1118.h, bVar1118.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            g();
                                                                            break;
                                                                        case 47:
                                                                            this.o = f();
                                                                            g();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    h(3);
                                                }
                                            }
                                        }
                                    } else {
                                        b bVar20 = this.n;
                                        iArr = C;
                                        bVar20.a((char) iArr[(b & 127) - 32]);
                                        if ((b2 & 224) != 0) {
                                            this.n.a((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            g();
                            z3 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // io.p071bidmachine.media3.extractor.text.cea.h
    public final boolean e() {
        return this.o != this.p;
    }

    public final ArrayList f() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            io.p071bidmachine.media3.common.text.b bVarC = ((b) arrayList.get(i)).c(Integer.MIN_VALUE);
            arrayList2.add(bVarC);
            if (bVarC != null) {
                iMin = Math.min(iMin, bVarC.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            io.p071bidmachine.media3.common.text.b bVarC2 = (io.p071bidmachine.media3.common.text.b) arrayList2.get(i2);
            if (bVarC2 != null) {
                if (bVarC2.i != iMin) {
                    bVarC2 = ((b) arrayList.get(i2)).c(iMin);
                    bVarC2.getClass();
                }
                arrayList3.add(bVarC2);
            }
        }
        return arrayList3;
    }

    public final void g() {
        b bVar = this.n;
        bVar.g = this.q;
        bVar.a.clear();
        bVar.b.clear();
        bVar.c.setLength(0);
        bVar.d = 15;
        bVar.e = 0;
        bVar.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void h(int i) {
        int i2 = this.q;
        if (i2 == i) {
            return;
        }
        this.q = i;
        if (i != 3) {
            g();
            if (i2 == 3 || i == 1 || i == 0) {
                this.o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i3)).g = i;
            i3++;
        }
    }

    public c(String str, int i) {
        int i2;
        if ("application/x-mp4-cea-608".equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.i = i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        a.A("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.k = 0;
                        this.j = 0;
                    } else {
                        this.k = 1;
                        this.j = 1;
                    }
                } else {
                    this.k = 0;
                    this.j = 1;
                }
            } else {
                this.k = 1;
                this.j = 0;
            }
        } else {
            this.k = 0;
            this.j = 0;
        }
        h(0);
        g();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // io.p071bidmachine.media3.extractor.text.cea.h, io.p071bidmachine.media3.decoder.b
    /* JADX INFO: renamed from: d */
    public final io.p071bidmachine.media3.extractor.text.c dequeueOutputBuffer() {
        io.p071bidmachine.media3.extractor.text.c cVar;
        io.p071bidmachine.media3.extractor.text.c cVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (cVarDequeueOutputBuffer != null) {
            return cVarDequeueOutputBuffer;
        }
        long j = this.l;
        if (j != -9223372036854775807L) {
            long j2 = this.y;
            if (j2 != -9223372036854775807L && this.e - j2 >= j && (cVar = (io.p071bidmachine.media3.extractor.text.c) this.b.pollFirst()) != null) {
                this.o = Collections.EMPTY_LIST;
                this.y = -9223372036854775807L;
                f fVarB = b();
                long j3 = this.e;
                cVar.c = j3;
                cVar.e = fVarB;
                cVar.f = j3;
                return cVar;
            }
            return null;
        }
        return null;
    }

    @Override // io.p071bidmachine.media3.extractor.text.cea.h, io.p071bidmachine.media3.decoder.b
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        h(0);
        this.r = 4;
        this.n.h = 4;
        g();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }
}
