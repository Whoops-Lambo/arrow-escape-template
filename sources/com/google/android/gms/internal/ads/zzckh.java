package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import defpackage.d34;
import defpackage.jc1;
import defpackage.tx;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzckh extends zzcke {
    public static final Set f = Collections.synchronizedSet(new HashSet());
    public static final DecimalFormat g = new DecimalFormat("#,###");
    public File d;
    public boolean e;

    @Override // com.google.android.gms.internal.ads.zzcke
    public final void o() {
        this.e = true;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:182:0x04db  */
    /* JADX WARN: Code duplicated, block: B:183:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:186:0x0516  */
    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.google.android.gms.internal.ads.zzcke, com.google.android.gms.internal.ads.zzckh] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.zzcke
    public final boolean f(String str) {
        int i;
        Object obj;
        Object obj2;
        String str2;
        Object obj3;
        String str3;
        String str4;
        String string;
        FileOutputStream fileOutputStream;
        ?? r11;
        ?? r5;
        ?? r3;
        Object obj4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i2;
        String str11;
        ?? r4;
        boolean zDelete;
        String str12 = str;
        String str13 = " at ";
        if (this.d == null) {
            p(str12, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            File file = this.d;
            if (file == null) {
                i = 0;
            } else {
                File[] fileArrListFiles = file.listFiles();
                int length = fileArrListFiles.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i3;
                    int i6 = length;
                    if (!fileArrListFiles[i3].getName().endsWith(".done")) {
                        i4++;
                    }
                    i3 = i5 + 1;
                    length = i6;
                }
                i = i4;
            }
            String str14 = str13;
            if (i > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.y)).intValue()) {
                File file2 = this.d;
                if (file2 == null) {
                    zDelete = false;
                } else {
                    File[] fileArrListFiles2 = file2.listFiles();
                    int length2 = fileArrListFiles2.length;
                    int i7 = 0;
                    long j = Long.MAX_VALUE;
                    File file3 = null;
                    while (i7 < length2) {
                        File file4 = fileArrListFiles2[i7];
                        int i8 = length2;
                        int i9 = i7;
                        if (!file4.getName().endsWith(".done")) {
                            long jLastModified = file4.lastModified();
                            if (jLastModified < j) {
                                j = jLastModified;
                                file3 = file4;
                            }
                        }
                        i7 = i9 + 1;
                        length2 = i8;
                    }
                    if (file3 != null) {
                        zDelete = file3.delete();
                        File fileR = r(file3);
                        if (fileR.isFile()) {
                            zDelete = fileR.delete() & zDelete;
                        }
                    } else {
                        zDelete = false;
                    }
                }
                if (!zDelete) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Unable to expire stream cache");
                    p(str12, null, "expireFailed", null);
                    return false;
                }
                str13 = str14;
            } else {
                String strZzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str12);
                File file5 = this.d;
                int i11 = zzgch.a;
                File file6 = new File(new File(file5, strZzg).getPath());
                File fileR2 = r(file6);
                if (file6.isFile() && fileR2.isFile()) {
                    int length3 = (int) file6.length();
                    String strValueOf = String.valueOf(str12);
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzd("Stream cache hit at ".concat(strValueOf));
                    com.google.android.gms.ads.internal.util.client.zzf.zza.post(new io.p071bidmachine.ads.networks.gam.i((zzcke) this, str12, file6.getAbsolutePath(), length3));
                    return true;
                }
                String strValueOf2 = String.valueOf(this.d.getAbsolutePath());
                String strValueOf3 = String.valueOf(str12);
                Set set = f;
                String strConcat = strValueOf2.concat(strValueOf3);
                synchronized (set) {
                    try {
                        if (set.contains(strConcat)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str12).length() + 36);
                            sb.append("Stream cache already in progress at ");
                            sb.append(str12);
                            String string2 = sb.toString();
                            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzi(string2);
                            p(str12, file6.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(strConcat);
                        try {
                            Object obj5 = "error";
                            try {
                                HttpURLConnection httpURLConnectionB = new zzgda().b(new tx(str12, 16));
                                int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionB);
                                if (iHttpUrlConnectionGetResponseCode >= 400) {
                                    String str15 = strConcat;
                                    String str16 = str12;
                                    try {
                                        String string3 = Integer.toString(iHttpUrlConnectionGetResponseCode);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(string3).length() + 27);
                                        sb2.append("HTTP request failed. Code: ");
                                        sb2.append(string3);
                                        string = sb2.toString();
                                        try {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(iHttpUrlConnectionGetResponseCode).length() + 21 + String.valueOf(str16).length());
                                            sb3.append("HTTP status code ");
                                            sb3.append(iHttpUrlConnectionGetResponseCode);
                                            sb3.append(str14);
                                            sb3.append(str16);
                                            throw new IOException(sb3.toString());
                                        } catch (IOException | RuntimeException e) {
                                            e = e;
                                            obj4 = "badUrl";
                                            str6 = str16;
                                            str5 = str15;
                                            fileOutputStream = null;
                                            r3 = str6;
                                            r5 = str5;
                                            r11 = obj4;
                                            if (e instanceof RuntimeException) {
                                                com.google.android.gms.ads.internal.zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                            }
                                            fileOutputStream.close();
                                            if (this.e) {
                                                String strO = jc1.o("Preload aborted for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 26), "\"");
                                                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                                                zzo.zzh(strO);
                                            } else {
                                                String strO2 = jc1.o("Preload failed for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 25), "\"");
                                                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                                                zzo.zzj(strO2, e);
                                            }
                                            if (file6.exists()) {
                                                zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file6.getAbsolutePath())));
                                            }
                                            p(r3, file6.getAbsolutePath(), r11, string);
                                            f.remove(r5);
                                            return false;
                                        }
                                    } catch (IOException | RuntimeException e2) {
                                        e = e2;
                                        obj3 = "badUrl";
                                        str4 = str16;
                                        str3 = str15;
                                        string = null;
                                        str6 = str4;
                                        str5 = str3;
                                        obj4 = obj3;
                                        fileOutputStream = null;
                                        r3 = str6;
                                        r5 = str5;
                                        r11 = obj4;
                                        if (e instanceof RuntimeException) {
                                            com.google.android.gms.ads.internal.zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                        }
                                        fileOutputStream.close();
                                        if (this.e) {
                                            String strO3 = jc1.o("Preload aborted for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 26), "\"");
                                            int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                                            zzo.zzh(strO3);
                                        } else {
                                            String strO4 = jc1.o("Preload failed for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 25), "\"");
                                            int i17 = com.google.android.gms.ads.internal.util.zze.zza;
                                            zzo.zzj(strO4, e);
                                        }
                                        if (file6.exists()) {
                                            zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file6.getAbsolutePath())));
                                        }
                                        p(r3, file6.getAbsolutePath(), r11, string);
                                        f.remove(r5);
                                        return false;
                                    }
                                }
                                try {
                                    int contentLength = httpURLConnectionB.getContentLength();
                                    if (contentLength < 0) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str12).length() + 55);
                                        sb4.append("Stream cache aborted, missing content-length header at ");
                                        sb4.append(str12);
                                        String string4 = sb4.toString();
                                        int i18 = com.google.android.gms.ads.internal.util.zze.zza;
                                        zzo.zzi(string4);
                                        p(str12, file6.getAbsolutePath(), "contentLengthMissing", null);
                                        set.remove(strConcat);
                                        return false;
                                    }
                                    DecimalFormat decimalFormat = g;
                                    String str17 = decimalFormat.format(contentLength);
                                    int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.z)).intValue();
                                    if (contentLength > iIntValue) {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(str17).length() + 33 + String.valueOf(str12).length());
                                        sb5.append("Content length ");
                                        sb5.append(str17);
                                        sb5.append(" exceeds limit at ");
                                        sb5.append(str12);
                                        String string5 = sb5.toString();
                                        int i19 = com.google.android.gms.ads.internal.util.zze.zza;
                                        zzo.zzi(string5);
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(str17).length() + 40);
                                        sb6.append("File too big for full file cache. Size: ");
                                        sb6.append(str17);
                                        p(str12, file6.getAbsolutePath(), "sizeExceeded", sb6.toString());
                                        set.remove(strConcat);
                                        return false;
                                    }
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(str17).length() + 20 + String.valueOf(str12).length());
                                    sb7.append("Caching ");
                                    sb7.append(str17);
                                    sb7.append(" bytes from ");
                                    sb7.append(str12);
                                    String string6 = sb7.toString();
                                    int i20 = com.google.android.gms.ads.internal.util.zze.zza;
                                    zzo.zzd(string6);
                                    ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnectionB));
                                    FileOutputStream fileOutputStreamFileOutputStreamCtor = AdMobFilesBridge.fileOutputStreamCtor(file6);
                                    try {
                                        FileChannel channel = fileOutputStreamFileOutputStreamCtor.getChannel();
                                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                        Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
                                        long jCurrentTimeMillis = clockZzk.currentTimeMillis();
                                        String str18 = "File too big for full file cache. Size: ";
                                        String str19 = strConcat;
                                        try {
                                            com.google.android.gms.ads.internal.util.zzbu zzbuVar = new com.google.android.gms.ads.internal.util.zzbu(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.s0)).longValue());
                                            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.r0)).longValue();
                                            ?? r2 = 0;
                                            String str20 = str19;
                                            int i21 = contentLength;
                                            while (true) {
                                                int i22 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                                if (i22 < 0) {
                                                    str10 = str;
                                                    str7 = str20;
                                                    fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                                    fileOutputStream.close();
                                                    if (zzo.zzm(3)) {
                                                        String str21 = decimalFormat.format((long) r2);
                                                        StringBuilder sb8 = new StringBuilder(String.valueOf(str21).length() + 22 + String.valueOf(str10).length());
                                                        sb8.append("Preloaded ");
                                                        sb8.append(str21);
                                                        sb8.append(" bytes from ");
                                                        sb8.append(str10);
                                                        zzo.zzd(sb8.toString());
                                                    }
                                                    file6.setReadable(true, false);
                                                    if (fileR2.isFile()) {
                                                        fileR2.setLastModified(System.currentTimeMillis());
                                                    } else {
                                                        try {
                                                            fileR2.createNewFile();
                                                        } catch (IOException unused) {
                                                        }
                                                    }
                                                    com.google.android.gms.ads.internal.util.client.zzf.zza.post(new io.p071bidmachine.ads.networks.gam.i((zzcke) this, str10, file6.getAbsolutePath(), (int) r2));
                                                    f.remove(str7);
                                                    return true;
                                                }
                                                ?? r6 = r2 + i22;
                                                try {
                                                    try {
                                                        if (r6 > iIntValue) {
                                                            String str22 = str18;
                                                            String string7 = Integer.toString(r6);
                                                            StringBuilder sb9 = new StringBuilder(String.valueOf(string7).length() + 40);
                                                            sb9.append(str22);
                                                            sb9.append(string7);
                                                            sb9.toString();
                                                            throw new IOException("stream cache file size limit exceeded");
                                                        }
                                                        byteBufferAllocate.flip();
                                                        str19 = str20;
                                                        int i23 = i21;
                                                        while (channel.write(byteBufferAllocate) > 0) {
                                                            i23 = i23 == true ? 1 : 0;
                                                            str19 = str19;
                                                            str18 = str18;
                                                            iIntValue = iIntValue;
                                                            fileOutputStreamFileOutputStreamCtor = fileOutputStreamFileOutputStreamCtor;
                                                        }
                                                        byteBufferAllocate.clear();
                                                        if (clockZzk.currentTimeMillis() - jCurrentTimeMillis > 1000 * jLongValue) {
                                                            String string8 = Long.toString(jLongValue);
                                                            StringBuilder sb10 = new StringBuilder(String.valueOf(string8).length() + 29);
                                                            sb10.append("Timeout exceeded. Limit: ");
                                                            sb10.append(string8);
                                                            sb10.append(" sec");
                                                            sb10.toString();
                                                            throw new IOException("stream cache time limit exceeded");
                                                        }
                                                        if (this.e) {
                                                            throw new IOException("abort requested");
                                                        }
                                                        if (zzbuVar.zza()) {
                                                            String absolutePath = file6.getAbsolutePath();
                                                            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
                                                            int i24 = i23;
                                                            str7 = str19;
                                                            i2 = i24 == true ? 1 : 0;
                                                            str11 = str18;
                                                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                                            r4 = r6;
                                                            str12 = str;
                                                            try {
                                                                d34 d34Var = new d34(this, str12, absolutePath, r4 == true ? 1 : 0, i2 == true ? 1 : 0);
                                                                str10 = str12;
                                                                try {
                                                                    try {
                                                                        handler.post(d34Var);
                                                                    } catch (RuntimeException e3) {
                                                                        e = e3;
                                                                        str8 = str10;
                                                                        str9 = str7;
                                                                    }
                                                                } catch (IOException e4) {
                                                                    e = e4;
                                                                    str8 = str10;
                                                                    str9 = str7;
                                                                }
                                                            } catch (IOException e5) {
                                                                e = e5;
                                                                str8 = str12;
                                                                str9 = str7;
                                                                r5 = str9;
                                                                r11 = obj5;
                                                                fileOutputStream = fileOutputStream;
                                                                string = null;
                                                                r3 = str8;
                                                                if (e instanceof RuntimeException) {
                                                                    com.google.android.gms.ads.internal.zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                                                }
                                                                fileOutputStream.close();
                                                                if (this.e) {
                                                                    String strO5 = jc1.o("Preload aborted for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 26), "\"");
                                                                    int i110 = com.google.android.gms.ads.internal.util.zze.zza;
                                                                    zzo.zzh(strO5);
                                                                } else {
                                                                    String strO6 = jc1.o("Preload failed for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 25), "\"");
                                                                    int i111 = com.google.android.gms.ads.internal.util.zze.zza;
                                                                    zzo.zzj(strO6, e);
                                                                }
                                                                if (file6.exists()) {
                                                                    zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file6.getAbsolutePath())));
                                                                }
                                                                p(r3, file6.getAbsolutePath(), r11, string);
                                                                f.remove(r5);
                                                                return false;
                                                            } catch (RuntimeException e6) {
                                                                e = e6;
                                                                str8 = str12;
                                                                str9 = str7;
                                                                r5 = str9;
                                                                r11 = obj5;
                                                                fileOutputStream = fileOutputStream;
                                                                string = null;
                                                                r3 = str8;
                                                                if (e instanceof RuntimeException) {
                                                                    com.google.android.gms.ads.internal.zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                                                }
                                                                fileOutputStream.close();
                                                                if (this.e) {
                                                                    String strO7 = jc1.o("Preload aborted for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 26), "\"");
                                                                    int i112 = com.google.android.gms.ads.internal.util.zze.zza;
                                                                    zzo.zzh(strO7);
                                                                } else {
                                                                    String strO8 = jc1.o("Preload failed for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 25), "\"");
                                                                    int i113 = com.google.android.gms.ads.internal.util.zze.zza;
                                                                    zzo.zzj(strO8, e);
                                                                }
                                                                if (file6.exists()) {
                                                                    zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file6.getAbsolutePath())));
                                                                }
                                                                p(r3, file6.getAbsolutePath(), r11, string);
                                                                f.remove(r5);
                                                                return false;
                                                            }
                                                        } else {
                                                            int i25 = i23;
                                                            str7 = str19;
                                                            i2 = i25 == true ? 1 : 0;
                                                            str11 = str18;
                                                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                                            r4 = r6;
                                                        }
                                                        String str23 = str7;
                                                        i21 = i2;
                                                        str20 = str23;
                                                        str18 = str11;
                                                        iIntValue = iIntValue;
                                                        r2 = r4;
                                                        byteBufferAllocate = byteBufferAllocate;
                                                        readableByteChannelNewChannel = readableByteChannelNewChannel;
                                                        zzbuVar = zzbuVar;
                                                        fileOutputStreamFileOutputStreamCtor = fileOutputStream;
                                                    } catch (IOException | RuntimeException e7) {
                                                        e = e7;
                                                        string = " sec";
                                                        r11 = r6;
                                                        r3 = i22;
                                                        r5 = i21;
                                                        if (e instanceof RuntimeException) {
                                                            com.google.android.gms.ads.internal.zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                                        }
                                                        fileOutputStream.close();
                                                        if (this.e) {
                                                            String strO9 = jc1.o("Preload aborted for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 26), "\"");
                                                            int i114 = com.google.android.gms.ads.internal.util.zze.zza;
                                                            zzo.zzh(strO9);
                                                        } else {
                                                            String strO10 = jc1.o("Preload failed for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 25), "\"");
                                                            int i115 = com.google.android.gms.ads.internal.util.zze.zza;
                                                            zzo.zzj(strO10, e);
                                                        }
                                                        if (file6.exists()) {
                                                            zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file6.getAbsolutePath())));
                                                        }
                                                        p(r3, file6.getAbsolutePath(), r11, string);
                                                        f.remove(r5);
                                                        return false;
                                                    }
                                                } catch (IOException | RuntimeException e8) {
                                                    e = e8;
                                                    string = null;
                                                    r11 = r6;
                                                    r3 = i22;
                                                    r5 = i21;
                                                    if (e instanceof RuntimeException) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                                    }
                                                    fileOutputStream.close();
                                                    if (this.e) {
                                                        String strO11 = jc1.o("Preload aborted for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 26), "\"");
                                                        int i116 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        zzo.zzh(strO11);
                                                    } else {
                                                        String strO12 = jc1.o("Preload failed for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 25), "\"");
                                                        int i117 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        zzo.zzj(strO12, e);
                                                    }
                                                    if (file6.exists()) {
                                                        zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file6.getAbsolutePath())));
                                                    }
                                                    p(r3, file6.getAbsolutePath(), r11, string);
                                                    f.remove(r5);
                                                    return false;
                                                }
                                                r5 = str9;
                                                r11 = obj5;
                                                fileOutputStream = fileOutputStream;
                                                string = null;
                                                r3 = str8;
                                            }
                                        } catch (IOException e9) {
                                            e = e9;
                                            str8 = str;
                                            str9 = str19;
                                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                        } catch (RuntimeException e10) {
                                            e = e10;
                                            str8 = str;
                                            str9 = str19;
                                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                        }
                                    } catch (IOException | RuntimeException e11) {
                                        e = e11;
                                        str7 = strConcat;
                                        fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                    }
                                } catch (IOException | RuntimeException e12) {
                                    e = e12;
                                    str2 = strConcat;
                                    obj2 = obj5;
                                    obj3 = obj2;
                                    str4 = str12;
                                    str3 = str2;
                                    string = null;
                                    str6 = str4;
                                    str5 = str3;
                                    obj4 = obj3;
                                    fileOutputStream = null;
                                    r3 = str6;
                                    r5 = str5;
                                    r11 = obj4;
                                }
                                if (e instanceof RuntimeException) {
                                    com.google.android.gms.ads.internal.zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                }
                                try {
                                    fileOutputStream.close();
                                } catch (IOException | NullPointerException unused2) {
                                }
                                if (this.e) {
                                    String strO13 = jc1.o("Preload aborted for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 26), "\"");
                                    int i118 = com.google.android.gms.ads.internal.util.zze.zza;
                                    zzo.zzh(strO13);
                                } else {
                                    String strO14 = jc1.o("Preload failed for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 25), "\"");
                                    int i119 = com.google.android.gms.ads.internal.util.zze.zza;
                                    zzo.zzj(strO14, e);
                                }
                                if (file6.exists() && !file6.delete()) {
                                    zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file6.getAbsolutePath())));
                                }
                                p(r3, file6.getAbsolutePath(), r11, string);
                                f.remove(r5);
                                return false;
                            } catch (IOException | RuntimeException e13) {
                                e = e13;
                                obj = obj5;
                                str2 = strConcat;
                                obj2 = obj;
                                obj3 = obj2;
                                str4 = str12;
                                str3 = str2;
                                string = null;
                                str6 = str4;
                                str5 = str3;
                                obj4 = obj3;
                                fileOutputStream = null;
                                r3 = str6;
                                r5 = str5;
                                r11 = obj4;
                                if (e instanceof RuntimeException) {
                                    com.google.android.gms.ads.internal.zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                }
                                fileOutputStream.close();
                                if (this.e) {
                                    String strO15 = jc1.o("Preload aborted for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 26), "\"");
                                    int i1110 = com.google.android.gms.ads.internal.util.zze.zza;
                                    zzo.zzh(strO15);
                                } else {
                                    String strO16 = jc1.o("Preload failed for URL \"", r3, new StringBuilder(String.valueOf((Object) r3).length() + 25), "\"");
                                    int i1111 = com.google.android.gms.ads.internal.util.zze.zza;
                                    zzo.zzj(strO16, e);
                                }
                                if (file6.exists()) {
                                    zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file6.getAbsolutePath())));
                                }
                                p(r3, file6.getAbsolutePath(), r11, string);
                                f.remove(r5);
                                return false;
                            }
                        } catch (IOException | RuntimeException e14) {
                            e = e14;
                            obj = "error";
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public final File r(File file) {
        File file2 = this.d;
        String strConcat = String.valueOf(file.getName()).concat(".done");
        int i = zzgch.a;
        return new File(new File(file2, strConcat).getPath());
    }
}
