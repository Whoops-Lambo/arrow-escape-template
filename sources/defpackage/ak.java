package defpackage;

import android.media.AudioDescriptor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.facebook.appevents.p;
import com.facebook.internal.v0;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import com.facebook.u;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.play_billing.c;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzgc;
import com.google.android.gms.internal.play_billing.zzic;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.G5;
import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import com.usercentrics.tcf.core.model.gvl.VendorUrl;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ak {
    public static final nl0 a;
    public static final nl0 b;
    public static final nl0 c;
    public static final nl0 d;
    public static final nl0 e;
    public static final ee2 f = new ee2(1);
    public static final ng1 g = new ng1(15);
    public static final ee2 h = new ee2(0);

    public static u12 i(int i, int i2, int i3) {
        if (i == -2) {
            return ec0.s;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            return new dc0(i4);
        }
        int i5 = i2 - i3;
        if (i5 > 0) {
            return new dc0(i5);
        }
        return null;
    }

    static {
        int i = 12;
        a = new nl0(i);
        b = new nl0(i);
        c = new nl0(i);
        d = new nl0(i);
        e = new nl0(i);
    }

    public static int A(byte[] bArr, int i) {
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int C(byte[] bArr, int i, zzfz zzfzVar, f8 f8Var) throws zzgc {
        ui4 ui4Var = (ui4) zzfzVar;
        int iF = F(bArr, i, f8Var);
        int i2 = f8Var.a + iF;
        while (iF < i2) {
            iF = F(bArr, iF, f8Var);
            ui4Var.d(f8Var.a);
        }
        if (iF == i2) {
            return iF;
        }
        y.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int E(int i, byte[] bArr, int i2, int i3, zzic zzicVar, f8 f8Var) throws zzgc {
        if ((i >>> 3) == 0) {
            y.t("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int I = I(bArr, i2, f8Var);
            zzicVar.c(i, Long.valueOf(f8Var.b));
            return I;
        }
        if (i4 == 1) {
            zzicVar.c(i, Long.valueOf(M(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iF = F(bArr, i2, f8Var);
            int i5 = f8Var.a;
            if (i5 < 0) {
                y.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iF) {
                y.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                zzicVar.c(i, zzev.b);
            } else {
                zzicVar.c(i, zzev.t(iF, i5, bArr));
            }
            return iF + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzicVar.c(i, Integer.valueOf(A(bArr, i2)));
                return i2 + 4;
            }
            y.t("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        zzic zzicVarB = zzic.b();
        int i7 = f8Var.d + 1;
        f8Var.d = i7;
        if (i7 >= 100) {
            y.t("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iF2 = F(bArr, i2, f8Var);
            int i9 = f8Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iF2;
                break;
            }
            i2 = E(i9, bArr, iF2, i3, zzicVarB, f8Var);
            i8 = i9;
        }
        f8Var.d--;
        if (i2 > i3 || i8 != i6) {
            y.t("Failed to parse the message.");
            return 0;
        }
        zzicVar.c(i, zzicVarB);
        return i2;
    }

    public static int F(byte[] bArr, int i, f8 f8Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return G(b2, i2, f8Var, bArr);
        }
        f8Var.a = b2;
        return i2;
    }

    public static int G(int i, int i2, f8 f8Var, byte[] bArr) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            f8Var.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            f8Var.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            f8Var.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            f8Var.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                f8Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int H(int i, byte[] bArr, int i2, int i3, zzfz zzfzVar, f8 f8Var) {
        ui4 ui4Var = (ui4) zzfzVar;
        int iF = F(bArr, i2, f8Var);
        ui4Var.d(f8Var.a);
        while (iF < i3) {
            int iF2 = F(bArr, iF, f8Var);
            if (i != f8Var.a) {
                break;
            }
            iF = F(bArr, iF2, f8Var);
            ui4Var.d(f8Var.a);
        }
        return iF;
    }

    public static int I(byte[] bArr, int i, f8 f8Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            f8Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & 127)) << i4;
            b2 = b3;
            i3 = i5;
        }
        f8Var.b = j2;
        return i3;
    }

    public static int J(Object obj, mv4 mv4Var, byte[] bArr, int i, int i2, int i3, f8 f8Var) throws zzgc {
        c cVar = (c) mv4Var;
        int i4 = f8Var.d + 1;
        f8Var.d = i4;
        if (i4 >= 100) {
            y.t("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iR = cVar.r(obj, bArr, i, i2, i3, f8Var);
        f8Var.d--;
        f8Var.c = obj;
        return iR;
    }

    public static int K(Object obj, mv4 mv4Var, byte[] bArr, int i, int i2, f8 f8Var) throws zzgc {
        int iG = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iG = G(i3, iG, f8Var, bArr);
            i3 = f8Var.a;
        }
        int i4 = iG;
        if (i3 < 0 || i3 > i2 - i4) {
            y.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = f8Var.d + 1;
        f8Var.d = i5;
        if (i5 >= 100) {
            y.t("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        mv4Var.b(obj, bArr, i4, i6, f8Var);
        f8Var.d--;
        f8Var.c = obj;
        return i6;
    }

    public static int L(int i, byte[] bArr, int i2, int i3, f8 f8Var) throws zzgc {
        if ((i >>> 3) == 0) {
            y.t("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return I(bArr, i2, f8Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return F(bArr, i2, f8Var) + f8Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            y.t("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = F(bArr, i2, f8Var);
            i6 = f8Var.a;
            if (i6 == i5) {
                break;
            }
            i2 = L(i6, bArr, i2, i3, f8Var);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        y.t("Failed to parse the message.");
        return 0;
    }

    public static long M(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static final Executor a(uy uyVar) {
        Executor executorU;
        zi0 zi0Var = uyVar instanceof zi0 ? (zi0) uyVar : null;
        return (zi0Var == null || (executorU = zi0Var.U()) == null) ? new vc0(uyVar) : executorU;
    }

    public static Object b(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(ak.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c9 -> B:39:0x00d0). Please report as a decompilation issue!!! */
    public static final Object d(rl rlVar, final FileChannel fileChannel, final long j, fy fyVar) throws Throwable {
        fm fmVar;
        final l32 l32Var;
        wr0 wr0Var;
        Throwable thB;
        rl rlVar2;
        rl rlVar3;
        wr0 wr0Var2;
        l32 l32Var2;
        long j2;
        if (fyVar instanceof fm) {
            fmVar = (fm) fyVar;
            int i = fmVar.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                fmVar.x = i - Integer.MIN_VALUE;
            } else {
                fmVar = new fm(fyVar);
            }
        } else {
            fmVar = new fm(fyVar);
        }
        Object obj = fmVar.w;
        int i2 = fmVar.x;
        if (i2 == 0) {
            wz2.a0(obj);
            if (j < 0) {
                ak1.n(jc1.l(j, "Limit shouldn't be negative: "));
                return null;
            }
            if (rlVar.h()) {
                Throwable thB2 = rlVar.b();
                if (thB2 == null) {
                    return new Long(0L);
                }
                throw thB2;
            }
            l32Var = new l32();
            wr0Var = new wr0() { // from class: em
                @Override // defpackage.wr0
                public final Object invoke(Object obj2) throws IOException {
                    ByteBuffer byteBuffer = (ByteBuffer) obj2;
                    byteBuffer.getClass();
                    l32 l32Var3 = l32Var;
                    long j3 = j - l32Var3.a;
                    long jRemaining = byteBuffer.remaining();
                    WritableByteChannel writableByteChannel = fileChannel;
                    if (j3 < jRemaining) {
                        int iLimit = byteBuffer.limit();
                        byteBuffer.limit(byteBuffer.position() + ((int) j3));
                        while (byteBuffer.hasRemaining()) {
                            writableByteChannel.write(byteBuffer);
                        }
                        byteBuffer.limit(iLimit);
                        l32Var3.a += j3;
                    } else {
                        long jWrite = 0;
                        while (byteBuffer.hasRemaining()) {
                            jWrite += (long) writableByteChannel.write(byteBuffer);
                        }
                        l32Var3.a += jWrite;
                    }
                    return az2.a;
                }
            };
            if (l32Var.a < j) {
            }
            thB = rlVar.b();
            if (thB == null) {
                return new Long(l32Var.a);
            }
            throw thB;
        }
        if (i2 == 1) {
            j2 = fmVar.v;
            rl rlVar4 = fmVar.u;
            wr0Var2 = fmVar.t;
            l32Var2 = fmVar.s;
            rlVar2 = fmVar.r;
            wz2.a0(obj);
            if (!((Boolean) obj).booleanValue()) {
                StringBuilder sb = new StringBuilder("Not enough bytes available: required 0 but ");
                rlVar4.getClass();
                bk bkVarF = rlVar4.f();
                bkVarF.getClass();
                throw new EOFException(nj.l((int) bkVarF.c, " available", sb));
            }
            at.x(rlVar4.f(), wr0Var2);
            l32Var = l32Var2;
            wr0Var = wr0Var2;
            j = j2;
            rlVar = rlVar2;
            if (l32Var.a < j || rlVar.h()) {
                thB = rlVar.b();
                if (thB == null) {
                    return new Long(l32Var.a);
                }
                throw thB;
            }
            fmVar.r = rlVar;
            fmVar.s = l32Var;
            fmVar.t = wr0Var;
            fmVar.u = rlVar;
            fmVar.v = j;
            fmVar.x = 2;
            Object objG = rlVar.g(1, fmVar);
            dz dzVar = dz.a;
            if (objG == dzVar) {
                return dzVar;
            }
            rlVar2 = rlVar;
            long j3 = j;
            rlVar3 = rlVar2;
            wr0Var2 = wr0Var;
            l32Var2 = l32Var;
            obj = objG;
            j2 = j3;
        } else {
            if (i2 != 2) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = fmVar.v;
            rlVar3 = fmVar.u;
            wr0Var2 = fmVar.t;
            l32Var2 = fmVar.s;
            rlVar2 = fmVar.r;
            wz2.a0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            at.x(rlVar3.f(), wr0Var2);
        }
        l32Var = l32Var2;
        wr0Var = wr0Var2;
        j = j2;
        rlVar = rlVar2;
        if (l32Var.a < j) {
        }
        thB = rlVar.b();
        if (thB == null) {
            return new Long(l32Var.a);
        }
        throw thB;
    }

    public static final uy h(Executor executor) {
        uy uyVar;
        vc0 vc0Var = executor instanceof vc0 ? (vc0) executor : null;
        return (vc0Var == null || (uyVar = vc0Var.a) == null) ? new aj0(executor) : uyVar;
    }

    public static final f82 j(Object obj) {
        if (obj != h00.b) {
            return (f82) obj;
        }
        e32.i("Does not contain segment");
        return null;
    }

    public static ng2 k(z22 z22Var) {
        View view = z22Var.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        u12 u12VarI = i(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (u12VarI == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        u12 u12VarI2 = i(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (u12VarI2 == null) {
            return null;
        }
        return new ng2(u12VarI, u12VarI2);
    }

    public static String n(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static final boolean q(Object obj) {
        return obj == h00.b;
    }

    public static void t(ShareContent shareContent, ng1 ng1Var) {
        if (shareContent == null) {
            p.e("Must provide non-null content to share");
            return;
        }
        if (shareContent instanceof ShareLinkContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            shareLinkContent.getClass();
            Uri uri = shareLinkContent.a;
            if (uri == null || v0.H(uri)) {
                return;
            }
            p.e("Content Url must be an http:// or https:// url");
            return;
        }
        if (shareContent instanceof SharePhotoContent) {
            List list = ((SharePhotoContent) shareContent).g;
            if (list == null || list.isEmpty()) {
                p.e("Must specify at least one Photo in SharePhotoContent.");
                return;
            } else {
                if (list.size() > 6) {
                    throw new u(String.format(Locale.ROOT, "Cannot add more than %d photos.", Arrays.copyOf(new Object[]{6}, 1)));
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ng1Var.x((SharePhoto) it.next());
                }
                return;
            }
        }
        if (shareContent instanceof ShareVideoContent) {
            ng1Var.A((ShareVideoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareMediaContent) {
            ng1Var.w((ShareMediaContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareCameraEffectContent) {
            if (v0.G(((ShareCameraEffectContent) shareContent).g)) {
                p.e("Must specify a non-empty effectId");
            }
        } else if (shareContent instanceof ShareStoryContent) {
            ng1Var.y((ShareStoryContent) shareContent);
        }
    }

    public static int x(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return -2147483647;
        }
        long jW = zzfq.w(j, 8000000L, j2, RoundingMode.HALF_UP);
        if (jW <= 0 || jW > 2147483647L) {
            return -2147483647;
        }
        return (int) jW;
    }

    public static zzgzb z(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            ar4 ar4Var = zzgzb.b;
            return w.e;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(xj4.f).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorF = kb3.f(it.next());
            if (audioDescriptorF.getStandard() == 1) {
                byte[] descriptor = audioDescriptorF.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    rl3.q(new StringBuilder(String.valueOf(length).length() + 20), "Invalid SAD length: ", length, "AudioDescriptorUtil");
                } else {
                    byte b2 = descriptor[0];
                    int i = (b2 & 7) + 1;
                    if (((b2 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(zzfq.e(i)));
                    }
                }
            }
        }
        return zzgzb.B(treeSet);
    }

    public static int B(mv4 mv4Var, int i, byte[] bArr, int i2, int i3, zzfz zzfzVar, f8 f8Var) throws zzgc {
        Object objZze = mv4Var.zze();
        mv4 mv4Var2 = mv4Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        f8 f8Var2 = f8Var;
        int iK = K(objZze, mv4Var2, bArr2, i2, i4, f8Var2);
        mv4Var2.zzf(objZze);
        f8Var2.c = objZze;
        zzfzVar.add(objZze);
        while (iK < i4) {
            f8 f8Var3 = f8Var2;
            int i5 = i4;
            int iF = F(bArr2, iK, f8Var3);
            if (i != f8Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            mv4 mv4Var3 = mv4Var2;
            Object objZze2 = mv4Var3.zze();
            iK = K(objZze2, mv4Var3, bArr3, iF, i5, f8Var3);
            mv4Var2 = mv4Var3;
            bArr2 = bArr3;
            i4 = i5;
            f8Var2 = f8Var3;
            mv4Var2.zzf(objZze2);
            f8Var2.c = objZze2;
            zzfzVar.add(objZze2);
        }
        return iK;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f A[PHI: r5
  0x009f: PHI (r5v6 byte) = (r5v5 byte), (r5v9 byte) binds: [B:45:0x009a, B:47:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00b7 A[SYNTHETIC] */
    public static int D(byte[] bArr, int i, f8 f8Var) throws zzgc {
        int iF = F(bArr, i, f8Var);
        int i2 = f8Var.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                f8Var.c = "";
                return iF;
            }
            int i3 = xz4.a;
            int length = bArr.length;
            if ((((length - iF) - i2) | iF | i2) >= 0) {
                int i4 = iF + i2;
                char[] cArr = new char[i2];
                int i5 = 0;
                while (iF < i4) {
                    byte b2 = bArr[iF];
                    if (b2 < 0) {
                        break;
                    }
                    iF++;
                    cArr[i5] = (char) b2;
                    i5++;
                }
                while (iF < i4) {
                    int i6 = iF + 1;
                    byte b3 = bArr[iF];
                    if (b3 >= 0) {
                        cArr[i5] = (char) b3;
                        i5++;
                        iF = i6;
                        while (iF < i4) {
                            byte b4 = bArr[iF];
                            if (b4 < 0) {
                                break;
                            }
                            iF++;
                            cArr[i5] = (char) b4;
                            i5++;
                        }
                    } else if (b3 < -32) {
                        if (i6 < i4) {
                            int i7 = i5 + 1;
                            iF += 2;
                            byte b5 = bArr[i6];
                            if (b3 >= -62 && !tb5.G(b5)) {
                                cArr[i5] = (char) ((b5 & 63) | ((b3 & 31) << 6));
                                i5 = i7;
                            } else {
                                y.t("Protocol message had invalid UTF-8.");
                                return 0;
                            }
                        } else {
                            y.t("Protocol message had invalid UTF-8.");
                            return 0;
                        }
                    } else {
                        if (b3 < -16) {
                            if (i6 < i4 - 1) {
                                int i8 = i5 + 1;
                                int i9 = iF + 2;
                                byte b6 = bArr[i6];
                                iF += 3;
                                byte b7 = bArr[i9];
                                if (!tb5.G(b6)) {
                                    if (b3 == -32) {
                                        if (b6 >= -96) {
                                            b3 = -32;
                                            if (b3 != -19) {
                                                if (b6 < -96) {
                                                    b3 = -19;
                                                    if (!tb5.G(b7)) {
                                                        cArr[i5] = (char) (((b6 & 63) << 6) | ((b3 & 15) << 12) | (b7 & 63));
                                                        i5 = i8;
                                                    }
                                                }
                                            } else if (!tb5.G(b7)) {
                                                cArr[i5] = (char) (((b6 & 63) << 6) | ((b3 & 15) << 12) | (b7 & 63));
                                                i5 = i8;
                                            }
                                        }
                                    } else if (b3 != -19) {
                                        if (b6 < -96) {
                                            b3 = -19;
                                            if (!tb5.G(b7)) {
                                                cArr[i5] = (char) (((b6 & 63) << 6) | ((b3 & 15) << 12) | (b7 & 63));
                                                i5 = i8;
                                            }
                                        }
                                    } else if (!tb5.G(b7)) {
                                        cArr[i5] = (char) (((b6 & 63) << 6) | ((b3 & 15) << 12) | (b7 & 63));
                                        i5 = i8;
                                    }
                                }
                                y.t("Protocol message had invalid UTF-8.");
                                return 0;
                            }
                            y.t("Protocol message had invalid UTF-8.");
                            return 0;
                        }
                        if (i6 < i4 - 2) {
                            byte b8 = bArr[i6];
                            int i10 = iF + 3;
                            byte b9 = bArr[iF + 2];
                            iF += 4;
                            byte b10 = bArr[i10];
                            if (!tb5.G(b8)) {
                                if ((((b8 + 112) + (b3 << 28)) >> 30) == 0 && !tb5.G(b9) && !tb5.G(b10)) {
                                    int i11 = ((b8 & 63) << 12) | ((b3 & 7) << 18) | ((b9 & 63) << 6) | (b10 & 63);
                                    cArr[i5] = (char) ((i11 >>> 10) + 55232);
                                    cArr[i5 + 1] = (char) ((i11 & 1023) + 56320);
                                    i5 += 2;
                                }
                            }
                            y.t("Protocol message had invalid UTF-8.");
                            return 0;
                        }
                        y.t("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                }
                f8Var.c = new String(cArr, 0, i5);
                return i4;
            }
            vq2.o("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iF), Integer.valueOf(i2)});
            return 0;
        }
        y.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static final Charset c(rx rxVar) {
        rxVar.getClass();
        String strA = rxVar.a(G5.N);
        if (strA != null) {
            try {
                Charset charset = er.a;
                Charset charsetForName = Charset.forName(strA);
                charsetForName.getClass();
                return charsetForName;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return null;
    }

    public static void f(String str, String str2, Object obj) {
        String strN = n(str);
        if (Log.isLoggable(strN, 3)) {
            Log.d(strN, String.format(str2, obj));
        }
    }

    public static void g(String str, String str2, Exception exc) {
        String strN = n(str);
        if (Log.isLoggable(strN, 6)) {
            Log.e(strN, str2, exc);
        }
    }

    public static final VendorUrl o(TCFVendor tCFVendor, UsercentricsSettings usercentricsSettings) {
        Object next;
        Object next2;
        tCFVendor.getClass();
        usercentricsSettings.getClass();
        List list = tCFVendor.w;
        Iterator it = list.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!s71.b(((VendorUrl) next).a, usercentricsSettings.d));
        VendorUrl vendorUrl = (VendorUrl) next;
        Iterator it2 = list.iterator();
        do {
            if (it2.hasNext()) {
                next2 = it2.next();
            } else {
                next2 = null;
                break;
            }
        } while (!s71.b(((VendorUrl) next2).a, "en"));
        VendorUrl vendorUrl2 = (VendorUrl) next2;
        VendorUrl vendorUrl3 = (VendorUrl) du.c0(list);
        if (vendorUrl == null) {
            if (vendorUrl2 == null) {
                if (vendorUrl3 == null) {
                    return null;
                }
                return vendorUrl3;
            }
            return vendorUrl2;
        }
        return vendorUrl;
    }

    public static void r(PAGRequest pAGRequest, String str, MediationAdConfiguration mediationAdConfiguration) {
        if (!TextUtils.isEmpty(str)) {
            String watermark = mediationAdConfiguration.getWatermark();
            if (TextUtils.isEmpty(watermark)) {
                return;
            }
            Map<String, Object> extraInfo = pAGRequest.getExtraInfo();
            if (extraInfo == null) {
                extraInfo = new HashMap<>();
            }
            extraInfo.put("admob_watermark", watermark);
            pAGRequest.setExtraInfo(extraInfo);
        }
    }

    public static int y(byte[] bArr, int i, f8 f8Var) throws zzgc {
        int iF = F(bArr, i, f8Var);
        int i2 = f8Var.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - iF) {
                if (i2 == 0) {
                    f8Var.c = zzev.b;
                    return iF;
                }
                f8Var.c = zzev.t(iF, i2, bArr);
                return iF + i2;
            }
            y.t("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        y.t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }
}
