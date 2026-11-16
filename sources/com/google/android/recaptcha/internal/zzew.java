package com.google.android.recaptcha.internal;

import defpackage.h00;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzew {

    @NotNull
    private final HttpURLConnection zza;

    private final InputStream zzf() throws zzbd {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e.getMessage());
        } catch (IOException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e3.getMessage());
        }
    }

    private final OutputStream zzg() throws zzbd {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e.getMessage());
        } catch (IOException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e3.getMessage());
        }
    }

    @NotNull
    public final zzoi zza(@NotNull zzoi zzoiVar) throws IOException, zzbd {
        try {
            int responseCode = this.zza.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 400) {
                    throw new zzbd(zzbb.zzc, zzba.zzau, null);
                }
                if (responseCode != 503 && responseCode != 403) {
                    if (responseCode != 404) {
                        throw new zzbd(zzbb.zzc, zzba.zzK, null);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzi, null);
                }
                throw new zzbd(zzbb.zzi, zzba.zzJ, null);
            }
            byte[] bArrP = h00.p(zzf());
            if (bArrP.length == 0) {
                throw new zzbd(zzbb.zzc, zzba.zzat, null);
            }
            try {
                Object objZzb = zzoiVar.zzD().zzb(bArrP);
                objZzb.getClass();
                return (zzoi) objZzb;
            } catch (Exception e) {
                throw new zzbd(zzbb.zzc, zzba.zzG, e.getMessage());
            }
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzc, zzba.zzah, e2.getMessage());
        }
    }

    @NotNull
    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() throws zzbd {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e) {
            throw new zzbd(zzbb.zzc, zzba.zzac, e.getMessage());
        } catch (IOException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzad, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzc, zzba.zzaj, e3.getMessage());
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public zzew(@NotNull HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    public final void zze(@NotNull byte[] bArr) throws zzbd {
        try {
            zzg().write(bArr);
        } catch (zzbd e) {
            throw e;
        } catch (IOException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzag, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzc, zzba.zzal, e3.getMessage());
        }
    }
}
