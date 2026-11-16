package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.unity3d.ads.BuildConfig;
import defpackage.ea5;
import defpackage.pa5;
import defpackage.r85;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzvm implements zzvs {
    public final Context a;
    public final boolean b;

    /* JADX WARN: Code duplicated, block: B:71:0x0123  */
    @Override // com.google.android.gms.internal.ads.zzvs
    public final zzvu a(zzvr zzvrVar) throws Exception {
        String str;
        MediaCodec mediaCodecCreateByCodecName;
        pa5 r85Var;
        Context context;
        int i = Build.VERSION.SDK_INT;
        io.p071bidmachine.media3.exoplayer.mediacodec.b bVar = null;
        mediaCodec = null;
        MediaCodec mediaCodec = null;
        bVar = null;
        int i2 = 0;
        if (i < 31 && ((context = this.a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            try {
                zzvy zzvyVar = zzvrVar.a;
                String str2 = zzvyVar.a;
                Trace.beginSection("createCodec:".concat(str2));
                MediaCodec mediaCodecCreateByCodecName2 = MediaCodec.createByCodecName(str2);
                Trace.endSection();
                try {
                    Trace.beginSection("configureCodec");
                    Surface surface = zzvrVar.d;
                    if (surface == null && zzvyVar.h && i >= 35) {
                        i2 = 8;
                    }
                    mediaCodecCreateByCodecName2.configure(zzvrVar.b, surface, (MediaCrypto) null, i2);
                    Trace.endSection();
                    Trace.beginSection("startCodec");
                    mediaCodecCreateByCodecName2.start();
                    Trace.endSection();
                    return new zzwq(mediaCodecCreateByCodecName2, zzvrVar.e);
                } catch (IOException e) {
                    e = e;
                    mediaCodec = mediaCodecCreateByCodecName2;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    mediaCodec = mediaCodecCreateByCodecName2;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (RuntimeException e4) {
                e = e4;
            }
        } else {
            int iF = zzas.f(zzvrVar.c.o);
            switch (iF) {
                case -2:
                    str = "none";
                    break;
                case -1:
                    str = "unknown";
                    break;
                case 0:
                    str = BuildConfig.FLAVOR;
                    break;
                case 1:
                    str = "audio";
                    break;
                case 2:
                    str = "video";
                    break;
                case 3:
                    str = "text";
                    break;
                case 4:
                    str = "image";
                    break;
                case 5:
                    str = "metadata";
                    break;
                default:
                    str = "camera motion";
                    break;
            }
            zzeh.b("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(str));
            zzve zzveVar = new zzve(iF);
            zzveVar.c = this.b;
            zzvy zzvyVar2 = zzvrVar.a;
            String str3 = zzvyVar2.a;
            try {
                StringBuilder sb = new StringBuilder(str3.length() + 12);
                sb.append("createCodec:");
                sb.append(str3);
                Trace.beginSection(sb.toString());
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str3);
                try {
                    if (zzveVar.c && i >= 36) {
                        r85Var = new r85(mediaCodecCreateByCodecName);
                        i2 = 4;
                    } else {
                        HandlerThread handlerThread = (HandlerThread) zzveVar.b.mo1232zza();
                        zzfj zzfjVar = zzdp.a;
                        r85Var = new ea5(mediaCodecCreateByCodecName, handlerThread, new zzdt());
                    }
                    io.p071bidmachine.media3.exoplayer.mediacodec.b bVar2 = new io.p071bidmachine.media3.exoplayer.mediacodec.b(mediaCodecCreateByCodecName, (HandlerThread) zzveVar.a.mo1232zza(), r85Var, zzvrVar.e);
                    try {
                        Trace.endSection();
                        Surface surface2 = zzvrVar.d;
                        if (surface2 == null && zzvyVar2.h && i >= 35) {
                            i2 |= 8;
                        }
                        bVar2.u(zzvrVar.b, surface2, i2);
                        return bVar2;
                    } catch (Exception e5) {
                        e = e5;
                        bVar = bVar2;
                        if (bVar != null) {
                            bVar.zzl();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Exception e7) {
                e = e7;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    public zzvm(Context context) {
        this.a = context;
        this.b = true;
    }

    @Deprecated
    public zzvm() {
        this.a = null;
    }
}
