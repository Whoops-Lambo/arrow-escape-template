package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import android.net.TrafficStats;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzcbc;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzu implements zze {
    private final Context zza;

    @Nullable
    private final String zzb;

    @Nullable
    private String zzc;

    private final URL zzd(String str) throws MalformedURLException {
        URL urlZze = null;
        try {
            urlZze = new URI(str).toURL();
        } catch (IllegalArgumentException e) {
            e = e;
            zzf(str, e);
        } catch (MalformedURLException e2) {
            e = e2;
            zzf(str, e);
        } catch (URISyntaxException e3) {
            zzf(str, e3);
            if (((Boolean) zzba.zzc().a(zzbjr.f)).booleanValue()) {
                urlZze = zze(str);
            }
        }
        if (urlZze != null) {
            return urlZze;
        }
        StringBuilder sb = new StringBuilder(str.length() + 47);
        sb.append("Falling back to direct new URL(\"");
        sb.append(str);
        sb.append("\") constructor.");
        zzo.zzd(sb.toString());
        return new URL(str);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    @WorkerThread
    public final zzt zza(String str) {
        return zzc(str, null);
    }

    @Nullable
    private final URL zze(String str) {
        URL url;
        try {
            zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
            try {
                String string = uri.toString();
                StringBuilder sb = new StringBuilder(str.length() + Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE + string.length());
                sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                sb.append(str);
                sb.append("\" -> encoded URI: ");
                sb.append(string);
                zzo.zzd(sb.toString());
                return url;
            } catch (IllegalArgumentException e) {
                e = e;
                zzf(str, e);
                return url;
            } catch (MalformedURLException e2) {
                e = e2;
                zzf(str, e);
                return url;
            } catch (URISyntaxException e3) {
                e = e3;
                zzf(str, e);
                return url;
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e4) {
            e = e4;
            url = null;
        }
    }

    @Nullable
    public final String zzb() {
        return this.zzc;
    }

    @WorkerThread
    public final zzt zzc(String str, @Nullable Map map) {
        zzt zztVar = zzt.PERMANENT_FAILURE;
        if (str != null) {
            if (!((Boolean) zzba.zzc().a(zzbjr.g)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) zzba.zzc().a(zzbjr.q3)).booleanValue() || !zzay.zze()) {
                    try {
                        try {
                            if (ClientLibraryUtils.isPackageSide()) {
                                TrafficStats.setThreadStatsTag(263);
                            }
                            StringBuilder sb = new StringBuilder(str.length() + 13);
                            sb.append("Pinging URL: ");
                            sb.append(str);
                            zzo.zzd(sb.toString());
                            HttpURLConnection httpURLConnection = (HttpURLConnection) zzd(str).openConnection();
                            try {
                                zzay.zza();
                                String str2 = this.zzb;
                                httpURLConnection.setConnectTimeout(60000);
                                httpURLConnection.setInstanceFollowRedirects(true);
                                httpURLConnection.setReadTimeout(60000);
                                if (str2 != null) {
                                    httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str2);
                                }
                                httpURLConnection.setUseCaches(false);
                                if (map != null) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    }
                                }
                                zzl zzlVar = new zzl(null);
                                zzlVar.zza(httpURLConnection, null);
                                int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                                zzlVar.zzc(httpURLConnection, iHttpUrlConnectionGetResponseCode);
                                if (iHttpUrlConnectionGetResponseCode < 200 || iHttpUrlConnectionGetResponseCode >= 300) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iHttpUrlConnectionGetResponseCode).length() + 54 + str.length());
                                    sb2.append("Received non-success response code ");
                                    sb2.append(iHttpUrlConnectionGetResponseCode);
                                    sb2.append(" from pinging URL: ");
                                    sb2.append(str);
                                    zzo.zzi(sb2.toString());
                                    if (iHttpUrlConnectionGetResponseCode == 502) {
                                        zztVar = zzt.RETRIABLE_FAILURE;
                                    }
                                } else {
                                    if (((Boolean) zzba.zzc().a(zzbjr.l9)).booleanValue()) {
                                        this.zzc = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                    }
                                    zztVar = zzt.SUCCESS;
                                }
                                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                if (!ClientLibraryUtils.isPackageSide()) {
                                    return zztVar;
                                }
                                TrafficStats.clearThreadStatsTag();
                                return zztVar;
                            } catch (Throwable th) {
                                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                throw th;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            e = e;
                            zzf(str, e);
                            if (ClientLibraryUtils.isPackageSide()) {
                            }
                            return zztVar;
                        } catch (MalformedURLException e2) {
                            e = e2;
                            zzf(str, e);
                            if (ClientLibraryUtils.isPackageSide()) {
                            }
                            return zztVar;
                        } catch (IOException e3) {
                            e = e3;
                            String message = e.getMessage();
                            StringBuilder sb3 = new StringBuilder(str.length() + 27 + String.valueOf(message).length());
                            sb3.append("Error while pinging URL: ");
                            sb3.append(str);
                            sb3.append(". ");
                            sb3.append(message);
                            zzo.zzi(sb3.toString());
                            zztVar = zzt.RETRIABLE_FAILURE;
                            if (ClientLibraryUtils.isPackageSide()) {
                            }
                            return zztVar;
                        } catch (RuntimeException e4) {
                            e = e4;
                            String message2 = e.getMessage();
                            StringBuilder sb4 = new StringBuilder(str.length() + 27 + String.valueOf(message2).length());
                            sb4.append("Error while pinging URL: ");
                            sb4.append(str);
                            sb4.append(". ");
                            sb4.append(message2);
                            zzo.zzi(sb4.toString());
                            zztVar = zzt.RETRIABLE_FAILURE;
                            if (ClientLibraryUtils.isPackageSide()) {
                            }
                            return zztVar;
                        }
                    } catch (Throwable th2) {
                        if (ClientLibraryUtils.isPackageSide()) {
                            TrafficStats.clearThreadStatsTag();
                        }
                        throw th2;
                    }
                }
            }
        }
        return zztVar;
    }

    public zzu(Context context, @Nullable String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final void zzf(String str, Throwable th) {
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        zzo.zzi(sb.toString());
        zzcbc.c(this.zza).a(th, "HttpUrlPinger.pingUrl", ((Integer) zzba.zzc().a(zzbjr.Ee)).intValue() / 100.0f);
    }
}
