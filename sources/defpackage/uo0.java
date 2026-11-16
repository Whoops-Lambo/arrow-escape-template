package defpackage;

import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import coil.memory.MemoryCache$Key;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzagf;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzaxt;
import com.google.android.gms.internal.ads.zzelr;
import com.google.android.gms.internal.ads.zzelt;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzflq;
import com.google.android.gms.internal.ads.zzfmw;
import com.google.android.gms.internal.ads.zzftp;
import com.google.android.gms.internal.ads.zzgbt;
import com.google.android.gms.internal.ads.zzgbu;
import com.google.android.gms.internal.ads.zzhed;
import com.google.android.gms.internal.measurement.zzvm;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class uo0 implements tj1, zzhed, Continuation, v8 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public void b() {
        this.b = 0;
        Iterator it = ((LinkedHashMap) this.c).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                a32 a32Var = (a32) du.c0(arrayList);
                if ((a32Var != null ? (Bitmap) a32Var.b.get() : null) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((a32) arrayList.get(i3)).b.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public void c(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public synchronized void e(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
            Object arrayList = linkedHashMap.get(memoryCache$Key);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(memoryCache$Key, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            a32 a32Var = new a32(iIdentityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList2.add(a32Var);
                    break;
                }
                a32 a32Var2 = (a32) arrayList2.get(i2);
                if (i >= a32Var2.d) {
                    if (a32Var2.a != iIdentityHashCode || a32Var2.b.get() != bitmap) {
                        arrayList2.add(i2, a32Var);
                        break;
                    } else {
                        arrayList2.set(i2, a32Var);
                        break;
                    }
                }
                i2++;
            }
            int i3 = this.b;
            this.b = i3 + 1;
            if (i3 >= 10) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.tj1
    public boolean secureDecodersExplicit() {
        return true;
    }

    public uo0(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.c = new ArrayList();
                this.b = 128;
                break;
            case 5:
                this.c = new ParsableByteArray(8);
                break;
            case 6:
            default:
                this.c = new LinkedHashMap();
                break;
            case 7:
                this.c = new zzey(8);
                break;
        }
    }

    @Override // defpackage.v8
    public /* synthetic */ ListenableFuture call() {
        return ((zzvm) this.c).b(this.b);
    }

    public long d(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = (ParsableByteArray) this.c;
        int i = 0;
        extractorInput.peekFully(parsableByteArray.getData(), 0, 1);
        int i2 = parsableByteArray.getData()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        extractorInput.peekFully(parsableByteArray.getData(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (parsableByteArray.getData()[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public long g(zzagf zzagfVar) {
        int i;
        zzey zzeyVar = (zzey) this.c;
        int i2 = 0;
        zzagfVar.d(zzeyVar.a, 0, 1, false);
        int i3 = zzeyVar.a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        zzagfVar.d(zzeyVar.a, 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (zzeyVar.a[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i6 << 8);
        }
        this.b += i;
        return i6;
    }

    @Override // defpackage.tj1
    public int getCodecCount() {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c).length;
    }

    @Override // defpackage.tj1
    public MediaCodecInfo getCodecInfoAt(int i) {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c)[i];
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public void zza(Throwable th) {
        zzt.zzh().d("BufferingUrlPinger.attributionReportingManager", th);
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public void zzb(Object obj) {
        zzfmw zzfmwVar = (zzfmw) this.c;
        String str = (String) obj;
        int i = this.b;
        zzflq zzflqVar = zzfmwVar.a;
        if (!zzflqVar.i0) {
            zzfmwVar.c.b(str, zzflqVar.x0, zzfmwVar.e, null);
            return;
        }
        zzftp zzftpVar = zzfmwVar.d;
        String str2 = zzfmwVar.b.b;
        zzftpVar.getClass();
        zzelt zzeltVar = new zzelt(i, str2, str, zzt.zzk().currentTimeMillis());
        zzelr zzelrVar = zzftpVar.a;
        zzelrVar.getClass();
        zzelrVar.b(new ca4(zzelrVar, zzeltVar, false, 5));
    }

    @Override // defpackage.tj1
    public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public void f(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        c(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    @Override // defpackage.tj1
    public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful()) {
            int i = this.b;
            zzaxp zzaxpVar = (zzaxp) this.c;
            zzgbu zzgbuVar = (zzgbu) task.getResult();
            byte[] bArrH = ((zzaxt) zzaxpVar.m()).h();
            zzgbuVar.getClass();
            zzgbt zzgbtVar = new zzgbt(zzgbuVar, bArrH);
            zzgbtVar.c = i;
            zzgbtVar.a();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public /* synthetic */ uo0(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ uo0(int i, int i2, Object obj) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    public uo0(int i, m12[] m12VarArr) {
        this.a = 6;
        this.b = i;
        this.c = m12VarArr;
    }

    public uo0(boolean z, boolean z2) {
        this.a = 2;
        this.b = (z || z2) ? 1 : 0;
    }
}
