package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.media.MediaCodecInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.media3.common.MimeTypes;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.mp4.Sniffer;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.gms.internal.ads.w;
import com.google.android.gms.internal.ads.zzanh;
import com.google.android.gms.internal.ads.zzas;
import com.google.android.gms.internal.ads.zzgyy;
import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzvy;
import com.google.android.gms.internal.ads.zzwj;
import com.google.android.gms.internal.ads.zzwp;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class h00 {
    public static final tx b = new tx("CLOSED", 8);
    public static final int[] c = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Mp4Box.TYPE_avc1, Mp4Box.TYPE_hvc1, Mp4Box.TYPE_hev1, Mp4Box.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};
    public final /* synthetic */ int a = 10;

    public static long[] f(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        fs1.e(length, length == ((long) i), "the total number of elements (%s) in the arrays must fit in an int");
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static long m(long... jArr) {
        fs1.g(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static final int n(int i) {
        int[] iArr = {-1, -16777216, -65536, -16711936, -256, -16776961};
        int i2 = iArr[0];
        double d = -1.0d;
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = iArr[i3];
            double dB = ColorUtils.b(i4, i);
            if (dB > d) {
                i2 = i4;
                d = dB;
            }
        }
        return i2;
    }

    public static int w(boolean z) {
        Iterable iterableA;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.e("video/avc");
            zzv zzvVar = new zzv(zztVar);
            String str = zzvVar.o;
            if (str != null) {
                List listA = zzwp.a(str, z, false);
                String strD = zzwp.d(zzvVar);
                if (strD == null) {
                    ar4 ar4Var = zzgzb.b;
                    iterableA = w.e;
                } else {
                    iterableA = zzwp.a(strD, z, false);
                }
                ar4 ar4Var2 = zzgzb.b;
                zzgyy zzgyyVar = new zzgyy();
                zzgyyVar.d(listA);
                zzgyyVar.d(iterableA);
                w wVarF = zzgyyVar.f();
                for (int i = 0; i < wVarF.d; i++) {
                    if (((zzvy) wVarF.get(i)).d != null && (videoCapabilities = ((zzvy) wVarF.get(i)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        nj1.g();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointF = nj1.f();
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (ti0.d(supportedPerformancePoints.get(i2)).covers(performancePointF)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (zzwj unused) {
        }
        return 0;
    }

    public static final n61 a(String str, KSerializer kSerializer) {
        return new n61(str, new o61(kSerializer));
    }

    public static final void b(View view) {
        view.post(new d3(view, 0));
    }

    public static final Object i(f82 f82Var, long j, zr0 zr0Var) {
        while (true) {
            if (f82Var.c >= j && !f82Var.d()) {
                return f82Var;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tw.a;
            Object obj = atomicReferenceFieldUpdater.get(f82Var);
            tx txVar = b;
            if (obj == txVar) {
                return txVar;
            }
            f82 f82Var2 = (f82) ((tw) obj);
            if (f82Var2 == null) {
                f82Var2 = (f82) zr0Var.invoke(Long.valueOf(f82Var.c + 1), f82Var);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(f82Var, null, f82Var2)) {
                        if (f82Var.d()) {
                            f82Var.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(f82Var) == null);
            }
            f82Var = f82Var2;
        }
    }

    public static final int j(String str) {
        int iW;
        char c2 = File.separatorChar;
        int iW2 = dk2.W(str, c2, 0, 4);
        if (iW2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c2 || (iW = dk2.W(str, c2, 2, 4)) < 0) {
                return 1;
            }
            int iW3 = dk2.W(str, c2, iW + 1, 4);
            return iW3 >= 0 ? iW3 + 1 : str.length();
        }
        if (iW2 > 0 && str.charAt(iW2 - 1) == ':') {
            return iW2 + 1;
        }
        if (iW2 == -1 && dk2.R(str, ':')) {
            return str.length();
        }
        return 0;
    }

    public static int k(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final l92 l(BufferedReader bufferedReader) {
        return new ix(new p8(bufferedReader, 2));
    }

    public static final String q(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static boolean r(ExtractorInput extractorInput, boolean z, boolean z2) throws IOException {
        boolean z3;
        int i;
        long length = extractorInput.getLength();
        long j = -1;
        int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = 4096;
        if (i2 != 0 && length <= 4096) {
            j2 = length;
        }
        int i3 = (int) j2;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        while (true) {
            if (i5 < i3) {
                parsableByteArray.reset(8);
                if (extractorInput.peekFully(parsableByteArray.getData(), i4, 8, true)) {
                    long unsignedInt = parsableByteArray.readUnsignedInt();
                    int i6 = parsableByteArray.readInt();
                    if (unsignedInt == 1) {
                        extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                        parsableByteArray.setLimit(16);
                        i = 16;
                        unsignedInt = parsableByteArray.readLong();
                    } else {
                        if (unsignedInt == 0) {
                            long length2 = extractorInput.getLength();
                            if (length2 != j) {
                                unsignedInt = (length2 - extractorInput.getPeekPosition()) + 8;
                            }
                        }
                        i = 8;
                    }
                    long j3 = i;
                    if (unsignedInt < j3) {
                        return false;
                    }
                    int i7 = i5 + i;
                    if (i6 == 1836019574) {
                        i3 += (int) unsignedInt;
                        if (i2 != 0 && i3 > length) {
                            i3 = (int) length;
                        }
                        i5 = i7;
                    } else {
                        if (i6 == 1836019558 || i6 == 1836475768) {
                            z3 = true;
                            return z4 && z == z3;
                        }
                        int i8 = i2;
                        if ((((long) i7) + unsignedInt) - j3 < i3) {
                            int i9 = (int) (unsignedInt - j3);
                            i5 = i7 + i9;
                            if (i6 == 1718909296) {
                                if (i9 < 8) {
                                    return false;
                                }
                                parsableByteArray.reset(i9);
                                extractorInput.peekFully(parsableByteArray.getData(), 0, i9);
                                int i10 = i9 / 4;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if (i11 != 1) {
                                        int i12 = parsableByteArray.readInt();
                                        if ((i12 >>> 8) != 3368816 && (i12 != 1751476579 || !z2)) {
                                            int i13 = 0;
                                            while (true) {
                                                if (i13 >= 29) {
                                                    continue;
                                                } else if (c[i13] != i12) {
                                                    i13++;
                                                }
                                            }
                                        }
                                        z4 = true;
                                        break;
                                    }
                                    parsableByteArray.skipBytes(4);
                                }
                                if (!z4) {
                                    return false;
                                }
                            } else if (i9 != 0) {
                                extractorInput.advancePeekPosition(i9);
                            }
                            i2 = i8;
                        }
                    }
                    j = -1;
                    i4 = 0;
                }
            }
            z3 = false;
            if (z4) {
                return false;
            }
        }
    }

    public static boolean s(String str) {
        return str == null || str.isEmpty();
    }

    public static void x(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(i).length());
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        switch (this.a) {
            case 10:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 10:
                String simpleName = p32.a(getClass()).getSimpleName();
                simpleName.getClass();
                return simpleName;
            default:
                return super.toString();
        }
    }

    public static final void c(int i, View view) {
        ViewGroup viewGroup;
        Drawable background;
        int color;
        ViewParent parent = view.getParent();
        ColorDrawable colorDrawable = null;
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            background = viewGroup.getBackground();
        } else {
            background = null;
        }
        if (background instanceof ColorDrawable) {
            colorDrawable = (ColorDrawable) background;
        }
        if (colorDrawable != null) {
            color = colorDrawable.getColor();
        } else {
            color = -1;
        }
        int iN = n(color);
        Context context = view.getContext();
        context.getClass();
        int iK = (int) ek2.k(context, i);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {R.attr.state_focused};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iK);
        gradientDrawable.setColor(0);
        Context context2 = view.getContext();
        context2.getClass();
        gradientDrawable.setStroke((int) ek2.k(context2, 4.0f), iN);
        stateListDrawable.addState(iArr, gradientDrawable);
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        view.setBackground(stateListDrawable);
    }

    public static void d(View view) {
        ViewGroup viewGroup;
        Drawable background;
        int color;
        view.getClass();
        ViewParent parent = view.getParent();
        ColorDrawable colorDrawable = null;
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            background = viewGroup.getBackground();
        } else {
            background = null;
        }
        if (background instanceof ColorDrawable) {
            colorDrawable = (ColorDrawable) background;
        }
        if (colorDrawable != null) {
            color = colorDrawable.getColor();
        } else {
            color = -1;
        }
        int iN = n(color);
        Context context = view.getContext();
        context.getClass();
        int iK = (int) ek2.k(context, 4.0f);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {R.attr.state_focused};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iK);
        gradientDrawable.setColor(0);
        Context context2 = view.getContext();
        context2.getClass();
        gradientDrawable.setStroke((int) ek2.k(context2, 4.0f), iN);
        stateListDrawable.addState(iArr, gradientDrawable);
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        view.setForeground(stateListDrawable);
    }

    public static final SerialDescriptor e(SerialDescriptor serialDescriptor, ja2 ja2Var) {
        SerialDescriptor serialDescriptorE;
        KSerializer kSerializerA;
        serialDescriptor.getClass();
        ja2Var.getClass();
        if (s71.b(serialDescriptor.getKind(), x92.d)) {
            KClass kClassQ = at.q(serialDescriptor);
            SerialDescriptor descriptor = null;
            if (kClassQ != null && (kSerializerA = ja2Var.a(kClassQ, gg0.a)) != null) {
                descriptor = kSerializerA.getDescriptor();
            }
            if (descriptor != null && (serialDescriptorE = e(descriptor, ja2Var)) != null) {
                return serialDescriptorE;
            }
            return serialDescriptor;
        }
        if (serialDescriptor.isInline()) {
            return e(serialDescriptor.d(0), ja2Var);
        }
        return serialDescriptor;
    }

    public static final long g(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j += (long) i;
            i = inputStream.read(bArr);
        }
        return j;
    }

    public static final void h(View view) {
        view.setMinimumWidth(view.getResources().getDimensionPixelOffset(com.ecffri.arrows.R.dimen.ucFirstLayerLegalLinksOrButtonsMinimumWidth));
        view.setMinimumHeight(view.getResources().getDimensionPixelOffset(com.ecffri.arrows.R.dimen.ucFirstLayerLegalLinksOrButtonsMinimumHeight));
        view.setFocusable(true);
        view.post(new d3(view, 1));
        ViewCompat.z(view, new e3(1));
    }

    public static sy o(sy syVar, sy syVar2) {
        syVar2.getClass();
        if (syVar2 == cg0.a) {
            return syVar;
        }
        return (sy) syVar2.fold(syVar, new q8(4));
    }

    public static final byte[] p(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        g(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final v83 t(r91 r91Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        h00 kind = serialDescriptor.getKind();
        if (kind instanceof rv1) {
            return v83.POLY_OBJ;
        }
        boolean zB = s71.b(kind, nk2.e);
        v83 v83Var = v83.LIST;
        if (zB) {
            return v83Var;
        }
        if (s71.b(kind, nk2.f)) {
            SerialDescriptor serialDescriptorE = e(serialDescriptor.d(0), r91Var.b);
            h00 kind2 = serialDescriptorE.getKind();
            if (!(kind2 instanceof ty1) && !s71.b(kind2, y92.d)) {
                if (r91Var.a.d) {
                    return v83Var;
                }
                throw os2.b(serialDescriptorE);
            }
            return v83.MAP;
        }
        return v83.OBJ;
    }

    public static final rm0 u(File file) {
        List list;
        String path = file.getPath();
        path.getClass();
        int iJ = j(path);
        String strSubstring = path.substring(0, iJ);
        String strSubstring2 = path.substring(iJ);
        if (strSubstring2.length() == 0) {
            list = gg0.a;
        } else {
            List listM0 = dk2.m0(strSubstring2, new char[]{File.separatorChar}, 6);
            ArrayList arrayList = new ArrayList(eu.f(listM0, 10));
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new rm0(new File(strSubstring), list);
    }

    public static String v(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        String str = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = ((zzanh) obj).a.g.o;
            if (zzas.b(str2)) {
                return "video/mp4";
            }
            if (zzas.a(str2)) {
                z = true;
            } else if (zzas.c(str2)) {
                if (Objects.equals(str2, MimeTypes.IMAGE_HEIC)) {
                    str = MimeTypes.IMAGE_HEIF;
                } else if (Objects.equals(str2, MimeTypes.IMAGE_AVIF)) {
                    str = MimeTypes.IMAGE_AVIF;
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        if (str != null) {
            return str;
        }
        return "application/mp4";
    }
}
