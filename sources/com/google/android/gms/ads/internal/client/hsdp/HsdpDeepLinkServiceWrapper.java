package com.google.android.gms.ads.internal.client.hsdp;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import defpackage.c45;
import defpackage.fq3;
import defpackage.j74;
import defpackage.nx0;
import defpackage.uv3;
import defpackage.w65;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class HsdpDeepLinkServiceWrapper extends IHsdpDeepLinkServiceWrapper.Stub {
    private zzcbe zza;
    private zzcbe zzb;

    @Nullable
    private nx0 zzc;

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
    public void prewarm(@NonNull IObjectWrapper iObjectWrapper, @NonNull List<Bundle> list, @Nullable IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) {
        Throwable th;
        Context context = null;
        try {
            Context context2 = (Context) ObjectWrapper.z1(iObjectWrapper);
            if (context2 == null) {
                return;
            }
            try {
                nx0 nx0VarZzb = zzb(context2);
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (Bundle bundle : list) {
                        String string = bundle.getString("targetPackage");
                        if (!TextUtils.isEmpty(string)) {
                            IBinder binder = bundle.getBinder("window_token");
                            String string2 = bundle.getString("referrer");
                            Map mapZzb = zzp.zzb(bundle.getBundle("extra_query_params"));
                            if (Collections.EMPTY_MAP == null) {
                                throw new NullPointerException("Null extraQueryParams");
                            }
                            if (string == null) {
                                throw new NullPointerException("Null targetAppPackageName");
                            }
                            if (mapZzb == null) {
                                throw new NullPointerException("Null extraQueryParams");
                            }
                            if (string2 == null) {
                                string2 = null;
                            }
                            if (binder == null) {
                                binder = null;
                            }
                            if (string2 == null) {
                                StringBuilder sb = new StringBuilder();
                                if (string2 == null) {
                                    sb.append(" referrer");
                                }
                                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                            }
                            arrayList.add(new j74(string, string2, mapZzb, binder));
                        }
                    }
                }
                zza zzaVar = new zza(this, iHsdpPrewarmServiceCallback);
                fq3 fq3Var = (fq3) ((w65) ((uv3) nx0VarZzb).c.zza());
                fq3Var.getClass();
                fq3Var.b.a(new c45(4, fq3Var, arrayList, zzaVar));
            } catch (Throwable th2) {
                th = th2;
                context = context2;
                zza(context, th, "prewarm");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final void zza(@Nullable Context context, Throwable th, String str) {
        if (context == null) {
            zzo.zzg("Context is null, unable to report exception for method: ".concat(str), th);
            return;
        }
        if (((Boolean) zzba.zzc().a(zzbjr.Se)).booleanValue()) {
            if (this.zzb == null) {
                this.zzb = zzcbc.e(context);
            }
            this.zzb.b("HsdpDeepLinkServiceWrapperUnsampled.".concat(str), th);
        } else {
            if (this.zza == null) {
                this.zza = zzcbc.c(context);
            }
            this.zza.b("HsdpDeepLinkServiceWrapper.".concat(str), th);
        }
    }

    private final nx0 zzb(Context context) {
        if (this.zzc == null) {
            this.zzc = HsdpDeepLinkServiceFactory.create(context);
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
    public void endSession(@NonNull IObjectWrapper iObjectWrapper, @Nullable String str) {
        Throwable th;
        Context context;
        try {
            context = (Context) ObjectWrapper.z1(iObjectWrapper);
            if (context != null) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        ((uv3) zzb(context)).a(str);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zza(context, th, "endSession");
                }
            }
        } catch (Throwable th3) {
            th = th3;
            context = null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
    public void open(@NonNull IObjectWrapper iObjectWrapper, @Nullable String str, @Nullable String str2, @Nullable Bundle bundle, boolean z, @Nullable IHsdpServiceCallback iHsdpServiceCallback) {
        Throwable th;
        Context context;
        try {
            context = (Context) ObjectWrapper.z1(iObjectWrapper);
            if (context != null) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        nx0 nx0VarZzb = zzb(context);
                        Map mapZzb = zzp.zzb(bundle);
                        if (str2 == null) {
                            str2 = "";
                        }
                        ((uv3) nx0VarZzb).b(str, str2, new zzb(this, iHsdpServiceCallback), mapZzb, z);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zza(context, th, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            context = null;
        }
    }
}
