package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.ironsource.C4664b4;
import com.singular.sdk.internal.Constants;
import defpackage.ak;
import defpackage.ar4;
import defpackage.bq4;
import defpackage.e6;
import defpackage.js4;
import defpackage.kb3;
import defpackage.pv1;
import defpackage.q63;
import defpackage.rl3;
import defpackage.s65;
import defpackage.s95;
import defpackage.sl3;
import defpackage.wx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzqp {
    public static final w e;
    public static final zzqp f;
    public static final w g;
    public static final js4 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final zzgzb c;
    public final zzgzb d;

    static {
        w wVarX = zzgzb.x(12);
        e = wVarX;
        f = new zzqp(zzgzb.x(s65.d), wVarX, w.e);
        Object[] objArr = {2, 5, 6};
        zzhau.a(3, objArr);
        g = zzgzb.D(3, objArr);
        zzgzd zzgzdVar = new zzgzd();
        zzgzdVar.a(5, 6);
        zzgzdVar.a(17, 6);
        zzgzdVar.a(7, 6);
        zzgzdVar.a(30, 10);
        zzgzdVar.a(18, 6);
        zzgzdVar.a(6, 8);
        zzgzdVar.a(8, 8);
        zzgzdVar.a(14, 8);
        h = zzgzdVar.d(true);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01c3 A[PHI: r2 r20
  0x01c3: PHI (r2v6 com.google.android.gms.internal.ads.zzgzb) = 
  (r2v5 com.google.android.gms.internal.ads.zzgzb)
  (r2v7 com.google.android.gms.internal.ads.zzgzb)
  (r2v9 com.google.android.gms.internal.ads.zzgzb)
 binds: [B:140:0x01f0, B:128:0x01d0, B:123:0x01c0] A[DONT_GENERATE, DONT_INLINE]
  0x01c3: PHI (r20v4 int) = (r20v3 int), (r20v6 int), (r20v8 int) binds: [B:140:0x01f0, B:128:0x01d0, B:123:0x01c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:220:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:222:0x03dd  */
    public static zzqp a(Context context, Intent intent, zzd zzdVar, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioDeviceInfo audioDeviceInfo2;
        int i;
        int i2;
        int i3;
        zzgzb zzgzbVarX;
        AudioDeviceInfo[] devices;
        int i4;
        int i5;
        int type;
        zzgzb zzgzbVarA;
        int i6;
        int i7;
        int speakerLayoutChannelMask;
        int i8 = 2;
        AudioManager audioManagerA = zzcj.a(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo2 = null;
            if (Build.VERSION.SDK_INT >= 33) {
                List audioDevicesForAttributes = audioManagerA.getAudioDevicesForAttributes(zzdVar.a());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo2 = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                }
            }
        } else {
            audioDeviceInfo2 = audioDeviceInfo;
        }
        int i9 = 3;
        if (audioDeviceInfo2 != null) {
            zzgzbVarX = s95.a;
            if (wx.u(audioDeviceInfo2.getType())) {
                i = 2;
                i2 = 0;
                i3 = 21;
            } else {
                i3 = 21;
                if (audioDeviceInfo2.getType() != 1) {
                    if (audioDeviceInfo2.getType() == 2) {
                        i2 = 0;
                        if (Build.VERSION.SDK_INT < 36 || (speakerLayoutChannelMask = audioDeviceInfo2.getSpeakerLayoutChannelMask()) == 0 || speakerLayoutChannelMask == 1) {
                            zzeh.c("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                        } else {
                            zzgzbVarX = zzgzb.x(Integer.valueOf(speakerLayoutChannelMask));
                        }
                    } else {
                        i2 = 0;
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31 && audioDeviceInfo2.getType() == 10) {
                            zzgzb zzgzbVarA2 = s95.a(audioDeviceInfo2);
                            if (zzgzbVarA2.isEmpty()) {
                                zzgzbVarA2 = ak.z(audioDeviceInfo2.getAudioDescriptors());
                                if (!zzgzbVarA2.isEmpty()) {
                                }
                            }
                            i = 2;
                            zzgzbVarX = zzgzbVarA2;
                        } else if (i10 >= 31) {
                            int type2 = audioDeviceInfo2.getType();
                            if (i10 < 31 || type2 != 29) {
                                i = 2;
                                if (i10 >= 31 && ((type = audioDeviceInfo2.getType()) == 11 || type == 12 || (i10 >= 31 && type == 22))) {
                                    zzgzbVarA = s95.a(audioDeviceInfo2);
                                    if (!zzgzbVarA.isEmpty()) {
                                        zzgzbVarX = zzgzbVarA;
                                    }
                                }
                            } else {
                                zzgzb zzgzbVarA3 = s95.a(audioDeviceInfo2);
                                if (zzgzbVarA3.isEmpty()) {
                                    List audioDescriptors = audioDeviceInfo2.getAudioDescriptors();
                                    if (i10 >= 34) {
                                        if (i10 < 34 || audioDescriptors == null) {
                                            i = 2;
                                            zzgzbVarA = w.e;
                                        } else {
                                            ArrayList arrayList = new ArrayList();
                                            Iterator it = audioDescriptors.iterator();
                                            while (it.hasNext()) {
                                                AudioDescriptor audioDescriptorF = kb3.f(it.next());
                                                if (audioDescriptorF.getStandard() == i8) {
                                                    byte[] descriptor = audioDescriptorF.getDescriptor();
                                                    int length = descriptor.length;
                                                    if (length != i9) {
                                                        i6 = i8;
                                                        rl3.q(new StringBuilder(String.valueOf(length).length() + 21), "Invalid SADB length: ", length, "AudioDescriptorUtil");
                                                    } else {
                                                        i6 = i8;
                                                        if (Build.VERSION.SDK_INT >= 34) {
                                                            byte b = descriptor[0];
                                                            int i11 = 1 != (b & 1) ? 0 : 12;
                                                            if ((b & 2) != 0) {
                                                                i11 |= 32;
                                                            }
                                                            if ((b & 4) != 0) {
                                                                i11 |= 16;
                                                            }
                                                            if ((b & 8) != 0) {
                                                                i11 |= 192;
                                                            }
                                                            if ((b & 16) != 0) {
                                                                i11 |= 1024;
                                                            }
                                                            if ((b & 32) != 0) {
                                                                i11 |= 768;
                                                            }
                                                            if ((b & 128) != 0) {
                                                                i11 |= 201326592;
                                                            }
                                                            byte b2 = descriptor[1];
                                                            if ((b2 & 1) != 0) {
                                                                i11 |= 81920;
                                                            }
                                                            if ((b2 & 2) != 0) {
                                                                i11 |= 8192;
                                                            }
                                                            if ((b2 & 4) != 0) {
                                                                i11 |= 32768;
                                                            }
                                                            if ((b2 & 8) != 0) {
                                                                i11 |= 6144;
                                                            }
                                                            if ((b2 & 16) != 0) {
                                                                i11 |= 33554432;
                                                            }
                                                            if ((b2 & 32) != 0) {
                                                                i11 |= Constants.REFERRER_LINK_MAX_RESPONSE_CHARS;
                                                            }
                                                            if ((b2 & 64) != 0) {
                                                                i11 |= 6144;
                                                            }
                                                            if ((b2 & 128) != 0) {
                                                                i11 |= 3145728;
                                                            }
                                                            byte b3 = descriptor[i6];
                                                            if ((b3 & 1) != 0) {
                                                                i11 |= 655360;
                                                            }
                                                            if ((b3 & 2) != 0) {
                                                                i11 |= 8388608;
                                                            }
                                                            i7 = (b3 & 4) != 0 ? 20971520 | i11 : i11;
                                                        } else {
                                                            i7 = 0;
                                                        }
                                                        arrayList.add(Integer.valueOf(i7));
                                                    }
                                                    i8 = i6;
                                                    i9 = 3;
                                                }
                                            }
                                            i = i8;
                                            arrayList.sort(sl3.j);
                                            zzgzbVarA = zzgzb.B(arrayList);
                                        }
                                        if (!zzgzbVarA.isEmpty()) {
                                            zzgzbVarX = zzgzbVarA;
                                        }
                                    } else {
                                        i = 2;
                                    }
                                    zzgzbVarA = ak.z(audioDescriptors);
                                    if (!zzgzbVarA.isEmpty()) {
                                        zzgzbVarX = zzgzbVarA;
                                    }
                                } else {
                                    i = 2;
                                    zzgzbVarX = zzgzbVarA3;
                                }
                            }
                        } else {
                            i = 2;
                            if (i10 >= 31) {
                                zzgzbVarA = s95.a(audioDeviceInfo2);
                                if (!zzgzbVarA.isEmpty()) {
                                    zzgzbVarX = zzgzbVarA;
                                }
                            }
                        }
                    }
                    i = 2;
                } else {
                    i = 2;
                    i2 = 0;
                    zzgzbVarX = zzgzb.x(4);
                }
            }
        } else {
            i = 2;
            i2 = 0;
            i3 = 21;
            zzgzbVarX = e;
        }
        zzgzb zzgzbVar = zzgzbVarX;
        int i12 = Build.VERSION.SDK_INT;
        js4 js4Var = h;
        if (i12 >= 33 && (zzfq.j(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            List directProfilesForAttributes = audioManagerA.getDirectProfilesForAttributes(zzdVar.a());
            HashMap map = new HashMap();
            map.put(2, new HashSet(zzhcr.e(12)));
            for (int i13 = i2; i13 < directProfilesForAttributes.size(); i13++) {
                AudioProfile audioProfileG = e6.g(directProfilesForAttributes.get(i13));
                if (audioProfileG.getEncapsulationType() != 1) {
                    int format = audioProfileG.getFormat();
                    if (zzfq.d(format) || js4Var.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(zzhcr.e(audioProfileG.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(zzhcr.e(audioProfileG.getChannelMasks())));
                        }
                    }
                }
            }
            ar4 ar4Var = zzgzb.b;
            zzgyy zzgyyVar = new zzgyy();
            for (Map.Entry entry : map.entrySet()) {
                zzgyyVar.c(new s65(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzqp(zzgyyVar.f(), zzgzbVar, list);
        }
        if (audioDeviceInfo2 == null) {
            devices = audioManagerA.getDevices(i);
        } else {
            devices = new AudioDeviceInfo[1];
            devices[i2] = audioDeviceInfo2;
        }
        int length2 = devices.length;
        for (int i14 = i2; i14 < length2; i14++) {
            if (wx.u(devices[i14].getType())) {
                return new zzqp(zzgzb.x(s65.d), zzgzbVar, list);
            }
        }
        zzgzk zzgzkVar = new zzgzk();
        zzgzkVar.f(2);
        if (Build.VERSION.SDK_INT < 29 || !(zzfq.j(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            ContentResolver contentResolver = context.getContentResolver();
            boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", i2) == 1;
            if (z) {
                i4 = 0;
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    zzgzkVar.g(g);
                }
            } else {
                String str = Build.MANUFACTURER;
                if (str.equals("Amazon") || str.equals("Xiaomi")) {
                    i4 = 0;
                    if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                        zzgzkVar.g(g);
                    }
                } else {
                    i4 = 0;
                }
            }
            if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", i4) != 1) {
                return new zzqp(c(10, zzhcr.d(zzgzkVar.h())), zzgzbVar, list);
            }
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                zzgzkVar.g(zzhcr.e(intArrayExtra));
            }
            return new zzqp(c(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), zzhcr.d(zzgzkVar.h())), zzgzbVar, list);
        }
        ar4 ar4Var2 = zzgzb.b;
        zzgyy zzgyyVar2 = new zzgyy();
        zzhbp it2 = js4Var.keySet().iterator();
        while (true) {
            bq4 bq4Var = (bq4) it2;
            if (!bq4Var.hasNext()) {
                zzgyyVar2.c(2);
                zzgzkVar.g(zzgyyVar2.f());
                return new zzqp(c(10, zzhcr.d(zzgzkVar.h())), zzgzbVar, list);
            }
            Integer num = (Integer) bq4Var.next();
            int iIntValue = num.intValue();
            switch (iIntValue) {
                case 2:
                case 3:
                    i5 = 3;
                    break;
                case 4:
                case 5:
                case 6:
                    i5 = i3;
                    break;
                case 7:
                case 8:
                    i5 = 23;
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                    i5 = 28;
                    break;
                case 13:
                case 19:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                default:
                    i5 = Integer.MAX_VALUE;
                    break;
                case 14:
                    i5 = 25;
                    break;
                case 20:
                    i5 = 30;
                    break;
                case 21:
                case 22:
                    i5 = 31;
                    break;
                case 30:
                case 31:
                    i5 = 34;
                    break;
            }
            if (Build.VERSION.SDK_INT >= i5 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zzdVar.a())) {
                zzgyyVar2.c(num);
            }
        }
    }

    public static w c(int i, int[] iArr) {
        ar4 ar4Var = zzgzb.b;
        zzgyy zzgyyVar = new zzgyy();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            zzgyyVar.c(new s65(i2, i));
        }
        return zzgyyVar.f();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041 A[PHI: r4
  0x0041: PHI (r4v3 int) = (r4v2 int), (r4v6 int) binds: [B:11:0x0035, B:14:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:74:0x0100  */
    public final Pair b(zzv zzvVar, zzd zzdVar) {
        String str = zzvVar.o;
        int iE = zzvVar.I;
        int i = zzvVar.H;
        str.getClass();
        int iG = zzas.g(str, zzvVar.k);
        Integer numValueOf = Integer.valueOf(iG);
        js4 js4Var = h;
        if (!js4Var.containsKey(numValueOf)) {
            return null;
        }
        int i2 = 6;
        SparseArray sparseArray = this.a;
        if (iG != 18) {
            if (iG != 8) {
                if (iG == 30 && sparseArray.indexOfKey(30) < 0) {
                    iG = 7;
                }
            } else if (sparseArray.indexOfKey(8) >= 0) {
                iG = 8;
                if (iG == 30) {
                    iG = 7;
                }
            } else {
                iG = 7;
            }
        } else if (sparseArray.indexOfKey(18) >= 0) {
            iG = 18;
            if (iG != 8) {
                if (iG == 30) {
                    iG = 7;
                }
            } else if (sparseArray.indexOfKey(8) >= 0) {
                iG = 8;
                if (iG == 30) {
                    iG = 7;
                }
            } else {
                iG = 7;
            }
        } else {
            iG = 6;
        }
        if (sparseArray.indexOfKey(iG) < 0) {
            return null;
        }
        s65 s65Var = (s65) sparseArray.get(iG);
        s65Var.getClass();
        int iIntValue = s65Var.b;
        zzgzl zzgzlVar = s65Var.c;
        boolean zContains = false;
        if (i == -1 || iG == 18) {
            int i3 = zzvVar.J;
            if (i3 == -1) {
                i3 = 48000;
            }
            if (zzgzlVar == null) {
                int i4 = Build.VERSION.SDK_INT;
                int i5 = s65Var.a;
                if (i4 >= 29) {
                    iIntValue = 10;
                    while (true) {
                        if (iIntValue <= 0) {
                            iIntValue = 0;
                            break;
                        }
                        int iE2 = zzfq.e(iIntValue);
                        if (iE2 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i5).setSampleRate(i3).setChannelMask(iE2).build(), zzdVar.a())) {
                            break;
                        }
                        iIntValue--;
                    }
                } else {
                    Object obj = js4Var.get(Integer.valueOf(i5));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
        } else {
            if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                if (zzgzlVar != null) {
                    int iE3 = iE != -1 ? iE : zzfq.e(i);
                    if (iE3 != 0) {
                        zContains = zzgzlVar.contains(Integer.valueOf(iE3));
                    }
                } else if (i <= iIntValue) {
                    zContains = true;
                }
                if (!zContains) {
                    return null;
                }
            } else if (i > 10) {
                return null;
            }
            iIntValue = i;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 > 28) {
            i2 = iIntValue;
        } else if (iIntValue == 7) {
            i2 = 8;
        } else if (iIntValue != 3 && iIntValue != 4 && iIntValue != 5) {
            i2 = iIntValue;
        }
        HashSet hashSet = zzal.a;
        if (i6 <= 26 && "fugu".equals(Build.DEVICE) && i2 == 1) {
            i2 = 2;
        }
        if (iE == -1 || i != i2) {
            iE = zzfq.e(i2);
        }
        if (iE != 0) {
            return Pair.create(Integer.valueOf(iG), Integer.valueOf(iE));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqp) {
            zzqp zzqpVar = (zzqp) obj;
            SparseArray sparseArray = zzqpVar.a;
            String str = zzfq.a;
            int i = Build.VERSION.SDK_INT;
            SparseArray sparseArray2 = this.a;
            if (i < 31) {
                int size = sparseArray2.size();
                if (size == sparseArray.size()) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (Objects.equals(sparseArray2.valueAt(i2), sparseArray.get(sparseArray2.keyAt(i2)))) {
                        }
                    }
                    if (this.b != zzqpVar.b) {
                    }
                }
            } else if (sparseArray2.contentEquals(sparseArray)) {
                if (this.b != zzqpVar.b && Objects.equals(this.c, zzqpVar.c) && Objects.equals(this.d, zzqpVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = zzfq.a;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.a;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + pv1.c(this.b, 31, iContentHashCode, 31)) * 31);
    }

    public final String toString() {
        String string = this.a.toString();
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        int i = this.b;
        int length = String.valueOf(i).length();
        int length2 = string.length();
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 28 + strValueOf.length() + 26 + strValueOf2.length() + 1);
        rl3.m(i, "AudioCapabilities[maxChannelCount=", ", audioProfiles=", string, sb);
        q63.y(sb, ", speakerLayoutChannelMasks=", strValueOf, ", spatializerChannelMasks=", strValueOf2);
        sb.append(C4664b4.j.e);
        return sb.toString();
    }

    public zzqp(w wVar, zzgzb zzgzbVar, List list) {
        for (int i = 0; i < wVar.d; i++) {
            s65 s65Var = (s65) wVar.get(i);
            this.a.put(s65Var.a, s65Var);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, ((s65) this.a.valueAt(i2)).b);
        }
        this.b = iMax;
        this.c = zzgzb.B(zzgzbVar);
        this.d = zzgzb.B(list);
    }
}
